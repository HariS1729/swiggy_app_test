package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CanvasUtils */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static Method f11861a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f11862b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f11863c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static void a(Canvas canvas, boolean z11) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            if (z11) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i11 != 28) {
            if (!f11863c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f11861a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f11862b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f11863c = true;
            }
            if (z11) {
                try {
                    Method method2 = f11861a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(e11.getCause());
                }
            }
            if (!z11 && (method = f11862b) != null) {
                method.invoke(canvas, new Object[0]);
            }
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}
