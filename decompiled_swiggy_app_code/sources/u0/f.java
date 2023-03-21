package u0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.a;
import kotlin.jvm.internal.p;
import u0.m0;

/* compiled from: AndroidImageBitmap.android.kt */
public final class f {
    public static final l0 a(int i11, int i12, int i13, boolean z11, a aVar) {
        Bitmap bitmap;
        p.j(aVar, "colorSpace");
        Bitmap.Config d11 = d(i13);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmap = r.c(i11, i12, i13, z11, aVar);
        } else {
            bitmap = Bitmap.createBitmap((DisplayMetrics) null, i11, i12, d11);
            p.i(bitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmap.setHasAlpha(z11);
        }
        return new e(bitmap);
    }

    public static final Bitmap b(l0 l0Var) {
        p.j(l0Var, "<this>");
        if (l0Var instanceof e) {
            return ((e) l0Var).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final l0 c(Bitmap bitmap) {
        p.j(bitmap, "<this>");
        return new e(bitmap);
    }

    public static final Bitmap.Config d(int i11) {
        m0.a aVar = m0.f16830b;
        if (m0.i(i11, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (m0.i(i11, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (m0.i(i11, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && m0.i(i11, aVar.c())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i12 < 26 || !m0.i(i11, aVar.d())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.HARDWARE;
    }

    public static final int e(Bitmap.Config config) {
        p.j(config, "<this>");
        if (config == Bitmap.Config.ALPHA_8) {
            return m0.f16830b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return m0.f16830b.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return m0.f16830b.b();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && config == Bitmap.Config.RGBA_F16) {
            return m0.f16830b.c();
        }
        if (i11 < 26 || config != Bitmap.Config.HARDWARE) {
            return m0.f16830b.b();
        }
        return m0.f16830b.d();
    }
}
