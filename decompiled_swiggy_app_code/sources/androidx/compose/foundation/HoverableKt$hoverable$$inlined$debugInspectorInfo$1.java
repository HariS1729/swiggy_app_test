package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class HoverableKt$hoverable$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u.k f3008a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f3009b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverableKt$hoverable$$inlined$debugInspectorInfo$1(u.k kVar, boolean z11) {
        super(1);
        this.f3008a = kVar;
        this.f3009b = z11;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("hoverable");
        n0Var.a().b("interactionSource", this.f3008a);
        n0Var.a().b("enabled", Boolean.valueOf(this.f3009b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
