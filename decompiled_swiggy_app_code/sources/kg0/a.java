package kg0;

import android.location.Location;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource;
import java.util.List;

/* compiled from: ILocationRefreshUtils.kt */
public interface a {
    void a(long j);

    boolean b();

    Location c();

    long d();

    void e(boolean z11);

    Address f();

    void g(boolean z11);

    SplashHalfCardTriggerSource h();

    boolean i();

    void j(Location location, Address address, List<Address> list, SplashHalfCardTriggerSource splashHalfCardTriggerSource);

    List<Address> k();
}
