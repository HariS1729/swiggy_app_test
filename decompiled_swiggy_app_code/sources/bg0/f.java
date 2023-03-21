package bg0;

import android.animation.TypeEvaluator;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: PolylinePointEvaluator */
public class f implements TypeEvaluator<LatLng> {
    /* renamed from: a */
    public LatLng evaluate(float f11, LatLng latLng, LatLng latLng2) {
        double d11 = latLng.f43937a;
        double d12 = (double) f11;
        double d13 = latLng.f43938b;
        return new LatLng(d11 + ((latLng2.f43937a - d11) * d12), d13 + (d12 * (latLng2.f43938b - d13)));
    }
}
