package androidx.compose.animation;

import androidx.compose.ui.graphics.colorspace.a;
import defpackage.v1;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.d0;

/* compiled from: ColorVectorConverter.kt */
public final class ColorVectorConverterKt {

    /* renamed from: a  reason: collision with root package name */
    private static final l<a, v1.q0<d0, v1.m>> f2516a = ColorVectorConverterKt$ColorToVector$1.f2519a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f2517b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f2518c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    public static final l<a, v1.q0<d0, v1.m>> d(d0.a aVar) {
        p.j(aVar, "<this>");
        return f2516a;
    }

    /* access modifiers changed from: private */
    public static final float e(int i11, float f11, float f12, float f13, float[] fArr) {
        return (f11 * fArr[i11]) + (f12 * fArr[i11 + 3]) + (f13 * fArr[i11 + 6]);
    }
}
