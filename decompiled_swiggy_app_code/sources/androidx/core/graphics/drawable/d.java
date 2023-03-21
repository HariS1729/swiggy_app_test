package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: RoundedBitmapDrawable */
public abstract class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final Bitmap f9257a;

    /* renamed from: b  reason: collision with root package name */
    private int f9258b = 160;

    /* renamed from: c  reason: collision with root package name */
    private int f9259c = 119;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f9260d = new Paint(3);

    /* renamed from: e  reason: collision with root package name */
    private final BitmapShader f9261e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f9262f = new Matrix();

    /* renamed from: g  reason: collision with root package name */
    private float f9263g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f9264h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    private final RectF f9265i = new RectF();
    private boolean j = true;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private int f9266l;

    /* renamed from: m  reason: collision with root package name */
    private int f9267m;

    d(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f9258b = resources.getDisplayMetrics().densityDpi;
        }
        this.f9257a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f9261e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.f9267m = -1;
        this.f9266l = -1;
        this.f9261e = null;
    }

    private void a() {
        this.f9266l = this.f9257a.getScaledWidth(this.f9258b);
        this.f9267m = this.f9257a.getScaledHeight(this.f9258b);
    }

    private static boolean d(float f11) {
        return f11 > 0.05f;
    }

    private void f() {
        this.f9263g = (float) (Math.min(this.f9267m, this.f9266l) / 2);
    }

    public float b() {
        return this.f9263g;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(int i11, int i12, int i13, Rect rect, Rect rect2);

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f9257a;
        if (bitmap != null) {
            g();
            if (this.f9260d.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f9264h, this.f9260d);
                return;
            }
            RectF rectF = this.f9265i;
            float f11 = this.f9263g;
            canvas.drawRoundRect(rectF, f11, f11, this.f9260d);
        }
    }

    public void e(float f11) {
        if (this.f9263g != f11) {
            this.k = false;
            if (d(f11)) {
                this.f9260d.setShader(this.f9261e);
            } else {
                this.f9260d.setShader((Shader) null);
            }
            this.f9263g = f11;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (this.j) {
            if (this.k) {
                int min = Math.min(this.f9266l, this.f9267m);
                c(this.f9259c, min, min, getBounds(), this.f9264h);
                int min2 = Math.min(this.f9264h.width(), this.f9264h.height());
                this.f9264h.inset(Math.max(0, (this.f9264h.width() - min2) / 2), Math.max(0, (this.f9264h.height() - min2) / 2));
                this.f9263g = ((float) min2) * 0.5f;
            } else {
                c(this.f9259c, this.f9266l, this.f9267m, getBounds(), this.f9264h);
            }
            this.f9265i.set(this.f9264h);
            if (this.f9261e != null) {
                Matrix matrix = this.f9262f;
                RectF rectF = this.f9265i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f9262f.preScale(this.f9265i.width() / ((float) this.f9257a.getWidth()), this.f9265i.height() / ((float) this.f9257a.getHeight()));
                this.f9261e.setLocalMatrix(this.f9262f);
                this.f9260d.setShader(this.f9261e);
            }
            this.j = false;
        }
    }

    public int getAlpha() {
        return this.f9260d.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f9260d.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f9267m;
    }

    public int getIntrinsicWidth() {
        return this.f9266l;
    }

    public int getOpacity() {
        Bitmap bitmap;
        if (this.f9259c != 119 || this.k || (bitmap = this.f9257a) == null || bitmap.hasAlpha() || this.f9260d.getAlpha() < 255 || d(this.f9263g)) {
            return -3;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            f();
        }
        this.j = true;
    }

    public void setAlpha(int i11) {
        if (i11 != this.f9260d.getAlpha()) {
            this.f9260d.setAlpha(i11);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9260d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z11) {
        this.f9260d.setDither(z11);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z11) {
        this.f9260d.setFilterBitmap(z11);
        invalidateSelf();
    }
}
