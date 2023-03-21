package v6;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: StrongMemoryCache.kt */
public interface g {
    void a(int i11);

    MemoryCache.b b(MemoryCache.Key key);

    void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map);
}
