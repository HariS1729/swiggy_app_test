package f0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import mp0.d;

/* compiled from: MutableVector.kt */
public final class e<T> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final int f14468d = 8;

    /* renamed from: a  reason: collision with root package name */
    private T[] f14469a;

    /* renamed from: b  reason: collision with root package name */
    private List<T> f14470b;

    /* renamed from: c  reason: collision with root package name */
    private int f14471c;

    /* compiled from: MutableVector.kt */
    private static final class a<T> implements List<T>, d {

        /* renamed from: a  reason: collision with root package name */
        private final e<T> f14472a;

        public a(e<T> eVar) {
            p.j(eVar, "vector");
            this.f14472a = eVar;
        }

        public boolean add(T t) {
            return this.f14472a.b(t);
        }

        public boolean addAll(int i11, Collection<? extends T> collection) {
            p.j(collection, "elements");
            return this.f14472a.d(i11, collection);
        }

        public int c() {
            return this.f14472a.m();
        }

        public void clear() {
            this.f14472a.g();
        }

        public boolean contains(Object obj) {
            return this.f14472a.h(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            p.j(collection, "elements");
            return this.f14472a.i(collection);
        }

        public T d(int i11) {
            f.c(this, i11);
            return this.f14472a.u(i11);
        }

        public T get(int i11) {
            f.c(this, i11);
            return this.f14472a.l()[i11];
        }

        public int indexOf(Object obj) {
            return this.f14472a.n(obj);
        }

        public boolean isEmpty() {
            return this.f14472a.o();
        }

        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            return this.f14472a.q(obj);
        }

        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        public final /* bridge */ T remove(int i11) {
            return d(i11);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            p.j(collection, "elements");
            return this.f14472a.t(collection);
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            p.j(collection, "elements");
            return this.f14472a.w(collection);
        }

        public T set(int i11, T t) {
            f.c(this, i11);
            return this.f14472a.x(i11, t);
        }

        public final /* bridge */ int size() {
            return c();
        }

        public List<T> subList(int i11, int i12) {
            f.d(this, i11, i12);
            return new b(this, i11, i12);
        }

        public Object[] toArray() {
            return h.a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            p.j(tArr, "array");
            return h.b(this, tArr);
        }

        public void add(int i11, T t) {
            this.f14472a.a(i11, t);
        }

        public boolean addAll(Collection<? extends T> collection) {
            p.j(collection, "elements");
            return this.f14472a.e(collection);
        }

        public ListIterator<T> listIterator(int i11) {
            return new c(this, i11);
        }

        public boolean remove(Object obj) {
            return this.f14472a.r(obj);
        }
    }

    /* compiled from: MutableVector.kt */
    private static final class b<T> implements List<T>, d {

        /* renamed from: a  reason: collision with root package name */
        private final List<T> f14473a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14474b;

        /* renamed from: c  reason: collision with root package name */
        private int f14475c;

        public b(List<T> list, int i11, int i12) {
            p.j(list, "list");
            this.f14473a = list;
            this.f14474b = i11;
            this.f14475c = i12;
        }

        public boolean add(T t) {
            List<T> list = this.f14473a;
            int i11 = this.f14475c;
            this.f14475c = i11 + 1;
            list.add(i11, t);
            return true;
        }

        public boolean addAll(int i11, Collection<? extends T> collection) {
            p.j(collection, "elements");
            this.f14473a.addAll(i11 + this.f14474b, collection);
            this.f14475c += collection.size();
            return collection.size() > 0;
        }

        public int c() {
            return this.f14475c - this.f14474b;
        }

        public void clear() {
            int i11 = this.f14475c - 1;
            int i12 = this.f14474b;
            if (i12 <= i11) {
                while (true) {
                    this.f14473a.remove(i11);
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            this.f14475c = this.f14474b;
        }

        public boolean contains(Object obj) {
            int i11 = this.f14475c;
            for (int i12 = this.f14474b; i12 < i11; i12++) {
                if (p.e(this.f14473a.get(i12), obj)) {
                    return true;
                }
            }
            return false;
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

        public T d(int i11) {
            f.c(this, i11);
            this.f14475c--;
            return this.f14473a.remove(i11 + this.f14474b);
        }

        public T get(int i11) {
            f.c(this, i11);
            return this.f14473a.get(i11 + this.f14474b);
        }

        public int indexOf(Object obj) {
            int i11 = this.f14475c;
            for (int i12 = this.f14474b; i12 < i11; i12++) {
                if (p.e(this.f14473a.get(i12), obj)) {
                    return i12 - this.f14474b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f14475c == this.f14474b;
        }

        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i11 = this.f14475c - 1;
            int i12 = this.f14474b;
            if (i12 > i11) {
                return -1;
            }
            while (!p.e(this.f14473a.get(i11), obj)) {
                if (i11 == i12) {
                    return -1;
                }
                i11--;
            }
            return i11 - this.f14474b;
        }

        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        public final /* bridge */ T remove(int i11) {
            return d(i11);
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            p.j(collection, "elements");
            int i11 = this.f14475c;
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                remove((Object) it2.next());
            }
            return i11 != this.f14475c;
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            p.j(collection, "elements");
            int i11 = this.f14475c;
            int i12 = i11 - 1;
            int i13 = this.f14474b;
            if (i13 <= i12) {
                while (true) {
                    if (!collection.contains(this.f14473a.get(i12))) {
                        this.f14473a.remove(i12);
                        this.f14475c--;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12--;
                }
            }
            return i11 != this.f14475c;
        }

        public T set(int i11, T t) {
            f.c(this, i11);
            return this.f14473a.set(i11 + this.f14474b, t);
        }

        public final /* bridge */ int size() {
            return c();
        }

        public List<T> subList(int i11, int i12) {
            f.d(this, i11, i12);
            return new b(this, i11, i12);
        }

        public Object[] toArray() {
            return h.a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            p.j(tArr, "array");
            return h.b(this, tArr);
        }

        public void add(int i11, T t) {
            this.f14473a.add(i11 + this.f14474b, t);
            this.f14475c++;
        }

        public ListIterator<T> listIterator(int i11) {
            return new c(this, i11);
        }

        public boolean remove(Object obj) {
            int i11 = this.f14475c;
            for (int i12 = this.f14474b; i12 < i11; i12++) {
                if (p.e(this.f14473a.get(i12), obj)) {
                    this.f14473a.remove(i12);
                    this.f14475c--;
                    return true;
                }
            }
            return false;
        }

        public boolean addAll(Collection<? extends T> collection) {
            p.j(collection, "elements");
            this.f14473a.addAll(this.f14475c, collection);
            this.f14475c += collection.size();
            return collection.size() > 0;
        }
    }

    /* compiled from: MutableVector.kt */
    private static final class c<T> implements ListIterator<T>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        private final List<T> f14476a;

        /* renamed from: b  reason: collision with root package name */
        private int f14477b;

        public c(List<T> list, int i11) {
            p.j(list, "list");
            this.f14476a = list;
            this.f14477b = i11;
        }

        public void add(T t) {
            this.f14476a.add(this.f14477b, t);
            this.f14477b++;
        }

        public boolean hasNext() {
            return this.f14477b < this.f14476a.size();
        }

        public boolean hasPrevious() {
            return this.f14477b > 0;
        }

        public T next() {
            List<T> list = this.f14476a;
            int i11 = this.f14477b;
            this.f14477b = i11 + 1;
            return list.get(i11);
        }

        public int nextIndex() {
            return this.f14477b;
        }

        public T previous() {
            int i11 = this.f14477b - 1;
            this.f14477b = i11;
            return this.f14476a.get(i11);
        }

        public int previousIndex() {
            return this.f14477b - 1;
        }

        public void remove() {
            int i11 = this.f14477b - 1;
            this.f14477b = i11;
            this.f14476a.remove(i11);
        }

        public void set(T t) {
            this.f14476a.set(this.f14477b, t);
        }
    }

    public e(T[] tArr, int i11) {
        p.j(tArr, "content");
        this.f14469a = tArr;
        this.f14471c = i11;
    }

    public final void a(int i11, T t) {
        j(this.f14471c + 1);
        T[] tArr = this.f14469a;
        int i12 = this.f14471c;
        if (i11 != i12) {
            Object[] unused = g.j(tArr, tArr, i11 + 1, i11, i12);
        }
        tArr[i11] = t;
        this.f14471c++;
    }

    public final boolean b(T t) {
        j(this.f14471c + 1);
        T[] tArr = this.f14469a;
        int i11 = this.f14471c;
        tArr[i11] = t;
        this.f14471c = i11 + 1;
        return true;
    }

    public final boolean c(int i11, e<T> eVar) {
        p.j(eVar, "elements");
        if (eVar.o()) {
            return false;
        }
        j(this.f14471c + eVar.f14471c);
        T[] tArr = this.f14469a;
        int i12 = this.f14471c;
        if (i11 != i12) {
            Object[] unused = g.j(tArr, tArr, eVar.f14471c + i11, i11, i12);
        }
        Object[] unused2 = g.j(eVar.f14469a, tArr, i11, 0, eVar.f14471c);
        this.f14471c += eVar.f14471c;
        return true;
    }

    public final boolean d(int i11, Collection<? extends T> collection) {
        p.j(collection, "elements");
        int i12 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(this.f14471c + collection.size());
        T[] tArr = this.f14469a;
        if (i11 != this.f14471c) {
            Object[] unused = g.j(tArr, tArr, collection.size() + i11, i11, this.f14471c);
        }
        for (T next : collection) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                k.t();
            }
            tArr[i12 + i11] = next;
            i12 = i13;
        }
        this.f14471c += collection.size();
        return true;
    }

    public final boolean e(Collection<? extends T> collection) {
        p.j(collection, "elements");
        return d(this.f14471c, collection);
    }

    public final List<T> f() {
        List<T> list = this.f14470b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f14470b = aVar;
        return aVar;
    }

    public final void g() {
        T[] tArr = this.f14469a;
        int m11 = m();
        while (true) {
            m11--;
            if (-1 < m11) {
                tArr[m11] = null;
            } else {
                this.f14471c = 0;
                return;
            }
        }
    }

    public final boolean h(T t) {
        int m11 = m() - 1;
        if (m11 >= 0) {
            int i11 = 0;
            while (!p.e(l()[i11], t)) {
                if (i11 != m11) {
                    i11++;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean i(Collection<? extends T> collection) {
        p.j(collection, "elements");
        for (T h11 : collection) {
            if (!h(h11)) {
                return false;
            }
        }
        return true;
    }

    public final void j(int i11) {
        T[] tArr = this.f14469a;
        if (tArr.length < i11) {
            T[] copyOf = Arrays.copyOf(tArr, Math.max(i11, tArr.length * 2));
            p.i(copyOf, "copyOf(this, newSize)");
            this.f14469a = copyOf;
        }
    }

    public final T k() {
        if (!o()) {
            return l()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final T[] l() {
        return this.f14469a;
    }

    public final int m() {
        return this.f14471c;
    }

    public final int n(T t) {
        int i11 = this.f14471c;
        if (i11 <= 0) {
            return -1;
        }
        int i12 = 0;
        T[] tArr = this.f14469a;
        while (!p.e(t, tArr[i12])) {
            i12++;
            if (i12 >= i11) {
                return -1;
            }
        }
        return i12;
    }

    public final boolean o() {
        return this.f14471c == 0;
    }

    public final boolean p() {
        return this.f14471c != 0;
    }

    public final int q(T t) {
        int i11 = this.f14471c;
        if (i11 <= 0) {
            return -1;
        }
        int i12 = i11 - 1;
        T[] tArr = this.f14469a;
        while (!p.e(t, tArr[i12])) {
            i12--;
            if (i12 < 0) {
                return -1;
            }
        }
        return i12;
    }

    public final boolean r(T t) {
        int n = n(t);
        if (n < 0) {
            return false;
        }
        u(n);
        return true;
    }

    public final boolean s(e<T> eVar) {
        p.j(eVar, "elements");
        int i11 = this.f14471c;
        int m11 = eVar.m() - 1;
        if (m11 >= 0) {
            int i12 = 0;
            while (true) {
                r(eVar.l()[i12]);
                if (i12 == m11) {
                    break;
                }
                i12++;
            }
        }
        if (i11 != this.f14471c) {
            return true;
        }
        return false;
    }

    public final boolean t(Collection<? extends T> collection) {
        p.j(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i11 = this.f14471c;
        for (T r11 : collection) {
            r(r11);
        }
        if (i11 != this.f14471c) {
            return true;
        }
        return false;
    }

    public final T u(int i11) {
        T[] tArr = this.f14469a;
        T t = tArr[i11];
        if (i11 != m() - 1) {
            Object[] unused = g.j(tArr, tArr, i11, i11 + 1, this.f14471c);
        }
        int i12 = this.f14471c - 1;
        this.f14471c = i12;
        tArr[i12] = null;
        return t;
    }

    public final void v(int i11, int i12) {
        if (i12 > i11) {
            int i13 = this.f14471c;
            if (i12 < i13) {
                T[] tArr = this.f14469a;
                Object[] unused = g.j(tArr, tArr, i11, i12, i13);
            }
            int i14 = this.f14471c - (i12 - i11);
            int m11 = m() - 1;
            if (i14 <= m11) {
                int i15 = i14;
                while (true) {
                    this.f14469a[i15] = null;
                    if (i15 == m11) {
                        break;
                    }
                    i15++;
                }
            }
            this.f14471c = i14;
        }
    }

    public final boolean w(Collection<? extends T> collection) {
        p.j(collection, "elements");
        int i11 = this.f14471c;
        for (int m11 = m() - 1; -1 < m11; m11--) {
            if (!collection.contains(l()[m11])) {
                u(m11);
            }
        }
        if (i11 != this.f14471c) {
            return true;
        }
        return false;
    }

    public final T x(int i11, T t) {
        T[] tArr = this.f14469a;
        T t11 = tArr[i11];
        tArr[i11] = t;
        return t11;
    }

    public final void y(Comparator<T> comparator) {
        p.j(comparator, "comparator");
        g.D(this.f14469a, comparator, 0, this.f14471c);
    }
}
