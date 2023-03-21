package in.swiggy.android.tejas.feature.google.directionscache.datasource;

import javax.inject.Provider;
import qq.e;

public final class DirectionsDataSource_Factory implements e<DirectionsDataSource> {
    private final Provider<DirectionsLocalDataSource> localDataSourceProvider;
    private final Provider<DirectionsRemoteDataSource> remoteDataSourceProvider;

    public DirectionsDataSource_Factory(Provider<DirectionsLocalDataSource> provider, Provider<DirectionsRemoteDataSource> provider2) {
        this.localDataSourceProvider = provider;
        this.remoteDataSourceProvider = provider2;
    }

    public static DirectionsDataSource_Factory create(Provider<DirectionsLocalDataSource> provider, Provider<DirectionsRemoteDataSource> provider2) {
        return new DirectionsDataSource_Factory(provider, provider2);
    }

    public static DirectionsDataSource newInstance(DirectionsLocalDataSource directionsLocalDataSource, DirectionsRemoteDataSource directionsRemoteDataSource) {
        return new DirectionsDataSource(directionsLocalDataSource, directionsRemoteDataSource);
    }

    public DirectionsDataSource get() {
        return newInstance(this.localDataSourceProvider.get(), this.remoteDataSourceProvider.get());
    }
}
