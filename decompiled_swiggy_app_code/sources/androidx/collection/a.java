package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: ArrayMap */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    a<K, V>.defpackage.a f2348h;

    /* renamed from: i  reason: collision with root package name */
    a<K, V>.defpackage.c f2349i;
    a<K, V>.defpackage.e j;

    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayMap */
    final class C0015a extends AbstractSet<Map.Entry<K, V>> {
        C0015a() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public int size() {
            return a.this.f2386c;
        }
    }

    /* compiled from: ArrayMap */
    final class b extends d<K> {
        b() {
            super(a.this.f2386c);
        }

        /* access modifiers changed from: protected */
        public K a(int i11) {
            return a.this.m(i11);
        }

        /* access modifiers changed from: protected */
        public void b(int i11) {
            a.this.o(i11);
        }
    }

    /* compiled from: ArrayMap */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        int f2353a;

        /* renamed from: b  reason: collision with root package name */
        int f2354b = -1;

        /* renamed from: c  reason: collision with root package name */
        boolean f2355c;

        d() {
            this.f2353a = a.this.f2386c - 1;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f2354b++;
                this.f2355c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f2355c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!c.c(entry.getKey(), a.this.m(this.f2354b)) || !c.c(entry.getValue(), a.this.q(this.f2354b))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f2355c) {
                return a.this.m(this.f2354b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f2355c) {
                return a.this.q(this.f2354b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f2354b < this.f2353a;
        }

        public int hashCode() {
            int i11;
            if (this.f2355c) {
                Object m11 = a.this.m(this.f2354b);
                Object q = a.this.q(this.f2354b);
                int i12 = 0;
                if (m11 == null) {
                    i11 = 0;
                } else {
                    i11 = m11.hashCode();
                }
                if (q != null) {
                    i12 = q.hashCode();
                }
                return i11 ^ i12;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f2355c) {
                a.this.o(this.f2354b);
                this.f2354b--;
                this.f2353a--;
                this.f2355c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f2355c) {
                return a.this.p(this.f2354b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap */
    final class f extends d<V> {
        f() {
            super(a.this.f2386c);
        }

        /* access modifiers changed from: protected */
        public V a(int i11) {
            return a.this.q(i11);
        }

        /* access modifiers changed from: protected */
        public void b(int i11) {
            a.this.o(i11);
        }
    }

    public a() {
    }

    static <T> boolean s(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.defpackage.a aVar = this.f2348h;
        if (aVar != null) {
            return aVar;
        }
        a<K, V>.defpackage.a aVar2 = new C0015a();
        this.f2348h = aVar2;
        return aVar2;
    }

    public Set<K> keySet() {
        a<K, V>.defpackage.c cVar = this.f2349i;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.defpackage.c cVar2 = new c();
        this.f2349i = cVar2;
        return cVar2;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        d(this.f2386c + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public boolean r(Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public boolean t(Collection<?> collection) {
        int i11 = this.f2386c;
        for (Object remove : collection) {
            remove(remove);
        }
        return i11 != this.f2386c;
    }

    public boolean u(Collection<?> collection) {
        int i11 = this.f2386c;
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            if (!collection.contains(m(i12))) {
                o(i12);
            }
        }
        return i11 != this.f2386c;
    }

    /* access modifiers changed from: package-private */
    public <T> T[] v(T[] tArr, int i11) {
        int i12 = this.f2386c;
        if (tArr.length < i12) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i12);
        }
        for (int i13 = 0; i13 < i12; i13++) {
            tArr[i13] = this.f2385b[(i13 << 1) + i11];
        }
        if (tArr.length > i12) {
            tArr[i12] = null;
        }
        return tArr;
    }

    public Collection<V> values() {
        a<K, V>.defpackage.e eVar = this.j;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.defpackage.e eVar2 = new e();
        this.j = eVar2;
        return eVar2;
    }

    public a(int i11) {
        super(i11);
    }

    /* compiled from: ArrayMap */
    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            a.this.clear();
        }

        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return a.this.r(collection);
        }

        public boolean equals(Object obj) {
            return a.s(this, obj);
        }

        public int hashCode() {
            int i11;
            int i12 = 0;
            for (int i13 = a.this.f2386c - 1; i13 >= 0; i13--) {
                Object m11 = a.this.m(i13);
                if (m11 == null) {
                    i11 = 0;
                } else {
                    i11 = m11.hashCode();
                }
                i12 += i11;
            }
            return i12;
        }

        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new b();
        }

        public boolean remove(Object obj) {
            int h11 = a.this.h(obj);
            if (h11 < 0) {
                return false;
            }
            a.this.o(h11);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return a.this.t(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return a.this.u(collection);
        }

        public int size() {
            return a.this.f2386c;
        }

        public Object[] toArray() {
            int i11 = a.this.f2386c;
            Object[] objArr = new Object[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = a.this.m(i12);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            return a.this.v(tArr, 0);
        }
    }

    /* compiled from: ArrayMap */
    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            a.this.clear();
        }

        public boolean contains(Object obj) {
            return a.this.l(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new f();
        }

        public boolean remove(Object obj) {
            int l11 = a.this.l(obj);
            if (l11 < 0) {
                return false;
            }
            a.this.o(l11);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i11 = a.this.f2386c;
            int i12 = 0;
            boolean z11 = false;
            while (i12 < i11) {
                if (collection.contains(a.this.q(i12))) {
                    a.this.o(i12);
                    i12--;
                    i11--;
                    z11 = true;
                }
                i12++;
            }
            return z11;
        }

        public boolean retainAll(Collection<?> collection) {
            int i11 = a.this.f2386c;
            int i12 = 0;
            boolean z11 = false;
            while (i12 < i11) {
                if (!collection.contains(a.this.q(i12))) {
                    a.this.o(i12);
                    i12--;
                    i11--;
                    z11 = true;
                }
                i12++;
            }
            return z11;
        }

        public int size() {
            return a.this.f2386c;
        }

        public Object[] toArray() {
            int i11 = a.this.f2386c;
            Object[] objArr = new Object[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                objArr[i12] = a.this.q(i12);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            return a.this.v(tArr, 1);
        }
    }

    public a(g gVar) {
        super(gVar);
    }
}
