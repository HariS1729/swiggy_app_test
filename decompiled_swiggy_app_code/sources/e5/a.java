package e5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import in.juspay.hyper.constants.LogCategory;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.p;

@Instrumented
/* compiled from: FrameBuilder.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final MediaFormat f14353a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaCodec f14354b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaCodec.BufferInfo f14355c = new MediaCodec.BufferInfo();

    /* renamed from: d  reason: collision with root package name */
    private b f14356d;

    /* renamed from: e  reason: collision with root package name */
    private Surface f14357e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f14358f;

    /* renamed from: g  reason: collision with root package name */
    private MediaExtractor f14359g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f14360h;

    /* renamed from: i  reason: collision with root package name */
    private final e f14361i;
    private final Integer j;

    public a(Context context, e eVar, Integer num) {
        MediaExtractor mediaExtractor;
        p.j(context, LogCategory.CONTEXT);
        p.j(eVar, "muxerConfig");
        this.f14360h = context;
        this.f14361i = eVar;
        this.j = num;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(eVar.f(), eVar.h(), eVar.g());
        p.i(createVideoFormat, "MediaFormat.createVideoF… muxerConfig.videoHeight)");
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", eVar.a());
        createVideoFormat.setFloat("frame-rate", eVar.d());
        createVideoFormat.setInteger("i-frame-interval", eVar.e());
        this.f14353a = createVideoFormat;
        String findEncoderForFormat = new MediaCodecList(0).findEncoderForFormat(createVideoFormat);
        Log.d("FrameBuilder", "codeName : " + findEncoderForFormat);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(findEncoderForFormat);
        p.i(createByCodecName, "run {\n        val codecN…odecName(codecName)\n    }");
        this.f14354b = createByCodecName;
        this.f14356d = eVar.b();
        if (num != null) {
            AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(num.intValue());
            p.i(openRawResourceFd, "context.resources.openRa…rceFd(audioTrackResource)");
            mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
        } else {
            mediaExtractor = null;
        }
        this.f14359g = mediaExtractor;
    }

    private final Canvas a() {
        if (Build.VERSION.SDK_INT >= 23) {
            Surface surface = this.f14357e;
            if (surface != null) {
                return surface.lockHardwareCanvas();
            }
            return null;
        }
        Surface surface2 = this.f14357e;
        if (surface2 != null) {
            return surface2.lockCanvas(this.f14358f);
        }
        return null;
    }

    private final void c(boolean z11) {
        int dequeueOutputBuffer;
        ByteBuffer byteBuffer;
        if (z11) {
            this.f14354b.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.f14354b.getOutputBuffers();
        while (true) {
            dequeueOutputBuffer = this.f14354b.dequeueOutputBuffer(this.f14355c, (long) 10000);
            if (dequeueOutputBuffer == -1) {
                if (!z11) {
                    return;
                }
            } else if (dequeueOutputBuffer == -3) {
                outputBuffers = this.f14354b.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                if (!this.f14356d.isStarted()) {
                    MediaFormat outputFormat = this.f14354b.getOutputFormat();
                    p.i(outputFormat, "mediaCodec.outputFormat");
                    Log.d("FrameBuilder", "encoder output format changed: " + outputFormat);
                    this.f14356d.c(outputFormat, this.f14359g);
                } else {
                    throw new RuntimeException("format changed twice");
                }
            } else if (dequeueOutputBuffer < 0) {
                Log.wtf("FrameBuilder", "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
            } else if (outputBuffers == null || (byteBuffer = outputBuffers[dequeueOutputBuffer]) == null) {
            } else {
                MediaCodec.BufferInfo bufferInfo = this.f14355c;
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (bufferInfo.size != 0) {
                    if (this.f14356d.isStarted()) {
                        this.f14356d.b(byteBuffer, this.f14355c);
                    } else {
                        throw new RuntimeException("muxer hasn't started");
                    }
                }
                this.f14354b.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((this.f14355c.flags & 4) != 0) {
                    if (!z11) {
                        Log.w("FrameBuilder", "reached end of stream unexpectedly");
                        return;
                    }
                    return;
                }
            }
        }
        throw new RuntimeException("encoderOutputBuffer  " + dequeueOutputBuffer + " was null");
    }

    private final void d(Bitmap bitmap, Canvas canvas) {
        if (canvas != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        f(canvas);
    }

    private final void f(Canvas canvas) {
        Surface surface = this.f14357e;
        if (surface != null) {
            surface.unlockCanvasAndPost(canvas);
        }
        c(false);
    }

    public final void b(Object obj) {
        p.j(obj, "image");
        int c11 = this.f14361i.c();
        for (int i11 = 0; i11 < c11; i11++) {
            Canvas a11 = a();
            if (obj instanceof Integer) {
                Log.i("FrameBuilder", "Trying to decode as @DrawableRes");
                Bitmap decodeResource = BitmapFactoryInstrumentation.decodeResource(this.f14360h.getResources(), ((Number) obj).intValue());
                p.i(decodeResource, "bitmap");
                d(decodeResource, a11);
            } else if (obj instanceof Bitmap) {
                d((Bitmap) obj, a11);
            } else if (obj instanceof Canvas) {
                f((Canvas) obj);
            } else {
                Log.e("FrameBuilder", "Image type " + obj + " is not supported. Try using a Canvas or a Bitmap");
            }
        }
    }

    public final void e() {
        ByteBuffer allocate = ByteBuffer.allocate(262144);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaExtractor mediaExtractor = this.f14359g;
        p.g(mediaExtractor);
        mediaExtractor.seekTo(0, 2);
        long d11 = this.f14356d.d();
        boolean z11 = false;
        while (!z11) {
            bufferInfo.offset = 100;
            MediaExtractor mediaExtractor2 = this.f14359g;
            p.g(mediaExtractor2);
            int readSampleData = mediaExtractor2.readSampleData(allocate, 100);
            bufferInfo.size = readSampleData;
            if (readSampleData < 0) {
                bufferInfo.size = 0;
            } else {
                MediaExtractor mediaExtractor3 = this.f14359g;
                p.g(mediaExtractor3);
                long sampleTime = mediaExtractor3.getSampleTime();
                bufferInfo.presentationTimeUs = sampleTime;
                MediaExtractor mediaExtractor4 = this.f14359g;
                p.g(mediaExtractor4);
                bufferInfo.flags = mediaExtractor4.getSampleFlags();
                b bVar = this.f14356d;
                p.i(allocate, "audioBuffer");
                bVar.a(allocate, bufferInfo);
                MediaExtractor mediaExtractor5 = this.f14359g;
                p.g(mediaExtractor5);
                mediaExtractor5.advance();
                if (sampleTime > d11) {
                    if (sampleTime % d11 <= ((long) (this.f14361i.c() * 1000000))) {
                    }
                }
            }
            z11 = true;
        }
    }

    public final void g() {
        MediaExtractor mediaExtractor = this.f14359g;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }

    public final void h() {
        this.f14356d.release();
    }

    public final void i() {
        c(true);
        this.f14354b.stop();
        this.f14354b.release();
        Surface surface = this.f14357e;
        if (surface != null) {
            surface.release();
        }
    }

    public final void j() {
        this.f14354b.configure(this.f14353a, (Surface) null, (MediaCrypto) null, 1);
        this.f14357e = this.f14354b.createInputSurface();
        this.f14354b.start();
        c(false);
    }
}
