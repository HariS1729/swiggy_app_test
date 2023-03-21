package androidx.datastore.preferences.protobuf;

/* compiled from: Android */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f9984a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f9985b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f9984a;
    }

    static boolean c() {
        return f9984a != null && !f9985b;
    }
}
