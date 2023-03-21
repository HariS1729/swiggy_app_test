package in.swiggy.android.tejas.feature.helpcenter;

import ao0.s;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;
import retrofit2.Response;

/* compiled from: WebResourceManager.kt */
public final class WebResourceManager {
    private final IHelpCenterAPI api;
    private final ITransformer<Response<WebResourceResponse>, List<String>> transformer;

    public WebResourceManager(IHelpCenterAPI iHelpCenterAPI, ITransformer<Response<WebResourceResponse>, List<String>> iTransformer) {
        p.j(iHelpCenterAPI, "api");
        p.j(iTransformer, "transformer");
        this.api = iHelpCenterAPI;
        this.transformer = iTransformer;
    }

    /* access modifiers changed from: private */
    /* renamed from: getWebResources$lambda-0  reason: not valid java name */
    public static final List m26getWebResources$lambda0(WebResourceManager webResourceManager, Response response) {
        p.j(webResourceManager, "this$0");
        p.j(response, "response");
        return webResourceManager.transformer.transform(response);
    }

    public final s<List<String>> getWebResources() {
        s<R> n = this.api.getWebResourceList().d0().n(new a(this));
        p.i(n, "api.getWebResourceList()…mer.transform(response) }");
        return n;
    }
}
