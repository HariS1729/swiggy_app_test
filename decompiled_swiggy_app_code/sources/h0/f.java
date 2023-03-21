package h0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.p;

/* compiled from: PersistentVectorMutableIterator.kt */
public final class f<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final PersistentVectorBuilder<T> f14757c;

    /* renamed from: d  reason: collision with root package name */
    private int f14758d;

    /* renamed from: e  reason: collision with root package name */
    private i<? extends T> f14759e;

    /* renamed from: f  reason: collision with root package name */
    private int f14760f = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(PersistentVectorBuilder<T> persistentVectorBuilder, int i11) {
        super(i11, persistentVectorBuilder.size());
        p.j(persistentVectorBuilder, "builder");
        this.f14757c = persistentVectorBuilder;
        this.f14758d = persistentVectorBuilder.i();
        m();
    }

    private final void i() {
        if (this.f14758d != this.f14757c.i()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (this.f14760f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void l() {
        h(this.f14757c.size());
        this.f14758d = this.f14757c.i();
        this.f14760f = -1;
        m();
    }

    private final void m() {
        Object[] k = this.f14757c.k();
        if (k == null) {
            this.f14759e = null;
            return;
        }
        int d11 = j.d(this.f14757c.size());
        int i11 = l.i(d(), d11);
        int l11 = (this.f14757c.l() / 5) + 1;
        i<? extends T> iVar = this.f14759e;
        if (iVar == null) {
            this.f14759e = new i<>(k, i11, d11, l11);
            return;
        }
        p.g(iVar);
        iVar.m(k, i11, d11, l11);
    }

    public void add(T t) {
        i();
        this.f14757c.add(d(), t);
        g(d() + 1);
        l();
    }

    public T next() {
        i();
        b();
        this.f14760f = d();
        i<? extends T> iVar = this.f14759e;
        if (iVar == null) {
            T[] m11 = this.f14757c.m();
            int d11 = d();
            g(d11 + 1);
            return m11[d11];
        } else if (iVar.hasNext()) {
            g(d() + 1);
            return iVar.next();
        } else {
            T[] m12 = this.f14757c.m();
            int d12 = d();
            g(d12 + 1);
            return m12[d12 - iVar.f()];
        }
    }

    public T previous() {
        i();
        c();
        this.f14760f = d() - 1;
        i<? extends T> iVar = this.f14759e;
        if (iVar == null) {
            T[] m11 = this.f14757c.m();
            g(d() - 1);
            return m11[d()];
        } else if (d() > iVar.f()) {
            T[] m12 = this.f14757c.m();
            g(d() - 1);
            return m12[d() - iVar.f()];
        } else {
            g(d() - 1);
            return iVar.previous();
        }
    }

    public void remove() {
        i();
        k();
        this.f14757c.remove(this.f14760f);
        if (this.f14760f < d()) {
            g(this.f14760f);
        }
        l();
    }

    public void set(T t) {
        i();
        k();
        this.f14757c.set(this.f14760f, t);
        this.f14758d = this.f14757c.i();
        m();
    }
}
