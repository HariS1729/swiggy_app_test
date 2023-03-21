package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f2338a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f2339b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f2340c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f2341d;

    /* renamed from: e  reason: collision with root package name */
    private float f2342e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2343f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2344g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f2345h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f2346i;
    private ColorStateList j;
    private PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    d(ColorStateList colorStateList, float f11) {
        this.f2338a = f11;
        this.f2339b = new Paint(5);
        e(colorStateList);
        this.f2340c = new RectF();
        this.f2341d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2345h = colorStateList;
        this.f2339b.setColor(colorStateList.getColorForState(getState(), this.f2345h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2340c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f2341d.set(rect);
        if (this.f2343f) {
            float b11 = e.b(this.f2342e, this.f2338a, this.f2344g);
            this.f2341d.inset((int) Math.ceil((double) e.a(this.f2342e, this.f2338a, this.f2344g)), (int) Math.ceil((double) b11));
            this.f2340c.set(this.f2341d);
        }
    }

    public ColorStateList b() {
        return this.f2345h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f2342e;
    }

    public float d() {
        return this.f2338a;
    }

    public void draw(Canvas canvas) {
        boolean z11;
        Paint paint = this.f2339b;
        if (this.f2346i == null || paint.getColorFilter() != null) {
            z11 = false;
        } else {
            paint.setColorFilter(this.f2346i);
            z11 = true;
        }
        RectF rectF = this.f2340c;
        float f11 = this.f2338a;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (z11) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f11, boolean z11, boolean z12) {
        if (f11 != this.f2342e || this.f2343f != z11 || this.f2344g != z12) {
            this.f2342e = f11;
            this.f2343f = z11;
            this.f2344g = z12;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2341d, this.f2338a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f11) {
        if (f11 != this.f2338a) {
            this.f2338a = f11;
            i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f2345h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f2345h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.d.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2345h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z11 = colorForState != this.f2339b.getColor();
        if (z11) {
            this.f2339b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.k) == null) {
            return z11;
        }
        this.f2346i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i11) {
        this.f2339b.setAlpha(i11);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2339b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f2346i = a(colorStateList, this.k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.f2346i = a(this.j, mode);
        invalidateSelf();
    }
}
