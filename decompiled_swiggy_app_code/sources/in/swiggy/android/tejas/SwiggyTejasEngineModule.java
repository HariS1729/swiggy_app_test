package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiBaseUrl;
import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.api.IErrorChecker;
import in.swiggy.android.tejas.api.ISwiggyApi;
import in.swiggy.android.tejas.api.SwiggyLegacyApiErrorChecker;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.feature.address.v2.di.AddressMapsApi;
import in.swiggy.android.tejas.feature.appBlocking.ClonedAppWhiteListApi;
import in.swiggy.android.tejas.feature.cancellation.CancelOnlyApi;
import in.swiggy.android.tejas.feature.recommends.IRecommendsApi;
import in.swiggy.android.tejas.feature.swiggypop.IPopApi;
import in.swiggy.android.tejas.feature.tracking.detipping.TrackDeTipApi;
import in.swiggy.android.tejas.feature.trackv3.api.qualifiers.TrackApi;
import in.swiggy.android.tejas.feature.trackv3.api.qualifiers.TrackV3Api;
import in.swiggy.android.tejas.network.utils.NetworkUtils;
import in.swiggy.android.tejas.payment.IDashPaymentApi;
import in.swiggy.android.tejas.payment.IPaymentApi;
import in.swiggy.android.tejas.payment.IRefundsAPI;
import in.swiggy.android.tejas.qualifiers.retrofit.JuspayDevApi;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevV2Api;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDineoutProtobufApi;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitProtoApi;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitProtobufApi;
import kotlin.jvm.internal.p;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* compiled from: SwiggyTejasEngineModule.kt */
public final class SwiggyTejasEngineModule {
    public static final SwiggyTejasEngineModule INSTANCE = new SwiggyTejasEngineModule();

    private SwiggyTejasEngineModule() {
    }

    @AddressMapsApi
    public final Retrofit providesAddressMapsApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getMapsBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.ANALYTICS_API)
    public final Retrofit providesAnalyticsApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getAnalyticsApiUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @CancelOnlyApi
    public final Retrofit providesCancelOnlyApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getTrackCancelApiUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    public final Retrofit providesCasDirectionsRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getSwiggyDirectionsBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @ClonedAppWhiteListApi
    public final Retrofit providesClonedAppWhiteListApi(OkHttpClient okHttpClient, ApiBaseUrl apiBaseUrl) {
        p.j(okHttpClient, "jsonOkHttp");
        p.j(apiBaseUrl, "apiBaseUrl");
        Retrofit.Builder retrofit = NetworkUtils.getRetrofit();
        retrofit.converterFactories().clear();
        retrofit.addConverterFactory(NetworkUtils.getProtoJsonConverterFactory());
        Retrofit.Builder client = retrofit.client(okHttpClient);
        client.baseUrl(apiBaseUrl.getTNSBaseUrl());
        Retrofit build = client.build();
        p.i(build, "with(builder) {\n        …        build()\n        }");
        return build;
    }

    public final IDashPaymentApi providesDashPaymentApi(@RetrofitDevApi(apiType = ApiEndPointType.DASH_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDashPaymentApi.class);
        p.i(create, "retrofit.create(IDashPaymentApi::class.java)");
        return (IDashPaymentApi) create;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.CHECKOUT_API)
    public final Retrofit providesDevApiRetrofitCheckoutApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getCheckoutBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.DASH_API)
    public final Retrofit providesDevApiRetrofitDashApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getDashBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.DISCOVERY_API)
    public final Retrofit providesDevApiRetrofitDiscoveryApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getDiscoveryBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.POS_API)
    public final Retrofit providesDevApiRetrofitPOSApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getPosBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.PROFILE_API)
    public final Retrofit providesDevApiRetrofitProfileApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getProfileBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevV2Api(apiType = ApiEndPointType.PROFILE_API)
    public final Retrofit providesDevApiRetrofitProfileV2Api(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getProfileBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.REFUNDS)
    public final Retrofit providesDevApiRetrofitRefunds(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(ApiBaseUrl.DefaultImpls.getRefundsBaseUrl$default(apiBaseUrl, false, 1, (Object) null));
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.SWIGGY_API)
    public final Retrofit providesDevApiRetrofitSwiggyApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getSwiggyBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.WEB_API)
    public final Retrofit providesDevApiRetrofitWebApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getWebPortalUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.DOWNLOADER_API)
    public final Retrofit providesDownloaderApi(Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        return retrofit;
    }

    public final IErrorChecker<SwiggyBaseResponse> providesErrorChecker() {
        return new SwiggyLegacyApiErrorChecker();
    }

    @RetrofitDevApi(apiType = ApiEndPointType.FNA_API)
    public final Retrofit providesFnaApiRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getFNABaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.GOOGLE_API)
    public final Retrofit providesGoogleApi(Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        return retrofit;
    }

    public final Retrofit providesGoogleRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getGoogleBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    public final IRecommendsApi providesIRecommendsApi(@RetrofitDevApi(apiType = ApiEndPointType.RECOMMENDS_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IRecommendsApi.class);
        p.i(create, "retrofit.create(IRecommendsApi::class.java)");
        return (IRecommendsApi) create;
    }

    public final ISwiggyApi providesISwiggyApi(@RetrofitDevApi(apiType = ApiEndPointType.SWIGGY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(ISwiggyApi.class);
        p.i(create, "retrofit.create(ISwiggyApi::class.java)");
        return (ISwiggyApi) create;
    }

    @JuspayDevApi
    public final Retrofit providesJupayApiRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getJuspayBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.PLACES_AUTOCOMPLETE)
    public final Retrofit providesPlaceAutocompleteRetrofitSwiggyApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getPlacesAutocompleteUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    public final IPopApi providesPopApi(@RetrofitDevApi(apiType = ApiEndPointType.CHECKOUT_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IPopApi.class);
        p.i(create, "retrofit.create(IPopApi::class.java)");
        return (IPopApi) create;
    }

    @RetrofitProtobufApi
    public final Retrofit providesProtobufApiRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getDiscoveryBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDineoutProtobufApi(apiType = ApiEndPointType.DINEOUT_API)
    public final Retrofit providesProtobufDineoutApiRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getDineoutCouponBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    public final IRefundsAPI providesRefunds(@RetrofitDevApi(apiType = ApiEndPointType.REFUNDS) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IRefundsAPI.class);
        p.i(create, "retrofit.create(IRefundsAPI::class.java)");
        return (IRefundsAPI) create;
    }

    @RetrofitProtoApi(apiType = ApiEndPointType.PROFILE_API)
    public final Retrofit providesRetrofitProtoApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getProfileBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.RECOMMENDS_API)
    public final Retrofit providesRetrofitRecommendsApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getRecommendsBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.SPNS_API)
    public final Retrofit providesSpnsApiRetrofitSPNSApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getSpnsUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    public final IPaymentApi providesSwiggyDevApi(@RetrofitDevApi(apiType = ApiEndPointType.CHECKOUT_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IPaymentApi.class);
        p.i(create, "retrofit.create(IPaymentApi::class.java)");
        return (IPaymentApi) create;
    }

    @TrackApi
    public final Retrofit providesTrackApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getDiscoveryBaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @TrackDeTipApi
    public final Retrofit providesTrackDeTipApi(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getTrackDeTipApiUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @TrackV3Api
    public final Retrofit providesTrackV3Api(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getTrackV3ApiUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    @RetrofitDevApi(apiType = ApiEndPointType.VOICE_DIRECTIONS)
    public final Retrofit providesVoiceDirectionsRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getVoiceDirectionsbaseUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }

    public final Retrofit providesWebResourceRetrofit(Retrofit.Builder builder, ApiBaseUrl apiBaseUrl) {
        p.j(builder, "retrofitBuilder");
        p.j(apiBaseUrl, "apiBaseUrl");
        builder.baseUrl(apiBaseUrl.getWebPortalUrl());
        Retrofit build = builder.build();
        p.i(build, "with(retrofitBuilder) {\n…())\n        build()\n    }");
        return build;
    }
}
