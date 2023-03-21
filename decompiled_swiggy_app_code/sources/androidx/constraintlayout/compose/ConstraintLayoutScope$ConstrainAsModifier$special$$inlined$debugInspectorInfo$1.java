package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.n0;
import bp0.k;
import f2.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f7954a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l f7955b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1(b bVar, l lVar) {
        super(1);
        this.f7954a = bVar;
        this.f7955b = lVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("constrainAs");
        n0Var.a().b("ref", this.f7954a);
        n0Var.a().b("constrainBlock", this.f7955b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
