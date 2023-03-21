package in.swiggy.android.swiggylynx.ui.fragment.viewmodel;

import android.content.SharedPreferences;
import android.location.Location;
import android.net.Uri;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.y;
import ao0.r;
import cg0.n;
import ci0.d;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import di0.t;
import ef0.e;
import ef0.f;
import hq0.k;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.swiggylynx.plugin.SwiggyLynxPluginData;
import in.swiggy.android.swiggylynx.ui.LynxData;
import in.swiggy.android.swiggylynx.ui.SwiggyLynxWebView;
import in.swiggy.android.swiggylynx.ui.fragment.LynxTransactionType;
import in.swiggy.android.swiggylynx.utils.IllegalHostException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mb0.r0;
import os.d0;
import os.f0;
import os.g0;
import os.j;
import os.u;
import pw.a;
import xh0.l;
import xh0.m;
import zh0.a;

@Instrumented
/* compiled from: LynxFragmentViewModel.kt */
public final class LynxFragmentViewModel extends j0 {
    public static final a Companion = new a((i) null);
    private Integer A;
    /* access modifiers changed from: private */
    public final eo0.a B;
    private final eo0.a C;
    /* access modifiers changed from: private */
    public Set<? extends SwiggyLynxPluginData> D;
    /* access modifiers changed from: private */
    public String E;
    private ObservableField<String> F;
    private String G;
    private final ObservableInt H;
    public e I;
    private final ArrayList<String> K;
    private final hq0.a L;

    /* renamed from: d  reason: collision with root package name */
    private final og0.a f19590d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f19591e;

    /* renamed from: f  reason: collision with root package name */
    private final f f19592f;

    /* renamed from: g  reason: collision with root package name */
    private final ps.b f19593g;

    /* renamed from: h  reason: collision with root package name */
    private final n f19594h;

    /* renamed from: i  reason: collision with root package name */
    private final th0.a f19595i;
    private final kg0.a j;
    private final r0 k;

    /* renamed from: l  reason: collision with root package name */
    private final pw.a f19596l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final y<j<zh0.a>> f19597m;
    private final LiveData<j<zh0.a>> n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Stack<m> f19598o = new Stack<>();

    /* renamed from: p  reason: collision with root package name */
    private final y<l> f19599p;
    private final LiveData<l> q;

    /* renamed from: r  reason: collision with root package name */
    private final ObservableField<Integer> f19600r;

    /* renamed from: s  reason: collision with root package name */
    private r f19601s;
    private r t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f19602u;
    private boolean v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f19603w;

    /* renamed from: x  reason: collision with root package name */
    private final bp0.f f19604x;

    /* renamed from: y  reason: collision with root package name */
    private final di0.b f19605y;

    /* renamed from: z  reason: collision with root package name */
    private final bp0.f f19606z;

    /* compiled from: LynxFragmentViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: LynxFragmentViewModel.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19607a;

        static {
            int[] iArr = new int[LynxTransactionType.values().length];
            iArr[LynxTransactionType.ADD.ordinal()] = 1;
            iArr[LynxTransactionType.REPLACE.ordinal()] = 2;
            f19607a = iArr;
        }
    }

    /* compiled from: LynxFragmentViewModel.kt */
    public static final class c extends TypeToken<ArrayList<String>> {
        c() {
        }
    }

    public LynxFragmentViewModel(og0.a aVar, SharedPreferences sharedPreferences, f fVar, ps.b bVar, n nVar, th0.a aVar2, kg0.a aVar3, r0 r0Var, pw.a aVar4) {
        p.j(aVar, "defaultHeaders");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(fVar, "xpExperimentContext");
        p.j(bVar, "contextService");
        p.j(nVar, "locationContext");
        p.j(aVar2, "schedulerProvider");
        p.j(aVar3, "locationRefreshUtils");
        p.j(r0Var, "resourceService");
        p.j(aVar4, "cpDataManager");
        this.f19590d = aVar;
        this.f19591e = sharedPreferences;
        this.f19592f = fVar;
        this.f19593g = bVar;
        this.f19594h = nVar;
        this.f19595i = aVar2;
        this.j = aVar3;
        this.k = r0Var;
        this.f19596l = aVar4;
        y<j<zh0.a>> yVar = new y<>();
        this.f19597m = yVar;
        this.n = yVar;
        y<l> yVar2 = new y<>();
        this.f19599p = yVar2;
        this.q = yVar2;
        this.f19600r = new ObservableField<>(8);
        r a11 = do0.a.a();
        p.i(a11, "mainThread()");
        this.f19601s = a11;
        r c11 = wo0.a.c();
        p.i(c11, "io()");
        this.t = c11;
        this.f19602u = true;
        this.f19604x = b.b(new LynxFragmentViewModel$locationListenerUseCase$2(this));
        this.f19605y = new di0.b();
        this.f19606z = b.b(new LynxFragmentViewModel$userAuthenticationChangeUseCase$2(this));
        this.B = new eo0.a();
        this.C = new eo0.a();
        this.D = d0.b();
        this.E = "";
        this.F = new ObservableField<>();
        Integer s11 = bVar.d().s();
        p.i(s11, "contextService.deviceDetails.statusBarHeight");
        this.H = new ObservableInt(s11.intValue());
        this.K = p2();
        this.L = k.b((hq0.a) null, LynxFragmentViewModel$json$1.f19608a, 1, (Object) null);
    }

    private final void Q1() {
        if (!this.f19605y.a()) {
            this.v = true;
        }
    }

    /* access modifiers changed from: private */
    public final void R1(Map<String, String> map) {
        map.put("hideBackButton", "true");
    }

    private final boolean T1(String str) {
        if (str.length() == 0) {
            return false;
        }
        f0 f0Var = new f0(str);
        String d11 = f0Var.d();
        List<String> f11 = f0Var.f();
        if (!d0.e(d11) && p.e(d11, "stores")) {
            return true;
        }
        if (f11.size() < 1 || (!StringsKt__StringsKt.S(f11.get(0), "stores", false, 2, (Object) null) && !StringsKt__StringsKt.S(f11.get(0), "genie", false, 2, (Object) null))) {
            return false;
        }
        return true;
    }

    private final void U1() {
        this.B.d(N1().c().m0(this.t).Q(this.f19601s).h0(new ci0.c(this), ci0.f.f13032a));
        N1().d();
    }

    /* access modifiers changed from: private */
    public static final void V1(LynxFragmentViewModel lynxFragmentViewModel, Boolean bool) {
        p.j(lynxFragmentViewModel, "this$0");
        if (!lynxFragmentViewModel.f19605y.a()) {
            lynxFragmentViewModel.f19603w = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(Throwable th2) {
    }

    private final void X1() {
        this.B.d(G1().n().m0(this.t).Q(this.f19601s).e0(1).h0(new ci0.b(this), d.f13030a));
    }

    /* access modifiers changed from: private */
    public static final void Y1(LynxFragmentViewModel lynxFragmentViewModel, in.swiggy.android.swiggylynx.model.a aVar) {
        p.j(lynxFragmentViewModel, "this$0");
        lynxFragmentViewModel.Q1();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Throwable th2) {
    }

    /* access modifiers changed from: private */
    public static final void c2(LynxFragmentViewModel lynxFragmentViewModel, Location location) {
        p.j(lynxFragmentViewModel, "this$0");
        lynxFragmentViewModel.Q1();
        y<j<zh0.a>> yVar = lynxFragmentViewModel.f19597m;
        p.i(location, "it");
        yVar.q(new j(new a.d(location)));
    }

    /* access modifiers changed from: private */
    public static final void d2(Throwable th2) {
    }

    /* access modifiers changed from: private */
    public final boolean o2(LynxData lynxData, boolean z11, String str, String str2) {
        String path = Uri.parse(str2).getPath();
        String path2 = Uri.parse(lynxData.getUrl()).getPath();
        if (str == null) {
            str = "";
        }
        if (((p.e(path, path2) && p.e(path2, Uri.parse(str).getPath())) || (!z11 && !T1(str2))) && !this.v && !this.f19603w) {
            return false;
        }
        return true;
    }

    private final ArrayList<String> p2() {
        String string = this.f19591e.getString("white_listed_domains_for_headers", "[\"swiggy.com\", \"swig.gy\", \"d1.swiggyops.de\",\"u4.swiggyops.de\",\"staging-stores.swiggyops.de\", \"sf.swiggyops.de\",\"gifting-ui-ui-cont.uat.singapore.swig.gy\", \"ofo-service.u4.singapore.swig.gy\", \"social-ofo-mweb.sf.singapore.swig.gy\", \"social-ofo-mweb.u4.singapore.swig.gy\", \"social-ofo-mweb.uat.singapore.swig.gy\", \"nyee-mweb.uat.singapore.swig.gy\", \"staging.swiggy.com\", \"reviews.swiggy.com\", \"portal.stg.swiggyops.de\", \"sw-moments-new-onboard-loader-mweb.u4.singapore.swig.gy\", \"swiggy.cloud\", \"sw-moments-gifter-flow-mweb.u4.singapore.swig.gy\" ]");
        Type type = new c().getType();
        Gson i11 = g0.i();
        Object fromJson = !(i11 instanceof Gson) ? i11.fromJson(string, type) : GsonInstrumentation.fromJson(i11, string, type);
        p.i(fromJson, "getGson().fromJson(listJson, type)");
        return (ArrayList) fromJson;
    }

    public final eo0.a A1() {
        return this.C;
    }

    public final String B1(String str, String str2) {
        p.j(str, "clickedTabIdentifier");
        a.C0718a a11 = this.f19596l.a();
        Long l11 = null;
        Long valueOf = a11 == null ? null : Long.valueOf(a11.a());
        a.C0718a b11 = this.f19596l.b();
        if (b11 != null) {
            l11 = Long.valueOf(b11.a());
        }
        return this.L.c(qw.a.f59462e.a(), new qw.a(str, str2, valueOf, l11));
    }

    public final LiveData<j<zh0.a>> C1() {
        return this.n;
    }

    public final Integer D1() {
        return this.A;
    }

    public final LiveData<l> E1() {
        return this.q;
    }

    public final m F1() {
        if (!this.f19598o.isEmpty()) {
            return this.f19598o.peek();
        }
        return null;
    }

    public final di0.n G1() {
        return (di0.n) this.f19604x.getValue();
    }

    public final kg0.a H1() {
        return this.j;
    }

    public final Set<SwiggyLynxPluginData> I1() {
        return this.D;
    }

    public final r0 J1() {
        return this.k;
    }

    public final th0.a K1() {
        return this.f19595i;
    }

    public final ObservableField<String> L1() {
        return this.F;
    }

    public final ObservableInt M1() {
        return this.H;
    }

    public final t N1() {
        return (t) this.f19606z.getValue();
    }

    public final ArrayList<String> O1() {
        return this.K;
    }

    public final boolean P1() {
        boolean z11 = false;
        if (!js.c.f(Integer.valueOf(this.f19598o.size()), 1)) {
            return false;
        }
        y<l> yVar = this.f19599p;
        if (this.f19598o.pop().c() == LynxTransactionType.ADD) {
            z11 = true;
        }
        yVar.q(new l.a(z11));
        return true;
    }

    public final di0.b S1() {
        return this.f19605y;
    }

    public final void a2() {
        this.B.d(G1().o().m0(this.t).Q(this.f19601s).e0(1).h0(new ci0.a(this), ci0.e.f13031a));
        G1().q();
    }

    public final e d() {
        e eVar = this.I;
        if (eVar != null) {
            return eVar;
        }
        p.B(LogSubCategory.Action.USER);
        return null;
    }

    public final n e() {
        return this.f19594h;
    }

    public final void e2(boolean z11) {
        this.f19600r.j(Integer.valueOf(z11 ? 0 : 8));
    }

    public final void f2(LynxData lynxData, String str, String str2) {
        p.j(lynxData, "lynxData");
        p.j(str2, "bottomBarDeeplink");
        this.f19597m.q(new j(new a.c(new LynxFragmentViewModel$onDeeplinkIntent$1(this, lynxData, str, str2))));
    }

    public final ps.b g() {
        return this.f19593g;
    }

    public final void g2(String str, boolean z11, Map<String, String> map, boolean z12, String str2) {
        Map<String, String> map2;
        String str3;
        String str4 = str;
        Map<String, String> map3 = map;
        Class<a> cls = a.class;
        p.j(str, "url");
        p.j(map3, "newHeaders");
        String a11 = xp.a.f53337a.a(str);
        if (p.e(a11, "invalid")) {
            if (!Companion.getClass().isAnonymousClass()) {
                str3 = cls.getSimpleName();
                if (str3.length() > 23) {
                    p.i(str3, "name");
                    str3 = str3.substring(0, 23);
                    p.i(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                p.i(str3, "{\n            val name =… first 23 chars\n        }");
            } else {
                String name = cls.getName();
                if (name.length() > 23) {
                    p.i(name, "name");
                    name = name.substring(name.length() - 23, name.length());
                    p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                p.i(str3, "{\n            val name =…/ last 23 chars\n        }");
            }
            u.h(str3, new IllegalHostException(str));
        }
        ArrayList<String> arrayList = this.K;
        ArrayList arrayList2 = new ArrayList();
        for (T next : arrayList) {
            if (o.w(a11, (String) next, false, 2, (Object) null)) {
                arrayList2.add(next);
            }
        }
        Map<String, String> f11 = this.f19598o.isEmpty() ? x.f() : this.f19598o.peek().b();
        if (!(!arrayList2.isEmpty()) || p.e(a11, "invalid")) {
            map2 = x.f();
        } else {
            map2 = SwiggyLynxWebView.Companion.a(x.l(f11, map3));
        }
        Map<String, String> map4 = map2;
        m mVar = new m(str, map4.containsKey("x-web-checkout-flow") ? String.valueOf(map4.get("x-web-checkout-flow")) : "", map4, z11, (String) null, z12 ? LynxTransactionType.ADD : LynxTransactionType.REPLACE, str2, 16, (i) null);
        int i11 = b.f19607a[mVar.c().ordinal()];
        if (i11 == 1) {
            this.f19598o.push(mVar);
        } else if (i11 == 2) {
            this.f19598o.pop();
            this.f19598o.push(mVar);
        }
        this.f19599p.q(new l.b(mVar));
    }

    public final SharedPreferences getSharedPreferences() {
        return this.f19591e;
    }

    public final void h2(LynxData lynxData, boolean z11) {
        Map<String, String> map;
        p.j(lynxData, "lynxData");
        String url = lynxData.getUrl();
        if (lynxData.getAddDefaultHeaders()) {
            map = x.l(lynxData.getHeaders(), this.f19590d.a());
        } else {
            map = lynxData.getHeaders();
        }
        this.f19597m.q(new j(new a.b(new LynxFragmentViewModel$processIntent$1(this, x.t(map), lynxData, z11, url))));
    }

    public final f i0() {
        return this.f19592f;
    }

    /* access modifiers changed from: protected */
    public void i1() {
        super.i1();
        this.B.dispose();
        this.C.dispose();
    }

    public final void i2(boolean z11) {
        this.v = z11;
    }

    public final void init() {
        a2();
        X1();
        U1();
    }

    public final void j2(boolean z11) {
        this.f19603w = z11;
    }

    public final void k2(Integer num) {
        if (this.A == null) {
            this.A = num;
        }
    }

    public final void l2(boolean z11) {
        this.f19602u = z11;
        if (!z11) {
            this.f19603w = false;
        }
    }

    public final void m2(String str) {
        p.j(str, "statusBarColor");
        this.F.j(str);
    }

    public final void n2(String str) {
        this.G = str;
    }

    public final ObservableField<Integer> x1() {
        return this.f19600r;
    }

    public final pw.a y1() {
        return this.f19596l;
    }

    public final og0.a z1() {
        return this.f19590d;
    }
}
