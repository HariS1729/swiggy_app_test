package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {597}, m = "withTimeoutOrNull")
/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1<T> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f6679a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> f6680b;

    /* renamed from: c  reason: collision with root package name */
    int f6681c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, c<? super SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1> cVar) {
        super(cVar);
        this.f6680b = pointerEventHandlerCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        this.f6679a = obj;
        this.f6681c |= Integer.MIN_VALUE;
        return this.f6680b.w0(0, (p) null, this);
    }
}
