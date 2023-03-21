package androidx.compose.ui.input.nestedscroll;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {88, 89}, m = "onPreFling-QWom1Mo")
/* compiled from: NestedScrollModifierLocal.kt */
final class NestedScrollModifierLocal$onPreFling$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f6627a;

    /* renamed from: b  reason: collision with root package name */
    long f6628b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f6629c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ NestedScrollModifierLocal f6630d;

    /* renamed from: e  reason: collision with root package name */
    int f6631e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedScrollModifierLocal$onPreFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, c<? super NestedScrollModifierLocal$onPreFling$1> cVar) {
        super(cVar);
        this.f6630d = nestedScrollModifierLocal;
    }

    public final Object invokeSuspend(Object obj) {
        this.f6629c = obj;
        this.f6631e |= Integer.MIN_VALUE;
        return this.f6630d.c(0, this);
    }
}
