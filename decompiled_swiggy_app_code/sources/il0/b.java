package il0;

import com.google.android.gms.maps.model.LatLng;
import com.swiggy.pos.service.grpc.v1.Annotation;
import kotlin.jvm.internal.p;

/* compiled from: TrackMapModels.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final LatLng f20196a;

    /* renamed from: b  reason: collision with root package name */
    private final Annotation f20197b;

    public b(LatLng latLng, Annotation annotation) {
        this.f20196a = latLng;
        this.f20197b = annotation;
    }

    public final Annotation a() {
        return this.f20197b;
    }

    public final LatLng b() {
        return this.f20196a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p.e(this.f20196a, bVar.f20196a) && p.e(this.f20197b, bVar.f20197b);
    }

    public int hashCode() {
        LatLng latLng = this.f20196a;
        int i11 = 0;
        int hashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
        Annotation annotation = this.f20197b;
        if (annotation != null) {
            i11 = annotation.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "CustomerMarkerConfig(latLng=" + this.f20196a + ", annotation=" + this.f20197b + ')';
    }
}
