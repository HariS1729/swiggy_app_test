package v6;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: StrongMemoryCache.kt */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h f17327a;

    public a(h hVar) {
        this.f17327a = hVar;
    }

    public void a(int i11) {
    }

    public MemoryCache.b b(MemoryCache.Key key) {
        return null;
    }

    public void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map) {
        this.f17327a.c(key, bitmap, map, c7.a.a(bitmap));
    }
}
