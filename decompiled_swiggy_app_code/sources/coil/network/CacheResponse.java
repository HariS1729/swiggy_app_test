package coil.network;

import bp0.f;
import kotlin.LazyThreadSafetyMode;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.d;
import okio.e;

/* compiled from: CacheResponse.kt */
public final class CacheResponse {

    /* renamed from: a  reason: collision with root package name */
    private final f f13654a;

    /* renamed from: b  reason: collision with root package name */
    private final f f13655b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13656c;

    /* renamed from: d  reason: collision with root package name */
    private final long f13657d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f13658e;

    /* renamed from: f  reason: collision with root package name */
    private final Headers f13659f;

    public CacheResponse(e eVar) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f13654a = b.a(lazyThreadSafetyMode, new CacheResponse$cacheControl$2(this));
        this.f13655b = b.a(lazyThreadSafetyMode, new CacheResponse$contentType$2(this));
        this.f13656c = Long.parseLong(eVar.F0());
        this.f13657d = Long.parseLong(eVar.F0());
        int i11 = 0;
        this.f13658e = Integer.parseInt(eVar.F0()) > 0;
        int parseInt = Integer.parseInt(eVar.F0());
        Headers.Builder builder = new Headers.Builder();
        while (i11 < parseInt) {
            i11++;
            builder.add(eVar.F0());
        }
        this.f13659f = builder.build();
    }

    public final CacheControl a() {
        return (CacheControl) this.f13654a.getValue();
    }

    public final MediaType b() {
        return (MediaType) this.f13655b.getValue();
    }

    public final long c() {
        return this.f13657d;
    }

    public final Headers d() {
        return this.f13659f;
    }

    public final long e() {
        return this.f13656c;
    }

    public final boolean f() {
        return this.f13658e;
    }

    public final void g(d dVar) {
        dVar.G(this.f13656c).O(10);
        dVar.G(this.f13657d).O(10);
        dVar.G(this.f13658e ? 1 : 0).O(10);
        dVar.G((long) this.f13659f.size()).O(10);
        int size = this.f13659f.size();
        for (int i11 = 0; i11 < size; i11++) {
            dVar.B0(this.f13659f.name(i11)).B0(": ").B0(this.f13659f.value(i11)).O(10);
        }
    }

    public CacheResponse(Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f13654a = b.a(lazyThreadSafetyMode, new CacheResponse$cacheControl$2(this));
        this.f13655b = b.a(lazyThreadSafetyMode, new CacheResponse$contentType$2(this));
        this.f13656c = response.sentRequestAtMillis();
        this.f13657d = response.receivedResponseAtMillis();
        this.f13658e = response.handshake() != null;
        this.f13659f = response.headers();
    }
}
