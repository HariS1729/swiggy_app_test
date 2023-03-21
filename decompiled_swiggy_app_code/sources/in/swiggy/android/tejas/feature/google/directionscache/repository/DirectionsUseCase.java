package in.swiggy.android.tejas.feature.google.directionscache.repository;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsRequest;
import in.swiggy.android.tejas.feature.google.directionscache.api.DirectionsResponse;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: DirectionsUseCase.kt */
public final class DirectionsUseCase extends FlowUseCase<DirectionsRequest, DirectionsResponse> {
    private final DirectionsRepository repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectionsUseCase(DirectionsRepository directionsRepository) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(directionsRepository, "repository");
        this.repository = directionsRepository;
    }

    /* access modifiers changed from: protected */
    public d<Response<DirectionsResponse>> execute(DirectionsRequest directionsRequest) {
        p.j(directionsRequest, "parameters");
        return this.repository.getDirections(directionsRequest);
    }
}
