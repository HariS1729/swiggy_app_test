package i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;
import mp0.a;

/* compiled from: PersistentHashMapContentIterators.kt */
public abstract class e<K, V, T> implements Iterator<T>, a {

    /* renamed from: a  reason: collision with root package name */
    private final u<K, V, T>[] f14823a;

    /* renamed from: b  reason: collision with root package name */
    private int f14824b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14825c = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        p.j(tVar, "node");
        p.j(uVarArr, "path");
        this.f14823a = uVarArr;
        uVarArr[0].l(tVar.p(), tVar.m() * 2);
        this.f14824b = 0;
        d();
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void d() {
        if (!this.f14823a[this.f14824b].g()) {
            for (int i11 = this.f14824b; -1 < i11; i11--) {
                int g11 = g(i11);
                if (g11 == -1 && this.f14823a[i11].h()) {
                    this.f14823a[i11].k();
                    g11 = g(i11);
                }
                if (g11 != -1) {
                    this.f14824b = g11;
                    return;
                }
                if (i11 > 0) {
                    this.f14823a[i11 - 1].k();
                }
                this.f14823a[i11].l(t.f14843e.a().p(), 0);
            }
            this.f14825c = false;
        }
    }

    private final int g(int i11) {
        if (this.f14823a[i11].g()) {
            return i11;
        }
        if (!this.f14823a[i11].h()) {
            return -1;
        }
        t<? extends K, ? extends V> c11 = this.f14823a[i11].c();
        if (i11 == 6) {
            this.f14823a[i11 + 1].l(c11.p(), c11.p().length);
        } else {
            this.f14823a[i11 + 1].l(c11.p(), c11.m() * 2);
        }
        return g(i11 + 1);
    }

    /* access modifiers changed from: protected */
    public final K c() {
        b();
        return this.f14823a[this.f14824b].b();
    }

    /* access modifiers changed from: protected */
    public final u<K, V, T>[] f() {
        return this.f14823a;
    }

    /* access modifiers changed from: protected */
    public final void h(int i11) {
        this.f14824b = i11;
    }

    public boolean hasNext() {
        return this.f14825c;
    }

    public T next() {
        b();
        T next = this.f14823a[this.f14824b].next();
        d();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
