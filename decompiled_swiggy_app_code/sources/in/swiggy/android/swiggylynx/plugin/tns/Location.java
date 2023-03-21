package in.swiggy.android.swiggylynx.plugin.tns;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Location.kt */
public final class Location {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19507a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19508b;

    /* compiled from: Location.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<Location> serializer() {
            return Location$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Location(int i11, String str, String str2, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19507a = str;
            if ((i11 & 2) != 0) {
                this.f19508b = str2;
                return;
            }
            throw new MissingFieldException("long");
        }
        throw new MissingFieldException("lat");
    }

    public static final void a(Location location, d dVar, SerialDescriptor serialDescriptor) {
        p.j(location, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, location.f19507a);
        dVar.n(serialDescriptor, 1, location.f19508b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return p.e(this.f19507a, location.f19507a) && p.e(this.f19508b, location.f19508b);
    }

    public int hashCode() {
        return (this.f19507a.hashCode() * 31) + this.f19508b.hashCode();
    }

    public String toString() {
        return "Location(lat=" + this.f19507a + ", long=" + this.f19508b + ')';
    }

    public Location(String str, String str2) {
        p.j(str, "lat");
        p.j(str2, "long");
        this.f19507a = str;
        this.f19508b = str2;
    }
}
