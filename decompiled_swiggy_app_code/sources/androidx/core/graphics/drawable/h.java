package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14 */
class h extends Drawable implements Drawable.Callback, g, f {

    /* renamed from: g  reason: collision with root package name */
    static final PorterDuff.Mode f9268g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    private int f9269a;

    /* renamed from: b  reason: collision with root package name */
    private PorterDuff.Mode f9270b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9271c;

    /* renamed from: d  reason: collision with root package name */
    j f9272d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9273e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f9274f;

    h(j jVar, Resources resources) {
        this.f9272d = jVar;
        e(resources);
    }

    private j d() {
        return new j(this.f9272d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        j jVar = this.f9272d;
        if (jVar != null && (constantState = jVar.f9277b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        j jVar = this.f9272d;
        ColorStateList colorStateList = jVar.f9278c;
        PorterDuff.Mode mode = jVar.f9279d;
        if (colorStateList == null || mode == null) {
            this.f9271c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f9271c && colorForState == this.f9269a && mode == this.f9270b)) {
                setColorFilter(colorForState, mode);
                this.f9269a = colorForState;
                this.f9270b = mode;
                this.f9271c = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f9274f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f9274f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            j jVar = this.f9272d;
            if (jVar != null) {
                jVar.f9277b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.f9274f;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        throw null;
    }

    public void draw(Canvas canvas) {
        this.f9274f.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        j jVar = this.f9272d;
        return changingConfigurations | (jVar != null ? jVar.getChangingConfigurations() : 0) | this.f9274f.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        j jVar = this.f9272d;
        if (jVar == null || !jVar.a()) {
            return null;
        }
        this.f9272d.f9276a = getChangingConfigurations();
        return this.f9272d;
    }

    public Drawable getCurrent() {
        return this.f9274f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f9274f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9274f.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.f(this.f9274f);
    }

    public int getMinimumHeight() {
        return this.f9274f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f9274f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f9274f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f9274f.getPadding(rect);
    }

    public int[] getState() {
        return this.f9274f.getState();
    }

    public Region getTransparentRegion() {
        return this.f9274f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f9274f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f9272d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.j r0 = r1.f9272d
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f9278c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f9274f
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.h.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f9274f.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f9273e && super.mutate() == this) {
            this.f9272d = d();
            Drawable drawable = this.f9274f;
            if (drawable != null) {
                drawable.mutate();
            }
            j jVar = this.f9272d;
            if (jVar != null) {
                Drawable drawable2 = this.f9274f;
                jVar.f9277b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f9273e = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9274f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i11) {
        return a.m(this.f9274f, i11);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i11) {
        return this.f9274f.setLevel(i11);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i11) {
        this.f9274f.setAlpha(i11);
    }

    public void setAutoMirrored(boolean z11) {
        a.j(this.f9274f, z11);
    }

    public void setChangingConfigurations(int i11) {
        this.f9274f.setChangingConfigurations(i11);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9274f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z11) {
        this.f9274f.setDither(z11);
    }

    public void setFilterBitmap(boolean z11) {
        this.f9274f.setFilterBitmap(z11);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.f9274f.setState(iArr);
    }

    public void setTint(int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f9272d.f9278c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f9272d.f9279d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z11, boolean z12) {
        return super.setVisible(z11, z12) || this.f9274f.setVisible(z11, z12);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    h(Drawable drawable) {
        this.f9272d = d();
        a(drawable);
    }
}
