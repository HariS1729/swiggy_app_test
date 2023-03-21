package i0;

import cp0.e;
import java.util.Iterator;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class j<K, V> extends e<K> {

    /* renamed from: a  reason: collision with root package name */
    private final f<K, V> f14838a;

    public j(f<K, V> fVar) {
        p.j(fVar, "builder");
        this.f14838a = fVar;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public int c() {
        return this.f14838a.size();
    }

    public void clear() {
        this.f14838a.clear();
    }

    public boolean contains(Object obj) {
        return this.f14838a.containsKey(obj);
    }

    public Iterator<K> iterator() {
        return new k(this.f14838a);
    }

    public boolean remove(Object obj) {
        if (!this.f14838a.containsKey(obj)) {
            return false;
        }
        this.f14838a.remove(obj);
        return true;
    }
}
