package in.swiggy.android.tejas;

import in.swiggy.android.tejas.api.ApiEndPointType;
import in.swiggy.android.tejas.apiinterface.IDiscoveryApi;
import in.swiggy.android.tejas.apiinterface.ISpnsApi;
import in.swiggy.android.tejas.feature.cancellation.CancelOnlyApi;
import in.swiggy.android.tejas.feature.cancellation.ICancelOnlyApi;
import in.swiggy.android.tejas.feature.chathead.api.IChatApi;
import in.swiggy.android.tejas.feature.chatnotification.api.IChatNotificationApi;
import in.swiggy.android.tejas.feature.detipping.api.IDeTipPostOrderApi;
import in.swiggy.android.tejas.feature.edm.IEdmApi;
import in.swiggy.android.tejas.feature.menu.outletselector.IOldOutletSelectorApi;
import in.swiggy.android.tejas.feature.menu.outletselector.IOutletSelectorApi;
import in.swiggy.android.tejas.feature.moneta.IMonetaAPI;
import in.swiggy.android.tejas.feature.offers.IOffersApi;
import in.swiggy.android.tejas.feature.order.refund.api.IDashRefundDetailsApi;
import in.swiggy.android.tejas.feature.order.refund.api.IRefundDetailsApi;
import in.swiggy.android.tejas.feature.otpverification.IOtpVerificationApi;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitDevApi;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitProtobufApi;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: APIModule.kt */
public final class APIModule {
    public static final APIModule INSTANCE = new APIModule();

    private APIModule() {
    }

    public static final IChatApi provideChatApi(@RetrofitDevApi(apiType = ApiEndPointType.POS_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IChatApi.class);
        p.i(create, "retrofit.create(IChatApi::class.java)");
        return (IChatApi) create;
    }

    public static final IChatNotificationApi provideChatNotificationApi(@RetrofitDevApi(apiType = ApiEndPointType.POS_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IChatNotificationApi.class);
        p.i(create, "retrofit.create(IChatNotificationApi::class.java)");
        return (IChatNotificationApi) create;
    }

    public static final IOffersApi provideOfferApi(@RetrofitDevApi(apiType = ApiEndPointType.DISCOVERY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IOffersApi.class);
        p.i(create, "retrofit.create(IOffersApi::class.java)");
        return (IOffersApi) create;
    }

    public static final IOldOutletSelectorApi provideOldOutletSelectorApi(@RetrofitDevApi(apiType = ApiEndPointType.DISCOVERY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IOldOutletSelectorApi.class);
        p.i(create, "retrofit.create(IOldOutletSelectorApi::class.java)");
        return (IOldOutletSelectorApi) create;
    }

    public static final IOutletSelectorApi provideOutletSelectorApi(@RetrofitProtobufApi Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IOutletSelectorApi.class);
        p.i(create, "retrofit.create(IOutletSelectorApi::class.java)");
        return (IOutletSelectorApi) create;
    }

    public static final ICancelOnlyApi providesCancelOnlyApi(@CancelOnlyApi Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(ICancelOnlyApi.class);
        p.i(create, "retrofit.create(ICancelOnlyApi::class.java)");
        return (ICancelOnlyApi) create;
    }

    public static final IDashAPI providesDashAPI(@RetrofitDevApi(apiType = ApiEndPointType.DASH_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDashAPI.class);
        p.i(create, "retrofit.create(IDashAPI::class.java)");
        return (IDashAPI) create;
    }

    public static final IDashRefundDetailsApi providesDashRefundApi(@RetrofitDevApi(apiType = ApiEndPointType.DASH_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDashRefundDetailsApi.class);
        p.i(create, "retrofit.create(IDashRefundDetailsApi::class.java)");
        return (IDashRefundDetailsApi) create;
    }

    public static final IDiscoveryApi providesDiscoveryApi(@RetrofitDevApi(apiType = ApiEndPointType.DISCOVERY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDiscoveryApi.class);
        p.i(create, "retrofit.create(IDiscoveryApi::class.java)");
        return (IDiscoveryApi) create;
    }

    public static final IEdmApi providesEdmAPI(@RetrofitDevApi(apiType = ApiEndPointType.SWIGGY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IEdmApi.class);
        p.i(create, "retrofit.create(IEdmApi::class.java)");
        return (IEdmApi) create;
    }

    public static final IRefundDetailsApi providesFoodRefundApi(@RetrofitDevApi(apiType = ApiEndPointType.CHECKOUT_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IRefundDetailsApi.class);
        p.i(create, "retrofit.create(IRefundDetailsApi::class.java)");
        return (IRefundDetailsApi) create;
    }

    public static final IMonetaAPI providesMonetaAPI(@RetrofitDevApi(apiType = ApiEndPointType.SWIGGY_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IMonetaAPI.class);
        p.i(create, "retrofit.create(IMonetaAPI::class.java)");
        return (IMonetaAPI) create;
    }

    public static final IOtpVerificationApi providesOtpVerificationApi(@RetrofitDevApi(apiType = ApiEndPointType.PROFILE_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IOtpVerificationApi.class);
        p.i(create, "retrofit.create(IOtpVerificationApi::class.java)");
        return (IOtpVerificationApi) create;
    }

    public static final IDeTipPostOrderApi providesPostOrderDeTipApi(@RetrofitDevApi(apiType = ApiEndPointType.CHECKOUT_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IDeTipPostOrderApi.class);
        p.i(create, "retrofit.create(IDeTipPostOrderApi::class.java)");
        return (IDeTipPostOrderApi) create;
    }

    public static final ISpnsApi providesSpnsApi(@RetrofitDevApi(apiType = ApiEndPointType.SPNS_API) Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(ISpnsApi.class);
        p.i(create, "retrofit.create(ISpnsApi::class.java)");
        return (ISpnsApi) create;
    }
}
