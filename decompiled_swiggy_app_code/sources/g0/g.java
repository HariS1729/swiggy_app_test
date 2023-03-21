package g0;

import java.util.Map;
import mp0.e;

/* compiled from: ImmutableMap.kt */
public interface g<K, V> extends Map, mp0.a {

    /* compiled from: ImmutableMap.kt */
    public interface a<K, V> extends Map<K, V>, e {
        g<K, V> build();
    }

    a<K, V> j();
}
