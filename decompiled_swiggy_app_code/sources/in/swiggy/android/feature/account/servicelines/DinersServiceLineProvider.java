package in.swiggy.android.feature.account.servicelines;

import ba0.c;
import bp0.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import eo0.b;
import in.swiggy.android.R;
import in.swiggy.android.feature.account.servicelines.ServiceLineProvider;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.order.DashSerializedOrderJobTransformer;
import in.swiggy.android.tejas.feature.order.DashSerializedOrderResponseBodyTransformer;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetailsTransformer;
import in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import in.swiggy.android.tejas.oldapi.network.responses.orderhistory.ServiceLineTypes;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import mb0.r0;
import os.g0;
import q10.d;
import q10.e;
import q10.f;

/* compiled from: DinersServiceLineProvider.kt */
public final class DinersServiceLineProvider extends ServiceLineProvider {

    /* renamed from: u  reason: collision with root package name */
    private static final a f15154u = new a((i) null);
    public static final int v = 8;

    /* renamed from: o  reason: collision with root package name */
    private long f15155o = System.currentTimeMillis();

    /* renamed from: p  reason: collision with root package name */
    private Integer f15156p;
    private final Gson q;

    /* renamed from: r  reason: collision with root package name */
    private final DashSerializedOrderResponseBodyTransformer f15157r;

    /* renamed from: s  reason: collision with root package name */
    private final DashOrderDetailsTransformer f15158s;
    private final String t;

    /* compiled from: DinersServiceLineProvider.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DinersServiceLineProvider(boolean z11, l<? super ServiceLineProvider, k> lVar, r0 r0Var, ISwiggyNetworkWrapper iSwiggyNetworkWrapper, c cVar) {
        super(z11, lVar, r0Var, iSwiggyNetworkWrapper, cVar);
        p.j(lVar, "selectedListener");
        p.j(r0Var, "resourceService");
        p.j(iSwiggyNetworkWrapper, "networkWrapper");
        p.j(cVar, "accountFragmentService");
        Gson i11 = g0.i();
        this.q = i11;
        p.i(i11, "gson");
        this.f15157r = new DashSerializedOrderResponseBodyTransformer(new DashSerializedOrderJobTransformer(i11));
        this.f15158s = new DashOrderDetailsTransformer();
        this.t = r0Var.getString(R.string.dineout);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
        if (r4.doubleValue() > 0.0d) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider r42, in.swiggy.android.feature.account.servicelines.ServiceLineProvider.b r43, in.swiggy.android.tejas.api.models.SwiggyApiResponse r44) {
        /*
            r0 = r42
            r1 = r43
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.p.j(r0, r2)
            java.lang.String r2 = "$listener"
            kotlin.jvm.internal.p.j(r1, r2)
            java.lang.Object r2 = r44.getData()
            in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryResponseData r2 = (in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryResponseData) r2
            r3 = 0
            if (r2 != 0) goto L_0x0019
            r2 = r3
            goto L_0x001d
        L_0x0019:
            java.lang.Integer r2 = r2.getCount()
        L_0x001d:
            r0.f15156p = r2
            java.lang.Object r2 = r44.getData()
            in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryResponseData r2 = (in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryResponseData) r2
            if (r2 != 0) goto L_0x0029
            goto L_0x013f
        L_0x0029:
            java.util.List r2 = r2.getOrderGroups()
            if (r2 != 0) goto L_0x0031
            goto L_0x013f
        L_0x0031:
            java.util.Iterator r2 = r2.iterator()
        L_0x0035:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x013f
            java.lang.Object r4 = r2.next()
            in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryItem r4 = (in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryItem) r4
            java.lang.String r5 = r4.getOrderType()
            java.lang.String r6 = "DINEOUT"
            boolean r5 = kotlin.jvm.internal.p.e(r5, r6)
            if (r5 == 0) goto L_0x0035
            in.swiggy.android.tejas.feature.order.model.network.DashRefundDetails r5 = r4.getRefundDetails()
            in.swiggy.android.tejas.feature.order.model.network.serialized.DashSerializedOrderResponseBody r6 = r4.getOrderResponseBody()
            if (r6 != 0) goto L_0x0058
            goto L_0x0035
        L_0x0058:
            in.swiggy.android.tejas.feature.order.DashSerializedOrderResponseBodyTransformer r7 = r0.f15157r
            in.swiggy.android.tejas.feature.order.model.network.DashOrderResponse r6 = r7.transform((in.swiggy.android.tejas.feature.order.model.network.serialized.DashSerializedOrderResponseBody) r6)
            if (r6 != 0) goto L_0x0062
            r5 = r3
            goto L_0x006d
        L_0x0062:
            in.swiggy.android.tejas.feature.orderdetails.DashOrderDetailsTransformer r7 = r0.f15158s
            in.swiggy.android.tejas.feature.order.model.network.DashOrderResponseRefundDetailsPair r8 = new in.swiggy.android.tejas.feature.order.model.network.DashOrderResponseRefundDetailsPair
            r8.<init>(r6, r5, r4)
            in.swiggy.android.tejas.feature.orderdetails.DashOrderDetails r5 = r7.transform((in.swiggy.android.tejas.feature.order.model.network.DashOrderResponseRefundDetailsPair) r8)
        L_0x006d:
            if (r5 != 0) goto L_0x0070
            goto L_0x0035
        L_0x0070:
            long r6 = r5.getOrderCreationTime()
            r0.f15155o = r6
            int r6 = r5.getStatus()
            r7 = 17
            r8 = 20
            if (r6 == r8) goto L_0x008e
            int r6 = r5.getStatus()
            r9 = 15
            if (r6 == r9) goto L_0x008e
            int r6 = r5.getStatus()
            if (r6 != r7) goto L_0x0035
        L_0x008e:
            java.lang.String r10 = r5.getDropAddressString()
            java.lang.String r6 = r5.getPickupAddressName()
            if (r6 != 0) goto L_0x00a3
            mb0.r0 r6 = r42.m()
            r9 = 2131953413(0x7f130705, float:1.9543296E38)
            java.lang.String r6 = r6.getString(r9)
        L_0x00a3:
            r11 = r6
            java.lang.String r12 = r5.getArea()
            double r13 = r5.getAmount()
            long r15 = r5.getOrderCreationTime()
            r6 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r6
            long r16 = r15 / r8
            boolean r19 = r5.isStructured()
            java.lang.String r26 = r4.getHistoryStatus()
            int r4 = r5.getStatus()
            r6 = 1
            r8 = 0
            if (r4 != r7) goto L_0x00c8
            r27 = 1
            goto L_0x00ca
        L_0x00c8:
            r27 = 0
        L_0x00ca:
            int r4 = r5.getStatus()
            r7 = 20
            if (r4 != r7) goto L_0x00ea
            java.lang.Double r4 = r5.getTotalDiscountAmount()
            if (r4 == 0) goto L_0x00ea
            java.lang.Double r4 = r5.getTotalDiscountAmount()
            kotlin.jvm.internal.p.g(r4)
            double r20 = r4.doubleValue()
            r22 = 0
            int r4 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r6 = 0
        L_0x00eb:
            java.lang.Double r29 = r5.getTotalDiscountAmount()
            java.lang.Double r38 = r5.getTotalSavingsDiners()
            java.lang.Boolean r39 = r5.isPostDDROrder()
            r10.e0 r4 = new r10.e0
            r9 = r4
            r15 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r6)
            in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1 r6 = new in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1
            r30 = r6
            r6.<init>(r5, r0)
            in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$2 r31 = in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$2.f15161a
            in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$3 r32 = in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$3.f15162a
            in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$4 r6 = new in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider$loadMoreInternal$1$1$1$1$vm$4
            r33 = r6
            r6.<init>(r0, r5)
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r40 = 31457280(0x1e00000, float:8.2284605E-38)
            r41 = 0
            r9.<init>(r10, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            fb0.f r5 = r42.g()
            r5.x0(r4)
            r4.init()
            java.util.ArrayList r5 = r42.d()
            r5.add(r4)
            goto L_0x0035
        L_0x013f:
            r1.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider.E(in.swiggy.android.feature.account.servicelines.DinersServiceLineProvider, in.swiggy.android.feature.account.servicelines.ServiceLineProvider$b, in.swiggy.android.tejas.api.models.SwiggyApiResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void F(ServiceLineProvider.b bVar, DinersServiceLineProvider dinersServiceLineProvider, SwiggyApiResponse swiggyApiResponse) {
        p.j(bVar, "$listener");
        p.j(dinersServiceLineProvider, "this$0");
        bVar.a(dinersServiceLineProvider);
    }

    /* access modifiers changed from: private */
    public static final void G(ServiceLineProvider.b bVar, DinersServiceLineProvider dinersServiceLineProvider, Throwable th2) {
        p.j(bVar, "$listener");
        p.j(dinersServiceLineProvider, "this$0");
        bVar.a(dinersServiceLineProvider);
    }

    public String e() {
        String b11 = m().b(R.string.no_order_state_text, this.t);
        p.i(b11, "resourceService.getStrin…te_text, serviceLineName)");
        return b11;
    }

    public String n() {
        String b11 = m().b(R.string.fetch_order_retry_text, this.t);
        p.i(b11, "resourceService.getStrin…ry_text, serviceLineName)");
        return b11;
    }

    public String p() {
        String string = m().getString(R.string.dineout);
        p.i(string, "resourceService.getString(R.string.dineout)");
        return string;
    }

    public Boolean r() {
        Integer num = this.f15156p;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() - (c().size() + d().size()) > 0);
    }

    public b w(ServiceLineProvider.b bVar) {
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        b orderHistory = j().getOrderHistory(ServiceLineTypes.TYPE_DINERS, 10, this.f15155o, new SwiggyBaseResponseHandler(new e(this, bVar), new f(bVar, this)), new d(bVar, this), (go0.a) null);
        p.i(orderHistory, "networkWrapper.getOrderH…re(this)\n        }, null)");
        return orderHistory;
    }

    public void x() {
        this.f15155o = System.currentTimeMillis();
    }
}
