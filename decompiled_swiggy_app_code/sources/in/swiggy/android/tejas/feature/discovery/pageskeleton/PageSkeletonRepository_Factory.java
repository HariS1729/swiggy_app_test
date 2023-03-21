package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.PageSkeletonResponse;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.PageSkeletonErrorTransformer;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.PageSkeletonExceptionTransformer;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.PageSkeletonTransformer;
import javax.inject.Provider;
import qq.e;

public final class PageSkeletonRepository_Factory implements e<PageSkeletonRepository> {
    private final Provider<IPageSkeletonResultAPI> apiProvider;
    private final Provider<IErrorChecker<Response>> errorCheckerProvider;
    private final Provider<PageSkeletonErrorTransformer> errorTransformerProvider;
    private final Provider<PageSkeletonExceptionTransformer<PageSkeletonResponse>> exceptionTransformerProvider;
    private final Provider<PageSkeletonTransformer> pageSkeletonTransformerProvider;

    public PageSkeletonRepository_Factory(Provider<IPageSkeletonResultAPI> provider, Provider<PageSkeletonTransformer> provider2, Provider<IErrorChecker<Response>> provider3, Provider<PageSkeletonErrorTransformer> provider4, Provider<PageSkeletonExceptionTransformer<PageSkeletonResponse>> provider5) {
        this.apiProvider = provider;
        this.pageSkeletonTransformerProvider = provider2;
        this.errorCheckerProvider = provider3;
        this.errorTransformerProvider = provider4;
        this.exceptionTransformerProvider = provider5;
    }

    public static PageSkeletonRepository_Factory create(Provider<IPageSkeletonResultAPI> provider, Provider<PageSkeletonTransformer> provider2, Provider<IErrorChecker<Response>> provider3, Provider<PageSkeletonErrorTransformer> provider4, Provider<PageSkeletonExceptionTransformer<PageSkeletonResponse>> provider5) {
        return new PageSkeletonRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static PageSkeletonRepository newInstance(IPageSkeletonResultAPI iPageSkeletonResultAPI, PageSkeletonTransformer pageSkeletonTransformer, IErrorChecker<Response> iErrorChecker, PageSkeletonErrorTransformer pageSkeletonErrorTransformer, PageSkeletonExceptionTransformer<PageSkeletonResponse> pageSkeletonExceptionTransformer) {
        return new PageSkeletonRepository(iPageSkeletonResultAPI, pageSkeletonTransformer, iErrorChecker, pageSkeletonErrorTransformer, pageSkeletonExceptionTransformer);
    }

    public PageSkeletonRepository get() {
        return newInstance(this.apiProvider.get(), this.pageSkeletonTransformerProvider.get(), this.errorCheckerProvider.get(), this.errorTransformerProvider.get(), this.exceptionTransformerProvider.get());
    }
}
