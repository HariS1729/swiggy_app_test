package in.swiggy.android.tejas.feature.appBlocking;

import javax.inject.Provider;
import qq.e;

public final class ClonedAppWhiteListUseCase_Factory implements e<ClonedAppWhiteListUseCase> {
    private final Provider<AppBlockingRepository> repositoryProvider;

    public ClonedAppWhiteListUseCase_Factory(Provider<AppBlockingRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static ClonedAppWhiteListUseCase_Factory create(Provider<AppBlockingRepository> provider) {
        return new ClonedAppWhiteListUseCase_Factory(provider);
    }

    public static ClonedAppWhiteListUseCase newInstance(AppBlockingRepository appBlockingRepository) {
        return new ClonedAppWhiteListUseCase(appBlockingRepository);
    }

    public ClonedAppWhiteListUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
