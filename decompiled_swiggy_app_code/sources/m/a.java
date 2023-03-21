package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f15578e = new HashMap<>();

    public boolean contains(K k) {
        return this.f15578e.containsKey(k);
    }

    /* access modifiers changed from: protected */
    public b.c<K, V> d(K k) {
        return this.f15578e.get(k);
    }

    public V i(K k, V v) {
        b.c d11 = d(k);
        if (d11 != null) {
            return d11.f15584b;
        }
        this.f15578e.put(k, h(k, v));
        return null;
    }

    public V k(K k) {
        V k11 = super.k(k);
        this.f15578e.remove(k);
        return k11;
    }

    public Map.Entry<K, V> l(K k) {
        if (contains(k)) {
            return this.f15578e.get(k).f15586d;
        }
        return null;
    }
}
