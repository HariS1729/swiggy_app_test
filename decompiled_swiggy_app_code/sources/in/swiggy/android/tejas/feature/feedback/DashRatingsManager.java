package in.swiggy.android.tejas.feature.feedback;

import ao0.s;
import in.swiggy.android.tejas.IDashAPI;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import java.util.Map;
import js.c;
import kotlin.jvm.internal.p;
import ni0.a;
import retrofit2.Response;

/* compiled from: DashRatingsManager.kt */
public final class DashRatingsManager {
    private final IDashAPI dashAPI;

    public DashRatingsManager(IDashAPI iDashAPI) {
        p.j(iDashAPI, "dashAPI");
        this.dashAPI = iDashAPI;
    }

    /* access modifiers changed from: private */
    /* renamed from: dismissDashRating$lambda-0  reason: not valid java name */
    public static final Boolean m14dismissDashRating$lambda0(Response response) {
        boolean z11;
        p.j(response, "it");
        if (response.isSuccessful()) {
            SwiggyApiResponse swiggyApiResponse = (SwiggyApiResponse) response.body();
            if (c.h(swiggyApiResponse == null ? null : Boolean.valueOf(swiggyApiResponse.isResponseOk()))) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }

    public final s<Boolean> dismissDashRating(Map<String, Long> map) {
        p.j(map, "dashFeedbackDismissParams");
        s<R> n = this.dashAPI.dismissDashRating(map).n(a.f27088a);
        p.i(n, "dashAPI.dismissDashRatin…seOk().isTrue()\n        }");
        return n;
    }
}
