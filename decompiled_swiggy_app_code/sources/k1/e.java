package k1;

import androidx.compose.ui.node.LayoutNode;
import e0.a1;
import e0.h0;
import i1.t;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: IntrinsicsPolicy.kt */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    private static final a f15341d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final LayoutNode f15342a;

    /* renamed from: b  reason: collision with root package name */
    private h0<t> f15343b;

    /* renamed from: c  reason: collision with root package name */
    private t f15344c;

    /* compiled from: IntrinsicsPolicy.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public e(LayoutNode layoutNode) {
        p.j(layoutNode, "layoutNode");
        this.f15342a = layoutNode;
    }

    private final t c() {
        h0<t> h0Var = this.f15343b;
        if (h0Var == null) {
            t tVar = this.f15344c;
            if (tVar != null) {
                h0Var = j.e(tVar, (a1) null, 2, (Object) null);
            } else {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
        }
        this.f15343b = h0Var;
        return h0Var.getValue();
    }

    public final int a(int i11) {
        return c().a(this.f15342a.k0(), this.f15342a.W(), i11);
    }

    public final int b(int i11) {
        return c().e(this.f15342a.k0(), this.f15342a.W(), i11);
    }

    public final int d(int i11) {
        return c().b(this.f15342a.k0(), this.f15342a.W(), i11);
    }

    public final int e(int i11) {
        return c().c(this.f15342a.k0(), this.f15342a.W(), i11);
    }

    public final void f(t tVar) {
        p.j(tVar, "measurePolicy");
        h0<t> h0Var = this.f15343b;
        if (h0Var != null) {
            p.g(h0Var);
            h0Var.setValue(tVar);
            return;
        }
        this.f15344c = tVar;
    }
}
