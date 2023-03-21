package z5;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import co.hyperverge.hypersnapsdk.R;
import w5.n;

/* compiled from: UIUtils */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18073a = "co.hyperverge.hypersnapsdk.f.g";

    public static int a() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int b(Context context, float f11) {
        return (int) (f11 * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    public static Bitmap c(Context context, Bitmap bitmap, double d11, float f11, int i11, boolean z11) {
        if (f11 >= 1.0f || !z11) {
            d11 = 0.0d;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int color = context.getResources().getColor(R.color.hv_white);
            Paint paint = new Paint();
            int i12 = (int) d11;
            Rect rect = new Rect(0, i12, bitmap.getWidth(), bitmap.getHeight() - i12);
            RectF rectF = new RectF(rect);
            float f12 = (float) i11;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(color);
            canvas.drawRoundRect(rectF, f12, f12, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return createBitmap;
        } catch (Exception e11) {
            Log.e(f18073a, e11.getMessage());
            n.w().j(context).a(e11);
            return null;
        } catch (OutOfMemoryError e12) {
            Log.e(f18073a, e12.getMessage());
            n.w().j(context).a(e12);
            return null;
        }
    }

    public static Bitmap d(Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        switch (i11) {
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e11) {
            Log.e(f18073a, e11.getMessage());
            if (n.w().s() == null) {
                return null;
            }
            n.w().s().a(e11);
            return null;
        }
    }

    public static Bitmap e(Bitmap bitmap, Integer num) {
        Bitmap bitmap2;
        int i11;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            bitmap2 = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        } else {
            bitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getWidth(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() > bitmap.getHeight()) {
            i11 = bitmap.getHeight() / 2;
        } else {
            i11 = bitmap.getWidth() / 2;
        }
        float f11 = (float) i11;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawCircle(f11, f11, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmap2;
    }

    public static Point f(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static void g(Activity activity, int i11) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        attributes.screenBrightness = 0.8f;
        activity.getWindow().setAttributes(attributes);
    }

    public static int h() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int i(Context context) {
        return (Math.min(h(), a()) * 15) / 100;
    }

    public static Point j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static int k(Context context) {
        return (int) context.getResources().getDimension(R.dimen.margin_face_circle_top);
    }

    public static boolean l(Context context) {
        return f(context).y < j(context).y;
    }
}
