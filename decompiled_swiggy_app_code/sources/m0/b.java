package m0;

import java.util.List;
import java.util.Map;

/* compiled from: SaveableStateRegistry.kt */
public interface b {

    /* compiled from: SaveableStateRegistry.kt */
    public interface a {
        void unregister();
    }

    boolean a(Object obj);

    Map<String, List<Object>> b();

    Object c(String str);

    a d(String str, lp0.a<? extends Object> aVar);
}
