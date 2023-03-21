package in.swiggy.android.services.precache;

import android.content.Context;
import bp0.g;
import bp0.k;
import fp0.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import vf0.a;
import vf0.b;
import wp0.j0;

@d(c = "in.swiggy.android.services.precache.AssetPreCacheWorker$doWork$2", f = "AssetPreCacheWorker.kt", l = {}, m = "invokeSuspend")
/* compiled from: AssetPreCacheWorker.kt */
final class AssetPreCacheWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18720a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f18721b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AssetPreCacheWorker f18722c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AssetPreCacheWorker$doWork$2(a aVar, AssetPreCacheWorker assetPreCacheWorker, c<? super AssetPreCacheWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18721b = aVar;
        this.f18722c = assetPreCacheWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new AssetPreCacheWorker$doWork$2(this.f18721b, this.f18722c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((AssetPreCacheWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f18720a == 0) {
            g.b(obj);
            List<b> a11 = this.f18721b.a();
            AssetPreCacheWorker assetPreCacheWorker = this.f18722c;
            for (b a12 : a11) {
                tf0.b E = assetPreCacheWorker.j;
                Context b11 = assetPreCacheWorker.b();
                kotlin.jvm.internal.p.i(b11, "applicationContext");
                E.a(b11, a12);
            }
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
