package ch0;

import amazonpay.silentpay.APayError;
import amazonpay.silentpay.GetChargeStatusResponse;
import amazonpay.silentpay.f;
import amazonpay.silentpay.g;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import bp0.k;
import gd0.l;
import in.swiggy.android.payment.utility.PaymentUtils;
import in.swiggy.android.tejas.feature.payment.AmazonPaymentMeta;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import mb0.n1;
import ms.h;
import o.a;
import wh0.d;

/* compiled from: AmazonPayUtility.kt */
public final class a extends dh0.a {
    public static final C0218a Companion = new C0218a((i) null);
    private static String n = "AmazonPayUtility";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final eo0.a f18214c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final d f18215d;

    /* renamed from: e  reason: collision with root package name */
    private final jr.a f18216e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f18217f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f18218g;

    /* renamed from: h  reason: collision with root package name */
    private final n1 f18219h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedPreferences f18220i;
    private final boolean j;
    /* access modifiers changed from: private */
    public int k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final int f18221l = 2;

    /* renamed from: m  reason: collision with root package name */
    private eo0.b f18222m;

    /* renamed from: ch0.a$a  reason: collision with other inner class name */
    /* compiled from: AmazonPayUtility.kt */
    public static final class C0218a {
        private C0218a() {
        }

        public /* synthetic */ C0218a(i iVar) {
            this();
        }
    }

    /* compiled from: AmazonPayUtility.kt */
    public static final class b implements a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f18224b;

        b(a aVar, c cVar) {
            this.f18223a = aVar;
            this.f18224b = cVar;
        }

        public void a(Bundle bundle) {
            p.j(bundle, "bundle");
            g a11 = g.a(bundle);
            try {
                PaymentUtils.f80724a.y(new l(PaymentType.AMAZONPAY, a11.b(), "", PaymentUtils.r(PaymentType.AMAZONPAY)), this.f18223a.k());
                this.f18224b.onSuccess(a11.b());
            } catch (Exception e11) {
                this.f18223a.a(e11.getMessage(), "check_balance");
            }
        }

        public void b(APayError aPayError) {
            p.j(aPayError, "aPayError");
            this.f18223a.a(aPayError.getMessage(), "check_balance");
            try {
                this.f18224b.a(aPayError.getMessage());
            } catch (Exception e11) {
                this.f18223a.a(e11.getMessage(), "check_balance");
            }
        }
    }

    /* compiled from: AmazonPayUtility.kt */
    public static final class c implements a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f18225a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AmazonPaymentMeta f18226b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ lp0.l<GetChargeStatusResponse, k> f18227c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ lp0.l<String, k> f18228d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ amazonpay.silentpay.b f18229e;

        c(a aVar, AmazonPaymentMeta amazonPaymentMeta, lp0.l<? super GetChargeStatusResponse, k> lVar, lp0.l<? super String, k> lVar2, amazonpay.silentpay.b bVar) {
            this.f18225a = aVar;
            this.f18226b = amazonPaymentMeta;
            this.f18227c = lVar;
            this.f18228d = lVar2;
            this.f18229e = bVar;
        }

        /* access modifiers changed from: private */
        public static final Boolean d(a aVar, amazonpay.silentpay.b bVar, c cVar) {
            p.j(aVar, "this$0");
            p.j(bVar, "$encryptedRequest");
            p.j(cVar, "this$1");
            amazonpay.silentpay.a.d(aVar.f18215d.N0(), bVar, cVar);
            return Boolean.TRUE;
        }

        public void a(Bundle bundle) {
            eo0.b j;
            p.j(bundle, "bundle");
            GetChargeStatusResponse c11 = GetChargeStatusResponse.c(bundle);
            if (c11 == null || c11.d() != GetChargeStatusResponse.TransactionStatus.PENDING) {
                if (c11 != null) {
                    this.f18227c.invoke(c11);
                } else {
                    this.f18228d.invoke(null);
                }
            } else if (this.f18225a.k <= this.f18226b.getGetChargeStatusRetryCount()) {
                a aVar = this.f18225a;
                boolean z11 = true;
                aVar.k = aVar.k + 1;
                if (this.f18225a.j() != null) {
                    eo0.b j11 = this.f18225a.j();
                    if (j11 == null || j11.isDisposed()) {
                        z11 = false;
                    }
                    if (z11 && (j = this.f18225a.j()) != null) {
                        j.dispose();
                    }
                }
                a aVar2 = this.f18225a;
                aVar2.q(h.d(new b(aVar2, this.f18229e, this), (long) this.f18225a.f18221l, TimeUnit.SECONDS, do0.a.a()));
                eo0.b j12 = this.f18225a.j();
                if (j12 != null) {
                    this.f18225a.f18214c.c(j12);
                }
            }
        }

        public void b(APayError aPayError) {
            p.j(aPayError, "aPayError");
            this.f18225a.a(aPayError.getMessage(), "charge_status");
            this.f18228d.invoke(aPayError.getMessage());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(eo0.a aVar, d dVar, jr.a aVar2, Class<?> cls, boolean z11, n1 n1Var, SharedPreferences sharedPreferences) {
        super("Amazon Pay", aVar2);
        p.j(aVar, "compositeDisposable");
        p.j(dVar, "lynxViewComponent");
        p.j(aVar2, "newrelicPerformanceUtils");
        p.j(cls, "intentHandlingClass");
        p.j(sharedPreferences, "sharedPreferences");
        this.f18214c = aVar;
        this.f18215d = dVar;
        this.f18216e = aVar2;
        this.f18217f = cls;
        this.f18218g = z11;
        this.f18219h = n1Var;
        this.f18220i = sharedPreferences;
    }

    private final Intent g(Context context, o.a aVar) {
        Intent b11 = amazonpay.silentpay.a.b(context, aVar);
        p.i(b11, "getAuthorizationIntent(context, customTabsIntent)");
        return b11;
    }

    private final o.a h() {
        o.a a11 = new a.C0154a().b(-16777216).a();
        p.i(a11, "Builder()\n            .s…ACK)\n            .build()");
        return a11;
    }

    public final n1 i() {
        return this.f18219h;
    }

    public final eo0.b j() {
        return this.f18222m;
    }

    public final SharedPreferences k() {
        return this.f18220i;
    }

    public final void l(AmazonPaymentMeta amazonPaymentMeta) {
        p.j(amazonPaymentMeta, "amazonPaymentMeta");
        o.a a11 = new a.C0154a().b(-16777216).a();
        Intent intent = new Intent(this.f18215d.N0(), this.f18217f);
        intent.addFlags(603979776);
        intent.putExtra("amazonPayProcessChargeResponse", true);
        int i11 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        amazonpay.silentpay.a.e(this.f18215d.N0(), a11, PendingIntent.getActivity(this.f18215d.N0(), 0, intent, i11), PendingIntent.getActivity(this.f18215d.N0(), 0, intent, i11), new amazonpay.silentpay.b(amazonPaymentMeta.getPayload(), amazonPaymentMeta.getKey(), amazonPaymentMeta.getIv(), this.j));
    }

    public final boolean m() {
        return this.f18218g;
    }

    public final void n(c cVar) {
        p.j(cVar, "callBackHandler");
        try {
            amazonpay.silentpay.a.c(this.f18215d.N0(), new f("A1ARLXJTNUTBI", this.j), new b(this, cVar));
        } catch (Exception e11) {
            a(e11.getMessage(), "check_balance");
            try {
                cVar.a((String) null);
            } catch (Exception unused) {
                a(e11.getMessage(), "check_balance");
            }
        }
    }

    public final void o() {
        Context N0 = this.f18215d.N0();
        if (N0 != null) {
            if (m()) {
                n1 i11 = i();
                if (i11 != null) {
                    i11.G(g(N0, h()), 888);
                    return;
                }
                return;
            }
            this.f18215d.startActivityForResult(g(N0, h()), 888);
        }
    }

    public final void p(AmazonPaymentMeta amazonPaymentMeta, lp0.l<? super GetChargeStatusResponse, k> lVar, lp0.l<? super String, k> lVar2) {
        p.j(amazonPaymentMeta, "amazonPaymentMeta");
        p.j(lVar, "onSuccess");
        p.j(lVar2, "onError");
        amazonpay.silentpay.b bVar = new amazonpay.silentpay.b(amazonPaymentMeta.getPayload(), amazonPaymentMeta.getKey(), amazonPaymentMeta.getIv(), this.j);
        amazonpay.silentpay.a.d(this.f18215d.N0(), bVar, new c(this, amazonPaymentMeta, lVar, lVar2, bVar));
    }

    public final void q(eo0.b bVar) {
        this.f18222m = bVar;
    }
}
