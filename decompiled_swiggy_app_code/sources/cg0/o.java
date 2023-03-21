package cg0;

import android.location.Location;
import in.swiggy.android.swiggylocation.location.b;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.address.model.AddressSortingWeight;
import java.util.List;

/* compiled from: IUserLocationManager.kt */
public interface o {
    Address c();

    void d(Address address);

    AddressSortingWeight e();

    boolean f(b bVar);

    List<Address> g(Location location, List<Address> list, AddressSortingWeight addressSortingWeight);

    String getCustomerId();

    int getDefaultingType();

    double getProximityWeight();

    boolean h();

    void i(int i11, double d11, List<Address> list);

    double j(Address address, Location location, AddressSortingWeight addressSortingWeight);

    List<Address> k();
}
