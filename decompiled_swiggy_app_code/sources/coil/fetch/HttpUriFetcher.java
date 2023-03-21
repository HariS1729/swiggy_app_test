package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import bp0.f;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.network.CacheResponse;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import o6.l;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.d;
import okio.e;
import okio.u;
import p6.a;
import r6.h;
import x6.k;

@Instrumented
/* compiled from: HttpUriFetcher.kt */
public final class HttpUriFetcher implements h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f13545f = new a((i) null);

    /* renamed from: g  reason: collision with root package name */
    private static final CacheControl f13546g = new CacheControl.Builder().noCache().noStore().build();

    /* renamed from: h  reason: collision with root package name */
    private static final CacheControl f13547h = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* renamed from: a  reason: collision with root package name */
    private final String f13548a;

    /* renamed from: b  reason: collision with root package name */
    private final k f13549b;

    /* renamed from: c  reason: collision with root package name */
    private final f<Call.Factory> f13550c;

    /* renamed from: d  reason: collision with root package name */
    private final f<p6.a> f13551d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f13552e;

    /* compiled from: HttpUriFetcher.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: HttpUriFetcher.kt */
    public static final class b implements h.a<Uri> {

        /* renamed from: a  reason: collision with root package name */
        private final f<Call.Factory> f13553a;

        /* renamed from: b  reason: collision with root package name */
        private final f<p6.a> f13554b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f13555c;

        public b(f<? extends Call.Factory> fVar, f<? extends p6.a> fVar2, boolean z11) {
            this.f13553a = fVar;
            this.f13554b = fVar2;
            this.f13555c = z11;
        }

        private final boolean c(Uri uri) {
            return p.e(uri.getScheme(), "http") || p.e(uri.getScheme(), "https");
        }

        /* renamed from: b */
        public h a(Uri uri, k kVar, ImageLoader imageLoader) {
            if (!c(uri)) {
                return null;
            }
            return new HttpUriFetcher(uri.toString(), kVar, this.f13553a, this.f13554b, this.f13555c);
        }
    }

    public HttpUriFetcher(String str, k kVar, f<? extends Call.Factory> fVar, f<? extends p6.a> fVar2, boolean z11) {
        this.f13548a = str;
        this.f13549b = kVar;
        this.f13550c = fVar;
        this.f13551d = fVar2;
        this.f13552e = z11;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(okhttp3.Request r5, fp0.c<? super okhttp3.Response> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = (coil.fetch.HttpUriFetcher$executeNetworkRequest$1) r0
            int r1 = r0.f13558c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13558c = r1
            goto L_0x0018
        L_0x0013:
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = new coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f13556a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f13558c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            bp0.g.b(r6)
            goto L_0x0088
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            bp0.g.b(r6)
            boolean r6 = c7.i.r()
            if (r6 == 0) goto L_0x0068
            x6.k r6 = r4.f13549b
            coil.request.CachePolicy r6 = r6.k()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L_0x0062
            bp0.f<okhttp3.Call$Factory> r6 = r4.f13550c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            boolean r0 = r6 instanceof okhttp3.OkHttpClient
            if (r0 != 0) goto L_0x0057
            okhttp3.Call r5 = r6.newCall(r5)
            goto L_0x005d
        L_0x0057:
            okhttp3.OkHttpClient r6 = (okhttp3.OkHttpClient) r6
            okhttp3.Call r5 = com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation.newCall(r6, r5)
        L_0x005d:
            okhttp3.Response r5 = r5.execute()
            goto L_0x008b
        L_0x0062:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L_0x0068:
            bp0.f<okhttp3.Call$Factory> r6 = r4.f13550c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            boolean r2 = r6 instanceof okhttp3.OkHttpClient
            if (r2 != 0) goto L_0x0079
            okhttp3.Call r5 = r6.newCall(r5)
            goto L_0x007f
        L_0x0079:
            okhttp3.OkHttpClient r6 = (okhttp3.OkHttpClient) r6
            okhttp3.Call r5 = com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation.newCall(r6, r5)
        L_0x007f:
            r0.f13558c = r3
            java.lang.Object r6 = c7.b.a(r5, r0)
            if (r6 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L_0x008b:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto L_0x00a9
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L_0x00a9
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 != 0) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            c7.i.c(r6)
        L_0x00a3:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L_0x00a9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.c(okhttp3.Request, fp0.c):java.lang.Object");
    }

    private final String d() {
        String h11 = this.f13549b.h();
        return h11 == null ? this.f13548a : h11;
    }

    private final okio.i e() {
        p6.a value = this.f13551d.getValue();
        p.g(value);
        return value.b();
    }

    private final boolean g(Request request, Response response) {
        return this.f13549b.i().getWriteEnabled() && (!this.f13552e || w6.a.f17612c.c(request, response));
    }

    private final Request h() {
        Request.Builder headers = new Request.Builder().url(this.f13548a).headers(this.f13549b.j());
        for (Map.Entry next : this.f13549b.o().a().entrySet()) {
            headers.tag((Class) next.getKey(), next.getValue());
        }
        boolean readEnabled = this.f13549b.i().getReadEnabled();
        boolean readEnabled2 = this.f13549b.k().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                headers.cacheControl(f13547h);
            }
        } else if (this.f13549b.i().getWriteEnabled()) {
            headers.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            headers.cacheControl(f13546g);
        }
        return !(headers instanceof Request.Builder) ? headers.build() : OkHttp3Instrumentation.build(headers);
    }

    private final a.c i() {
        p6.a value;
        if (!this.f13549b.i().getReadEnabled() || (value = this.f13551d.getValue()) == null) {
            return null;
        }
        return value.a(d());
    }

    private final ResponseBody j(Response response) {
        ResponseBody body = response.body();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    private final CacheResponse k(a.c cVar) {
        CacheResponse cacheResponse;
        try {
            e d11 = u.d(e().q(cVar.getMetadata()));
            try {
                cacheResponse = new CacheResponse(d11);
                th = null;
            } catch (Throwable th2) {
                th = th2;
                cacheResponse = null;
            }
            if (d11 != null) {
                try {
                    d11.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        b.a(th, th3);
                    }
                }
            }
            if (th == null) {
                p.g(cacheResponse);
                return cacheResponse;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    private final DataSource l(Response response) {
        return response.networkResponse() != null ? DataSource.NETWORK : DataSource.DISK;
    }

    private final o6.k m(ResponseBody responseBody) {
        return l.a(responseBody.source(), this.f13549b.g());
    }

    private final o6.k n(a.c cVar) {
        return l.c(cVar.getData(), e(), d(), cVar);
    }

    private final a.c o(a.c cVar, Request request, Response response, CacheResponse cacheResponse) {
        a.b bVar;
        bp0.k kVar;
        Long l11;
        bp0.k kVar2;
        Throwable th2 = null;
        if (!g(request, response)) {
            if (cVar != null) {
                c7.i.c(cVar);
            }
            return null;
        }
        if (cVar != null) {
            bVar = cVar.V();
        } else {
            p6.a value = this.f13551d.getValue();
            bVar = value == null ? null : value.c(d());
        }
        if (bVar == null) {
            return null;
        }
        try {
            if (response.code() != 304 || cacheResponse == null) {
                d c11 = u.c(e().p(bVar.getMetadata(), false));
                try {
                    new CacheResponse(response).g(c11);
                    kVar = bp0.k.f22762a;
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                    kVar = null;
                }
                if (c11 != null) {
                    try {
                        c11.close();
                    } catch (Throwable th4) {
                        if (th == null) {
                            th = th4;
                        } else {
                            b.a(th, th4);
                        }
                    }
                }
                if (th == null) {
                    p.g(kVar);
                    d c12 = u.c(e().p(bVar.getData(), false));
                    try {
                        ResponseBody body = response.body();
                        p.g(body);
                        l11 = Long.valueOf(body.source().g0(c12));
                    } catch (Throwable th5) {
                        th2 = th5;
                        l11 = null;
                    }
                    if (c12 != null) {
                        try {
                            c12.close();
                        } catch (Throwable th6) {
                            if (th2 == null) {
                                th2 = th6;
                            } else {
                                b.a(th2, th6);
                            }
                        }
                    }
                    if (th2 == null) {
                        p.g(l11);
                    } else {
                        throw th2;
                    }
                } else {
                    throw th;
                }
            } else {
                Response build = (!(response instanceof Response.Builder) ? response.newBuilder() : OkHttp3Instrumentation.newBuilder((Response.Builder) response)).headers(w6.a.f17612c.a(cacheResponse.d(), response.headers())).build();
                d c13 = u.c(e().p(bVar.getMetadata(), false));
                try {
                    new CacheResponse(build).g(c13);
                    kVar2 = bp0.k.f22762a;
                } catch (Throwable th7) {
                    th2 = th7;
                    kVar2 = null;
                }
                if (c13 != null) {
                    try {
                        c13.close();
                    } catch (Throwable th8) {
                        if (th2 == null) {
                            th2 = th8;
                        } else {
                            b.a(th2, th8);
                        }
                    }
                }
                if (th2 == null) {
                    p.g(kVar2);
                } else {
                    throw th2;
                }
            }
            a.c a11 = bVar.a();
            c7.i.c(response);
            return a11;
        } catch (Exception e11) {
            c7.i.a(bVar);
            throw e11;
        } catch (Throwable th9) {
            c7.i.c(response);
            throw th9;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0128 A[Catch:{ Exception -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0145 A[Catch:{ Exception -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(fp0.c<? super r6.g> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof coil.fetch.HttpUriFetcher$fetch$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            coil.fetch.HttpUriFetcher$fetch$1 r0 = (coil.fetch.HttpUriFetcher$fetch$1) r0
            int r1 = r0.f13564f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13564f = r1
            goto L_0x0018
        L_0x0013:
            coil.fetch.HttpUriFetcher$fetch$1 r0 = new coil.fetch.HttpUriFetcher$fetch$1
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f13562d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f13564f
            r3 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005e
            if (r2 == r6) goto L_0x0047
            if (r2 != r5) goto L_0x003f
            java.lang.Object r1 = r0.f13561c
            okhttp3.Response r1 = (okhttp3.Response) r1
            java.lang.Object r2 = r0.f13560b
            p6.a$c r2 = (p6.a.c) r2
            java.lang.Object r0 = r0.f13559a
            coil.fetch.HttpUriFetcher r0 = (coil.fetch.HttpUriFetcher) r0
            bp0.g.b(r13)     // Catch:{ Exception -> 0x003c }
            goto L_0x017e
        L_0x003c:
            r13 = move-exception
            goto L_0x019f
        L_0x003f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0047:
            java.lang.Object r2 = r0.f13561c
            w6.a r2 = (w6.a) r2
            java.lang.Object r6 = r0.f13560b
            p6.a$c r6 = (p6.a.c) r6
            java.lang.Object r8 = r0.f13559a
            coil.fetch.HttpUriFetcher r8 = (coil.fetch.HttpUriFetcher) r8
            bp0.g.b(r13)     // Catch:{ Exception -> 0x005b }
            r11 = r6
            r6 = r2
            r2 = r11
            goto L_0x0114
        L_0x005b:
            r13 = move-exception
            goto L_0x01a9
        L_0x005e:
            bp0.g.b(r13)
            p6.a$c r13 = r12.i()
            if (r13 == 0) goto L_0x00ec
            okio.i r2 = r12.e()     // Catch:{ Exception -> 0x01a6 }
            okio.z r8 = r13.getMetadata()     // Catch:{ Exception -> 0x01a6 }
            okio.h r2 = r2.l(r8)     // Catch:{ Exception -> 0x01a6 }
            java.lang.Long r2 = r2.d()     // Catch:{ Exception -> 0x01a6 }
            if (r2 != 0) goto L_0x007a
            goto L_0x0094
        L_0x007a:
            long r8 = r2.longValue()     // Catch:{ Exception -> 0x01a6 }
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            r6.k r0 = new r6.k     // Catch:{ Exception -> 0x01a6 }
            o6.k r1 = r12.n(r13)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = r12.f13548a     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = r12.f(r2, r7)     // Catch:{ Exception -> 0x01a6 }
            coil.decode.DataSource r3 = coil.decode.DataSource.DISK     // Catch:{ Exception -> 0x01a6 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x01a6 }
            return r0
        L_0x0094:
            boolean r2 = r12.f13552e     // Catch:{ Exception -> 0x01a6 }
            if (r2 == 0) goto L_0x00cf
            w6.a$b r2 = new w6.a$b     // Catch:{ Exception -> 0x01a6 }
            okhttp3.Request r8 = r12.h()     // Catch:{ Exception -> 0x01a6 }
            coil.network.CacheResponse r9 = r12.k(r13)     // Catch:{ Exception -> 0x01a6 }
            r2.<init>(r8, r9)     // Catch:{ Exception -> 0x01a6 }
            w6.a r2 = r2.b()     // Catch:{ Exception -> 0x01a6 }
            okhttp3.Request r8 = r2.b()     // Catch:{ Exception -> 0x01a6 }
            if (r8 != 0) goto L_0x00f9
            coil.network.CacheResponse r8 = r2.a()     // Catch:{ Exception -> 0x01a6 }
            if (r8 == 0) goto L_0x00f9
            r6.k r0 = new r6.k     // Catch:{ Exception -> 0x01a6 }
            o6.k r1 = r12.n(r13)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r3 = r12.f13548a     // Catch:{ Exception -> 0x01a6 }
            coil.network.CacheResponse r2 = r2.a()     // Catch:{ Exception -> 0x01a6 }
            okhttp3.MediaType r2 = r2.b()     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = r12.f(r3, r2)     // Catch:{ Exception -> 0x01a6 }
            coil.decode.DataSource r3 = coil.decode.DataSource.DISK     // Catch:{ Exception -> 0x01a6 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x01a6 }
            return r0
        L_0x00cf:
            r6.k r0 = new r6.k     // Catch:{ Exception -> 0x01a6 }
            o6.k r1 = r12.n(r13)     // Catch:{ Exception -> 0x01a6 }
            java.lang.String r2 = r12.f13548a     // Catch:{ Exception -> 0x01a6 }
            coil.network.CacheResponse r3 = r12.k(r13)     // Catch:{ Exception -> 0x01a6 }
            if (r3 != 0) goto L_0x00de
            goto L_0x00e2
        L_0x00de:
            okhttp3.MediaType r7 = r3.b()     // Catch:{ Exception -> 0x01a6 }
        L_0x00e2:
            java.lang.String r2 = r12.f(r2, r7)     // Catch:{ Exception -> 0x01a6 }
            coil.decode.DataSource r3 = coil.decode.DataSource.DISK     // Catch:{ Exception -> 0x01a6 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x01a6 }
            return r0
        L_0x00ec:
            w6.a$b r2 = new w6.a$b     // Catch:{ Exception -> 0x01a6 }
            okhttp3.Request r8 = r12.h()     // Catch:{ Exception -> 0x01a6 }
            r2.<init>(r8, r7)     // Catch:{ Exception -> 0x01a6 }
            w6.a r2 = r2.b()     // Catch:{ Exception -> 0x01a6 }
        L_0x00f9:
            okhttp3.Request r8 = r2.b()     // Catch:{ Exception -> 0x01a6 }
            kotlin.jvm.internal.p.g(r8)     // Catch:{ Exception -> 0x01a6 }
            r0.f13559a = r12     // Catch:{ Exception -> 0x01a6 }
            r0.f13560b = r13     // Catch:{ Exception -> 0x01a6 }
            r0.f13561c = r2     // Catch:{ Exception -> 0x01a6 }
            r0.f13564f = r6     // Catch:{ Exception -> 0x01a6 }
            java.lang.Object r6 = r12.c(r8, r0)     // Catch:{ Exception -> 0x01a6 }
            if (r6 != r1) goto L_0x010f
            return r1
        L_0x010f:
            r8 = r12
            r11 = r2
            r2 = r13
            r13 = r6
            r6 = r11
        L_0x0114:
            okhttp3.Response r13 = (okhttp3.Response) r13     // Catch:{ Exception -> 0x01a3 }
            okhttp3.ResponseBody r9 = r8.j(r13)     // Catch:{ Exception -> 0x01a3 }
            okhttp3.Request r10 = r6.b()     // Catch:{ Exception -> 0x019c }
            coil.network.CacheResponse r6 = r6.a()     // Catch:{ Exception -> 0x019c }
            p6.a$c r2 = r8.o(r2, r10, r13, r6)     // Catch:{ Exception -> 0x019c }
            if (r2 == 0) goto L_0x0145
            r6.k r0 = new r6.k     // Catch:{ Exception -> 0x019c }
            o6.k r1 = r8.n(r2)     // Catch:{ Exception -> 0x019c }
            java.lang.String r3 = r8.f13548a     // Catch:{ Exception -> 0x019c }
            coil.network.CacheResponse r4 = r8.k(r2)     // Catch:{ Exception -> 0x019c }
            if (r4 != 0) goto L_0x0137
            goto L_0x013b
        L_0x0137:
            okhttp3.MediaType r7 = r4.b()     // Catch:{ Exception -> 0x019c }
        L_0x013b:
            java.lang.String r3 = r8.f(r3, r7)     // Catch:{ Exception -> 0x019c }
            coil.decode.DataSource r4 = coil.decode.DataSource.NETWORK     // Catch:{ Exception -> 0x019c }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x019c }
            return r0
        L_0x0145:
            long r6 = r9.contentLength()     // Catch:{ Exception -> 0x019c }
            int r10 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x0165
            r6.k r0 = new r6.k     // Catch:{ Exception -> 0x019c }
            o6.k r1 = r8.m(r9)     // Catch:{ Exception -> 0x019c }
            java.lang.String r3 = r8.f13548a     // Catch:{ Exception -> 0x019c }
            okhttp3.MediaType r4 = r9.contentType()     // Catch:{ Exception -> 0x019c }
            java.lang.String r3 = r8.f(r3, r4)     // Catch:{ Exception -> 0x019c }
            coil.decode.DataSource r4 = r8.l(r13)     // Catch:{ Exception -> 0x019c }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x019c }
            return r0
        L_0x0165:
            c7.i.c(r13)     // Catch:{ Exception -> 0x019c }
            okhttp3.Request r3 = r8.h()     // Catch:{ Exception -> 0x019c }
            r0.f13559a = r8     // Catch:{ Exception -> 0x019c }
            r0.f13560b = r2     // Catch:{ Exception -> 0x019c }
            r0.f13561c = r13     // Catch:{ Exception -> 0x019c }
            r0.f13564f = r5     // Catch:{ Exception -> 0x019c }
            java.lang.Object r0 = r8.c(r3, r0)     // Catch:{ Exception -> 0x019c }
            if (r0 != r1) goto L_0x017b
            return r1
        L_0x017b:
            r1 = r13
            r13 = r0
            r0 = r8
        L_0x017e:
            okhttp3.Response r13 = (okhttp3.Response) r13     // Catch:{ Exception -> 0x003c }
            okhttp3.ResponseBody r1 = r0.j(r13)     // Catch:{ Exception -> 0x019c }
            r6.k r3 = new r6.k     // Catch:{ Exception -> 0x019c }
            o6.k r4 = r0.m(r1)     // Catch:{ Exception -> 0x019c }
            java.lang.String r5 = r0.f13548a     // Catch:{ Exception -> 0x019c }
            okhttp3.MediaType r1 = r1.contentType()     // Catch:{ Exception -> 0x019c }
            java.lang.String r1 = r0.f(r5, r1)     // Catch:{ Exception -> 0x019c }
            coil.decode.DataSource r0 = r0.l(r13)     // Catch:{ Exception -> 0x019c }
            r3.<init>(r4, r1, r0)     // Catch:{ Exception -> 0x019c }
            return r3
        L_0x019c:
            r0 = move-exception
            r1 = r13
            r13 = r0
        L_0x019f:
            c7.i.c(r1)     // Catch:{ Exception -> 0x01a3 }
            throw r13     // Catch:{ Exception -> 0x01a3 }
        L_0x01a3:
            r13 = move-exception
            r6 = r2
            goto L_0x01a9
        L_0x01a6:
            r0 = move-exception
            r6 = r13
            r13 = r0
        L_0x01a9:
            if (r6 != 0) goto L_0x01ac
            goto L_0x01af
        L_0x01ac:
            c7.i.c(r6)
        L_0x01af:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.a(fp0.c):java.lang.Object");
    }

    public final String f(String str, MediaType mediaType) {
        String j;
        String mediaType2 = mediaType == null ? null : mediaType.toString();
        if ((mediaType2 == null || o.N(mediaType2, HttpRequest.SHARE_TYPE, false, 2, (Object) null)) && (j = c7.i.j(MimeTypeMap.getSingleton(), str)) != null) {
            return j;
        }
        if (mediaType2 == null) {
            return null;
        }
        return StringsKt__StringsKt.b1(mediaType2, ';', (String) null, 2, (Object) null);
    }
}
