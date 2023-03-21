package in.swiggy.android.swiggylocation.utils.eventmanager.interfaces;

import in.swiggy.android.tejas.feature.location.model.AddressAttribute;
import in.swiggy.android.tejas.feature.location.model.GpsOffLocationAttributes;
import in.swiggy.android.tejas.feature.location.model.HalfCardAttributes;
import in.swiggy.android.tejas.feature.location.model.LocationCommonAttributes;
import java.io.Serializable;

/* compiled from: ILocationEventManager.kt */
public interface ILocationEventManager extends Serializable {
    void B(GpsOffLocationAttributes gpsOffLocationAttributes);

    void G3(AddressAttribute addressAttribute);

    void J0(String str);

    void V2(String str);

    void f0(String str);

    void g1(LocationCommonAttributes locationCommonAttributes);

    void m2(HalfCardAttributes halfCardAttributes);

    void r2(AddressAttribute addressAttribute);

    void r3(AddressAttribute addressAttribute);

    void u(AddressAttribute addressAttribute);

    void x3(AddressAttribute addressAttribute);

    LocationCommonAttributes z1();
}
