package i0;

import cp0.e;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends e<E> {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return d((Map.Entry) obj);
    }

    public final boolean d(E e11) {
        p.j(e11, "element");
        if (!((e11 instanceof Object ? e11 : null) instanceof Map.Entry)) {
            return false;
        }
        return f(e11);
    }

    public abstract boolean f(Map.Entry<? extends K, ? extends V> entry);

    public final boolean g(E e11) {
        p.j(e11, "element");
        if (!((e11 instanceof Object ? e11 : null) instanceof Map.Entry)) {
            return false;
        }
        return h(e11);
    }

    public abstract boolean h(Map.Entry<? extends K, ? extends V> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return g((Map.Entry) obj);
    }
}
