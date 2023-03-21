package u0;

import android.graphics.Shader;
import com.BV.LinearGradient.LinearGradientManager;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: Shader.kt */
public final class g1 {
    public static final Shader a(long j, long j11, List<d0> list, List<Float> list2, int i11) {
        p.j(list, LinearGradientManager.PROP_COLORS);
        return p.a(j, j11, list, list2, i11);
    }

    public static final Shader b(long j, List<d0> list, List<Float> list2) {
        p.j(list, LinearGradientManager.PROP_COLORS);
        return p.b(j, list, list2);
    }
}
