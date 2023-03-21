package i0;

import k0.a;

/* compiled from: PersistentHashMapContentIterators.kt */
public final class w<K, V> extends u<K, V, K> {
    public K next() {
        a.a(g());
        n(f() + 2);
        return d()[f() - 2];
    }
}
