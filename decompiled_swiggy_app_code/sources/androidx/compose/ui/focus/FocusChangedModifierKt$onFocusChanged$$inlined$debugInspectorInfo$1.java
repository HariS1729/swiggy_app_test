package androidx.compose.ui.focus;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class FocusChangedModifierKt$onFocusChanged$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f6358a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusChangedModifierKt$onFocusChanged$$inlined$debugInspectorInfo$1(l lVar) {
        super(1);
        this.f6358a = lVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("onFocusChanged");
        n0Var.a().b("onFocusChanged", this.f6358a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
