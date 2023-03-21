package lg0;

import androidx.lifecycle.k0;
import cg0.n;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import ef0.e;
import in.juspay.hyper.constants.LogSubCategory;
import in.swiggy.android.mvvm.aarch.CoreViewModel;
import in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager;
import in.swiggy.android.swiggylynx.model.DeliveryRatingClickEventNavArgs;
import in.swiggy.android.swiggylynx.model.DeliveryRatingContextData;
import in.swiggy.android.swiggylynx.plugin.location.LocationHandler;
import in.swiggy.android.tejas.feature.address.v2.usecase.UpdateAddressUseCase;
import kg0.a;
import kotlin.jvm.internal.p;
import os.g0;

@Instrumented
/* compiled from: LynxActivityViewModel.kt */
public final class b extends CoreViewModel {

    /* renamed from: h  reason: collision with root package name */
    public ir.b f19664h;

    /* renamed from: i  reason: collision with root package name */
    public n f19665i;
    public a j;
    public e k;

    /* renamed from: l  reason: collision with root package name */
    public UpdateAddressUseCase f19666l;

    /* renamed from: m  reason: collision with root package name */
    public ReverseGeoCodeManager f19667m;
    private final eo0.a n = new eo0.a();

    /* renamed from: o  reason: collision with root package name */
    public LocationHandler f19668o;

    public final LocationHandler J1() {
        LocationHandler locationHandler = this.f19668o;
        if (locationHandler != null) {
            return locationHandler;
        }
        p.B("locationHandler");
        return null;
    }

    public final a K1() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar;
        }
        p.B("locationRefreshUtils");
        return null;
    }

    public final ReverseGeoCodeManager L1() {
        ReverseGeoCodeManager reverseGeoCodeManager = this.f19667m;
        if (reverseGeoCodeManager != null) {
            return reverseGeoCodeManager;
        }
        p.B("reverseGeoCodeManager");
        return null;
    }

    public final UpdateAddressUseCase M1() {
        UpdateAddressUseCase updateAddressUseCase = this.f19666l;
        if (updateAddressUseCase != null) {
            return updateAddressUseCase;
        }
        p.B("updateAddressUseCase");
        return null;
    }

    public final void N1(DeliveryRatingClickEventNavArgs deliveryRatingClickEventNavArgs) {
        p.j(deliveryRatingClickEventNavArgs, "args");
        String ratingSource = deliveryRatingClickEventNavArgs.getRatingSource();
        if (ratingSource != null && (!o.A(ratingSource))) {
            String pnTitle = deliveryRatingClickEventNavArgs.getPnTitle();
            String orderId = deliveryRatingClickEventNavArgs.getOrderId();
            DeliveryRatingContextData deliveryRatingContextData = new DeliveryRatingContextData(ratingSource, pnTitle);
            ir.b k02 = k0();
            ir.b k03 = k0();
            Gson i11 = g0.i();
            k02.j(k03.k("delivery-rating", "click-delivery-rating", orderId, 9999, (!(i11 instanceof Gson) ? i11.toJson((Object) deliveryRatingContextData) : GsonInstrumentation.toJson(i11, (Object) deliveryRatingContextData)).toString()));
        }
    }

    public final void O1(LocationHandler locationHandler) {
        p.j(locationHandler, "<set-?>");
        this.f19668o = locationHandler;
    }

    public final void P1() {
        String F0 = e().F0();
        if (F0 != null && o.A(F0)) {
            J1().x();
        }
    }

    public final e d() {
        e eVar = this.k;
        if (eVar != null) {
            return eVar;
        }
        p.B(LogSubCategory.Action.USER);
        return null;
    }

    public final n e() {
        n nVar = this.f19665i;
        if (nVar != null) {
            return nVar;
        }
        p.B("locationContext");
        return null;
    }

    public void i1() {
        super.i1();
        this.n.dispose();
    }

    public void init() {
        super.init();
        O1(new LocationHandler(e(), this.n, K1(), d(), M1(), k0.a(this), L1()));
    }

    public final ir.b k0() {
        ir.b bVar = this.f19664h;
        if (bVar != null) {
            return bVar;
        }
        p.B("swiggyEventHandler");
        return null;
    }
}
