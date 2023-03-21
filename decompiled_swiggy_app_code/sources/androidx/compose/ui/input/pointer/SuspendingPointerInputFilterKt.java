package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import f1.d0;
import f1.n;
import fp0.c;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import lp0.p;
import p0.d;

/* compiled from: SuspendingPointerInputFilter.kt */
public final class SuspendingPointerInputFilterKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final n f6684a = new n(k.j());

    public static final d b(d dVar, Object obj, Object obj2, p<? super d0, ? super c<? super k>, ? extends Object> pVar) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        kotlin.jvm.internal.p.j(pVar, RenderingDetails.TYPE_BLOCK);
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2(obj, obj2, pVar) : InspectableValueKt.a(), new SuspendingPointerInputFilterKt$pointerInput$4(obj, obj2, pVar));
    }

    public static final d c(d dVar, Object obj, p<? super d0, ? super c<? super k>, ? extends Object> pVar) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        kotlin.jvm.internal.p.j(pVar, RenderingDetails.TYPE_BLOCK);
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$1(obj, pVar) : InspectableValueKt.a(), new SuspendingPointerInputFilterKt$pointerInput$2(obj, pVar));
    }

    public static final d d(d dVar, Object[] objArr, p<? super d0, ? super c<? super k>, ? extends Object> pVar) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        kotlin.jvm.internal.p.j(objArr, "keys");
        kotlin.jvm.internal.p.j(pVar, RenderingDetails.TYPE_BLOCK);
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$3(objArr, pVar) : InspectableValueKt.a(), new SuspendingPointerInputFilterKt$pointerInput$6(objArr, pVar));
    }
}
