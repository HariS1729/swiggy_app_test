package b0;

import a0.k;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import b0.a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.a0;
import p1.b;
import p1.b0;
import p1.y;
import t0.g;
import v1.s;

/* compiled from: TextPreparedSelection.kt */
public abstract class a<T extends a<T>> {

    /* renamed from: h  reason: collision with root package name */
    public static final C0098a f12543h = new C0098a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final b f12544a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12545b;

    /* renamed from: c  reason: collision with root package name */
    private final y f12546c;

    /* renamed from: d  reason: collision with root package name */
    private final s f12547d;

    /* renamed from: e  reason: collision with root package name */
    private final n f12548e;

    /* renamed from: f  reason: collision with root package name */
    private long f12549f;

    /* renamed from: g  reason: collision with root package name */
    private b f12550g;

    /* renamed from: b0.a$a  reason: collision with other inner class name */
    /* compiled from: TextPreparedSelection.kt */
    public static final class C0098a {
        private C0098a() {
        }

        public /* synthetic */ C0098a(i iVar) {
            this();
        }
    }

    private a(b bVar, long j, y yVar, s sVar, n nVar) {
        this.f12544a = bVar;
        this.f12545b = j;
        this.f12546c = yVar;
        this.f12547d = sVar;
        this.f12548e = nVar;
        this.f12549f = j;
        this.f12550g = bVar;
    }

    public /* synthetic */ a(b bVar, long j, y yVar, s sVar, n nVar, i iVar) {
        this(bVar, j, yVar, sVar, nVar);
    }

    private final int A(y yVar, int i11) {
        int X = X();
        if (this.f12548e.a() == null) {
            this.f12548e.c(Float.valueOf(yVar.d(X).i()));
        }
        int p11 = yVar.p(X) + i11;
        if (p11 < 0) {
            return 0;
        }
        if (p11 >= yVar.m()) {
            return y().length();
        }
        float l11 = yVar.l(p11) - ((float) 1);
        Float a11 = this.f12548e.a();
        p.g(a11);
        float floatValue = a11.floatValue();
        if ((z() && floatValue >= yVar.s(p11)) || (!z() && floatValue <= yVar.r(p11))) {
            return yVar.n(p11, true);
        }
        return this.f12547d.a(yVar.w(g.a(a11.floatValue(), l11)));
    }

    private final T E() {
        int l11;
        x().b();
        if ((y().length() > 0) && (l11 = l()) != -1) {
            V(l11);
        }
        return this;
    }

    private final T G() {
        Integer m11;
        x().b();
        if ((y().length() > 0) && (m11 = m()) != null) {
            V(m11.intValue());
        }
        return this;
    }

    private final T H() {
        int s11;
        x().b();
        if ((y().length() > 0) && (s11 = s()) != -1) {
            V(s11);
        }
        return this;
    }

    private final T J() {
        Integer v;
        x().b();
        if ((y().length() > 0) && (v = v()) != null) {
            V(v.intValue());
        }
        return this;
    }

    private final int X() {
        return this.f12547d.b(a0.i(this.f12549f));
    }

    private final int Y() {
        return this.f12547d.b(a0.k(this.f12549f));
    }

    private final int Z() {
        return this.f12547d.b(a0.l(this.f12549f));
    }

    private final int a(int i11) {
        return l.i(i11, y().length() - 1);
    }

    private final int g(y yVar, int i11) {
        return this.f12547d.a(yVar.n(yVar.p(i11), true));
    }

    static /* synthetic */ int h(a aVar, y yVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = aVar.Y();
            }
            return aVar.g(yVar, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    private final int j(y yVar, int i11) {
        return this.f12547d.a(yVar.t(yVar.p(i11)));
    }

    static /* synthetic */ int k(a aVar, y yVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = aVar.Z();
            }
            return aVar.j(yVar, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    private final int n(y yVar, int i11) {
        if (i11 >= this.f12544a.length()) {
            return this.f12544a.length();
        }
        long B = yVar.B(a(i11));
        if (a0.i(B) <= i11) {
            return n(yVar, i11 + 1);
        }
        return this.f12547d.a(a0.i(B));
    }

    static /* synthetic */ int o(a aVar, y yVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = aVar.X();
            }
            return aVar.n(yVar, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    private final int q() {
        return k.a(y(), a0.k(this.f12549f));
    }

    private final int r() {
        return k.b(y(), a0.l(this.f12549f));
    }

    private final int t(y yVar, int i11) {
        if (i11 < 0) {
            return 0;
        }
        long B = yVar.B(a(i11));
        if (a0.n(B) >= i11) {
            return t(yVar, i11 - 1);
        }
        return this.f12547d.a(a0.n(B));
    }

    static /* synthetic */ int u(a aVar, y yVar, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i11 = aVar.X();
            }
            return aVar.t(yVar, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean z() {
        y yVar = this.f12546c;
        return (yVar != null ? yVar.x(a0.i(this.f12549f)) : null) != ResolvedTextDirection.Rtl;
    }

    public final T B() {
        y yVar;
        if ((y().length() > 0) && (yVar = this.f12546c) != null) {
            V(A(yVar, 1));
        }
        return this;
    }

    public final T C() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                H();
            } else {
                E();
            }
        }
        return this;
    }

    public final T D() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                J();
            } else {
                G();
            }
        }
        return this;
    }

    public final T F() {
        x().b();
        if (y().length() > 0) {
            V(q());
        }
        return this;
    }

    public final T I() {
        x().b();
        if (y().length() > 0) {
            V(r());
        }
        return this;
    }

    public final T K() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                E();
            } else {
                H();
            }
        }
        return this;
    }

    public final T L() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                G();
            } else {
                J();
            }
        }
        return this;
    }

    public final T M() {
        x().b();
        if (y().length() > 0) {
            V(y().length());
        }
        return this;
    }

    public final T N() {
        x().b();
        if (y().length() > 0) {
            V(0);
        }
        return this;
    }

    public final T O() {
        Integer f11;
        x().b();
        if ((y().length() > 0) && (f11 = f()) != null) {
            V(f11.intValue());
        }
        return this;
    }

    public final T P() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                R();
            } else {
                O();
            }
        }
        return this;
    }

    public final T Q() {
        x().b();
        if (y().length() > 0) {
            if (z()) {
                O();
            } else {
                R();
            }
        }
        return this;
    }

    public final T R() {
        Integer i11;
        x().b();
        if ((y().length() > 0) && (i11 = i()) != null) {
            V(i11.intValue());
        }
        return this;
    }

    public final T S() {
        y yVar;
        if ((y().length() > 0) && (yVar = this.f12546c) != null) {
            V(A(yVar, -1));
        }
        return this;
    }

    public final T T() {
        x().b();
        if (y().length() > 0) {
            W(0, y().length());
        }
        return this;
    }

    public final T U() {
        if (y().length() > 0) {
            this.f12549f = b0.b(a0.n(this.f12545b), a0.i(this.f12549f));
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void V(int i11) {
        W(i11, i11);
    }

    /* access modifiers changed from: protected */
    public final void W(int i11, int i12) {
        this.f12549f = b0.b(i11, i12);
    }

    public final T b(l<? super T, bp0.k> lVar) {
        p.j(lVar, "or");
        x().b();
        if (y().length() > 0) {
            if (a0.h(this.f12549f)) {
                lVar.invoke(this);
            } else if (z()) {
                V(a0.l(this.f12549f));
            } else {
                V(a0.k(this.f12549f));
            }
        }
        return this;
    }

    public final T c(l<? super T, bp0.k> lVar) {
        p.j(lVar, "or");
        x().b();
        if (y().length() > 0) {
            if (a0.h(this.f12549f)) {
                lVar.invoke(this);
            } else if (z()) {
                V(a0.k(this.f12549f));
            } else {
                V(a0.l(this.f12549f));
            }
        }
        return this;
    }

    public final T d() {
        x().b();
        if (y().length() > 0) {
            V(a0.i(this.f12549f));
        }
        return this;
    }

    public final b e() {
        return this.f12550g;
    }

    public final Integer f() {
        y yVar = this.f12546c;
        if (yVar != null) {
            return Integer.valueOf(h(this, yVar, 0, 1, (Object) null));
        }
        return null;
    }

    public final Integer i() {
        y yVar = this.f12546c;
        if (yVar != null) {
            return Integer.valueOf(k(this, yVar, 0, 1, (Object) null));
        }
        return null;
    }

    public final int l() {
        return a0.l.a(this.f12550g.g(), a0.i(this.f12549f));
    }

    public final Integer m() {
        y yVar = this.f12546c;
        if (yVar != null) {
            return Integer.valueOf(o(this, yVar, 0, 1, (Object) null));
        }
        return null;
    }

    public final s p() {
        return this.f12547d;
    }

    public final int s() {
        return a0.l.b(this.f12550g.g(), a0.i(this.f12549f));
    }

    public final Integer v() {
        y yVar = this.f12546c;
        if (yVar != null) {
            return Integer.valueOf(u(this, yVar, 0, 1, (Object) null));
        }
        return null;
    }

    public final long w() {
        return this.f12549f;
    }

    public final n x() {
        return this.f12548e;
    }

    public final String y() {
        return this.f12550g.g();
    }
}
