package coil;

import bp0.k;
import c7.i;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineStart;
import lp0.p;
import wp0.j0;
import wp0.n0;
import wp0.u0;
import x6.g;
import x6.h;
import z6.b;

@d(c = "coil.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {134}, m = "invokeSuspend")
/* compiled from: RealImageLoader.kt */
final class RealImageLoader$execute$2 extends SuspendLambda implements p<j0, c<? super h>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13384a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f13385b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f13386c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ RealImageLoader f13387d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$2(g gVar, RealImageLoader realImageLoader, c<? super RealImageLoader$execute$2> cVar) {
        super(2, cVar);
        this.f13386c = gVar;
        this.f13387d = realImageLoader;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        RealImageLoader$execute$2 realImageLoader$execute$2 = new RealImageLoader$execute$2(this.f13386c, this.f13387d, cVar);
        realImageLoader$execute$2.f13385b = obj;
        return realImageLoader$execute$2;
    }

    public final Object invoke(j0 j0Var, c<? super h> cVar) {
        return ((RealImageLoader$execute$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f13384a;
        if (i11 == 0) {
            bp0.g.b(obj);
            n0 b11 = j.b((j0) this.f13385b, u0.c().N0(), (CoroutineStart) null, new RealImageLoader$execute$2$job$1(this.f13387d, this.f13386c, (c<? super RealImageLoader$execute$2$job$1>) null), 2, (Object) null);
            if (this.f13386c.M() instanceof b) {
                i.l(((b) this.f13386c.M()).c()).b(b11);
            }
            this.f13384a = 1;
            obj = b11.Q(this);
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
