package in.swiggy.android.tejas.coroutines.coroutinespolling;

import in.swiggy.android.tejas.feature.chathead.ChatManager;
import javax.inject.Provider;
import qq.e;

public final class ChatCoroutinesPoller_Factory implements e<ChatCoroutinesPoller> {
    private final Provider<ChatManager> chatManagerProvider;

    public ChatCoroutinesPoller_Factory(Provider<ChatManager> provider) {
        this.chatManagerProvider = provider;
    }

    public static ChatCoroutinesPoller_Factory create(Provider<ChatManager> provider) {
        return new ChatCoroutinesPoller_Factory(provider);
    }

    public static ChatCoroutinesPoller newInstance(ChatManager chatManager) {
        return new ChatCoroutinesPoller(chatManager);
    }

    public ChatCoroutinesPoller get() {
        return newInstance(this.chatManagerProvider.get());
    }
}
