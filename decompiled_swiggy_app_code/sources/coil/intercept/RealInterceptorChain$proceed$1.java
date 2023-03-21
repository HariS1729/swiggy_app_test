package coil.intercept;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import x6.g;

@d(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {25}, m = "proceed")
/* compiled from: RealInterceptorChain.kt */
final class RealInterceptorChain$proceed$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f13640a;

    /* renamed from: b  reason: collision with root package name */
    Object f13641b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f13642c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ RealInterceptorChain f13643d;

    /* renamed from: e  reason: collision with root package name */
    int f13644e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealInterceptorChain$proceed$1(RealInterceptorChain realInterceptorChain, c<? super RealInterceptorChain$proceed$1> cVar) {
        super(cVar);
        this.f13643d = realInterceptorChain;
    }

    public final Object invokeSuspend(Object obj) {
        this.f13642c = obj;
        this.f13644e |= Integer.MIN_VALUE;
        return this.f13643d.j((g) null, this);
    }
}
