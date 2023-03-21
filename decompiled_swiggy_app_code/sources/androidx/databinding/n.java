package androidx.databinding;

import java.util.Map;

/* compiled from: ObservableMap */
public interface n<K, V> extends Map<K, V> {

    /* compiled from: ObservableMap */
    public static abstract class a<T extends n<K, V>, K, V> {
        public abstract void a(T t, K k);
    }

    void c(a<? extends n<K, V>, K, V> aVar);

    void i(a<? extends n<K, V>, K, V> aVar);
}
