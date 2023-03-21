package v6;

import android.graphics.Bitmap;
import androidx.collection.f;
import coil.memory.MemoryCache;
import java.util.Map;

/* compiled from: StrongMemoryCache.kt */
public final class e implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f17334a;

    /* renamed from: b  reason: collision with root package name */
    private final b f17335b;

    /* compiled from: StrongMemoryCache.kt */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f17336a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f17337b;

        /* renamed from: c  reason: collision with root package name */
        private final int f17338c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i11) {
            this.f17336a = bitmap;
            this.f17337b = map;
            this.f17338c = i11;
        }

        public final Bitmap a() {
            return this.f17336a;
        }

        public final Map<String, Object> b() {
            return this.f17337b;
        }

        public final int c() {
            return this.f17338c;
        }
    }

    /* compiled from: StrongMemoryCache.kt */
    public static final class b extends f<MemoryCache.Key, a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f17339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f17340b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i11, e eVar) {
            super(i11);
            this.f17339a = i11;
            this.f17340b = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void entryRemoved(boolean z11, MemoryCache.Key key, a aVar, a aVar2) {
            this.f17340b.f17334a.c(key, aVar.a(), aVar.b(), aVar.c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int sizeOf(MemoryCache.Key key, a aVar) {
            return aVar.c();
        }
    }

    public e(int i11, h hVar) {
        this.f17334a = hVar;
        this.f17335b = new b(i11, this);
    }

    public void a(int i11) {
        if (i11 >= 40) {
            e();
            return;
        }
        boolean z11 = false;
        if (10 <= i11 && i11 < 20) {
            z11 = true;
        }
        if (z11) {
            this.f17335b.trimToSize(g() / 2);
        }
    }

    public MemoryCache.b b(MemoryCache.Key key) {
        a aVar = (a) this.f17335b.get(key);
        if (aVar == null) {
            return null;
        }
        return new MemoryCache.b(aVar.a(), aVar.b());
    }

    public void c(MemoryCache.Key key, Bitmap bitmap, Map<String, ? extends Object> map) {
        int a11 = c7.a.a(bitmap);
        if (a11 <= f()) {
            this.f17335b.put(key, new a(bitmap, map, a11));
            return;
        }
        this.f17335b.remove(key);
        this.f17334a.c(key, bitmap, map, a11);
    }

    public void e() {
        this.f17335b.evictAll();
    }

    public int f() {
        return this.f17335b.maxSize();
    }

    public int g() {
        return this.f17335b.size();
    }
}
