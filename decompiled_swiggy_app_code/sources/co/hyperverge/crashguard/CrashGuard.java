package co.hyperverge.crashguard;

import android.content.Context;
import android.util.Log;
import android.webkit.URLUtil;
import bp0.f;
import co.hyperverge.crashguard.data.repo.PrefsRepo;
import co.hyperverge.crashguard.services.CrashIntentService;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import y4.c;

/* compiled from: CrashGuard.kt */
public final class CrashGuard {
    public static final a Companion = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static CrashGuard f13052f;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f13053a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13054b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13055c;

    /* renamed from: d  reason: collision with root package name */
    private final f f13056d;

    /* renamed from: e  reason: collision with root package name */
    private b f13057e;

    /* compiled from: CrashGuard.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final CrashGuard a(Context context) {
            p.j(context, LogCategory.CONTEXT);
            CrashGuard d11 = CrashGuard.f13052f;
            if (d11 != null) {
                return d11;
            }
            CrashGuard crashGuard = new CrashGuard(new WeakReference(context), (i) null);
            a aVar = CrashGuard.Companion;
            CrashGuard.f13052f = crashGuard;
            return crashGuard;
        }
    }

    private CrashGuard(WeakReference<Context> weakReference) {
        this.f13053a = weakReference;
        this.f13054b = s.b(CrashGuard.class).b();
        this.f13056d = b.b(new CrashGuard$prefsRepo$2(this));
    }

    public /* synthetic */ CrashGuard(WeakReference weakReference, i iVar) {
        this(weakReference);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final co.hyperverge.crashguard.data.models.CrashEvent f(java.lang.Throwable r11) {
        /*
            r10 = this;
            co.hyperverge.crashguard.data.models.CrashEvent r0 = new co.hyperverge.crashguard.data.models.CrashEvent
            r0.<init>(r11)
            java.util.HashMap r11 = r0.b()
            co.hyperverge.crashguard.CrashGuard$b r1 = r10.f13057e
            r2 = 0
            if (r1 != 0) goto L_0x0014
            java.lang.String r1 = "config"
            kotlin.jvm.internal.p.B(r1)
            r1 = r2
        L_0x0014:
            java.util.Map r1 = r1.b()
            r11.putAll(r1)
            java.util.HashMap r11 = r0.b()
            java.lang.String r1 = "crashguard_sdk_version"
            java.lang.String r3 = "1.0.3"
            r11.put(r1, r3)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts r11 = r0.a()
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App r1 = r11.a()
            android.content.Context r3 = r10.g()
            android.content.pm.PackageInfo r3 = d5.a.l(r3)
            java.lang.String r4 = r3.packageName
            r1.c(r4)
            android.content.Context r4 = r10.g()
            java.lang.String r4 = d5.a.a(r4)
            r1.b(r4)
            java.lang.String r4 = r3.versionName
            r1.d(r4)
            java.lang.String r3 = d5.a.p(r3)
            r1.a(r3)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device r1 = r11.b()
            android.content.Context r3 = r10.g()
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r4 = "device_name"
            java.lang.String r3 = android.provider.Settings.Global.getString(r3, r4)
            r1.x(r3)
            java.lang.String r3 = android.os.Build.MODEL
            r1.v(r3)
            java.lang.String r4 = r1.c()
            r3 = 0
            if (r4 != 0) goto L_0x0075
        L_0x0073:
            r4 = r2
            goto L_0x00cc
        L_0x0075:
            java.lang.String r5 = " "
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.util.List r4 = kotlin.text.StringsKt__StringsKt.I0(r4, r5, r6, r7, r8, r9)
            if (r4 != 0) goto L_0x0086
            goto L_0x0073
        L_0x0086:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00b6
            int r5 = r4.size()
            java.util.ListIterator r5 = r4.listIterator(r5)
        L_0x0094:
            boolean r6 = r5.hasPrevious()
            if (r6 == 0) goto L_0x00b6
            java.lang.Object r6 = r5.previous()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            r7 = 1
            if (r6 != 0) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            if (r6 != 0) goto L_0x0094
            int r5 = r5.nextIndex()
            int r5 = r5 + r7
            java.util.List r4 = kotlin.collections.s.x0(r4, r5)
            goto L_0x00ba
        L_0x00b6:
            java.util.List r4 = kotlin.collections.k.j()
        L_0x00ba:
            if (r4 != 0) goto L_0x00bd
            goto L_0x0073
        L_0x00bd:
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.util.Objects.requireNonNull(r4, r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r4 = r4[r3]
        L_0x00cc:
            r1.n(r4)
            java.util.List r4 = d5.a.b()
            r1.g(r4)
            java.util.List r4 = r1.a()
            if (r4 != 0) goto L_0x00de
            r3 = r2
            goto L_0x00e4
        L_0x00de:
            java.lang.Object r3 = kotlin.collections.s.Z(r4, r3)
            java.lang.String r3 = (java.lang.String) r3
        L_0x00e4:
            r1.f(r3)
            java.lang.String r3 = android.os.Build.MANUFACTURER
            r1.t(r3)
            java.lang.String r3 = android.os.Build.BRAND
            r1.k(r3)
            java.lang.String r3 = android.os.Build.ID
            r1.w(r3)
            android.content.Context r3 = r10.g()
            java.lang.String r3 = d5.a.k(r3)
            r1.z(r3)
            android.content.Context r3 = r10.g()
            boolean r3 = d5.a.u(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.y(r3)
            android.content.Context r3 = r10.g()
            java.lang.Float r3 = d5.a.c(r3)
            r1.h(r3)
            android.content.Context r3 = r10.g()
            java.lang.Boolean r3 = d5.a.s(r3)
            r1.l(r3)
            android.content.Context r3 = r10.g()
            java.lang.Float r3 = d5.a.d(r3)
            r1.i(r3)
            java.lang.Boolean r3 = d5.a.t()
            r1.F(r3)
            android.content.Context r3 = r10.g()
            java.util.TimeZone r3 = d5.a.m(r3)
            if (r3 != 0) goto L_0x0144
            r3 = r2
            goto L_0x0148
        L_0x0144:
            java.lang.String r3 = r3.getID()
        L_0x0148:
            r1.H(r3)
            android.content.Context r3 = r10.g()
            java.lang.String r3 = d5.a.f(r3)
            r1.q(r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r3 = r3.getDisplayName()
            r1.r(r3)
            android.content.Context r3 = r10.g()
            android.app.ActivityManager$MemoryInfo r3 = d5.a.i(r3)
            if (r3 != 0) goto L_0x016d
            r4 = r2
            goto L_0x0173
        L_0x016d:
            boolean r4 = r3.lowMemory
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x0173:
            r1.s(r4)
            if (r3 != 0) goto L_0x017a
            r4 = r2
            goto L_0x0180
        L_0x017a:
            long r4 = r3.totalMem
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x0180:
            r1.u(r4)
            if (r3 != 0) goto L_0x0187
            r3 = r2
            goto L_0x018d
        L_0x0187:
            long r3 = r3.availMem
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x018d:
            r1.o(r3)
            android.content.Context r3 = r10.g()
            java.lang.Long r3 = d5.a.n(r3)
            r1.G(r3)
            android.content.Context r3 = r10.g()
            java.lang.Long r3 = d5.a.g(r3)
            r1.p(r3)
            java.util.Date r3 = d5.a.e()
            r1.j(r3)
            android.content.Context r3 = r10.g()
            java.lang.String r3 = d5.a.j(r3)
            r1.m(r3)
            android.content.Context r3 = r10.g()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            if (r3 != 0) goto L_0x01c8
            r4 = r2
            goto L_0x01ce
        L_0x01c8:
            float r4 = r3.density
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L_0x01ce:
            r1.A(r4)
            if (r3 != 0) goto L_0x01d5
            r4 = r2
            goto L_0x01db
        L_0x01d5:
            int r4 = r3.densityDpi
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x01db:
            r1.B(r4)
            if (r3 != 0) goto L_0x01e2
            r4 = r2
            goto L_0x01e8
        L_0x01e2:
            int r4 = r3.heightPixels
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x01e8:
            r1.C(r4)
            if (r3 != 0) goto L_0x01ee
            goto L_0x01f4
        L_0x01ee:
            int r2 = r3.widthPixels
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x01f4:
            r1.E(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Integer r3 = r1.d()
            r2.append(r3)
            r3 = 120(0x78, float:1.68E-43)
            r2.append(r3)
            java.lang.Integer r3 = r1.e()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.D(r2)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS r11 = r11.c()
            java.lang.String r1 = "Android"
            r11.c(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r11.e(r1)
            java.lang.String r1 = android.os.Build.DISPLAY
            r11.a(r1)
            java.lang.String r1 = d5.a.h()
            r11.b(r1)
            d5.b r1 = new d5.b
            android.content.Context r2 = r10.g()
            r1.<init>(r2)
            boolean r1 = r1.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r11.d(r1)
            co.hyperverge.crashguard.data.models.CrashEvent$User r11 = r0.d()
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts r1 = r0.a()
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device r1 = r1.b()
            java.lang.String r1 = r1.b()
            r11.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.CrashGuard.f(java.lang.Throwable):co.hyperverge.crashguard.data.models.CrashEvent");
    }

    /* access modifiers changed from: private */
    public final Context g() {
        Object obj = this.f13053a.get();
        p.g(obj);
        p.i(obj, "ctxRef.get()!!");
        return (Context) obj;
    }

    public static final CrashGuard h(Context context) {
        return Companion.a(context);
    }

    private final PrefsRepo i() {
        return (PrefsRepo) this.f13056d.getValue();
    }

    public static /* synthetic */ void l(CrashGuard crashGuard, String str, String str2, b bVar, y4.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bVar = new b((List) null, (Map) null, 3, (i) null);
        }
        if ((i11 & 8) != 0) {
            aVar = c.f29776a;
        }
        crashGuard.k(str, str2, bVar, aVar);
    }

    /* access modifiers changed from: private */
    public static final void m(Throwable th2) {
        p.j(th2, "it");
    }

    /* access modifiers changed from: private */
    public static final void n(CrashGuard crashGuard, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, y4.a aVar, Thread thread, Throwable th2) {
        p.j(crashGuard, "this$0");
        p.j(aVar, "$crashCallback");
        String str = crashGuard.f13054b;
        Log.e(str, "setDefaultUncaughtExceptionHandler called with: t = [" + thread + "], e = [" + th2 + ']');
        p.i(th2, "e");
        if (crashGuard.o(th2)) {
            CrashIntentService.Companion.a(crashGuard.g(), crashGuard.f(th2), false);
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            }
            aVar.a(th2);
            return;
        }
        Log.e(crashGuard.f13054b, p.s("init: Skipping crash as no provided filters matched for e: ", th2));
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
        aVar.a(th2);
    }

    private final boolean o(Throwable th2) {
        boolean z11;
        String className;
        StackTraceElement[] stackTrace = th2.getStackTrace();
        p.i(stackTrace, "stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) ArraysKt___ArraysKt.K(stackTrace);
        String str = "";
        if (!(stackTraceElement == null || (className = stackTraceElement.getClassName()) == null)) {
            str = className;
        }
        b bVar = this.f13057e;
        if (bVar == null) {
            p.B(PaymentConstants.Category.CONFIG);
            bVar = null;
        }
        if (bVar.a().isEmpty()) {
            return true;
        }
        b bVar2 = this.f13057e;
        if (bVar2 == null) {
            p.B(PaymentConstants.Category.CONFIG);
            bVar2 = null;
        }
        List<String> a11 = bVar2.a();
        if (!(a11 instanceof Collection) || !a11.isEmpty()) {
            Iterator<T> it2 = a11.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (StringsKt__StringsKt.S(str, (String) it2.next(), false, 2, (Object) null)) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z11 = false;
        if (z11) {
            return true;
        }
        return false;
    }

    public final void j(String str, String str2, b bVar) {
        p.j(str, "endpoint");
        p.j(str2, "sentryKey");
        p.j(bVar, PaymentConstants.Category.CONFIG);
        l(this, str, str2, bVar, (y4.a) null, 8, (Object) null);
    }

    public final void k(String str, String str2, b bVar, y4.a aVar) {
        p.j(str, "endpoint");
        p.j(str2, "sentryKey");
        p.j(bVar, PaymentConstants.Category.CONFIG);
        p.j(aVar, "crashCallback");
        String str3 = this.f13054b;
        Log.i(str3, "init() called with: config = [" + bVar + ']');
        if (this.f13055c) {
            Log.e(this.f13054b, "Already initialized.");
            return;
        }
        if (URLUtil.isValidUrl(str)) {
            if (str2.length() > 0) {
                i().i(str);
                i().j(str2);
                this.f13057e = bVar;
                Thread.setDefaultUncaughtExceptionHandler(new y4.b(this, Thread.getDefaultUncaughtExceptionHandler(), aVar));
                this.f13055c = true;
                CrashIntentService.Companion.b(g());
                return;
            }
        }
        throw new IllegalArgumentException("Invalid sentry endpoint url or key.");
    }

    /* compiled from: CrashGuard.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private List<String> f13058a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f13059b;

        public b() {
            this((List) null, (Map) null, 3, (i) null);
        }

        public b(List<String> list, Map<String, String> map) {
            p.j(list, ECommerceParamNames.FILTERS);
            p.j(map, "tags");
            this.f13058a = list;
            this.f13059b = map;
        }

        public final List<String> a() {
            return this.f13058a;
        }

        public final Map<String, String> b() {
            return this.f13059b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.e(this.f13058a, bVar.f13058a) && p.e(this.f13059b, bVar.f13059b);
        }

        public int hashCode() {
            return (this.f13058a.hashCode() * 31) + this.f13059b.hashCode();
        }

        public String toString() {
            return "Config(filters=" + this.f13058a + ", tags=" + this.f13059b + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(List list, Map map, int i11, i iVar) {
            this((i11 & 1) != 0 ? k.j() : list, (i11 & 2) != 0 ? new HashMap() : map);
        }
    }
}
