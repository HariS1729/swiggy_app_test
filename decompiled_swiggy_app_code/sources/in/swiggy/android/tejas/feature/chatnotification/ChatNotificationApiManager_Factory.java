package in.swiggy.android.tejas.feature.chatnotification;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.chatnotification.api.IChatNotificationApi;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class ChatNotificationApiManager_Factory implements e<ChatNotificationApiManager> {
    private final Provider<IChatNotificationApi> chatNotificationApiProvider;
    private final Provider<ITransformer<Throwable, Error>> exceptionTransformerProvider;

    public ChatNotificationApiManager_Factory(Provider<IChatNotificationApi> provider, Provider<ITransformer<Throwable, Error>> provider2) {
        this.chatNotificationApiProvider = provider;
        this.exceptionTransformerProvider = provider2;
    }

    public static ChatNotificationApiManager_Factory create(Provider<IChatNotificationApi> provider, Provider<ITransformer<Throwable, Error>> provider2) {
        return new ChatNotificationApiManager_Factory(provider, provider2);
    }

    public static ChatNotificationApiManager newInstance(IChatNotificationApi iChatNotificationApi, ITransformer<Throwable, Error> iTransformer) {
        return new ChatNotificationApiManager(iChatNotificationApi, iTransformer);
    }

    public ChatNotificationApiManager get() {
        return newInstance(this.chatNotificationApiProvider.get(), this.exceptionTransformerProvider.get());
    }
}
