package androidx.compose.runtime;

import bp0.g;
import bp0.k;
import e0.b0;
import e0.c0;
import fp0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import lp0.l;
import wp0.o;

/* compiled from: BroadcastFrameClock.kt */
public final class BroadcastFrameClock implements c0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final lp0.a<k> f5867a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f5868b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Throwable f5869c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List<a<?>> f5870d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<a<?>> f5871e = new ArrayList();

    /* compiled from: BroadcastFrameClock.kt */
    private static final class a<R> {

        /* renamed from: a  reason: collision with root package name */
        private final l<Long, R> f5872a;

        /* renamed from: b  reason: collision with root package name */
        private final c<R> f5873b;

        public a(l<? super Long, ? extends R> lVar, c<? super R> cVar) {
            p.j(lVar, "onFrame");
            p.j(cVar, "continuation");
            this.f5872a = lVar;
            this.f5873b = cVar;
        }

        public final c<R> a() {
            return this.f5873b;
        }

        public final void b(long j) {
            Object obj;
            c<R> cVar = this.f5873b;
            try {
                Result.a aVar = Result.f25582b;
                obj = Result.b(this.f5872a.invoke(Long.valueOf(j)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f25582b;
                obj = Result.b(g.a(th2));
            }
            cVar.resumeWith(obj);
        }
    }

    public BroadcastFrameClock(lp0.a<k> aVar) {
        this.f5867a = aVar;
    }

    /* access modifiers changed from: private */
    public final void i(Throwable th2) {
        synchronized (this.f5868b) {
            if (this.f5869c == null) {
                this.f5869c = th2;
                List<a<?>> list = this.f5870d;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c a11 = list.get(i11).a();
                    Result.a aVar = Result.f25582b;
                    a11.resumeWith(Result.b(g.a(th2)));
                }
                this.f5870d.clear();
                k kVar = k.f22762a;
            }
        }
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

    public final boolean k() {
        boolean z11;
        synchronized (this.f5868b) {
            z11 = !this.f5870d.isEmpty();
        }
        return z11;
    }

    public final void l(long j) {
        synchronized (this.f5868b) {
            List<a<?>> list = this.f5870d;
            this.f5870d = this.f5871e;
            this.f5871e = list;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).b(j);
            }
            list.clear();
            k kVar = k.f22762a;
        }
    }

    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return c0.a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return c0.a.d(this, coroutineContext);
    }

    public <R> Object w0(l<? super Long, ? extends R> lVar, c<? super R> cVar) {
        a aVar;
        o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        oVar.w();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (this.f5868b) {
            Throwable e11 = this.f5869c;
            if (e11 != null) {
                Result.a aVar2 = Result.f25582b;
                oVar.resumeWith(Result.b(g.a(e11)));
            } else {
                ref$ObjectRef.f25666a = new a(lVar, oVar);
                boolean z11 = !this.f5870d.isEmpty();
                List d11 = this.f5870d;
                T t = ref$ObjectRef.f25666a;
                if (t == null) {
                    p.B("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t;
                }
                d11.add(aVar);
                boolean z12 = !z11;
                oVar.N(new BroadcastFrameClock$withFrameNanos$2$1(this, ref$ObjectRef));
                if (z12 && this.f5867a != null) {
                    try {
                        this.f5867a.invoke();
                    } catch (Throwable th2) {
                        i(th2);
                    }
                }
            }
        }
        Object t11 = oVar.t();
        if (t11 == b.d()) {
            f.c(cVar);
        }
        return t11;
    }
}
