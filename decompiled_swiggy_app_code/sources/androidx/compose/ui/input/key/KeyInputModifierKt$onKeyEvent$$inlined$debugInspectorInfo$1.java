package androidx.compose.ui.input.key;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class KeyInputModifierKt$onKeyEvent$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f6600a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyInputModifierKt$onKeyEvent$$inlined$debugInspectorInfo$1(l lVar) {
        super(1);
        this.f6600a = lVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("onKeyEvent");
        n0Var.a().b("onKeyEvent", this.f6600a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
