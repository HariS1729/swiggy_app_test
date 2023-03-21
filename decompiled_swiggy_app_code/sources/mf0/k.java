package mf0;

import com.google.gson.Gson;
import in.swiggy.android.tejas.feature.edm.IEdmApi;
import javax.inject.Provider;
import qq.e;

/* compiled from: EdmPostFeedbackWorker_AssistedFactory_Factory */
public final class k implements e<j> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<IEdmApi> f19716a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<Gson> f19717b;

    public k(Provider<IEdmApi> provider, Provider<Gson> provider2) {
        this.f19716a = provider;
        this.f19717b = provider2;
    }

    public static k a(Provider<IEdmApi> provider, Provider<Gson> provider2) {
        return new k(provider, provider2);
    }

    public static j c(Provider<IEdmApi> provider, Provider<Gson> provider2) {
        return new j(provider, provider2);
    }

    /* renamed from: b */
    public j get() {
        return c(this.f19716a, this.f19717b);
    }
}
