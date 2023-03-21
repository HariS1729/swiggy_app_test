package w3;

import java.nio.ByteBuffer;

/* compiled from: MetadataItem */
public final class a extends c {
    public a e(int i11, ByteBuffer byteBuffer) {
        f(i11, byteBuffer);
        return this;
    }

    public void f(int i11, ByteBuffer byteBuffer) {
        this.f17462a = i11;
        this.f17463b = byteBuffer;
    }

    public int g(int i11) {
        int b11 = b(16);
        if (b11 != 0) {
            return this.f17463b.getInt(c(b11) + (i11 * 4));
        }
        return 0;
    }

    public int h() {
        int b11 = b(16);
        if (b11 != 0) {
            return d(b11);
        }
        return 0;
    }

    public boolean i() {
        int b11 = b(6);
        if (b11 == 0 || this.f17463b.get(b11 + this.f17462a) == 0) {
            return false;
        }
        return true;
    }

    public short j() {
        int b11 = b(14);
        if (b11 != 0) {
            return this.f17463b.getShort(b11 + this.f17462a);
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

    public short l() {
        int b11 = b(8);
        if (b11 != 0) {
            return this.f17463b.getShort(b11 + this.f17462a);
        }
        return 0;
    }

    public short m() {
        int b11 = b(12);
        if (b11 != 0) {
            return this.f17463b.getShort(b11 + this.f17462a);
        }
        return 0;
    }
}
