package in.swiggy.android.tejas.feature.chatnotification.api;

import fp0.c;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationRequestBody;
import in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: IChatNotificationApi.kt */
public interface IChatNotificationApi {
    public static final String CHAT_NOTIF_API = "chat/v1/conversations/{conversationID}/messages";
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: IChatNotificationApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String CHAT_NOTIF_API = "chat/v1/conversations/{conversationID}/messages";

        private Companion() {
        }
    }

    @POST("chat/v1/conversations/{conversationID}/messages")
    @Headers({"x-org-id:marketplace"})
    Object sendChatMessageApi(@Path("conversationID") String str, @Header("x-message-id") String str2, @Body ChatNotificationRequestBody chatNotificationRequestBody, c<? super Response<SwiggyApiResponse<ChatNotificationResponseBody>>> cVar);
}
