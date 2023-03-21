package v6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c7.h;
import c7.q;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import coil.size.Scale;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import o6.d;
import s6.a;
import x6.g;
import x6.k;
import x6.m;
import x6.n;
import y6.b;
import y6.c;

/* compiled from: MemoryCacheService.kt */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f17328d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final ImageLoader f17329a;

    /* renamed from: b  reason: collision with root package name */
    private final m f17330b;

    /* renamed from: c  reason: collision with root package name */
    private final q f17331c;

    /* compiled from: MemoryCacheService.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public c(ImageLoader imageLoader, m mVar, q qVar) {
        this.f17329a = imageLoader;
        this.f17330b = mVar;
        this.f17331c = qVar;
    }

    private final String b(MemoryCache.b bVar) {
        Object obj = bVar.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(MemoryCache.b bVar) {
        Object obj = bVar.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final boolean e(g gVar, MemoryCache.Key key, MemoryCache.b bVar, y6.g gVar2, Scale scale) {
        Scale scale2 = scale;
        boolean d11 = d(bVar);
        if (!b.a(gVar2)) {
            String str = key.c().get("coil#transformation_size");
            if (str != null) {
                return p.e(str, gVar2.toString());
            }
            int width = bVar.a().getWidth();
            int height = bVar.a().getHeight();
            y6.c b11 = gVar2.b();
            int i11 = Integer.MAX_VALUE;
            int i12 = b11 instanceof c.a ? ((c.a) b11).f18024a : Integer.MAX_VALUE;
            y6.c a11 = gVar2.a();
            if (a11 instanceof c.a) {
                i11 = ((c.a) a11).f18024a;
            }
            double c11 = d.c(width, height, i12, i11, scale2);
            boolean a12 = h.a(gVar);
            if (a12) {
                double g11 = l.g(c11, 1.0d);
                if (Math.abs(((double) i12) - (((double) width) * g11)) <= 1.0d || Math.abs(((double) i11) - (g11 * ((double) height))) <= 1.0d) {
                    return true;
                }
            } else if ((c7.i.s(i12) || Math.abs(i12 - width) <= 1) && (c7.i.s(i11) || Math.abs(i11 - height) <= 1)) {
                return true;
            }
            if (!(c11 == 1.0d) && !a12) {
                q qVar = this.f17331c;
                if (qVar == null || qVar.getLevel() > 3) {
                    return false;
                }
                qVar.a("MemoryCacheService", 3, gVar.m() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + gVar2.b() + ", " + gVar2.a() + ", " + scale2 + ").", (Throwable) null);
                return false;
            } else if (c11 <= 1.0d || !d11) {
                return true;
            } else {
                q qVar2 = this.f17331c;
                if (qVar2 == null || qVar2.getLevel() > 3) {
                    return false;
                }
                qVar2.a("MemoryCacheService", 3, gVar.m() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + gVar2.b() + ", " + gVar2.a() + ", " + scale2 + ").", (Throwable) null);
                return false;
            }
        } else if (!d11) {
            return true;
        } else {
            q qVar3 = this.f17331c;
            if (qVar3 != null && qVar3.getLevel() <= 3) {
                qVar3.a("MemoryCacheService", 3, gVar.m() + ": Requested original size, but cached image is sampled.", (Throwable) null);
            }
            return false;
        }
    }

    public final MemoryCache.b a(g gVar, MemoryCache.Key key, y6.g gVar2, Scale scale) {
        if (!gVar.C().getReadEnabled()) {
            return null;
        }
        MemoryCache d11 = this.f17329a.d();
        MemoryCache.b b11 = d11 == null ? null : d11.b(key);
        if (b11 != null && c(gVar, key, b11, gVar2, scale)) {
            return b11;
        }
        return null;
    }

    public final boolean c(g gVar, MemoryCache.Key key, MemoryCache.b bVar, y6.g gVar2, Scale scale) {
        if (this.f17330b.c(gVar, c7.a.c(bVar.a()))) {
            return e(gVar, key, bVar, gVar2, scale);
        }
        q qVar = this.f17331c;
        if (qVar == null || qVar.getLevel() > 3) {
            return false;
        }
        qVar.a("MemoryCacheService", 3, gVar.m() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", (Throwable) null);
        return false;
    }

    public final MemoryCache.Key f(g gVar, Object obj, k kVar, m6.c cVar) {
        MemoryCache.Key B = gVar.B();
        if (B != null) {
            return B;
        }
        cVar.m(gVar, obj);
        String f11 = this.f17329a.getComponents().f(obj, kVar);
        cVar.q(gVar, f11);
        if (f11 == null) {
            return null;
        }
        List<a7.a> O = gVar.O();
        Map<String, String> c11 = gVar.E().c();
        if (O.isEmpty() && c11.isEmpty()) {
            return new MemoryCache.Key(f11, (Map) null, 2, (i) null);
        }
        Map t = x.t(c11);
        if (!O.isEmpty()) {
            List<a7.a> O2 = gVar.O();
            int size = O2.size();
            for (int i11 = 0; i11 < size; i11++) {
                t.put(p.s("coil#transformation_", Integer.valueOf(i11)), O2.get(i11).a());
            }
            t.put("coil#transformation_size", kVar.n().toString());
        }
        return new MemoryCache.Key(f11, t);
    }

    public final n g(a.C0186a aVar, g gVar, MemoryCache.Key key, MemoryCache.b bVar) {
        return new n(new BitmapDrawable(gVar.l().getResources(), bVar.a()), gVar, DataSource.MEMORY_CACHE, key, b(bVar), d(bVar), c7.i.t(aVar));
    }

    public final boolean h(MemoryCache.Key key, g gVar, EngineInterceptor.b bVar) {
        MemoryCache d11;
        if (!gVar.C().getWriteEnabled() || (d11 = this.f17329a.d()) == null || key == null) {
            return false;
        }
        Drawable e11 = bVar.e();
        Bitmap bitmap = null;
        BitmapDrawable bitmapDrawable = e11 instanceof BitmapDrawable ? (BitmapDrawable) e11 : null;
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        if (bitmap == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar.f()));
        String d12 = bVar.d();
        if (d12 != null) {
            linkedHashMap.put("coil#disk_cache_key", d12);
        }
        d11.c(key, new MemoryCache.b(bitmap, linkedHashMap));
        return true;
    }
}
