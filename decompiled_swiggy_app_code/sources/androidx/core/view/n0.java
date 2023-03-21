package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: WindowInsetsCompat */
public class n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f9558b;

    /* renamed from: a  reason: collision with root package name */
    private final l f9559a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* compiled from: WindowInsetsCompat */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f9560a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f9561b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f9562c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f9563d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f9560a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f9561b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f9562c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e11) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e11.getMessage(), e11);
            }
        }

        public static n0 a(View view) {
            if (f9563d && view.isAttachedToWindow()) {
                try {
                    Object obj = f9560a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f9561b.get(obj);
                        Rect rect2 = (Rect) f9562c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            n0 a11 = new b().c(androidx.core.graphics.b.c(rect)).d(androidx.core.graphics.b.c(rect2)).a();
                            a11.z(a11);
                            a11.d(view.getRootView());
                            return a11;
                        }
                    }
                } catch (IllegalAccessException e11) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e11.getMessage(), e11);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class e extends d {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void c(int i11, androidx.core.graphics.b bVar) {
            this.f9571c.setInsets(n.a(i11), bVar.e());
        }

        e(n0 n0Var) {
            super(n0Var);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private final n0 f9572a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.b[] f9573b;

        f() {
            this(new n0((n0) null));
        }

        /* access modifiers changed from: protected */
        public final void a() {
            androidx.core.graphics.b[] bVarArr = this.f9573b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVar = bVarArr[m.d(1)];
                androidx.core.graphics.b bVar2 = this.f9573b[m.d(2)];
                if (bVar2 == null) {
                    bVar2 = this.f9572a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f9572a.f(1);
                }
                g(androidx.core.graphics.b.a(bVar, bVar2));
                androidx.core.graphics.b bVar3 = this.f9573b[m.d(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                androidx.core.graphics.b bVar4 = this.f9573b[m.d(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                androidx.core.graphics.b bVar5 = this.f9573b[m.d(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public n0 b() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(int i11, androidx.core.graphics.b bVar) {
            if (this.f9573b == null) {
                this.f9573b = new androidx.core.graphics.b[9];
            }
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    this.f9573b[m.d(i12)] = bVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.b bVar) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.b bVar) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void h(androidx.core.graphics.b bVar) {
        }

        f(n0 n0Var) {
            this.f9572a = n0Var;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class i extends h {
        i(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public n0 a() {
            return n0.C(this.f9577c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (!Objects.equals(this.f9577c, iVar.f9577c) || !Objects.equals(this.f9581g, iVar.f9581g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public d f() {
            return d.f(this.f9577c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f9577c.hashCode();
        }

        i(n0 n0Var, i iVar) {
            super(n0Var, (h) iVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class k extends j {
        static final n0 q = n0.C(WindowInsets.CONSUMED);

        k(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public final void d(View view) {
        }

        public androidx.core.graphics.b g(int i11) {
            return androidx.core.graphics.b.d(this.f9577c.getInsets(n.a(i11)));
        }

        public androidx.core.graphics.b h(int i11) {
            return androidx.core.graphics.b.d(this.f9577c.getInsetsIgnoringVisibility(n.a(i11)));
        }

        public boolean q(int i11) {
            return this.f9577c.isVisible(n.a(i11));
        }

        k(n0 n0Var, k kVar) {
            super(n0Var, (j) kVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class l {

        /* renamed from: b  reason: collision with root package name */
        static final n0 f9585b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final n0 f9586a;

        l(n0 n0Var) {
            this.f9586a = n0Var;
        }

        /* access modifiers changed from: package-private */
        public n0 a() {
            return this.f9586a;
        }

        /* access modifiers changed from: package-private */
        public n0 b() {
            return this.f9586a;
        }

        /* access modifiers changed from: package-private */
        public n0 c() {
            return this.f9586a;
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
        }

        /* access modifiers changed from: package-private */
        public void e(n0 n0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (p() != lVar.p() || o() != lVar.o() || !androidx.core.util.c.a(l(), lVar.l()) || !androidx.core.util.c.a(j(), lVar.j()) || !androidx.core.util.c.a(f(), lVar.f())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public d f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b g(int i11) {
            return androidx.core.graphics.b.f9234e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b h(int i11) {
            if ((i11 & 8) == 0) {
                return androidx.core.graphics.b.f9234e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b i() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b j() {
            return androidx.core.graphics.b.f9234e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b k() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b l() {
            return androidx.core.graphics.b.f9234e;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b m() {
            return l();
        }

        /* access modifiers changed from: package-private */
        public n0 n(int i11, int i12, int i13, int i14) {
            return f9585b;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean q(int i11) {
            return true;
        }

        public void r(androidx.core.graphics.b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        public void s(androidx.core.graphics.b bVar) {
        }

        /* access modifiers changed from: package-private */
        public void t(n0 n0Var) {
        }

        public void u(androidx.core.graphics.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i11) {
            if (i11 == 1) {
                return 0;
            }
            if (i11 == 2) {
                return 1;
            }
            if (i11 == 4) {
                return 2;
            }
            if (i11 == 8) {
                return 3;
            }
            if (i11 == 16) {
                return 4;
            }
            if (i11 == 32) {
                return 5;
            }
            if (i11 == 64) {
                return 6;
            }
            if (i11 == 128) {
                return 7;
            }
            if (i11 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i11);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static final class n {
        static int a(int i11) {
            int i12;
            int i13 = 0;
            for (int i14 = 1; i14 <= 256; i14 <<= 1) {
                if ((i11 & i14) != 0) {
                    if (i14 == 1) {
                        i12 = WindowInsets.Type.statusBars();
                    } else if (i14 == 2) {
                        i12 = WindowInsets.Type.navigationBars();
                    } else if (i14 == 4) {
                        i12 = WindowInsets.Type.captionBar();
                    } else if (i14 == 8) {
                        i12 = WindowInsets.Type.ime();
                    } else if (i14 == 16) {
                        i12 = WindowInsets.Type.systemGestures();
                    } else if (i14 == 32) {
                        i12 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i14 == 64) {
                        i12 = WindowInsets.Type.tappableElement();
                    } else if (i14 == 128) {
                        i12 = WindowInsets.Type.displayCutout();
                    }
                    i13 |= i12;
                }
            }
            return i13;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f9558b = k.q;
        } else {
            f9558b = l.f9585b;
        }
    }

    private n0(WindowInsets windowInsets) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f9559a = new k(this, windowInsets);
        } else if (i11 >= 29) {
            this.f9559a = new j(this, windowInsets);
        } else if (i11 >= 28) {
            this.f9559a = new i(this, windowInsets);
        } else {
            this.f9559a = new h(this, windowInsets);
        }
    }

    public static n0 C(WindowInsets windowInsets) {
        return D(windowInsets, (View) null);
    }

    public static n0 D(WindowInsets windowInsets, View view) {
        n0 n0Var = new n0((WindowInsets) androidx.core.util.g.g(windowInsets));
        if (view != null && a0.Z(view)) {
            n0Var.z(a0.M(view));
            n0Var.d(view.getRootView());
        }
        return n0Var;
    }

    static androidx.core.graphics.b t(androidx.core.graphics.b bVar, int i11, int i12, int i13, int i14) {
        int max = Math.max(0, bVar.f9235a - i11);
        int max2 = Math.max(0, bVar.f9236b - i12);
        int max3 = Math.max(0, bVar.f9237c - i13);
        int max4 = Math.max(0, bVar.f9238d - i14);
        if (max == i11 && max2 == i12 && max3 == i13 && max4 == i14) {
            return bVar;
        }
        return androidx.core.graphics.b.b(max, max2, max3, max4);
    }

    /* access modifiers changed from: package-private */
    public void A(androidx.core.graphics.b bVar) {
        this.f9559a.u(bVar);
    }

    public WindowInsets B() {
        l lVar = this.f9559a;
        if (lVar instanceof g) {
            return ((g) lVar).f9577c;
        }
        return null;
    }

    @Deprecated
    public n0 a() {
        return this.f9559a.a();
    }

    @Deprecated
    public n0 b() {
        return this.f9559a.b();
    }

    @Deprecated
    public n0 c() {
        return this.f9559a.c();
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        this.f9559a.d(view);
    }

    public d e() {
        return this.f9559a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        return androidx.core.util.c.a(this.f9559a, ((n0) obj).f9559a);
    }

    public androidx.core.graphics.b f(int i11) {
        return this.f9559a.g(i11);
    }

    public androidx.core.graphics.b g(int i11) {
        return this.f9559a.h(i11);
    }

    @Deprecated
    public androidx.core.graphics.b h() {
        return this.f9559a.i();
    }

    public int hashCode() {
        l lVar = this.f9559a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f9559a.j().f9238d;
    }

    @Deprecated
    public int j() {
        return this.f9559a.j().f9235a;
    }

    @Deprecated
    public int k() {
        return this.f9559a.j().f9237c;
    }

    @Deprecated
    public int l() {
        return this.f9559a.j().f9236b;
    }

    @Deprecated
    public androidx.core.graphics.b m() {
        return this.f9559a.j();
    }

    @Deprecated
    public androidx.core.graphics.b n() {
        return this.f9559a.k();
    }

    @Deprecated
    public int o() {
        return this.f9559a.l().f9238d;
    }

    @Deprecated
    public int p() {
        return this.f9559a.l().f9235a;
    }

    @Deprecated
    public int q() {
        return this.f9559a.l().f9237c;
    }

    @Deprecated
    public int r() {
        return this.f9559a.l().f9236b;
    }

    public n0 s(int i11, int i12, int i13, int i14) {
        return this.f9559a.n(i11, i12, i13, i14);
    }

    public boolean u() {
        return this.f9559a.o();
    }

    public boolean v(int i11) {
        return this.f9559a.q(i11);
    }

    @Deprecated
    public n0 w(int i11, int i12, int i13, int i14) {
        return new b(this).d(androidx.core.graphics.b.b(i11, i12, i13, i14)).a();
    }

    /* access modifiers changed from: package-private */
    public void x(androidx.core.graphics.b[] bVarArr) {
        this.f9559a.r(bVarArr);
    }

    /* access modifiers changed from: package-private */
    public void y(androidx.core.graphics.b bVar) {
        this.f9559a.s(bVar);
    }

    /* access modifiers changed from: package-private */
    public void z(n0 n0Var) {
        this.f9559a.t(n0Var);
    }

    /* compiled from: WindowInsetsCompat */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f9565e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f9566f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f9567g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f9568h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f9569c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b f9570d;

        c() {
            this.f9569c = i();
        }

        private static WindowInsets i() {
            if (!f9566f) {
                try {
                    f9565e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e11);
                }
                f9566f = true;
            }
            Field field = f9565e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e12);
                }
            }
            if (!f9568h) {
                try {
                    f9567g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e13);
                }
                f9568h = true;
            }
            Constructor<WindowInsets> constructor = f9567g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e14) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e14);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public n0 b() {
            a();
            n0 C = n0.C(this.f9569c);
            C.x(this.f9573b);
            C.A(this.f9570d);
            return C;
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.b bVar) {
            this.f9570d = bVar;
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f9569c;
            if (windowInsets != null) {
                this.f9569c = windowInsets.replaceSystemWindowInsets(bVar.f9235a, bVar.f9236b, bVar.f9237c, bVar.f9238d);
            }
        }

        c(n0 n0Var) {
            super(n0Var);
            this.f9569c = n0Var.B();
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f9571c;

        d() {
            this.f9571c = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        public n0 b() {
            a();
            n0 C = n0.C(this.f9571c.build());
            C.x(this.f9573b);
            return C;
        }

        /* access modifiers changed from: package-private */
        public void d(androidx.core.graphics.b bVar) {
            this.f9571c.setMandatorySystemGestureInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.core.graphics.b bVar) {
            this.f9571c.setStableInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void f(androidx.core.graphics.b bVar) {
            this.f9571c.setSystemGestureInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void g(androidx.core.graphics.b bVar) {
            this.f9571c.setSystemWindowInsets(bVar.e());
        }

        /* access modifiers changed from: package-private */
        public void h(androidx.core.graphics.b bVar) {
            this.f9571c.setTappableElementInsets(bVar.e());
        }

        d(n0 n0Var) {
            super(n0Var);
            WindowInsets.Builder builder;
            WindowInsets B = n0Var.B();
            if (B != null) {
                builder = new WindowInsets.Builder(B);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f9571c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.b f9582m = null;

        h(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public n0 b() {
            return n0.C(this.f9577c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        public n0 c() {
            return n0.C(this.f9577c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.b j() {
            if (this.f9582m == null) {
                this.f9582m = androidx.core.graphics.b.b(this.f9577c.getStableInsetLeft(), this.f9577c.getStableInsetTop(), this.f9577c.getStableInsetRight(), this.f9577c.getStableInsetBottom());
            }
            return this.f9582m;
        }

        /* access modifiers changed from: package-private */
        public boolean o() {
            return this.f9577c.isConsumed();
        }

        public void u(androidx.core.graphics.b bVar) {
            this.f9582m = bVar;
        }

        h(n0 n0Var, h hVar) {
            super(n0Var, (g) hVar);
            this.f9582m = hVar.f9582m;
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f9574h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f9575i;
        private static Class<?> j;
        private static Field k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f9576l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f9577c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b[] f9578d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.b f9579e;

        /* renamed from: f  reason: collision with root package name */
        private n0 f9580f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.b f9581g;

        g(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var);
            this.f9579e = null;
            this.f9577c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void A() {
            try {
                f9575i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                f9576l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                f9576l.setAccessible(true);
            } catch (ReflectiveOperationException e11) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e11.getMessage(), e11);
            }
            f9574h = true;
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b v(int i11, boolean z11) {
            androidx.core.graphics.b bVar = androidx.core.graphics.b.f9234e;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    bVar = androidx.core.graphics.b.a(bVar, w(i12, z11));
                }
            }
            return bVar;
        }

        private androidx.core.graphics.b x() {
            n0 n0Var = this.f9580f;
            if (n0Var != null) {
                return n0Var.m();
            }
            return androidx.core.graphics.b.f9234e;
        }

        private androidx.core.graphics.b y(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f9574h) {
                    A();
                }
                Method method = f9575i;
                if (!(method == null || j == null || k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) k.get(f9576l.get(invoke));
                        if (rect != null) {
                            return androidx.core.graphics.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e11) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e11.getMessage(), e11);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        /* access modifiers changed from: package-private */
        public void d(View view) {
            androidx.core.graphics.b y11 = y(view);
            if (y11 == null) {
                y11 = androidx.core.graphics.b.f9234e;
            }
            s(y11);
        }

        /* access modifiers changed from: package-private */
        public void e(n0 n0Var) {
            n0Var.z(this.f9580f);
            n0Var.y(this.f9581g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f9581g, ((g) obj).f9581g);
        }

        public androidx.core.graphics.b g(int i11) {
            return v(i11, false);
        }

        public androidx.core.graphics.b h(int i11) {
            return v(i11, true);
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.graphics.b l() {
            if (this.f9579e == null) {
                this.f9579e = androidx.core.graphics.b.b(this.f9577c.getSystemWindowInsetLeft(), this.f9577c.getSystemWindowInsetTop(), this.f9577c.getSystemWindowInsetRight(), this.f9577c.getSystemWindowInsetBottom());
            }
            return this.f9579e;
        }

        /* access modifiers changed from: package-private */
        public n0 n(int i11, int i12, int i13, int i14) {
            b bVar = new b(n0.C(this.f9577c));
            bVar.d(n0.t(l(), i11, i12, i13, i14));
            bVar.c(n0.t(j(), i11, i12, i13, i14));
            return bVar.a();
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return this.f9577c.isRound();
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean q(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0 && !z(i12)) {
                    return false;
                }
            }
            return true;
        }

        public void r(androidx.core.graphics.b[] bVarArr) {
            this.f9578d = bVarArr;
        }

        /* access modifiers changed from: package-private */
        public void s(androidx.core.graphics.b bVar) {
            this.f9581g = bVar;
        }

        /* access modifiers changed from: package-private */
        public void t(n0 n0Var) {
            this.f9580f = n0Var;
        }

        /* access modifiers changed from: protected */
        public androidx.core.graphics.b w(int i11, boolean z11) {
            int i12;
            d dVar;
            if (i11 != 1) {
                androidx.core.graphics.b bVar = null;
                if (i11 != 2) {
                    if (i11 == 8) {
                        androidx.core.graphics.b[] bVarArr = this.f9578d;
                        if (bVarArr != null) {
                            bVar = bVarArr[m.d(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        androidx.core.graphics.b l11 = l();
                        androidx.core.graphics.b x11 = x();
                        int i13 = l11.f9238d;
                        if (i13 > x11.f9238d) {
                            return androidx.core.graphics.b.b(0, 0, 0, i13);
                        }
                        androidx.core.graphics.b bVar2 = this.f9581g;
                        if (bVar2 == null || bVar2.equals(androidx.core.graphics.b.f9234e) || (i12 = this.f9581g.f9238d) <= x11.f9238d) {
                            return androidx.core.graphics.b.f9234e;
                        }
                        return androidx.core.graphics.b.b(0, 0, 0, i12);
                    } else if (i11 == 16) {
                        return k();
                    } else {
                        if (i11 == 32) {
                            return i();
                        }
                        if (i11 == 64) {
                            return m();
                        }
                        if (i11 != 128) {
                            return androidx.core.graphics.b.f9234e;
                        }
                        n0 n0Var = this.f9580f;
                        if (n0Var != null) {
                            dVar = n0Var.e();
                        } else {
                            dVar = f();
                        }
                        if (dVar != null) {
                            return androidx.core.graphics.b.b(dVar.b(), dVar.d(), dVar.c(), dVar.a());
                        }
                        return androidx.core.graphics.b.f9234e;
                    }
                } else if (z11) {
                    androidx.core.graphics.b x12 = x();
                    androidx.core.graphics.b j11 = j();
                    return androidx.core.graphics.b.b(Math.max(x12.f9235a, j11.f9235a), 0, Math.max(x12.f9237c, j11.f9237c), Math.max(x12.f9238d, j11.f9238d));
                } else {
                    androidx.core.graphics.b l12 = l();
                    n0 n0Var2 = this.f9580f;
                    if (n0Var2 != null) {
                        bVar = n0Var2.m();
                    }
                    int i14 = l12.f9238d;
                    if (bVar != null) {
                        i14 = Math.min(i14, bVar.f9238d);
                    }
                    return androidx.core.graphics.b.b(l12.f9235a, 0, l12.f9237c, i14);
                }
            } else if (z11) {
                return androidx.core.graphics.b.b(0, Math.max(x().f9236b, l().f9236b), 0, 0);
            } else {
                return androidx.core.graphics.b.b(0, l().f9236b, 0, 0);
            }
        }

        /* access modifiers changed from: protected */
        public boolean z(int i11) {
            if (!(i11 == 1 || i11 == 2)) {
                if (i11 == 4) {
                    return false;
                }
                if (!(i11 == 8 || i11 == 128)) {
                    return true;
                }
            }
            return !w(i11, false).equals(androidx.core.graphics.b.f9234e);
        }

        g(n0 n0Var, g gVar) {
            this(n0Var, new WindowInsets(gVar.f9577c));
        }
    }

    /* compiled from: WindowInsetsCompat */
    private static class j extends i {
        private androidx.core.graphics.b n = null;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.b f9583o = null;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.b f9584p = null;

        j(n0 n0Var, WindowInsets windowInsets) {
            super(n0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b i() {
            if (this.f9583o == null) {
                this.f9583o = androidx.core.graphics.b.d(this.f9577c.getMandatorySystemGestureInsets());
            }
            return this.f9583o;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b k() {
            if (this.n == null) {
                this.n = androidx.core.graphics.b.d(this.f9577c.getSystemGestureInsets());
            }
            return this.n;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.graphics.b m() {
            if (this.f9584p == null) {
                this.f9584p = androidx.core.graphics.b.d(this.f9577c.getTappableElementInsets());
            }
            return this.f9584p;
        }

        /* access modifiers changed from: package-private */
        public n0 n(int i11, int i12, int i13, int i14) {
            return n0.C(this.f9577c.inset(i11, i12, i13, i14));
        }

        public void u(androidx.core.graphics.b bVar) {
        }

        j(n0 n0Var, j jVar) {
            super(n0Var, (i) jVar);
        }
    }

    /* compiled from: WindowInsetsCompat */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f9564a;

        public b() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f9564a = new e();
            } else if (i11 >= 29) {
                this.f9564a = new d();
            } else {
                this.f9564a = new c();
            }
        }

        public n0 a() {
            return this.f9564a.b();
        }

        public b b(int i11, androidx.core.graphics.b bVar) {
            this.f9564a.c(i11, bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f9564a.e(bVar);
            return this;
        }

        @Deprecated
        public b d(androidx.core.graphics.b bVar) {
            this.f9564a.g(bVar);
            return this;
        }

        public b(n0 n0Var) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f9564a = new e(n0Var);
            } else if (i11 >= 29) {
                this.f9564a = new d(n0Var);
            } else {
                this.f9564a = new c(n0Var);
            }
        }
    }

    public n0(n0 n0Var) {
        if (n0Var != null) {
            l lVar = n0Var.f9559a;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && (lVar instanceof k)) {
                this.f9559a = new k(this, (k) lVar);
            } else if (i11 >= 29 && (lVar instanceof j)) {
                this.f9559a = new j(this, (j) lVar);
            } else if (i11 >= 28 && (lVar instanceof i)) {
                this.f9559a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f9559a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f9559a = new g(this, (g) lVar);
            } else {
                this.f9559a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f9559a = new l(this);
    }
}
