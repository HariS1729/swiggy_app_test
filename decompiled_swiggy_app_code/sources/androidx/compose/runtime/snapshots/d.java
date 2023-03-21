package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import n0.m;

/* compiled from: SnapshotStateList.kt */
final class d<T> implements List<T>, mp0.d {

    /* renamed from: a  reason: collision with root package name */
    private final SnapshotStateList<T> f6298a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6299b;

    /* renamed from: c  reason: collision with root package name */
    private int f6300c;

    /* renamed from: d  reason: collision with root package name */
    private int f6301d;

    /* compiled from: SnapshotStateList.kt */
    public static final class a implements ListIterator<T>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Ref$IntRef f6302a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d<T> f6303b;

        a(Ref$IntRef ref$IntRef, d<T> dVar) {
            this.f6302a = ref$IntRef;
            this.f6303b = dVar;
        }

        /* renamed from: a */
        public Void add(T t) {
            Void unused = m.d();
            throw new KotlinNothingValueException();
        }

        /* renamed from: b */
        public Void remove() {
            Void unused = m.d();
            throw new KotlinNothingValueException();
        }

        /* renamed from: c */
        public Void set(T t) {
            Void unused = m.d();
            throw new KotlinNothingValueException();
        }

        public boolean hasNext() {
            return this.f6302a.f25664a < this.f6303b.size() - 1;
        }

        public boolean hasPrevious() {
            return this.f6302a.f25664a >= 0;
        }

        public T next() {
            int i11 = this.f6302a.f25664a + 1;
            m.e(i11, this.f6303b.size());
            this.f6302a.f25664a = i11;
            return this.f6303b.get(i11);
        }

        public int nextIndex() {
            return this.f6302a.f25664a + 1;
        }

        public T previous() {
            int i11 = this.f6302a.f25664a;
            m.e(i11, this.f6303b.size());
            this.f6302a.f25664a = i11 - 1;
            return this.f6303b.get(i11);
        }

        public int previousIndex() {
            return this.f6302a.f25664a;
        }
    }

    public d(SnapshotStateList<T> snapshotStateList, int i11, int i12) {
        p.j(snapshotStateList, "parentList");
        this.f6298a = snapshotStateList;
        this.f6299b = i11;
        this.f6300c = snapshotStateList.c();
        this.f6301d = i12 - i11;
    }

    private final void f() {
        if (this.f6298a.c() != this.f6300c) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean add(T t) {
        f();
        this.f6298a.add(this.f6299b + size(), t);
        this.f6301d = size() + 1;
        this.f6300c = this.f6298a.c();
        return true;
    }

    public boolean addAll(int i11, Collection<? extends T> collection) {
        p.j(collection, "elements");
        f();
        boolean addAll = this.f6298a.addAll(i11 + this.f6299b, collection);
        if (addAll) {
            this.f6301d = size() + collection.size();
            this.f6300c = this.f6298a.c();
        }
        return addAll;
    }

    public int c() {
        return this.f6301d;
    }

    public void clear() {
        if (size() > 0) {
            f();
            SnapshotStateList<T> snapshotStateList = this.f6298a;
            int i11 = this.f6299b;
            snapshotStateList.m(i11, size() + i11);
            this.f6301d = 0;
            this.f6300c = this.f6298a.c();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public T d(int i11) {
        f();
        T remove = this.f6298a.remove(this.f6299b + i11);
        this.f6301d = size() - 1;
        this.f6300c = this.f6298a.c();
        return remove;
    }

    public T get(int i11) {
        f();
        m.e(i11, size());
        return this.f6298a.get(this.f6299b + i11);
    }

    public int indexOf(Object obj) {
        f();
        int i11 = this.f6299b;
        Iterator it2 = l.u(i11, size() + i11).iterator();
        while (it2.hasNext()) {
            int b11 = ((cp0.m) it2).b();
            if (p.e(obj, this.f6298a.get(b11))) {
                return b11 - this.f6299b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<T> iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        f();
        int size = this.f6299b + size();
        while (true) {
            size--;
            if (size < this.f6299b) {
                return -1;
            }
            if (p.e(obj, this.f6298a.get(size))) {
                return size - this.f6299b;
            }
        }
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public final /* bridge */ T remove(int i11) {
        return d(i11);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        Iterator<? extends Object> it2 = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (true) {
                if (!it2.hasNext()) {
                    return z11;
                }
                if (remove((Object) it2.next()) || z11) {
                    z11 = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        f();
        SnapshotStateList<T> snapshotStateList = this.f6298a;
        int i11 = this.f6299b;
        int n = snapshotStateList.n(collection, i11, size() + i11);
        if (n > 0) {
            this.f6300c = this.f6298a.c();
            this.f6301d = size() - n;
        }
        return n > 0;
    }

    public T set(int i11, T t) {
        m.e(i11, size());
        f();
        T t11 = this.f6298a.set(i11 + this.f6299b, t);
        this.f6300c = this.f6298a.c();
        return t11;
    }

    public final /* bridge */ int size() {
        return c();
    }

    public List<T> subList(int i11, int i12) {
        boolean z11 = true;
        if (!(i11 >= 0 && i11 <= i12) || i12 > size()) {
            z11 = false;
        }
        if (z11) {
            f();
            SnapshotStateList<T> snapshotStateList = this.f6298a;
            int i13 = this.f6299b;
            return new d(snapshotStateList, i11 + i13, i12 + i13);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        return h.b(this, tArr);
    }

    public ListIterator<T> listIterator(int i11) {
        f();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.f25664a = i11 - 1;
        return new a(ref$IntRef, this);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public void add(int i11, T t) {
        f();
        this.f6298a.add(this.f6299b + i11, t);
        this.f6301d = size() + 1;
        this.f6300c = this.f6298a.c();
    }

    public boolean addAll(Collection<? extends T> collection) {
        p.j(collection, "elements");
        return addAll(size(), collection);
    }
}
