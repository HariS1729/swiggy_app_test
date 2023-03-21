package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.n0;
import bp0.k;
import f1.r;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f6634a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f6635b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1(r rVar, boolean z11) {
        super(1);
        this.f6634a = rVar;
        this.f6635b = z11;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("pointerHoverIcon");
        n0Var.a().b(MenuConstants.MENU_OFFER_ICON, this.f6634a);
        n0Var.a().b("overrideDescendants", Boolean.valueOf(this.f6635b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
