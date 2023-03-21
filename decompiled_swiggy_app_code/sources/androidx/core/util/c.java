package androidx.core.util;

import java.util.Objects;

/* compiled from: ObjectsCompat */
public class c {

    /* compiled from: ObjectsCompat */
    static class a {
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(Object... objArr) {
        return a.b(objArr);
    }

    public static <T> T c(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static <T> T d(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static String e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
