package in.swiggy.android.tejas.feature.google.directionscache.repository;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import kotlinx.coroutines.flow.d;

/* compiled from: DirectionsRepositoryImpl.kt */
public interface DirectionsRepository {
    d<Response<DirectionsResponse>> getDirections(DirectionsRequest directionsRequest);
}
