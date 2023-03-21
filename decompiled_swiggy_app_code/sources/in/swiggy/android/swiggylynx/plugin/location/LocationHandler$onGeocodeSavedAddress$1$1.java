package in.swiggy.android.swiggylynx.plugin.location;

import bp0.g;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.address.model.AddAddressData;
import in.swiggy.android.tejas.feature.address.model.Address;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "in.swiggy.android.swiggylynx.plugin.location.LocationHandler$onGeocodeSavedAddress$1$1", f = "LocationHandler.kt", l = {}, m = "invokeSuspend")
/* compiled from: LocationHandler.kt */
final class LocationHandler$onGeocodeSavedAddress$1$1 extends SuspendLambda implements p<Response<? extends SwiggyApiResponse<AddAddressData>>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f19145a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocationHandler f19146b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Address f19147c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LocationHandler$onGeocodeSavedAddress$1$1(LocationHandler locationHandler, Address address, c<? super LocationHandler$onGeocodeSavedAddress$1$1> cVar) {
        super(2, cVar);
        this.f19146b = locationHandler;
        this.f19147c = address;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new LocationHandler$onGeocodeSavedAddress$1$1(this.f19146b, this.f19147c, cVar);
    }

    public final Object invoke(Response<SwiggyApiResponse<AddAddressData>> response, c<? super k> cVar) {
        return ((LocationHandler$onGeocodeSavedAddress$1$1) create(response, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f19145a == 0) {
            g.b(obj);
            this.f19146b.f19130d.r1(this.f19147c);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
