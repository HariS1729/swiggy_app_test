package e5;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Mp4FrameMuxer.kt */
public final class c implements b {

    /* renamed from: i  reason: collision with root package name */
    private static final String f14362i;
    public static final a j = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f14363a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaMuxer f14364b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14365c;

    /* renamed from: d  reason: collision with root package name */
    private int f14366d;

    /* renamed from: e  reason: collision with root package name */
    private int f14367e;

    /* renamed from: f  reason: collision with root package name */
    private int f14368f;

    /* renamed from: g  reason: collision with root package name */
    private long f14369g;

    /* renamed from: h  reason: collision with root package name */
    private final float f14370h;

    /* compiled from: Mp4FrameMuxer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        String simpleName = c.class.getSimpleName();
        p.i(simpleName, "Mp4FrameMuxer::class.java.simpleName");
        f14362i = simpleName;
    }

    public c(String str, float f11) {
        p.j(str, "path");
        this.f14370h = f11;
        this.f14363a = (long) (((float) TimeUnit.SECONDS.toMicros(1)) / f11);
        this.f14364b = new MediaMuxer(str, 0);
    }

    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        p.j(byteBuffer, "encodedData");
        p.j(bufferInfo, "audioBufferInfo");
        this.f14364b.writeSampleData(this.f14367e, byteBuffer, bufferInfo);
    }

    public void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        p.j(byteBuffer, "encodedData");
        p.j(bufferInfo, "bufferInfo");
        long j11 = this.f14363a;
        int i11 = this.f14368f;
        this.f14368f = i11 + 1;
        long j12 = j11 * ((long) i11);
        this.f14369g = j12;
        bufferInfo.presentationTimeUs = j12;
        this.f14364b.writeSampleData(this.f14366d, byteBuffer, bufferInfo);
    }

    public void c(MediaFormat mediaFormat, MediaExtractor mediaExtractor) {
        p.j(mediaFormat, "videoFormat");
        if (mediaExtractor != null) {
            mediaExtractor.selectTrack(0);
        }
        MediaFormat trackFormat = mediaExtractor != null ? mediaExtractor.getTrackFormat(0) : null;
        this.f14366d = this.f14364b.addTrack(mediaFormat);
        if (trackFormat != null) {
            this.f14367e = this.f14364b.addTrack(trackFormat);
            Log.d("Audio format: %s", trackFormat.toString());
        }
        Log.d("Video format: %s", mediaFormat.toString());
        this.f14364b.start();
        this.f14365c = true;
    }

    public long d() {
        return this.f14369g;
    }

    public boolean isStarted() {
        return this.f14365c;
    }

    public void release() {
        this.f14364b.stop();
        this.f14364b.release();
    }
}
