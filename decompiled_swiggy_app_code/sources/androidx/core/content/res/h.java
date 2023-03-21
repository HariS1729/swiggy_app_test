package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f9209a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<d, SparseArray<c>> f9210b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f9211c = new Object();

    /* compiled from: ResourcesCompat */
    static class a {
        static Drawable a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getDrawable(i11, theme);
        }

        static Drawable b(Resources resources, int i11, int i12, Resources.Theme theme) {
            return resources.getDrawableForDensity(i11, i12, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    static class b {
        static int a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColor(i11, theme);
        }

        static ColorStateList b(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColorStateList(i11, theme);
        }
    }

    /* compiled from: ResourcesCompat */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f9212a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f9213b;

        /* renamed from: c  reason: collision with root package name */
        final int f9214c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i11;
            this.f9212a = colorStateList;
            this.f9213b = configuration;
            if (theme == null) {
                i11 = 0;
            } else {
                i11 = theme.hashCode();
            }
            this.f9214c = i11;
        }
    }

    /* compiled from: ResourcesCompat */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        final Resources f9215a;

        /* renamed from: b  reason: collision with root package name */
        final Resources.Theme f9216b;

        d(Resources resources, Resources.Theme theme) {
            this.f9215a = resources;
            this.f9216b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (!this.f9215a.equals(dVar.f9215a) || !androidx.core.util.c.a(this.f9216b, dVar.f9216b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return androidx.core.util.c.b(this.f9215a, this.f9216b);
        }
    }

    /* compiled from: ResourcesCompat */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(int i11, Handler handler) {
            e(handler).post(new i(this, i11));
        }

        public final void d(Typeface typeface, Handler handler) {
            e(handler).post(new j(this, typeface));
        }

        /* renamed from: h */
        public abstract void f(int i11);

        /* renamed from: i */
        public abstract void g(Typeface typeface);
    }

    /* compiled from: ResourcesCompat */
    public static final class f {

        /* compiled from: ResourcesCompat */
        static class a {

            /* renamed from: a  reason: collision with root package name */
            private static final Object f9217a = new Object();

            /* renamed from: b  reason: collision with root package name */
            private static Method f9218b;

            /* renamed from: c  reason: collision with root package name */
            private static boolean f9219c;

            @SuppressLint({"BanUncheckedReflection"})
            static void a(Resources.Theme theme) {
                synchronized (f9217a) {
                    if (!f9219c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f9218b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e11) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e11);
                        }
                        f9219c = true;
                    }
                    Method method = f9218b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e12) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e12);
                            f9218b = null;
                        }
                    }
                }
            }
        }

        /* compiled from: ResourcesCompat */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                b.a(theme);
            } else if (i11 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i11, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f9211c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f9210b;
            SparseArray sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i11, new c(colorStateList, dVar.f9215a.getConfiguration(), theme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList b(androidx.core.content.res.h.d r5, int r6) {
        /*
            java.lang.Object r0 = f9211c
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.h$d, android.util.SparseArray<androidx.core.content.res.h$c>> r1 = f9210b     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.h$c r2 = (androidx.core.content.res.h.c) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f9213b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f9215a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f9216b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f9214c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f9214c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f9212a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.b(androidx.core.content.res.h$d, int):android.content.res.ColorStateList");
    }

    public static int c(Resources resources, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(resources, i11, theme);
        }
        return resources.getColor(i11);
    }

    public static ColorStateList d(Resources resources, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        d dVar = new d(resources, theme);
        ColorStateList b11 = b(dVar, i11);
        if (b11 != null) {
            return b11;
        }
        ColorStateList k = k(resources, i11, theme);
        if (k != null) {
            a(dVar, i11, k, theme);
            return k;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return b.b(resources, i11, theme);
        } else {
            return resources.getColorStateList(i11);
        }
    }

    public static Drawable e(Resources resources, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i11, theme);
    }

    public static Drawable f(Resources resources, int i11, int i12, Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i11, i12, theme);
    }

    public static Typeface g(Context context, int i11) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i11, new TypedValue(), 0, (e) null, (Handler) null, false, false);
    }

    public static Typeface h(Context context, int i11, TypedValue typedValue, int i12, e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i11, typedValue, i12, eVar, (Handler) null, true, false);
    }

    public static void i(Context context, int i11, e eVar, Handler handler) throws Resources.NotFoundException {
        g.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
            return;
        }
        m(context, i11, new TypedValue(), 0, eVar, handler, false, false);
    }

    private static TypedValue j() {
        ThreadLocal<TypedValue> threadLocal = f9209a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i11, Resources.Theme theme) {
        if (l(resources, i11)) {
            return null;
        }
        try {
            return c.a(resources, resources.getXml(i11), theme);
        } catch (Exception e11) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e11);
            return null;
        }
    }

    private static boolean l(Resources resources, int i11) {
        TypedValue j = j();
        resources.getValue(i11, j, true);
        int i12 = j.type;
        if (i12 < 28 || i12 > 31) {
            return false;
        }
        return true;
    }

    private static Typeface m(Context context, int i11, TypedValue typedValue, int i12, e eVar, Handler handler, boolean z11, boolean z12) {
        Resources resources = context.getResources();
        int i13 = i11;
        resources.getValue(i11, typedValue, true);
        Typeface n = n(context, resources, typedValue, i11, i12, eVar, handler, z11, z12);
        if (n != null || eVar != null || z12) {
            return n;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i11) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface n(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.h.e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00bb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.c(r15, r12)
        L_0x0024:
            return r16
        L_0x0025:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.e.f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0035
            if (r11 == 0) goto L_0x0034
            r11.d(r2, r12)
        L_0x0034:
            return r2
        L_0x0035:
            if (r25 == 0) goto L_0x0038
            return r16
        L_0x0038:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r2 == 0) goto L_0x006f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            androidx.core.content.res.e$b r2 = androidx.core.content.res.e.b(r2, r0)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r2 != 0) goto L_0x0059
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0058
            r11.c(r15, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
        L_0x0058:
            return r16
        L_0x0059:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.e.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            return r0
        L_0x006f:
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.e.d(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0086
            r11.d(r0, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            goto L_0x0089
        L_0x0086:
            r11.c(r15, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto L_0x00b5
        L_0x00a0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x00b5:
            if (r11 == 0) goto L_0x00ba
            r11.c(r15, r12)
        L_0x00ba:
            return r16
        L_0x00bb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
