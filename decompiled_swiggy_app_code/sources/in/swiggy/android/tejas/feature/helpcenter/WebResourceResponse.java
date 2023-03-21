package in.swiggy.android.tejas.feature.helpcenter;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: WebResourceResponse.kt */
public final class WebResourceResponse {
    @SerializedName("urls")
    private List<String> urls;

    public WebResourceResponse() {
        this((List) null, 1, (i) null);
    }

    public WebResourceResponse(List<String> list) {
        this.urls = list;
    }

    public static /* synthetic */ WebResourceResponse copy$default(WebResourceResponse webResourceResponse, List<String> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = webResourceResponse.urls;
        }
        return webResourceResponse.copy(list);
    }

    public final List<String> component1() {
        return this.urls;
    }

    public final WebResourceResponse copy(List<String> list) {
        return new WebResourceResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebResourceResponse) && p.e(this.urls, ((WebResourceResponse) obj).urls);
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        List<String> list = this.urls;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setUrls(List<String> list) {
        this.urls = list;
    }

    public String toString() {
        return "WebResourceResponse(urls=" + this.urls + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebResourceResponse(List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : list);
    }
}
