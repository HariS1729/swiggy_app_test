package in.swiggy.android.tejas.feature.address.transformer;

import i20.t;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ServiceabilityTransformer.kt */
public final class ServiceabilityTransformer implements ITransformer<SwiggyApiResponse<String>, Boolean> {
    public static final Companion Companion = new Companion((i) null);
    private static final String TAG_SERVICEABLE = "SERVICEABLE";

    /* compiled from: ServiceabilityTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public Boolean transform(SwiggyApiResponse<String> swiggyApiResponse) {
        p.j(swiggyApiResponse, t.V);
        Integer statusCode = swiggyApiResponse.getStatusCode();
        if (statusCode != null && statusCode.intValue() == 0 && p.e(swiggyApiResponse.getData(), "SERVICEABLE")) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
