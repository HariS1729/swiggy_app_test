package in.swiggy.android.tejas.apiinterface;

import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.feature.swiggygoogle.swiggyreversegeocode.SwiggyGooglePlaceList;
import in.swiggy.android.tejas.oldapi.models.WebViewResourceResponse;
import in.swiggy.android.tejas.oldapi.network.requests.PostableDeviceAddSPNS;
import in.swiggy.android.tejas.oldapi.network.requests.PostableSPNSReport;
import retrofit2.http.Body;
import retrofit2.http.Query;
import retrofit2.http.Url;

@Deprecated
public interface ISwiggyApiOld {
    SwiggyGooglePlaceList getGeocodePlaceFromSwiggyApi(@Query("latlng") String str);

    SwiggyGooglePlaceList getGooglePlaceIDFromSwiggyApi(@Query("place_id") String str);

    WebViewResourceResponse getSuperWebViewResources();

    WebViewResourceResponse getWebViewResources();

    SwiggyBaseResponse registerDeviceSPNS(@Body PostableDeviceAddSPNS postableDeviceAddSPNS);

    SwiggyBaseResponse spnsReportPublish(@Url String str, @Body PostableSPNSReport postableSPNSReport);
}
