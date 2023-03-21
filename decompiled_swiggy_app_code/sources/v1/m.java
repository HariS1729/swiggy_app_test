package v1;

import a0.h;
import kotlin.jvm.internal.i;

/* compiled from: ImeOptions.kt */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final a f17149f = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final m f17150g = new m(false, 0, false, 0, 0, 31, (i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f17151a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17152b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f17153c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17154d;

    /* renamed from: e  reason: collision with root package name */
    private final int f17155e;

    /* compiled from: ImeOptions.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final m a() {
            return m.f17150g;
        }
    }

    private m(boolean z11, int i11, boolean z12, int i12, int i13) {
        this.f17151a = z11;
        this.f17152b = i11;
        this.f17153c = z12;
        this.f17154d = i12;
        this.f17155e = i13;
    }

    public /* synthetic */ m(boolean z11, int i11, boolean z12, int i12, int i13, i iVar) {
        this(z11, i11, z12, i12, i13);
    }

    public final boolean b() {
        return this.f17153c;
    }

    public final int c() {
        return this.f17152b;
    }

    public final int d() {
        return this.f17155e;
    }

    public final int e() {
        return this.f17154d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f17151a == mVar.f17151a && q.f(this.f17152b, mVar.f17152b) && this.f17153c == mVar.f17153c && r.k(this.f17154d, mVar.f17154d) && l.l(this.f17155e, mVar.f17155e);
    }

    public final boolean f() {
        return this.f17151a;
    }

    public int hashCode() {
        return (((((((h.a(this.f17151a) * 31) + q.g(this.f17152b)) * 31) + h.a(this.f17153c)) * 31) + r.l(this.f17154d)) * 31) + l.m(this.f17155e);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f17151a + ", capitalization=" + q.h(this.f17152b) + ", autoCorrect=" + this.f17153c + ", keyboardType=" + r.m(this.f17154d) + ", imeAction=" + l.n(this.f17155e) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(boolean z11, int i11, boolean z12, int i12, int i13, int i14, i iVar) {
        this((i14 & 1) != 0 ? false : z11, (i14 & 2) != 0 ? q.f17178a.b() : i11, (i14 & 4) != 0 ? true : z12, (i14 & 8) != 0 ? r.f17183a.h() : i12, (i14 & 16) != 0 ? l.f17134b.a() : i13, (i) null);
    }
}
