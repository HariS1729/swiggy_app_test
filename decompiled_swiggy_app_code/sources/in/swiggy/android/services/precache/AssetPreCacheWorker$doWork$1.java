package in.swiggy.android.services.precache;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.precache.AssetPreCacheWorker", f = "AssetPreCacheWorker.kt", l = {76}, m = "doWork")
/* compiled from: AssetPreCacheWorker.kt */
final class AssetPreCacheWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f18716a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f18717b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AssetPreCacheWorker f18718c;

    /* renamed from: d  reason: collision with root package name */
    int f18719d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AssetPreCacheWorker$doWork$1(AssetPreCacheWorker assetPreCacheWorker, c<? super AssetPreCacheWorker$doWork$1> cVar) {
        super(cVar);
        this.f18718c = assetPreCacheWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18717b = obj;
        this.f18719d |= Integer.MIN_VALUE;
        return this.f18718c.w(this);
    }
}
