package androidx.compose.animation.core;

import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: VectorConverters.kt */
final class VectorConvertersKt$FloatToVector$1 extends Lambda implements l<Float, v1.k> {

    /* renamed from: a  reason: collision with root package name */
    public static final VectorConvertersKt$FloatToVector$1 f2801a = new VectorConvertersKt$FloatToVector$1();

    VectorConvertersKt$FloatToVector$1() {
        super(1);
    }

    public final v1.k a(float f11) {
        return new v1.k(f11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).floatValue());
    }
}
