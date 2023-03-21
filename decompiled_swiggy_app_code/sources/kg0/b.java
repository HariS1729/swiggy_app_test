package kg0;

import android.location.Location;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.feature.location.model.SplashHalfCardTriggerSource;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: LocationRefreshUtils.kt */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private Boolean f19641a;

    /* renamed from: b  reason: collision with root package name */
    private Long f19642b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f19643c;

    /* renamed from: d  reason: collision with root package name */
    private Location f19644d;

    /* renamed from: e  reason: collision with root package name */
    private Address f19645e;

    /* renamed from: f  reason: collision with root package name */
    private List<Address> f19646f;

    /* renamed from: g  reason: collision with root package name */
    private SplashHalfCardTriggerSource f19647g;

    public void a(long j) {
        this.f19642b = Long.valueOf(j);
    }

    public boolean b() {
        Boolean bool = this.f19643c;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public Location c() {
        return this.f19644d;
    }

    public long d() {
        Long l11 = this.f19642b;
        return l11 == null ? System.currentTimeMillis() : l11.longValue();
    }

    public void e(boolean z11) {
        this.f19643c = Boolean.valueOf(z11);
    }

    public Address f() {
        return this.f19645e;
    }

    public void g(boolean z11) {
        this.f19641a = Boolean.valueOf(z11);
    }

    public SplashHalfCardTriggerSource h() {
        return this.f19647g;
    }

    public boolean i() {
        Boolean bool = this.f19641a;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void j(Location location, Address address, List<Address> list, SplashHalfCardTriggerSource splashHalfCardTriggerSource) {
        p.j(splashHalfCardTriggerSource, "splashHalfCardSource");
        this.f19644d = location;
        this.f19645e = address;
        this.f19646f = list;
        this.f19647g = splashHalfCardTriggerSource;
    }

    public List<Address> k() {
        return this.f19646f;
    }
}
