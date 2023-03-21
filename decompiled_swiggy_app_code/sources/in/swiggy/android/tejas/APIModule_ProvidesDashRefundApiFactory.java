package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.order.refund.api.IDashRefundDetailsApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesDashRefundApiFactory implements e<IDashRefundDetailsApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesDashRefundApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesDashRefundApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesDashRefundApiFactory(provider);
    }

    public static IDashRefundDetailsApi providesDashRefundApi(Retrofit retrofit) {
        return (IDashRefundDetailsApi) i.e(APIModule.providesDashRefundApi(retrofit));
    }

    public IDashRefundDetailsApi get() {
        return providesDashRefundApi(this.retrofitProvider.get());
    }
}
