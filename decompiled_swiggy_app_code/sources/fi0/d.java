package fi0;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.newrelic.agent.android.instrumentation.Instrumented;
import ef0.f;
import fi0.a;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.oldapi.models.googleplace.GoogleDirectionResponse;
import in.swiggy.android.web.SwiggyWebViewClient;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import os.u;
import ps.b;
import wm0.j;

@Instrumented
/* compiled from: LynxViewClient.kt */
public final class d extends SwiggyWebViewClient implements yp.a {
    public static final a Companion = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private final a f18326f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedPreferences f18327g;

    /* renamed from: h  reason: collision with root package name */
    private final OkHttpClient f18328h;

    /* renamed from: i  reason: collision with root package name */
    private final b f18329i;
    private boolean j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f18330l;

    /* renamed from: m  reason: collision with root package name */
    private final HashMap<String, String> f18331m = new HashMap<>();

    /* compiled from: LynxViewClient.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a aVar, Context context, SharedPreferences sharedPreferences, f fVar, Gson gson, OkHttpClient okHttpClient, b bVar, jr.a aVar2) {
        super(new j(context, sharedPreferences, fVar, gson), aVar, sharedPreferences, aVar2);
        p.j(aVar, "webViewClientCommunicationHandler");
        p.j(context, LogCategory.CONTEXT);
        p.j(sharedPreferences, "sharedPreferences");
        p.j(fVar, "xpExperimentContext");
        p.j(gson, "gson");
        p.j(okHttpClient, "okHttpClient");
        p.j(bVar, "contextService");
        p.j(aVar2, "newRelicPerformanceUtils");
        this.f18326f = aVar;
        this.f18327g = sharedPreferences;
        this.f18328h = okHttpClient;
        this.f18329i = bVar;
    }

    private final String o(String str) {
        String str2 = this.f18331m.get(str);
        this.f18331m.remove(str);
        return str2;
    }

    private final String p(WebResourceRequest webResourceRequest) {
        String[] t = t(webResourceRequest, "FETCH_INTERCEPT");
        if (t == null) {
            return null;
        }
        return t[1];
    }

    private final String q(MediaType mediaType) {
        String str;
        boolean z11;
        String str2 = null;
        String type = mediaType == null ? null : mediaType.type();
        if (mediaType == null) {
            str = null;
        } else {
            str = mediaType.subtype();
        }
        boolean z12 = false;
        if (type != null && (!o.A(type))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            str2 = type;
        }
        if (str != null && (!o.A(str))) {
            z12 = true;
        }
        if (!z12) {
            return str2;
        }
        return str2 + '/' + str;
    }

    private final Uri r(WebResourceRequest webResourceRequest, String str) {
        String[] t = t(webResourceRequest, str);
        return Uri.parse(t == null ? null : t[0]);
    }

    private final String s(WebResourceRequest webResourceRequest) {
        String p11 = p(webResourceRequest);
        if (p11 == null) {
            return null;
        }
        return o(p11);
    }

    private final String[] t(WebResourceRequest webResourceRequest, String str) {
        String uri = webResourceRequest.getUrl().toString();
        p.i(uri, "request.url.toString()");
        Object[] array = new Regex(str).i(uri, 0).toArray(new String[0]);
        p.h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void u(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (!c.h(webResourceRequest == null ? null : Boolean.valueOf(webResourceRequest.isForMainFrame()))) {
            return;
        }
        if (Build.VERSION.SDK_INT < 23 || webResourceError == null) {
            this.f18326f.S1(true, webResourceRequest, (zp.d) null);
            return;
        }
        a aVar = this.f18326f;
        int errorCode = webResourceError.getErrorCode();
        CharSequence description = webResourceError.getDescription();
        p.i(description, "error.description");
        aVar.S1(true, webResourceRequest, new zp.d(errorCode, description));
    }

    private final WebResourceResponse v(Context context, InputStream inputStream, String str, String str2) {
        String str3;
        byte[] a11;
        byte[] bArr;
        HashMap hashMap = new HashMap();
        hashMap.put("Access-Control-Allow-Origin", "*");
        if (!(context == null || inputStream == null)) {
            try {
                if (p.e(str, "text/html") && (a11 = ng0.b.f19786a.a(inputStream)) != null) {
                    String a12 = ng0.a.Companion.a(context, a11);
                    if (a12 == null) {
                        bArr = null;
                    } else {
                        bArr = a12.getBytes(up0.a.f29102b);
                        p.i(bArr, "this as java.lang.String).getBytes(charset)");
                    }
                    return new WebResourceResponse(str, str2, new ByteArrayInputStream(bArr));
                }
            } catch (Throwable th2) {
                if (!d.class.isAnonymousClass()) {
                    str3 = d.class.getSimpleName();
                    if (str3.length() > 23) {
                        p.i(str3, "name");
                        str3 = str3.substring(0, 23);
                        p.i(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    p.i(str3, "{\n            val name =… first 23 chars\n        }");
                } else {
                    String name = d.class.getName();
                    if (name.length() > 23) {
                        p.i(name, "name");
                        name = name.substring(name.length() - 23, name.length());
                        p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    p.i(str3, "{\n            val name =…/ last 23 chars\n        }");
                }
                u.h(str3, th2);
            }
        }
        return new WebResourceResponse(str, str2, OS2WindowsMetricsTable.WEIGHT_CLASS_ULTRA_LIGHT, GoogleDirectionResponse.OK_RESPONSE, hashMap, inputStream);
    }

    private final boolean w(WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        p.i(uri, "request.url.toString()");
        return StringsKt__StringsKt.S(uri, "FETCH_INTERCEPT", false, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fb A[Catch:{ Exception -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd A[Catch:{ Exception -> 0x0106 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.webkit.WebResourceResponse x(android.webkit.WebView r10, android.webkit.WebResourceRequest r11) {
        /*
            r9 = this;
            r0 = 0
            okhttp3.Headers$Builder r1 = new okhttp3.Headers$Builder     // Catch:{ Exception -> 0x0106 }
            r1.<init>()     // Catch:{ Exception -> 0x0106 }
            java.util.Map r2 = r11.getRequestHeaders()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r3 = "request.requestHeaders"
            kotlin.jvm.internal.p.i(r2, r3)     // Catch:{ Exception -> 0x0106 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ Exception -> 0x0106 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0106 }
        L_0x0017:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0106 }
            if (r3 == 0) goto L_0x003d
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0106 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0106 }
            java.lang.String r5 = "key"
            kotlin.jvm.internal.p.i(r4, r5)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r5 = "value"
            kotlin.jvm.internal.p.i(r3, r5)     // Catch:{ Exception -> 0x0106 }
            r1.add((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ Exception -> 0x0106 }
            goto L_0x0017
        L_0x003d:
            android.net.Uri r2 = r11.getUrl()     // Catch:{ Exception -> 0x0106 }
            boolean r3 = r9.w(r11)     // Catch:{ Exception -> 0x0106 }
            if (r3 == 0) goto L_0x0055
            java.lang.String r2 = r9.s(r11)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r3 = "FETCH_INTERCEPT"
            android.net.Uri r3 = r9.r(r11, r3)     // Catch:{ Exception -> 0x0106 }
            r8 = r3
            r3 = r2
            r2 = r8
            goto L_0x0056
        L_0x0055:
            r3 = r0
        L_0x0056:
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder     // Catch:{ Exception -> 0x0106 }
            r4.<init>()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r5 = "uri.toString()"
            kotlin.jvm.internal.p.i(r2, r5)     // Catch:{ Exception -> 0x0106 }
            okhttp3.Request$Builder r2 = r4.url((java.lang.String) r2)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r4 = r11.getMethod()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r5 = "request.method"
            kotlin.jvm.internal.p.i(r4, r5)     // Catch:{ Exception -> 0x0106 }
            if (r3 != 0) goto L_0x0075
            r3 = r0
            goto L_0x0091
        L_0x0075:
            okhttp3.RequestBody$Companion r5 = okhttp3.RequestBody.Companion     // Catch:{ Exception -> 0x0106 }
            java.util.Map r6 = r11.getRequestHeaders()     // Catch:{ Exception -> 0x0106 }
            java.lang.String r7 = "Content-Type"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0106 }
            if (r6 != 0) goto L_0x0087
            r6 = r0
            goto L_0x008d
        L_0x0087:
            okhttp3.MediaType$Companion r7 = okhttp3.MediaType.Companion     // Catch:{ Exception -> 0x0106 }
            okhttp3.MediaType r6 = r7.parse(r6)     // Catch:{ Exception -> 0x0106 }
        L_0x008d:
            okhttp3.RequestBody r3 = r5.create((okhttp3.MediaType) r6, (java.lang.String) r3)     // Catch:{ Exception -> 0x0106 }
        L_0x0091:
            okhttp3.Request$Builder r2 = r2.method(r4, r3)     // Catch:{ Exception -> 0x0106 }
            okhttp3.Headers r1 = r1.build()     // Catch:{ Exception -> 0x0106 }
            okhttp3.Request$Builder r1 = r2.headers(r1)     // Catch:{ Exception -> 0x0106 }
            boolean r2 = r1 instanceof okhttp3.Request.Builder     // Catch:{ Exception -> 0x0106 }
            if (r2 != 0) goto L_0x00a6
            okhttp3.Request r1 = r1.build()     // Catch:{ Exception -> 0x0106 }
            goto L_0x00aa
        L_0x00a6:
            okhttp3.Request r1 = com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation.build(r1)     // Catch:{ Exception -> 0x0106 }
        L_0x00aa:
            okhttp3.OkHttpClient r2 = r9.f18328h     // Catch:{ Exception -> 0x0106 }
            boolean r3 = r2 instanceof okhttp3.OkHttpClient     // Catch:{ Exception -> 0x0106 }
            if (r3 != 0) goto L_0x00b5
            okhttp3.Call r1 = r2.newCall(r1)     // Catch:{ Exception -> 0x0106 }
            goto L_0x00b9
        L_0x00b5:
            okhttp3.Call r1 = com.newrelic.agent.android.instrumentation.okhttp3.OkHttp3Instrumentation.newCall(r2, r1)     // Catch:{ Exception -> 0x0106 }
        L_0x00b9:
            okhttp3.Response r1 = r1.execute()     // Catch:{ Exception -> 0x0106 }
            okhttp3.ResponseBody r2 = r1.body()     // Catch:{ Exception -> 0x0106 }
            if (r2 != 0) goto L_0x00c5
            r2 = r0
            goto L_0x00c9
        L_0x00c5:
            okhttp3.MediaType r2 = r2.contentType()     // Catch:{ Exception -> 0x0106 }
        L_0x00c9:
            boolean r3 = r9.f18330l     // Catch:{ Exception -> 0x0106 }
            if (r3 != 0) goto L_0x00da
            if (r10 != 0) goto L_0x00d0
            goto L_0x00da
        L_0x00d0:
            fi0.b r3 = new fi0.b     // Catch:{ Exception -> 0x0106 }
            r3.<init>(r9)     // Catch:{ Exception -> 0x0106 }
            r4 = 250(0xfa, double:1.235E-321)
            r10.postDelayed(r3, r4)     // Catch:{ Exception -> 0x0106 }
        L_0x00da:
            okhttp3.ResponseBody r1 = r1.body()     // Catch:{ Exception -> 0x0106 }
            if (r1 != 0) goto L_0x00e2
            r1 = r0
            goto L_0x00e6
        L_0x00e2:
            java.io.InputStream r1 = r1.byteStream()     // Catch:{ Exception -> 0x0106 }
        L_0x00e6:
            java.lang.String r3 = r9.q(r2)     // Catch:{ Exception -> 0x0106 }
            if (r2 != 0) goto L_0x00ee
        L_0x00ec:
            r2 = r0
            goto L_0x00f9
        L_0x00ee:
            java.nio.charset.Charset r2 = r2.charset(r0)     // Catch:{ Exception -> 0x0106 }
            if (r2 != 0) goto L_0x00f5
            goto L_0x00ec
        L_0x00f5:
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0106 }
        L_0x00f9:
            if (r10 != 0) goto L_0x00fd
            r4 = r0
            goto L_0x0101
        L_0x00fd:
            android.content.Context r4 = r10.getContext()     // Catch:{ Exception -> 0x0106 }
        L_0x0101:
            android.webkit.WebResourceResponse r10 = r9.v(r4, r1, r3, r2)     // Catch:{ Exception -> 0x0106 }
            return r10
        L_0x0106:
            r1 = move-exception
            java.lang.Class<fi0.d> r2 = fi0.d.class
            boolean r2 = r2.isAnonymousClass()
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r4 = "name"
            r5 = 23
            if (r2 != 0) goto L_0x0133
            java.lang.Class<fi0.d> r2 = fi0.d.class
            java.lang.String r2 = r2.getSimpleName()
            int r6 = r2.length()
            if (r6 > r5) goto L_0x0122
            goto L_0x012d
        L_0x0122:
            kotlin.jvm.internal.p.i(r2, r4)
            r4 = 0
            java.lang.String r2 = r2.substring(r4, r5)
            kotlin.jvm.internal.p.i(r2, r3)
        L_0x012d:
            java.lang.String r3 = "{\n            val name =… first 23 chars\n        }"
            kotlin.jvm.internal.p.i(r2, r3)
            goto L_0x0158
        L_0x0133:
            java.lang.Class<fi0.d> r2 = fi0.d.class
            java.lang.String r2 = r2.getName()
            int r6 = r2.length()
            if (r6 > r5) goto L_0x0140
            goto L_0x0153
        L_0x0140:
            kotlin.jvm.internal.p.i(r2, r4)
            int r4 = r2.length()
            int r4 = r4 - r5
            int r5 = r2.length()
            java.lang.String r2 = r2.substring(r4, r5)
            kotlin.jvm.internal.p.i(r2, r3)
        L_0x0153:
            java.lang.String r3 = "{\n            val name =…/ last 23 chars\n        }"
            kotlin.jvm.internal.p.i(r2, r3)
        L_0x0158:
            os.u.h(r2, r1)
            if (r10 != 0) goto L_0x015e
            goto L_0x0166
        L_0x015e:
            fi0.c r1 = new fi0.c
            r1.<init>(r9, r10, r11)
            r10.post(r1)
        L_0x0166:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fi0.d.x(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    /* access modifiers changed from: private */
    public static final void y(d dVar) {
        p.j(dVar, "this$0");
        dVar.f18326f.a0(false);
        dVar.f18330l = true;
    }

    /* access modifiers changed from: private */
    public static final void z(d dVar, WebView webView, WebResourceRequest webResourceRequest) {
        p.j(dVar, "this$0");
        p.j(webResourceRequest, "$request");
        dVar.u(webView, webResourceRequest, (WebResourceError) null);
    }

    public void a() {
        this.j = true;
    }

    public final void n(String str, String str2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "body");
        this.f18331m.put(str, str2);
    }

    public void onPageFinished(WebView webView, String str) {
        if (!this.k) {
            this.f18326f.a0(false);
        }
        if (this.j) {
            this.j = false;
            if (webView != null) {
                webView.clearHistory();
            }
        }
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        a.C0223a.d(this.f18326f, false, (WebResourceRequest) null, (zp.d) null, 6, (Object) null);
        this.f18326f.y1();
        super.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (c.h(webResourceRequest == null ? null : Boolean.valueOf(webResourceRequest.isForMainFrame()))) {
            boolean z11 = false;
            if (webResourceError != null && webResourceError.getErrorCode() == -2) {
                z11 = true;
            }
            if (z11) {
                String string = this.f18327g.getString("web_custom_lookup_enabled_v2", "true");
                if (string == null) {
                    string = "";
                }
                if (!c.p(string, true) || webResourceRequest == null || !this.f18329i.isNetworkAvailable()) {
                    u(webView, webResourceRequest, webResourceError);
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    return;
                }
                this.k = true;
                if (webView != null) {
                    webView.addJavascriptInterface(new ng0.a(this), "interception");
                }
                if (webView != null) {
                    webView.loadUrl(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
                    return;
                }
                return;
            }
        }
        u(webView, webResourceRequest, webResourceError);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (c.h(webResourceRequest == null ? null : Boolean.valueOf(webResourceRequest.isForMainFrame()))) {
            this.f18326f.S1(true, webResourceRequest, new zp.d(123, "HTTPError"));
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || !this.k) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return x(webView, webResourceRequest);
    }
}
