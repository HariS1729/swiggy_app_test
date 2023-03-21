package in.swiggy.android.tejas.feature.helpcenter;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;
import retrofit2.Response;
import retrofit2.Retrofit;

/* compiled from: WebResourceModule.kt */
public final class WebResourceModule {
    public static final WebResourceModule INSTANCE = new WebResourceModule();

    private WebResourceModule() {
    }

    public static final IHelpCenterAPI providesAPI(@RetrofitDevApi(apiType = ApiEndPointType.SWIGGY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IHelpCenterAPI.class);
        p.i(create, "retrofit.create(IHelpCenterAPI::class.java)");
        return (IHelpCenterAPI) create;
    }

    public static final ITransformer<Response<WebResourceResponse>, List<String>> providesTransformer(WebResourceTransformer webResourceTransformer) {
        p.j(webResourceTransformer, "webResourceTransformer");
        return webResourceTransformer;
    }
}
