package co.hyperverge.crashguard.services;

import android.content.Context;
import bp0.g;
import bp0.k;
import c5.a;
import co.hyperverge.crashguard.data.models.CrashEvent;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "co.hyperverge.crashguard.services.CrashIntentService$Companion$addWork$1", f = "CrashIntentService.kt", l = {}, m = "invokeSuspend")
/* compiled from: CrashIntentService.kt */
final class CrashIntentService$Companion$addWork$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13147a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f13148b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CrashEvent f13149c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f13150d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f13151e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrashIntentService$Companion$addWork$1(a aVar, CrashEvent crashEvent, boolean z11, Context context, c<? super CrashIntentService$Companion$addWork$1> cVar) {
        super(2, cVar);
        this.f13148b = aVar;
        this.f13149c = crashEvent;
        this.f13150d = z11;
        this.f13151e = context;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new CrashIntentService$Companion$addWork$1(this.f13148b, this.f13149c, this.f13150d, this.f13151e, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((CrashIntentService$Companion$addWork$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f13147a == 0) {
            g.b(obj);
            this.f13148b.c(this.f13149c);
            if (this.f13150d) {
                CrashIntentService.Companion.b(this.f13151e);
            }
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
