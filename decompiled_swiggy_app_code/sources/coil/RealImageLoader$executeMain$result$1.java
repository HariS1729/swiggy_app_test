package coil;

import android.graphics.Bitmap;
import bp0.k;
import coil.intercept.RealInterceptorChain;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;
import x6.g;
import x6.h;

@d(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {181}, m = "invokeSuspend")
/* compiled from: RealImageLoader.kt */
final class RealImageLoader$executeMain$result$1 extends SuspendLambda implements p<j0, c<? super h>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13399a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f13400b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RealImageLoader f13401c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ y6.g f13402d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m6.c f13403e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Bitmap f13404f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealImageLoader$executeMain$result$1(g gVar, RealImageLoader realImageLoader, y6.g gVar2, m6.c cVar, Bitmap bitmap, c<? super RealImageLoader$executeMain$result$1> cVar2) {
        super(2, cVar2);
        this.f13400b = gVar;
        this.f13401c = realImageLoader;
        this.f13402d = gVar2;
        this.f13403e = cVar;
        this.f13404f = bitmap;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new RealImageLoader$executeMain$result$1(this.f13400b, this.f13401c, this.f13402d, this.f13403e, this.f13404f, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super h> cVar) {
        return ((RealImageLoader$executeMain$result$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f13399a;
        if (i11 == 0) {
            bp0.g.b(obj);
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f13400b, this.f13401c.f13379p, 0, this.f13400b, this.f13402d, this.f13403e, this.f13404f != null);
            g gVar = this.f13400b;
            this.f13399a = 1;
            obj = realInterceptorChain.j(gVar, this);
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
