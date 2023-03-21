package in.swiggy.android.services;

import androidx.core.content.a;
import bp0.g;
import bp0.k;
import fp0.c;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.services.ImageCachingUtilWorker$doWork$2", f = "ImageCachingUtilWorker.kt", l = {}, m = "invokeSuspend")
/* compiled from: ImageCachingUtilWorker.kt */
final class ImageCachingUtilWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18641a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<File[]> f18642b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ImageCachingUtilWorker f18643c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ImageCachingUtilWorker$doWork$2(Ref$ObjectRef<File[]> ref$ObjectRef, ImageCachingUtilWorker imageCachingUtilWorker, c<? super ImageCachingUtilWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18642b = ref$ObjectRef;
        this.f18643c = imageCachingUtilWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new ImageCachingUtilWorker$doWork$2(this.f18642b, this.f18643c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((ImageCachingUtilWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f18641a == 0) {
            g.b(obj);
            Ref$ObjectRef<File[]> ref$ObjectRef = this.f18642b;
            Object g11 = a.g(this.f18643c.b());
            kotlin.jvm.internal.p.i(g11, "getExternalCacheDirs(applicationContext)");
            ref$ObjectRef.f25666a = g11;
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
