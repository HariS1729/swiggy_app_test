package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase */
class v0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f12008a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f12009b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f12010c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f12011d;

    v0() {
    }

    @SuppressLint({"PrivateApi"})
    private void b() {
        if (!f12009b) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f12008a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e11) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e11);
            }
            f12009b = true;
        }
    }

    public void a(View view) {
        throw null;
    }

    public float c(View view) {
        throw null;
    }

    public void d(View view) {
        throw null;
    }

    public void e(View view, Matrix matrix) {
        throw null;
    }

    public void f(View view, int i11, int i12, int i13, int i14) {
        b();
        Method method = f12008a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    public void g(View view, float f11) {
        throw null;
    }

    public void h(View view, int i11) {
        if (!f12011d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12010c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f12011d = true;
        }
        Field field = f12010c;
        if (field != null) {
            try {
                f12010c.setInt(view, i11 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(View view, Matrix matrix) {
        throw null;
    }

    public void j(View view, Matrix matrix) {
        throw null;
    }
}
