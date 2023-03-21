package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.b;
import androidx.core.view.a0;
import androidx.core.view.d;
import androidx.core.view.m0;
import androidx.core.view.n0;
import androidx.core.view.t;
import defpackage.a2;
import e0.g;
import e0.u;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: WindowInsets.android.kt */
public final class WindowInsetsHolder {
    public static final Companion v = new Companion((i) null);
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static final WeakHashMap<View, WindowInsetsHolder> f3860w = new WeakHashMap<>();

    /* renamed from: x  reason: collision with root package name */
    private static boolean f3861x;

    /* renamed from: a  reason: collision with root package name */
    private final a2.b f3862a;

    /* renamed from: b  reason: collision with root package name */
    private final a2.b f3863b;

    /* renamed from: c  reason: collision with root package name */
    private final a2.b f3864c;

    /* renamed from: d  reason: collision with root package name */
    private final a2.b f3865d;

    /* renamed from: e  reason: collision with root package name */
    private final a2.b f3866e;

    /* renamed from: f  reason: collision with root package name */
    private final a2.b f3867f;

    /* renamed from: g  reason: collision with root package name */
    private final a2.b f3868g;

    /* renamed from: h  reason: collision with root package name */
    private final a2.b f3869h;

    /* renamed from: i  reason: collision with root package name */
    private final a2.b f3870i;
    private final a2.v j;
    private final a2.x k;

    /* renamed from: l  reason: collision with root package name */
    private final a2.x f3871l;

    /* renamed from: m  reason: collision with root package name */
    private final a2.x f3872m;
    private final a2.v n;

    /* renamed from: o  reason: collision with root package name */
    private final a2.v f3873o;

    /* renamed from: p  reason: collision with root package name */
    private final a2.v f3874p;
    private final a2.v q;

    /* renamed from: r  reason: collision with root package name */
    private final a2.v f3875r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f3876s;
    private int t;

    /* renamed from: u  reason: collision with root package name */
    private final d f3877u;

    /* compiled from: WindowInsets.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final WindowInsetsHolder d(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.f3860w) {
                WeakHashMap a11 = WindowInsetsHolder.f3860w;
                Object obj = a11.get(view);
                if (obj == null) {
                    obj = new WindowInsetsHolder((n0) null, view, (i) null);
                    a11.put(view, obj);
                }
                windowInsetsHolder = (WindowInsetsHolder) obj;
            }
            return windowInsetsHolder;
        }

        /* access modifiers changed from: private */
        public final a2.b e(n0 n0Var, int i11, String str) {
            a2.b bVar = new a2.b(i11, str);
            if (n0Var != null) {
                bVar.h(n0Var, i11);
            }
            return bVar;
        }

        /* access modifiers changed from: private */
        public final a2.v f(n0 n0Var, int i11, String str) {
            b bVar;
            if (n0Var == null || (bVar = n0Var.g(i11)) == null) {
                bVar = b.f9234e;
            }
            p.i(bVar, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return a2.z.a(bVar, str);
        }

        public final WindowInsetsHolder c(g gVar, int i11) {
            gVar.E(-1366542614);
            View view = (View) gVar.z(AndroidCompositionLocals_androidKt.k());
            WindowInsetsHolder d11 = d(view);
            u.b(d11, new WindowInsetsHolder$Companion$current$1(d11, view), gVar, 8);
            gVar.P();
            return d11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0079, code lost:
        r7 = (r7 = r10.e()).e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private WindowInsetsHolder(androidx.core.view.n0 r10, android.view.View r11) {
        /*
            r9 = this;
            r9.<init>()
            androidx.compose.foundation.layout.WindowInsetsHolder$Companion r0 = v
            int r1 = androidx.core.view.n0.m.a()
            java.lang.String r2 = "captionBar"
            a2$b r1 = r0.e(r10, r1, r2)
            r9.f3862a = r1
            int r1 = androidx.core.view.n0.m.b()
            java.lang.String r2 = "displayCutout"
            a2$b r1 = r0.e(r10, r1, r2)
            r9.f3863b = r1
            int r2 = androidx.core.view.n0.m.c()
            java.lang.String r3 = "ime"
            a2$b r2 = r0.e(r10, r2, r3)
            r9.f3864c = r2
            int r3 = androidx.core.view.n0.m.e()
            java.lang.String r4 = "mandatorySystemGestures"
            a2$b r3 = r0.e(r10, r3, r4)
            r9.f3865d = r3
            int r4 = androidx.core.view.n0.m.f()
            java.lang.String r5 = "navigationBars"
            a2$b r4 = r0.e(r10, r4, r5)
            r9.f3866e = r4
            int r4 = androidx.core.view.n0.m.g()
            java.lang.String r5 = "statusBars"
            a2$b r4 = r0.e(r10, r4, r5)
            r9.f3867f = r4
            int r4 = androidx.core.view.n0.m.h()
            java.lang.String r5 = "systemBars"
            a2$b r4 = r0.e(r10, r4, r5)
            r9.f3868g = r4
            int r5 = androidx.core.view.n0.m.i()
            java.lang.String r6 = "systemGestures"
            a2$b r5 = r0.e(r10, r5, r6)
            r9.f3869h = r5
            int r6 = androidx.core.view.n0.m.j()
            java.lang.String r7 = "tappableElement"
            a2$b r6 = r0.e(r10, r6, r7)
            r9.f3870i = r6
            if (r10 == 0) goto L_0x007f
            androidx.core.view.d r7 = r10.e()
            if (r7 == 0) goto L_0x007f
            androidx.core.graphics.b r7 = r7.e()
            if (r7 != 0) goto L_0x0081
        L_0x007f:
            androidx.core.graphics.b r7 = androidx.core.graphics.b.f9234e
        L_0x0081:
            java.lang.String r8 = "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE"
            kotlin.jvm.internal.p.i(r7, r8)
            java.lang.String r8 = "waterfall"
            a2$v r7 = defpackage.a2.z.a(r7, r8)
            r9.j = r7
            a2$x r2 = defpackage.a2.y.c(r4, r2)
            a2$x r1 = defpackage.a2.y.c(r2, r1)
            r9.k = r1
            a2$x r2 = defpackage.a2.y.c(r6, r3)
            a2$x r2 = defpackage.a2.y.c(r2, r5)
            a2$x r2 = defpackage.a2.y.c(r2, r7)
            r9.f3871l = r2
            a2$x r1 = defpackage.a2.y.c(r1, r2)
            r9.f3872m = r1
            int r1 = androidx.core.view.n0.m.a()
            java.lang.String r2 = "captionBarIgnoringVisibility"
            a2$v r1 = r0.f(r10, r1, r2)
            r9.n = r1
            int r1 = androidx.core.view.n0.m.f()
            java.lang.String r2 = "navigationBarsIgnoringVisibility"
            a2$v r1 = r0.f(r10, r1, r2)
            r9.f3873o = r1
            int r1 = androidx.core.view.n0.m.g()
            java.lang.String r2 = "statusBarsIgnoringVisibility"
            a2$v r1 = r0.f(r10, r1, r2)
            r9.f3874p = r1
            int r1 = androidx.core.view.n0.m.h()
            java.lang.String r2 = "systemBarsIgnoringVisibility"
            a2$v r1 = r0.f(r10, r1, r2)
            r9.q = r1
            int r1 = androidx.core.view.n0.m.j()
            java.lang.String r2 = "tappableElementIgnoringVisibility"
            a2$v r10 = r0.f(r10, r1, r2)
            r9.f3875r = r10
            android.view.ViewParent r10 = r11.getParent()
            boolean r11 = r10 instanceof android.view.View
            r0 = 0
            if (r11 == 0) goto L_0x00f4
            android.view.View r10 = (android.view.View) r10
            goto L_0x00f5
        L_0x00f4:
            r10 = r0
        L_0x00f5:
            if (r10 == 0) goto L_0x00fe
            int r11 = androidx.compose.ui.R.id.consume_window_insets_tag
            java.lang.Object r10 = r10.getTag(r11)
            goto L_0x00ff
        L_0x00fe:
            r10 = r0
        L_0x00ff:
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L_0x0106
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x0106:
            if (r0 == 0) goto L_0x010d
            boolean r10 = r0.booleanValue()
            goto L_0x010e
        L_0x010d:
            r10 = 1
        L_0x010e:
            r9.f3876s = r10
            androidx.compose.foundation.layout.d r10 = new androidx.compose.foundation.layout.d
            r10.<init>(r9)
            r9.f3877u = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsHolder.<init>(androidx.core.view.n0, android.view.View):void");
    }

    public /* synthetic */ WindowInsetsHolder(n0 n0Var, View view, i iVar) {
        this(n0Var, view);
    }

    public static /* synthetic */ void h(WindowInsetsHolder windowInsetsHolder, n0 n0Var, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        windowInsetsHolder.g(n0Var, i11);
    }

    public final void b(View view) {
        p.j(view, "view");
        int i11 = this.t - 1;
        this.t = i11;
        if (i11 == 0) {
            a0.K0(view, (t) null);
            a0.U0(view, (m0.b) null);
            view.removeOnAttachStateChangeListener(this.f3877u);
        }
    }

    public final boolean c() {
        return this.f3876s;
    }

    public final a2.b d() {
        return this.f3866e;
    }

    public final a2.b e() {
        return this.f3867f;
    }

    public final void f(View view) {
        p.j(view, "view");
        if (this.t == 0) {
            a0.K0(view, this.f3877u);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f3877u);
            if (Build.VERSION.SDK_INT >= 30) {
                a0.U0(view, this.f3877u);
            }
        }
        this.t++;
    }

    public final void g(n0 n0Var, int i11) {
        p.j(n0Var, "windowInsets");
        if (f3861x) {
            WindowInsets B = n0Var.B();
            p.g(B);
            n0Var = n0.C(B);
        }
        p.i(n0Var, "if (testInsets) {\n      …   windowInsets\n        }");
        this.f3862a.h(n0Var, i11);
        this.f3864c.h(n0Var, i11);
        this.f3863b.h(n0Var, i11);
        this.f3866e.h(n0Var, i11);
        this.f3867f.h(n0Var, i11);
        this.f3868g.h(n0Var, i11);
        this.f3869h.h(n0Var, i11);
        this.f3870i.h(n0Var, i11);
        this.f3865d.h(n0Var, i11);
        if (i11 == 0) {
            a2.v vVar = this.n;
            b g11 = n0Var.g(n0.m.a());
            p.i(g11, "insets.getInsetsIgnoring…aptionBar()\n            )");
            vVar.f(a2.z.b(g11));
            a2.v vVar2 = this.f3873o;
            b g12 = n0Var.g(n0.m.f());
            p.i(g12, "insets.getInsetsIgnoring…ationBars()\n            )");
            vVar2.f(a2.z.b(g12));
            a2.v vVar3 = this.f3874p;
            b g13 = n0Var.g(n0.m.g());
            p.i(g13, "insets.getInsetsIgnoring…tatusBars()\n            )");
            vVar3.f(a2.z.b(g13));
            a2.v vVar4 = this.q;
            b g14 = n0Var.g(n0.m.h());
            p.i(g14, "insets.getInsetsIgnoring…ystemBars()\n            )");
            vVar4.f(a2.z.b(g14));
            a2.v vVar5 = this.f3875r;
            b g15 = n0Var.g(n0.m.j());
            p.i(g15, "insets.getInsetsIgnoring…leElement()\n            )");
            vVar5.f(a2.z.b(g15));
            d e11 = n0Var.e();
            if (e11 != null) {
                b e12 = e11.e();
                p.i(e12, "cutout.waterfallInsets");
                this.j.f(a2.z.b(e12));
            }
        }
        androidx.compose.runtime.snapshots.b.f6287e.g();
    }
}
