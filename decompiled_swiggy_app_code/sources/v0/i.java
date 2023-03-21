package v0;

import androidx.compose.ui.graphics.colorspace.a;
import kotlin.jvm.internal.p;

/* compiled from: Xyz.kt */
public final class i extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, int i11) {
        super(str, b.f17013a.c(), i11, (kotlin.jvm.internal.i) null);
        p.j(str, "name");
    }

    private final float j(float f11) {
        return l.l(f11, -2.0f, 2.0f);
    }

    public float[] a(float[] fArr) {
        p.j(fArr, "v");
        fArr[0] = j(fArr[0]);
        fArr[1] = j(fArr[1]);
        fArr[2] = j(fArr[2]);
        return fArr;
    }

    public float d(int i11) {
        return 2.0f;
    }

    public float e(int i11) {
        return -2.0f;
    }

    public float[] i(float[] fArr) {
        p.j(fArr, "v");
        fArr[0] = j(fArr[0]);
        fArr[1] = j(fArr[1]);
        fArr[2] = j(fArr[2]);
        return fArr;
    }
}
