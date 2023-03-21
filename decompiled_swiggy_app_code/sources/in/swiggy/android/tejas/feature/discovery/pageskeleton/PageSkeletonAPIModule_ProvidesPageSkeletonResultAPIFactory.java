package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import javax.inject.Provider;
import qq.e;
import qq.i;

public final class PageSkeletonAPIModule_ProvidesPageSkeletonResultAPIFactory implements e<IPageSkeletonResultAPI> {
    private final Provider<PageSkeletonResultAPI> pageSkeletonResultAPIProvider;

    public PageSkeletonAPIModule_ProvidesPageSkeletonResultAPIFactory(Provider<PageSkeletonResultAPI> provider) {
        this.pageSkeletonResultAPIProvider = provider;
    }

    public static PageSkeletonAPIModule_ProvidesPageSkeletonResultAPIFactory create(Provider<PageSkeletonResultAPI> provider) {
        return new PageSkeletonAPIModule_ProvidesPageSkeletonResultAPIFactory(provider);
    }

    public static IPageSkeletonResultAPI providesPageSkeletonResultAPI(PageSkeletonResultAPI pageSkeletonResultAPI) {
        return (IPageSkeletonResultAPI) i.e(PageSkeletonAPIModule.INSTANCE.providesPageSkeletonResultAPI(pageSkeletonResultAPI));
    }

    public IPageSkeletonResultAPI get() {
        return providesPageSkeletonResultAPI(this.pageSkeletonResultAPIProvider.get());
    }
}
