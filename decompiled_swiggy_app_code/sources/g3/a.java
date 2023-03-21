package g3;

import in.swiggy.android.tejas.network.HttpRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: CreationExtras.kt */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<b<?>, Object> f14729a = new LinkedHashMap();

    /* renamed from: g3.a$a  reason: collision with other inner class name */
    /* compiled from: CreationExtras.kt */
    public static final class C0124a extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0124a f14730b = new C0124a();

        private C0124a() {
        }

        public <T> T a(b<T> bVar) {
            p.j(bVar, HttpRequest.HEADER_KEY);
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.f14729a;
    }
}
