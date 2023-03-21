package in.swiggy.android.tejas.feature.crosssell;

import fp0.c;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellRequestBody;
import kotlin.jvm.internal.p;
import os.a;
import retrofit2.Response;

/* compiled from: CrossSellResultsAPI.kt */
public final class CrossSellResultsAPI implements ICrossSellResultsAPI {
    private final a appBuildDetails;
    private final ICrossSellAPI crossSellAPI;

    public CrossSellResultsAPI(ICrossSellAPI iCrossSellAPI, a aVar) {
        p.j(iCrossSellAPI, "crossSellAPI");
        p.j(aVar, "appBuildDetails");
        this.crossSellAPI = iCrossSellAPI;
        this.appBuildDetails = aVar;
    }

    public Object getCrossSellCollection(double d11, double d12, CrossSellRequestBody crossSellRequestBody, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar) {
        if (this.appBuildDetails.j()) {
            return this.crossSellAPI.getCrossSellCollection(d11, d12, crossSellRequestBody, cVar);
        }
        return this.crossSellAPI.getCrossSellCollectionJSON(d11, d12, crossSellRequestBody, cVar);
    }
}
