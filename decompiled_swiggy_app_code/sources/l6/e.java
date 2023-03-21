package l6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.widget.FrameLayout;
import co.hyperverge.hypersnapsdk.R;
import z5.f;

/* compiled from: TextureCamera */
public class e extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Path f15576a;

    /* renamed from: b  reason: collision with root package name */
    private int f15577b = 20;

    public e(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        this.f15576a = new Path();
        this.f15576a.addCircle((float) (getWidth() / 2), (float) (getHeight() / 2), ((float) getDiameter()) / 2.0f, Path.Direction.CW);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R.color.black));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.clipPath(this.f15576a);
        canvas.drawPath(this.f15576a, paint);
        super.dispatchDraw(canvas);
    }

    public int getDiameter() {
        return (int) ((float) (Math.min(f.h(), f.a()) - f.i(getContext())));
    }
}
