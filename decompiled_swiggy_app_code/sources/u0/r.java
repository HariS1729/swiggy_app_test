package u0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.a;
import kotlin.jvm.internal.p;

/* compiled from: AndroidImageBitmap.android.kt */
final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f16861a = new r();

    private r() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = b(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.ui.graphics.colorspace.a a(android.graphics.Bitmap r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.p.j(r1, r0)
            android.graphics.ColorSpace r1 = r1.getColorSpace()
            if (r1 == 0) goto L_0x0012
            androidx.compose.ui.graphics.colorspace.a r1 = b(r1)
            if (r1 == 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            androidx.compose.ui.graphics.colorspace.ColorSpaces r1 = androidx.compose.ui.graphics.colorspace.ColorSpaces.f6442a
            androidx.compose.ui.graphics.colorspace.Rgb r1 = r1.s()
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.r.a(android.graphics.Bitmap):androidx.compose.ui.graphics.colorspace.a");
    }

    public static final a b(ColorSpace colorSpace) {
        p.j(colorSpace, "<this>");
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB))) {
            return ColorSpaces.f6442a.s();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.ACES))) {
            return ColorSpaces.f6442a.a();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return ColorSpaces.f6442a.b();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return ColorSpaces.f6442a.c();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020))) {
            return ColorSpaces.f6442a.d();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.BT709))) {
            return ColorSpaces.f6442a.e();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return ColorSpaces.f6442a.f();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return ColorSpaces.f6442a.g();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return ColorSpaces.f6442a.i();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return ColorSpaces.f6442a.j();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return ColorSpaces.f6442a.k();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return ColorSpaces.f6442a.l();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return ColorSpaces.f6442a.m();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return ColorSpaces.f6442a.n();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return ColorSpaces.f6442a.q();
        }
        if (p.e(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
            return ColorSpaces.f6442a.r();
        }
        return ColorSpaces.f6442a.s();
    }

    public static final Bitmap c(int i11, int i12, int i13, boolean z11, a aVar) {
        p.j(aVar, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i11, i12, f.d(i13), z11, d(aVar));
        p.i(createBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return createBitmap;
    }

    public static final ColorSpace d(a aVar) {
        ColorSpace.Named named;
        p.j(aVar, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.f6442a;
        if (p.e(aVar, colorSpaces.s())) {
            named = ColorSpace.Named.SRGB;
        } else if (p.e(aVar, colorSpaces.a())) {
            named = ColorSpace.Named.ACES;
        } else if (p.e(aVar, colorSpaces.b())) {
            named = ColorSpace.Named.ACESCG;
        } else if (p.e(aVar, colorSpaces.c())) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (p.e(aVar, colorSpaces.d())) {
            named = ColorSpace.Named.BT2020;
        } else if (p.e(aVar, colorSpaces.e())) {
            named = ColorSpace.Named.BT709;
        } else if (p.e(aVar, colorSpaces.f())) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (p.e(aVar, colorSpaces.g())) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (p.e(aVar, colorSpaces.i())) {
            named = ColorSpace.Named.DCI_P3;
        } else if (p.e(aVar, colorSpaces.j())) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (p.e(aVar, colorSpaces.k())) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (p.e(aVar, colorSpaces.l())) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (p.e(aVar, colorSpaces.m())) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (p.e(aVar, colorSpaces.n())) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (p.e(aVar, colorSpaces.q())) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else if (p.e(aVar, colorSpaces.r())) {
            named = ColorSpace.Named.SMPTE_C;
        } else {
            named = ColorSpace.Named.SRGB;
        }
        ColorSpace colorSpace = ColorSpace.get(named);
        p.i(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
