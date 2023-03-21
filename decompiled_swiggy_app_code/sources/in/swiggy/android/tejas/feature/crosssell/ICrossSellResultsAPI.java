package in.swiggy.android.tejas.feature.crosssell;

import fp0.c;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellRequestBody;
import retrofit2.Response;

/* compiled from: ICrossSellResultsAPI.kt */
public interface ICrossSellResultsAPI {
    Object getCrossSellCollection(double d11, double d12, CrossSellRequestBody crossSellRequestBody, c<? super Response<com.swiggy.gandalf.widgets.v2.Response>> cVar);
}
