package in.swiggy.android.tejas.coroutineUtils;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.feature.trackv3.TrackResponseV3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.flow.e;
import lp0.q;

@d(c = "in.swiggy.android.tejas.coroutineUtils.TrackV3FlowUseCase$invoke$1", f = "TrackV3FlowUseCase.kt", l = {21}, m = "invokeSuspend")
/* compiled from: TrackV3FlowUseCase.kt */
final class TrackV3FlowUseCase$invoke$1 extends SuspendLambda implements q<e<? super TrackResponseV3<? extends R>>, Throwable, c<? super k>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    TrackV3FlowUseCase$invoke$1(c<? super TrackV3FlowUseCase$invoke$1> cVar) {
        super(3, cVar);
    }

    public final Object invoke(e<? super TrackResponseV3<? extends R>> eVar, Throwable th2, c<? super k> cVar) {
        TrackV3FlowUseCase$invoke$1 trackV3FlowUseCase$invoke$1 = new TrackV3FlowUseCase$invoke$1(cVar);
        trackV3FlowUseCase$invoke$1.L$0 = eVar;
        trackV3FlowUseCase$invoke$1.L$1 = th2;
        return trackV3FlowUseCase$invoke$1.invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.label;
        if (i11 == 0) {
            g.b(obj);
            TrackResponseV3.OnJobComplete onJobComplete = new TrackResponseV3.OnJobComplete((Throwable) this.L$1);
            this.L$0 = null;
            this.label = 1;
            if (((e) this.L$0).emit(onJobComplete, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
