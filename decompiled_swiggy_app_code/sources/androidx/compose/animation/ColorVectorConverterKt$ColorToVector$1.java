package androidx.compose.animation;

import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.a;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.d0;
import u0.f0;

/* compiled from: ColorVectorConverter.kt */
final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements l<a, v1.q0<d0, v1.m>> {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorVectorConverterKt$ColorToVector$1 f2519a = new ColorVectorConverterKt$ColorToVector$1();

    ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    /* renamed from: a */
    public final v1.q0<d0, v1.m> invoke(final a aVar) {
        p.j(aVar, "colorSpace");
        return VectorConvertersKt.a(AnonymousClass1.f2520a, new l<v1.m, d0>() {
            public final long a(v1.m mVar) {
                p.j(mVar, "it");
                double d11 = (double) 3.0f;
                float pow = (float) Math.pow((double) mVar.g(), d11);
                float pow2 = (float) Math.pow((double) mVar.h(), d11);
                float pow3 = (float) Math.pow((double) mVar.i(), d11);
                float c11 = ColorVectorConverterKt.e(0, pow, pow2, pow3, ColorVectorConverterKt.f2518c);
                float c12 = ColorVectorConverterKt.e(1, pow, pow2, pow3, ColorVectorConverterKt.f2518c);
                float c13 = ColorVectorConverterKt.e(2, pow, pow2, pow3, ColorVectorConverterKt.f2518c);
                return d0.j(f0.a(l.l(c11, -2.0f, 2.0f), l.l(c12, -2.0f, 2.0f), l.l(c13, -2.0f, 2.0f), l.l(mVar.f(), 0.0f, 1.0f), ColorSpaces.f6442a.g()), aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return d0.h(a((v1.m) obj));
            }
        });
    }
}
