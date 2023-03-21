package androidx.constraintlayout.compose;

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
final class BaseHorizontalAnchorable$linkTo$1 extends Lambda implements l<v, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseHorizontalAnchorable f7894a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ConstraintLayoutBaseScope.b f7895b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f7896c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f7897d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseHorizontalAnchorable$linkTo$1(BaseHorizontalAnchorable baseHorizontalAnchorable, ConstraintLayoutBaseScope.b bVar, float f11, float f12) {
        super(1);
        this.f7894a = baseHorizontalAnchorable;
        this.f7895b = bVar;
        this.f7896c = f11;
        this.f7897d = f12;
    }

    public final void a(v vVar) {
        p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
        a c11 = this.f7894a.c(vVar);
        BaseHorizontalAnchorable baseHorizontalAnchorable = this.f7894a;
        ConstraintLayoutBaseScope.b bVar = this.f7895b;
        ((a) AnchorFunctions.f7878a.e()[baseHorizontalAnchorable.f7893b][bVar.b()].invoke(c11, bVar.a())).J(h.k(this.f7896c)).L(h.k(this.f7897d));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v) obj);
        return k.f22762a;
    }
}
