package u0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.p;

/* compiled from: CanvasUtils.android.kt */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f16737a = new a0();

    /* renamed from: b  reason: collision with root package name */
    private static Method f16738b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f16739c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f16740d;

    private a0() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void a(Canvas canvas, boolean z11) {
        Method method;
        p.j(canvas, "canvas");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            b0.f16750a.a(canvas, z11);
            return;
        }
        if (!f16740d) {
            if (i11 == 28) {
                Class<Class> cls = Class.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f16738b = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});
                    f16739c = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f16738b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f16739c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            Method method2 = f16738b;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f16739c;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f16740d = true;
        }
        if (z11) {
            try {
                Method method4 = f16738b;
                if (method4 != null) {
                    p.g(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z11 && (method = f16739c) != null) {
            p.g(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}
