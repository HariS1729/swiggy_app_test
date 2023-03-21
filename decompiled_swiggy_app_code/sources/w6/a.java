package w6;

import coil.network.CacheResponse;
import coil.util.Time;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: CacheStrategy.kt */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0209a f17612c = new C0209a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Request f17613a;

    /* renamed from: b  reason: collision with root package name */
    private final CacheResponse f17614b;

    /* renamed from: w6.a$a  reason: collision with other inner class name */
    /* compiled from: CacheStrategy.kt */
    public static final class C0209a {
        private C0209a() {
        }

        public /* synthetic */ C0209a(i iVar) {
            this();
        }

        private final boolean d(String str) {
            if (o.x("Content-Length", str, true) || o.x("Content-Encoding", str, true) || o.x("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        private final boolean e(String str) {
            if (o.x(HttpRequest.HEADER_CONNECTION, str, true) || o.x("Keep-Alive", str, true) || o.x("Proxy-Authenticate", str, true) || o.x("Proxy-Authorization", str, true) || o.x("TE", str, true) || o.x("Trailers", str, true) || o.x("Transfer-Encoding", str, true) || o.x("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        public final Headers a(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                String name = headers.name(i12);
                String value = headers.value(i12);
                if ((!o.x("Warning", name, true) || !o.N(value, "1", false, 2, (Object) null)) && (d(name) || !e(name) || headers2.get(name) == null)) {
                    builder.add(name, value);
                }
                i12 = i13;
            }
            int size2 = headers2.size();
            while (i11 < size2) {
                int i14 = i11 + 1;
                String name2 = headers2.name(i11);
                if (!d(name2) && e(name2)) {
                    builder.add(name2, headers2.value(i11));
                }
                i11 = i14;
            }
            return builder.build();
        }

        public final boolean b(Request request, CacheResponse cacheResponse) {
            return !request.cacheControl().noStore() && !cacheResponse.a().noStore() && !p.e(cacheResponse.d().get("Vary"), "*");
        }

        public final boolean c(Request request, Response response) {
            return !request.cacheControl().noStore() && !response.cacheControl().noStore() && !p.e(response.headers().get("Vary"), "*");
        }
    }

    @Instrumented
    /* compiled from: CacheStrategy.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Request f17615a;

        /* renamed from: b  reason: collision with root package name */
        private final CacheResponse f17616b;

        /* renamed from: c  reason: collision with root package name */
        private Date f17617c;

        /* renamed from: d  reason: collision with root package name */
        private String f17618d;

        /* renamed from: e  reason: collision with root package name */
        private Date f17619e;

        /* renamed from: f  reason: collision with root package name */
        private String f17620f;

        /* renamed from: g  reason: collision with root package name */
        private Date f17621g;

        /* renamed from: h  reason: collision with root package name */
        private long f17622h;

        /* renamed from: i  reason: collision with root package name */
        private long f17623i;
        private String j;
        private int k = -1;

        public b(Request request, CacheResponse cacheResponse) {
            this.f17615a = request;
            this.f17616b = cacheResponse;
            if (cacheResponse != null) {
                this.f17622h = cacheResponse.e();
                this.f17623i = cacheResponse.c();
                Headers d11 = cacheResponse.d();
                int i11 = 0;
                int size = d11.size();
                while (i11 < size) {
                    int i12 = i11 + 1;
                    String name = d11.name(i11);
                    String value = d11.value(i11);
                    if (o.x(name, "Date", true)) {
                        this.f17617c = d11.getDate("Date");
                        this.f17618d = value;
                    } else if (o.x(name, "Expires", true)) {
                        this.f17621g = d11.getDate("Expires");
                    } else if (o.x(name, HttpRequest.HEADER_LAST_MODIFIED, true)) {
                        this.f17619e = d11.getDate(HttpRequest.HEADER_LAST_MODIFIED);
                        this.f17620f = value;
                    } else if (o.x(name, "ETag", true)) {
                        this.j = value;
                    } else if (o.x(name, "Age", true)) {
                        this.k = c7.i.y(value, -1);
                    }
                    i11 = i12;
                }
            }
        }

        private final long a() {
            Date date = this.f17617c;
            long j11 = 0;
            if (date != null) {
                j11 = Math.max(0, this.f17623i - date.getTime());
            }
            int i11 = this.k;
            if (i11 != -1) {
                j11 = Math.max(j11, TimeUnit.SECONDS.toMillis((long) i11));
            }
            return j11 + (this.f17623i - this.f17622h) + (Time.f13691a.a() - this.f17623i);
        }

        private final long c() {
            CacheResponse cacheResponse = this.f17616b;
            p.g(cacheResponse);
            CacheControl a11 = cacheResponse.a();
            if (a11.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis((long) a11.maxAgeSeconds());
            }
            Date date = this.f17621g;
            Long l11 = null;
            if (date != null) {
                Date date2 = this.f17617c;
                if (date2 != null) {
                    l11 = Long.valueOf(date2.getTime());
                }
                long time = date.getTime() - (l11 == null ? this.f17623i : l11.longValue());
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f17619e == null || this.f17615a.url().query() != null) {
                return 0;
            } else {
                Date date3 = this.f17617c;
                if (date3 != null) {
                    l11 = Long.valueOf(date3.getTime());
                }
                long longValue = l11 == null ? this.f17622h : l11.longValue();
                Date date4 = this.f17619e;
                p.g(date4);
                long time2 = longValue - date4.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
                return 0;
            }
        }

        private final boolean d(Request request) {
            return (request.header("If-Modified-Since") == null && request.header(HttpRequest.HEADER_IF_NONE_MATCH) == null) ? false : true;
        }

        public final a b() {
            if (this.f17616b == null) {
                return new a(this.f17615a, (CacheResponse) null, (i) null);
            }
            if (this.f17615a.isHttps() && !this.f17616b.f()) {
                return new a(this.f17615a, (CacheResponse) null, (i) null);
            }
            CacheControl a11 = this.f17616b.a();
            if (!a.f17612c.b(this.f17615a, this.f17616b)) {
                return new a(this.f17615a, (CacheResponse) null, (i) null);
            }
            CacheControl cacheControl = this.f17615a.cacheControl();
            if (cacheControl.noCache() || d(this.f17615a)) {
                return new a(this.f17615a, (CacheResponse) null, (i) null);
            }
            long a12 = a();
            long c11 = c();
            if (cacheControl.maxAgeSeconds() != -1) {
                c11 = Math.min(c11, TimeUnit.SECONDS.toMillis((long) cacheControl.maxAgeSeconds()));
            }
            long j11 = 0;
            long millis = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis((long) cacheControl.minFreshSeconds()) : 0;
            if (!a11.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                j11 = TimeUnit.SECONDS.toMillis((long) cacheControl.maxStaleSeconds());
            }
            if (!a11.noCache() && a12 + millis < c11 + j11) {
                return new a((Request) null, this.f17616b, (i) null);
            }
            String str = this.j;
            String str2 = "If-Modified-Since";
            if (str != null) {
                str2 = HttpRequest.HEADER_IF_NONE_MATCH;
            } else if (this.f17619e != null) {
                str = this.f17620f;
            } else if (this.f17617c == null) {
                return new a(this.f17615a, (CacheResponse) null, (i) null);
            } else {
                str = this.f17618d;
            }
            Headers.Builder newBuilder = this.f17615a.headers().newBuilder();
            p.g(str);
            newBuilder.add(str2, str);
            Request.Builder headers = this.f17615a.newBuilder().headers(newBuilder.build());
            return new a(!(headers instanceof Request.Builder) ? headers.build() : OkHttp3Instrumentation.build(headers), this.f17616b, (i) null);
        }
    }

    private a(Request request, CacheResponse cacheResponse) {
        this.f17613a = request;
        this.f17614b = cacheResponse;
    }

    public /* synthetic */ a(Request request, CacheResponse cacheResponse, i iVar) {
        this(request, cacheResponse);
    }

    public final CacheResponse a() {
        return this.f17614b;
    }

    public final Request b() {
        return this.f17613a;
    }
}
