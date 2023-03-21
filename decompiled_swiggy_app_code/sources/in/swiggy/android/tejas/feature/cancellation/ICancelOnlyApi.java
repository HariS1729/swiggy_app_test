package in.swiggy.android.tejas.feature.cancellation;

import ao0.s;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import kotlin.jvm.internal.i;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* compiled from: ICancelOnlyApi.kt */
public interface ICancelOnlyApi {
    public static final String CANCEL_ONLY = "v1/cancel-only/order/{orderId}";
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ICancelOnlyApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String CANCEL_ONLY = "v1/cancel-only/order/{orderId}";

        private Companion() {
        }
    }

    /* compiled from: ICancelOnlyApi.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ s cancelOnly$default(ICancelOnlyApi iCancelOnlyApi, String str, CancelOnlyRequest cancelOnlyRequest, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    cancelOnlyRequest = new CancelOnlyRequest((String) null, 1, (i) null);
                }
                return iCancelOnlyApi.cancelOnly(str, cancelOnlyRequest);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelOnly");
        }
    }

    @PUT("v1/cancel-only/order/{orderId}")
    s<Response<SwiggyApiResponse<CancelOnlyResponse>>> cancelOnly(@Path("orderId") String str, @Body CancelOnlyRequest cancelOnlyRequest);
}
