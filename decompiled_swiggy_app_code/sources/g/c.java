package g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* compiled from: DrawableWrapper */
public class c extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f14703a;

    public c(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f14703a;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f14703a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f14703a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f14703a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f14703a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f14703a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f14703a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f14703a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f14703a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f14703a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f14703a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f14703a.getPadding(rect);
    }

    public int[] getState() {
        return this.f14703a.getState();
    }

    public Region getTransparentRegion() {
        return this.f14703a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f14703a);
    }

    public boolean isStateful() {
        return this.f14703a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f14703a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f14703a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i11) {
        return this.f14703a.setLevel(i11);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i11) {
        this.f14703a.setAlpha(i11);
    }

    public void setAutoMirrored(boolean z11) {
        a.j(this.f14703a, z11);
    }

    public void setChangingConfigurations(int i11) {
        this.f14703a.setChangingConfigurations(i11);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f14703a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z11) {
        this.f14703a.setDither(z11);
    }

    public void setFilterBitmap(boolean z11) {
        this.f14703a.setFilterBitmap(z11);
    }

    public void setHotspot(float f11, float f12) {
        a.k(this.f14703a, f11, f12);
    }

    public void setHotspotBounds(int i11, int i12, int i13, int i14) {
        a.l(this.f14703a, i11, i12, i13, i14);
    }

    public boolean setState(int[] iArr) {
        return this.f14703a.setState(iArr);
    }

    public void setTint(int i11) {
        a.n(this.f14703a, i11);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.f14703a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.f14703a, mode);
    }

    public boolean setVisible(boolean z11, boolean z12) {
        return super.setVisible(z11, z12) || this.f14703a.setVisible(z11, z12);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
