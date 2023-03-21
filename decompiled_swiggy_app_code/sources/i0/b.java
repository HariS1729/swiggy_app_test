package i0;

import java.util.Map;
import kotlin.jvm.internal.p;
import mp0.a;

/* compiled from: PersistentHashMapContentIterators.kt */
public class b<K, V> implements Map.Entry<K, V>, a {

    /* renamed from: a  reason: collision with root package name */
    private final K f14815a;

    /* renamed from: b  reason: collision with root package name */
    private final V f14816b;

    public b(K k, V v) {
        this.f14815a = k;
        this.f14816b = v;
    }

    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && p.e(entry.getKey(), getKey()) && p.e(entry.getValue(), getValue());
    }

    public K getKey() {
        return this.f14815a;
    }

    public V getValue() {
        return this.f14816b;
    }

    public int hashCode() {
        Object key = getKey();
        int i11 = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i11 = value.hashCode();
        }
        return hashCode ^ i11;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
