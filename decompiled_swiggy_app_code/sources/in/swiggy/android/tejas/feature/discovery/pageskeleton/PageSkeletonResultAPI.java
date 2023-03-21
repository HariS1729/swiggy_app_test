package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import os.a;
import retrofit2.Response;

/* compiled from: PageSkeletonResultAPI.kt */
public final class PageSkeletonResultAPI implements IPageSkeletonResultAPI {
    private final IPageSkeletonAPI api;
    private final a appBuildDetails;

    public PageSkeletonResultAPI(IPageSkeletonAPI iPageSkeletonAPI, a aVar) {
        p.j(iPageSkeletonAPI, "api");
        p.j(aVar, "appBuildDetails");
        this.api = iPageSkeletonAPI;
        this.appBuildDetails = aVar;
    }

    public d<Response<com.swiggy.gandalf.widgets.v2.Response>> getPageSkeletonData(double d11, double d12) {
        if (this.appBuildDetails.j()) {
            return this.api.getPageSkeletonData(d11, d12);
        }
        return this.api.getPageSkeletonDataJson(d11, d12);
    }
}
