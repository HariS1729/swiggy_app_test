package androidx.compose.foundation.gestures;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {399}, m = "doFlingAnimation-QWom1Mo")
/* compiled from: Scrollable.kt */
final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3522a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f3523b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f3524c;

    /* renamed from: d  reason: collision with root package name */
    int f3525d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, c<? super ScrollingLogic$doFlingAnimation$1> cVar) {
        super(cVar);
        this.f3524c = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3523b = obj;
        this.f3525d |= Integer.MIN_VALUE;
        return this.f3524c.b(0, this);
    }
}
