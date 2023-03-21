package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {625}, m = "withTimeout")
/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1<T> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f6672a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f6673b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> f6674c;

    /* renamed from: d  reason: collision with root package name */
    int f6675d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, c<? super SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1> cVar) {
        super(cVar);
        this.f6674c = pointerEventHandlerCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        this.f6673b = obj;
        this.f6675d |= Integer.MIN_VALUE;
        return this.f6674c.C(0, (p) null, this);
    }
}
