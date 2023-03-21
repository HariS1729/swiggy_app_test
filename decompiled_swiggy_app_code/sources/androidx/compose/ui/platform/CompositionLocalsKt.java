package androidx.compose.ui.platform;

import a1.a;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.b;
import bp0.k;
import d2.e;
import e0.g;
import e0.m0;
import e0.n0;
import e0.s0;
import f1.s;
import k1.q;
import lp0.p;
import q0.d;
import q0.i;
import s0.f;
import u1.h;
import u1.i;
import v1.a0;

/* compiled from: CompositionLocals.kt */
public final class CompositionLocalsKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<h> f7104a = CompositionLocalKt.d(CompositionLocalsKt$LocalAccessibilityManager$1.f7117a);

    /* renamed from: b  reason: collision with root package name */
    private static final m0<d> f7105b = CompositionLocalKt.d(CompositionLocalsKt$LocalAutofill$1.f7118a);

    /* renamed from: c  reason: collision with root package name */
    private static final m0<i> f7106c = CompositionLocalKt.d(CompositionLocalsKt$LocalAutofillTree$1.f7119a);

    /* renamed from: d  reason: collision with root package name */
    private static final m0<e0> f7107d = CompositionLocalKt.d(CompositionLocalsKt$LocalClipboardManager$1.f7120a);

    /* renamed from: e  reason: collision with root package name */
    private static final m0<e> f7108e = CompositionLocalKt.d(CompositionLocalsKt$LocalDensity$1.f7121a);

    /* renamed from: f  reason: collision with root package name */
    private static final m0<f> f7109f = CompositionLocalKt.d(CompositionLocalsKt$LocalFocusManager$1.f7122a);

    /* renamed from: g  reason: collision with root package name */
    private static final m0<h.a> f7110g = CompositionLocalKt.d(CompositionLocalsKt$LocalFontLoader$1.f7124a);

    /* renamed from: h  reason: collision with root package name */
    private static final m0<i.b> f7111h = CompositionLocalKt.d(CompositionLocalsKt$LocalFontFamilyResolver$1.f7123a);

    /* renamed from: i  reason: collision with root package name */
    private static final m0<a> f7112i = CompositionLocalKt.d(CompositionLocalsKt$LocalHapticFeedback$1.f7125a);
    private static final m0<b> j = CompositionLocalKt.d(CompositionLocalsKt$LocalInputModeManager$1.f7126a);
    private static final m0<LayoutDirection> k = CompositionLocalKt.d(CompositionLocalsKt$LocalLayoutDirection$1.f7127a);

    /* renamed from: l  reason: collision with root package name */
    private static final m0<a0> f7113l = CompositionLocalKt.d(CompositionLocalsKt$LocalTextInputService$1.f7129a);

    /* renamed from: m  reason: collision with root package name */
    private static final m0<g1> f7114m = CompositionLocalKt.d(CompositionLocalsKt$LocalTextToolbar$1.f7130a);
    private static final m0<i1> n = CompositionLocalKt.d(CompositionLocalsKt$LocalUriHandler$1.f7131a);

    /* renamed from: o  reason: collision with root package name */
    private static final m0<n1> f7115o = CompositionLocalKt.d(CompositionLocalsKt$LocalViewConfiguration$1.f7132a);

    /* renamed from: p  reason: collision with root package name */
    private static final m0<v1> f7116p = CompositionLocalKt.d(CompositionLocalsKt$LocalWindowInfo$1.f7133a);
    private static final m0<s> q = CompositionLocalKt.d(CompositionLocalsKt$LocalPointerIconService$1.f7128a);

    public static final void a(q qVar, i1 i1Var, p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        kotlin.jvm.internal.p.j(qVar, "owner");
        kotlin.jvm.internal.p.j(i1Var, "uriHandler");
        kotlin.jvm.internal.p.j(pVar, "content");
        g t = gVar.t(874662829);
        if ((i11 & 14) == 0) {
            i12 = (t.k(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(i1Var) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= t.k(pVar) ? 256 : 128;
        }
        if ((i12 & 731) != 146 || !t.b()) {
            CompositionLocalKt.a(new n0[]{f7104a.c(qVar.getAccessibilityManager()), f7105b.c(qVar.getAutofill()), f7106c.c(qVar.getAutofillTree()), f7107d.c(qVar.getClipboardManager()), f7108e.c(qVar.getDensity()), f7109f.c(qVar.getFocusManager()), f7110g.d(qVar.getFontLoader()), f7111h.d(qVar.getFontFamilyResolver()), f7112i.c(qVar.getHapticFeedBack()), j.c(qVar.getInputModeManager()), k.c(qVar.getLayoutDirection()), f7113l.c(qVar.getTextInputService()), f7114m.c(qVar.getTextToolbar()), n.c(i1Var), f7115o.c(qVar.getViewConfiguration()), f7116p.c(qVar.getWindowInfo()), q.c(qVar.getPointerIconService())}, pVar, t, ((i12 >> 3) & 112) | 8);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new CompositionLocalsKt$ProvideCommonCompositionLocals$1(qVar, i1Var, pVar, i11));
        }
    }

    public static final m0<h> c() {
        return f7104a;
    }

    public static final m0<e0> d() {
        return f7107d;
    }

    public static final m0<e> e() {
        return f7108e;
    }

    public static final m0<f> f() {
        return f7109f;
    }

    public static final m0<i.b> g() {
        return f7111h;
    }

    public static final m0<a> h() {
        return f7112i;
    }

    public static final m0<b> i() {
        return j;
    }

    public static final m0<LayoutDirection> j() {
        return k;
    }

    public static final m0<s> k() {
        return q;
    }

    public static final m0<a0> l() {
        return f7113l;
    }

    public static final m0<g1> m() {
        return f7114m;
    }

    public static final m0<n1> n() {
        return f7115o;
    }

    /* access modifiers changed from: private */
    public static final Void o(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
