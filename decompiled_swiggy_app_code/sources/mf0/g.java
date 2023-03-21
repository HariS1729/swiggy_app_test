package mf0;

import in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager;
import in.swiggy.android.utils.ChatNotificationUtils;
import ir.b;
import javax.inject.Provider;
import qq.e;

/* compiled from: ChatNotificationReplyWorker_AssistedFactory_Factory */
public final class g implements e<f> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ChatNotificationUtils> f19703a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<ChatNotificationApiManager> f19704b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<b> f19705c;

    public g(Provider<ChatNotificationUtils> provider, Provider<ChatNotificationApiManager> provider2, Provider<b> provider3) {
        this.f19703a = provider;
        this.f19704b = provider2;
        this.f19705c = provider3;
    }

    public static g a(Provider<ChatNotificationUtils> provider, Provider<ChatNotificationApiManager> provider2, Provider<b> provider3) {
        return new g(provider, provider2, provider3);
    }

    public static f c(Provider<ChatNotificationUtils> provider, Provider<ChatNotificationApiManager> provider2, Provider<b> provider3) {
        return new f(provider, provider2, provider3);
    }

    /* renamed from: b */
    public f get() {
        return c(this.f19703a, this.f19704b, this.f19705c);
    }
}
