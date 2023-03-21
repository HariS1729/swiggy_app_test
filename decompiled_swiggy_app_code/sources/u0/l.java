package u0;

import android.graphics.DashPathEffect;
import kotlin.jvm.internal.p;

/* compiled from: AndroidPathEffect.android.kt */
public final class l {
    public static final x0 a(float[] fArr, float f11) {
        p.j(fArr, "intervals");
        return new k(new DashPathEffect(fArr, f11));
    }
}
