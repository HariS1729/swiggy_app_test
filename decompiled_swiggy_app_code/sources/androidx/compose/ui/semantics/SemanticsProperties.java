package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import bp0.k;
import java.util.List;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;
import n1.b;
import n1.c;
import n1.e;
import n1.f;
import n1.g;
import n1.h;
import p1.a0;

/* compiled from: SemanticsProperties.kt */
public final class SemanticsProperties {
    private static final SemanticsPropertyKey<String> A = new SemanticsPropertyKey<>("Error", (p) null, 2, (i) null);
    private static final SemanticsPropertyKey<l<Object, Integer>> B = new SemanticsPropertyKey<>("IndexForKey", (p) null, 2, (i) null);

    /* renamed from: a  reason: collision with root package name */
    public static final SemanticsProperties f7428a = new SemanticsProperties();

    /* renamed from: b  reason: collision with root package name */
    private static final SemanticsPropertyKey<List<String>> f7429b = new SemanticsPropertyKey<>("ContentDescription", SemanticsProperties$ContentDescription$1.f7448a);

    /* renamed from: c  reason: collision with root package name */
    private static final SemanticsPropertyKey<String> f7430c = new SemanticsPropertyKey<>("StateDescription", (p) null, 2, (i) null);

    /* renamed from: d  reason: collision with root package name */
    private static final SemanticsPropertyKey<f> f7431d = new SemanticsPropertyKey<>("ProgressBarRangeInfo", (p) null, 2, (i) null);

    /* renamed from: e  reason: collision with root package name */
    private static final SemanticsPropertyKey<String> f7432e = new SemanticsPropertyKey<>("PaneTitle", SemanticsProperties$PaneTitle$1.f7452a);

    /* renamed from: f  reason: collision with root package name */
    private static final SemanticsPropertyKey<k> f7433f = new SemanticsPropertyKey<>("SelectableGroup", (p) null, 2, (i) null);

    /* renamed from: g  reason: collision with root package name */
    private static final SemanticsPropertyKey<b> f7434g = new SemanticsPropertyKey<>("CollectionInfo", (p) null, 2, (i) null);

    /* renamed from: h  reason: collision with root package name */
    private static final SemanticsPropertyKey<c> f7435h = new SemanticsPropertyKey<>("CollectionItemInfo", (p) null, 2, (i) null);

    /* renamed from: i  reason: collision with root package name */
    private static final SemanticsPropertyKey<k> f7436i = new SemanticsPropertyKey<>("Heading", (p) null, 2, (i) null);
    private static final SemanticsPropertyKey<k> j = new SemanticsPropertyKey<>("Disabled", (p) null, 2, (i) null);
    private static final SemanticsPropertyKey<e> k = new SemanticsPropertyKey<>("LiveRegion", (p) null, 2, (i) null);

    /* renamed from: l  reason: collision with root package name */
    private static final SemanticsPropertyKey<Boolean> f7437l = new SemanticsPropertyKey<>("Focused", (p) null, 2, (i) null);

    /* renamed from: m  reason: collision with root package name */
    private static final SemanticsPropertyKey<k> f7438m = new SemanticsPropertyKey<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.f7449a);
    private static final SemanticsPropertyKey<h> n = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", (p) null, 2, (i) null);

    /* renamed from: o  reason: collision with root package name */
    private static final SemanticsPropertyKey<h> f7439o = new SemanticsPropertyKey<>("VerticalScrollAxisRange", (p) null, 2, (i) null);

    /* renamed from: p  reason: collision with root package name */
    private static final SemanticsPropertyKey<k> f7440p = new SemanticsPropertyKey<>("IsPopup", SemanticsProperties$IsPopup$1.f7451a);
    private static final SemanticsPropertyKey<k> q = new SemanticsPropertyKey<>("IsDialog", SemanticsProperties$IsDialog$1.f7450a);

    /* renamed from: r  reason: collision with root package name */
    private static final SemanticsPropertyKey<g> f7441r = new SemanticsPropertyKey<>("Role", SemanticsProperties$Role$1.f7453a);

    /* renamed from: s  reason: collision with root package name */
    private static final SemanticsPropertyKey<String> f7442s = new SemanticsPropertyKey<>("TestTag", SemanticsProperties$TestTag$1.f7454a);
    private static final SemanticsPropertyKey<List<p1.b>> t = new SemanticsPropertyKey<>("Text", SemanticsProperties$Text$1.f7455a);

    /* renamed from: u  reason: collision with root package name */
    private static final SemanticsPropertyKey<p1.b> f7443u = new SemanticsPropertyKey<>("EditableText", (p) null, 2, (i) null);
    private static final SemanticsPropertyKey<a0> v = new SemanticsPropertyKey<>("TextSelectionRange", (p) null, 2, (i) null);

    /* renamed from: w  reason: collision with root package name */
    private static final SemanticsPropertyKey<v1.l> f7444w = new SemanticsPropertyKey<>("ImeAction", (p) null, 2, (i) null);

    /* renamed from: x  reason: collision with root package name */
    private static final SemanticsPropertyKey<Boolean> f7445x = new SemanticsPropertyKey<>("Selected", (p) null, 2, (i) null);

    /* renamed from: y  reason: collision with root package name */
    private static final SemanticsPropertyKey<ToggleableState> f7446y = new SemanticsPropertyKey<>("ToggleableState", (p) null, 2, (i) null);

    /* renamed from: z  reason: collision with root package name */
    private static final SemanticsPropertyKey<k> f7447z = new SemanticsPropertyKey<>("Password", (p) null, 2, (i) null);

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey<h> A() {
        return f7439o;
    }

    public final SemanticsPropertyKey<b> a() {
        return f7434g;
    }

    public final SemanticsPropertyKey<c> b() {
        return f7435h;
    }

    public final SemanticsPropertyKey<List<String>> c() {
        return f7429b;
    }

    public final SemanticsPropertyKey<k> d() {
        return j;
    }

    public final SemanticsPropertyKey<p1.b> e() {
        return f7443u;
    }

    public final SemanticsPropertyKey<String> f() {
        return A;
    }

    public final SemanticsPropertyKey<Boolean> g() {
        return f7437l;
    }

    public final SemanticsPropertyKey<k> h() {
        return f7436i;
    }

    public final SemanticsPropertyKey<h> i() {
        return n;
    }

    public final SemanticsPropertyKey<v1.l> j() {
        return f7444w;
    }

    public final SemanticsPropertyKey<l<Object, Integer>> k() {
        return B;
    }

    public final SemanticsPropertyKey<k> l() {
        return f7438m;
    }

    public final SemanticsPropertyKey<k> m() {
        return q;
    }

    public final SemanticsPropertyKey<k> n() {
        return f7440p;
    }

    public final SemanticsPropertyKey<e> o() {
        return k;
    }

    public final SemanticsPropertyKey<String> p() {
        return f7432e;
    }

    public final SemanticsPropertyKey<k> q() {
        return f7447z;
    }

    public final SemanticsPropertyKey<f> r() {
        return f7431d;
    }

    public final SemanticsPropertyKey<g> s() {
        return f7441r;
    }

    public final SemanticsPropertyKey<k> t() {
        return f7433f;
    }

    public final SemanticsPropertyKey<Boolean> u() {
        return f7445x;
    }

    public final SemanticsPropertyKey<String> v() {
        return f7430c;
    }

    public final SemanticsPropertyKey<String> w() {
        return f7442s;
    }

    public final SemanticsPropertyKey<List<p1.b>> x() {
        return t;
    }

    public final SemanticsPropertyKey<a0> y() {
        return v;
    }

    public final SemanticsPropertyKey<ToggleableState> z() {
        return f7446y;
    }
}
