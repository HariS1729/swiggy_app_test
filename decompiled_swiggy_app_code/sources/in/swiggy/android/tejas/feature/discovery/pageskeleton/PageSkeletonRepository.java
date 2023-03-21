package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.ResponseTransformerManager;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.PageSkeletonResponse;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.PageSkeletonErrorTransformer;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.PageSkeletonExceptionTransformer;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.PageSkeletonTransformer;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;

/* compiled from: PageSkeletonRepository.kt */
public final class PageSkeletonRepository {
    private final IPageSkeletonResultAPI api;
    private final IErrorChecker<Response> errorChecker;
    private final PageSkeletonErrorTransformer errorTransformer;
    private final PageSkeletonExceptionTransformer<PageSkeletonResponse> exceptionTransformer;
    private final PageSkeletonTransformer pageSkeletonTransformer;

    public PageSkeletonRepository(IPageSkeletonResultAPI iPageSkeletonResultAPI, PageSkeletonTransformer pageSkeletonTransformer2, IErrorChecker<Response> iErrorChecker, PageSkeletonErrorTransformer pageSkeletonErrorTransformer, PageSkeletonExceptionTransformer<PageSkeletonResponse> pageSkeletonExceptionTransformer) {
        p.j(iPageSkeletonResultAPI, "api");
        p.j(pageSkeletonTransformer2, "pageSkeletonTransformer");
        p.j(iErrorChecker, "errorChecker");
        p.j(pageSkeletonErrorTransformer, "errorTransformer");
        p.j(pageSkeletonExceptionTransformer, "exceptionTransformer");
        this.api = iPageSkeletonResultAPI;
        this.pageSkeletonTransformer = pageSkeletonTransformer2;
        this.errorChecker = iErrorChecker;
        this.errorTransformer = pageSkeletonErrorTransformer;
        this.exceptionTransformer = pageSkeletonExceptionTransformer;
    }

    public final d<in.swiggy.android.tejas.Response<PageSkeletonResponse>> getPageSkeletonData(double d11, double d12) {
        return ResponseTransformerManager.buildResponse$default(ResponseTransformerManager.INSTANCE, this.api.getPageSkeletonData(d11, d12), false, this.errorChecker, this.pageSkeletonTransformer, this.errorTransformer, this.exceptionTransformer, 2, (Object) null);
    }
}
