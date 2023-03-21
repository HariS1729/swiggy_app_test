package n0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.p;
import mp0.a;

/* compiled from: SnapshotStateMap.kt */
final class r<K, V> extends q<K, V> implements Iterator<K>, a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(n<K, V> nVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        super(nVar, it2);
        p.j(nVar, "map");
        p.j(it2, "iterator");
    }

    public K next() {
        Map.Entry g11 = g();
        if (g11 != null) {
            c();
            return g11.getKey();
        }
        throw new IllegalStateException();
    }
}
