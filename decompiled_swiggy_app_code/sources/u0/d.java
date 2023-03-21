package u0;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.internal.p;

/* compiled from: AndroidColorFilter.android.kt */
public final class d {
    public static final e0 a(float[] fArr) {
        p.j(fArr, "colorMatrix");
        return new e0(new ColorMatrixColorFilter(fArr));
    }

    public static final e0 b(long j, int i11) {
        ColorFilter colorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            colorFilter = t.f16887a.a(j, i11);
        } else {
            colorFilter = new PorterDuffColorFilter(f0.j(j), a.b(i11));
        }
        return new e0(colorFilter);
    }

    public static final ColorFilter c(e0 e0Var) {
        p.j(e0Var, "<this>");
        return e0Var.a();
    }
}
