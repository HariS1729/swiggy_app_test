package t0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: RoundRect.kt */
public final class k {
    public static final j a(float f11, float f12, float f13, float f14, float f15, float f16) {
        long a11 = b.a(f15, f16);
        return new j(f11, f12, f13, f14, a11, a11, a11, a11, (i) null);
    }

    public static final j b(h hVar, long j, long j11, long j12, long j13) {
        h hVar2 = hVar;
        p.j(hVar, "rect");
        return new j(hVar.i(), hVar.l(), hVar.j(), hVar.e(), j, j11, j12, j13, (i) null);
    }

    public static final j c(float f11, float f12, float f13, float f14, long j) {
        return a(f11, f12, f13, f14, a.d(j), a.e(j));
    }

    public static final boolean d(j jVar) {
        p.j(jVar, "<this>");
        if (a.d(jVar.h()) == a.e(jVar.h())) {
            if (a.d(jVar.h()) == a.d(jVar.i())) {
                if (a.d(jVar.h()) == a.e(jVar.i())) {
                    if (a.d(jVar.h()) == a.d(jVar.c())) {
                        if (a.d(jVar.h()) == a.e(jVar.c())) {
                            if (a.d(jVar.h()) == a.d(jVar.b())) {
                                if (a.d(jVar.h()) == a.e(jVar.b())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
