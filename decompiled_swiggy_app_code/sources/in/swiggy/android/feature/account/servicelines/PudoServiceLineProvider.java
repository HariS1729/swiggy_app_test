package in.swiggy.android.feature.account.servicelines;

import android.content.SharedPreferences;
import android.text.Html;
import android.text.Spanned;
import ba0.c;
import bp0.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.xiaomi.mipush.sdk.Constants;
import eo0.b;
import in.swiggy.android.R;
import in.swiggy.android.feature.account.servicelines.ServiceLineProvider;
import in.swiggy.android.feature.account.viewmodel.RefundsViewModel;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.order.DashSerializedOrderJobTransformer;
import in.swiggy.android.tejas.feature.order.DashSerializedOrderResponseBodyTransformer;
import in.swiggy.android.tejas.feature.order.history.model.OrderDetailPLData;
import in.swiggy.android.tejas.feature.order.model.network.DashOrderResponse;
import in.swiggy.android.tejas.feature.order.model.network.DashOrderResponseBody;
import in.swiggy.android.tejas.feature.order.model.network.DashOrderResponseRefundDetailsPair;
import in.swiggy.android.tejas.feature.order.model.network.DashPaymentInfo;
import in.swiggy.android.tejas.feature.order.model.network.DashPaymentStatusTypes;
import in.swiggy.android.tejas.feature.order.model.network.DashRefundDetails;
import in.swiggy.android.tejas.feature.order.model.network.serialized.DashSerializedOrderResponseBody;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetails;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderDetailsTransformer;
import in.swiggy.android.tejas.feature.orderdetails.DashOrderItemDetails;
import in.swiggy.android.tejas.feature.orderdetails.PudoItemDetails;
import in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import in.swiggy.android.tejas.oldapi.models.order.OrderRatingMeta;
import in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryItem;
import in.swiggy.android.tejas.oldapi.network.responses.orderhistory.OrderHistoryResponseData;
import in.swiggy.android.tejas.oldapi.network.responses.orderhistory.ServiceLineTypes;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import iw.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.Regex;
import lp0.l;
import mb0.r0;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import os.g0;
import q10.m;
import q10.n;
import r10.e0;
import r10.s;

/* compiled from: PudoServiceLineProvider.kt */
public final class PudoServiceLineProvider extends ServiceLineProvider {

    /* renamed from: w  reason: collision with root package name */
    public static final a f15203w = new a((i) null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f15204x = 8;

    /* renamed from: o  reason: collision with root package name */
    private final d f15205o;

    /* renamed from: p  reason: collision with root package name */
    private long f15206p = System.currentTimeMillis();
    private Integer q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f15207r = true;

    /* renamed from: s  reason: collision with root package name */
    private final Gson f15208s;
    private final DashSerializedOrderResponseBodyTransformer t;

    /* renamed from: u  reason: collision with root package name */
    private final DashOrderDetailsTransformer f15209u;
    private final String v;

    /* compiled from: PudoServiceLineProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PudoServiceLineProvider(boolean z11, l<? super ServiceLineProvider, k> lVar, SharedPreferences sharedPreferences, r0 r0Var, ISwiggyNetworkWrapper iSwiggyNetworkWrapper, d dVar, c cVar) {
        super(z11, lVar, r0Var, iSwiggyNetworkWrapper, cVar);
        p.j(lVar, "selectedListener");
        p.j(sharedPreferences, "sharedPreferences");
        p.j(r0Var, "resourceService");
        p.j(iSwiggyNetworkWrapper, "networkWrapper");
        p.j(dVar, "remoteConfig");
        p.j(cVar, "accountFragmentService");
        this.f15205o = dVar;
        Gson i11 = g0.i();
        this.f15208s = i11;
        p.i(i11, "gson");
        this.t = new DashSerializedOrderResponseBodyTransformer(new DashSerializedOrderJobTransformer(i11));
        this.f15209u = new DashOrderDetailsTransformer();
        String string = sharedPreferences.getString("swiggy_go_name", "Go");
        this.v = string == null ? "" : string;
    }

    private final Spanned E(List<DashOrderItemDetails>... listArr) {
        StringBuilder sb2 = new StringBuilder();
        for (List<DashOrderItemDetails> it2 : listArr) {
            for (DashOrderItemDetails dashOrderItemDetails : it2) {
                sb2.append(dashOrderItemDetails.getName());
                sb2.append(" x ");
                sb2.append(dashOrderItemDetails.getCount());
                sb2.append(", ");
            }
        }
        String sb3 = sb2.toString();
        p.i(sb3, "itemNames.toString()");
        Spanned fromHtml = Html.fromHtml(new Regex(", $").g(sb3, ""));
        p.i(fromHtml, "fromHtml(itemNameString)");
        return fromHtml;
    }

    private final RefundsViewModel.RefundsState F(DashRefundDetails dashRefundDetails, List<DashPaymentInfo> list) {
        if (list != null) {
            int i11 = 0;
            for (T next : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    k.t();
                }
                DashPaymentInfo dashPaymentInfo = (DashPaymentInfo) next;
                if (p.e(dashPaymentInfo.getPaymentStatus(), DashPaymentStatusTypes.STATE_REFUND_INITIATED) || p.e(dashPaymentInfo.getPaymentStatus(), DashPaymentStatusTypes.STATE_REFUND_FAILED)) {
                    return RefundsViewModel.RefundsState.PROCESSING;
                }
                i11 = i12;
            }
        }
        return RefundsViewModel.RefundsState.COMPLETED;
    }

    /* access modifiers changed from: private */
    public static final void I(PudoServiceLineProvider pudoServiceLineProvider, ServiceLineProvider.b bVar, SwiggyApiResponse swiggyApiResponse) {
        List<OrderHistoryItem> orderGroups;
        DashOrderDetails dashOrderDetails;
        String str;
        PudoServiceLineProvider pudoServiceLineProvider2 = pudoServiceLineProvider;
        ServiceLineProvider.b bVar2 = bVar;
        p.j(pudoServiceLineProvider2, "this$0");
        p.j(bVar2, "$listener");
        OrderHistoryResponseData orderHistoryResponseData = (OrderHistoryResponseData) swiggyApiResponse.getData();
        pudoServiceLineProvider2.q = orderHistoryResponseData == null ? null : orderHistoryResponseData.getCount();
        OrderHistoryResponseData orderHistoryResponseData2 = (OrderHistoryResponseData) swiggyApiResponse.getData();
        pudoServiceLineProvider2.f15207r = pudoServiceLineProvider2.H(orderHistoryResponseData2 == null ? null : orderHistoryResponseData2.getOrderGroups());
        OrderHistoryResponseData orderHistoryResponseData3 = (OrderHistoryResponseData) swiggyApiResponse.getData();
        if (!(orderHistoryResponseData3 == null || (orderGroups = orderHistoryResponseData3.getOrderGroups()) == null)) {
            for (OrderHistoryItem orderHistoryItem : orderGroups) {
                DashRefundDetails refundDetails = orderHistoryItem.getRefundDetails();
                DashSerializedOrderResponseBody orderResponseBody = orderHistoryItem.getOrderResponseBody();
                if (orderResponseBody != null) {
                    DashOrderResponse transform = pudoServiceLineProvider2.t.transform(orderResponseBody);
                    if (transform == null) {
                        dashOrderDetails = null;
                    } else {
                        dashOrderDetails = pudoServiceLineProvider2.f15209u.transform(new DashOrderResponseRefundDetailsPair(transform, refundDetails, orderHistoryItem));
                    }
                    if (dashOrderDetails != null) {
                        pudoServiceLineProvider2.f15206p = dashOrderDetails.getOrderCreationTime();
                        DashOrderResponseBody body = transform.getBody();
                        List<DashPaymentInfo> paymentInfo = body == null ? null : body.getPaymentInfo();
                        if (!dashOrderDetails.getPudoItems().isEmpty()) {
                            str = ((PudoItemDetails) s.W(dashOrderDetails.getPudoItems())).getType();
                        } else {
                            str = pudoServiceLineProvider.m().getString(R.string.swiggy_go_order);
                        }
                        String str2 = dashOrderDetails.getPickupAddressName() + " → " + dashOrderDetails.getDropAddressName();
                        if (dashOrderDetails.getStatus() == 14 || dashOrderDetails.getStatus() == 15 || dashOrderDetails.getStatus() == 17) {
                            List[] listArr = {dashOrderDetails.getStructuredItems(), dashOrderDetails.getUnstructuredItems()};
                            boolean isNoRush = dashOrderDetails.isNoRush();
                            String historyStatus = orderHistoryItem.getHistoryStatus();
                            String pudoAmount = dashOrderDetails.getPudoAmount();
                            int type = dashOrderDetails.getType();
                            RefundsViewModel G = pudoServiceLineProvider2.G(refundDetails, dashOrderDetails, paymentInfo);
                            PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1 pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1 = r5;
                            PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1 pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$12 = new PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1(pudoServiceLineProvider2, dashOrderDetails);
                            e0 e0Var = new e0(dashOrderDetails.getDropAddressString(), str, str2, dashOrderDetails.getAmount(), pudoServiceLineProvider2.E(listArr), dashOrderDetails.getOrderCreationTime() / ((long) 1000), false, true, false, (OrderRatingMeta) null, 0, 0.0d, isNoRush, historyStatus, false, (Boolean) null, (Double) null, pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$1, PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$2.f15214a, PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$3.f15215a, PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$4.f15216a, pudoAmount, type, (OrderDetailPLData) null, G, (Double) null, (Boolean) null, 109166592, (i) null);
                            pudoServiceLineProvider.g().x0(e0Var);
                            e0Var.init();
                            pudoServiceLineProvider.d().add(e0Var);
                        } else {
                            String dropAddressString = dashOrderDetails.getDropAddressString();
                            double amount = dashOrderDetails.getAmount();
                            long orderCreationTime = dashOrderDetails.getOrderCreationTime() / ((long) 1000);
                            Spanned E = pudoServiceLineProvider2.E(dashOrderDetails.getStructuredItems(), dashOrderDetails.getUnstructuredItems());
                            boolean isNoRush2 = dashOrderDetails.isNoRush();
                            PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$5 pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$5 = r9;
                            PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$5 pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$52 = new PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$5(pudoServiceLineProvider2, dashOrderDetails);
                            PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$6 pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$6 = r9;
                            PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$6 pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$62 = new PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$6(pudoServiceLineProvider2, dashOrderDetails);
                            PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7 pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7 = r9;
                            PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7 pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$72 = new PudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7(pudoServiceLineProvider2, dashOrderDetails);
                            s sVar = new s(true, dropAddressString, str, str2, amount, orderCreationTime, E, false, true, isNoRush2, pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$5, pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$6, pudoServiceLineProvider$loadMoreInternal$1$1$1$1$vm$7, orderHistoryItem.getHistoryStatus(), dashOrderDetails.getPudoAmount(), dashOrderDetails.getType(), (OrderDetailPLData) null, PDButton.FLAG_PUSHBUTTON, (i) null);
                            pudoServiceLineProvider.g().x0(sVar);
                            sVar.init();
                            pudoServiceLineProvider.c().add(sVar);
                        }
                    }
                }
            }
        }
        bVar2.b(pudoServiceLineProvider2);
    }

    /* access modifiers changed from: private */
    public static final void J(ServiceLineProvider.b bVar, PudoServiceLineProvider pudoServiceLineProvider, SwiggyApiResponse swiggyApiResponse) {
        p.j(bVar, "$listener");
        p.j(pudoServiceLineProvider, "this$0");
        bVar.a(pudoServiceLineProvider);
    }

    /* access modifiers changed from: private */
    public static final void K(ServiceLineProvider.b bVar, PudoServiceLineProvider pudoServiceLineProvider, Throwable th2) {
        p.j(bVar, "$listener");
        p.j(pudoServiceLineProvider, "this$0");
        bVar.a(pudoServiceLineProvider);
    }

    public final RefundsViewModel G(DashRefundDetails dashRefundDetails, DashOrderDetails dashOrderDetails, List<DashPaymentInfo> list) {
        Boolean bool;
        boolean z11;
        p.j(dashOrderDetails, "orderDetails");
        int i11 = 0;
        boolean a11 = this.f15205o.a("food_order_history_pl_enabled", false);
        ArrayList arrayList = null;
        if (dashRefundDetails == null || !dashOrderDetails.isRefundInitiated() || !a11) {
            return null;
        }
        if (list == null) {
            bool = null;
        } else {
            if (!list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!p.e(((DashPaymentInfo) it2.next()).getPaymentMethod(), PaymentType.COD)) {
                            z11 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bool = Boolean.valueOf(z11);
            }
            z11 = true;
            bool = Boolean.valueOf(z11);
        }
        if (p.e(bool, Boolean.TRUE)) {
            return null;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (T next : list) {
                DashPaymentInfo dashPaymentInfo = (DashPaymentInfo) next;
                if (p.e(dashPaymentInfo.getPaymentStatus(), DashPaymentStatusTypes.STATE_REFUND_INITIATED) || p.e(dashPaymentInfo.getPaymentStatus(), DashPaymentStatusTypes.STATE_REFUNDED) || p.e(dashPaymentInfo.getPaymentStatus(), DashPaymentStatusTypes.STATE_REFUND_FAILED)) {
                    arrayList.add(next);
                }
            }
        }
        String str = "";
        if (arrayList != null) {
            for (Object next2 : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    k.t();
                }
                str = p.s(str, ((DashPaymentInfo) next2).getTransactionId());
                if (i11 < arrayList.size() - 1) {
                    str = p.s(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                i11 = i12;
            }
        }
        return new RefundsViewModel(F(dashRefundDetails, list), this, (OrderDetailPLData) null, str, new PudoServiceLineProvider$getRefundsViewModel$2(this, dashOrderDetails));
    }

    public final boolean H(List<OrderHistoryItem> list) {
        return list != null && (list.isEmpty() ^ true) && list.size() >= 10;
    }

    public String e() {
        String b11 = m().b(R.string.no_order_state_text, this.v);
        p.i(b11, "resourceService.getStrin…order_state_text, goName)");
        return b11;
    }

    public String n() {
        String b11 = m().b(R.string.fetch_order_retry_text, this.v);
        p.i(b11, "resourceService.getStrin…order_retry_text, goName)");
        return b11;
    }

    public String p() {
        return this.v;
    }

    public Boolean r() {
        Integer num = this.q;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() - (c().size() + d().size()) > 0 && this.f15207r);
    }

    public b w(ServiceLineProvider.b bVar) {
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        b orderHistory = j().getOrderHistory(ServiceLineTypes.TYPE_PUDO, 10, this.f15206p, new SwiggyBaseResponseHandler(new m(this, bVar), new n(bVar, this)), new q10.l(bVar, this), (go0.a) null);
        p.i(orderHistory, "networkWrapper.getOrderH…re(this)\n        }, null)");
        return orderHistory;
    }

    public void x() {
        this.f15206p = System.currentTimeMillis();
    }
}
