package c4;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: WebViewGlueCommunicator */
public class d {

    /* compiled from: WebViewGlueCommunicator */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final g f12817a = new g(d.d().getWebkitToCompatConverter());
    }

    /* compiled from: WebViewGlueCommunicator */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final e f12818a = d.a();
    }

    static e a() {
        try {
            return new f((WebViewProviderFactoryBoundaryInterface) tq0.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        } catch (ClassNotFoundException unused) {
            return new b();
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException(e13);
        }
    }

    private static InvocationHandler b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static g c() {
        return a.f12817a;
    }

    public static e d() {
        return b.f12818a;
    }

    public static ClassLoader e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        return f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, new Object[0]);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException(e13);
        }
    }
}
