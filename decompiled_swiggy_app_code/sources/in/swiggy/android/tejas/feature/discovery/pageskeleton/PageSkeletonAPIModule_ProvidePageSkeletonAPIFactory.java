package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class PageSkeletonAPIModule_ProvidePageSkeletonAPIFactory implements e<IPageSkeletonAPI> {
    private final Provider<Retrofit> retrofitProvider;

    public PageSkeletonAPIModule_ProvidePageSkeletonAPIFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static PageSkeletonAPIModule_ProvidePageSkeletonAPIFactory create(Provider<Retrofit> provider) {
        return new PageSkeletonAPIModule_ProvidePageSkeletonAPIFactory(provider);
    }

    public static IPageSkeletonAPI providePageSkeletonAPI(Retrofit retrofit) {
        return (IPageSkeletonAPI) i.e(PageSkeletonAPIModule.INSTANCE.providePageSkeletonAPI(retrofit));
    }

    public IPageSkeletonAPI get() {
        return providePageSkeletonAPI(this.retrofitProvider.get());
    }
}
