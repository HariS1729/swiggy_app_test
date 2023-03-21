package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import cp0.a;
import g0.c;
import g0.d;
import g0.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.p;

/* compiled from: AbstractPersistentList.kt */
public abstract class AbstractPersistentList<E> extends a<E> implements f<E> {
    public f<E> addAll(Collection<? extends E> collection) {
        p.j(collection, "elements");
        f.a j = j();
        j.addAll(collection);
        return j.build();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
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

    /* renamed from: d */
    public d<E> subList(int i11, int i12) {
        return c.a(this, i11, i12);
    }

    public Iterator<E> iterator() {
        return listIterator();
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public f<E> remove(E e11) {
        int indexOf = indexOf(e11);
        return indexOf != -1 ? C(indexOf) : this;
    }

    public f<E> removeAll(Collection<? extends E> collection) {
        p.j(collection, "elements");
        return x(new AbstractPersistentList$removeAll$1(collection));
    }
}
