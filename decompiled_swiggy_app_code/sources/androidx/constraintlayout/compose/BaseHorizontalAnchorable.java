package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.a;
import bp0.k;
import f2.q;
import f2.v;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintScopeCommon.kt */
public abstract class BaseHorizontalAnchorable implements q {

    /* renamed from: a  reason: collision with root package name */
    private final List<l<v, k>> f7892a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f7893b;

    public BaseHorizontalAnchorable(List<l<v, k>> list, int i11) {
        p.j(list, "tasks");
        this.f7892a = list;
        this.f7893b = i11;
    }

    public final void a(ConstraintLayoutBaseScope.b bVar, float f11, float f12) {
        p.j(bVar, "anchor");
        this.f7892a.add(new BaseHorizontalAnchorable$linkTo$1(this, bVar, f11, f12));
    }

    public abstract a c(v vVar);
}
