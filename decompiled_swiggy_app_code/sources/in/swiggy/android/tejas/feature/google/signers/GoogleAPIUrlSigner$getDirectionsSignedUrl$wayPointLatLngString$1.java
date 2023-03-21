package in.swiggy.android.tejas.feature.google.signers;

import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: GoogleAPIUrlSigner.kt */
final class GoogleAPIUrlSigner$getDirectionsSignedUrl$wayPointLatLngString$1 extends Lambda implements l<LatLng, CharSequence> {
    public static final GoogleAPIUrlSigner$getDirectionsSignedUrl$wayPointLatLngString$1 INSTANCE = new GoogleAPIUrlSigner$getDirectionsSignedUrl$wayPointLatLngString$1();

    GoogleAPIUrlSigner$getDirectionsSignedUrl$wayPointLatLngString$1() {
        super(1);
    }

    public final CharSequence invoke(LatLng latLng) {
        p.j(latLng, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(latLng.f43937a);
        sb2.append(',');
        sb2.append(latLng.f43938b);
        return sb2.toString();
    }
}
