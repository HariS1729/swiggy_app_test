package in.swiggy.android.services;

import androidx.work.ListenableWorker;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "in.swiggy.android.services.OverlaysEventWorker$doWork$2", f = "OverlaysEventWorker.kt", l = {}, m = "invokeSuspend")
/* compiled from: OverlaysEventWorker.kt */
final class OverlaysEventWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super ListenableWorker.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18652a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OverlaysEventWorker f18653b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OverlaysEventWorker$doWork$2(OverlaysEventWorker overlaysEventWorker, c<? super OverlaysEventWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18653b = overlaysEventWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new OverlaysEventWorker$doWork$2(this.f18653b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super ListenableWorker.a> cVar) {
        return ((OverlaysEventWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f18652a == 0) {
            g.b(obj);
            String string = this.f18653b.f18648i.getString("overlay_log_dump", "");
            if (!(string == null || string.length() == 0)) {
                this.f18653b.j.i(this.f18653b.j.c("home_screen", "overlay_inflation", string, -1));
            }
            this.f18653b.f18648i.edit().putString("overlay_log_dump", "").apply();
            return ListenableWorker.a.c();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
