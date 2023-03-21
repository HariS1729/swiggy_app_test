package i0;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.x;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public class g<K, V, T> extends e<K, V, T> {

    /* renamed from: d  reason: collision with root package name */
    private final f<K, V> f14832d;

    /* renamed from: e  reason: collision with root package name */
    private K f14833e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14834f;

    /* renamed from: g  reason: collision with root package name */
    private int f14835g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.k(), uVarArr);
        p.j(fVar, "builder");
        p.j(uVarArr, "path");
        this.f14832d = fVar;
        this.f14835g = fVar.h();
    }

    private final void i() {
        if (this.f14832d.h() != this.f14835g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (!this.f14834f) {
            throw new IllegalStateException();
        }
    }

    private final void l(int i11, t<?, ?> tVar, K k, int i12) {
        int i13 = i12 * 5;
        if (i13 > 30) {
            f()[i12].m(tVar.p(), tVar.p().length, 0);
            while (!p.e(f()[i12].b(), k)) {
                f()[i12].i();
            }
            h(i12);
            return;
        }
        int f11 = 1 << x.f(i11, i13);
        if (tVar.q(f11)) {
            f()[i12].m(tVar.p(), tVar.m() * 2, tVar.n(f11));
            h(i12);
            return;
        }
        int O = tVar.O(f11);
        t<?, ?> N = tVar.N(O);
        f()[i12].m(tVar.p(), tVar.m() * 2, O);
        l(i11, N, k, i12 + 1);
    }

    public final void m(K k, V v) {
        if (this.f14832d.containsKey(k)) {
            if (hasNext()) {
                Object c11 = c();
                this.f14832d.put(k, v);
                l(c11 != null ? c11.hashCode() : 0, this.f14832d.k(), c11, 0);
            } else {
                this.f14832d.put(k, v);
            }
            this.f14835g = this.f14832d.h();
        }
    }

    public T next() {
        i();
        this.f14833e = c();
        this.f14834f = true;
        return super.next();
    }

    public void remove() {
        k();
        if (hasNext()) {
            Object c11 = c();
            x.d(this.f14832d).remove(this.f14833e);
            l(c11 != null ? c11.hashCode() : 0, this.f14832d.k(), c11, 0);
        } else {
            x.d(this.f14832d).remove(this.f14833e);
        }
        this.f14833e = null;
        this.f14834f = false;
        this.f14835g = this.f14832d.h();
    }
}
