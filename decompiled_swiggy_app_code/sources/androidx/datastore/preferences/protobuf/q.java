package androidx.datastore.preferences.protobuf;

/* compiled from: ExtensionSchemas */
final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final o<?> f10096a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final o<?> f10097b = c();

    static o<?> a() {
        o<?> oVar = f10097b;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static o<?> b() {
        return f10096a;
    }

    private static o<?> c() {
        try {
            return (o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
