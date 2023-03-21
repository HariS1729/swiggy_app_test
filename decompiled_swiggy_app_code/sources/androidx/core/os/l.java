package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* compiled from: TraceCompat */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static long f9313a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f9314b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f9315c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f9316d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f9317e;

    /* compiled from: TraceCompat */
    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f9313a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f9314b = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f9315c = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f9316d = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f9317e = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e11) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e11);
            }
        }
    }

    public static void a(String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
