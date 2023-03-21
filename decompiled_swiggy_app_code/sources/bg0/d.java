package bg0;

import android.animation.TypeEvaluator;

/* compiled from: MarkerRotationEvaluator.kt */
public final class d implements TypeEvaluator<Float> {
    public Float a(float f11, float f12, float f13) {
        return Float.valueOf(((f13 - f12) * f11) + f12);
    }

    public /* bridge */ /* synthetic */ Object evaluate(float f11, Object obj, Object obj2) {
        return a(f11, ((Number) obj).floatValue(), ((Number) obj2).floatValue());
    }
}
