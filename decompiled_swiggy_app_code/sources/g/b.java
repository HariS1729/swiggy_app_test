package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* compiled from: DrawableContainer */
class b extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private d f14671a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f14672b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f14673c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f14674d;

    /* renamed from: e  reason: collision with root package name */
    private int f14675e = 255;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14676f;

    /* renamed from: g  reason: collision with root package name */
    private int f14677g = -1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14678h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f14679i;
    private long j;
    private long k;

    /* renamed from: l  reason: collision with root package name */
    private c f14680l;

    /* compiled from: DrawableContainer */
    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: g.b$b  reason: collision with other inner class name */
    /* compiled from: DrawableContainer */
    private static class C0123b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* compiled from: DrawableContainer */
    static class c implements Drawable.Callback {

        /* renamed from: a  reason: collision with root package name */
        private Drawable.Callback f14682a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f14682a;
            this.f14682a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f14682a = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f14682a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f14682a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* compiled from: DrawableContainer */
    static abstract class d extends Drawable.ConstantState {
        int A = 0;
        int B = 0;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f14683a;

        /* renamed from: b  reason: collision with root package name */
        Resources f14684b;

        /* renamed from: c  reason: collision with root package name */
        int f14685c;

        /* renamed from: d  reason: collision with root package name */
        int f14686d;

        /* renamed from: e  reason: collision with root package name */
        int f14687e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f14688f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f14689g;

        /* renamed from: h  reason: collision with root package name */
        int f14690h;

        /* renamed from: i  reason: collision with root package name */
        boolean f14691i = false;
        boolean j;
        Rect k;

        /* renamed from: l  reason: collision with root package name */
        boolean f14692l = false;

        /* renamed from: m  reason: collision with root package name */
        boolean f14693m;
        int n;

        /* renamed from: o  reason: collision with root package name */
        int f14694o;

        /* renamed from: p  reason: collision with root package name */
        int f14695p;
        int q;

        /* renamed from: r  reason: collision with root package name */
        boolean f14696r;

        /* renamed from: s  reason: collision with root package name */
        int f14697s;
        boolean t;

        /* renamed from: u  reason: collision with root package name */
        boolean f14698u;
        boolean v;

        /* renamed from: w  reason: collision with root package name */
        boolean f14699w;

        /* renamed from: x  reason: collision with root package name */
        boolean f14700x = true;

        /* renamed from: y  reason: collision with root package name */
        boolean f14701y;

        /* renamed from: z  reason: collision with root package name */
        int f14702z;

        d(d dVar, b bVar, Resources resources) {
            Resources resources2;
            this.f14683a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else {
                resources2 = dVar != null ? dVar.f14684b : null;
            }
            this.f14684b = resources2;
            int f11 = b.f(resources, dVar != null ? dVar.f14685c : 0);
            this.f14685c = f11;
            if (dVar != null) {
                this.f14686d = dVar.f14686d;
                this.f14687e = dVar.f14687e;
                this.v = true;
                this.f14699w = true;
                this.f14691i = dVar.f14691i;
                this.f14692l = dVar.f14692l;
                this.f14700x = dVar.f14700x;
                this.f14701y = dVar.f14701y;
                this.f14702z = dVar.f14702z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f14685c == f11) {
                    if (dVar.j) {
                        this.k = dVar.k != null ? new Rect(dVar.k) : rect;
                        this.j = true;
                    }
                    if (dVar.f14693m) {
                        this.n = dVar.n;
                        this.f14694o = dVar.f14694o;
                        this.f14695p = dVar.f14695p;
                        this.q = dVar.q;
                        this.f14693m = true;
                    }
                }
                if (dVar.f14696r) {
                    this.f14697s = dVar.f14697s;
                    this.f14696r = true;
                }
                if (dVar.t) {
                    this.f14698u = dVar.f14698u;
                    this.t = true;
                }
                Drawable[] drawableArr = dVar.f14689g;
                this.f14689g = new Drawable[drawableArr.length];
                this.f14690h = dVar.f14690h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f14688f;
                if (sparseArray != null) {
                    this.f14688f = sparseArray.clone();
                } else {
                    this.f14688f = new SparseArray<>(this.f14690h);
                }
                int i11 = this.f14690h;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (drawableArr[i12] != null) {
                        Drawable.ConstantState constantState = drawableArr[i12].getConstantState();
                        if (constantState != null) {
                            this.f14688f.put(i12, constantState);
                        } else {
                            this.f14689g[i12] = drawableArr[i12];
                        }
                    }
                }
                return;
            }
            this.f14689g = new Drawable[10];
            this.f14690h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f14688f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    this.f14689g[this.f14688f.keyAt(i11)] = s(this.f14688f.valueAt(i11).newDrawable(this.f14684b));
                }
                this.f14688f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f14702z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f14683a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i11 = this.f14690h;
            if (i11 >= this.f14689g.length) {
                o(i11, i11 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f14683a);
            this.f14689g[i11] = drawable;
            this.f14690h++;
            this.f14687e = drawable.getChangingConfigurations() | this.f14687e;
            p();
            this.k = null;
            this.j = false;
            this.f14693m = false;
            this.v = false;
            return i11;
        }

        /* access modifiers changed from: package-private */
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i11 = this.f14690h;
                Drawable[] drawableArr = this.f14689g;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (drawableArr[i12] != null && androidx.core.graphics.drawable.a.b(drawableArr[i12])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i12], theme);
                        this.f14687e |= drawableArr[i12].getChangingConfigurations();
                    }
                }
                y(C0123b.c(theme));
            }
        }

        public boolean c() {
            if (this.v) {
                return this.f14699w;
            }
            e();
            this.v = true;
            int i11 = this.f14690h;
            Drawable[] drawableArr = this.f14689g;
            for (int i12 = 0; i12 < i11; i12++) {
                if (drawableArr[i12].getConstantState() == null) {
                    this.f14699w = false;
                    return false;
                }
            }
            this.f14699w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i11 = this.f14690h;
            Drawable[] drawableArr = this.f14689g;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f14688f.get(i12);
                    if (constantState != null && C0123b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f14693m = true;
            e();
            int i11 = this.f14690h;
            Drawable[] drawableArr = this.f14689g;
            this.f14694o = -1;
            this.n = -1;
            this.q = 0;
            this.f14695p = 0;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f14694o) {
                    this.f14694o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f14695p) {
                    this.f14695p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            return this.f14689g.length;
        }

        public final Drawable g(int i11) {
            int indexOfKey;
            Drawable drawable = this.f14689g[i11];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f14688f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i11)) < 0) {
                return null;
            }
            Drawable s11 = s(this.f14688f.valueAt(indexOfKey).newDrawable(this.f14684b));
            this.f14689g[i11] = s11;
            this.f14688f.removeAt(indexOfKey);
            if (this.f14688f.size() == 0) {
                this.f14688f = null;
            }
            return s11;
        }

        public int getChangingConfigurations() {
            return this.f14686d | this.f14687e;
        }

        public final int h() {
            return this.f14690h;
        }

        public final int i() {
            if (!this.f14693m) {
                d();
            }
            return this.f14694o;
        }

        public final int j() {
            if (!this.f14693m) {
                d();
            }
            return this.q;
        }

        public final int k() {
            if (!this.f14693m) {
                d();
            }
            return this.f14695p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f14691i) {
                return null;
            }
            Rect rect2 = this.k;
            if (rect2 != null || this.j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i11 = this.f14690h;
            Drawable[] drawableArr = this.f14689g;
            for (int i12 = 0; i12 < i11; i12++) {
                if (drawableArr[i12].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i13 = rect3.left;
                    if (i13 > rect.left) {
                        rect.left = i13;
                    }
                    int i14 = rect3.top;
                    if (i14 > rect.top) {
                        rect.top = i14;
                    }
                    int i15 = rect3.right;
                    if (i15 > rect.right) {
                        rect.right = i15;
                    }
                    int i16 = rect3.bottom;
                    if (i16 > rect.bottom) {
                        rect.bottom = i16;
                    }
                }
            }
            this.j = true;
            this.k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f14693m) {
                d();
            }
            return this.n;
        }

        public final int n() {
            if (this.f14696r) {
                return this.f14697s;
            }
            e();
            int i11 = this.f14690h;
            Drawable[] drawableArr = this.f14689g;
            int opacity = i11 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i12 = 1; i12 < i11; i12++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i12].getOpacity());
            }
            this.f14697s = opacity;
            this.f14696r = true;
            return opacity;
        }

        public void o(int i11, int i12) {
            Drawable[] drawableArr = new Drawable[i12];
            Drawable[] drawableArr2 = this.f14689g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i11);
            }
            this.f14689g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        public void p() {
            this.f14696r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.f14692l;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        public final void t(boolean z11) {
            this.f14692l = z11;
        }

        public final void u(int i11) {
            this.A = i11;
        }

        public final void v(int i11) {
            this.B = i11;
        }

        /* access modifiers changed from: package-private */
        public final boolean w(int i11, int i12) {
            int i13 = this.f14690h;
            Drawable[] drawableArr = this.f14689g;
            boolean z11 = false;
            for (int i14 = 0; i14 < i13; i14++) {
                if (drawableArr[i14] != null) {
                    boolean m11 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.m(drawableArr[i14], i11) : false;
                    if (i14 == i12) {
                        z11 = m11;
                    }
                }
            }
            this.f14702z = i11;
            return z11;
        }

        public final void x(boolean z11) {
            this.f14691i = z11;
        }

        /* access modifiers changed from: package-private */
        public final void y(Resources resources) {
            if (resources != null) {
                this.f14684b = resources;
                int f11 = b.f(resources, this.f14685c);
                int i11 = this.f14685c;
                this.f14685c = f11;
                if (i11 != f11) {
                    this.f14693m = false;
                    this.j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.f14680l == null) {
            this.f14680l = new c();
        }
        drawable.setCallback(this.f14680l.b(drawable.getCallback()));
        try {
            if (this.f14671a.A <= 0 && this.f14676f) {
                drawable.setAlpha(this.f14675e);
            }
            d dVar = this.f14671a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f14671a;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f14671a.f14700x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            androidx.core.graphics.drawable.a.j(drawable, this.f14671a.C);
            Rect rect = this.f14672b;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f14680l.a());
        }
    }

    private boolean e() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    static int f(Resources resources, int i11) {
        if (resources != null) {
            i11 = resources.getDisplayMetrics().densityDpi;
        }
        if (i11 == 0) {
            return 160;
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f14676f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f14673c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f14675e
            r3.setAlpha(r9)
            r13.j = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            g.b$d r9 = r13.f14671a
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f14675e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.j = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f14674d
            if (r9 == 0) goto L_0x0065
            long r10 = r13.k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f14674d = r0
            r13.k = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b$d r4 = r13.f14671a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f14675e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.k = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f14679i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f14671a.b(theme);
    }

    /* access modifiers changed from: package-private */
    public d b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f14677g;
    }

    public boolean canApplyTheme() {
        return this.f14671a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f14673c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f14674d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f14677g
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.b$d r0 = r9.f14671a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f14674d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f14673c
            if (r0 == 0) goto L_0x0029
            r9.f14674d = r0
            g.b$d r0 = r9.f14671a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.k = r0
            goto L_0x0035
        L_0x0029:
            r9.f14674d = r4
            r9.k = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f14673c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            g.b$d r0 = r9.f14671a
            int r1 = r0.f14690h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f14673c = r0
            r9.f14677g = r10
            if (r0 == 0) goto L_0x005a
            g.b$d r10 = r9.f14671a
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.j = r2
        L_0x0051:
            r9.d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f14673c = r4
            r10 = -1
            r9.f14677g = r10
        L_0x005a:
            long r0 = r9.j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f14679i
            if (r0 != 0) goto L_0x0073
            g.b$a r0 = new g.b$a
            r0.<init>()
            r9.f14679i = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f14675e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f14671a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f14671a.c()) {
            return null;
        }
        this.f14671a.f14686d = getChangingConfigurations();
        return this.f14671a;
    }

    public Drawable getCurrent() {
        return this.f14673c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f14672b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f14671a.q()) {
            return this.f14671a.i();
        }
        Drawable drawable = this.f14673c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f14671a.q()) {
            return this.f14671a.m();
        }
        Drawable drawable = this.f14673c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f14671a.q()) {
            return this.f14671a.j();
        }
        Drawable drawable = this.f14673c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f14671a.q()) {
            return this.f14671a.k();
        }
        Drawable drawable = this.f14673c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f14673c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f14671a.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f14673c;
        if (drawable != null) {
            C0123b.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z11;
        Rect l11 = this.f14671a.l();
        if (l11 != null) {
            rect.set(l11);
            z11 = (l11.right | ((l11.left | l11.top) | l11.bottom)) != 0;
        } else {
            Drawable drawable = this.f14673c;
            if (drawable != null) {
                z11 = drawable.getPadding(rect);
            } else {
                z11 = super.getPadding(rect);
            }
        }
        if (e()) {
            int i11 = rect.left;
            rect.left = rect.right;
            rect.right = i11;
        }
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f14671a = dVar;
        int i11 = this.f14677g;
        if (i11 >= 0) {
            Drawable g11 = dVar.g(i11);
            this.f14673c = g11;
            if (g11 != null) {
                d(g11);
            }
        }
        this.f14674d = null;
    }

    /* access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f14671a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f14671a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f14673c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f14671a.C;
    }

    public void jumpToCurrentState() {
        boolean z11;
        Drawable drawable = this.f14674d;
        boolean z12 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f14674d = null;
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable2 = this.f14673c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f14676f) {
                this.f14673c.setAlpha(this.f14675e);
            }
        }
        if (this.k != 0) {
            this.k = 0;
            z11 = true;
        }
        if (this.j != 0) {
            this.j = 0;
        } else {
            z12 = z11;
        }
        if (z12) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f14678h && super.mutate() == this) {
            d b11 = b();
            b11.r();
            h(b11);
            this.f14678h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14674d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f14673c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i11) {
        return this.f14671a.w(i11, c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i11) {
        Drawable drawable = this.f14674d;
        if (drawable != null) {
            return drawable.setLevel(i11);
        }
        Drawable drawable2 = this.f14673c;
        if (drawable2 != null) {
            return drawable2.setLevel(i11);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f14674d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f14673c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        if (drawable == this.f14673c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j11);
        }
    }

    public void setAlpha(int i11) {
        if (!this.f14676f || this.f14675e != i11) {
            this.f14676f = true;
            this.f14675e = i11;
            Drawable drawable = this.f14673c;
            if (drawable == null) {
                return;
            }
            if (this.j == 0) {
                drawable.setAlpha(i11);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z11) {
        d dVar = this.f14671a;
        if (dVar.C != z11) {
            dVar.C = z11;
            Drawable drawable = this.f14673c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z11);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f14671a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f14673c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z11) {
        d dVar = this.f14671a;
        if (dVar.f14700x != z11) {
            dVar.f14700x = z11;
            Drawable drawable = this.f14673c;
            if (drawable != null) {
                drawable.setDither(z11);
            }
        }
    }

    public void setHotspot(float f11, float f12) {
        Drawable drawable = this.f14673c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f11, f12);
        }
    }

    public void setHotspotBounds(int i11, int i12, int i13, int i14) {
        Rect rect = this.f14672b;
        if (rect == null) {
            this.f14672b = new Rect(i11, i12, i13, i14);
        } else {
            rect.set(i11, i12, i13, i14);
        }
        Drawable drawable = this.f14673c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i11, i12, i13, i14);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f14671a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f14673c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f14671a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f14673c, mode);
        }
    }

    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        Drawable drawable = this.f14674d;
        if (drawable != null) {
            drawable.setVisible(z11, z12);
        }
        Drawable drawable2 = this.f14673c;
        if (drawable2 != null) {
            drawable2.setVisible(z11, z12);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f14673c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
