package v6;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: WeakMemoryCache.kt */
public interface h {
    void a(int i11);

    MemoryCache.b b(MemoryCache.Key key);

    void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map, int i11);
}
