package e0;

import bp0.k;
import java.util.concurrent.atomic.AtomicReference;
import l0.c;
import l0.d;

/* compiled from: ActualJvm.jvm.kt */
public final class b1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<c> f14163a = new AtomicReference<>(d.a());

    /* renamed from: b  reason: collision with root package name */
    private final Object f14164b = new Object();

    public final T a() {
        return this.f14163a.get().b(Thread.currentThread().getId());
    }

    public final void b(T t) {
        long id2 = Thread.currentThread().getId();
        synchronized (this.f14164b) {
            c cVar = this.f14163a.get();
            if (!cVar.d(id2, t)) {
                this.f14163a.set(cVar.c(id2, t));
                k kVar = k.f22762a;
            }
        }
    }
}
