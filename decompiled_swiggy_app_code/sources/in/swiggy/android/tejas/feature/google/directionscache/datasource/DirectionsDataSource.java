package in.swiggy.android.tejas.feature.google.directionscache.datasource;

import in.swiggy.android.tejas.dao.SharedPrefDataSource;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import kotlin.jvm.internal.p;

/* compiled from: DirectionsDataSource.kt */
public final class DirectionsDataSource extends SharedPrefDataSource<DirectionsRequest, DirectionsResponse> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectionsDataSource(DirectionsLocalDataSource directionsLocalDataSource, DirectionsRemoteDataSource directionsRemoteDataSource) {
        super(directionsLocalDataSource, directionsRemoteDataSource);
        p.j(directionsLocalDataSource, "localDataSource");
        p.j(directionsRemoteDataSource, "remoteDataSource");
    }
}
