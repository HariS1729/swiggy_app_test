package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: Protobuf */
final class u0 {

    /* renamed from: c  reason: collision with root package name */
    private static final u0 f10110c = new u0();

    /* renamed from: a  reason: collision with root package name */
    private final z0 f10111a = new d0();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, y0<?>> f10112b = new ConcurrentHashMap();

    private u0() {
    }

    public static u0 a() {
        return f10110c;
    }

    public <T> void b(T t, x0 x0Var, n nVar) throws IOException {
        e(t).b(t, x0Var, nVar);
    }

    public y0<?> c(Class<?> cls, y0<?> y0Var) {
        w.b(cls, "messageType");
        w.b(y0Var, "schema");
        return this.f10112b.putIfAbsent(cls, y0Var);
    }

    public <T> y0<T> d(Class<T> cls) {
        w.b(cls, "messageType");
        y0<T> y0Var = (y0) this.f10112b.get(cls);
        if (y0Var != null) {
            return y0Var;
        }
        y0<T> createSchema = this.f10111a.createSchema(cls);
        y0<?> c11 = c(cls, createSchema);
        return c11 != null ? c11 : createSchema;
    }

    public <T> y0<T> e(T t) {
        return d(t.getClass());
    }
}
