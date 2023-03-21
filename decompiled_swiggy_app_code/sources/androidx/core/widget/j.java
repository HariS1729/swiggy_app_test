package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static Method f9663a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f9664b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f9665c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f9666d;

    /* compiled from: PopupWindowCompat */
    static class a {
        static void a(PopupWindow popupWindow, View view, int i11, int i12, int i13) {
            popupWindow.showAsDropDown(view, i11, i12, i13);
        }
    }

    /* compiled from: PopupWindowCompat */
    static class b {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z11) {
            popupWindow.setOverlapAnchor(z11);
        }

        static void d(PopupWindow popupWindow, int i11) {
            popupWindow.setWindowLayoutType(i11);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z11) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.c(popupWindow, z11);
            return;
        }
        if (!f9666d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f9665c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e11);
            }
            f9666d = true;
        }
        Field field = f9665c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z11));
            } catch (IllegalAccessException e12) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e12);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i11);
            return;
        }
        if (!f9664b) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f9663a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f9664b = true;
        }
        Method method = f9663a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i11)});
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i11, int i12, int i13) {
        a.a(popupWindow, view, i11, i12, i13);
    }
}
