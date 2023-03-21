package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.fontbox.ttf.GlyfDescript;

/* compiled from: BinaryReader */
abstract class e implements x0 {

    /* compiled from: BinaryReader */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9990a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9990a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f9990a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.a.<clinit>():void");
        }
    }

    /* compiled from: BinaryReader */
    private static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f9991a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f9992b;

        /* renamed from: c  reason: collision with root package name */
        private int f9993c;

        /* renamed from: d  reason: collision with root package name */
        private final int f9994d;

        /* renamed from: e  reason: collision with root package name */
        private int f9995e;

        /* renamed from: f  reason: collision with root package name */
        private int f9996f;

        /* renamed from: g  reason: collision with root package name */
        private int f9997g;

        public b(ByteBuffer byteBuffer, boolean z11) {
            super((a) null);
            this.f9991a = z11;
            this.f9992b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f9993c = arrayOffset;
            this.f9994d = arrayOffset;
            this.f9995e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void A() throws java.io.IOException {
            /*
                r3 = this;
                int r0 = r3.f9997g
                int r1 = r3.f9996f
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.a(r1)
                r2 = 4
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.c(r1, r2)
                r3.f9997g = r1
            L_0x000f:
                int r1 = r3.getFieldNumber()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.skipField()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f9996f
                int r2 = r3.f9997g
                if (r1 != r2) goto L_0x0027
                r3.f9997g = r0
                return
            L_0x0027:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.b.A():void");
        }

        private void B() throws IOException {
            int i11 = this.f9995e;
            int i12 = this.f9993c;
            if (i11 - i12 >= 10) {
                byte[] bArr = this.f9992b;
                int i13 = 0;
                while (i13 < 10) {
                    int i14 = i12 + 1;
                    if (bArr[i12] >= 0) {
                        this.f9993c = i14;
                        return;
                    } else {
                        i13++;
                        i12 = i14;
                    }
                }
            }
            C();
        }

        private void C() throws IOException {
            int i11 = 0;
            while (i11 < 10) {
                if (j() < 0) {
                    i11++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void D(int i11) throws IOException {
            w(i11);
            if ((i11 & 3) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        private void E(int i11) throws IOException {
            w(i11);
            if ((i11 & 7) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        private boolean i() {
            return this.f9993c == this.f9995e;
        }

        private byte j() throws IOException {
            int i11 = this.f9993c;
            if (i11 != this.f9995e) {
                byte[] bArr = this.f9992b;
                this.f9993c = i11 + 1;
                return bArr[i11];
            }
            throw InvalidProtocolBufferException.l();
        }

        private Object k(WireFormat.FieldType fieldType, Class<?> cls, n nVar) throws IOException {
            switch (a.f9990a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(readBool());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(readEnum());
                case 5:
                    return Integer.valueOf(readFixed32());
                case 6:
                    return Long.valueOf(readFixed64());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(readInt32());
                case 9:
                    return Long.valueOf(readInt64());
                case 10:
                    return b(cls, nVar);
                case 11:
                    return Integer.valueOf(readSFixed32());
                case 12:
                    return Long.valueOf(readSFixed64());
                case 13:
                    return Integer.valueOf(readSInt32());
                case 14:
                    return Long.valueOf(readSInt64());
                case 15:
                    return readStringRequireUtf8();
                case 16:
                    return Integer.valueOf(readUInt32());
                case 17:
                    return Long.valueOf(readUInt64());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T l(y0<T> y0Var, n nVar) throws IOException {
            int i11 = this.f9997g;
            this.f9997g = WireFormat.c(WireFormat.a(this.f9996f), 4);
            try {
                T newInstance = y0Var.newInstance();
                y0Var.b(newInstance, this, nVar);
                y0Var.makeImmutable(newInstance);
                if (this.f9996f == this.f9997g) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.f9997g = i11;
            }
        }

        private int m() throws IOException {
            w(4);
            return n();
        }

        private int n() {
            int i11 = this.f9993c;
            byte[] bArr = this.f9992b;
            this.f9993c = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << GlyfDescript.X_DUAL);
        }

        private long o() throws IOException {
            w(8);
            return p();
        }

        private long p() {
            int i11 = this.f9993c;
            byte[] bArr = this.f9992b;
            this.f9993c = i11 + 8;
            return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
        }

        private <T> T q(y0<T> y0Var, n nVar) throws IOException {
            int t = t();
            w(t);
            int i11 = this.f9995e;
            int i12 = this.f9993c + t;
            this.f9995e = i12;
            try {
                T newInstance = y0Var.newInstance();
                y0Var.b(newInstance, this, nVar);
                y0Var.makeImmutable(newInstance);
                if (this.f9993c == i12) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.h();
            } finally {
                this.f9995e = i11;
            }
        }

        private int t() throws IOException {
            byte b11;
            int i11 = this.f9993c;
            int i12 = this.f9995e;
            if (i12 != i11) {
                byte[] bArr = this.f9992b;
                int i13 = i11 + 1;
                byte b12 = bArr[i11];
                if (b12 >= 0) {
                    this.f9993c = i13;
                    return b12;
                } else if (i12 - i13 < 9) {
                    return (int) v();
                } else {
                    int i14 = i13 + 1;
                    byte b13 = b12 ^ (bArr[i13] << 7);
                    if (b13 < 0) {
                        b11 = b13 ^ Byte.MIN_VALUE;
                    } else {
                        int i15 = i14 + 1;
                        byte b14 = b13 ^ (bArr[i14] << 14);
                        if (b14 >= 0) {
                            b11 = b14 ^ 16256;
                        } else {
                            i14 = i15 + 1;
                            byte b15 = b14 ^ (bArr[i15] << 21);
                            if (b15 < 0) {
                                b11 = b15 ^ -2080896;
                            } else {
                                i15 = i14 + 1;
                                byte b16 = bArr[i14];
                                b11 = (b15 ^ (b16 << 28)) ^ 266354560;
                                if (b16 < 0) {
                                    i14 = i15 + 1;
                                    if (bArr[i15] < 0) {
                                        i15 = i14 + 1;
                                        if (bArr[i14] < 0) {
                                            i14 = i15 + 1;
                                            if (bArr[i15] < 0) {
                                                i15 = i14 + 1;
                                                if (bArr[i14] < 0) {
                                                    i14 = i15 + 1;
                                                    if (bArr[i15] < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i14 = i15;
                    }
                    this.f9993c = i14;
                    return b11;
                }
            } else {
                throw InvalidProtocolBufferException.l();
            }
        }

        private long v() throws IOException {
            long j = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte j11 = j();
                j |= ((long) (j11 & Byte.MAX_VALUE)) << i11;
                if ((j11 & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        private void w(int i11) throws IOException {
            if (i11 < 0 || i11 > this.f9995e - this.f9993c) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void x(int i11) throws IOException {
            if (this.f9993c != i11) {
                throw InvalidProtocolBufferException.l();
            }
        }

        private void y(int i11) throws IOException {
            if (WireFormat.b(this.f9996f) != i11) {
                throw InvalidProtocolBufferException.d();
            }
        }

        private void z(int i11) throws IOException {
            w(i11);
            this.f9993c += i11;
        }

        public <T> T a(y0<T> y0Var, n nVar) throws IOException {
            y(3);
            return l(y0Var, nVar);
        }

        public <T> T b(Class<T> cls, n nVar) throws IOException {
            y(2);
            return q(u0.a().d(cls), nVar);
        }

        public <T> T c(y0<T> y0Var, n nVar) throws IOException {
            y(2);
            return q(y0Var, nVar);
        }

        public <T> void d(List<T> list, y0<T> y0Var, n nVar) throws IOException {
            int i11;
            if (WireFormat.b(this.f9996f) == 2) {
                int i12 = this.f9996f;
                do {
                    list.add(q(y0Var, nVar));
                    if (!i()) {
                        i11 = this.f9993c;
                    } else {
                        return;
                    }
                } while (t() == i12);
                this.f9993c = i11;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public <T> T e(Class<T> cls, n nVar) throws IOException {
            y(3);
            return l(u0.a().d(cls), nVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (skipField() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void f(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.e0.a<K, V> r9, androidx.datastore.preferences.protobuf.n r10) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 2
                r7.y(r0)
                int r1 = r7.t()
                r7.w(r1)
                int r2 = r7.f9995e
                int r3 = r7.f9993c
                int r3 = r3 + r1
                r7.f9995e = r3
                K r1 = r9.f10002b     // Catch:{ all -> 0x005b }
                V r3 = r9.f10004d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.getFieldNumber()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f9995e = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.skipField()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f10003c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f10004d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.k(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f10001a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.k(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.skipField()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>(r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f9995e = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.e.b.f(java.util.Map, androidx.datastore.preferences.protobuf.e0$a, androidx.datastore.preferences.protobuf.n):void");
        }

        public <T> void g(List<T> list, y0<T> y0Var, n nVar) throws IOException {
            int i11;
            if (WireFormat.b(this.f9996f) == 3) {
                int i12 = this.f9996f;
                do {
                    list.add(l(y0Var, nVar));
                    if (!i()) {
                        i11 = this.f9993c;
                    } else {
                        return;
                    }
                } while (t() == i12);
                this.f9993c = i11;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public int getFieldNumber() throws IOException {
            if (i()) {
                return Integer.MAX_VALUE;
            }
            int t = t();
            this.f9996f = t;
            if (t == this.f9997g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.a(t);
        }

        public int getTag() {
            return this.f9996f;
        }

        public String r(boolean z11) throws IOException {
            y(2);
            int t = t();
            if (t == 0) {
                return "";
            }
            w(t);
            if (z11) {
                byte[] bArr = this.f9992b;
                int i11 = this.f9993c;
                if (!Utf8.n(bArr, i11, i11 + t)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(this.f9992b, this.f9993c, t, w.f10119a);
            this.f9993c += t;
            return str;
        }

        public boolean readBool() throws IOException {
            y(0);
            if (t() != 0) {
                return true;
            }
            return false;
        }

        public void readBoolList(List<Boolean> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof f) {
                f fVar = (f) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 0) {
                    do {
                        fVar.addBoolean(readBool());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = this.f9993c + t();
                    while (this.f9993c < t) {
                        fVar.addBoolean(t() != 0);
                    }
                    x(t);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 0) {
                    do {
                        list.add(Boolean.valueOf(readBool()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = this.f9993c + t();
                    while (this.f9993c < t11) {
                        list.add(Boolean.valueOf(t() != 0));
                    }
                    x(t11);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public ByteString readBytes() throws IOException {
            ByteString byteString;
            y(2);
            int t = t();
            if (t == 0) {
                return ByteString.f9898b;
            }
            w(t);
            if (this.f9991a) {
                byteString = ByteString.H(this.f9992b, this.f9993c, t);
            } else {
                byteString = ByteString.h(this.f9992b, this.f9993c, t);
            }
            this.f9993c += t;
            return byteString;
        }

        public void readBytesList(List<ByteString> list) throws IOException {
            int i11;
            if (WireFormat.b(this.f9996f) == 2) {
                do {
                    list.add(readBytes());
                    if (!i()) {
                        i11 = this.f9993c;
                    } else {
                        return;
                    }
                } while (t() == this.f9996f);
                this.f9993c = i11;
                return;
            }
            throw InvalidProtocolBufferException.d();
        }

        public double readDouble() throws IOException {
            y(1);
            return Double.longBitsToDouble(o());
        }

        public void readDoubleList(List<Double> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof k) {
                k kVar = (k) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 1) {
                    do {
                        kVar.addDouble(readDouble());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = t();
                    E(t);
                    int i13 = this.f9993c + t;
                    while (this.f9993c < i13) {
                        kVar.addDouble(Double.longBitsToDouble(p()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = t();
                    E(t11);
                    int i14 = this.f9993c + t11;
                    while (this.f9993c < i14) {
                        list.add(Double.valueOf(Double.longBitsToDouble(p())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int readEnum() throws IOException {
            y(0);
            return t();
        }

        public void readEnumList(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof v) {
                v vVar = (v) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 0) {
                    do {
                        vVar.addInt(readEnum());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = this.f9993c + t();
                    while (this.f9993c < t) {
                        vVar.addInt(t());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 0) {
                    do {
                        list.add(Integer.valueOf(readEnum()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = this.f9993c + t();
                    while (this.f9993c < t11) {
                        list.add(Integer.valueOf(t()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int readFixed32() throws IOException {
            y(5);
            return m();
        }

        public void readFixed32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof v) {
                v vVar = (v) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 2) {
                    int t = t();
                    D(t);
                    int i13 = this.f9993c + t;
                    while (this.f9993c < i13) {
                        vVar.addInt(n());
                    }
                } else if (b11 == 5) {
                    do {
                        vVar.addInt(readFixed32());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 2) {
                    int t11 = t();
                    D(t11);
                    int i14 = this.f9993c + t11;
                    while (this.f9993c < i14) {
                        list.add(Integer.valueOf(n()));
                    }
                } else if (b12 == 5) {
                    do {
                        list.add(Integer.valueOf(readFixed32()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public long readFixed64() throws IOException {
            y(1);
            return o();
        }

        public void readFixed64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 1) {
                    do {
                        c0Var.addLong(readFixed64());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = t();
                    E(t);
                    int i13 = this.f9993c + t;
                    while (this.f9993c < i13) {
                        c0Var.addLong(p());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 1) {
                    do {
                        list.add(Long.valueOf(readFixed64()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = t();
                    E(t11);
                    int i14 = this.f9993c + t11;
                    while (this.f9993c < i14) {
                        list.add(Long.valueOf(p()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public float readFloat() throws IOException {
            y(5);
            return Float.intBitsToFloat(m());
        }

        public void readFloatList(List<Float> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof t) {
                t tVar = (t) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 2) {
                    int t = t();
                    D(t);
                    int i13 = this.f9993c + t;
                    while (this.f9993c < i13) {
                        tVar.addFloat(Float.intBitsToFloat(n()));
                    }
                } else if (b11 == 5) {
                    do {
                        tVar.addFloat(readFloat());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 2) {
                    int t11 = t();
                    D(t11);
                    int i14 = this.f9993c + t11;
                    while (this.f9993c < i14) {
                        list.add(Float.valueOf(Float.intBitsToFloat(n())));
                    }
                } else if (b12 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int readInt32() throws IOException {
            y(0);
            return t();
        }

        public void readInt32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof v) {
                v vVar = (v) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 0) {
                    do {
                        vVar.addInt(readInt32());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = this.f9993c + t();
                    while (this.f9993c < t) {
                        vVar.addInt(t());
                    }
                    x(t);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 0) {
                    do {
                        list.add(Integer.valueOf(readInt32()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = this.f9993c + t();
                    while (this.f9993c < t11) {
                        list.add(Integer.valueOf(t()));
                    }
                    x(t11);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public long readInt64() throws IOException {
            y(0);
            return u();
        }

        public void readInt64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 0) {
                    do {
                        c0Var.addLong(readInt64());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = this.f9993c + t();
                    while (this.f9993c < t) {
                        c0Var.addLong(u());
                    }
                    x(t);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 0) {
                    do {
                        list.add(Long.valueOf(readInt64()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = this.f9993c + t();
                    while (this.f9993c < t11) {
                        list.add(Long.valueOf(u()));
                    }
                    x(t11);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int readSFixed32() throws IOException {
            y(5);
            return m();
        }

        public void readSFixed32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof v) {
                v vVar = (v) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 2) {
                    int t = t();
                    D(t);
                    int i13 = this.f9993c + t;
                    while (this.f9993c < i13) {
                        vVar.addInt(n());
                    }
                } else if (b11 == 5) {
                    do {
                        vVar.addInt(readSFixed32());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 2) {
                    int t11 = t();
                    D(t11);
                    int i14 = this.f9993c + t11;
                    while (this.f9993c < i14) {
                        list.add(Integer.valueOf(n()));
                    }
                } else if (b12 == 5) {
                    do {
                        list.add(Integer.valueOf(readSFixed32()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public long readSFixed64() throws IOException {
            y(1);
            return o();
        }

        public void readSFixed64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 1) {
                    do {
                        c0Var.addLong(readSFixed64());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = t();
                    E(t);
                    int i13 = this.f9993c + t;
                    while (this.f9993c < i13) {
                        c0Var.addLong(p());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 1) {
                    do {
                        list.add(Long.valueOf(readSFixed64()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = t();
                    E(t11);
                    int i14 = this.f9993c + t11;
                    while (this.f9993c < i14) {
                        list.add(Long.valueOf(p()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public int readSInt32() throws IOException {
            y(0);
            return h.b(t());
        }

        public void readSInt32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof v) {
                v vVar = (v) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 0) {
                    do {
                        vVar.addInt(readSInt32());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = this.f9993c + t();
                    while (this.f9993c < t) {
                        vVar.addInt(h.b(t()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 0) {
                    do {
                        list.add(Integer.valueOf(readSInt32()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = this.f9993c + t();
                    while (this.f9993c < t11) {
                        list.add(Integer.valueOf(h.b(t())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public long readSInt64() throws IOException {
            y(0);
            return h.c(u());
        }

        public void readSInt64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 0) {
                    do {
                        c0Var.addLong(readSInt64());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = this.f9993c + t();
                    while (this.f9993c < t) {
                        c0Var.addLong(h.c(u()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 0) {
                    do {
                        list.add(Long.valueOf(readSInt64()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = this.f9993c + t();
                    while (this.f9993c < t11) {
                        list.add(Long.valueOf(h.c(u())));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public String readString() throws IOException {
            return r(false);
        }

        public void readStringList(List<String> list) throws IOException {
            s(list, false);
        }

        public void readStringListRequireUtf8(List<String> list) throws IOException {
            s(list, true);
        }

        public String readStringRequireUtf8() throws IOException {
            return r(true);
        }

        public int readUInt32() throws IOException {
            y(0);
            return t();
        }

        public void readUInt32List(List<Integer> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof v) {
                v vVar = (v) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 0) {
                    do {
                        vVar.addInt(readUInt32());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = this.f9993c + t();
                    while (this.f9993c < t) {
                        vVar.addInt(t());
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 0) {
                    do {
                        list.add(Integer.valueOf(readUInt32()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = this.f9993c + t();
                    while (this.f9993c < t11) {
                        list.add(Integer.valueOf(t()));
                    }
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public long readUInt64() throws IOException {
            y(0);
            return u();
        }

        public void readUInt64List(List<Long> list) throws IOException {
            int i11;
            int i12;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b11 = WireFormat.b(this.f9996f);
                if (b11 == 0) {
                    do {
                        c0Var.addLong(readUInt64());
                        if (!i()) {
                            i12 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i12;
                } else if (b11 == 2) {
                    int t = this.f9993c + t();
                    while (this.f9993c < t) {
                        c0Var.addLong(u());
                    }
                    x(t);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            } else {
                int b12 = WireFormat.b(this.f9996f);
                if (b12 == 0) {
                    do {
                        list.add(Long.valueOf(readUInt64()));
                        if (!i()) {
                            i11 = this.f9993c;
                        } else {
                            return;
                        }
                    } while (t() == this.f9996f);
                    this.f9993c = i11;
                } else if (b12 == 2) {
                    int t11 = this.f9993c + t();
                    while (this.f9993c < t11) {
                        list.add(Long.valueOf(u()));
                    }
                    x(t11);
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
        }

        public void s(List<String> list, boolean z11) throws IOException {
            int i11;
            int i12;
            if (WireFormat.b(this.f9996f) != 2) {
                throw InvalidProtocolBufferException.d();
            } else if (!(list instanceof a0) || z11) {
                do {
                    list.add(r(z11));
                    if (!i()) {
                        i11 = this.f9993c;
                    } else {
                        return;
                    }
                } while (t() == this.f9996f);
                this.f9993c = i11;
            } else {
                a0 a0Var = (a0) list;
                do {
                    a0Var.w(readBytes());
                    if (!i()) {
                        i12 = this.f9993c;
                    } else {
                        return;
                    }
                } while (t() == this.f9996f);
                this.f9993c = i12;
            }
        }

        public boolean skipField() throws IOException {
            int i11;
            if (i() || (i11 = this.f9996f) == this.f9997g) {
                return false;
            }
            int b11 = WireFormat.b(i11);
            if (b11 == 0) {
                B();
                return true;
            } else if (b11 == 1) {
                z(8);
                return true;
            } else if (b11 == 2) {
                z(t());
                return true;
            } else if (b11 == 3) {
                A();
                return true;
            } else if (b11 == 5) {
                z(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }

        public long u() throws IOException {
            long j;
            int i11;
            long j11;
            long j12;
            byte b11;
            int i12 = this.f9993c;
            int i13 = this.f9995e;
            if (i13 != i12) {
                byte[] bArr = this.f9992b;
                int i14 = i12 + 1;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    this.f9993c = i14;
                    return (long) b12;
                } else if (i13 - i14 < 9) {
                    return v();
                } else {
                    int i15 = i14 + 1;
                    byte b13 = b12 ^ (bArr[i14] << 7);
                    if (b13 < 0) {
                        b11 = b13 ^ Byte.MIN_VALUE;
                    } else {
                        int i16 = i15 + 1;
                        byte b14 = b13 ^ (bArr[i15] << 14);
                        if (b14 >= 0) {
                            i11 = i16;
                            j = (long) (b14 ^ 16256);
                        } else {
                            i15 = i16 + 1;
                            byte b15 = b14 ^ (bArr[i16] << 21);
                            if (b15 < 0) {
                                b11 = b15 ^ -2080896;
                            } else {
                                long j13 = (long) b15;
                                int i17 = i15 + 1;
                                long j14 = j13 ^ (((long) bArr[i15]) << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i18 = i17 + 1;
                                    long j15 = j14 ^ (((long) bArr[i17]) << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i17 = i18 + 1;
                                        j14 = j15 ^ (((long) bArr[i18]) << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i18 = i17 + 1;
                                            j15 = j14 ^ (((long) bArr[i17]) << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i19 = i18 + 1;
                                                long j16 = (j15 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i11 = i19 + 1;
                                                    if (((long) bArr[i19]) < 0) {
                                                        throw InvalidProtocolBufferException.e();
                                                    }
                                                } else {
                                                    i11 = i19;
                                                }
                                                j = j16;
                                            }
                                        }
                                    }
                                    j = j15 ^ j11;
                                }
                                j = j14 ^ j12;
                                i11 = i17;
                            }
                        }
                        this.f9993c = i11;
                        return j;
                    }
                    j = (long) b11;
                    this.f9993c = i11;
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.l();
            }
        }
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e h(ByteBuffer byteBuffer, boolean z11) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z11);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private e() {
    }
}
