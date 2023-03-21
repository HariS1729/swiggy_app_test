package in.swiggy.android.tejas.feature.chathead;

import in.swiggy.android.tejas.feature.chathead.api.IChatApi;
import javax.inject.Provider;
import qq.e;

public final class ChatManager_Factory implements e<ChatManager> {
    private final Provider<IChatApi> chatApiProvider;

    public ChatManager_Factory(Provider<IChatApi> provider) {
        this.chatApiProvider = provider;
    }

    public static ChatManager_Factory create(Provider<IChatApi> provider) {
        return new ChatManager_Factory(provider);
    }

    public static ChatManager newInstance(IChatApi iChatApi) {
        return new ChatManager(iChatApi);
    }

    public ChatManager get() {
        return newInstance(this.chatApiProvider.get());
    }
}
