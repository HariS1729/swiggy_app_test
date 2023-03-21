package in.swiggy.android.tejas.feature.google.directionscache.repository;

import in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource;
import javax.inject.Provider;
import qq.e;

public final class DirectionsRepositoryImpl_Factory implements e<DirectionsRepositoryImpl> {
    private final Provider<DirectionsDataSource> dataSourceProvider;

    public DirectionsRepositoryImpl_Factory(Provider<DirectionsDataSource> provider) {
        this.dataSourceProvider = provider;
    }

    public static DirectionsRepositoryImpl_Factory create(Provider<DirectionsDataSource> provider) {
        return new DirectionsRepositoryImpl_Factory(provider);
    }

    public static DirectionsRepositoryImpl newInstance(DirectionsDataSource directionsDataSource) {
        return new DirectionsRepositoryImpl(directionsDataSource);
    }

    public DirectionsRepositoryImpl get() {
        return newInstance(this.dataSourceProvider.get());
    }
}
