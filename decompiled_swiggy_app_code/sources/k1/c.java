package k1;

import bp0.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: HitTestResult.kt */
public final class c<T> implements List<T>, mp0.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object[] f15330a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private long[] f15331b = new long[16];
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f15332c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f15333d;

    /* compiled from: HitTestResult.kt */
    private final class b implements List<T>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f15338a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15339b;

        public b(int i11, int i12) {
            this.f15338a = i11;
            this.f15339b = i12;
        }

        public void add(int i11, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i11, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int c() {
            return this.f15339b - this.f15338a;
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            p.j(collection, "elements");
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        public T get(int i11) {
            return c.this.f15330a[i11 + this.f15338a];
        }

        public int indexOf(Object obj) {
            int i11 = this.f15338a;
            int i12 = this.f15339b;
            if (i11 > i12) {
                return -1;
            }
            while (!p.e(c.this.f15330a[i11], obj)) {
                if (i11 == i12) {
                    return -1;
                }
                i11++;
            }
            return i11 - this.f15338a;
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public Iterator<T> iterator() {
            c<T> cVar = c.this;
            int i11 = this.f15338a;
            return new a(i11, i11, this.f15339b);
        }

        public int lastIndexOf(Object obj) {
            int i11 = this.f15339b;
            int i12 = this.f15338a;
            if (i12 > i11) {
                return -1;
            }
            while (!p.e(c.this.f15330a[i11], obj)) {
                if (i11 == i12) {
                    return -1;
                }
                i11--;
            }
            return i11 - this.f15338a;
        }

        public ListIterator<T> listIterator() {
            c<T> cVar = c.this;
            int i11 = this.f15338a;
            return new a(i11, i11, this.f15339b);
        }

        public T remove(int i11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public T set(int i11, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return c();
        }

        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List<T> subList(int i11, int i12) {
            c<T> cVar = c.this;
            int i13 = this.f15338a;
            return new b(i11 + i13, i13 + i12);
        }

        public Object[] toArray() {
            return h.a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            p.j(tArr, "array");
            return h.b(this, tArr);
        }

        public ListIterator<T> listIterator(int i11) {
            c<T> cVar = c.this;
            int i12 = this.f15338a;
            return new a(i11 + i12, i12, this.f15339b);
        }
    }

    private final void h() {
        int i11 = this.f15332c;
        Object[] objArr = this.f15330a;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            p.i(copyOf, "copyOf(this, newSize)");
            this.f15330a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f15331b, length);
            p.i(copyOf2, "copyOf(this, newSize)");
            this.f15331b = copyOf2;
        }
    }

    private final long i() {
        long b11 = d.a(Float.POSITIVE_INFINITY, false);
        int i11 = this.f15332c + 1;
        int l11 = k.l(this);
        if (i11 <= l11) {
            while (true) {
                long b12 = a.b(this.f15331b[i11]);
                if (a.a(b12, b11) < 0) {
                    b11 = b12;
                }
                if (a.c(b11) >= 0.0f || !a.d(b11)) {
                    if (i11 == l11) {
                        break;
                    }
                    i11++;
                } else {
                    return b11;
                }
            }
        }
        return b11;
    }

    private final void p() {
        int i11 = this.f15332c + 1;
        int l11 = k.l(this);
        if (i11 <= l11) {
            while (true) {
                this.f15330a[i11] = null;
                if (i11 == l11) {
                    break;
                }
                i11++;
            }
        }
        this.f15333d = this.f15332c + 1;
    }

    public void add(int i11, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i11, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        this.f15332c = size() - 1;
    }

    public final void clear() {
        this.f15332c = -1;
        p();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public T get(int i11) {
        return this.f15330a[i11];
    }

    public int indexOf(Object obj) {
        int l11 = k.l(this);
        if (l11 < 0) {
            return -1;
        }
        int i11 = 0;
        while (!p.e(this.f15330a[i11], obj)) {
            if (i11 == l11) {
                return -1;
            }
            i11++;
        }
        return i11;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<T> iterator() {
        return new a(this, 0, 0, 0, 7, (i) null);
    }

    public int k() {
        return this.f15333d;
    }

    public final boolean l() {
        long i11 = i();
        return a.c(i11) < 0.0f && a.d(i11);
    }

    public int lastIndexOf(Object obj) {
        for (int l11 = k.l(this); -1 < l11; l11--) {
            if (p.e(this.f15330a[l11], obj)) {
                return l11;
            }
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        return new a(this, 0, 0, 0, 7, (i) null);
    }

    public final void m(T t, boolean z11, lp0.a<k> aVar) {
        p.j(aVar, "childHitTest");
        n(t, -1.0f, z11, aVar);
    }

    public final void n(T t, float f11, boolean z11, lp0.a<k> aVar) {
        p.j(aVar, "childHitTest");
        int i11 = this.f15332c;
        this.f15332c = i11 + 1;
        h();
        Object[] objArr = this.f15330a;
        int i12 = this.f15332c;
        objArr[i12] = t;
        this.f15331b[i12] = d.a(f11, z11);
        p();
        aVar.invoke();
        this.f15332c = i11;
    }

    public final boolean o(float f11, boolean z11) {
        if (this.f15332c == k.l(this)) {
            return true;
        }
        if (a.a(i(), d.a(f11, z11)) > 0) {
            return true;
        }
        return false;
    }

    public final void q(T t, float f11, boolean z11, lp0.a<k> aVar) {
        p.j(aVar, "childHitTest");
        if (this.f15332c == k.l(this)) {
            n(t, f11, z11, aVar);
            if (this.f15332c + 1 == k.l(this)) {
                p();
                return;
            }
            return;
        }
        long i11 = i();
        int i12 = this.f15332c;
        this.f15332c = k.l(this);
        n(t, f11, z11, aVar);
        if (this.f15332c + 1 < k.l(this) && a.a(i11, i()) > 0) {
            int i13 = this.f15332c + 1;
            int i14 = i12 + 1;
            Object[] objArr = this.f15330a;
            Object[] unused = g.j(objArr, objArr, i14, i13, size());
            long[] jArr = this.f15331b;
            long[] unused2 = g.i(jArr, jArr, i14, i13, size());
            this.f15332c = ((size() + i12) - this.f15332c) - 1;
        }
        p();
        this.f15332c = i12;
    }

    public T remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public T set(int i11, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return k();
    }

    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<T> subList(int i11, int i12) {
        return new b(i11, i12);
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        return h.b(this, tArr);
    }

    public ListIterator<T> listIterator(int i11) {
        return new a(this, i11, 0, 0, 6, (i) null);
    }

    /* compiled from: HitTestResult.kt */
    private final class a implements ListIterator<T>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        private int f15334a;

        /* renamed from: b  reason: collision with root package name */
        private final int f15335b;

        /* renamed from: c  reason: collision with root package name */
        private final int f15336c;

        public a(int i11, int i12, int i13) {
            this.f15334a = i11;
            this.f15335b = i12;
            this.f15336c = i13;
        }

        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasNext() {
            return this.f15334a < this.f15336c;
        }

        public boolean hasPrevious() {
            return this.f15334a > this.f15335b;
        }

        public T next() {
            T[] f11 = c.this.f15330a;
            int i11 = this.f15334a;
            this.f15334a = i11 + 1;
            return f11[i11];
        }

        public int nextIndex() {
            return this.f15334a - this.f15335b;
        }

        public T previous() {
            T[] f11 = c.this.f15330a;
            int i11 = this.f15334a - 1;
            this.f15334a = i11;
            return f11[i11];
        }

        public int previousIndex() {
            return (this.f15334a - this.f15335b) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(c cVar, int i11, int i12, int i13, int i14, i iVar) {
            this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? cVar.size() : i13);
        }
    }
}
