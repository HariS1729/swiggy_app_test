package w1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocaleList.kt */
public final class f implements Collection<e>, mp0.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17448c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f17449a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17450b;

    /* compiled from: LocaleList.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final f a() {
            List<g> a11 = i.a().a();
            ArrayList arrayList = new ArrayList(a11.size());
            int size = a11.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new e(a11.get(i11)));
            }
            return new f(arrayList);
        }
    }

    public f(List<e> list) {
        p.j(list, "localeList");
        this.f17449a = list;
        this.f17450b = list.size();
    }

    public boolean a(e eVar) {
        p.j(eVar, "element");
        return this.f17449a.contains(eVar);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final e c(int i11) {
        return this.f17449a.get(i11);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return a((e) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        return this.f17449a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && p.e(this.f17449a, ((f) obj).f17449a);
    }

    public final List<e> f() {
        return this.f17449a;
    }

    public int g() {
        return this.f17450b;
    }

    public int hashCode() {
        return this.f17449a.hashCode();
    }

    public boolean isEmpty() {
        return this.f17449a.isEmpty();
    }

    public Iterator<e> iterator() {
        return this.f17449a.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super e> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return g();
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        return h.b(this, tArr);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f17449a + ')';
    }
}
