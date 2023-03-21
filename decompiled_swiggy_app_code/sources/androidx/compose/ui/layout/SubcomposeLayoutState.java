package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import d2.b;
import e0.g;
import i1.j0;
import i1.k0;
import i1.u;
import lp0.p;

/* compiled from: SubcomposeLayout.kt */
public final class SubcomposeLayoutState {

    /* renamed from: f  reason: collision with root package name */
    public static final int f6787f = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k0 f6788a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public LayoutNodeSubcompositionsState f6789b;

    /* renamed from: c  reason: collision with root package name */
    private final p<LayoutNode, SubcomposeLayoutState, k> f6790c;

    /* renamed from: d  reason: collision with root package name */
    private final p<LayoutNode, androidx.compose.runtime.a, k> f6791d;

    /* renamed from: e  reason: collision with root package name */
    private final p<LayoutNode, p<? super j0, ? super b, ? extends u>, k> f6792e;

    /* compiled from: SubcomposeLayout.kt */
    public interface a {
        int a();

        void b(int i11, long j);

        void dispose();
    }

    public SubcomposeLayoutState(k0 k0Var) {
        kotlin.jvm.internal.p.j(k0Var, "slotReusePolicy");
        this.f6788a = k0Var;
        this.f6790c = new SubcomposeLayoutState$setRoot$1(this);
        this.f6791d = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.f6792e = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState i() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f6789b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void d() {
        i().m();
    }

    public final void e() {
        i().o();
    }

    public final p<LayoutNode, androidx.compose.runtime.a, k> f() {
        return this.f6791d;
    }

    public final p<LayoutNode, p<? super j0, ? super b, ? extends u>, k> g() {
        return this.f6792e;
    }

    public final p<LayoutNode, SubcomposeLayoutState, k> h() {
        return this.f6790c;
    }

    public final a j(Object obj, p<? super g, ? super Integer, k> pVar) {
        kotlin.jvm.internal.p.j(pVar, "content");
        return i().t(obj, pVar);
    }

    public SubcomposeLayoutState() {
        this(d.f6798a);
    }
}
