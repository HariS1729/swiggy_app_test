package in.swiggy.android.tejas.feature.helpcenter;

import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import retrofit2.Response;

public final class WebResourceManager_Factory implements e<WebResourceManager> {
    private final Provider<IHelpCenterAPI> apiProvider;
    private final Provider<ITransformer<Response<WebResourceResponse>, List<String>>> transformerProvider;

    public WebResourceManager_Factory(Provider<IHelpCenterAPI> provider, Provider<ITransformer<Response<WebResourceResponse>, List<String>>> provider2) {
        this.apiProvider = provider;
        this.transformerProvider = provider2;
    }

    public static WebResourceManager_Factory create(Provider<IHelpCenterAPI> provider, Provider<ITransformer<Response<WebResourceResponse>, List<String>>> provider2) {
        return new WebResourceManager_Factory(provider, provider2);
    }

    public static WebResourceManager newInstance(IHelpCenterAPI iHelpCenterAPI, ITransformer<Response<WebResourceResponse>, List<String>> iTransformer) {
        return new WebResourceManager(iHelpCenterAPI, iTransformer);
    }

    public WebResourceManager get() {
        return newInstance(this.apiProvider.get(), this.transformerProvider.get());
    }
}
