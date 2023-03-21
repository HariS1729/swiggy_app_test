package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import javax.inject.Provider;
import os.a;
import qq.e;

public final class PageSkeletonResultAPI_Factory implements e<PageSkeletonResultAPI> {
    private final Provider<IPageSkeletonAPI> apiProvider;
    private final Provider<a> appBuildDetailsProvider;

    public PageSkeletonResultAPI_Factory(Provider<IPageSkeletonAPI> provider, Provider<a> provider2) {
        this.apiProvider = provider;
        this.appBuildDetailsProvider = provider2;
    }

    public static PageSkeletonResultAPI_Factory create(Provider<IPageSkeletonAPI> provider, Provider<a> provider2) {
        return new PageSkeletonResultAPI_Factory(provider, provider2);
    }

    public static PageSkeletonResultAPI newInstance(IPageSkeletonAPI iPageSkeletonAPI, a aVar) {
        return new PageSkeletonResultAPI(iPageSkeletonAPI, aVar);
    }

    public PageSkeletonResultAPI get() {
        return newInstance(this.apiProvider.get(), this.appBuildDetailsProvider.get());
    }
}
