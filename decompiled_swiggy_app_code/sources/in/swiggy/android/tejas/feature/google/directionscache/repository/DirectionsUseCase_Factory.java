package in.swiggy.android.tejas.feature.google.directionscache.repository;

import javax.inject.Provider;
import qq.e;

public final class DirectionsUseCase_Factory implements e<DirectionsUseCase> {
    private final Provider<DirectionsRepository> repositoryProvider;

    public DirectionsUseCase_Factory(Provider<DirectionsRepository> provider) {
        this.repositoryProvider = provider;
    }

    public static DirectionsUseCase_Factory create(Provider<DirectionsRepository> provider) {
        return new DirectionsUseCase_Factory(provider);
    }

    public static DirectionsUseCase newInstance(DirectionsRepository directionsRepository) {
        return new DirectionsUseCase(directionsRepository);
    }

    public DirectionsUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }
}
