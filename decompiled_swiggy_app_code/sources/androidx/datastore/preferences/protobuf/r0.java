package androidx.datastore.preferences.protobuf;

/* compiled from: NewInstanceSchemas */
final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static final p0 f10098a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final p0 f10099b = new q0();

    static p0 a() {
        return f10098a;
    }

    static p0 b() {
        return f10099b;
    }

    private static p0 c() {
        try {
            return (p0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
