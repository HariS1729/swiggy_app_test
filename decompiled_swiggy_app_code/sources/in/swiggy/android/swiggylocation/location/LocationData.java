package in.swiggy.android.swiggylocation.location;

import android.location.Location;
import cg0.s0;
import cg0.t0;
import cg0.u0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class LocationData extends LocationEvent {

    /* renamed from: b  reason: collision with root package name */
    private final Location f18816b;

    /* renamed from: c  reason: collision with root package name */
    private final t0 f18817c;

    public LocationData() {
        this((Location) null, (t0) null, 3, (i) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocationData(Location location, t0 t0Var) {
        super((i) null);
        p.j(location, "location");
        p.j(t0Var, "log");
        this.f18816b = location;
        this.f18817c = t0Var;
    }

    public final Location a() {
        return this.f18816b;
    }

    public final t0 b() {
        return this.f18817c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationData)) {
            return false;
        }
        LocationData locationData = (LocationData) obj;
        return p.e(this.f18816b, locationData.f18816b) && p.e(this.f18817c, locationData.f18817c);
    }

    public int hashCode() {
        return (this.f18816b.hashCode() * 31) + this.f18817c.hashCode();
    }

    public String toString() {
        return "LocationData(location=" + this.f18816b + ", log=" + this.f18817c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocationData(Location location, t0 t0Var, int i11, i iVar) {
        this((i11 & 1) != 0 ? new Location("") : location, (i11 & 2) != 0 ? new t0((s0) null, (u0) null, 3, (i) null) : t0Var);
    }
}
