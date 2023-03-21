package i0;

import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.p;
import mp0.a;

/* compiled from: PersistentHashMapContentIterators.kt */
public abstract class u<K, V, T> implements Iterator<T>, a {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f14851a = t.f14843e.a().p();

    /* renamed from: b  reason: collision with root package name */
    private int f14852b;

    /* renamed from: c  reason: collision with root package name */
    private int f14853c;

    public final K b() {
        k0.a.a(g());
        return this.f14851a[this.f14853c];
    }

    public final t<? extends K, ? extends V> c() {
        k0.a.a(h());
        Object obj = this.f14851a[this.f14853c];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    /* access modifiers changed from: protected */
    public final Object[] d() {
        return this.f14851a;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return this.f14853c;
    }

    public final boolean g() {
        return this.f14853c < this.f14852b;
    }

    public final boolean h() {
        k0.a.a(this.f14853c >= this.f14852b);
        if (this.f14853c < this.f14851a.length) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return g();
    }

    public final void i() {
        k0.a.a(g());
        this.f14853c += 2;
    }

    public final void k() {
        k0.a.a(h());
        this.f14853c++;
    }

    public final void l(Object[] objArr, int i11) {
        p.j(objArr, "buffer");
        m(objArr, i11, 0);
    }

    public final void m(Object[] objArr, int i11, int i12) {
        p.j(objArr, "buffer");
        this.f14851a = objArr;
        this.f14852b = i11;
        this.f14853c = i12;
    }

    /* access modifiers changed from: protected */
    public final void n(int i11) {
        this.f14853c = i11;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
