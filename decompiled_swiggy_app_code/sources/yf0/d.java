package yf0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.slice.Slice;
import ef0.e;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.R;
import in.swiggy.android.mvvm.viewmodels.SwiggySliceViewModel;
import in.swiggy.android.tejas.oldapi.models.order.DeliveryBoy;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import in.swiggy.android.tejas.sliceproviders.models.SliceOrder;
import in.swiggy.android.track.activities.TrackOrderActivity;
import ir.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import yf0.a;

/* compiled from: TrackOrderSlice.kt */
public final class d extends a {

    /* renamed from: o  reason: collision with root package name */
    public static final a f20018o = new a((i) null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f20019p = 8;

    /* renamed from: c  reason: collision with root package name */
    private final Context f20020c;

    /* renamed from: d  reason: collision with root package name */
    private final Uri f20021d;

    /* renamed from: e  reason: collision with root package name */
    private final SwiggySliceViewModel f20022e;

    /* renamed from: f  reason: collision with root package name */
    private final e f20023f;

    /* renamed from: g  reason: collision with root package name */
    private final b f20024g;

    /* renamed from: h  reason: collision with root package name */
    private String f20025h;

    /* renamed from: i  reason: collision with root package name */
    private String f20026i;
    private p3.d j;
    private DeliveryBoy k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20027l;

    /* renamed from: m  reason: collision with root package name */
    private eo0.b f20028m;
    private Long n;

    /* compiled from: TrackOrderSlice.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, Uri uri, SwiggySliceViewModel swiggySliceViewModel, e eVar, b bVar) {
        super(context, uri);
        p.j(context, LogCategory.CONTEXT);
        p.j(uri, "sliceUri");
        p.j(swiggySliceViewModel, "swiggySliceViewModel");
        p.j(eVar, LogSubCategory.Action.USER);
        this.f20020c = context;
        this.f20021d = uri;
        this.f20022e = swiggySliceViewModel;
        this.f20023f = eVar;
        this.f20024g = bVar;
    }

    private final boolean A() {
        return this.f20026i == null;
    }

    private final p3.d k(String str, boolean z11) {
        return p3.d.b(PendingIntent.getActivity(this.f20020c, 101, w(str, z11), Build.VERSION.SDK_INT >= 31 ? PDButton.FLAG_RADIOS_IN_UNISON : 0), a.e(this, 0, 1, (Object) null), 0, g(R.string.track_now));
    }

    private final void l() {
        eo0.b bVar = this.f20028m;
        if (bVar != null && !bVar.isDisposed()) {
            bVar.dispose();
        }
    }

    private final boolean m() {
        return p.e("order_status_fetching_error", this.f20026i);
    }

    private final void n() {
        ao0.d<SliceOrder> m02;
        l();
        ao0.d<SliceOrder> m22 = this.f20022e.m2();
        eo0.b bVar = null;
        if (!(m22 == null || (m02 = m22.m0(wo0.a.c())) == null)) {
            bVar = m02.h0(new b(this), new c(this));
        }
        this.f20028m = bVar;
    }

    /* access modifiers changed from: private */
    public static final void o(d dVar, SliceOrder sliceOrder) {
        String str;
        p.j(dVar, "this$0");
        dVar.z();
        Order order = sliceOrder.getOrder();
        String str2 = order.mOrderStatus;
        if (!(str2 == null || o.A(str2))) {
            if (!o.A(sliceOrder.getOrderState())) {
                str = sliceOrder.getOrderState();
            } else {
                str = order.mOrderStatus;
            }
            dVar.f20026i = str;
            dVar.j = dVar.k(order.mOrderId, order.isUnsupportedOrder());
            dVar.k = order.mDeliveryBoy;
            if (!order.isOrderCancelled() && !order.isOrderDelivered()) {
                dVar.f20027l = true;
                dVar.f20025h = sliceOrder.getEta();
            }
        } else {
            dVar.f20026i = "order_status_fetching_error";
        }
        dVar.h();
    }

    /* access modifiers changed from: private */
    public static final void p(d dVar, Throwable th2) {
        p.j(dVar, "this$0");
        dVar.z();
        dVar.f20026i = "order_status_fetching_error";
        dVar.h();
    }

    private final p3.d q(String str) {
        return p3.d.b(PendingIntent.getActivity(this.f20020c, 102, r(str), Build.VERSION.SDK_INT >= 31 ? PDButton.FLAG_RADIOS_IN_UNISON : 0), a.e(this, 0, 1, (Object) null), 0, g(R.string.call_de));
    }

    private final Intent r(String str) {
        return new Intent("android.intent.action.CALL", Uri.parse(p.s("tel:", str)));
    }

    private final Slice t() {
        p3.b bVar = new p3.b(this.f20020c, this.f20021d, -1);
        a(bVar, g(R.string.order_status_slice_title), g(R.string.order_status_loading_subtitle), a.e(this, 0, 1, (Object) null), true, a.c(this, 0, 1, (Object) null));
        Slice h11 = bVar.h();
        p.f(h11, "ListBuilderDsl(context, …ply { addRows() }.build()");
        return h11;
    }

    private final Slice u() {
        p3.b bVar = new p3.b(this.f20020c, this.f20021d, -1);
        a(bVar, g(R.string.login_slice_title), g(R.string.login_slice_subtitle), a.e(this, 0, 1, (Object) null), false, b(R.string.open_app_and_login));
        Slice h11 = bVar.h();
        p.f(h11, "ListBuilderDsl(context, …ply { addRows() }.build()");
        return h11;
    }

    private final Slice v() {
        DeliveryBoy deliveryBoy;
        String str;
        String str2;
        String str3;
        p3.b bVar = new p3.b(this.f20020c, this.f20021d, -1);
        String str4 = this.f20026i;
        boolean z11 = false;
        if (!(str4 == null || o.A(str4))) {
            String g11 = g(R.string.order_status_slice_title);
            String str5 = this.f20026i;
            if (str5 == null) {
                str3 = "";
            } else {
                str3 = str5;
            }
            a(bVar, g11, str3, a.e(this, 0, 1, (Object) null), false, this.j);
        }
        String str6 = this.f20025h;
        if (str6 == null || o.A(str6)) {
            z11 = true;
        }
        if (!z11) {
            String g12 = g(R.string.eta_slice_title);
            String str7 = this.f20025h;
            if (str7 == null) {
                str2 = "";
            } else {
                str2 = str7;
            }
            a(bVar, g12, str2, d(R.drawable.delivery_time_okay), false, this.j);
        }
        if (this.f20027l && in.swiggy.android.commons.utils.rxpermissions.a.g(this.f20020c).h("android.permission.CALL_PHONE") && (deliveryBoy = this.k) != null && (str = deliveryBoy.mPhone) != null) {
            String g13 = g(R.string.delivery_person_name_slice_title);
            String str8 = deliveryBoy.mName;
            p.i(str8, "deliveryPerson.mName");
            a(bVar, g13, str8, d(R.drawable.callicon), false, q(str));
        }
        y();
        Slice h11 = bVar.h();
        p.f(h11, "ListBuilderDsl(context, …ply { addRows() }.build()");
        return h11;
    }

    private final Intent w(String str, boolean z11) {
        Intent intent = new Intent(this.f20020c, TrackOrderActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(603979776);
        if (str != null) {
            intent.putExtra("TrackOrderActivityorderId", str);
        }
        intent.putExtra("forceOldTrack", z11);
        intent.putExtra("launchedFrom", "launchedFromGoogleAssistant");
        return intent;
    }

    private final Slice x() {
        if (m()) {
            return new a.C0251a(this.f20020c, this.f20021d).f();
        }
        if (!A()) {
            return v();
        }
        n();
        return t();
    }

    private final void y() {
        b bVar = this.f20024g;
        if (bVar != null) {
            bVar.i(bVar.c("google-voice", "impression-track-card", "-", 9999));
        }
    }

    private final void z() {
        this.n = Long.valueOf(System.currentTimeMillis());
    }

    public Slice f() {
        if (!this.f20023f.o0()) {
            return u();
        }
        return x();
    }

    public final Long s() {
        return this.n;
    }
}
