package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public class x extends y {

    /* renamed from: f  reason: collision with root package name */
    private final k0 f10128f;

    /* compiled from: LazyField */
    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, x> f10129a;

        public x a() {
            return this.f10129a.getValue();
        }

        public K getKey() {
            return this.f10129a.getKey();
        }

        public Object getValue() {
            x value = this.f10129a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof k0) {
                return this.f10129a.getValue().d((k0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, x> entry) {
            this.f10129a = entry;
        }
    }

    /* compiled from: LazyField */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f10130a;

        public c(Iterator<Map.Entry<K, Object>> it2) {
            this.f10130a = it2;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f10130a.next();
            return next.getValue() instanceof x ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f10130a.hasNext();
        }

        public void remove() {
            this.f10130a.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public k0 f() {
        return c(this.f10128f);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
