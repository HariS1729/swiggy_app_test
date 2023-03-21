package cg0;

import in.swiggy.android.swiggylocation.location.LocationContextExtensionKt;
import in.swiggy.android.tejas.feature.address.model.Address;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ double f12958a;

    public /* synthetic */ h0(double d11) {
        this.f12958a = d11;
    }

    public final int compare(Object obj, Object obj2) {
        return LocationContextExtensionKt.n(this.f12958a, (Address) obj, (Address) obj2);
    }
}
