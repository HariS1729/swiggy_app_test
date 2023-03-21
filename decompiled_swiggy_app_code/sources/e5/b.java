package e5;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* compiled from: FrameMuxer.kt */
public interface b {
    void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void c(MediaFormat mediaFormat, MediaExtractor mediaExtractor);

    long d();

    boolean isStarted();

    void release();
}
