package in.swiggy.android.tejas.feature.google.directionscache.repository;

import fp0.c;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import in.swiggy.android.tejas.feature.google.directionscache.datasource.DirectionsDataSource;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;

/* compiled from: DirectionsRepositoryImpl.kt */
public final class DirectionsRepositoryImpl implements DirectionsRepository {
    private final DirectionsDataSource dataSource;

    public DirectionsRepositoryImpl(DirectionsDataSource directionsDataSource) {
        p.j(directionsDataSource, "dataSource");
        this.dataSource = directionsDataSource;
    }

    public d<Response<DirectionsResponse>> getDirections(DirectionsRequest directionsRequest) {
        p.j(directionsRequest, "request");
        DirectionsDataSource directionsDataSource = this.dataSource;
        return f.f(f.A(f.x(new DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$1((c) null, directionsDataSource, directionsRequest, directionsDataSource, directionsRequest, directionsDataSource, directionsRequest, directionsRequest, directionsDataSource, directionsRequest)), DispatchProviderKt.a().D()), new DirectionsRepositoryImpl$getDirections$lambda5$$inlined$networkBoundResource$default$2((c) null));
    }
}
