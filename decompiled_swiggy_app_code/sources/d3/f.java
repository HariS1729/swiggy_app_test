package d3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataListReader */
class f {

    /* compiled from: MetadataListReader */
    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f14096a;

        a(ByteBuffer byteBuffer) {
            this.f14096a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public void b(int i11) throws IOException {
            ByteBuffer byteBuffer = this.f14096a;
            byteBuffer.position(byteBuffer.position() + i11);
        }

        public int c() throws IOException {
            return this.f14096a.getInt();
        }

        public long d() throws IOException {
            return f.c(this.f14096a.getInt());
        }

        public long getPosition() {
            return (long) this.f14096a.position();
        }

        public int readUnsignedShort() throws IOException {
            return f.d(this.f14096a.getShort());
        }
    }

    /* compiled from: MetadataListReader */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f14097a;

        /* renamed from: b  reason: collision with root package name */
        private final long f14098b;

        b(long j, long j11) {
            this.f14097a = j;
            this.f14098b = j11;
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return this.f14097a;
        }
    }

    /* compiled from: MetadataListReader */
    private interface c {
        void b(int i11) throws IOException;

        int c() throws IOException;

        long d() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private static b a(c cVar) throws IOException {
        long j;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.b(6);
            int i11 = 0;
            while (true) {
                if (i11 >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int c11 = cVar.c();
                cVar.b(4);
                j = cVar.d();
                cVar.b(4);
                if (1835365473 == c11) {
                    break;
                }
                i11++;
            }
            if (j != -1) {
                cVar.b((int) (j - cVar.getPosition()));
                cVar.b(12);
                long d11 = cVar.d();
                for (int i12 = 0; ((long) i12) < d11; i12++) {
                    int c12 = cVar.c();
                    long d12 = cVar.d();
                    long d13 = cVar.d();
                    if (1164798569 == c12 || 1701669481 == c12) {
                        return new b(d12 + j, d13);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    static w3.b b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return w3.b.g(duplicate);
    }

    static long c(int i11) {
        return ((long) i11) & 4294967295L;
    }

    static int d(short s11) {
        return s11 & 65535;
    }
}
