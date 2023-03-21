package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.a;
import bp0.k;
import f2.v;
import f2.x;
import java.util.List;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintScopeCommon.kt */
public abstract class BaseVerticalAnchorable implements x {

    /* renamed from: a  reason: collision with root package name */
    private final List<l<v, k>> f7898a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f7899b;

    public BaseVerticalAnchorable(List<l<v, k>> list, int i11) {
        p.j(list, "tasks");
        this.f7898a = list;
        this.f7899b = i11;
    }

    public final void a(ConstraintLayoutBaseScope.c cVar, float f11, float f12) {
        p.j(cVar, "anchor");
        this.f7898a.add(new BaseVerticalAnchorable$linkTo$1(this, cVar, f11, f12));
    }

    public abstract a c(v vVar);
}
