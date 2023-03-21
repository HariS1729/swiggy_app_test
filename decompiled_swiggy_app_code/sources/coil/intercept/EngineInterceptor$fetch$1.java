package coil.intercept;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import m6.b;
import x6.g;
import x6.k;

@d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {165}, m = "fetch")
/* compiled from: EngineInterceptor.kt */
final class EngineInterceptor$fetch$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f13601a;

    /* renamed from: b  reason: collision with root package name */
    Object f13602b;

    /* renamed from: c  reason: collision with root package name */
    Object f13603c;

    /* renamed from: d  reason: collision with root package name */
    Object f13604d;

    /* renamed from: e  reason: collision with root package name */
    Object f13605e;

    /* renamed from: f  reason: collision with root package name */
    Object f13606f;

    /* renamed from: g  reason: collision with root package name */
    Object f13607g;

    /* renamed from: h  reason: collision with root package name */
    int f13608h;

    /* renamed from: i  reason: collision with root package name */
    /* synthetic */ Object f13609i;
    final /* synthetic */ EngineInterceptor j;
    int k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, c<? super EngineInterceptor$fetch$1> cVar) {
        super(cVar);
        this.j = engineInterceptor;
    }

    public final Object invokeSuspend(Object obj) {
        this.f13609i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.j((b) null, (g) null, (Object) null, (k) null, (m6.c) null, this);
    }
}
