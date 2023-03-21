package f3;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator */
abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f14622a;

    /* renamed from: b  reason: collision with root package name */
    private final float f14623b;

    protected d(float[] fArr) {
        this.f14622a = fArr;
        this.f14623b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f11) {
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f14622a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f11), fArr.length - 2);
        float f12 = this.f14623b;
        float f13 = (f11 - (((float) min) * f12)) / f12;
        float[] fArr2 = this.f14622a;
        return fArr2[min] + (f13 * (fArr2[min + 1] - fArr2[min]));
    }
}
