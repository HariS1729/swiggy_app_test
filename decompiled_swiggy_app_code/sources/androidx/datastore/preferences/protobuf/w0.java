package androidx.datastore.preferences.protobuf;

/* compiled from: RawMessageInfo */
final class w0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f10124a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10125b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f10126c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10127d;

    w0(k0 k0Var, String str, Object[] objArr) {
        this.f10124a = k0Var;
        this.f10125b = str;
        this.f10126c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f10127d = charAt;
            return;
        }
        char c11 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 >= 55296) {
                c11 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.f10127d = c11 | (charAt2 << i11);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object[] a() {
        return this.f10126c;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f10125b;
    }

    public k0 getDefaultInstance() {
        return this.f10124a;
    }

    public ProtoSyntax getSyntax() {
        return (this.f10127d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    public boolean isMessageSetWireFormat() {
        return (this.f10127d & 2) == 2;
    }
}
