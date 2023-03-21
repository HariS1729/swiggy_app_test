package e0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: Recomposer.kt */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f14215a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f14216b = new Object();

    public static final <K, V> boolean a(Map<K, List<V>> map, K k, V v) {
        p.j(map, "<this>");
        List<V> list = map.get(k);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k, list);
        }
        return list.add(v);
    }

    public static final <K, V> V b(Map<K, List<V>> map, K k) {
        p.j(map, "<this>");
        List list = map.get(k);
        if (list == null) {
            return null;
        }
        V F = p.F(list);
        if (!list.isEmpty()) {
            return F;
        }
        map.remove(k);
        return F;
    }
}
