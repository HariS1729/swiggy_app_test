package coil;

import bp0.k;
import c7.q;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;
import x6.g;
import x6.h;

@d(c = "coil.RealImageLoader$enqueue$job$1", f = "RealImageLoader.kt", l = {111}, m = "invokeSuspend")
/* compiled from: RealImageLoader.kt */
final class RealImageLoader$enqueue$job$1 extends SuspendLambda implements p<j0, c<? super h>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13381a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RealImageLoader f13382b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f13383c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealImageLoader$enqueue$job$1(RealImageLoader realImageLoader, g gVar, c<? super RealImageLoader$enqueue$job$1> cVar) {
        super(2, cVar);
        this.f13382b = realImageLoader;
        this.f13383c = gVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new RealImageLoader$enqueue$job$1(this.f13382b, this.f13383c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super h> cVar) {
        return ((RealImageLoader$enqueue$job$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        q i11;
        Object d11 = b.d();
        int i12 = this.f13381a;
        if (i12 == 0) {
            bp0.g.b(obj);
            RealImageLoader realImageLoader = this.f13382b;
            g gVar = this.f13383c;
            this.f13381a = 1;
            obj = realImageLoader.g(gVar, 0, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i12 == 1) {
            bp0.g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        RealImageLoader realImageLoader2 = this.f13382b;
        h hVar = (h) obj;
        if ((hVar instanceof x6.d) && (i11 = realImageLoader2.i()) != null) {
            c7.g.a(i11, "RealImageLoader", ((x6.d) hVar).c());
        }
        return obj;
    }
}
