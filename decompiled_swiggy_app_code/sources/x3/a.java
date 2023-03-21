package x3;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f17667a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f17668b;

    public static void a(String str) {
        b.a(str);
    }

    public static void b() {
        b.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean d() {
        try {
            if (f17668b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        try {
            if (f17668b == null) {
                f17667a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f17668b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f17668b.invoke((Object) null, new Object[]{Long.valueOf(f17667a)})).booleanValue();
        } catch (Exception e11) {
            c("isTagEnabled", e11);
            return false;
        }
    }
}
