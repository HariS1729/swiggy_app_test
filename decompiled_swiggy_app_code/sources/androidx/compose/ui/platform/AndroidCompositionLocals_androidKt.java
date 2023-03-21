package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.g;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.r;
import bp0.k;
import e0.g;
import e0.h0;
import e0.m0;
import e0.n0;
import e0.s0;
import e0.u;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import l0.b;
import lp0.l;
import m1.d;

/* compiled from: AndroidCompositionLocals.android.kt */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<Configuration> f7042a = CompositionLocalKt.b(g.i(), AndroidCompositionLocals_androidKt$LocalConfiguration$1.f7048a);

    /* renamed from: b  reason: collision with root package name */
    private static final m0<Context> f7043b = CompositionLocalKt.d(AndroidCompositionLocals_androidKt$LocalContext$1.f7049a);

    /* renamed from: c  reason: collision with root package name */
    private static final m0<d> f7044c = CompositionLocalKt.d(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.f7050a);

    /* renamed from: d  reason: collision with root package name */
    private static final m0<r> f7045d = CompositionLocalKt.d(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.f7051a);

    /* renamed from: e  reason: collision with root package name */
    private static final m0<n3.d> f7046e = CompositionLocalKt.d(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.f7052a);

    /* renamed from: f  reason: collision with root package name */
    private static final m0<View> f7047f = CompositionLocalKt.d(AndroidCompositionLocals_androidKt$LocalView$1.f7053a);

    /* compiled from: AndroidCompositionLocals.android.kt */
    public static final class a implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef<Configuration> f7064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f7065b;

        a(Ref$ObjectRef<Configuration> ref$ObjectRef, d dVar) {
            this.f7064a = ref$ObjectRef;
            this.f7065b = dVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
            p.j(configuration, "configuration");
            Configuration configuration2 = (Configuration) this.f7064a.f25666a;
            this.f7065b.c(configuration2 != null ? configuration2.updateFrom(configuration) : -1);
            this.f7064a.f25666a = configuration;
        }

        public void onLowMemory() {
            this.f7065b.a();
        }

        public void onTrimMemory(int i11) {
            this.f7065b.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, lp0.p<? super e0.g, ? super Integer, k> pVar, e0.g gVar, int i11) {
        p.j(androidComposeView, "owner");
        p.j(pVar, "content");
        e0.g t = gVar.t(1396852028);
        Context context = androidComposeView.getContext();
        t.E(-492369756);
        Object F = t.F();
        g.a aVar = e0.g.f14172a;
        if (F == aVar.a()) {
            F = androidx.compose.runtime.g.g(context.getResources().getConfiguration(), androidx.compose.runtime.g.i());
            t.y(F);
        }
        t.P();
        h0 h0Var = (h0) F;
        t.E(1157296644);
        boolean k = t.k(h0Var);
        Object F2 = t.F();
        if (k || F2 == aVar.a()) {
            F2 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(h0Var);
            t.y(F2);
        }
        t.P();
        androidComposeView.setConfigurationChangeObserver((l) F2);
        t.E(-492369756);
        Object F3 = t.F();
        if (F3 == aVar.a()) {
            p.i(context, LogCategory.CONTEXT);
            F3 = new x(context);
            t.y(F3);
        }
        t.P();
        x xVar = (x) F3;
        AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            t.E(-492369756);
            Object F4 = t.F();
            if (F4 == aVar.a()) {
                F4 = DisposableSaveableStateRegistry_androidKt.a(androidComposeView, viewTreeOwners.b());
                t.y(F4);
            }
            t.P();
            i0 i0Var = (i0) F4;
            u.b(k.f22762a, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(i0Var), t, 0);
            p.i(context, LogCategory.CONTEXT);
            d m11 = m(context, b(h0Var), t, 72);
            m0<Configuration> m0Var = f7042a;
            Configuration b11 = b(h0Var);
            p.i(b11, "configuration");
            CompositionLocalKt.a(new n0[]{m0Var.c(b11), f7043b.c(context), f7045d.c(viewTreeOwners.a()), f7046e.c(viewTreeOwners.b()), SaveableStateRegistryKt.b().c(i0Var), f7047f.c(androidComposeView.getView()), f7044c.c(m11)}, b.b(t, 1471621628, true, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(androidComposeView, xVar, pVar, i11)), t, 56);
            s0 v = t.v();
            if (v != null) {
                v.a(new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(androidComposeView, pVar, i11));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    private static final Configuration b(h0<Configuration> h0Var) {
        return h0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void c(h0<Configuration> h0Var, Configuration configuration) {
        h0Var.setValue(configuration);
    }

    public static final m0<Configuration> f() {
        return f7042a;
    }

    public static final m0<Context> g() {
        return f7043b;
    }

    public static final m0<d> h() {
        return f7044c;
    }

    public static final m0<r> i() {
        return f7045d;
    }

    public static final m0<n3.d> j() {
        return f7046e;
    }

    public static final m0<View> k() {
        return f7047f;
    }

    /* access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final d m(Context context, T t, e0.g gVar, int i11) {
        gVar.E(-485908294);
        gVar.E(-492369756);
        Object F = gVar.F();
        g.a aVar = e0.g.f14172a;
        if (F == aVar.a()) {
            F = new d();
            gVar.y(F);
        }
        gVar.P();
        d dVar = (d) F;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        gVar.E(-492369756);
        T F2 = gVar.F();
        if (F2 == aVar.a()) {
            gVar.y(t);
        } else {
            t = F2;
        }
        gVar.P();
        ref$ObjectRef.f25666a = t;
        gVar.E(-492369756);
        Object F3 = gVar.F();
        if (F3 == aVar.a()) {
            F3 = new a(ref$ObjectRef, dVar);
            gVar.y(F3);
        }
        gVar.P();
        u.b(dVar, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (a) F3), gVar, 8);
        gVar.P();
        return dVar;
    }
}
