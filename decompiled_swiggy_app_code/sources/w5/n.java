package w5;

import android.content.Context;
import co.hyperverge.hypersnapsdk.b.c;
import co.hyperverge.hypersnapsdk.b.d;
import co.hyperverge.hypersnapsdk.b.e;
import f6.b;
import j6.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SDKInternalConfig */
public class n {
    private static n n;

    /* renamed from: a  reason: collision with root package name */
    public String f17586a;

    /* renamed from: b  reason: collision with root package name */
    public String f17587b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17588c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f17589d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17590e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17591f = true;

    /* renamed from: g  reason: collision with root package name */
    private String f17592g;

    /* renamed from: h  reason: collision with root package name */
    private b f17593h;

    /* renamed from: i  reason: collision with root package name */
    private q5.b f17594i;
    private e j;
    private a k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, Boolean> f17595l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f17596m = false;

    private n() {
    }

    public static n w() {
        if (n == null) {
            n = new n();
        }
        return n;
    }

    public String A() {
        return "https://s3.ap-south-1.amazonaws.com/hv-sdk-device-configs/hypersnap/android/";
    }

    public String B() {
        return "https://s3-ap-south-1.amazonaws.com";
    }

    public boolean C() {
        Map<String, Boolean> u11;
        if (this.f17588c && (u11 = w().u()) != null && u11.containsKey("face-detection")) {
            this.f17588c = u11.get("face-detection").booleanValue();
        }
        return this.f17588c;
    }

    public boolean D() {
        return this.f17590e;
    }

    public boolean E() {
        return this.f17596m;
    }

    public boolean F() {
        Map<String, Boolean> u11 = w().u();
        if (u11 != null && u11.containsKey("image-injection")) {
            this.f17589d = u11.get("image-injection").booleanValue();
        }
        return this.f17589d;
    }

    public boolean G() {
        return z().e();
    }

    public q5.b a(Context context) {
        if (this.f17594i == null) {
            this.f17594i = new q5.a(context);
        }
        return this.f17594i;
    }

    public void b() {
        e eVar = new e();
        c cVar = new c();
        cVar.c("a41ad40816ef4065f804046da95d5724");
        d dVar = new d();
        dVar.x(true);
        dVar.q(true);
        dVar.m(true);
        dVar.k(true);
        dVar.o(true);
        dVar.i(true);
        dVar.s(true);
        dVar.d(true);
        dVar.g(true);
        dVar.a(true);
        dVar.v(true);
        cVar.b(dVar);
        eVar.b(cVar);
        eVar.c(true);
        c(eVar);
    }

    public void c(e eVar) {
        this.j = eVar;
    }

    public void d(b bVar) {
        this.f17593h = bVar;
    }

    public void e(a aVar) {
        this.k = aVar;
    }

    public void f(String str) {
        this.f17587b = str;
    }

    public void g(Map<String, Boolean> map) {
        this.f17595l = map;
    }

    public void h(q5.b bVar) {
        this.f17594i = bVar;
    }

    public void i(boolean z11) {
        this.f17588c = z11;
    }

    public b j(Context context) {
        if (this.f17593h == null) {
            this.f17593h = new f6.a(context);
        }
        return this.f17593h;
    }

    public void k(String str) {
        this.f17586a = str;
    }

    public void l(boolean z11) {
        this.f17590e = z11;
    }

    public q5.b m() {
        return this.f17594i;
    }

    public void n(String str) {
        this.f17592g = str;
    }

    public void o(boolean z11) {
        this.f17596m = z11;
    }

    @Deprecated
    public void p(boolean z11) {
        this.f17591f = z11;
    }

    public String q() {
        return "https://apac-faceid.hyperverge.co/v2/";
    }

    public String r() {
        return this.f17586a;
    }

    public b s() {
        return this.f17593h;
    }

    public String t() {
        return this.f17592g;
    }

    public Map<String, Boolean> u() {
        if (this.f17595l == null) {
            this.f17595l = new HashMap();
        }
        return this.f17595l;
    }

    public String v() {
        return "https://ind-faceid.hyperverge.co/v1/";
    }

    public String x() {
        return "photo/liveness";
    }

    public String y() {
        return "https://api.mixpanel.com/track/";
    }

    public e z() {
        if (this.j == null) {
            this.j = new e();
        }
        return this.j;
    }
}
