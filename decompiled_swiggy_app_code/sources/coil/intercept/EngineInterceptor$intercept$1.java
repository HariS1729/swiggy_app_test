package coil.intercept;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import s6.a;

@d(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {73}, m = "intercept")
/* compiled from: EngineInterceptor.kt */
final class EngineInterceptor$intercept$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f13610a;

    /* renamed from: b  reason: collision with root package name */
    Object f13611b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f13612c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ EngineInterceptor f13613d;

    /* renamed from: e  reason: collision with root package name */
    int f13614e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EngineInterceptor$intercept$1(EngineInterceptor engineInterceptor, c<? super EngineInterceptor$intercept$1> cVar) {
        super(cVar);
        this.f13613d = engineInterceptor;
    }

    public final Object invokeSuspend(Object obj) {
        this.f13612c = obj;
        this.f13614e |= Integer.MIN_VALUE;
        return this.f13613d.a((a.C0186a) null, this);
    }
}
