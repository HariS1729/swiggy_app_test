package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.resources.R;
import androidx.collection.h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ResourceManagerInternal */
public final class e0 {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f2117h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static e0 f2118i;
    private static final c j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, h<ColorStateList>> f2119a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.collection.g<String, e> f2120b;

    /* renamed from: c  reason: collision with root package name */
    private h<String> f2121c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.e<WeakReference<Drawable.ConstantState>>> f2122d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f2123e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2124f;

    /* renamed from: g  reason: collision with root package name */
    private f f2125g;

    /* compiled from: ResourceManagerInternal */
    static class a implements e {
        a() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return g.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e11) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e11);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    private static class b implements e {
        b() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e11) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e11);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal */
    private static class c extends androidx.collection.f<Integer, PorterDuffColorFilter> {
        public c(int i11) {
            super(i11);
        }

        private static int a(int i11, PorterDuff.Mode mode) {
            return ((i11 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter b(int i11, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(a(i11, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter c(int i11, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(a(i11, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal */
    static class d implements e {
        d() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    h.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e11) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e11);
                }
            }
            return null;
        }
    }

    /* compiled from: ResourceManagerInternal */
    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal */
    public interface f {
        Drawable a(e0 e0Var, Context context, int i11);

        ColorStateList b(Context context, int i11);

        PorterDuff.Mode c(int i11);

        boolean d(Context context, int i11, Drawable drawable);

        boolean e(Context context, int i11, Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal */
    private static class g implements e {
        g() {
        }

        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e11) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e11);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f2120b == null) {
            this.f2120b = new androidx.collection.g<>();
        }
        this.f2120b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j11, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        androidx.collection.e eVar = this.f2122d.get(context);
        if (eVar == null) {
            eVar = new androidx.collection.e();
            this.f2122d.put(context, eVar);
        }
        eVar.n(j11, new WeakReference(constantState));
        return true;
    }

    private void c(Context context, int i11, ColorStateList colorStateList) {
        if (this.f2119a == null) {
            this.f2119a = new WeakHashMap<>();
        }
        h hVar = this.f2119a.get(context);
        if (hVar == null) {
            hVar = new h();
            this.f2119a.put(context, hVar);
        }
        hVar.b(i11, colorStateList);
    }

    private void d(Context context) {
        if (!this.f2124f) {
            this.f2124f = true;
            Drawable j11 = j(context, R.drawable.abc_vector_test);
            if (j11 == null || !q(j11)) {
                this.f2124f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i11) {
        Drawable drawable;
        if (this.f2123e == null) {
            this.f2123e = new TypedValue();
        }
        TypedValue typedValue = this.f2123e;
        context.getResources().getValue(i11, typedValue, true);
        long e11 = e(typedValue);
        Drawable i12 = i(context, e11);
        if (i12 != null) {
            return i12;
        }
        f fVar = this.f2125g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.a(this, context, i11);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e11, drawable);
        }
        return drawable;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized e0 h() {
        e0 e0Var;
        synchronized (e0.class) {
            if (f2118i == null) {
                e0 e0Var2 = new e0();
                f2118i = e0Var2;
                p(e0Var2);
            }
            e0Var = f2118i;
        }
        return e0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, androidx.collection.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f2122d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            androidx.collection.e r0 = (androidx.collection.e) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.i(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.o(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e0.i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter l(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter b11;
        synchronized (e0.class) {
            c cVar = j;
            b11 = cVar.b(i11, mode);
            if (b11 == null) {
                b11 = new PorterDuffColorFilter(i11, mode);
                cVar.c(i11, mode, b11);
            }
        }
        return b11;
    }

    private ColorStateList n(Context context, int i11) {
        h hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.f2119a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.i(i11);
    }

    private static void p(e0 e0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            e0Var.a("vector", new g());
            e0Var.a("animated-vector", new b());
            e0Var.a("animated-selector", new a());
            e0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            androidx.collection.g<java.lang.String, androidx.appcompat.widget.e0$e> r0 = r10.f2120b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            androidx.collection.h<java.lang.String> r0 = r10.f2121c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.i(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            androidx.collection.g<java.lang.String, androidx.appcompat.widget.e0$e> r3 = r10.f2120b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            androidx.collection.h r0 = new androidx.collection.h
            r0.<init>()
            r10.f2121c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f2123e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f2123e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f2123e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = e(r0)
            android.graphics.drawable.Drawable r6 = r10.i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.h<java.lang.String> r8 = r10.f2121c     // Catch:{ Exception -> 0x00a2 }
            r8.b(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.g<java.lang.String, androidx.appcompat.widget.e0$e> r8 = r10.f2120b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.e0$e r3 = (androidx.appcompat.widget.e0.e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            androidx.collection.h<java.lang.String> r11 = r10.f2121c
            r11.b(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e0.r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable v(Context context, int i11, boolean z11, Drawable drawable) {
        ColorStateList m11 = m(context, i11);
        if (m11 != null) {
            if (x.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r11 = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r11, m11);
            PorterDuff.Mode o11 = o(i11);
            if (o11 == null) {
                return r11;
            }
            androidx.core.graphics.drawable.a.p(r11, o11);
            return r11;
        }
        f fVar = this.f2125g;
        if ((fVar == null || !fVar.d(context, i11, drawable)) && !x(context, i11, drawable) && z11) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, m0 m0Var, int[] iArr) {
        if (!x.a(drawable) || drawable.mutate() == drawable) {
            boolean z11 = m0Var.f2216d;
            if (z11 || m0Var.f2215c) {
                drawable.setColorFilter(g(z11 ? m0Var.f2213a : null, m0Var.f2215c ? m0Var.f2214b : f2117h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable j(Context context, int i11) {
        return k(context, i11, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i11, boolean z11) {
        Drawable r11;
        d(context);
        r11 = r(context, i11);
        if (r11 == null) {
            r11 = f(context, i11);
        }
        if (r11 == null) {
            r11 = androidx.core.content.a.f(context, i11);
        }
        if (r11 != null) {
            r11 = v(context, i11, z11, r11);
        }
        if (r11 != null) {
            x.b(r11);
        }
        return r11;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i11) {
        ColorStateList n;
        n = n(context, i11);
        if (n == null) {
            f fVar = this.f2125g;
            n = fVar == null ? null : fVar.b(context, i11);
            if (n != null) {
                c(context, i11, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode o(int i11) {
        f fVar = this.f2125g;
        if (fVar == null) {
            return null;
        }
        return fVar.c(i11);
    }

    public synchronized void s(Context context) {
        androidx.collection.e eVar = this.f2122d.get(context);
        if (eVar != null) {
            eVar.e();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, t0 t0Var, int i11) {
        Drawable r11 = r(context, i11);
        if (r11 == null) {
            r11 = t0Var.a(i11);
        }
        if (r11 == null) {
            return null;
        }
        return v(context, i11, false, r11);
    }

    public synchronized void u(f fVar) {
        this.f2125g = fVar;
    }

    /* access modifiers changed from: package-private */
    public boolean x(Context context, int i11, Drawable drawable) {
        f fVar = this.f2125g;
        return fVar != null && fVar.e(context, i11, drawable);
    }
}
