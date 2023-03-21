package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.detipping.api.IDeTipPostOrderApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvidesPostOrderDeTipApiFactory implements e<IDeTipPostOrderApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvidesPostOrderDeTipApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvidesPostOrderDeTipApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvidesPostOrderDeTipApiFactory(provider);
    }

    public static IDeTipPostOrderApi providesPostOrderDeTipApi(Retrofit retrofit) {
        return (IDeTipPostOrderApi) i.e(APIModule.providesPostOrderDeTipApi(retrofit));
    }

    public IDeTipPostOrderApi get() {
        return providesPostOrderDeTipApi(this.retrofitProvider.get());
    }
}
