package androidx.compose.runtime;

import android.view.Choreographer;
import bp0.g;
import e0.b0;
import e0.c0;
import fp0.c;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import lp0.l;
import lp0.p;
import wp0.h;
import wp0.n;
import wp0.o;
import wp0.u0;

/* compiled from: ActualAndroid.android.kt */
final class DefaultChoreographerFrameClock implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultChoreographerFrameClock f5993a = new DefaultChoreographerFrameClock();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Choreographer f5994b = ((Choreographer) h.e(u0.c().N0(), new DefaultChoreographerFrameClock$choreographer$1((c<? super DefaultChoreographerFrameClock$choreographer$1>) null)));

    /* compiled from: ActualAndroid.android.kt */
    static final class a implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n<R> f5995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<Long, R> f5996b;

        a(n<? super R> nVar, l<? super Long, ? extends R> lVar) {
            this.f5995a = nVar;
            this.f5996b = lVar;
        }

        public final void doFrame(long j) {
            Object obj;
            n<R> nVar = this.f5995a;
            DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f5993a;
            l<Long, R> lVar = this.f5996b;
            try {
                Result.a aVar = Result.f25582b;
                obj = Result.b(lVar.invoke(Long.valueOf(j)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f25582b;
                obj = Result.b(g.a(th2));
            }
            nVar.resumeWith(obj);
        }
    }

    private DefaultChoreographerFrameClock() {
    }

    public <R> R fold(R r11, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return c0.a.a(this, r11, pVar);
    }

    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return c0.a.b(this, bVar);
    }

    public /* synthetic */ CoroutineContext.b getKey() {
        return b0.a(this);
    }

    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return c0.a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return c0.a.d(this, coroutineContext);
    }

    public <R> Object w0(l<? super Long, ? extends R> lVar, c<? super R> cVar) {
        o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        oVar.w();
        a aVar = new a(oVar, lVar);
        f5994b.postFrameCallback(aVar);
        oVar.N(new DefaultChoreographerFrameClock$withFrameNanos$2$1(aVar));
        Object t = oVar.t();
        if (t == b.d()) {
            f.c(cVar);
        }
        return t;
    }
}
