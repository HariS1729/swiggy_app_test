package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    c<K, V> f15579a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f15580b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f15581c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f15582d = 0;

    /* compiled from: SafeIterableMap */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f15586d;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f15585c;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    private static class C0146b<K, V> extends e<K, V> {
        C0146b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f15585c;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f15586d;
        }
    }

    /* compiled from: SafeIterableMap */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f15583a;

        /* renamed from: b  reason: collision with root package name */
        final V f15584b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f15585c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f15586d;

        c(K k, V v) {
            this.f15583a = k;
            this.f15584b = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f15583a.equals(cVar.f15583a) || !this.f15584b.equals(cVar.f15584b)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f15583a;
        }

        public V getValue() {
            return this.f15584b;
        }

        public int hashCode() {
            return this.f15583a.hashCode() ^ this.f15584b.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f15583a + "=" + this.f15584b;
        }
    }

    /* compiled from: SafeIterableMap */
    private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private c<K, V> f15587a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f15588b = true;

        d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f15587a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f15586d;
                this.f15587a = cVar3;
                this.f15588b = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f15588b) {
                this.f15588b = false;
                this.f15587a = b.this.f15579a;
            } else {
                c<K, V> cVar = this.f15587a;
                this.f15587a = cVar != null ? cVar.f15585c : null;
            }
            return this.f15587a;
        }

        public boolean hasNext() {
            if (!this.f15588b) {
                c<K, V> cVar = this.f15587a;
                if (cVar == null || cVar.f15585c == null) {
                    return false;
                }
                return true;
            } else if (b.this.f15579a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* compiled from: SafeIterableMap */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f15590a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f15591b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f15590a = cVar2;
            this.f15591b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f15591b;
            c<K, V> cVar2 = this.f15590a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public void a(c<K, V> cVar) {
            if (this.f15590a == cVar && cVar == this.f15591b) {
                this.f15591b = null;
                this.f15590a = null;
            }
            c<K, V> cVar2 = this.f15590a;
            if (cVar2 == cVar) {
                this.f15590a = b(cVar2);
            }
            if (this.f15591b == cVar) {
                this.f15591b = e();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f15591b;
            this.f15591b = e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f15591b != null;
        }
    }

    /* compiled from: SafeIterableMap */
    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> c() {
        return this.f15579a;
    }

    /* access modifiers changed from: protected */
    public c<K, V> d(K k) {
        c<K, V> cVar = this.f15579a;
        while (cVar != null && !cVar.f15583a.equals(k)) {
            cVar = cVar.f15585c;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0146b bVar = new C0146b(this.f15580b, this.f15579a);
        this.f15581c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it2 = iterator();
        Iterator it3 = bVar.iterator();
        while (it2.hasNext() && it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object next = it3.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it2.hasNext() || it3.hasNext()) {
            return false;
        }
        return true;
    }

    public b<K, V>.defpackage.d f() {
        b<K, V>.defpackage.d dVar = new d();
        this.f15581c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> g() {
        return this.f15580b;
    }

    /* access modifiers changed from: protected */
    public c<K, V> h(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f15582d++;
        c<K, V> cVar2 = this.f15580b;
        if (cVar2 == null) {
            this.f15579a = cVar;
            this.f15580b = cVar;
            return cVar;
        }
        cVar2.f15585c = cVar;
        cVar.f15586d = cVar2;
        this.f15580b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it2 = iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            i11 += ((Map.Entry) it2.next()).hashCode();
        }
        return i11;
    }

    public V i(K k, V v) {
        c d11 = d(k);
        if (d11 != null) {
            return d11.f15584b;
        }
        h(k, v);
        return null;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f15579a, this.f15580b);
        this.f15581c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V k(K k) {
        c d11 = d(k);
        if (d11 == null) {
            return null;
        }
        this.f15582d--;
        if (!this.f15581c.isEmpty()) {
            for (f<K, V> a11 : this.f15581c.keySet()) {
                a11.a(d11);
            }
        }
        c<K, V> cVar = d11.f15586d;
        if (cVar != null) {
            cVar.f15585c = d11.f15585c;
        } else {
            this.f15579a = d11.f15585c;
        }
        c<K, V> cVar2 = d11.f15585c;
        if (cVar2 != null) {
            cVar2.f15586d = cVar;
        } else {
            this.f15580b = cVar;
        }
        d11.f15585c = null;
        d11.f15586d = null;
        return d11.f15584b;
    }

    public int size() {
        return this.f15582d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            sb2.append(((Map.Entry) it2.next()).toString());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
