package in.swiggy.android.tejas.feature.discovery.pageskeleton.usecase;

import in.swiggy.android.tejas.feature.discovery.pageskeleton.PageSkeletonRepository;
import javax.inject.Provider;
import qq.e;

public final class PageSkeletonUseCase_Factory implements e<PageSkeletonUseCase> {
    private final Provider<PageSkeletonRepository> repositoryProvider;

    public PageSkeletonUseCase_Factory(Provider<PageSkeletonRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static PageSkeletonUseCase_Factory create(Provider<PageSkeletonRepository> provider) {
        return new PageSkeletonUseCase_Factory(provider);
    }

    public static PageSkeletonUseCase newInstance(PageSkeletonRepository pageSkeletonRepository) {
        return new PageSkeletonUseCase(pageSkeletonRepository);
    }

    public PageSkeletonUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
