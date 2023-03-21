package cg0;

import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;

/* compiled from: LinearInterpolator.kt */
public final class t {
    public LatLng a(float f11, LatLng latLng, LatLng latLng2) {
        p.j(latLng, PDPageLabelRange.STYLE_LETTERS_LOWER);
        p.j(latLng2, "b");
        double d11 = latLng2.f43937a;
        double d12 = latLng.f43937a;
        double d13 = (double) f11;
        double d14 = ((d11 - d12) * d13) + d12;
        double d15 = latLng2.f43938b;
        double d16 = latLng.f43938b;
        return new LatLng(d14, ((d15 - d16) * d13) + d16);
    }
}
