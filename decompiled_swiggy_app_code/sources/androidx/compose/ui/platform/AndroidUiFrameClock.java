package androidx.compose.ui.platform;

import android.view.Choreographer;
import bp0.g;
import e0.b0;
import e0.c0;
import fp0.c;
import fp0.d;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.p;
import lp0.l;
import wp0.n;
import wp0.o;

/* compiled from: AndroidUiFrameClock.android.kt */
public final class AndroidUiFrameClock implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Choreographer f7089a;

    /* compiled from: AndroidUiFrameClock.android.kt */
    static final class a implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n<R> f7090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AndroidUiFrameClock f7091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<Long, R> f7092c;

        a(n<? super R> nVar, AndroidUiFrameClock androidUiFrameClock, l<? super Long, ? extends R> lVar) {
            this.f7090a = nVar;
            this.f7091b = androidUiFrameClock;
            this.f7092c = lVar;
        }

        public final void doFrame(long j) {
            Object obj;
            n<R> nVar = this.f7090a;
            l<Long, R> lVar = this.f7092c;
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

    public AndroidUiFrameClock(Choreographer choreographer) {
        p.j(choreographer, "choreographer");
        this.f7089a = choreographer;
    }

    public final Choreographer c() {
        return this.f7089a;
    }

    public <R> R fold(R r11, lp0.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
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
        CoroutineContext.a aVar = cVar.getContext().get(d.f23046e0);
        AndroidUiDispatcher androidUiDispatcher = aVar instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) aVar : null;
        o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        oVar.w();
        a aVar2 = new a(oVar, this, lVar);
        if (androidUiDispatcher == null || !p.e(androidUiDispatcher.Z0(), c())) {
            c().postFrameCallback(aVar2);
            oVar.N(new AndroidUiFrameClock$withFrameNanos$2$2(this, aVar2));
        } else {
            androidUiDispatcher.m1(aVar2);
            oVar.N(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, aVar2));
        }
        Object t = oVar.t();
        if (t == b.d()) {
            f.c(cVar);
        }
        return t;
    }
}
