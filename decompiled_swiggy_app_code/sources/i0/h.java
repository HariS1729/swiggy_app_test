package i0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final f<K, V> f14836a;

    public h(f<K, V> fVar) {
        p.j(fVar, "builder");
        this.f14836a = fVar;
    }

    public int c() {
        return this.f14836a.size();
    }

    public void clear() {
        this.f14836a.clear();
    }

    public boolean f(Map.Entry<? extends K, ? extends V> entry) {
        p.j(entry, "element");
        V v = this.f14836a.get(entry.getKey());
        if (v != null) {
            return p.e(v, entry.getValue());
        }
        return entry.getValue() == null && this.f14836a.containsKey(entry.getKey());
    }

    public boolean h(Map.Entry<? extends K, ? extends V> entry) {
        p.j(entry, "element");
        return this.f14836a.remove(entry.getKey(), entry.getValue());
    }

    /* renamed from: i */
    public boolean add(Map.Entry<K, V> entry) {
        p.j(entry, "element");
        throw new UnsupportedOperationException();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f14836a);
    }
}
