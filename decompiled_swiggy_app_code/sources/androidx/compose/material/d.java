package androidx.compose.material;

import bp0.k;
import e0.g;
import lp0.p;
import lp0.q;

/* compiled from: SnackbarHost.kt */
final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f5784a;

    /* renamed from: b  reason: collision with root package name */
    private final q<p<? super g, ? super Integer, k>, g, Integer, k> f5785b;

    public d(T t, q<? super p<? super g, ? super Integer, k>, ? super g, ? super Integer, k> qVar) {
        kotlin.jvm.internal.p.j(qVar, "transition");
        this.f5784a = t;
        this.f5785b = qVar;
    }

    public final T a() {
        return this.f5784a;
    }

    public final q<p<? super g, ? super Integer, k>, g, Integer, k> b() {
        return this.f5785b;
    }

    public final T c() {
        return this.f5784a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.p.e(this.f5784a, dVar.f5784a) && kotlin.jvm.internal.p.e(this.f5785b, dVar.f5785b);
    }

    public int hashCode() {
        T t = this.f5784a;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.f5785b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f5784a + ", transition=" + this.f5785b + ')';
    }
}
