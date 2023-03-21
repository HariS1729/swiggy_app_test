package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.n0;
import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;

/* compiled from: InspectableValue.kt */
public final class SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$3 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object[] f6690a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f6691b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$3(Object[] objArr, p pVar) {
        super(1);
        this.f6690a = objArr;
        this.f6691b = pVar;
    }

    public final void a(n0 n0Var) {
        kotlin.jvm.internal.p.j(n0Var, "$this$null");
        n0Var.b("pointerInput");
        n0Var.a().b("keys", this.f6690a);
        n0Var.a().b(RenderingDetails.TYPE_BLOCK, this.f6691b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
