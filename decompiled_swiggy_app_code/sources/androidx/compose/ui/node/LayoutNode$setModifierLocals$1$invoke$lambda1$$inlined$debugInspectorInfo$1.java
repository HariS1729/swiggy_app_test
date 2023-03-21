package androidx.compose.ui.node;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* renamed from: androidx.compose.ui.node.LayoutNode$setModifierLocals$1$invoke$lambda-1$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class LayoutNode$setModifierLocals$1$invoke$lambda1$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s0.k f6852a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutNode$setModifierLocals$1$invoke$lambda1$$inlined$debugInspectorInfo$1(s0.k kVar) {
        super(1);
        this.f6852a = kVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("focusProperties");
        n0Var.a().b("scope", this.f6852a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
