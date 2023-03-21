package p4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ListK.kt */
public final class c<A> implements o4.a<Object, A>, List<A>, mp0.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16239b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List<A> f16240a;

    /* compiled from: ListK.kt */
    public static final class a {
        private a() {
        }

        public final <A> c<A> a(A a11) {
            return d.a(j.d(a11));
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public c(List<? extends A> list) {
        p.k(list, "list");
        this.f16240a = list;
    }

    public final <B> c<B> a(l<? super A, ? extends o4.a<Object, ? extends B>> lVar) {
        p.k(lVar, "f");
        List<A> list = this.f16240a;
        ArrayList arrayList = new ArrayList();
        for (A invoke : list) {
            o4.a aVar = (o4.a) lVar.invoke(invoke);
            if (aVar != null) {
                boolean unused = p.z(arrayList, ((c) aVar).f16240a);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type arrow.core.ListK<A>");
            }
        }
        return d.a(arrayList);
    }

    public void add(int i11, A a11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(A a11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i11, Collection<? extends A> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends A> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f16240a.size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f16240a.contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        p.k(collection, "elements");
        return this.f16240a.containsAll(collection);
    }

    public final <B> c<B> d(l<? super A, ? extends B> lVar) {
        p.k(lVar, "f");
        List<A> list = this.f16240a;
        ArrayList arrayList = new ArrayList(l.u(list, 10));
        for (A invoke : list) {
            arrayList.add(lVar.invoke(invoke));
        }
        return d.a(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return p.e(this.f16240a, ((c) obj).f16240a);
        }
        if (obj instanceof List) {
            return p.e(this.f16240a, obj);
        }
        return false;
    }

    public A get(int i11) {
        return this.f16240a.get(i11);
    }

    public int hashCode() {
        return this.f16240a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f16240a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f16240a.isEmpty();
    }

    public Iterator<A> iterator() {
        return this.f16240a.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f16240a.lastIndexOf(obj);
    }

    public ListIterator<A> listIterator() {
        return this.f16240a.listIterator();
    }

    public ListIterator<A> listIterator(int i11) {
        return this.f16240a.listIterator(i11);
    }

    public A remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<A> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public A set(int i11, A a11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return c();
    }

    public void sort(Comparator<? super A> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<A> subList(int i11, int i12) {
        return this.f16240a.subList(i11, i12);
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return h.b(this, tArr);
    }

    public String toString() {
        return "ListK(list=" + this.f16240a + ")";
    }
}
