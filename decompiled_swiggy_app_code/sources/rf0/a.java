package rf0;

import android.content.Context;
import android.content.SharedPreferences;
import bp0.h;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.services.precache.AssetPreCacheWorker;
import java.util.Map;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.HttpUrl;

/* compiled from: AssetPreCacheService.kt */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0242a f19860c = new C0242a((i) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19861d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f19862a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f19863b;

    /* renamed from: rf0.a$a  reason: collision with other inner class name */
    /* compiled from: AssetPreCacheService.kt */
    public static final class C0242a {
        private C0242a() {
        }

        public /* synthetic */ C0242a(i iVar) {
            this();
        }

        public final Map<String, String> a() {
            return x.i(h.a("ASSET_PRECACHE_WORKER_PAYLOAD_V2", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI), h.a("ASSET_PRECACHE_WORKER_INTERVAL_SECONDS", "86400"), h.a("ASSET_PRECACHE_SHOULD_RUN_WORKER", "true"), h.a("ASSET_PRECACHE_SHOULD_STOP_WORKER", "false"), h.a("ASSET_PRECACHE_WORKER_START_DELAY_SECONDS", "600"));
        }
    }

    public a(Context context, SharedPreferences sharedPreferences) {
        p.j(context, LogCategory.CONTEXT);
        p.j(sharedPreferences, "sharedPreferences");
        this.f19862a = context;
        this.f19863b = sharedPreferences;
    }

    private final long a() {
        return c.w(this.f19863b.getString("ASSET_PRECACHE_WORKER_INTERVAL_SECONDS", "86400"), Long.parseLong("86400"));
    }

    private final String b() {
        String string = this.f19863b.getString("ASSET_PRECACHE_WORKER_PAYLOAD_V2", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        return string == null ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : string;
    }

    private final long c() {
        return c.w(this.f19863b.getString("ASSET_PRECACHE_WORKER_INTERVAL_SECONDS_PREVIOUS", "-1"), Long.parseLong("-1"));
    }

    private final String d() {
        String string = this.f19863b.getString("ASSET_PRECACHE_WORKER_PAYLOAD_PREVIOUS", "");
        return string == null ? "" : string;
    }

    private final long e() {
        return c.w(this.f19863b.getString("ASSET_PRECACHE_WORKER_START_DELAY_SECONDS", "600"), Long.parseLong("600"));
    }

    private final boolean f() {
        String d11 = d();
        String b11 = b();
        if (!p.e(b11, d11)) {
            j(b11);
        }
        return !p.e(b11, d11);
    }

    private final boolean g() {
        long c11 = c();
        long a11 = a();
        int i11 = (a11 > c11 ? 1 : (a11 == c11 ? 0 : -1));
        if (i11 != 0) {
            i(a11);
        }
        return i11 != 0;
    }

    private final boolean h() {
        String b11 = b();
        return p.e(b11, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI) || o.A(b11);
    }

    private final void i(long j) {
        js.a.b(this.f19863b, "ASSET_PRECACHE_WORKER_INTERVAL_SECONDS_PREVIOUS", String.valueOf(j));
    }

    private final void j(String str) {
        js.a.b(this.f19863b, "ASSET_PRECACHE_WORKER_PAYLOAD_PREVIOUS", str);
    }

    private final boolean k() {
        return c.p(this.f19863b.getString("ASSET_PRECACHE_SHOULD_RUN_WORKER", "true"), true);
    }

    private final boolean l() {
        return c.p(this.f19863b.getString("ASSET_PRECACHE_SHOULD_STOP_WORKER", "false"), false);
    }

    private final void m() {
        AssetPreCacheWorker.k.a(this.f19862a, b(), e(), a());
    }

    private final void o() {
        AssetPreCacheWorker.k.b(this.f19862a);
    }

    private final boolean p() {
        return f() || l() || h() || g();
    }

    public void n() {
        if (p()) {
            o();
        }
        if (k() && c.e(Boolean.valueOf(h()))) {
            m();
        }
    }
}
