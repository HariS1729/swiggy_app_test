package in.swiggy.android.tejas.feature.chathead.polling;

import in.swiggy.android.tejas.coroutines.coroutinespolling.ChatCoroutinesPoller;
import javax.inject.Provider;
import qq.e;

public final class ChatPollingUseCase_Factory implements e<ChatPollingUseCase> {
    private final Provider<ChatCoroutinesPoller> chatCoroutinesPollerProvider;

    public ChatPollingUseCase_Factory(Provider<ChatCoroutinesPoller> provider) {
        this.chatCoroutinesPollerProvider = provider;
    }

    public static ChatPollingUseCase_Factory create(Provider<ChatCoroutinesPoller> provider) {
        return new ChatPollingUseCase_Factory(provider);
    }

    public static ChatPollingUseCase newInstance(ChatCoroutinesPoller chatCoroutinesPoller) {
        return new ChatPollingUseCase(chatCoroutinesPoller);
    }

    public ChatPollingUseCase get() {
        return newInstance(this.chatCoroutinesPollerProvider.get());
    }
}
