package e0;

import fp0.c;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.coroutines.CoroutineContext;
import lp0.l;
import lp0.p;

/* compiled from: MonotonicFrameClock.kt */
public interface c0 extends CoroutineContext.a {

    /* renamed from: b0  reason: collision with root package name */
    public static final b f14166b0 = b.f14167a;

    /* compiled from: MonotonicFrameClock.kt */
    public static final class a {
        public static <R> R a(c0 c0Var, R r11, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            kotlin.jvm.internal.p.j(pVar, "operation");
            return CoroutineContext.a.C0310a.a(c0Var, r11, pVar);
        }

        public static <E extends CoroutineContext.a> E b(c0 c0Var, CoroutineContext.b<E> bVar) {
            kotlin.jvm.internal.p.j(bVar, HttpRequest.HEADER_KEY);
            return CoroutineContext.a.C0310a.b(c0Var, bVar);
        }

        public static CoroutineContext c(c0 c0Var, CoroutineContext.b<?> bVar) {
            kotlin.jvm.internal.p.j(bVar, HttpRequest.HEADER_KEY);
            return CoroutineContext.a.C0310a.c(c0Var, bVar);
        }

        public static CoroutineContext d(c0 c0Var, CoroutineContext coroutineContext) {
            kotlin.jvm.internal.p.j(coroutineContext, LogCategory.CONTEXT);
            return CoroutineContext.a.C0310a.d(c0Var, coroutineContext);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    public static final class b implements CoroutineContext.b<c0> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f14167a = new b();

        private b() {
        }
    }

    <R> Object w0(l<? super Long, ? extends R> lVar, c<? super R> cVar);
}
