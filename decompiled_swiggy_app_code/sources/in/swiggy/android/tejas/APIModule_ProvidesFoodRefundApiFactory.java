package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.order.refund.api.IRefundDetailsApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesFoodRefundApiFactory implements e<IRefundDetailsApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesFoodRefundApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesFoodRefundApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesFoodRefundApiFactory(provider);
    }

    public static IRefundDetailsApi providesFoodRefundApi(Retrofit retrofit) {
        return (IRefundDetailsApi) i.e(APIModule.providesFoodRefundApi(retrofit));
    }

    public IRefundDetailsApi get() {
        return providesFoodRefundApi(this.retrofitProvider.get());
    }
}
