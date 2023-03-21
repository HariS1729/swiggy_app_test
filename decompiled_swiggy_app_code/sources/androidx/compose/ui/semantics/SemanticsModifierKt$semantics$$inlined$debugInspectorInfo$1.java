package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class SemanticsModifierKt$semantics$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f7412a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l f7413b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemanticsModifierKt$semantics$$inlined$debugInspectorInfo$1(boolean z11, l lVar) {
        super(1);
        this.f7412a = z11;
        this.f7413b = lVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("semantics");
        n0Var.a().b("mergeDescendants", Boolean.valueOf(this.f7412a));
        n0Var.a().b("properties", this.f7413b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
