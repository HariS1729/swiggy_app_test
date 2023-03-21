package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import c0.j;
import d2.h;
import e0.a1;
import e0.g;
import e0.m0;
import u0.d0;

/* compiled from: ElevationOverlay.kt */
public final class ElevationOverlayKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<j> f5040a = CompositionLocalKt.d(ElevationOverlayKt$LocalElevationOverlay$1.f5043a);

    /* renamed from: b  reason: collision with root package name */
    private static final m0<h> f5041b = CompositionLocalKt.c((a1) null, ElevationOverlayKt$LocalAbsoluteElevation$1.f5042a, 1, (Object) null);

    /* access modifiers changed from: private */
    public static final long b(long j, float f11, g gVar, int i11) {
        return d0.l(ColorsKt.b(j, gVar, i11 & 14), ((((float) Math.log((double) (f11 + ((float) 1)))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public static final m0<h> c() {
        return f5041b;
    }

    public static final m0<j> d() {
        return f5040a;
    }
}
