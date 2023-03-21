package in.swiggy.android.tejas.feature.chathead.api;

import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import kotlinx.coroutines.flow.d;
import retrofit2.Response;
import retrofit2.http.GET;

/* compiled from: IChatApi.kt */
public interface IChatApi {
    public static final String CHAT_API = "/api/v3/help/conversations?conversationStatus=open";
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: IChatApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String CHAT_API = "/api/v3/help/conversations?conversationStatus=open";

        private Companion() {
        }
    }

    @GET("/api/v3/help/conversations?conversationStatus=open")
    d<Response<SwiggyApiResponse<ChatHeadResponse>>> getChatDetails();
}
