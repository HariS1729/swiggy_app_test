package f0;

import e0.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* compiled from: IdentityArraySet.kt */
public final class c<T> implements Set<T>, mp0.a {

    /* renamed from: a  reason: collision with root package name */
    private int f14460a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f14461b = new Object[16];

    /* compiled from: IdentityArraySet.kt */
    public static final class a implements Iterator<T>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        private int f14462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c<T> f14463b;

        a(c<T> cVar) {
            this.f14463b = cVar;
        }

        public boolean hasNext() {
            return this.f14462a < this.f14463b.size();
        }

        public T next() {
            T[] f11 = this.f14463b.f();
            int i11 = this.f14462a;
            this.f14462a = i11 + 1;
            T t = f11[i11];
            Objects.requireNonNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final int a(Object obj) {
        int size = size() - 1;
        int a11 = b.a(obj);
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            Object obj2 = get(i12);
            int a12 = b.a(obj2);
            if (a12 < a11) {
                i11 = i12 + 1;
            } else if (a12 > a11) {
                size = i12 - 1;
            } else if (obj2 == obj) {
                return i12;
            } else {
                return b(i12, obj, a11);
            }
        }
        return -(i11 + 1);
    }

    private final int b(int i11, Object obj, int i12) {
        for (int i13 = i11 - 1; -1 < i13; i13--) {
            Object obj2 = this.f14461b[i13];
            if (obj2 == obj) {
                return i13;
            }
            if (b.a(obj2) != i12) {
                break;
            }
        }
        int i14 = i11 + 1;
        int size = size();
        while (true) {
            if (i14 >= size) {
                i14 = size();
                break;
            }
            Object obj3 = this.f14461b[i14];
            if (obj3 == obj) {
                return i14;
            }
            if (b.a(obj3) != i12) {
                break;
            }
            i14++;
        }
        return -(i14 + 1);
    }

    public final boolean add(T t) {
        int i11;
        p.j(t, "value");
        if (size() > 0) {
            i11 = a(t);
            if (i11 >= 0) {
                return false;
            }
        } else {
            i11 = -1;
        }
        int i12 = -(i11 + 1);
        int size = size();
        Object[] objArr = this.f14461b;
        if (size == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            Object[] unused = g.j(objArr, objArr2, i12 + 1, i12, size());
            Object[] unused2 = g.n(this.f14461b, objArr2, 0, 0, i12, 6, (Object) null);
            this.f14461b = objArr2;
        } else {
            Object[] unused3 = g.j(objArr, objArr, i12 + 1, i12, size());
        }
        this.f14461b[i12] = t;
        h(size() + 1);
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f14460a;
    }

    public final void clear() {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f14461b[i11] = null;
        }
        h(0);
    }

    public boolean contains(Object obj) {
        return obj != null && a(obj) >= 0;
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

    public final Object[] f() {
        return this.f14461b;
    }

    public final boolean g() {
        return size() > 0;
    }

    public final T get(int i11) {
        T t = this.f14461b[i11];
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    public void h(int i11) {
        this.f14460a = i11;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }

    public final boolean remove(T t) {
        int a11;
        if (t == null || (a11 = a(t)) < 0) {
            return false;
        }
        if (a11 < size() - 1) {
            Object[] objArr = this.f14461b;
            Object[] unused = g.j(objArr, objArr, a11, a11 + 1, size());
        }
        h(size() - 1);
        this.f14461b[size()] = null;
        return true;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return c();
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        return h.b(this, tArr);
    }
}
