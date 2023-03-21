package in.swiggy.android.feature.account.servicelines;

import android.text.Html;
import android.text.Spanned;
import ba0.c;
import bp0.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.swiggy.gandalf.widgets.v2.PastOrderCTAEnum;
import eo0.b;
import in.swiggy.android.feature.account.servicelines.ServiceLineProvider;
import in.swiggy.android.feature.account.viewmodel.RefundsViewModel;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.listing.ListingCardEntity;
import in.swiggy.android.tejas.feature.listing.ListingResponse;
import in.swiggy.android.tejas.feature.order.history.OrderHistoryManager;
import in.swiggy.android.tejas.feature.order.history.model.Actions;
import in.swiggy.android.tejas.feature.order.history.model.OrderDetailPLData;
import in.swiggy.android.tejas.feature.orderhelp.OrderHelpTransformer;
import in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper;
import in.swiggy.android.tejas.oldapi.models.listing.PLCardTypes;
import in.swiggy.android.tejas.oldapi.models.order.Order;
import in.swiggy.android.tejas.oldapi.models.order.OrderRatingMeta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.i;
import lp0.l;
import lp0.p;
import mb0.r0;
import os.u;
import q10.j;
import r10.e0;
import r10.s;

/* compiled from: FoodServiceLineProviderV2.kt */
public final class FoodServiceLineProviderV2 extends FoodOrderServiceLineProvider {

    /* renamed from: x  reason: collision with root package name */
    public static final a f15183x = new a((i) null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f15184y = 8;
    private final p<Order, Integer, k> t;

    /* renamed from: u  reason: collision with root package name */
    private final l<Order, k> f15185u;
    private final OrderHistoryManager v;

    /* renamed from: w  reason: collision with root package name */
    private final jr.a f15186w;

    /* compiled from: FoodServiceLineProviderV2.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FoodServiceLineProviderV2(boolean z11, l<? super ServiceLineProvider, k> lVar, r0 r0Var, ISwiggyNetworkWrapper iSwiggyNetworkWrapper, c cVar, p<? super Order, ? super Integer, k> pVar, l<? super Order, k> lVar2, OrderHistoryManager orderHistoryManager, jr.a aVar) {
        super(z11, lVar, r0Var, iSwiggyNetworkWrapper, cVar, pVar, lVar2);
        kotlin.jvm.internal.p.j(lVar, "selectedListener");
        kotlin.jvm.internal.p.j(r0Var, "resourceService");
        kotlin.jvm.internal.p.j(iSwiggyNetworkWrapper, "networkWrapper");
        kotlin.jvm.internal.p.j(cVar, "accountFragmentService");
        kotlin.jvm.internal.p.j(pVar, PLCardTypes.TYPE_REORDER_CARD);
        kotlin.jvm.internal.p.j(lVar2, "rateOrder");
        kotlin.jvm.internal.p.j(orderHistoryManager, "orderHistoryManager");
        kotlin.jvm.internal.p.j(aVar, "newrelicPerformanceUtils");
        this.t = pVar;
        this.f15185u = lVar2;
        this.v = orderHistoryManager;
        this.f15186w = aVar;
    }

    private final void R(Order order) {
        Order order2 = order;
        Address address = order2.mDeliveryAddress;
        String displayableAddress = address == null ? null : address.getDisplayableAddress();
        String str = order.getRestaurant().mName;
        String str2 = order2.mRestaurantAreaName;
        double d11 = order2.mTotalAmount;
        long j = order2.mOrderTime;
        Spanned fromHtml = Html.fromHtml(order2.mPLData.getOrderItemsFormatted());
        boolean isHelpDisabled = order.isHelpDisabled();
        boolean isNoRush = order.isNoRush();
        FoodServiceLineProviderV2$addToActiveOrder$vm$1 foodServiceLineProviderV2$addToActiveOrder$vm$1 = r2;
        FoodServiceLineProviderV2$addToActiveOrder$vm$1 foodServiceLineProviderV2$addToActiveOrder$vm$12 = new FoodServiceLineProviderV2$addToActiveOrder$vm$1(this, order2);
        FoodServiceLineProviderV2$addToActiveOrder$vm$2 foodServiceLineProviderV2$addToActiveOrder$vm$2 = r2;
        FoodServiceLineProviderV2$addToActiveOrder$vm$2 foodServiceLineProviderV2$addToActiveOrder$vm$22 = new FoodServiceLineProviderV2$addToActiveOrder$vm$2(this, order2);
        FoodServiceLineProviderV2$addToActiveOrder$vm$3 foodServiceLineProviderV2$addToActiveOrder$vm$3 = r2;
        FoodServiceLineProviderV2$addToActiveOrder$vm$3 foodServiceLineProviderV2$addToActiveOrder$vm$32 = new FoodServiceLineProviderV2$addToActiveOrder$vm$3(this, order2);
        OrderDetailPLData orderDetailPLData = order2.mPLData;
        s sVar = r2;
        s sVar2 = new s(true, displayableAddress, str, str2, d11, j, fromHtml, isHelpDisabled, true, isNoRush, foodServiceLineProviderV2$addToActiveOrder$vm$1, foodServiceLineProviderV2$addToActiveOrder$vm$2, foodServiceLineProviderV2$addToActiveOrder$vm$3, (String) null, (String) null, 0, orderDetailPLData, 57344, (i) null);
        g().x0(sVar);
        sVar.init();
        c().add(sVar);
    }

    private final void S(Order order, int i11) {
        if (order.mPLData.isOrderActive()) {
            R(order);
        } else {
            T(order, i11);
        }
    }

    private final void T(Order order, int i11) {
        Order order2 = order;
        Address address = order2.mDeliveryAddress;
        String displayableAddress = address == null ? null : address.getDisplayableAddress();
        String str = order.getRestaurant().mName;
        String str2 = order2.mRestaurantAreaName;
        double d11 = order2.mTotalAmount;
        Spanned fromHtml = Html.fromHtml(order2.mPLData.getOrderItemsFormatted());
        long j = order2.mOrderTime;
        boolean isReorderAllowed = order.isReorderAllowed();
        boolean z11 = order2.showRateUs;
        OrderRatingMeta orderRatingMeta = order2.orderRatingMeta;
        int i12 = order2.mHasRating;
        double d12 = order2.restaurantRating;
        boolean isNoRush = order.isNoRush();
        String str3 = order2.mOrderStatus;
        Boolean bool = Boolean.FALSE;
        Double valueOf = Double.valueOf(0.0d);
        FoodServiceLineProviderV2$addToPastOrder$vm$1 foodServiceLineProviderV2$addToPastOrder$vm$1 = r2;
        FoodServiceLineProviderV2$addToPastOrder$vm$1 foodServiceLineProviderV2$addToPastOrder$vm$12 = new FoodServiceLineProviderV2$addToPastOrder$vm$1(this, order2);
        FoodServiceLineProviderV2$addToPastOrder$vm$2 foodServiceLineProviderV2$addToPastOrder$vm$2 = r2;
        FoodServiceLineProviderV2$addToPastOrder$vm$2 foodServiceLineProviderV2$addToPastOrder$vm$22 = new FoodServiceLineProviderV2$addToPastOrder$vm$2(this, order2, i11);
        FoodServiceLineProviderV2$addToPastOrder$vm$3 foodServiceLineProviderV2$addToPastOrder$vm$3 = r2;
        FoodServiceLineProviderV2$addToPastOrder$vm$3 foodServiceLineProviderV2$addToPastOrder$vm$32 = new FoodServiceLineProviderV2$addToPastOrder$vm$3(this, order2);
        e0 e0Var = r2;
        e0 e0Var2 = new e0(displayableAddress, str, str2, d11, fromHtml, j, isReorderAllowed, true, z11, orderRatingMeta, i12, d12, isNoRush, str3, false, bool, valueOf, foodServiceLineProviderV2$addToPastOrder$vm$1, foodServiceLineProviderV2$addToPastOrder$vm$2, foodServiceLineProviderV2$addToPastOrder$vm$3, FoodServiceLineProviderV2$addToPastOrder$vm$4.f15200a, (String) null, 0, order2.mPLData, Y(order), (Double) null, (Boolean) null, 100663296, (i) null);
        g().x0(e0Var);
        e0Var.init();
        d().add(e0Var);
    }

    /* access modifiers changed from: private */
    public static final k c0(FoodServiceLineProviderV2 foodServiceLineProviderV2, ServiceLineProvider.b bVar, Response response) {
        String str;
        kotlin.jvm.internal.p.j(foodServiceLineProviderV2, "this$0");
        kotlin.jvm.internal.p.j(bVar, "$listener");
        kotlin.jvm.internal.p.j(response, "it");
        if (response instanceof Response.Success) {
            Response.Success success = (Response.Success) response;
            List<ListingCardEntity<?>> results = ((ListingResponse) success.getResponse()).getResults();
            foodServiceLineProviderV2.O(!results.isEmpty());
            if (foodServiceLineProviderV2.I()) {
                Object data = ((ListingCardEntity) s.h0(results)).getData();
                Objects.requireNonNull(data, "null cannot be cast to non-null type in.swiggy.android.tejas.oldapi.models.order.Order");
                str = ((Order) data).mOrderId;
            } else {
                str = null;
            }
            foodServiceLineProviderV2.N(str);
            int i11 = 0;
            for (T next : ((ListingResponse) success.getResponse()).getResults()) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    k.t();
                }
                Object data2 = ((ListingCardEntity) next).getData();
                Objects.requireNonNull(data2, "null cannot be cast to non-null type in.swiggy.android.tejas.oldapi.models.order.Order");
                foodServiceLineProviderV2.S((Order) data2, i11);
                i11 = i12;
            }
            bVar.b(foodServiceLineProviderV2);
        } else {
            foodServiceLineProviderV2.e0(response);
            bVar.a(foodServiceLineProviderV2);
        }
        return k.f22762a;
    }

    /* access modifiers changed from: private */
    public static final void d0(FoodServiceLineProviderV2 foodServiceLineProviderV2, ServiceLineProvider.b bVar, Throwable th2) {
        kotlin.jvm.internal.p.j(foodServiceLineProviderV2, "this$0");
        kotlin.jvm.internal.p.j(bVar, "$listener");
        kotlin.jvm.internal.p.i(th2, "it");
        foodServiceLineProviderV2.f0(th2);
        bVar.a(foodServiceLineProviderV2);
    }

    public final jr.a U() {
        return this.f15186w;
    }

    public final l<Order, k> V() {
        return this.f15185u;
    }

    public final RefundsViewModel.RefundsState W(OrderDetailPLData orderDetailPLData) {
        boolean z11;
        String superScriptText;
        if (orderDetailPLData == null) {
            return RefundsViewModel.RefundsState.DEFAULT;
        }
        for (Actions actions : orderDetailPLData.getActions()) {
            if (actions.getType() == PastOrderCTAEnum.PAST_ORDER_CTA_ENUM_REFUND_DETAILS) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                String str = "";
                if (!(actions == null || (superScriptText = actions.getSuperScriptText()) == null)) {
                    str = superScriptText;
                }
                if (kotlin.jvm.internal.p.e(str, "processing")) {
                    return RefundsViewModel.RefundsState.PROCESSING;
                }
                if (kotlin.jvm.internal.p.e(str, "completed")) {
                    return RefundsViewModel.RefundsState.COMPLETED;
                }
                return RefundsViewModel.RefundsState.DEFAULT;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final Actions X(Order order) {
        ArrayList arrayList;
        ArrayList<Actions> actions;
        kotlin.jvm.internal.p.j(order, OrderHelpTransformer.ISSUE_TYPE_ORDER);
        OrderDetailPLData orderDetailPLData = order.mPLData;
        if (orderDetailPLData == null || (actions = orderDetailPLData.getActions()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (T next : actions) {
                if (((Actions) next).getType() == PastOrderCTAEnum.PAST_ORDER_CTA_ENUM_REFUND_DETAILS) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            return (Actions) arrayList.get(0);
        }
        return null;
    }

    public final RefundsViewModel Y(Order order) {
        kotlin.jvm.internal.p.j(order, OrderHelpTransformer.ISSUE_TYPE_ORDER);
        if (!a0(order)) {
            return null;
        }
        return new RefundsViewModel(W(order.mPLData), this, order.mPLData, (String) null, new FoodServiceLineProviderV2$getRefundsViewModel$1(this, order), 8, (i) null);
    }

    public final p<Order, Integer, k> Z() {
        return this.t;
    }

    public final boolean a0(Order order) {
        kotlin.jvm.internal.p.j(order, OrderHelpTransformer.ISSUE_TYPE_ORDER);
        return X(order) != null;
    }

    public final b b0(ServiceLineProvider.b bVar) {
        kotlin.jvm.internal.p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        b t11 = this.v.getOrders(G(), H()).n(new q10.k(this, bVar)).f(new j(this, bVar)).x(wo0.a.c()).o(do0.a.a()).t();
        kotlin.jvm.internal.p.i(t11, "orderHistoryManager.getO…\n            .subscribe()");
        return t11;
    }

    public final void e0(Response<ListingResponse> response) {
        kotlin.jvm.internal.p.j(response, "response");
        HashMap hashMap = new HashMap();
        if (response instanceof Response.Failure) {
            Response.Failure failure = (Response.Failure) response;
            if (failure.getError() instanceof Error.UnhandledError) {
                StringBuilder sb2 = new StringBuilder();
                Error error = failure.getError();
                String str = null;
                Error.UnhandledError unhandledError = error instanceof Error.UnhandledError ? (Error.UnhandledError) error : null;
                if (unhandledError != null) {
                    str = unhandledError.getMessage();
                }
                sb2.append(str);
                sb2.append('/');
                sb2.append(failure.getErrorMessage());
                String sb3 = sb2.toString();
                if (sb3 == null) {
                    sb3 = "";
                }
                hashMap.put("food_service_line_v2_error", sb3);
                this.f15186w.b("food_service_line_provider_v2_error_transformation_error", hashMap);
            }
        }
    }

    public final void f0(Throwable th2) {
        kotlin.jvm.internal.p.j(th2, "exception");
        HashMap hashMap = new HashMap();
        String g02 = g0(th2);
        String message = th2.getMessage();
        if (message != null) {
            hashMap.put("food_service_line_v2_error", message + '/' + g02);
            U().b("food_service_line_provider_v2_error_api_failure", hashMap);
        }
    }

    public final String g0(Throwable th2) {
        kotlin.jvm.internal.p.j(th2, "throwable");
        try {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            String cls = th2.getClass().toString();
            kotlin.jvm.internal.p.i(cls, "throwable.javaClass.toString()");
            String str = (String) s.h0(StringsKt__StringsKt.H0(cls, new char[]{'.'}, false, 0, 6, (Object) null));
            kotlin.jvm.internal.p.i(stackTrace, "traces");
            ArrayList arrayList = new ArrayList(stackTrace.length);
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                kotlin.jvm.internal.p.i(className, "it.className");
                if (StringsKt__StringsKt.S(className, "swiggy", false, 2, (Object) null)) {
                    return str + '/' + stackTraceElement.getFileName() + '/' + stackTraceElement.getMethodName() + '/' + stackTraceElement.getLineNumber();
                }
                arrayList.add(k.f22762a);
            }
            return "";
        } catch (Exception e11) {
            u.h("FoodServiceLineProviderV2", e11);
            return "";
        }
    }

    public b w(ServiceLineProvider.b bVar) {
        kotlin.jvm.internal.p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        return b0(bVar);
    }
}
