package n0;

import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import mp0.f;

/* compiled from: SnapshotStateMap.kt */
abstract class j<K, V, E> implements Set<E>, f {

    /* renamed from: a  reason: collision with root package name */
    private final n<K, V> f15740a;

    public j(n<K, V> nVar) {
        p.j(nVar, "map");
        this.f15740a = nVar;
    }

    public final n<K, V> c() {
        return this.f15740a;
    }

    public void clear() {
        this.f15740a.clear();
    }

    public int f() {
        return this.f15740a.size();
    }

    public boolean isEmpty() {
        return this.f15740a.isEmpty();
    }

    public final /* bridge */ int size() {
        return f();
    }

    public Object[] toArray() {
        return h.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        p.j(tArr, "array");
        return h.b(this, tArr);
    }
}
