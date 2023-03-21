package w3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataList */
public final class b extends c {
    public static b g(ByteBuffer byteBuffer) {
        return h(byteBuffer, new b());
    }

    public static b h(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b e(int i11, ByteBuffer byteBuffer) {
        f(i11, byteBuffer);
        return this;
    }

    public void f(int i11, ByteBuffer byteBuffer) {
        this.f17462a = i11;
        this.f17463b = byteBuffer;
    }

    public a i(a aVar, int i11) {
        int b11 = b(6);
        if (b11 != 0) {
            return aVar.e(a(c(b11) + (i11 * 4)), this.f17463b);
        }
        return null;
    }

    public int j() {
        int b11 = b(6);
        if (b11 != 0) {
            return d(b11);
        }
        return 0;
    }

    public int k() {
        int b11 = b(4);
        if (b11 != 0) {
            return this.f17463b.getInt(b11 + this.f17462a);
        }
        return 0;
    }
}
