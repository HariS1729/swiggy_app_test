package i0;

import k0.a;

/* compiled from: PersistentHashMapContentIterators.kt */
public final class z<K, V> extends u<K, V, V> {
    public V next() {
        a.a(g());
        n(f() + 2);
        return d()[f() - 1];
    }
}
