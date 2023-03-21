package n5;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15841a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f15842b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f15843c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f15844d = false;

    public static void a(Object obj) {
        if (f15841a) {
            c.J((Object) null);
        } else {
            b.l((Camera.AutoFocusCallback) null);
        }
    }

    public static boolean b() {
        if (f15841a) {
            return c.f();
        }
        return b.K();
    }

    public static void c(Context context, boolean z11) {
        if (f15841a) {
            c.G(context, z11);
        } else {
            b.t(z11);
        }
    }

    public static boolean d(Context context) {
        return f15841a;
    }

    public static boolean e() {
        if (f15841a) {
            return c.j();
        }
        return b.P();
    }

    public static boolean f() {
        return f15844d;
    }

    public static boolean g() {
        if (f15841a) {
            return c.i();
        }
        return b.O();
    }

    public static boolean h() {
        return f15843c;
    }

    public static boolean i() {
        return f15842b;
    }

    public static void j() {
        if (f15841a) {
            c.l();
        } else {
            b.Q();
        }
    }

    public static void k(byte[] bArr, int i11, int i12, int i13, byte[] bArr2) {
        int i14;
        int i15;
        if (i13 % 90 != 0 || i13 < 0 || i13 > 270) {
            throw new IllegalArgumentException("0 <= rotation < 360, rotation % 90 == 0");
        }
        boolean z11 = i13 % 180 != 0;
        boolean z12 = i13 % 270 != 0;
        boolean z13 = i13 >= 180;
        int i16 = z11 ? i12 : i11;
        int i17 = z11 ? i11 : i12;
        if (z11) {
            i14 = (z12 ? i16 - 1 : 0) + (z13 ? (i17 - 1) * i16 : 0);
            i15 = (i17 * i16) + 1;
        } else {
            i14 = (z12 ? i16 - 1 : 0) + ((z13 ? i17 - 1 : 0) * i16);
            i15 = 0;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < i12; i19++) {
            if (z11) {
                int i21 = 0;
                while (i21 < i11) {
                    int i22 = i18 + 1;
                    bArr2[i14] = (byte) (bArr[i18] & 255);
                    i14 += z13 ? -i16 : i16;
                    i21++;
                    i18 = i22;
                }
                i14 += z13 ? i15 : -i15;
            } else {
                int i23 = 0;
                while (i23 < i11) {
                    int i24 = i18 + 1;
                    bArr2[i14] = (byte) (bArr[i18] & 255);
                    i14 += z12 ? -1 : 1;
                    i23++;
                    i18 = i24;
                }
            }
        }
    }

    public static void l(boolean z11) {
        if (f15841a) {
            c.R(z11);
        } else {
            b.w(z11);
        }
    }

    public static void m(double d11) {
        if (f15841a) {
            c.D(d11);
        } else {
            b.g(d11);
        }
    }

    public static void n(Map<String, Boolean> map) {
        if (map.containsKey("camera2")) {
            f15841a = map.get("camera2").booleanValue();
        }
    }

    public static void o(int i11) {
        if (f15841a) {
            c.c0(i11);
        } else {
            b.v(i11);
        }
    }

    public static void p(boolean z11) {
        f15842b = z11;
    }

    public static void q(Point point) {
        if (f15841a) {
            c.H(point);
        } else {
            b.j(point);
        }
    }

    public static void r(boolean z11) {
        if (f15841a) {
            c.W(z11);
        } else {
            b.y(z11);
        }
    }

    public static void s(float f11) {
        if (f15841a) {
            c.U(f11);
        } else {
            b.h(f11);
        }
    }

    public static void t() {
        if (!f15841a) {
            b.U();
        }
    }
}
