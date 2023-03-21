package in.swiggy.android.tejas.feature.chatnotification;

import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.chatnotification.api.IChatNotificationApi;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: ChatNotificationApiManager.kt */
public final class ChatNotificationApiManager {
    private final IChatNotificationApi chatNotificationApi;
    private final ITransformer<Throwable, Error> exceptionTransformer;

    public ChatNotificationApiManager(IChatNotificationApi iChatNotificationApi, ITransformer<Throwable, Error> iTransformer) {
        p.j(iChatNotificationApi, "chatNotificationApi");
        p.j(iTransformer, "exceptionTransformer");
        this.chatNotificationApi = iChatNotificationApi;
        this.exceptionTransformer = iTransformer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: in.swiggy.android.tejas.error.Error} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: in.swiggy.android.tejas.error.Error$UnhandledError} */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object sendChatNotificationReply(java.lang.String r9, in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationRequestBody r10, java.lang.String r11, fp0.c<? super kotlinx.coroutines.flow.d<? extends in.swiggy.android.tejas.Response<in.swiggy.android.tejas.api.models.SwiggyApiResponse<in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationResponseBody>>>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager$sendChatNotificationReply$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager$sendChatNotificationReply$1 r0 = (in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager$sendChatNotificationReply$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager$sendChatNotificationReply$1 r0 = new in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager$sendChatNotificationReply$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r9 = r0.L$0
            in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager r9 = (in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager) r9
            bp0.g.b(r12)     // Catch:{ Exception -> 0x002d }
            goto L_0x0048
        L_0x002d:
            r10 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            bp0.g.b(r12)
            in.swiggy.android.tejas.feature.chatnotification.api.IChatNotificationApi r12 = r8.chatNotificationApi     // Catch:{ Exception -> 0x0051 }
            r0.L$0 = r8     // Catch:{ Exception -> 0x0051 }
            r0.label = r3     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r12 = r12.sendChatMessageApi(r9, r11, r10, r0)     // Catch:{ Exception -> 0x0051 }
            if (r12 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r9 = r8
        L_0x0048:
            retrofit2.Response r12 = (retrofit2.Response) r12     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.ResponseTransformerManager r10 = in.swiggy.android.tejas.ResponseTransformerManager.INSTANCE     // Catch:{ Exception -> 0x002d }
            in.swiggy.android.tejas.Response r9 = r10.handleResponse(r12)     // Catch:{ Exception -> 0x002d }
            goto L_0x007b
        L_0x0051:
            r10 = move-exception
            r9 = r8
        L_0x0053:
            in.swiggy.android.tejas.Response$Failure r11 = new in.swiggy.android.tejas.Response$Failure
            in.swiggy.android.tejas.transformer.ITransformer<java.lang.Throwable, in.swiggy.android.tejas.error.Error> r9 = r9.exceptionTransformer
            java.lang.Object r9 = r9.transform(r10)
            in.swiggy.android.tejas.error.Error r9 = (in.swiggy.android.tejas.error.Error) r9
            if (r9 != 0) goto L_0x006e
            in.swiggy.android.tejas.error.Error$UnhandledError r9 = new in.swiggy.android.tejas.error.Error$UnhandledError
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            java.lang.String r1 = "unsuccessful_response"
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x006e:
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = r11
        L_0x007b:
            kotlinx.coroutines.flow.d r9 = kotlinx.coroutines.flow.f.y(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager.sendChatNotificationReply(java.lang.String, in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationRequestBody, java.lang.String, fp0.c):java.lang.Object");
    }
}
