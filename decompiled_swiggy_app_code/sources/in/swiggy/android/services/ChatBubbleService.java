package in.swiggy.android.services;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.SwiggyApplication;
import in.swiggy.android.feature.chatbubble.FloatingBubbleService;
import in.swiggy.android.reactnative.minis.MinisActivity;
import in.swiggy.android.swiggylynx.ui.LynxActivity;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.chathead.models.Aggregation;
import in.swiggy.android.tejas.feature.chathead.models.ChatHeadResponse;
import in.swiggy.android.tejas.feature.chathead.models.Conversations;
import in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import ir.b;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mf0.c;
import mf0.d;
import os.g0;
import os.u;
import xs.b;

/* compiled from: ChatBubbleService.kt */
public final class ChatBubbleService extends FloatingBubbleService {
    public static final a C = new a((i) null);
    public static final int D = 8;
    /* access modifiers changed from: private */
    public static ISwiggyNetworkWrapper E;
    /* access modifiers changed from: private */
    public static SharedPreferences F;
    public p90.a A;
    public b B;

    /* renamed from: u  reason: collision with root package name */
    private int f18566u;
    private int v;

    /* renamed from: w  reason: collision with root package name */
    private String f18567w;

    /* renamed from: x  reason: collision with root package name */
    private String f18568x = "";

    /* renamed from: y  reason: collision with root package name */
    private String f18569y = "support";

    /* renamed from: z  reason: collision with root package name */
    private String f18570z = "";

    /* compiled from: ChatBubbleService.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final void g(Context context, SwiggyApiResponse swiggyApiResponse) {
            List<Aggregation> list;
            SharedPreferences.Editor edit;
            SharedPreferences.Editor putString;
            p.j(context, "$context");
            a aVar = ChatBubbleService.C;
            ChatHeadResponse chatHeadResponse = (ChatHeadResponse) swiggyApiResponse.getData();
            if (chatHeadResponse == null) {
                list = null;
            } else {
                list = chatHeadResponse.getAggregation();
            }
            k20.a.i(list);
            SharedPreferences q = ChatBubbleService.F;
            if (!(q == null || (edit = q.edit()) == null || (putString = edit.putString("multi_chat_data", g0.i().toJson((Object) k20.a.b()))) == null)) {
                putString.apply();
            }
            if (Build.VERSION.SDK_INT >= 23 && Settings.canDrawOverlays(context)) {
                aVar.l(context);
            }
        }

        /* access modifiers changed from: private */
        public static final void h(SwiggyApiResponse swiggyApiResponse) {
            p.j(swiggyApiResponse, "response");
        }

        /* access modifiers changed from: private */
        public static final void i(Throwable th2) {
            u.h("ChatBubbleService", th2);
        }

        /* access modifiers changed from: private */
        public static final void j() {
        }

        public final void e() {
            ISwiggyNetworkWrapper p11 = ChatBubbleService.E;
            if (p11 != null) {
                p11.purge();
            }
            ChatBubbleService.E = null;
            ChatBubbleService.F = null;
        }

        public final void f(Context context) {
            p.j(context, LogCategory.CONTEXT);
            ISwiggyNetworkWrapper p11 = ChatBubbleService.E;
            if (p11 != null) {
                p11.getChatConversations("open", new SwiggyBaseResponseHandler(new c(context), d.f26719a), mf0.b.f26717a, mf0.a.f26716a);
            }
        }

        public final void k(ISwiggyNetworkWrapper iSwiggyNetworkWrapper, SharedPreferences sharedPreferences) {
            p.j(iSwiggyNetworkWrapper, "networkWrapper");
            p.j(sharedPreferences, "sharedPreferences");
            ChatBubbleService.E = iSwiggyNetworkWrapper;
            ChatBubbleService.F = sharedPreferences;
        }

        public final void l(Context context) {
            p.j(context, LogCategory.CONTEXT);
            if (!k20.a.f58924a.c() && !LynxActivity.Companion.a()) {
                m(context);
                try {
                    MinisActivity.a aVar = MinisActivity.n;
                    if (!aVar.b() && !aVar.a()) {
                        context.startService(new Intent(context, ChatBubbleService.class));
                    }
                } catch (IllegalStateException e11) {
                    u.b("ChatBubbleService", e11.getMessage());
                }
            }
        }

        public final void m(Context context) {
            p.j(context, LogCategory.CONTEXT);
            context.stopService(new Intent(context, ChatBubbleService.class));
        }
    }

    public static final void B(ISwiggyNetworkWrapper iSwiggyNetworkWrapper, SharedPreferences sharedPreferences) {
        C.k(iSwiggyNetworkWrapper, sharedPreferences);
    }

    public static final void C(Context context) {
        C.l(context);
    }

    public static final void D(Context context) {
        C.m(context);
    }

    public static final void t() {
        C.e();
    }

    private final String u(List<Aggregation> list) {
        if (!list.isEmpty()) {
            List<Conversations> conversations = ((Aggregation) s.W(list)).getConversations();
            if (conversations == null) {
                conversations = k.j();
            }
            if (!conversations.isEmpty()) {
                return String.valueOf(((Conversations) s.W(conversations)).getId());
            }
        }
        return "";
    }

    private final int v(List<Aggregation> list) {
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            int i13 = i11 + 1;
            List<Conversations> conversations = list.get(i11).getConversations();
            if (conversations == null) {
                conversations = k.j();
            }
            int size2 = conversations.size();
            int i14 = 0;
            while (i14 < size2) {
                int i15 = i14 + 1;
                Boolean read = conversations.get(i14).getRead();
                if (read != null && !read.booleanValue()) {
                    i12++;
                }
                i14 = i15;
            }
            i11 = i13;
        }
        return i12;
    }

    private final String w(List<Aggregation> list) {
        if (!list.isEmpty()) {
            List<Conversations> conversations = ((Aggregation) s.W(list)).getConversations();
            if (conversations == null) {
                conversations = k.j();
            }
            if (!conversations.isEmpty()) {
                return String.valueOf(((Conversations) s.W(conversations)).getAvatarUrl());
            }
        }
        return "";
    }

    private final int x(List<Aggregation> list) {
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            int i13 = i11 + 1;
            List<Conversations> conversations = list.get(i11).getConversations();
            if (conversations == null) {
                conversations = k.j();
            }
            i12 += conversations.size();
            i11 = i13;
        }
        return i12;
    }

    private final String z(String str, String str2) {
        return A().f77175o + str + '/' + str2;
    }

    public final p90.a A() {
        p90.a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        p.B("webConstants");
        return null;
    }

    public xs.b e() {
        b.a d11 = new b.a().f(this.v).e(this.f18566u).b(this.f18568x).c(this.f18569y).d(this.f18567w);
        Context applicationContext = getApplicationContext();
        p.i(applicationContext, "applicationContext");
        return d11.g(applicationContext).p(y()).y(this.f18570z).a();
    }

    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type in.swiggy.android.SwiggyApplication");
        ((SwiggyApplication) applicationContext).P.h0(this);
        this.f18566u = v(k20.a.b());
        this.v = x(k20.a.b());
        this.f18568x = u(k20.a.b());
        k20.a.b();
        this.f18569y = k20.a.f58924a.d();
        this.f18567w = w(k20.a.b());
        this.f18570z = z(this.f18569y, this.f18568x);
    }

    public final ir.b y() {
        ir.b bVar = this.B;
        if (bVar != null) {
            return bVar;
        }
        p.B("eventHandler");
        return null;
    }
}
