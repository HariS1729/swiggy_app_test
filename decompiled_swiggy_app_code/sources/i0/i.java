package i0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.p;
import mp0.a;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, a {

    /* renamed from: a  reason: collision with root package name */
    private final g<K, V, Map.Entry<K, V>> f14837a;

    public i(f<K, V> fVar) {
        p.j(fVar, "builder");
        u[] uVarArr = new u[8];
        for (int i11 = 0; i11 < 8; i11++) {
            uVarArr[i11] = new y(this);
        }
        this.f14837a = new g<>(fVar, uVarArr);
    }

    /* renamed from: b */
    public Map.Entry<K, V> next() {
        return this.f14837a.next();
    }

    public final void c(K k, V v) {
        this.f14837a.m(k, v);
    }

    public boolean hasNext() {
        return this.f14837a.hasNext();
    }

    public void remove() {
        this.f14837a.remove();
    }
}
