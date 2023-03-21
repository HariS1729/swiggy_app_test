package androidx.constraintlayout.core.parser;

import com.newrelic.agent.android.util.SafeJsonPrimitive;

public class CLToken extends c {

    /* renamed from: f  reason: collision with root package name */
    int f8091f = 0;

    /* renamed from: g  reason: collision with root package name */
    Type f8092g = Type.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    char[] f8093h = "true".toCharArray();

    /* renamed from: i  reason: collision with root package name */
    char[] f8094i = "false".toCharArray();
    char[] j = SafeJsonPrimitive.NULL_STRING.toCharArray();

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8095a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.parser.CLToken$Type[] r0 = androidx.constraintlayout.core.parser.CLToken.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8095a = r0
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.TRUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8095a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.FALSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8095a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.NULL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8095a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.parser.CLToken$Type r1 = androidx.constraintlayout.core.parser.CLToken.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.parser.CLToken.a.<clinit>():void");
        }
    }

    public CLToken(char[] cArr) {
        super(cArr);
    }

    public static c r(char[] cArr) {
        return new CLToken(cArr);
    }

    /* access modifiers changed from: protected */
    public String q() {
        if (!CLParser.f8083d) {
            return c();
        }
        return "<" + c() + ">";
    }

    public boolean s(char c11, long j11) {
        int i11 = a.f8095a[this.f8092g.ordinal()];
        boolean z11 = false;
        if (i11 == 1) {
            char[] cArr = this.f8093h;
            int i12 = this.f8091f;
            if (cArr[i12] == c11) {
                z11 = true;
            }
            if (z11 && i12 + 1 == cArr.length) {
                n(j11);
            }
        } else if (i11 == 2) {
            char[] cArr2 = this.f8094i;
            int i13 = this.f8091f;
            if (cArr2[i13] == c11) {
                z11 = true;
            }
            if (z11 && i13 + 1 == cArr2.length) {
                n(j11);
            }
        } else if (i11 == 3) {
            char[] cArr3 = this.j;
            int i14 = this.f8091f;
            if (cArr3[i14] == c11) {
                z11 = true;
            }
            if (z11 && i14 + 1 == cArr3.length) {
                n(j11);
            }
        } else if (i11 == 4) {
            char[] cArr4 = this.f8093h;
            int i15 = this.f8091f;
            if (cArr4[i15] == c11) {
                this.f8092g = Type.TRUE;
            } else if (this.f8094i[i15] == c11) {
                this.f8092g = Type.FALSE;
            } else if (this.j[i15] == c11) {
                this.f8092g = Type.NULL;
            }
            z11 = true;
        }
        this.f8091f++;
        return z11;
    }
}
