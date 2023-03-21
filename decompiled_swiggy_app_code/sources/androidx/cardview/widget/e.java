package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow */
class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private static final double f2347a = Math.cos(Math.toRadians(45.0d));

    static float a(float f11, float f12, boolean z11) {
        return z11 ? (float) (((double) f11) + ((1.0d - f2347a) * ((double) f12))) : f11;
    }

    static float b(float f11, float f12, boolean z11) {
        return z11 ? (float) (((double) (f11 * 1.5f)) + ((1.0d - f2347a) * ((double) f12))) : f11 * 1.5f;
    }
}
