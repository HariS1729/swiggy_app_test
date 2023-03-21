package in.swiggy.android.services;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.services.ImageCachingUtilWorker", f = "ImageCachingUtilWorker.kt", l = {48}, m = "doWork")
/* compiled from: ImageCachingUtilWorker.kt */
final class ImageCachingUtilWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f18636a;

    /* renamed from: b  reason: collision with root package name */
    Object f18637b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f18638c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ImageCachingUtilWorker f18639d;

    /* renamed from: e  reason: collision with root package name */
    int f18640e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ImageCachingUtilWorker$doWork$1(ImageCachingUtilWorker imageCachingUtilWorker, c<? super ImageCachingUtilWorker$doWork$1> cVar) {
        super(cVar);
        this.f18639d = imageCachingUtilWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18638c = obj;
        this.f18640e |= Integer.MIN_VALUE;
        return this.f18639d.w(this);
    }
}
