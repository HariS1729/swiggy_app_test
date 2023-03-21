package androidx.compose.ui.input.nestedscroll;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {217}, m = "dispatchPostFling-RZ2iAVY")
/* compiled from: NestedScrollModifier.kt */
final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f6607a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NestedScrollDispatcher f6608b;

    /* renamed from: c  reason: collision with root package name */
    int f6609c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, c<? super NestedScrollDispatcher$dispatchPostFling$1> cVar) {
        super(cVar);
        this.f6608b = nestedScrollDispatcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.f6607a = obj;
        this.f6609c |= Integer.MIN_VALUE;
        return this.f6608b.a(0, 0, this);
    }
}
