package in.swiggy.android.tejas.api;

import kotlin.jvm.internal.p;

/* compiled from: ApiBaseUrl.kt */
public interface ApiBaseUrl {

    /* compiled from: ApiBaseUrl.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ String getRefundsBaseUrl$default(ApiBaseUrl apiBaseUrl, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = false;
                }
                return apiBaseUrl.getRefundsBaseUrl(z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRefundsBaseUrl");
        }

        public static String getWebPortalUrl(ApiBaseUrl apiBaseUrl) {
            p.j(apiBaseUrl, "this");
            return "";
        }
    }

    String getAnalyticsApiUrl();

    String getCheckoutBaseUrl();

    String getDashBaseUrl();

    String getDashPudoWebBaseUrl();

    String getDashWebBaseUrl();

    String getDineoutCouponBaseUrl();

    String getDiscoveryBaseUrl();

    String getDownloaderBaseUrl();

    String getFNABaseUrl();

    String getGoogleBaseUrl();

    String getHandPickedWebBaseUrl();

    String getHelpcenterWebhost();

    String getHelpsupportWebhost();

    String getJuspayBaseUrl();

    String getMapsBaseUrl();

    String getOrderHelpUrl();

    String getPaymentBaseUrl();

    String getPlacesAutocompleteUrl();

    String getPosBaseUrl();

    String getProfileBaseUrl();

    String getRecommendsBaseUrl();

    String getRefundsBaseUrl(boolean z11);

    String getSpnsUrl();

    String getSwiggyBaseUrl();

    String getSwiggyDirectionsBaseUrl();

    String getTNSBaseUrl();

    String getTrackCancelApiUrl();

    String getTrackDeTipApiUrl();

    String getTrackV3ApiUrl();

    String getVoiceDirectionsbaseUrl();

    String getWebPortalUrl();
}
