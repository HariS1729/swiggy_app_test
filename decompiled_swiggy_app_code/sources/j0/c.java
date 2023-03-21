package j0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;
import mp0.a;

/* compiled from: PersistentOrderedSetIterator.kt */
public class c<E> implements Iterator<E>, a {

    /* renamed from: a  reason: collision with root package name */
    private Object f15264a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, a> f15265b;

    /* renamed from: c  reason: collision with root package name */
    private int f15266c;

    public c(Object obj, Map<E, a> map) {
        p.j(map, "map");
        this.f15264a = obj;
        this.f15265b = map;
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.f15266c < this.f15265b.size();
    }

    public E next() {
        b();
        E e11 = this.f15264a;
        this.f15266c++;
        a aVar = this.f15265b.get(e11);
        if (aVar != null) {
            this.f15264a = aVar.c();
            return e11;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e11 + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
