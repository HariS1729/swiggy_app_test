package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f2960a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u.k f2961b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1(boolean z11, u.k kVar) {
        super(1);
        this.f2960a = z11;
        this.f2961b = kVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("focusableInNonTouchMode");
        n0Var.a().b("enabled", Boolean.valueOf(this.f2960a));
        n0Var.a().b("interactionSource", this.f2961b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
