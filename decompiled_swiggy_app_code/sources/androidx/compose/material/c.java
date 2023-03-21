package androidx.compose.material;

import c0.j;
import c0.q;
import d2.h;
import e0.g;
import u0.f0;

/* compiled from: ElevationOverlay.kt */
final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final c f5783a = new c();

    private c() {
    }

    public long a(long j, float f11, g gVar, int i11) {
        c0.c a11 = q.f12737a.a(gVar, 6);
        if (h.m(f11, h.n((float) 0)) <= 0 || a11.o()) {
            return j;
        }
        return f0.e(ElevationOverlayKt.b(j, f11, gVar, (i11 & 112) | (i11 & 14)), j);
    }
}
