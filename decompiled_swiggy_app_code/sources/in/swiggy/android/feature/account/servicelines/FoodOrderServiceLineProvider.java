package in.swiggy.android.feature.account.servicelines;

import android.text.Spanned;
import ba0.c;
import bp0.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import eo0.b;
import go0.a;
import in.swiggy.android.R;
import in.swiggy.android.feature.account.servicelines.ServiceLineProvider;
import in.swiggy.android.feature.account.viewmodel.RefundsViewModel;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.order.history.model.OrderDetailPLData;
import in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper;
import in.swiggy.android.tejas.oldapi.SwiggyBaseResponseHandler;
import in.swiggy.android.tejas.oldapi.models.listing.PLCardTypes;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import in.swiggy.android.tejas.oldapi.models.order.OrderList;
import in.swiggy.android.tejas.oldapi.models.order.OrderRatingMeta;
import java.util.List;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;
import mb0.r0;
import q10.g;
import q10.h;
import r10.e0;
import r10.s;

/* compiled from: FoodOrderServiceLineProvider.kt */
public class FoodOrderServiceLineProvider extends ServiceLineProvider {
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final p<Order, Integer, k> f15165o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final l<Order, k> f15166p;
    private String q;

    /* renamed from: r  reason: collision with root package name */
    private final int f15167r = 5;

    /* renamed from: s  reason: collision with root package name */
    private boolean f15168s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FoodOrderServiceLineProvider(boolean z11, l<? super ServiceLineProvider, k> lVar, r0 r0Var, ISwiggyNetworkWrapper iSwiggyNetworkWrapper, c cVar, p<? super Order, ? super Integer, k> pVar, l<? super Order, k> lVar2) {
        super(z11, lVar, r0Var, iSwiggyNetworkWrapper, cVar);
        kotlin.jvm.internal.p.j(lVar, "selectedListener");
        kotlin.jvm.internal.p.j(r0Var, "resourceService");
        kotlin.jvm.internal.p.j(iSwiggyNetworkWrapper, "networkWrapper");
        kotlin.jvm.internal.p.j(cVar, "accountFragmentService");
        kotlin.jvm.internal.p.j(pVar, PLCardTypes.TYPE_REORDER_CARD);
        kotlin.jvm.internal.p.j(lVar2, "rateOrder");
        this.f15165o = pVar;
        this.f15166p = lVar2;
    }

    /* access modifiers changed from: private */
    public static final void J(FoodOrderServiceLineProvider foodOrderServiceLineProvider, ServiceLineProvider.b bVar, SwiggyApiResponse swiggyApiResponse) {
        kotlin.jvm.internal.p.j(foodOrderServiceLineProvider, "this$0");
        kotlin.jvm.internal.p.j(bVar, "$listener");
        if (swiggyApiResponse.getData() != null) {
            kotlin.jvm.internal.p.i(swiggyApiResponse, "response");
            foodOrderServiceLineProvider.M(swiggyApiResponse);
            bVar.b(foodOrderServiceLineProvider);
            return;
        }
        bVar.a(foodOrderServiceLineProvider);
    }

    /* access modifiers changed from: private */
    public static final void K(ServiceLineProvider.b bVar, FoodOrderServiceLineProvider foodOrderServiceLineProvider, SwiggyApiResponse swiggyApiResponse) {
        kotlin.jvm.internal.p.j(bVar, "$listener");
        kotlin.jvm.internal.p.j(foodOrderServiceLineProvider, "this$0");
        bVar.a(foodOrderServiceLineProvider);
    }

    /* access modifiers changed from: private */
    public static final void L(ServiceLineProvider.b bVar, FoodOrderServiceLineProvider foodOrderServiceLineProvider, Throwable th2) {
        kotlin.jvm.internal.p.j(bVar, "$listener");
        kotlin.jvm.internal.p.j(foodOrderServiceLineProvider, "this$0");
        bVar.a(foodOrderServiceLineProvider);
    }

    /* access modifiers changed from: protected */
    public final int G() {
        return this.f15167r;
    }

    public final String H() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public final boolean I() {
        return this.f15168s;
    }

    public final void M(SwiggyApiResponse<OrderList> swiggyApiResponse) {
        kotlin.jvm.internal.p.j(swiggyApiResponse, "response");
        OrderList data = swiggyApiResponse.getData();
        List<Order> list = data == null ? null : data.mOrders;
        if (list != null) {
            boolean z11 = !list.isEmpty();
            this.f15168s = z11;
            this.q = z11 ? ((Order) s.h0(list)).mOrderId : null;
            int i11 = 0;
            for (T next : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    k.t();
                }
                Order order = (Order) next;
                order.sanitizeDataFromNetwork();
                if (order.isOrderDelivered() || order.isOrderStatusCancelled()) {
                    Address address = order.mDeliveryAddress;
                    String displayableAddress = address == null ? null : address.getDisplayableAddress();
                    String str = order.getRestaurant().mName;
                    String str2 = order.mRestaurantAreaName;
                    double d11 = order.mTotalAmount;
                    Spanned itemsSummary = order.getItemsSummary();
                    long j = order.mOrderTime;
                    boolean isReorderAllowed = order.isReorderAllowed();
                    boolean z12 = order.showRateUs;
                    OrderRatingMeta orderRatingMeta = order.orderRatingMeta;
                    int i13 = order.mHasRating;
                    double d12 = order.restaurantRating;
                    boolean isNoRush = order.isNoRush();
                    String str3 = order.mOrderStatus;
                    Boolean bool = Boolean.FALSE;
                    Double valueOf = Double.valueOf(0.0d);
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$4 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$4 = r2;
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$4 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$42 = new FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$4(this, order);
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$5 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$5 = r2;
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$5 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$52 = new FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$5(this, order, i11);
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$6 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$6 = r2;
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$6 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$62 = new FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$6(this, order);
                    e0 e0Var = r6;
                    e0 e0Var2 = new e0(displayableAddress, str, str2, d11, itemsSummary, j, isReorderAllowed, true, z12, orderRatingMeta, i13, d12, isNoRush, str3, false, bool, valueOf, foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$4, foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$5, foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$6, FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$7.f15182a, (String) null, 0, (OrderDetailPLData) null, (RefundsViewModel) null, (Double) null, (Boolean) null, 132120576, (i) null);
                    g().x0(e0Var);
                    e0Var.init();
                    d().add(e0Var);
                } else {
                    boolean isTrackable = order.isTrackable();
                    Address address2 = order.mDeliveryAddress;
                    String displayableAddress2 = address2 == null ? null : address2.getDisplayableAddress();
                    String str4 = order.getRestaurant().mName;
                    String str5 = order.mRestaurantAreaName;
                    double d13 = order.mTotalAmount;
                    long j11 = order.mOrderTime;
                    Spanned itemsSummary2 = order.getItemsSummary();
                    boolean isHelpDisabled = order.isHelpDisabled();
                    boolean isNoRush2 = order.isNoRush();
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$1 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$1 = r6;
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$1 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$12 = new FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$1(this, order);
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$2 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$2 = r6;
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$2 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$22 = new FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$2(this, order);
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$3 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$3 = r6;
                    FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$3 foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$32 = new FoodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$3(this, order);
                    s sVar = new s(isTrackable, displayableAddress2, str4, str5, d13, j11, itemsSummary2, isHelpDisabled, true, isNoRush2, foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$1, foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$2, foodOrderServiceLineProvider$orderResponseSuccessHandler$1$vm$3, (String) null, (String) null, 0, (OrderDetailPLData) null, 122880, (i) null);
                    g().x0(sVar);
                    sVar.init();
                    c().add(sVar);
                }
                i11 = i12;
            }
        }
    }

    public final void N(String str) {
        this.q = str;
    }

    /* access modifiers changed from: protected */
    public final void O(boolean z11) {
        this.f15168s = z11;
    }

    public String e() {
        String b11 = m().b(R.string.no_order_state_text, "food");
        kotlin.jvm.internal.p.i(b11, "resourceService.getStrin…order_state_text, \"food\")");
        return b11;
    }

    public String n() {
        String b11 = m().b(R.string.fetch_order_retry_text, "food");
        kotlin.jvm.internal.p.i(b11, "resourceService.getStrin…order_retry_text, \"food\")");
        return b11;
    }

    public String p() {
        String string = m().getString(R.string.restaurants);
        kotlin.jvm.internal.p.i(string, "resourceService.getString(R.string.restaurants)");
        return string;
    }

    public Boolean r() {
        return Boolean.valueOf(h() > 0 && this.f15168s);
    }

    public b w(ServiceLineProvider.b bVar) {
        kotlin.jvm.internal.p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        b orders = j().getOrders(this.f15167r, this.q, new SwiggyBaseResponseHandler(new h(this, bVar), new q10.i(bVar, this)), new g(bVar, this), (a) null);
        kotlin.jvm.internal.p.i(orders, "networkWrapper.getOrders…     },\n            null)");
        return orders;
    }

    public void x() {
        this.q = null;
        this.f15168s = false;
    }
}
