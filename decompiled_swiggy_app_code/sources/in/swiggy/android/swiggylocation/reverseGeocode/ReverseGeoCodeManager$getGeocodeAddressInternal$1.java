package in.swiggy.android.swiggylocation.reverseGeocode;

import com.google.android.gms.maps.model.LatLng;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager", f = "ReverseGeoCodeManager.kt", l = {49}, m = "getGeocodeAddressInternal")
/* compiled from: ReverseGeoCodeManager.kt */
final class ReverseGeoCodeManager$getGeocodeAddressInternal$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f18912a;

    /* renamed from: b  reason: collision with root package name */
    Object f18913b;

    /* renamed from: c  reason: collision with root package name */
    boolean f18914c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f18915d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ReverseGeoCodeManager f18916e;

    /* renamed from: f  reason: collision with root package name */
    int f18917f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReverseGeoCodeManager$getGeocodeAddressInternal$1(ReverseGeoCodeManager reverseGeoCodeManager, c<? super ReverseGeoCodeManager$getGeocodeAddressInternal$1> cVar) {
        super(cVar);
        this.f18916e = reverseGeoCodeManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.f18915d = obj;
        this.f18917f |= Integer.MIN_VALUE;
        return this.f18916e.c((LatLng) null, (String) null, false, this);
    }
}
