package coil.intercept;

import c7.i;
import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import s6.a;
import wp0.j0;
import x6.g;
import x6.k;
import x6.n;

@d(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {75}, m = "invokeSuspend")
/* compiled from: EngineInterceptor.kt */
final class EngineInterceptor$intercept$2 extends SuspendLambda implements p<j0, c<? super n>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13615a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EngineInterceptor f13616b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f13617c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Object f13618d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k f13619e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ m6.c f13620f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ MemoryCache.Key f13621g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ a.C0186a f13622h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, g gVar, Object obj, k kVar, m6.c cVar, MemoryCache.Key key, a.C0186a aVar, c<? super EngineInterceptor$intercept$2> cVar2) {
        super(2, cVar2);
        this.f13616b = engineInterceptor;
        this.f13617c = gVar;
        this.f13618d = obj;
        this.f13619e = kVar;
        this.f13620f = cVar;
        this.f13621g = key;
        this.f13622h = aVar;
    }

    public final c<bp0.k> create(Object obj, c<?> cVar) {
        return new EngineInterceptor$intercept$2(this.f13616b, this.f13617c, this.f13618d, this.f13619e, this.f13620f, this.f13621g, this.f13622h, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super n> cVar) {
        return ((EngineInterceptor$intercept$2) create(j0Var, cVar)).invokeSuspend(bp0.k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f13615a;
        if (i11 == 0) {
            bp0.g.b(obj);
            EngineInterceptor engineInterceptor = this.f13616b;
            g gVar = this.f13617c;
            Object obj2 = this.f13618d;
            k kVar = this.f13619e;
            m6.c cVar = this.f13620f;
            this.f13615a = 1;
            obj = engineInterceptor.i(gVar, obj2, kVar, cVar, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            bp0.g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        EngineInterceptor.b bVar = (EngineInterceptor.b) obj;
        return new n(bVar.e(), this.f13617c, bVar.c(), this.f13616b.f13569d.h(this.f13621g, this.f13617c, bVar) ? this.f13621g : null, bVar.d(), bVar.f(), i.t(this.f13622h));
    }
}
