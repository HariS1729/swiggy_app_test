package in.swiggy.android.services;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.j;
import com.google.gson.reflect.TypeToken;
import com.rudderstack.android.sdk.core.ecomm.ECommerceEvents;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.R;
import in.swiggy.android.activities.HomeActivity;
import in.swiggy.android.commons.extension.StringExtensionsKt;
import in.swiggy.android.components.AbstractSwiggyBaseService;
import in.swiggy.android.receiver.DismissTrackNotification;
import in.swiggy.android.receiver.NetworkChangeReceiver;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import in.swiggy.android.tejas.oldapi.network.responses.handlers.TrackCafeOrderResponseHandler;
import in.swiggy.android.tejas.oldapi.network.responses.track.TrackCafeOrderResponseData;
import in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderConfiguration;
import in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData;
import in.swiggy.android.track.activities.TrackOrderActivity;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mf0.p0;
import mf0.q0;
import mf0.r0;
import mf0.s0;
import ms.f;
import os.g0;
import os.u;

/* compiled from: TrackNotificationService.kt */
public final class TrackNotificationService extends AbstractSwiggyBaseService {

    /* renamed from: l  reason: collision with root package name */
    public static final a f18680l = new a((i) null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f18681m = 8;
    /* access modifiers changed from: private */
    public static final String n;

    /* renamed from: o  reason: collision with root package name */
    private static final String f18682o;

    /* renamed from: d  reason: collision with root package name */
    public SharedPreferences f18683d;

    /* renamed from: e  reason: collision with root package name */
    public bl0.b f18684e;

    /* renamed from: f  reason: collision with root package name */
    private eo0.a f18685f = new eo0.a();

    /* renamed from: g  reason: collision with root package name */
    private eo0.b f18686g;

    /* renamed from: h  reason: collision with root package name */
    private int f18687h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Order f18688i;
    private BroadcastReceiver j;
    private String k;

    /* compiled from: TrackNotificationService.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        private final boolean e(Context context) {
            try {
                Object systemService = context.getSystemService("activity");
                if (systemService != null) {
                    for (ActivityManager.RunningServiceInfo next : ((ActivityManager) systemService).getRunningServices(50)) {
                        String g11 = TrackNotificationService.n;
                        u.b(g11, "service = " + next.service.getClassName() + ", " + TrackNotificationService.class.getName());
                        if (p.e(next.service.getClassName(), TrackNotificationService.class.getName()) && next.foreground) {
                            u.b(TrackNotificationService.n, p.s("foreground = ", Boolean.valueOf(next.foreground)));
                            return true;
                        }
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            } catch (Throwable th2) {
                u.h(TrackNotificationService.n, th2);
                return false;
            }
        }

        /* access modifiers changed from: private */
        public final Notification f(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse, boolean z11, PendingIntent pendingIntent, Context context, NotificationManager notificationManager) {
            j.d dVar = new j.d();
            dVar.x(h(swiggyApiResponse, context));
            String str = "#F15700";
            String string = j3.b.a(context).getString("pn_small_icon_bg_color", str);
            if (string != null) {
                str = string;
            }
            j.f s11 = new j.f(context).y(Color.parseColor(str)).a0(R.drawable.swiggy_notification_white).N(g(swiggyApiResponse, context)).D(i(swiggyApiResponse, context)).C(h(swiggyApiResponse, context)).f0(dVar).Z(false).S(false).s(true);
            p.i(s11, "Builder(context)\n       …     .setAutoCancel(true)");
            s11.B(pendingIntent);
            Intent intent = new Intent(context, DismissTrackNotification.class);
            int i11 = Build.VERSION.SDK_INT;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 10, intent, i11 >= 31 ? 167772160 : 134217728);
            j.b.a aVar = new j.b.a((int) R.drawable.notification_close_black, (CharSequence) "Dismiss", broadcast);
            if (i11 >= 26) {
                String string2 = context.getResources().getString(R.string.track_notification_channel);
                p.i(string2, "context.resources.getStr…ack_notification_channel)");
                String string3 = context.getResources().getString(R.string.track_notification_channel_description);
                p.i(string3, "context.resources.getStr…tion_channel_description)");
                String string4 = context.getResources().getString(R.string.track_notification_channel_id);
                p.i(string4, "context.resources.getStr…_notification_channel_id)");
                NotificationChannel notificationChannel = new NotificationChannel(string4, string2, 3);
                notificationChannel.setDescription(string3);
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
                notificationChannel.enableVibration(false);
                notificationManager.createNotificationChannel(notificationChannel);
                s11.w(string4);
            }
            s11.H(broadcast);
            s11.b(aVar.b());
            Notification g11 = s11.g();
            p.i(g11, "builder.build()");
            return g11;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v29 */
        /* JADX WARNING: type inference failed for: r1v30 */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
            if (r2 != false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
            r2 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r18.getData();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.graphics.Bitmap g(in.swiggy.android.tejas.api.models.SwiggyApiResponse<? extends in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData> r18, android.content.Context r19) {
            /*
                r17 = this;
                r0 = r19
                r1 = 0
                if (r18 != 0) goto L_0x0007
            L_0x0005:
                r2 = r1
                goto L_0x0016
            L_0x0007:
                java.lang.Object r2 = r18.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r2 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r2
                if (r2 != 0) goto L_0x0010
                goto L_0x0005
            L_0x0010:
                boolean r2 = r2.mShowETA
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            L_0x0016:
                boolean r2 = js.c.e(r2)
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L_0x004a
                if (r18 != 0) goto L_0x0022
            L_0x0020:
                r2 = r1
                goto L_0x002d
            L_0x0022:
                java.lang.Object r2 = r18.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r2 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r2
                if (r2 != 0) goto L_0x002b
                goto L_0x0020
            L_0x002b:
                java.lang.String r2 = r2.mExpectedTime
            L_0x002d:
                if (r2 == 0) goto L_0x004a
                if (r18 != 0) goto L_0x0033
            L_0x0031:
                r2 = 0
                goto L_0x0048
            L_0x0033:
                java.lang.Object r2 = r18.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r2 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r2
                if (r2 != 0) goto L_0x003c
                goto L_0x0031
            L_0x003c:
                java.lang.String r2 = r2.mExpectedTime
                if (r2 != 0) goto L_0x0041
                goto L_0x0031
            L_0x0041:
                int r2 = js.c.v(r2, r4, r3, r1)
                if (r2 != 0) goto L_0x0031
                r2 = 1
            L_0x0048:
                if (r2 == 0) goto L_0x0170
            L_0x004a:
                if (r18 != 0) goto L_0x004e
            L_0x004c:
                r2 = r1
                goto L_0x0059
            L_0x004e:
                java.lang.Object r2 = r18.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r2 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r2
                if (r2 != 0) goto L_0x0057
                goto L_0x004c
            L_0x0057:
                java.lang.String r2 = r2.mPosition
            L_0x0059:
                java.lang.String r5 = "decodeResource(context.r…e.notification_cancelled)"
                r6 = 2131232410(0x7f08069a, float:1.8080928E38)
                java.lang.String r7 = "decodeResource(context.r…able.notification_swiggy)"
                r8 = 2131232420(0x7f0806a4, float:1.8080949E38)
                r9 = 9
                java.lang.String r10 = "decodeResource(context.r…e.notification_delivered)"
                r11 = 2131232415(0x7f08069f, float:1.8080939E38)
                r12 = 8
                if (r2 == 0) goto L_0x0114
                if (r18 != 0) goto L_0x0071
                goto L_0x007c
            L_0x0071:
                java.lang.Object r2 = r18.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r2 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r2
                if (r2 != 0) goto L_0x007a
                goto L_0x007c
            L_0x007a:
                java.lang.String r1 = r2.mPosition
            L_0x007c:
                if (r1 == 0) goto L_0x00d0
                int r2 = r1.hashCode()
                java.lang.String r13 = "decodeResource(\n        …                        )"
                switch(r2) {
                    case 49: goto L_0x00b8;
                    case 50: goto L_0x00a0;
                    case 51: goto L_0x0088;
                    default: goto L_0x0087;
                }
            L_0x0087:
                goto L_0x00d0
            L_0x0088:
                java.lang.String r2 = "3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0091
                goto L_0x00d0
            L_0x0091:
                android.content.res.Resources r0 = r19.getResources()
                r1 = 2131232418(0x7f0806a2, float:1.8080945E38)
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
                kotlin.jvm.internal.p.i(r0, r13)
                return r0
            L_0x00a0:
                java.lang.String r2 = "2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a9
                goto L_0x00d0
            L_0x00a9:
                android.content.res.Resources r0 = r19.getResources()
                r1 = 2131232414(0x7f08069e, float:1.8080937E38)
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
                kotlin.jvm.internal.p.i(r0, r13)
                return r0
            L_0x00b8:
                java.lang.String r2 = "1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c1
                goto L_0x00d0
            L_0x00c1:
                android.content.res.Resources r0 = r19.getResources()
                r1 = 2131232419(0x7f0806a3, float:1.8080947E38)
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
                kotlin.jvm.internal.p.i(r0, r13)
                return r0
            L_0x00d0:
                boolean r1 = r18.isResponseOk()
                if (r1 != 0) goto L_0x0170
                java.lang.Integer r1 = r18.getStatusCode()
                if (r1 != 0) goto L_0x00dd
                goto L_0x00ef
            L_0x00dd:
                int r1 = r1.intValue()
                if (r1 != r12) goto L_0x00ef
                android.content.res.Resources r0 = r19.getResources()
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r11)
                kotlin.jvm.internal.p.i(r0, r10)
                goto L_0x0113
            L_0x00ef:
                java.lang.Integer r1 = r18.getStatusCode()
                if (r1 != 0) goto L_0x00f6
                goto L_0x0108
            L_0x00f6:
                int r1 = r1.intValue()
                if (r1 != r9) goto L_0x0108
                android.content.res.Resources r0 = r19.getResources()
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r6)
                kotlin.jvm.internal.p.i(r0, r5)
                goto L_0x0113
            L_0x0108:
                android.content.res.Resources r0 = r19.getResources()
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r8)
                kotlin.jvm.internal.p.i(r0, r7)
            L_0x0113:
                return r0
            L_0x0114:
                if (r18 != 0) goto L_0x0117
                goto L_0x011f
            L_0x0117:
                boolean r1 = r18.isResponseOk()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            L_0x011f:
                boolean r1 = js.c.h(r1)
                if (r1 != 0) goto L_0x0170
                if (r18 != 0) goto L_0x0129
            L_0x0127:
                r1 = 0
                goto L_0x0137
            L_0x0129:
                java.lang.Integer r1 = r18.getStatusCode()
                if (r1 != 0) goto L_0x0130
                goto L_0x0127
            L_0x0130:
                int r1 = r1.intValue()
                if (r1 != r12) goto L_0x0127
                r1 = 1
            L_0x0137:
                if (r1 == 0) goto L_0x0145
                android.content.res.Resources r0 = r19.getResources()
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r11)
                kotlin.jvm.internal.p.i(r0, r10)
                goto L_0x016f
            L_0x0145:
                if (r18 != 0) goto L_0x0149
            L_0x0147:
                r3 = 0
                goto L_0x0156
            L_0x0149:
                java.lang.Integer r1 = r18.getStatusCode()
                if (r1 != 0) goto L_0x0150
                goto L_0x0147
            L_0x0150:
                int r1 = r1.intValue()
                if (r1 != r9) goto L_0x0147
            L_0x0156:
                if (r3 == 0) goto L_0x0164
                android.content.res.Resources r0 = r19.getResources()
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r6)
                kotlin.jvm.internal.p.i(r0, r5)
                goto L_0x016f
            L_0x0164:
                android.content.res.Resources r0 = r19.getResources()
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r8)
                kotlin.jvm.internal.p.i(r0, r7)
            L_0x016f:
                return r0
            L_0x0170:
                android.graphics.Paint r1 = new android.graphics.Paint
                r1.<init>()
                android.graphics.Paint r2 = new android.graphics.Paint
                r2.<init>()
                android.graphics.Paint r5 = new android.graphics.Paint
                r5.<init>()
                java.lang.String r6 = "-"
                if (r18 != 0) goto L_0x0184
                goto L_0x0193
            L_0x0184:
                java.lang.Object r7 = r18.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r7 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r7
                if (r7 != 0) goto L_0x018d
                goto L_0x0193
            L_0x018d:
                java.lang.String r7 = r7.mExpectedTime
                if (r7 != 0) goto L_0x0192
                goto L_0x0193
            L_0x0192:
                r6 = r7
            L_0x0193:
                java.lang.String r7 = "Mins"
                r8 = 2131100860(0x7f0604bc, float:1.7814113E38)
                int r9 = androidx.core.content.a.c(r0, r8)
                r1.setColor(r9)
                android.content.res.Resources r9 = r19.getResources()
                r10 = 2131166304(0x7f070460, float:1.794685E38)
                float r9 = r9.getDimension(r10)
                r1.setTextSize(r9)
                r1.setAntiAlias(r3)
                android.graphics.Paint$Align r9 = android.graphics.Paint.Align.CENTER
                r1.setTextAlign(r9)
                android.graphics.Rect r9 = new android.graphics.Rect
                r9.<init>()
                int r10 = r6.length()
                r1.getTextBounds(r6, r4, r10, r9)
                int r8 = androidx.core.content.a.c(r0, r8)
                r2.setColor(r8)
                android.content.res.Resources r8 = r19.getResources()
                r9 = 2131166298(0x7f07045a, float:1.7946837E38)
                float r8 = r8.getDimension(r9)
                r2.setTextSize(r8)
                r2.setAntiAlias(r3)
                android.graphics.Paint$Align r8 = android.graphics.Paint.Align.CENTER
                r2.setTextAlign(r8)
                android.graphics.Rect r8 = new android.graphics.Rect
                r8.<init>()
                r9 = 4
                r2.getTextBounds(r7, r4, r9, r8)
                r4 = 2131100859(0x7f0604bb, float:1.7814111E38)
                int r4 = androidx.core.content.a.c(r0, r4)
                r5.setColor(r4)
                r5.setAntiAlias(r3)
                android.content.res.Resources r3 = r19.getResources()
                r4 = 17104901(0x1050005, float:2.4428256E-38)
                float r3 = r3.getDimension(r4)
                int r3 = (int) r3
                android.content.res.Resources r0 = r19.getResources()
                r4 = 17104902(0x1050006, float:2.442826E-38)
                float r0 = r0.getDimension(r4)
                int r0 = (int) r0
                android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r0, r4)
                android.graphics.Canvas r8 = new android.graphics.Canvas
                r8.<init>(r4)
                r9 = 2
                int r0 = r0 / r9
                float r0 = (float) r0
                int r3 = r3 / r9
                float r3 = (float) r3
                r8.drawCircle(r0, r3, r3, r5)
                int r0 = r8.getWidth()
                int r0 = r0 / r9
                int r3 = r8.getHeight()
                int r3 = r3 / r9
                float r3 = (float) r3
                float r5 = r1.descent()
                float r10 = r1.ascent()
                float r5 = r5 + r10
                float r10 = (float) r9
                float r5 = r5 / r10
                float r3 = r3 - r5
                double r11 = (double) r3
                float r3 = r2.descent()
                float r5 = r2.ascent()
                float r3 = r3 + r5
                double r13 = (double) r3
                r15 = 4609434218613702656(0x3ff8000000000000, double:1.5)
                double r13 = r13 / r15
                double r11 = r11 + r13
                int r3 = (int) r11
                float r0 = (float) r0
                float r3 = (float) r3
                r8.drawText(r6, r0, r3, r1)
                int r0 = r8.getWidth()
                int r0 = r0 / r9
                int r3 = r8.getHeight()
                int r3 = r3 / r9
                double r5 = (double) r3
                float r3 = r2.descent()
                float r9 = r2.ascent()
                float r3 = r3 + r9
                float r3 = r3 / r10
                double r9 = (double) r3
                float r3 = r1.descent()
                float r1 = r1.ascent()
                float r3 = r3 + r1
                double r11 = (double) r3
                double r11 = r11 / r15
                double r9 = r9 + r11
                double r5 = r5 - r9
                int r1 = (int) r5
                float r0 = (float) r0
                float r1 = (float) r1
                r8.drawText(r7, r0, r1, r2)
                java.lang.String r0 = "canvasBitmap"
                kotlin.jvm.internal.p.i(r4, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.TrackNotificationService.a.g(in.swiggy.android.tejas.api.models.SwiggyApiResponse, android.content.Context):android.graphics.Bitmap");
        }

        private final String h(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse, Context context) {
            String statusMessage;
            TrackOrderResponseData trackOrderResponseData;
            String str = null;
            if (!(swiggyApiResponse == null || (trackOrderResponseData = (TrackOrderResponseData) swiggyApiResponse.getData()) == null)) {
                str = trackOrderResponseData.mMessage;
            }
            if (!StringExtensionsKt.b(str)) {
                return str;
            }
            if (swiggyApiResponse == null || (statusMessage = swiggyApiResponse.getStatusMessage()) == null) {
                return "";
            }
            return statusMessage;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
            r1 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r4.getData();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.lang.String i(in.swiggy.android.tejas.api.models.SwiggyApiResponse<? extends in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData> r4, android.content.Context r5) {
            /*
                r3 = this;
                r0 = 0
                if (r4 != 0) goto L_0x0005
            L_0x0003:
                r1 = r0
                goto L_0x0010
            L_0x0005:
                java.lang.Object r1 = r4.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r1 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r1
                if (r1 != 0) goto L_0x000e
                goto L_0x0003
            L_0x000e:
                java.lang.String r1 = r1.mPositionText
            L_0x0010:
                boolean r2 = in.swiggy.android.commons.extension.StringExtensionsKt.b(r1)
                if (r2 == 0) goto L_0x003f
                if (r4 != 0) goto L_0x001a
            L_0x0018:
                r1 = r0
                goto L_0x003f
            L_0x001a:
                java.lang.Object r1 = r4.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r1 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r1
                if (r1 != 0) goto L_0x0023
                goto L_0x0018
            L_0x0023:
                java.util.Map<java.lang.String, in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData$OrderStateMeta> r1 = r1.orderStateSequence
                if (r1 != 0) goto L_0x0028
                goto L_0x0018
            L_0x0028:
                java.lang.Object r2 = r4.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r2 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r2
                if (r2 != 0) goto L_0x0032
                r2 = r0
                goto L_0x0034
            L_0x0032:
                java.lang.String r2 = r2.mPosition
            L_0x0034:
                java.lang.Object r1 = r1.get(r2)
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData$OrderStateMeta r1 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData.OrderStateMeta) r1
                if (r1 != 0) goto L_0x003d
                goto L_0x0018
            L_0x003d:
                java.lang.String r1 = r1.name
            L_0x003f:
                boolean r2 = in.swiggy.android.commons.extension.StringExtensionsKt.b(r1)
                if (r2 == 0) goto L_0x00d3
                if (r4 != 0) goto L_0x0048
                goto L_0x0053
            L_0x0048:
                java.lang.Object r4 = r4.getData()
                in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData r4 = (in.swiggy.android.tejas.oldapi.network.responses.track.TrackOrderResponseData) r4
                if (r4 != 0) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                java.lang.String r0 = r4.mPosition
            L_0x0053:
                if (r0 == 0) goto L_0x00c7
                int r4 = r0.hashCode()
                switch(r4) {
                    case 49: goto L_0x00b2;
                    case 50: goto L_0x009d;
                    case 51: goto L_0x0088;
                    case 52: goto L_0x0073;
                    case 53: goto L_0x005e;
                    default: goto L_0x005c;
                }
            L_0x005c:
                goto L_0x00c7
            L_0x005e:
                java.lang.String r4 = "5"
                boolean r4 = r0.equals(r4)
                if (r4 != 0) goto L_0x0067
                goto L_0x00c7
            L_0x0067:
                android.content.res.Resources r4 = r5.getResources()
                r5 = 2131953920(0x7f130900, float:1.9544325E38)
                java.lang.String r4 = r4.getString(r5)
                goto L_0x00d2
            L_0x0073:
                java.lang.String r4 = "4"
                boolean r4 = r0.equals(r4)
                if (r4 != 0) goto L_0x007c
                goto L_0x00c7
            L_0x007c:
                android.content.res.Resources r4 = r5.getResources()
                r5 = 2131953922(0x7f130902, float:1.9544329E38)
                java.lang.String r4 = r4.getString(r5)
                goto L_0x00d2
            L_0x0088:
                java.lang.String r4 = "3"
                boolean r4 = r0.equals(r4)
                if (r4 != 0) goto L_0x0091
                goto L_0x00c7
            L_0x0091:
                android.content.res.Resources r4 = r5.getResources()
                r5 = 2131953930(0x7f13090a, float:1.9544345E38)
                java.lang.String r4 = r4.getString(r5)
                goto L_0x00d2
            L_0x009d:
                java.lang.String r4 = "2"
                boolean r4 = r0.equals(r4)
                if (r4 != 0) goto L_0x00a6
                goto L_0x00c7
            L_0x00a6:
                android.content.res.Resources r4 = r5.getResources()
                r5 = 2131953921(0x7f130901, float:1.9544327E38)
                java.lang.String r4 = r4.getString(r5)
                goto L_0x00d2
            L_0x00b2:
                java.lang.String r4 = "1"
                boolean r4 = r0.equals(r4)
                if (r4 != 0) goto L_0x00bb
                goto L_0x00c7
            L_0x00bb:
                android.content.res.Resources r4 = r5.getResources()
                r5 = 2131953931(0x7f13090b, float:1.9544347E38)
                java.lang.String r4 = r4.getString(r5)
                goto L_0x00d2
            L_0x00c7:
                android.content.res.Resources r4 = r5.getResources()
                r5 = 2131953928(0x7f130908, float:1.954434E38)
                java.lang.String r4 = r4.getString(r5)
            L_0x00d2:
                r1 = r4
            L_0x00d3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.TrackNotificationService.a.i(in.swiggy.android.tejas.api.models.SwiggyApiResponse, android.content.Context):java.lang.String");
        }

        /* access modifiers changed from: private */
        public final void l(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse, Context context) {
            if (!j3.b.a(context).getBoolean("track_notification_dismissed", false)) {
                PendingIntent activity = PendingIntent.getActivity(context, 10, HomeActivity.l2(context), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
                SwiggyApiResponse swiggyApiResponse2 = new SwiggyApiResponse(new TrackOrderResponseData());
                if (!swiggyApiResponse.isResponseOk() && swiggyApiResponse.getData() == null) {
                    TrackOrderResponseData trackOrderResponseData = (TrackOrderResponseData) swiggyApiResponse.getData();
                    if (trackOrderResponseData != null) {
                        trackOrderResponseData.mMessage = swiggyApiResponse.getStatusMessage();
                    }
                    Integer statusCode = swiggyApiResponse.getStatusCode();
                    if (statusCode != null && statusCode.intValue() == 8) {
                        TrackOrderResponseData trackOrderResponseData2 = (TrackOrderResponseData) swiggyApiResponse.getData();
                        if (trackOrderResponseData2 != null) {
                            trackOrderResponseData2.mPositionText = "Order Delivered";
                        }
                    } else {
                        Integer statusCode2 = swiggyApiResponse.getStatusCode();
                        if (statusCode2 != null && statusCode2.intValue() == 9) {
                            TrackOrderResponseData trackOrderResponseData3 = (TrackOrderResponseData) swiggyApiResponse.getData();
                            if (trackOrderResponseData3 != null) {
                                trackOrderResponseData3.mPositionText = ECommerceEvents.ORDER_CANCELLED;
                            }
                        } else {
                            return;
                        }
                    }
                }
                p.i(activity, "notificationPendingIntent");
                m(swiggyApiResponse2, true, activity, context);
                j3.b.a(context).edit().putBoolean("track_notification_dismissed", true).apply();
                p(context);
            }
        }

        private final void m(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse, boolean z11, PendingIntent pendingIntent, Context context) {
            Object systemService = context.getSystemService("notification");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            notificationManager.notify(142, f(swiggyApiResponse, z11, pendingIntent, context, notificationManager));
        }

        /* access modifiers changed from: private */
        public final void p(Context context) {
            if (e(context)) {
                context.stopService(new Intent(context, TrackNotificationService.class));
            }
        }

        public final void d(Context context) {
            p.j(context, LogCategory.CONTEXT);
            Object systemService = context.getSystemService("notification");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(142);
        }

        public final void j(Context context) {
            p.j(context, LogCategory.CONTEXT);
            p(context);
            boolean z11 = j3.b.a(context).getBoolean("track_notification_dismissed", false);
            String string = j3.b.a(context).getString("latest-track_response", (String) null);
            String string2 = j3.b.a(context).getString("track_notification_order", (String) null);
            if (!z11 && !e(context) && string != null && string2 != null) {
                androidx.core.content.a.n(context, new Intent(context, TrackNotificationService.class));
            }
        }

        public final PendingIntent k(String str, Context context) {
            p.j(context, LogCategory.CONTEXT);
            Intent a11 = TrackOrderActivity.f20584o.a(context, str);
            a11.putExtra("launchSource", "ppn");
            PendingIntent activity = PendingIntent.getActivity(context, 10, a11, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            p.i(activity, "getActivity(\n           …tent, flags\n            )");
            return activity;
        }

        public final void n(SwiggyApiResponse<? extends TrackOrderResponseData> swiggyApiResponse, Order order, Context context) {
            p.j(swiggyApiResponse, "trackOrderResponse");
            p.j(context, LogCategory.CONTEXT);
            if (!j3.b.a(context).getBoolean("track_notification_dismissed", false)) {
                try {
                    if (!swiggyApiResponse.isResponseOk()) {
                        l(swiggyApiResponse, context);
                        return;
                    }
                    String json = g0.i().toJson((Object) order);
                    if (json != null && !StringExtensionsKt.b(json)) {
                        m(swiggyApiResponse, false, k(json, context), context);
                    }
                } catch (Exception e11) {
                    u.h(TrackNotificationService.n, e11);
                }
            }
        }

        public final void o(Context context) {
            p.j(context, LogCategory.CONTEXT);
            d(context);
            p(context);
        }
    }

    /* compiled from: TrackNotificationService.kt */
    public static final class b extends TrackCafeOrderResponseHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TrackNotificationService f18689a;

        b(TrackNotificationService trackNotificationService) {
            this.f18689a = trackNotificationService;
        }

        public void handleOnSuccess(SwiggyApiResponse<TrackCafeOrderResponseData> swiggyApiResponse) {
            p.j(swiggyApiResponse, "trackOrderResponse");
            this.f18689a.n().handleOnSuccess(swiggyApiResponse);
        }

        public void onComplete(SwiggyApiResponse<TrackCafeOrderResponseData> swiggyApiResponse) {
            p.j(swiggyApiResponse, "response");
            this.f18689a.n().onComplete(swiggyApiResponse);
        }

        public void onOrderCanceled(SwiggyApiResponse<TrackCafeOrderResponseData> swiggyApiResponse) {
            p.j(swiggyApiResponse, "trackOrderResponse");
            this.f18689a.n().onOrderCanceled(swiggyApiResponse);
        }

        public void onOrderDelivered(SwiggyApiResponse<TrackCafeOrderResponseData> swiggyApiResponse) {
            p.j(swiggyApiResponse, "trackOrderResponse");
            this.f18689a.n().onOrderDelivered(swiggyApiResponse);
        }

        public void onOtherErrors(SwiggyApiResponse<TrackCafeOrderResponseData> swiggyApiResponse) {
            p.j(swiggyApiResponse, "trackOrderResponse");
            this.f18689a.n().onOtherErrors(swiggyApiResponse);
        }
    }

    /* compiled from: KotlinExtensions.kt */
    public static final class c extends TypeToken<SwiggyApiResponse<TrackOrderResponseData>> {
    }

    static {
        String simpleName = TrackNotificationService.class.getSimpleName();
        n = simpleName;
        f18682o = p.s(simpleName, ".destroyed");
    }

    public static final void A(Context context) {
        f18680l.o(context);
    }

    private final TrackCafeOrderResponseHandler m() {
        return new b(this);
    }

    /* access modifiers changed from: private */
    public final TrackNotificationService$getTrackOrderResponseHandler$1 n() {
        return new TrackNotificationService$getTrackOrderResponseHandler$1(this);
    }

    /* access modifiers changed from: private */
    public final void q(TrackOrderResponseData trackOrderResponseData) {
        TrackOrderConfiguration trackOrderConfiguration = trackOrderResponseData.mTrackOrderConfiguration;
        int i11 = (trackOrderConfiguration == null ? 0 : trackOrderConfiguration.pollingTimeBeforePickedUpInSecs) * 1000;
        if (i11 > 0 && this.f18687h != i11) {
            this.f18687h = i11;
            this.f18685f.c(f.k(new TrackNotificationService$handlePollingIntervalChange$1(this), 5, TimeUnit.SECONDS));
        }
    }

    public static final void r(Context context) {
        f18680l.j(context);
    }

    /* access modifiers changed from: private */
    public final void u(Order order) {
        z();
        if (order != null) {
            if (js.c.h(Boolean.valueOf(order.isSelfPickup()))) {
                this.f18686g = a().getCafeTrackedOrderPolling(order.mOrderId, this.f18687h, m(), r0.f26728a, q0.f26727a);
            } else {
                this.f18686g = a().getTrackedOrderPolling(order.mOrderId, this.f18687h, n(), s0.f26729a, p0.f26726a);
            }
            eo0.b bVar = this.f18686g;
            if (bVar != null) {
                this.f18685f.c(bVar);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void v(Throwable th2) {
        u.h(n, th2);
    }

    /* access modifiers changed from: private */
    public static final void w() {
    }

    /* access modifiers changed from: private */
    public static final void x(Throwable th2) {
        u.h(n, th2);
    }

    /* access modifiers changed from: private */
    public static final void y() {
    }

    /* access modifiers changed from: private */
    public final void z() {
        eo0.b bVar = this.f18686g;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final SharedPreferences l() {
        SharedPreferences sharedPreferences = this.f18683d;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        p.B("sharedPreferences");
        return null;
    }

    public final bl0.b o() {
        bl0.b bVar = this.f18684e;
        if (bVar != null) {
            return bVar;
        }
        p.B("trackService");
        return null;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: in.swiggy.android.tejas.api.models.SwiggyApiResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: in.swiggy.android.tejas.api.models.SwiggyApiResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: in.swiggy.android.tejas.api.models.SwiggyApiResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: in.swiggy.android.tejas.api.models.SwiggyApiResponse} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r10 = this;
            super.onCreate()
            android.content.Context r0 = r10.getApplicationContext()
            java.lang.String r1 = "null cannot be cast to non-null type in.swiggy.android.SwiggyApplication"
            java.util.Objects.requireNonNull(r0, r1)
            in.swiggy.android.SwiggyApplication r0 = (in.swiggy.android.SwiggyApplication) r0
            yw.i1 r0 = r0.P
            r0.Z(r10)
            android.content.SharedPreferences r0 = r10.l()
            java.lang.String r1 = "track_notification_order"
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            r10.k = r0
            in.swiggy.android.tejas.oldapi.models.order.Order r0 = in.swiggy.android.tejas.oldapi.models.order.Order.fromJson(r0)
            r10.f18688i = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x009e
            android.content.Context r0 = r10.getContext()
            android.content.SharedPreferences r0 = j3.b.a(r0)
            java.lang.String r1 = "latest-track_response"
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x003d
            goto L_0x005c
        L_0x003d:
            com.google.gson.Gson r1 = os.g0.j()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "getGsonBinaryBooleanSerializer()"
            kotlin.jvm.internal.p.i(r1, r3)     // Catch:{ all -> 0x0054 }
            in.swiggy.android.services.TrackNotificationService$c r3 = new in.swiggy.android.services.TrackNotificationService$c     // Catch:{ all -> 0x0054 }
            r3.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ all -> 0x0054 }
            java.lang.Object r2 = r1.fromJson((java.lang.String) r0, (java.lang.reflect.Type) r3)     // Catch:{ all -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r0 = move-exception
            java.lang.String r1 = "Extension"
            os.u.h(r1, r0)
        L_0x005a:
            in.swiggy.android.tejas.api.models.SwiggyApiResponse r2 = (in.swiggy.android.tejas.api.models.SwiggyApiResponse) r2
        L_0x005c:
            android.content.Context r0 = r10.getContext()
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.app.NotificationManager"
            java.util.Objects.requireNonNull(r0, r1)
            r8 = r0
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            r0 = 142(0x8e, float:1.99E-43)
            in.swiggy.android.services.TrackNotificationService$a r1 = f18680l
            r5 = 0
            java.lang.String r3 = r10.k
            android.content.Context r4 = r10.getContext()
            java.lang.String r9 = "context"
            kotlin.jvm.internal.p.i(r4, r9)
            android.app.PendingIntent r6 = r1.k(r3, r4)
            android.content.Context r7 = r10.getContext()
            kotlin.jvm.internal.p.i(r7, r9)
            r3 = r1
            r4 = r2
            android.app.Notification r3 = r3.f(r4, r5, r6, r7, r8)
            r10.startForeground(r0, r3)
            if (r2 != 0) goto L_0x009e
            android.content.Context r0 = r10.getContext()
            kotlin.jvm.internal.p.i(r0, r9)
            r1.p(r0)
        L_0x009e:
            in.swiggy.android.services.TrackNotificationService$onCreate$1 r0 = new in.swiggy.android.services.TrackNotificationService$onCreate$1
            r0.<init>(r10)
            r10.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.TrackNotificationService.onCreate():void");
    }

    public void onDestroy() {
        super.onDestroy();
        z();
        this.f18685f.dispose();
        BroadcastReceiver broadcastReceiver = this.j;
        if (broadcastReceiver != null) {
            h3.a.b(getContext()).e(broadcastReceiver);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
    }

    public int onStartCommand(Intent intent, int i11, int i12) {
        try {
            this.f18687h = js.c.v(l().getString("android_consumer_track_order_poll", "10000"), 0, 1, (Object) null);
            String str = this.k;
            if (str != null) {
                if (!StringExtensionsKt.b(str)) {
                    this.f18688i = Order.fromJson(str);
                } else {
                    o().b();
                }
            }
            if (this.f18688i != null) {
                this.f18685f.c(f.i(new TrackNotificationService$onStartCommand$2(this), 3600000, TimeUnit.MILLISECONDS));
                u(this.f18688i);
                BroadcastReceiver broadcastReceiver = this.j;
                if (broadcastReceiver != null) {
                    h3.a.b(getContext()).c(broadcastReceiver, new IntentFilter(NetworkChangeReceiver.f18517b));
                }
            }
        } catch (Throwable th2) {
            u.h(n, th2);
        }
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        o().b();
    }
}
