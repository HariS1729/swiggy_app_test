package o5;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;

public class b {
    static {
        new MeteringRectangle(0, 0, 0, 0, 0);
    }

    public static int a(int i11, int i12, int i13) {
        return i11 > i13 ? i13 : i11 < i12 ? i12 : i11;
    }

    public static PointF b(float f11, float f12, int i11) {
        if (i11 == 0) {
            return new PointF(f11, f12);
        }
        if (i11 == 90) {
            return new PointF(f12, 1.0f - f11);
        }
        if (i11 == 180) {
            return new PointF(1.0f - f11, 1.0f - f12);
        }
        if (i11 != 270) {
            return null;
        }
        return new PointF(1.0f - f12, f11);
    }

    public static Rect c(CameraCharacteristics cameraCharacteristics, float f11, float f12) {
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        int width2 = (int) ((((float) rect.width()) * 0.5f) / f11);
        int height2 = (int) ((((float) rect.height()) * 0.5f) / f11);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }

    private static MeteringRectangle[] d(float f11, float f12, float f13, Rect rect, int i11) {
        int min = (int) (f13 * 0.5f * ((float) Math.min(rect.width(), rect.height())));
        PointF b11 = b(f11, f12, i11);
        int width = (int) (((float) rect.left) + (b11.x * ((float) rect.width())));
        int height = (int) (((float) rect.top) + (b11.y * ((float) rect.height())));
        Rect rect2 = new Rect(width - min, height - min, width + min, height + min);
        rect2.left = a(rect2.left, rect.left, rect.right);
        rect2.top = a(rect2.top, rect.top, rect.bottom);
        rect2.right = a(rect2.right, rect.left, rect.right);
        rect2.bottom = a(rect2.bottom, rect.top, rect.bottom);
        return new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)};
    }

    public static MeteringRectangle[] e(float f11, float f12, Rect rect, int i11) {
        return d(f11, f12, i.b(), rect, i11);
    }

    public static MeteringRectangle[] f(float f11, float f12, Rect rect, int i11) {
        return d(f11, f12, i.a(), rect, i11);
    }
}
