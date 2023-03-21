package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.a;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import d2.h;
import f2.v;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintScopeCommon.kt */
final class BaseVerticalAnchorable$linkTo$1 extends Lambda implements l<v, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseVerticalAnchorable f7900a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ConstraintLayoutBaseScope.c f7901b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f7902c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f7903d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseVerticalAnchorable$linkTo$1(BaseVerticalAnchorable baseVerticalAnchorable, ConstraintLayoutBaseScope.c cVar, float f11, float f12) {
        super(1);
        this.f7900a = baseVerticalAnchorable;
        this.f7901b = cVar;
        this.f7902c = f11;
        this.f7903d = f12;
    }

    public final void a(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        LayoutDirection w11 = vVar.w();
        AnchorFunctions anchorFunctions = AnchorFunctions.f7878a;
        int g11 = anchorFunctions.g(this.f7900a.f7899b, w11);
        int g12 = anchorFunctions.g(this.f7901b.b(), w11);
        ((a) anchorFunctions.f()[g11][g12].invoke(this.f7900a.c(vVar), this.f7901b.a(), vVar.w())).J(h.k(this.f7902c)).L(h.k(this.f7903d));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v) obj);
        return k.f22762a;
    }
}
