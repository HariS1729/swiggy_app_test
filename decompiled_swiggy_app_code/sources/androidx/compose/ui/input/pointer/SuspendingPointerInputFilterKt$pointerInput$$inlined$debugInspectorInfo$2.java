package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.n0;
import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;

/* compiled from: InspectableValue.kt */
public final class SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f6687a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6688b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p f6689c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2(Object obj, Object obj2, p pVar) {
        super(1);
        this.f6687a = obj;
        this.f6688b = obj2;
        this.f6689c = pVar;
    }

    public final void a(n0 n0Var) {
        kotlin.jvm.internal.p.j(n0Var, "$this$null");
        n0Var.b("pointerInput");
        n0Var.a().b("key1", this.f6687a);
        n0Var.a().b("key2", this.f6688b);
        n0Var.a().b(RenderingDetails.TYPE_BLOCK, this.f6689c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
