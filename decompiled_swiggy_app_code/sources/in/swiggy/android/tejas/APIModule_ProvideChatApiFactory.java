package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.chathead.api.IChatApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvideChatApiFactory implements e<IChatApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvideChatApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvideChatApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvideChatApiFactory(provider);
    }

    public static IChatApi provideChatApi(Retrofit retrofit) {
        return (IChatApi) i.e(APIModule.provideChatApi(retrofit));
    }

    public IChatApi get() {
        return provideChatApi(this.retrofitProvider.get());
    }
}
