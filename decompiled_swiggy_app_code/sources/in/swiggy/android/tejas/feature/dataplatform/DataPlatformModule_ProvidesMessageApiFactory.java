package in.swiggy.android.tejas.feature.dataplatform;

import in.swiggy.android.tejas.feature.dataplatform.api.IMessageApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class DataPlatformModule_ProvidesMessageApiFactory implements e<IMessageApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DataPlatformModule_ProvidesMessageApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static DataPlatformModule_ProvidesMessageApiFactory create(Provider<Retrofit> provider) {
        return new DataPlatformModule_ProvidesMessageApiFactory(provider);
    }

    public static IMessageApi providesMessageApi(Retrofit retrofit) {
        return (IMessageApi) i.e(DataPlatformModule.providesMessageApi(retrofit));
    }

    public IMessageApi get() {
        return providesMessageApi(this.retrofitProvider.get());
    }
}
