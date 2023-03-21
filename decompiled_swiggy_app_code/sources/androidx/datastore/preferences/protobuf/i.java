package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.List;

/* compiled from: CodedInputStreamReader */
final class i implements x0 {

    /* renamed from: a  reason: collision with root package name */
    private final h f10039a;

    /* renamed from: b  reason: collision with root package name */
    private int f10040b;

    /* renamed from: c  reason: collision with root package name */
    private int f10041c;

    /* renamed from: d  reason: collision with root package name */
    private int f10042d = 0;

    /* compiled from: CodedInputStreamReader */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10043a;

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
                f10043a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f10043a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.a.<clinit>():void");
        }
    }

    private i(h hVar) {
        h hVar2 = (h) w.b(hVar, "input");
        this.f10039a = hVar2;
        hVar2.f10017d = this;
    }

    public static i h(h hVar) {
        i iVar = hVar.f10017d;
        if (iVar != null) {
            return iVar;
        }
        return new i(hVar);
    }

    private Object i(WireFormat.FieldType fieldType, Class<?> cls, n nVar) throws IOException {
        switch (a.f10043a[fieldType.ordinal()]) {
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

    private <T> T j(y0<T> y0Var, n nVar) throws IOException {
        int i11 = this.f10041c;
        this.f10041c = WireFormat.c(WireFormat.a(this.f10040b), 4);
        try {
            T newInstance = y0Var.newInstance();
            y0Var.b(newInstance, this, nVar);
            y0Var.makeImmutable(newInstance);
            if (this.f10040b == this.f10041c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.h();
        } finally {
            this.f10041c = i11;
        }
    }

    private <T> T k(y0<T> y0Var, n nVar) throws IOException {
        int C = this.f10039a.C();
        h hVar = this.f10039a;
        if (hVar.f10014a < hVar.f10015b) {
            int l11 = hVar.l(C);
            T newInstance = y0Var.newInstance();
            this.f10039a.f10014a++;
            y0Var.b(newInstance, this, nVar);
            y0Var.makeImmutable(newInstance);
            this.f10039a.a(0);
            h hVar2 = this.f10039a;
            hVar2.f10014a--;
            hVar2.k(l11);
            return newInstance;
        }
        throw InvalidProtocolBufferException.i();
    }

    private void m(int i11) throws IOException {
        if (this.f10039a.d() != i11) {
            throw InvalidProtocolBufferException.l();
        }
    }

    private void n(int i11) throws IOException {
        if (WireFormat.b(this.f10040b) != i11) {
            throw InvalidProtocolBufferException.d();
        }
    }

    private void o(int i11) throws IOException {
        if ((i11 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void p(int i11) throws IOException {
        if ((i11 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public <T> T a(y0<T> y0Var, n nVar) throws IOException {
        n(3);
        return j(y0Var, nVar);
    }

    public <T> T b(Class<T> cls, n nVar) throws IOException {
        n(2);
        return k(u0.a().d(cls), nVar);
    }

    public <T> T c(y0<T> y0Var, n nVar) throws IOException {
        n(2);
        return k(y0Var, nVar);
    }

    public <T> void d(List<T> list, y0<T> y0Var, n nVar) throws IOException {
        int B;
        if (WireFormat.b(this.f10040b) == 2) {
            int i11 = this.f10040b;
            do {
                list.add(k(y0Var, nVar));
                if (!this.f10039a.e() && this.f10042d == 0) {
                    B = this.f10039a.B();
                } else {
                    return;
                }
            } while (B == i11);
            this.f10042d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public <T> T e(Class<T> cls, n nVar) throws IOException {
        n(3);
        return j(u0.a().d(cls), nVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (skipField() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void f(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.e0.a<K, V> r9, androidx.datastore.preferences.protobuf.n r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.n(r0)
            androidx.datastore.preferences.protobuf.h r1 = r7.f10039a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.h r2 = r7.f10039a
            int r1 = r2.l(r1)
            K r2 = r9.f10002b
            V r3 = r9.f10004d
        L_0x0014:
            int r4 = r7.getFieldNumber()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            androidx.datastore.preferences.protobuf.h r5 = r7.f10039a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.skipField()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>(r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f10003c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f10004d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.i(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f10001a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.i(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.skipField()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            androidx.datastore.preferences.protobuf.h r8 = r7.f10039a
            r8.k(r1)
            return
        L_0x0065:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.h r9 = r7.f10039a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.f(java.util.Map, androidx.datastore.preferences.protobuf.e0$a, androidx.datastore.preferences.protobuf.n):void");
    }

    public <T> void g(List<T> list, y0<T> y0Var, n nVar) throws IOException {
        int B;
        if (WireFormat.b(this.f10040b) == 3) {
            int i11 = this.f10040b;
            do {
                list.add(j(y0Var, nVar));
                if (!this.f10039a.e() && this.f10042d == 0) {
                    B = this.f10039a.B();
                } else {
                    return;
                }
            } while (B == i11);
            this.f10042d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public int getFieldNumber() throws IOException {
        int i11 = this.f10042d;
        if (i11 != 0) {
            this.f10040b = i11;
            this.f10042d = 0;
        } else {
            this.f10040b = this.f10039a.B();
        }
        int i12 = this.f10040b;
        if (i12 == 0 || i12 == this.f10041c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i12);
    }

    public int getTag() {
        return this.f10040b;
    }

    public void l(List<String> list, boolean z11) throws IOException {
        int B;
        int B2;
        if (WireFormat.b(this.f10040b) != 2) {
            throw InvalidProtocolBufferException.d();
        } else if (!(list instanceof a0) || z11) {
            do {
                list.add(z11 ? readStringRequireUtf8() : readString());
                if (!this.f10039a.e()) {
                    B = this.f10039a.B();
                } else {
                    return;
                }
            } while (B == this.f10040b);
            this.f10042d = B;
        } else {
            a0 a0Var = (a0) list;
            do {
                a0Var.w(readBytes());
                if (!this.f10039a.e()) {
                    B2 = this.f10039a.B();
                } else {
                    return;
                }
            } while (B2 == this.f10040b);
            this.f10042d = B2;
        }
    }

    public boolean readBool() throws IOException {
        n(0);
        return this.f10039a.m();
    }

    public void readBoolList(List<Boolean> list) throws IOException {
        int B;
        int B2;
        if (list instanceof f) {
            f fVar = (f) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 0) {
                do {
                    fVar.addBoolean(this.f10039a.m());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int d11 = this.f10039a.d() + this.f10039a.C();
                do {
                    fVar.addBoolean(this.f10039a.m());
                } while (this.f10039a.d() < d11);
                m(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f10039a.m()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int d12 = this.f10039a.d() + this.f10039a.C();
                do {
                    list.add(Boolean.valueOf(this.f10039a.m()));
                } while (this.f10039a.d() < d12);
                m(d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public ByteString readBytes() throws IOException {
        n(2);
        return this.f10039a.n();
    }

    public void readBytesList(List<ByteString> list) throws IOException {
        int B;
        if (WireFormat.b(this.f10040b) == 2) {
            do {
                list.add(readBytes());
                if (!this.f10039a.e()) {
                    B = this.f10039a.B();
                } else {
                    return;
                }
            } while (B == this.f10040b);
            this.f10042d = B;
            return;
        }
        throw InvalidProtocolBufferException.d();
    }

    public double readDouble() throws IOException {
        n(1);
        return this.f10039a.o();
    }

    public void readDoubleList(List<Double> list) throws IOException {
        int B;
        int B2;
        if (list instanceof k) {
            k kVar = (k) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 1) {
                do {
                    kVar.addDouble(this.f10039a.o());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int C = this.f10039a.C();
                p(C);
                int d11 = this.f10039a.d() + C;
                do {
                    kVar.addDouble(this.f10039a.o());
                } while (this.f10039a.d() < d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 1) {
                do {
                    list.add(Double.valueOf(this.f10039a.o()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int C2 = this.f10039a.C();
                p(C2);
                int d12 = this.f10039a.d() + C2;
                do {
                    list.add(Double.valueOf(this.f10039a.o()));
                } while (this.f10039a.d() < d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int readEnum() throws IOException {
        n(0);
        return this.f10039a.p();
    }

    public void readEnumList(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 0) {
                do {
                    vVar.addInt(this.f10039a.p());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int d11 = this.f10039a.d() + this.f10039a.C();
                do {
                    vVar.addInt(this.f10039a.p());
                } while (this.f10039a.d() < d11);
                m(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10039a.p()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int d12 = this.f10039a.d() + this.f10039a.C();
                do {
                    list.add(Integer.valueOf(this.f10039a.p()));
                } while (this.f10039a.d() < d12);
                m(d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int readFixed32() throws IOException {
        n(5);
        return this.f10039a.q();
    }

    public void readFixed32List(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 2) {
                int C = this.f10039a.C();
                o(C);
                int d11 = this.f10039a.d() + C;
                do {
                    vVar.addInt(this.f10039a.q());
                } while (this.f10039a.d() < d11);
            } else if (b11 == 5) {
                do {
                    vVar.addInt(this.f10039a.q());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 2) {
                int C2 = this.f10039a.C();
                o(C2);
                int d12 = this.f10039a.d() + C2;
                do {
                    list.add(Integer.valueOf(this.f10039a.q()));
                } while (this.f10039a.d() < d12);
            } else if (b12 == 5) {
                do {
                    list.add(Integer.valueOf(this.f10039a.q()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public long readFixed64() throws IOException {
        n(1);
        return this.f10039a.r();
    }

    public void readFixed64List(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 1) {
                do {
                    c0Var.addLong(this.f10039a.r());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int C = this.f10039a.C();
                p(C);
                int d11 = this.f10039a.d() + C;
                do {
                    c0Var.addLong(this.f10039a.r());
                } while (this.f10039a.d() < d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 1) {
                do {
                    list.add(Long.valueOf(this.f10039a.r()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int C2 = this.f10039a.C();
                p(C2);
                int d12 = this.f10039a.d() + C2;
                do {
                    list.add(Long.valueOf(this.f10039a.r()));
                } while (this.f10039a.d() < d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public float readFloat() throws IOException {
        n(5);
        return this.f10039a.s();
    }

    public void readFloatList(List<Float> list) throws IOException {
        int B;
        int B2;
        if (list instanceof t) {
            t tVar = (t) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 2) {
                int C = this.f10039a.C();
                o(C);
                int d11 = this.f10039a.d() + C;
                do {
                    tVar.addFloat(this.f10039a.s());
                } while (this.f10039a.d() < d11);
            } else if (b11 == 5) {
                do {
                    tVar.addFloat(this.f10039a.s());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 2) {
                int C2 = this.f10039a.C();
                o(C2);
                int d12 = this.f10039a.d() + C2;
                do {
                    list.add(Float.valueOf(this.f10039a.s()));
                } while (this.f10039a.d() < d12);
            } else if (b12 == 5) {
                do {
                    list.add(Float.valueOf(this.f10039a.s()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int readInt32() throws IOException {
        n(0);
        return this.f10039a.t();
    }

    public void readInt32List(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 0) {
                do {
                    vVar.addInt(this.f10039a.t());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int d11 = this.f10039a.d() + this.f10039a.C();
                do {
                    vVar.addInt(this.f10039a.t());
                } while (this.f10039a.d() < d11);
                m(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10039a.t()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int d12 = this.f10039a.d() + this.f10039a.C();
                do {
                    list.add(Integer.valueOf(this.f10039a.t()));
                } while (this.f10039a.d() < d12);
                m(d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public long readInt64() throws IOException {
        n(0);
        return this.f10039a.u();
    }

    public void readInt64List(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 0) {
                do {
                    c0Var.addLong(this.f10039a.u());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int d11 = this.f10039a.d() + this.f10039a.C();
                do {
                    c0Var.addLong(this.f10039a.u());
                } while (this.f10039a.d() < d11);
                m(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 0) {
                do {
                    list.add(Long.valueOf(this.f10039a.u()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int d12 = this.f10039a.d() + this.f10039a.C();
                do {
                    list.add(Long.valueOf(this.f10039a.u()));
                } while (this.f10039a.d() < d12);
                m(d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int readSFixed32() throws IOException {
        n(5);
        return this.f10039a.v();
    }

    public void readSFixed32List(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 2) {
                int C = this.f10039a.C();
                o(C);
                int d11 = this.f10039a.d() + C;
                do {
                    vVar.addInt(this.f10039a.v());
                } while (this.f10039a.d() < d11);
            } else if (b11 == 5) {
                do {
                    vVar.addInt(this.f10039a.v());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 2) {
                int C2 = this.f10039a.C();
                o(C2);
                int d12 = this.f10039a.d() + C2;
                do {
                    list.add(Integer.valueOf(this.f10039a.v()));
                } while (this.f10039a.d() < d12);
            } else if (b12 == 5) {
                do {
                    list.add(Integer.valueOf(this.f10039a.v()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public long readSFixed64() throws IOException {
        n(1);
        return this.f10039a.w();
    }

    public void readSFixed64List(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 1) {
                do {
                    c0Var.addLong(this.f10039a.w());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int C = this.f10039a.C();
                p(C);
                int d11 = this.f10039a.d() + C;
                do {
                    c0Var.addLong(this.f10039a.w());
                } while (this.f10039a.d() < d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 1) {
                do {
                    list.add(Long.valueOf(this.f10039a.w()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int C2 = this.f10039a.C();
                p(C2);
                int d12 = this.f10039a.d() + C2;
                do {
                    list.add(Long.valueOf(this.f10039a.w()));
                } while (this.f10039a.d() < d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public int readSInt32() throws IOException {
        n(0);
        return this.f10039a.x();
    }

    public void readSInt32List(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 0) {
                do {
                    vVar.addInt(this.f10039a.x());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int d11 = this.f10039a.d() + this.f10039a.C();
                do {
                    vVar.addInt(this.f10039a.x());
                } while (this.f10039a.d() < d11);
                m(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10039a.x()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int d12 = this.f10039a.d() + this.f10039a.C();
                do {
                    list.add(Integer.valueOf(this.f10039a.x()));
                } while (this.f10039a.d() < d12);
                m(d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public long readSInt64() throws IOException {
        n(0);
        return this.f10039a.y();
    }

    public void readSInt64List(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 0) {
                do {
                    c0Var.addLong(this.f10039a.y());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int d11 = this.f10039a.d() + this.f10039a.C();
                do {
                    c0Var.addLong(this.f10039a.y());
                } while (this.f10039a.d() < d11);
                m(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 0) {
                do {
                    list.add(Long.valueOf(this.f10039a.y()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int d12 = this.f10039a.d() + this.f10039a.C();
                do {
                    list.add(Long.valueOf(this.f10039a.y()));
                } while (this.f10039a.d() < d12);
                m(d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public String readString() throws IOException {
        n(2);
        return this.f10039a.z();
    }

    public void readStringList(List<String> list) throws IOException {
        l(list, false);
    }

    public void readStringListRequireUtf8(List<String> list) throws IOException {
        l(list, true);
    }

    public String readStringRequireUtf8() throws IOException {
        n(2);
        return this.f10039a.A();
    }

    public int readUInt32() throws IOException {
        n(0);
        return this.f10039a.C();
    }

    public void readUInt32List(List<Integer> list) throws IOException {
        int B;
        int B2;
        if (list instanceof v) {
            v vVar = (v) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 0) {
                do {
                    vVar.addInt(this.f10039a.C());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int d11 = this.f10039a.d() + this.f10039a.C();
                do {
                    vVar.addInt(this.f10039a.C());
                } while (this.f10039a.d() < d11);
                m(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 0) {
                do {
                    list.add(Integer.valueOf(this.f10039a.C()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int d12 = this.f10039a.d() + this.f10039a.C();
                do {
                    list.add(Integer.valueOf(this.f10039a.C()));
                } while (this.f10039a.d() < d12);
                m(d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public long readUInt64() throws IOException {
        n(0);
        return this.f10039a.D();
    }

    public void readUInt64List(List<Long> list) throws IOException {
        int B;
        int B2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b11 = WireFormat.b(this.f10040b);
            if (b11 == 0) {
                do {
                    c0Var.addLong(this.f10039a.D());
                    if (!this.f10039a.e()) {
                        B2 = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f10040b);
                this.f10042d = B2;
            } else if (b11 == 2) {
                int d11 = this.f10039a.d() + this.f10039a.C();
                do {
                    c0Var.addLong(this.f10039a.D());
                } while (this.f10039a.d() < d11);
                m(d11);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        } else {
            int b12 = WireFormat.b(this.f10040b);
            if (b12 == 0) {
                do {
                    list.add(Long.valueOf(this.f10039a.D()));
                    if (!this.f10039a.e()) {
                        B = this.f10039a.B();
                    } else {
                        return;
                    }
                } while (B == this.f10040b);
                this.f10042d = B;
            } else if (b12 == 2) {
                int d12 = this.f10039a.d() + this.f10039a.C();
                do {
                    list.add(Long.valueOf(this.f10039a.D()));
                } while (this.f10039a.d() < d12);
                m(d12);
            } else {
                throw InvalidProtocolBufferException.d();
            }
        }
    }

    public boolean skipField() throws IOException {
        int i11;
        if (this.f10039a.e() || (i11 = this.f10040b) == this.f10041c) {
            return false;
        }
        return this.f10039a.E(i11);
    }
}
