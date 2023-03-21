package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtils */
class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11975a = true;

    /* renamed from: b  reason: collision with root package name */
    private static Method f11976b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f11977c;

    static int a(ViewGroup viewGroup, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i11);
        }
        if (!f11977c) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f11976b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f11977c = true;
        }
        Method method = f11976b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i11)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i11;
    }

    static l0 b(ViewGroup viewGroup) {
        return new k0(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void c(ViewGroup viewGroup, boolean z11) {
        if (f11975a) {
            try {
                viewGroup.suppressLayout(z11);
            } catch (NoSuchMethodError unused) {
                f11975a = false;
            }
        }
    }

    static void d(ViewGroup viewGroup, boolean z11) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z11);
        } else {
            c(viewGroup, z11);
        }
    }
}
