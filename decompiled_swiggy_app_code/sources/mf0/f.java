package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.ChatNotificationReplyWorker;
import in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager;
import in.swiggy.android.utils.ChatNotificationUtils;
import ir.b;
import is.a;
import javax.inject.Provider;

/* compiled from: ChatNotificationReplyWorker_AssistedFactory */
public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ChatNotificationUtils> f19698a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<ChatNotificationApiManager> f19699b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<b> f19700c;

    public f(Provider<ChatNotificationUtils> provider, Provider<ChatNotificationApiManager> provider2, Provider<b> provider3) {
        this.f19698a = provider;
        this.f19699b = provider2;
        this.f19700c = provider3;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new ChatNotificationReplyWorker(context, workerParameters, this.f19698a.get(), this.f19699b.get(), this.f19700c.get());
    }
}
