package i1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SubcomposeLayout.kt */
public interface k0 {
    void a(a aVar);

    boolean b(Object obj, Object obj2);

    /* compiled from: SubcomposeLayout.kt */
    public static final class a implements Collection<Object>, mp0.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Object> f14888a;

        public a(Set<Object> set) {
            p.j(set, "set");
            this.f14888a = set;
        }

        /* renamed from: a */
        public final boolean add(Object obj) {
            return this.f14888a.add(obj);
        }

        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int c() {
            return this.f14888a.size();
        }

        public final void clear() {
            this.f14888a.clear();
        }

        public boolean contains(Object obj) {
            return this.f14888a.contains(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            p.j(collection, "elements");
            return this.f14888a.containsAll(collection);
        }

        public boolean isEmpty() {
            return this.f14888a.isEmpty();
        }

        public Iterator<Object> iterator() {
            return this.f14888a.iterator();
        }

        public final boolean remove(Object obj) {
            return this.f14888a.remove(obj);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            p.j(collection, "slotIds");
            return this.f14888a.remove(collection);
        }

        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            p.j(collection, "slotIds");
            return this.f14888a.retainAll(collection);
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

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Set set, int i11, i iVar) {
            this((i11 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }
}
