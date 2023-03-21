package in.swiggy.android.swiggylynx.plugin.location.selectedlocation;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: SelectedLocationPayload.kt */
public final class SelectedLocationPayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final double f19155a;

    /* renamed from: b  reason: collision with root package name */
    private final double f19156b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19157c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19158d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19159e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19160f;

    /* compiled from: SelectedLocationPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<SelectedLocationPayload> serializer() {
            return SelectedLocationPayload$$serializer.INSTANCE;
        }
    }

    public SelectedLocationPayload(double d11, double d12, String str, String str2, String str3, String str4) {
        p.j(str, "addressId");
        p.j(str2, "annotation");
        p.j(str3, "displayableName");
        p.j(str4, "addressTag");
        this.f19155a = d11;
        this.f19156b = d12;
        this.f19157c = str;
        this.f19158d = str2;
        this.f19159e = str3;
        this.f19160f = str4;
    }

    public static final void a(SelectedLocationPayload selectedLocationPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(selectedLocationPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.C(serialDescriptor, 0, selectedLocationPayload.f19155a);
        dVar.C(serialDescriptor, 1, selectedLocationPayload.f19156b);
        dVar.n(serialDescriptor, 2, selectedLocationPayload.f19157c);
        dVar.n(serialDescriptor, 3, selectedLocationPayload.f19158d);
        dVar.n(serialDescriptor, 4, selectedLocationPayload.f19159e);
        dVar.n(serialDescriptor, 5, selectedLocationPayload.f19160f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedLocationPayload)) {
            return false;
        }
        SelectedLocationPayload selectedLocationPayload = (SelectedLocationPayload) obj;
        return p.e(Double.valueOf(this.f19155a), Double.valueOf(selectedLocationPayload.f19155a)) && p.e(Double.valueOf(this.f19156b), Double.valueOf(selectedLocationPayload.f19156b)) && p.e(this.f19157c, selectedLocationPayload.f19157c) && p.e(this.f19158d, selectedLocationPayload.f19158d) && p.e(this.f19159e, selectedLocationPayload.f19159e) && p.e(this.f19160f, selectedLocationPayload.f19160f);
    }

    public int hashCode() {
        return (((((((((Double.doubleToLongBits(this.f19155a) * 31) + Double.doubleToLongBits(this.f19156b)) * 31) + this.f19157c.hashCode()) * 31) + this.f19158d.hashCode()) * 31) + this.f19159e.hashCode()) * 31) + this.f19160f.hashCode();
    }

    public String toString() {
        return "SelectedLocationPayload(lat=" + this.f19155a + ", lng=" + this.f19156b + ", addressId=" + this.f19157c + ", annotation=" + this.f19158d + ", displayableName=" + this.f19159e + ", addressTag=" + this.f19160f + ')';
    }

    public /* synthetic */ SelectedLocationPayload(int i11, double d11, double d12, String str, String str2, String str3, String str4, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19155a = d11;
            if ((i11 & 2) != 0) {
                this.f19156b = d12;
                if ((i11 & 4) != 0) {
                    this.f19157c = str;
                    if ((i11 & 8) != 0) {
                        this.f19158d = str2;
                        if ((i11 & 16) != 0) {
                            this.f19159e = str3;
                            if ((i11 & 32) != 0) {
                                this.f19160f = str4;
                                return;
                            }
                            throw new MissingFieldException("addressTag");
                        }
                        throw new MissingFieldException("displayableName");
                    }
                    throw new MissingFieldException("annotation");
                }
                throw new MissingFieldException("addressId");
            }
            throw new MissingFieldException("lng");
        }
        throw new MissingFieldException("lat");
    }
}
