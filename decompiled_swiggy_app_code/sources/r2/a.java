package r2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.p;

/* compiled from: MaskedDrawable.kt */
public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f16431a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16432b;

    /* renamed from: c  reason: collision with root package name */
    private final Path f16433c;

    public a(Drawable drawable, float f11) {
        p.j(drawable, "drawable");
        this.f16431a = drawable;
        this.f16432b = f11;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f11 / 2.0f, Path.Direction.CW);
        this.f16433c = path;
    }

    public void draw(Canvas canvas) {
        p.j(canvas, "canvas");
        canvas.clipPath(this.f16433c);
        this.f16431a.draw(canvas);
    }

    public int getOpacity() {
        return this.f16431a.getOpacity();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        p.j(rect, "bounds");
        super.onBoundsChange(rect);
        this.f16431a.setBounds(rect);
        this.f16433c.offset(rect.exactCenterX(), rect.exactCenterY());
    }

    public void setAlpha(int i11) {
        this.f16431a.setAlpha(i11);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f16431a.setColorFilter(colorFilter);
    }
}
