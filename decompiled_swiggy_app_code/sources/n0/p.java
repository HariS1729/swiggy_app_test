package n0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import mp0.e;

/* compiled from: SnapshotStateMap.kt */
final class p<K, V> extends q<K, V> implements Iterator<Map.Entry<K, V>>, mp0.a {

    /* compiled from: SnapshotStateMap.kt */
    public static final class a implements Map.Entry<K, V>, e.a {

        /* renamed from: a  reason: collision with root package name */
        private final K f15749a;

        /* renamed from: b  reason: collision with root package name */
        private V f15750b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<K, V> f15751c;

        a(p<K, V> pVar) {
            this.f15751c = pVar;
            Map.Entry<K, V> d11 = pVar.d();
            kotlin.jvm.internal.p.g(d11);
            this.f15749a = d11.getKey();
            Map.Entry<K, V> d12 = pVar.d();
            kotlin.jvm.internal.p.g(d12);
            this.f15750b = d12.getValue();
        }

        public void a(V v) {
            this.f15750b = v;
        }

        public K getKey() {
            return this.f15749a;
        }

        public V getValue() {
            return this.f15750b;
        }

        public V setValue(V v) {
            p<K, V> pVar = this.f15751c;
            if (pVar.f().g() == pVar.f15754c) {
                V value = getValue();
                pVar.f().put(getKey(), v);
                a(v);
                return value;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(n<K, V> nVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        super(nVar, it2);
        kotlin.jvm.internal.p.j(nVar, "map");
        kotlin.jvm.internal.p.j(it2, "iterator");
    }

    /* renamed from: h */
    public Map.Entry<K, V> next() {
        c();
        if (d() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
