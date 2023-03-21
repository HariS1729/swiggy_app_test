package in.swiggy.android.tejas;

import in.swiggy.android.tejas.feature.chatnotification.api.IChatNotificationApi;
import javax.inject.Provider;
import qq.e;
import qq.i;
import retrofit2.Retrofit;

public final class APIModule_ProvideChatNotificationApiFactory implements e<IChatNotificationApi> {
    private final Provider<Retrofit> retrofitProvider;

    public APIModule_ProvideChatNotificationApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public static APIModule_ProvideChatNotificationApiFactory create(Provider<Retrofit> provider) {
        return new APIModule_ProvideChatNotificationApiFactory(provider);
    }

    public static IChatNotificationApi provideChatNotificationApi(Retrofit retrofit) {
        return (IChatNotificationApi) i.e(APIModule.provideChatNotificationApi(retrofit));
    }

    public IChatNotificationApi get() {
        return provideChatNotificationApi(this.retrofitProvider.get());
    }
}
