package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.n0;
import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;

/* compiled from: InspectableValue.kt */
public final class SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f6685a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f6686b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$1(Object obj, p pVar) {
        super(1);
        this.f6685a = obj;
        this.f6686b = pVar;
    }

    public final void a(n0 n0Var) {
        kotlin.jvm.internal.p.j(n0Var, "$this$null");
        n0Var.b("pointerInput");
        n0Var.a().b("key1", this.f6685a);
        n0Var.a().b(RenderingDetails.TYPE_BLOCK, this.f6686b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
