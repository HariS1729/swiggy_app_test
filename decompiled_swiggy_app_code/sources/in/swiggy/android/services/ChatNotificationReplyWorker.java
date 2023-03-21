package in.swiggy.android.services;

import android.app.Notification;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.e;
import d4.a;
import d4.n;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.commons.utils.IDispatchProvider;
import in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager;
import in.swiggy.android.tejas.feature.chatnotification.model.Body;
import in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationRequestBody;
import in.swiggy.android.tejas.feature.chatnotification.model.Message;
import in.swiggy.android.tejas.feature.chatnotification.model.Part;
import in.swiggy.android.tejas.feature.chatnotification.model.TYPE;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.NbaMetaDataType;
import in.swiggy.android.tejas.oldapi.models.usercomms.ChatNotificationEventData;
import in.swiggy.android.tejas.oldapi.models.usercomms.ChatSmartChoice;
import in.swiggy.android.utils.ChatNotificationUtils;
import ir.b;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import os.g0;
import wp0.j0;
import wp0.k1;

/* compiled from: ChatNotificationReplyWorker.kt */
public final class ChatNotificationReplyWorker extends CoroutineWorker implements IDispatchProvider {

    /* renamed from: o  reason: collision with root package name */
    public static final a f18571o = new a((i) null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f18572p = 8;
    /* access modifiers changed from: private */
    public static String q = "";
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static String f18573r = "";
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static String f18574s = "";
    /* access modifiers changed from: private */
    public static String t = "";
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static ChatSmartChoice f18575u;
    /* access modifiers changed from: private */
    public static String v = "";

    /* renamed from: i  reason: collision with root package name */
    private final ChatNotificationUtils f18576i;
    private final ChatNotificationApiManager j;
    private final b k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ IDispatchProvider f18577l = DispatchProviderKt.a();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public j0 f18578m;
    private k1 n;

    /* compiled from: ChatNotificationReplyWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(String str) {
            p.j(str, "<set-?>");
            ChatNotificationReplyWorker.t = str;
        }

        public final void b(String str) {
            p.j(str, "<set-?>");
            ChatNotificationReplyWorker.q = str;
        }

        public final void c(String str) {
            p.j(str, "<set-?>");
            ChatNotificationReplyWorker.f18574s = str;
        }

        public final void d(ChatSmartChoice chatSmartChoice) {
            ChatNotificationReplyWorker.f18575u = chatSmartChoice;
        }

        public final void e(String str) {
            p.j(str, "<set-?>");
            ChatNotificationReplyWorker.v = str;
        }

        public final void f(String str) {
            p.j(str, "<set-?>");
            ChatNotificationReplyWorker.f18573r = str;
        }

        public final void g(Context context, String str, String str2, String str3, String str4, ChatSmartChoice chatSmartChoice) {
            p.j(context, LogCategory.CONTEXT);
            p.j(str, NbaMetaDataType.CONVERSATION_ID);
            p.j(str2, "text");
            p.j(str3, "commsMessageId");
            b(str);
            f(str2);
            String uuid = UUID.randomUUID().toString();
            p.i(uuid, "randomUUID().toString()");
            c(uuid);
            a(str3);
            if (str4 == null) {
                str4 = "";
            }
            e(str4);
            d(chatSmartChoice);
            d4.a a11 = new a.C0116a().b(NetworkType.CONNECTED).a();
            p.i(a11, "Builder()\n              …                 .build()");
            e b11 = ((c.a) ((c.a) new c.a(ChatNotificationReplyWorker.class).e(a11)).f(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)).b();
            p.i(b11, "Builder(ChatNotification…                 .build()");
            n.k(context).i("ChatNotificationReplyWorker", ExistingWorkPolicy.REPLACE, (c) b11);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatNotificationReplyWorker(Context context, WorkerParameters workerParameters, ChatNotificationUtils chatNotificationUtils, ChatNotificationApiManager chatNotificationApiManager, b bVar) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(chatNotificationUtils, "chatNotificationUtils");
        p.j(chatNotificationApiManager, "chatNotifApi");
        p.j(bVar, "swiggyEventHandler");
        this.f18576i = chatNotificationUtils;
        this.j = chatNotificationApiManager;
        this.k = bVar;
    }

    private final d4.c X() {
        Notification b11 = this.f18576i.b();
        if (b11 == null) {
            return null;
        }
        return new d4.c(145, b11);
    }

    private final ChatNotificationRequestBody Y() {
        ArrayList arrayList = new ArrayList();
        ChatSmartChoice chatSmartChoice = f18575u;
        if (chatSmartChoice != null) {
            String enhancedText = chatSmartChoice.getEnhancedText();
            if (enhancedText != null) {
                if (enhancedText.length() > 0) {
                    f18573r = enhancedText;
                }
            }
            arrayList.add(new Part(TYPE.SMART_CHOICE.getType(), new Body((String) null, v, chatSmartChoice.getSelectionResponseId())));
        }
        arrayList.add(new Part(TYPE.TEXT.getType(), new Body(f18573r, (String) null, (String) null)));
        return new ChatNotificationRequestBody(new Message(arrayList));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8 A[Catch:{ Exception -> 0x00c8 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9 A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0 A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(fp0.c<? super bp0.k> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof in.swiggy.android.services.ChatNotificationReplyWorker$sendAPIRequest$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            in.swiggy.android.services.ChatNotificationReplyWorker$sendAPIRequest$1 r0 = (in.swiggy.android.services.ChatNotificationReplyWorker$sendAPIRequest$1) r0
            int r1 = r0.f18589e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18589e = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.services.ChatNotificationReplyWorker$sendAPIRequest$1 r0 = new in.swiggy.android.services.ChatNotificationReplyWorker$sendAPIRequest$1
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f18587c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18589e
            java.lang.String r3 = "ChatNotificationReplyWorker"
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005c
            if (r2 == r6) goto L_0x004d
            if (r2 == r5) goto L_0x0043
            if (r2 != r4) goto L_0x003b
            java.lang.Object r1 = r0.f18586b
            in.swiggy.android.services.ChatNotificationReplyWorker r1 = (in.swiggy.android.services.ChatNotificationReplyWorker) r1
            java.lang.Object r0 = r0.f18585a
            in.swiggy.android.services.ChatNotificationReplyWorker r0 = (in.swiggy.android.services.ChatNotificationReplyWorker) r0
            bp0.g.b(r10)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00ab
        L_0x003b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0043:
            java.lang.Object r2 = r0.f18585a
            in.swiggy.android.services.ChatNotificationReplyWorker r2 = (in.swiggy.android.services.ChatNotificationReplyWorker) r2
            bp0.g.b(r10)     // Catch:{ Exception -> 0x004b }
            goto L_0x008a
        L_0x004b:
            r10 = move-exception
            goto L_0x0087
        L_0x004d:
            java.lang.Object r2 = r0.f18586b
            in.swiggy.android.services.ChatNotificationReplyWorker r2 = (in.swiggy.android.services.ChatNotificationReplyWorker) r2
            java.lang.Object r8 = r0.f18585a
            in.swiggy.android.services.ChatNotificationReplyWorker r8 = (in.swiggy.android.services.ChatNotificationReplyWorker) r8
            bp0.g.b(r10)     // Catch:{ Exception -> 0x0059 }
            goto L_0x0074
        L_0x0059:
            r10 = move-exception
            r2 = r8
            goto L_0x0087
        L_0x005c:
            bp0.g.b(r10)
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00c8 }
            r2 = 26
            if (r10 < r2) goto L_0x00cc
            r0.f18585a = r9     // Catch:{ Exception -> 0x0085 }
            r0.f18586b = r9     // Catch:{ Exception -> 0x0085 }
            r0.f18589e = r6     // Catch:{ Exception -> 0x0085 }
            java.lang.Object r10 = r9.y(r0)     // Catch:{ Exception -> 0x0085 }
            if (r10 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r2 = r9
            r8 = r2
        L_0x0074:
            d4.c r10 = (d4.c) r10     // Catch:{ Exception -> 0x0059 }
            r0.f18585a = r8     // Catch:{ Exception -> 0x0059 }
            r0.f18586b = r7     // Catch:{ Exception -> 0x0059 }
            r0.f18589e = r5     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r10 = r2.C(r10, r0)     // Catch:{ Exception -> 0x0059 }
            if (r10 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r8
            goto L_0x008a
        L_0x0085:
            r10 = move-exception
            r2 = r9
        L_0x0087:
            os.u.h(r3, r10)     // Catch:{ Exception -> 0x00c8 }
        L_0x008a:
            wp0.k1 r10 = r2.n     // Catch:{ Exception -> 0x00c8 }
            if (r10 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            wp0.k1.a.a(r10, r7, r6, r7)     // Catch:{ Exception -> 0x00c8 }
        L_0x0092:
            in.swiggy.android.tejas.feature.chatnotification.ChatNotificationApiManager r10 = r2.j     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r5 = q     // Catch:{ Exception -> 0x00c8 }
            in.swiggy.android.tejas.feature.chatnotification.model.ChatNotificationRequestBody r6 = r2.Y()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r8 = f18574s     // Catch:{ Exception -> 0x00c8 }
            r0.f18585a = r2     // Catch:{ Exception -> 0x00c8 }
            r0.f18586b = r2     // Catch:{ Exception -> 0x00c8 }
            r0.f18589e = r4     // Catch:{ Exception -> 0x00c8 }
            java.lang.Object r10 = r10.sendChatNotificationReply(r5, r6, r8, r0)     // Catch:{ Exception -> 0x00c8 }
            if (r10 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r0 = r2
            r1 = r0
        L_0x00ab:
            kotlinx.coroutines.flow.d r10 = (kotlinx.coroutines.flow.d) r10     // Catch:{ Exception -> 0x00c8 }
            in.swiggy.android.services.ChatNotificationReplyWorker$sendAPIRequest$2 r2 = new in.swiggy.android.services.ChatNotificationReplyWorker$sendAPIRequest$2     // Catch:{ Exception -> 0x00c8 }
            r2.<init>(r0, r7)     // Catch:{ Exception -> 0x00c8 }
            kotlinx.coroutines.flow.d r10 = kotlinx.coroutines.flow.f.E(r10, r2)     // Catch:{ Exception -> 0x00c8 }
            wp0.j0 r0 = r0.f18578m     // Catch:{ Exception -> 0x00c8 }
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = "parentScope"
            kotlin.jvm.internal.p.B(r0)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00c1
        L_0x00c0:
            r7 = r0
        L_0x00c1:
            wp0.k1 r10 = kotlinx.coroutines.flow.f.B(r10, r7)     // Catch:{ Exception -> 0x00c8 }
            r1.n = r10     // Catch:{ Exception -> 0x00c8 }
            goto L_0x00cc
        L_0x00c8:
            r10 = move-exception
            os.u.h(r3, r10)
        L_0x00cc:
            bp0.k r10 = bp0.k.f22762a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.ChatNotificationReplyWorker.Z(fp0.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void a0(boolean z11) {
        String json = g0.i().toJson((Object) new ChatNotificationEventData(t, z11 ? 1 : 0));
        p.i(json, "getGson().toJson(\n      …              )\n        )");
        b bVar = this.k;
        bVar.j(bVar.k("notification", "click-decx-chat-reply-pn", f18574s, 9999, json));
    }

    public CoroutineDispatcher D() {
        return this.f18577l.D();
    }

    public wp0.g0 J() {
        return this.f18577l.J();
    }

    public CoroutineDispatcher R() {
        return this.f18577l.R();
    }

    public CoroutineDispatcher getDefault() {
        return this.f18577l.getDefault();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object w(fp0.c<? super androidx.work.ListenableWorker.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof in.swiggy.android.services.ChatNotificationReplyWorker$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            in.swiggy.android.services.ChatNotificationReplyWorker$doWork$1 r0 = (in.swiggy.android.services.ChatNotificationReplyWorker$doWork$1) r0
            int r1 = r0.f18581c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f18581c = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.services.ChatNotificationReplyWorker$doWork$1 r0 = new in.swiggy.android.services.ChatNotificationReplyWorker$doWork$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f18579a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f18581c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            bp0.g.b(r6)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            bp0.g.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = r5.D()
            in.swiggy.android.services.ChatNotificationReplyWorker$doWork$2 r2 = new in.swiggy.android.services.ChatNotificationReplyWorker$doWork$2
            r4 = 0
            r2.<init>(r5, r4)
            r0.f18581c = r3
            java.lang.Object r6 = wp0.h.g(r6, r2, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            java.lang.String r0 = "override suspend fun doW…failure()\n        }\n    }"
            kotlin.jvm.internal.p.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.ChatNotificationReplyWorker.w(fp0.c):java.lang.Object");
    }

    public Object y(fp0.c<? super d4.c> cVar) {
        d4.c X = X();
        return X == null ? new d4.c(145, this.f18576i.c(q, false)) : X;
    }
}
