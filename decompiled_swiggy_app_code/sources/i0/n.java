package i0;

import cp0.f;
import g0.e;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMapContentViews.kt */
public final class n<K, V> extends f<Map.Entry<? extends K, ? extends V>> implements e<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: b  reason: collision with root package name */
    private final d<K, V> f14840b;

    public n(d<K, V> dVar) {
        p.j(dVar, "map");
        this.f14840b = dVar;
    }

    public int c() {
        return this.f14840b.size();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return d((Map.Entry) obj);
    }

    public boolean d(Map.Entry<? extends K, ? extends V> entry) {
        p.j(entry, "element");
        V v = this.f14840b.get(entry.getKey());
        if (v != null) {
            return p.e(v, entry.getValue());
        }
        return entry.getValue() == null && this.f14840b.containsKey(entry.getKey());
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new o(this.f14840b.q());
    }
}
