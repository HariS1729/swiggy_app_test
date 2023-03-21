package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: GhostViewPlatform */
class o implements m {

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f11981b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f11982c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f11983d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f11984e;

    /* renamed from: f  reason: collision with root package name */
    private static Method f11985f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f11986g;

    /* renamed from: a  reason: collision with root package name */
    private final View f11987a;

    private o(View view) {
        this.f11987a = view;
    }

    static m b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f11983d;
        if (method != null) {
            try {
                return new o((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (!f11984e) {
            try {
                d();
                Method declaredMethod = f11981b.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f11983d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e11) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e11);
            }
            f11984e = true;
        }
    }

    private static void d() {
        if (!f11982c) {
            try {
                f11981b = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e11) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e11);
            }
            f11982c = true;
        }
    }

    private static void e() {
        if (!f11986g) {
            try {
                d();
                Method declaredMethod = f11981b.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f11985f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e11) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e11);
            }
            f11986g = true;
        }
    }

    static void f(View view) {
        e();
        Method method = f11985f;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i11) {
        this.f11987a.setVisibility(i11);
    }
}
