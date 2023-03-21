package in.swiggy.android.tejas.feature.helpcenter;

import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Response;

public final class WebResourceModule_ProvidesTransformerFactory implements e<ITransformer<Response<WebResourceResponse>, List<String>>> {
    private final Provider<WebResourceTransformer> webResourceTransformerProvider;

    public WebResourceModule_ProvidesTransformerFactory(Provider<WebResourceTransformer> provider) {
        this.webResourceTransformerProvider = provider;
    }

    public static WebResourceModule_ProvidesTransformerFactory create(Provider<WebResourceTransformer> provider) {
        return new WebResourceModule_ProvidesTransformerFactory(provider);
    }

    public static ITransformer<Response<WebResourceResponse>, List<String>> providesTransformer(WebResourceTransformer webResourceTransformer) {
        return (ITransformer) i.e(WebResourceModule.providesTransformer(webResourceTransformer));
    }

    public ITransformer<Response<WebResourceResponse>, List<String>> get() {
        return providesTransformer(this.webResourceTransformerProvider.get());
    }
}
