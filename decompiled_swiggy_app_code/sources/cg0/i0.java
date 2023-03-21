package cg0;

import android.location.Location;
import in.swiggy.android.swiggylocation.location.LocationContextExtensionKt;
import in.swiggy.android.tejas.feature.address.model.Address;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Location f12961a;

    public /* synthetic */ i0(Location location) {
        this.f12961a = location;
    }

    public final int compare(Object obj, Object obj2) {
        return LocationContextExtensionKt.Z(this.f12961a, (Address) obj, (Address) obj2);
    }
}
