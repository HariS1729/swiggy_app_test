package androidx.compose.ui.platform;

import f0.e;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: WeakCache.kt */
public final class u1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e<Reference<T>> f7360a = new e<>(new Reference[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<T> f7361b = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> poll;
        do {
            poll = this.f7361b.poll();
            if (poll != null) {
                this.f7360a.r(poll);
                continue;
            }
        } while (poll != null);
    }

    public final int b() {
        a();
        return this.f7360a.m();
    }

    public final T c() {
        a();
        while (this.f7360a.p()) {
            e<Reference<T>> eVar = this.f7360a;
            T t = eVar.u(eVar.m() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final void d(T t) {
        a();
        this.f7360a.b(new WeakReference(t, this.f7361b));
    }
}
