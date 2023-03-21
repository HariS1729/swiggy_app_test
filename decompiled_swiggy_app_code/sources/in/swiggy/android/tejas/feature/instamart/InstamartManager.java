package in.swiggy.android.tejas.feature.instamart;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.instamart.model.ClearCartResponse;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;

/* compiled from: InstamartManager.kt */
public final class InstamartManager {
    public static final Companion Companion = new Companion((i) null);
    public static final int OK_STATUS_CODE = 0;
    private final IInstamartApi instamartApi;

    /* compiled from: InstamartManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public InstamartManager(IInstamartApi iInstamartApi) {
        p.j(iInstamartApi, "instamartApi");
        this.instamartApi = iInstamartApi;
    }

    public final d<InstamartResponse<SwiggyApiResponse<ClearCartResponse>>> clearInstamartCart() {
        return new InstamartManager$clearInstamartCart$$inlined$map$1(this.instamartApi.clearInstamartCart());
    }

    public final d<InstamartResponse<SwiggyApiResponse<GetIMCartData>>> getInstamartCart() {
        return new InstamartManager$getInstamartCart$$inlined$map$1(this.instamartApi.getInstamartCart());
    }
}
