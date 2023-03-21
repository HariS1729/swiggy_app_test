package androidx.datastore.preferences.protobuf;

/* compiled from: MapFieldSchemas */
final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final f0 f10031a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final f0 f10032b = new g0();

    static f0 a() {
        return f10031a;
    }

    static f0 b() {
        return f10032b;
    }

    private static f0 c() {
        try {
            return (f0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
