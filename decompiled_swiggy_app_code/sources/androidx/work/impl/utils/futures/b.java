package androidx.work.impl.utils.futures;

/* compiled from: SettableFuture */
public final class b<V> extends AbstractFuture<V> {
    private b() {
    }

    public static <V> b<V> t() {
        return new b<>();
    }

    public boolean p(V v) {
        return super.p(v);
    }

    public boolean q(Throwable th2) {
        return super.q(th2);
    }

    public boolean r(com.google.common.util.concurrent.b<? extends V> bVar) {
        return super.r(bVar);
    }
}
