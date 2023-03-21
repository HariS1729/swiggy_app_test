package l6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.Log;
import android.view.View;
import co.hyperverge.hypersnapsdk.R;
import w5.n;

/* compiled from: RectPortHoleView */
public class d extends View {

    /* renamed from: e  reason: collision with root package name */
    private static final String f15571e = d.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private final float f15572a = 20.0f;

    /* renamed from: b  reason: collision with root package name */
    private RectF f15573b;

    /* renamed from: c  reason: collision with root package name */
    private float f15574c = 0.02f;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15575d = false;

    public d(Context context) {
        super(context);
    }

    public void a(RectF rectF, float f11) {
        this.f15574c = f11;
        Point point = new Point();
        Point point2 = new Point();
        point.x = ((int) rectF.left) + ((int) (rectF.width() * f11));
        point.y = ((int) rectF.top) + ((int) (rectF.height() * f11));
        point2.x = ((int) rectF.right) - ((int) (rectF.width() * f11));
        point2.y = ((int) rectF.bottom) - ((int) (f11 * ((float) ((int) rectF.height()))));
        this.f15573b = new RectF((float) point.x, (float) point.y, (float) point2.x, (float) point2.y);
        this.f15575d = true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15575d) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setColor(getContext().getResources().getColor(R.color.hv_white));
                paint.setStyle(Paint.Style.FILL);
                canvas2.drawPaint(paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawRoundRect(this.f15573b, 20.0f, 20.0f, paint);
                paint.setXfermode((Xfermode) null);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(-16777216);
                paint.setStrokeWidth(2.0f);
                paint.setStrokeJoin(Paint.Join.ROUND);
                canvas2.drawRoundRect(this.f15573b, 20.0f, 20.0f, paint);
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
            } catch (Exception e11) {
                Log.e(f15571e, e11.getMessage());
                if (n.w().s() != null) {
                    n.w().s().a(e11);
                }
            }
        }
    }
}
