package of0;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import pf0.a;
import qq.e;
import qq.i;

/* compiled from: NetworkPreHeatModule_ProvidesHandlerFactory */
public final class b implements e<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<OkHttpClient.Builder> f19797a;

    public b(Provider<OkHttpClient.Builder> provider) {
        this.f19797a = provider;
    }

    public static b a(Provider<OkHttpClient.Builder> provider) {
        return new b(provider);
    }

    public static a c(OkHttpClient.Builder builder) {
        return (a) i.e(a.f19796a.a(builder));
    }

    /* renamed from: b */
    public a get() {
        return c(this.f19797a.get());
    }
}
