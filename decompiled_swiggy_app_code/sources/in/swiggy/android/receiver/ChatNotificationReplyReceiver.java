package in.swiggy.android.receiver;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.mvvm.base.SwiggyBaseBroadcastReceiver;
import in.swiggy.android.services.ChatNotificationReplyWorker;
import in.swiggy.android.utils.ChatNotificationUtils;
import kotlin.jvm.internal.p;
import oq.a;

/* compiled from: ChatNotificationReplyReceiver.kt */
public final class ChatNotificationReplyReceiver extends SwiggyBaseBroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public ChatNotificationUtils f18512a;

    public final ChatNotificationUtils a() {
        ChatNotificationUtils chatNotificationUtils = this.f18512a;
        if (chatNotificationUtils != null) {
            return chatNotificationUtils;
        }
        p.B("chatNotificationUtils");
        return null;
    }

    public void onReceive(Context context, Intent intent) {
        p.j(context, LogCategory.CONTEXT);
        p.j(intent, "intent");
        a.c(this, context);
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        String stringExtra = intent.getStringExtra("ConversationId");
        String stringExtra2 = intent.getStringExtra("KEY_SENDER");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (resultsFromIntent != null) {
            CharSequence charSequence = resultsFromIntent.getCharSequence("KEY_REPLY");
            if (stringExtra != null) {
                a().q(String.valueOf(charSequence), stringExtra2, stringExtra, false);
                a().p(stringExtra, false);
                Context context2 = context;
                ChatNotificationReplyWorker.f18571o.g(context2, stringExtra, String.valueOf(charSequence), a().d(), a().e(), a().k(String.valueOf(charSequence)));
            }
        }
    }
}
