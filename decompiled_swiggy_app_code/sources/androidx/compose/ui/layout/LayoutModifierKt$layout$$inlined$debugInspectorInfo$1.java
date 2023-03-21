package androidx.compose.ui.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;

/* compiled from: InspectableValue.kt */
public final class LayoutModifierKt$layout$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f6732a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutModifierKt$layout$$inlined$debugInspectorInfo$1(q qVar) {
        super(1);
        this.f6732a = qVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("layout");
        n0Var.a().b("measure", this.f6732a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
