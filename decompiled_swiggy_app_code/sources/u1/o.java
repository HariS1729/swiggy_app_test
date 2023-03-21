package u1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mp0.a;

/* compiled from: FontFamily.kt */
public final class o extends g implements List<h>, a {

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ List<h> f16933h;

    /* renamed from: i  reason: collision with root package name */
    private final List<h> f16934i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(List<? extends h> list) {
        super((i) null);
        p.j(list, "fonts");
        this.f16933h = list;
        if (!list.isEmpty()) {
            this.f16934i = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    public /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i11, Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends h> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return d((h) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        return this.f16933h.containsAll(collection);
    }

    public boolean d(h hVar) {
        p.j(hVar, "element");
        return this.f16933h.contains(hVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && p.e(this.f16934i, ((o) obj).f16934i);
    }

    /* renamed from: f */
    public h get(int i11) {
        return this.f16933h.get(i11);
    }

    public final List<h> g() {
        return this.f16934i;
    }

    public int h() {
        return this.f16933h.size();
    }

    public int hashCode() {
        return this.f16934i.hashCode();
    }

    public int i(h hVar) {
        p.j(hVar, "element");
        return this.f16933h.indexOf(hVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        return i((h) obj);
    }

    public boolean isEmpty() {
        return this.f16933h.isEmpty();
    }

    public Iterator<h> iterator() {
        return this.f16933h.iterator();
    }

    public int k(h hVar) {
        p.j(hVar, "element");
        return this.f16933h.lastIndexOf(hVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        return k((h) obj);
    }

    public ListIterator<h> listIterator() {
        return this.f16933h.listIterator();
    }

    public ListIterator<h> listIterator(int i11) {
        return this.f16933h.listIterator(i11);
    }

    public /* bridge */ /* synthetic */ Object remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<h> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return h();
    }

    public void sort(Comparator<? super h> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<h> subList(int i11, int i12) {
        return this.f16933h.subList(i11, i12);
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        return h.b(this, tArr);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f16934i + ')';
    }
}
