package in.swiggy.android.swiggylocation.location;

import android.location.Location;
import cg0.t0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: LocationUtils.kt */
public final class InvalidLocation extends LocationEvent {

    /* renamed from: b  reason: collision with root package name */
    private final LocationData f18805b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f18806c;

    public InvalidLocation() {
        this((LocationData) null, (Throwable) null, 3, (i) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidLocation(LocationData locationData, Throwable th2) {
        super((i) null);
        p.j(locationData, "locationData");
        this.f18805b = locationData;
        this.f18806c = th2;
    }

    public final LocationData a() {
        return this.f18805b;
    }

    public final Throwable b() {
        return this.f18806c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvalidLocation)) {
            return false;
        }
        InvalidLocation invalidLocation = (InvalidLocation) obj;
        return p.e(this.f18805b, invalidLocation.f18805b) && p.e(this.f18806c, invalidLocation.f18806c);
    }

    public int hashCode() {
        int hashCode = this.f18805b.hashCode() * 31;
        Throwable th2 = this.f18806c;
        return hashCode + (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "InvalidLocation(locationData=" + this.f18805b + ", throwable=" + this.f18806c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InvalidLocation(LocationData locationData, Throwable th2, int i11, i iVar) {
        this((i11 & 1) != 0 ? new LocationData((Location) null, (t0) null, 3, (i) null) : locationData, (i11 & 2) != 0 ? null : th2);
    }
}
