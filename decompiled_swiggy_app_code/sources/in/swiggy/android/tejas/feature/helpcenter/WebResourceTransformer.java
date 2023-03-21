package in.swiggy.android.tejas.feature.helpcenter;

import i20.t;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;
import retrofit2.Response;

/* compiled from: WebResourceTransformer.kt */
public final class WebResourceTransformer implements ITransformer<Response<WebResourceResponse>, List<? extends String>> {
    public List<String> transform(Response<WebResourceResponse> response) {
        WebResourceResponse body;
        p.j(response, t.V);
        if (!response.isSuccessful()) {
            response = null;
        }
        if (response == null || (body = response.body()) == null) {
            return null;
        }
        return body.getUrls();
    }
}
