package androidx.datastore.preferences.protobuf;

/* compiled from: ExtensionRegistryFactory */
final class m {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f10068a = c();

    public static n a() {
        if (f10068a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return n.f10072e;
    }

    private static final n b(String str) throws Exception {
        return (n) f10068a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
