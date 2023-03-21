package u0;

import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.a;
import kotlin.jvm.internal.p;

/* compiled from: ImageBitmap.kt */
public final class n0 {
    public static final l0 a(int i11, int i12, int i13, boolean z11, a aVar) {
        p.j(aVar, "colorSpace");
        return f.a(i11, i12, i13, z11, aVar);
    }

    public static /* synthetic */ l0 b(int i11, int i12, int i13, boolean z11, a aVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i13 = m0.f16830b.b();
        }
        if ((i14 & 8) != 0) {
            z11 = true;
        }
        if ((i14 & 16) != 0) {
            aVar = ColorSpaces.f6442a.s();
        }
        return a(i11, i12, i13, z11, aVar);
    }
}
