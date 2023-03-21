package p0;

import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.coroutines.CoroutineContext;
import lp0.p;

/* compiled from: MotionDurationScale.kt */
public interface g extends CoroutineContext.a {

    /* renamed from: i0  reason: collision with root package name */
    public static final b f16039i0 = b.f16040a;

    /* compiled from: MotionDurationScale.kt */
    public static final class a {
        public static <R> R a(g gVar, R r11, p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
            kotlin.jvm.internal.p.j(pVar, "operation");
            return CoroutineContext.a.C0310a.a(gVar, r11, pVar);
        }

        public static <E extends CoroutineContext.a> E b(g gVar, CoroutineContext.b<E> bVar) {
            kotlin.jvm.internal.p.j(bVar, HttpRequest.HEADER_KEY);
            return CoroutineContext.a.C0310a.b(gVar, bVar);
        }

        public static CoroutineContext c(g gVar, CoroutineContext.b<?> bVar) {
            kotlin.jvm.internal.p.j(bVar, HttpRequest.HEADER_KEY);
            return CoroutineContext.a.C0310a.c(gVar, bVar);
        }

        public static CoroutineContext d(g gVar, CoroutineContext coroutineContext) {
            kotlin.jvm.internal.p.j(coroutineContext, LogCategory.CONTEXT);
            return CoroutineContext.a.C0310a.d(gVar, coroutineContext);
        }
    }

    /* compiled from: MotionDurationScale.kt */
    public static final class b implements CoroutineContext.b<g> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f16040a = new b();

        private b() {
        }
    }
}
