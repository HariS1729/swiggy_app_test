package i0;

import java.util.Map;
import k0.a;

/* compiled from: PersistentHashMapContentIterators.kt */
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    /* renamed from: o */
    public Map.Entry<K, V> next() {
        a.a(g());
        n(f() + 2);
        return new b(d()[f() - 2], d()[f() - 1]);
    }
}
