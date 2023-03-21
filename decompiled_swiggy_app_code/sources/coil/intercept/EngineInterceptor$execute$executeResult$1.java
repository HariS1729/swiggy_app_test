package coil.intercept;

import coil.intercept.EngineInterceptor;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import lp0.p;
import m6.b;
import r6.g;
import wp0.j0;
import x6.k;

@d(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {127}, m = "invokeSuspend")
/* compiled from: EngineInterceptor.kt */
final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements p<j0, c<? super EngineInterceptor.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13593a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EngineInterceptor f13594b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<g> f13595c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<b> f13596d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ x6.g f13597e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Object f13598f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<k> f13599g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ m6.c f13600h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref$ObjectRef<g> ref$ObjectRef, Ref$ObjectRef<b> ref$ObjectRef2, x6.g gVar, Object obj, Ref$ObjectRef<k> ref$ObjectRef3, m6.c cVar, c<? super EngineInterceptor$execute$executeResult$1> cVar2) {
        super(2, cVar2);
        this.f13594b = engineInterceptor;
        this.f13595c = ref$ObjectRef;
        this.f13596d = ref$ObjectRef2;
        this.f13597e = gVar;
        this.f13598f = obj;
        this.f13599g = ref$ObjectRef3;
        this.f13600h = cVar;
    }

    public final c<bp0.k> create(Object obj, c<?> cVar) {
        return new EngineInterceptor$execute$executeResult$1(this.f13594b, this.f13595c, this.f13596d, this.f13597e, this.f13598f, this.f13599g, this.f13600h, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super EngineInterceptor.b> cVar) {
        return ((EngineInterceptor$execute$executeResult$1) create(j0Var, cVar)).invokeSuspend(bp0.k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f13593a;
        if (i11 == 0) {
            bp0.g.b(obj);
            EngineInterceptor engineInterceptor = this.f13594b;
            m6.c cVar = this.f13600h;
            this.f13593a = 1;
            obj = engineInterceptor.h((r6.k) this.f13595c.f25666a, (b) this.f13596d.f25666a, this.f13597e, this.f13598f, (k) this.f13599g.f25666a, cVar, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            bp0.g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
