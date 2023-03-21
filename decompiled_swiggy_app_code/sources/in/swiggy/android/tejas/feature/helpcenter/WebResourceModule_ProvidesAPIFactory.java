package in.swiggy.android.tejas.feature.helpcenter;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class WebResourceModule_ProvidesAPIFactory implements e<IHelpCenterAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public WebResourceModule_ProvidesAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static WebResourceModule_ProvidesAPIFactory create(Provider<Retrofit> provider) {
        return new WebResourceModule_ProvidesAPIFactory(provider);
    }

    public static IHelpCenterAPI providesAPI(Retrofit retrofit) {
        return (IHelpCenterAPI) i.e(WebResourceModule.providesAPI(retrofit));
    }

    public IHelpCenterAPI get() {
        return providesAPI(this.retrofitProvider.get());
    }
}
