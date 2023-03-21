package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilter$awaitPointerEventScope$2$2 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> f6683a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$awaitPointerEventScope$2$2(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine) {
        super(1);
        this.f6683a = pointerEventHandlerCoroutine;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        this.f6683a.B(th2);
    }
}
