package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncDifferConfig */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11298a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11299b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f<T> f11300c;

    /* compiled from: AsyncDifferConfig */
    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        private static final Object f11301d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private static Executor f11302e;

        /* renamed from: a  reason: collision with root package name */
        private Executor f11303a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f11304b;

        /* renamed from: c  reason: collision with root package name */
        private final h.f<T> f11305c;

        public a(h.f<T> fVar) {
            this.f11305c = fVar;
        }

        public c<T> a() {
            if (this.f11304b == null) {
                synchronized (f11301d) {
                    if (f11302e == null) {
                        f11302e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f11304b = f11302e;
            }
            return new c<>(this.f11303a, this.f11304b, this.f11305c);
        }
    }

    c(Executor executor, Executor executor2, h.f<T> fVar) {
        this.f11298a = executor;
        this.f11299b = executor2;
        this.f11300c = fVar;
    }

    public Executor a() {
        return this.f11299b;
    }

    public h.f<T> b() {
        return this.f11300c;
    }

    public Executor c() {
        return this.f11298a;
    }
}
