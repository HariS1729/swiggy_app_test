package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
class b1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f9954a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<b1<K, V>.defpackage.e> f9955b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f9956c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9957d;

    /* renamed from: e  reason: collision with root package name */
    private volatile b1<K, V>.defpackage.g f9958e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f9959f;

    /* renamed from: g  reason: collision with root package name */
    private volatile b1<K, V>.defpackage.c f9960g;

    /* compiled from: SmallSortedMap */
    static class a extends b1<FieldDescriptorType, Object> {
        a(int i11) {
            super(i11, (a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return b1.super.put((s.b) obj, obj2);
        }

        public void t() {
            if (!s()) {
                for (int i11 = 0; i11 < o(); i11++) {
                    Map.Entry n = n(i11);
                    if (((s.b) n.getKey()).isRepeated()) {
                        n.setValue(Collections.unmodifiableList((List) n.getValue()));
                    }
                }
                for (Map.Entry entry : q()) {
                    if (((s.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            b1.super.t();
        }
    }

    /* compiled from: SmallSortedMap */
    private class c extends b1<K, V>.defpackage.g {
        private c() {
            super(b1.this, (a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(b1.this, (a) null);
        }

        /* synthetic */ c(b1 b1Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap */
    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f9965a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f9966b = new b();

        /* compiled from: SmallSortedMap */
        static class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap */
        static class b implements Iterable<Object> {
            b() {
            }

            public Iterator<Object> iterator() {
                return d.f9965a;
            }
        }

        static <T> Iterable<T> b() {
            return f9966b;
        }
    }

    /* compiled from: SmallSortedMap */
    private class e implements Map.Entry<K, V>, Comparable<b1<K, V>.defpackage.e> {

        /* renamed from: a  reason: collision with root package name */
        private final K f9967a;

        /* renamed from: b  reason: collision with root package name */
        private V f9968b;

        e(b1 b1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(b1<K, V>.defpackage.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!c(this.f9967a, entry.getKey()) || !c(this.f9968b, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f9968b;
        }

        /* renamed from: h */
        public K getKey() {
            return this.f9967a;
        }

        public int hashCode() {
            K k = this.f9967a;
            int i11 = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f9968b;
            if (v != null) {
                i11 = v.hashCode();
            }
            return hashCode ^ i11;
        }

        public V setValue(V v) {
            b1.this.k();
            V v11 = this.f9968b;
            this.f9968b = v;
            return v11;
        }

        public String toString() {
            return this.f9967a + "=" + this.f9968b;
        }

        e(K k, V v) {
            this.f9967a = k;
            this.f9968b = v;
        }
    }

    /* compiled from: SmallSortedMap */
    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            b1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            b1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = b1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(b1.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            b1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return b1.this.size();
        }

        /* synthetic */ g(b1 b1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ b1(int i11, a aVar) {
        this(i11);
    }

    private int h(K k) {
        int size = this.f9955b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f9955b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            int compareTo2 = k.compareTo(this.f9955b.get(i12).getKey());
            if (compareTo2 < 0) {
                size = i12 - 1;
            } else if (compareTo2 <= 0) {
                return i12;
            } else {
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* access modifiers changed from: private */
    public void k() {
        if (this.f9957d) {
            throw new UnsupportedOperationException();
        }
    }

    private void m() {
        k();
        if (this.f9955b.isEmpty() && !(this.f9955b instanceof ArrayList)) {
            this.f9955b = new ArrayList(this.f9954a);
        }
    }

    private SortedMap<K, V> r() {
        k();
        if (this.f9956c.isEmpty() && !(this.f9956c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9956c = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f9959f = treeMap.descendingMap();
        }
        return (SortedMap) this.f9956c;
    }

    static <FieldDescriptorType extends s.b<FieldDescriptorType>> b1<FieldDescriptorType, Object> u(int i11) {
        return new a(i11);
    }

    /* access modifiers changed from: private */
    public V w(int i11) {
        k();
        V value = this.f9955b.remove(i11).getValue();
        if (!this.f9956c.isEmpty()) {
            Iterator it2 = r().entrySet().iterator();
            this.f9955b.add(new e(this, (Map.Entry) it2.next()));
            it2.remove();
        }
        return value;
    }

    public void clear() {
        k();
        if (!this.f9955b.isEmpty()) {
            this.f9955b.clear();
        }
        if (!this.f9956c.isEmpty()) {
            this.f9956c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f9956c.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f9958e == null) {
            this.f9958e = new g(this, (a) null);
        }
        return this.f9958e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return super.equals(obj);
        }
        b1 b1Var = (b1) obj;
        int size = size();
        if (size != b1Var.size()) {
            return false;
        }
        int o11 = o();
        if (o11 != b1Var.o()) {
            return entrySet().equals(b1Var.entrySet());
        }
        for (int i11 = 0; i11 < o11; i11++) {
            if (!n(i11).equals(b1Var.n(i11))) {
                return false;
            }
        }
        if (o11 != size) {
            return this.f9956c.equals(b1Var.f9956c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h11 = h(comparable);
        if (h11 >= 0) {
            return this.f9955b.get(h11).getValue();
        }
        return this.f9956c.get(comparable);
    }

    public int hashCode() {
        int o11 = o();
        int i11 = 0;
        for (int i12 = 0; i12 < o11; i12++) {
            i11 += this.f9955b.get(i12).hashCode();
        }
        return p() > 0 ? i11 + this.f9956c.hashCode() : i11;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> l() {
        if (this.f9960g == null) {
            this.f9960g = new c(this, (a) null);
        }
        return this.f9960g;
    }

    public Map.Entry<K, V> n(int i11) {
        return this.f9955b.get(i11);
    }

    public int o() {
        return this.f9955b.size();
    }

    public int p() {
        return this.f9956c.size();
    }

    public Iterable<Map.Entry<K, V>> q() {
        if (this.f9956c.isEmpty()) {
            return d.b();
        }
        return this.f9956c.entrySet();
    }

    public V remove(Object obj) {
        k();
        Comparable comparable = (Comparable) obj;
        int h11 = h(comparable);
        if (h11 >= 0) {
            return w(h11);
        }
        if (this.f9956c.isEmpty()) {
            return null;
        }
        return this.f9956c.remove(comparable);
    }

    public boolean s() {
        return this.f9957d;
    }

    public int size() {
        return this.f9955b.size() + this.f9956c.size();
    }

    public void t() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f9957d) {
            if (this.f9956c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f9956c);
            }
            this.f9956c = map;
            if (this.f9959f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f9959f);
            }
            this.f9959f = map2;
            this.f9957d = true;
        }
    }

    /* renamed from: v */
    public V put(K k, V v) {
        k();
        int h11 = h(k);
        if (h11 >= 0) {
            return this.f9955b.get(h11).setValue(v);
        }
        m();
        int i11 = -(h11 + 1);
        if (i11 >= this.f9954a) {
            return r().put(k, v);
        }
        int size = this.f9955b.size();
        int i12 = this.f9954a;
        if (size == i12) {
            e remove = this.f9955b.remove(i12 - 1);
            r().put(remove.getKey(), remove.getValue());
        }
        this.f9955b.add(i11, new e(k, v));
        return null;
    }

    /* compiled from: SmallSortedMap */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f9961a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f9962b;

        private b() {
            this.f9961a = b1.this.f9955b.size();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f9962b == null) {
                this.f9962b = b1.this.f9959f.entrySet().iterator();
            }
            return this.f9962b;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List b11 = b1.this.f9955b;
            int i11 = this.f9961a - 1;
            this.f9961a = i11;
            return (Map.Entry) b11.get(i11);
        }

        public boolean hasNext() {
            int i11 = this.f9961a;
            return (i11 > 0 && i11 <= b1.this.f9955b.size()) || b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(b1 b1Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f9970a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9971b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f9972c;

        private f() {
            this.f9970a = -1;
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f9972c == null) {
                this.f9972c = b1.this.f9956c.entrySet().iterator();
            }
            return this.f9972c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f9971b = true;
            int i11 = this.f9970a + 1;
            this.f9970a = i11;
            if (i11 < b1.this.f9955b.size()) {
                return (Map.Entry) b1.this.f9955b.get(this.f9970a);
            }
            return (Map.Entry) b().next();
        }

        public boolean hasNext() {
            if (this.f9970a + 1 < b1.this.f9955b.size()) {
                return true;
            }
            if (b1.this.f9956c.isEmpty() || !b().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f9971b) {
                this.f9971b = false;
                b1.this.k();
                if (this.f9970a < b1.this.f9955b.size()) {
                    b1 b1Var = b1.this;
                    int i11 = this.f9970a;
                    this.f9970a = i11 - 1;
                    Object unused = b1Var.w(i11);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(b1 b1Var, a aVar) {
            this();
        }
    }

    private b1(int i11) {
        this.f9954a = i11;
        this.f9955b = Collections.emptyList();
        this.f9956c = Collections.emptyMap();
        this.f9959f = Collections.emptyMap();
    }
}
