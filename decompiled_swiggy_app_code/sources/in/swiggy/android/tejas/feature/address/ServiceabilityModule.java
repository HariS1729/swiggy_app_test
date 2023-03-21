package in.swiggy.android.tejas.feature.address;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.transformer.ServiceabilityTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: ServiceabilityModule.kt */
public final class ServiceabilityModule {
    public static final ServiceabilityModule INSTANCE = new ServiceabilityModule();

    private ServiceabilityModule() {
    }

    public static final ITransformer<SwiggyApiResponse<String>, Boolean> providesTransformer(ServiceabilityTransformer serviceabilityTransformer) {
        p.j(serviceabilityTransformer, "serviceabilityTransformer");
        return serviceabilityTransformer;
    }
}
