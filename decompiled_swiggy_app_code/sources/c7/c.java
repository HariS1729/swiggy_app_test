package c7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Collections.kt */
public final class c {
    public static final <T> List<T> a(List<? extends T> list) {
        int size = list.size();
        if (size == 0) {
            return k.j();
        }
        if (size != 1) {
            return Collections.unmodifiableList(new ArrayList(list));
        }
        return Collections.singletonList(s.W(list));
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return x.f();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) s.V(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
