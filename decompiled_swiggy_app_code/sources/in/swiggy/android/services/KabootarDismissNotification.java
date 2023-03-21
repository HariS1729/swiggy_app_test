package in.swiggy.android.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import d4.a;
import d4.n;
import ef0.e;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.SwiggyApplication;
import in.swiggy.android.components.AbstractWorker;
import in.swiggy.android.tejas.api.models.SwiggyBaseResponse;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import ir.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;
import pl0.v0;

/* compiled from: KabootarDismissNotification.kt */
public final class KabootarDismissNotification extends AbstractWorker {
    public static final a n = new a((i) null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f18644o = 8;
    private final e k;

    /* renamed from: l  reason: collision with root package name */
    public b f18645l;

    /* renamed from: m  reason: collision with root package name */
    public SharedPreferences f18646m;

    /* compiled from: KabootarDismissNotification.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(Context context, Bundle bundle) {
            p.j(context, LogCategory.CONTEXT);
            b.a aVar = new b.a();
            if (bundle != null) {
                aVar.g("metaInfo", bundle.getString("metaInfo"));
                aVar.g("landingActivity", bundle.getString("landingActivity"));
                aVar.g("notificationType", bundle.getString("notificationType"));
            }
            d4.a a11 = new a.C0116a().b(NetworkType.CONNECTED).a();
            p.i(a11, "Builder()\n              …\n                .build()");
            androidx.work.e b11 = ((c.a) ((c.a) new c.a(KabootarDismissNotification.class).e(a11)).h(aVar.a())).b();
            p.i(b11, "Builder(KabootarDismissN…\n                .build()");
            n.k(context).i("KabootarDismissNotification", ExistingWorkPolicy.REPLACE, (c) b11);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KabootarDismissNotification(Context context, WorkerParameters workerParameters, e eVar, IApiGeneratedService iApiGeneratedService) {
        super(context, workerParameters, iApiGeneratedService);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(iApiGeneratedService, "apiGeneratedService");
        this.k = eVar;
    }

    /* access modifiers changed from: private */
    public static final void F(SwiggyBaseResponse swiggyBaseResponse) {
        u.b("KabootarDismissNotification", "Job finished!");
    }

    /* access modifiers changed from: private */
    public static final void H(Throwable th2) {
        u.h("KabootarDismissNotification", th2);
    }

    public final SharedPreferences B() {
        SharedPreferences sharedPreferences = this.f18646m;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        p.B("sharedPreferences");
        return null;
    }

    public final ir.b C() {
        ir.b bVar = this.f18645l;
        if (bVar != null) {
            return bVar;
        }
        p.B("swiggyEventHandler");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(androidx.work.b r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r0 = "0"
            java.lang.String r3 = ""
            java.lang.String r4 = "data"
            kotlin.jvm.internal.p.j(r2, r4)
            java.lang.String r4 = "metaInfo"
            java.lang.String r4 = r2.k(r4)
            r5 = 0
            r7 = 0
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0074 }
            if (r8 != 0) goto L_0x006f
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0074 }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "campaignId"
            java.lang.String r4 = r8.optString(r4, r0)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r9 = "metaInfoJson.optString(KEY_CAMPAIGN_ID, \"0\")"
            kotlin.jvm.internal.p.i(r4, r9)     // Catch:{ Exception -> 0x0074 }
            long r9 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "templateId"
            java.lang.String r0 = r8.optString(r4, r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r4 = "metaInfoJson.optString(KEY_TEMPLATE_ID, \"0\")"
            kotlin.jvm.internal.p.i(r0, r4)     // Catch:{ Exception -> 0x0066 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = "messageId"
            java.lang.String r4 = r8.optString(r0, r3)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = "metaInfoJson.optString(KEY_MESSAGE_ID, \"\")"
            kotlin.jvm.internal.p.i(r4, r0)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r0 = "orderId"
            int r11 = r8.optInt(r0, r7)     // Catch:{ Exception -> 0x0064 }
            java.lang.String r0 = "tracking_url"
            java.lang.String r0 = r8.optString(r0, r3)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r8 = "metaInfoJson.optString(KEY_TRACKING_URL, \"\")"
            kotlin.jvm.internal.p.i(r0, r8)     // Catch:{ Exception -> 0x0062 }
            r13 = r0
            r18 = r5
            r5 = r9
            r8 = r18
            goto L_0x007e
        L_0x0062:
            r0 = move-exception
            goto L_0x0069
        L_0x0064:
            r0 = move-exception
            goto L_0x0068
        L_0x0066:
            r0 = move-exception
            r4 = r3
        L_0x0068:
            r11 = 0
        L_0x0069:
            r18 = r5
            r5 = r9
            r8 = r18
            goto L_0x0078
        L_0x006f:
            r4 = r3
            r13 = r4
            r8 = r5
            r11 = 0
            goto L_0x007e
        L_0x0074:
            r0 = move-exception
            r4 = r3
            r8 = r5
            r11 = 0
        L_0x0078:
            java.lang.String r10 = "KabootarDismissNotification"
            os.u.h(r10, r0)
            r13 = r3
        L_0x007e:
            java.lang.String r0 = "notificationType"
            java.lang.String r0 = r2.k(r0)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x00b7
            if (r0 != 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r3 = r0
        L_0x008e:
            java.lang.String r0 = "orderJobId"
            java.lang.String r0 = r2.k(r0)
            java.lang.String r10 = "NPS"
            boolean r10 = kotlin.jvm.internal.p.e(r3, r10)
            if (r10 == 0) goto L_0x00a6
            mf0.y r0 = mf0.y.f19750a
            ir.b r3 = r20.C()
            r0.b(r4, r11, r3)
            goto L_0x00b7
        L_0x00a6:
            java.lang.String r10 = "NI"
            boolean r3 = kotlin.jvm.internal.p.e(r3, r10)
            if (r3 == 0) goto L_0x00b7
            mf0.y r3 = mf0.y.f19750a
            ir.b r10 = r20.C()
            r3.d(r10, r0)
        L_0x00b7:
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x00be
            r7 = 1
        L_0x00be:
            if (r7 == 0) goto L_0x010b
            in.swiggy.android.tejas.oldapi.network.requests.PostableSPNSReport r14 = new in.swiggy.android.tejas.oldapi.network.requests.PostableSPNSReport
            r14.<init>()
            java.lang.String r0 = "DISMISSED"
            r14.setEventType(r0)
            java.lang.String r0 = "ANDROID"
            r14.setOS(r0)
            ef0.e r0 = r1.k
            java.lang.String r0 = r0.getCustomerId()
            r14.setUserID(r0)
            r14.setCampaignID(r5)
            r14.setMessageID(r4)
            r14.setTemplateID(r8)
            java.lang.String r0 = "PUSH_NOTIFICATION"
            r14.setCommType(r0)
            ef0.e r0 = r1.k
            java.lang.String r0 = r0.getDeviceId()
            r14.setDeviceID(r0)
            java.lang.String r0 = "landingActivity"
            java.lang.String r0 = r2.k(r0)
            r14.setmLandingActivity(r0)
            in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper r12 = r20.y()
            in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler r15 = new in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler
            mf0.u r0 = mf0.u.f26731a
            r2 = 0
            r15.<init>(r0, r2)
            mf0.t r16 = mf0.t.f26730a
            go0.a r17 = io0.a.f25306c
            r12.spnsReportPublish(r13, r14, r15, r16, r17)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.KabootarDismissNotification.E(androidx.work.b):void");
    }

    public ListenableWorker.a w() {
        ((SwiggyApplication) b()).I().o0(this);
        u.b("KabootarDismissNotification", "KabootarDismissNotification inited");
        v0.f22482a.f(getContext(), C(), B(), g().k("metaInfo"));
        androidx.work.b g11 = g();
        p.i(g11, "inputData");
        E(g11);
        ListenableWorker.a c11 = ListenableWorker.a.c();
        p.i(c11, "success()");
        return c11;
    }
}
