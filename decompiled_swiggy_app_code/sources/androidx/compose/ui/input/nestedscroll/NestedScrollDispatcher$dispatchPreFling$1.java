package androidx.compose.ui.input.nestedscroll;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {202}, m = "dispatchPreFling-QWom1Mo")
/* compiled from: NestedScrollModifier.kt */
final class NestedScrollDispatcher$dispatchPreFling$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f6610a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NestedScrollDispatcher f6611b;

    /* renamed from: c  reason: collision with root package name */
    int f6612c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPreFling$1(NestedScrollDispatcher nestedScrollDispatcher, c<? super NestedScrollDispatcher$dispatchPreFling$1> cVar) {
        super(cVar);
        this.f6611b = nestedScrollDispatcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.f6610a = obj;
        this.f6612c |= Integer.MIN_VALUE;
        return this.f6611b.c(0, this);
    }
}
