package z;

import d2.h;
import kotlin.jvm.internal.p;

/* compiled from: RoundedCornerShape.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final f f18041a = a(50);

    public static final f a(int i11) {
        return b(c.a(i11));
    }

    public static final f b(b bVar) {
        p.j(bVar, "corner");
        return new f(bVar, bVar, bVar, bVar);
    }

    public static final f c(float f11) {
        return b(c.b(f11));
    }

    public static final f d(float f11, float f12, float f13, float f14) {
        return new f(c.b(f11), c.b(f12), c.b(f13), c.b(f14));
    }

    public static /* synthetic */ f e(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.n((float) 0);
        }
        if ((i11 & 2) != 0) {
            f12 = h.n((float) 0);
        }
        if ((i11 & 4) != 0) {
            f13 = h.n((float) 0);
        }
        if ((i11 & 8) != 0) {
            f14 = h.n((float) 0);
        }
        return d(f11, f12, f13, f14);
    }

    public static final f f() {
        return f18041a;
    }
}
