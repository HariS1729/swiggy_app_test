package i0;

import cp0.b;
import java.util.Iterator;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
public final class l<K, V> extends b<V> {

    /* renamed from: a  reason: collision with root package name */
    private final f<K, V> f14839a;

    public l(f<K, V> fVar) {
        p.j(fVar, "builder");
        this.f14839a = fVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public int c() {
        return this.f14839a.size();
    }

    public void clear() {
        this.f14839a.clear();
    }

    public boolean contains(Object obj) {
        return this.f14839a.containsValue(obj);
    }

    public Iterator<V> iterator() {
        return new m(this.f14839a);
    }
}
