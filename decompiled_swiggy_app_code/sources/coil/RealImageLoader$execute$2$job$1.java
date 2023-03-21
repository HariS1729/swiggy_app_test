package coil;

import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;
import x6.g;
import x6.h;

@d(c = "coil.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {127}, m = "invokeSuspend")
/* compiled from: RealImageLoader.kt */
final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements p<j0, c<? super h>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13388a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RealImageLoader f13389b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f13390c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealImageLoader$execute$2$job$1(RealImageLoader realImageLoader, g gVar, c<? super RealImageLoader$execute$2$job$1> cVar) {
        super(2, cVar);
        this.f13389b = realImageLoader;
        this.f13390c = gVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new RealImageLoader$execute$2$job$1(this.f13389b, this.f13390c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super h> cVar) {
        return ((RealImageLoader$execute$2$job$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f13388a;
        if (i11 == 0) {
            bp0.g.b(obj);
            RealImageLoader realImageLoader = this.f13389b;
            g gVar = this.f13390c;
            this.f13388a = 1;
            obj = realImageLoader.g(gVar, 1, this);
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
