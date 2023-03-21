package r0;

import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.jvm.internal.p;
import p0.d;
import u0.d1;
import u0.j1;

/* compiled from: Scale.kt */
public final class j {
    public static final d a(d dVar, float f11) {
        p.j(dVar, "<this>");
        return b(dVar, f11, f11);
    }

    public static final d b(d dVar, float f11, float f12) {
        d dVar2 = dVar;
        p.j(dVar2, "<this>");
        boolean z11 = true;
        if (f11 == 1.0f) {
            if (f12 != 1.0f) {
                z11 = false;
            }
            if (z11) {
                return dVar2;
            }
        }
        return GraphicsLayerModifierKt.e(dVar, f11, f12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (j1) null, false, (d1) null, 0, 0, 65532, (Object) null);
    }
}
