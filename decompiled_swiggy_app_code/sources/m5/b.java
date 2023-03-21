package m5;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public abstract class b implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    protected final SensorManager f15710a;

    public b(Context context) {
        this.f15710a = (SensorManager) context.getSystemService("sensor");
    }

    protected static float a(float f11, float f12, float f13, int i11) {
        return f11 + ((f13 - f12) / ((float) i11));
    }
}
