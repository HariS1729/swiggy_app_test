package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21 */
class i extends h {

    /* renamed from: h  reason: collision with root package name */
    private static Method f9275h;

    i(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f9275h == null) {
            try {
                f9275h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e11) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e11);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f9274f;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f9274f.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f9274f.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f9274f;
        if (!(drawable == null || (method = f9275h) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e11) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e11);
            }
        }
        return false;
    }

    public void setHotspot(float f11, float f12) {
        this.f9274f.setHotspot(f11, f12);
    }

    public void setHotspotBounds(int i11, int i12, int i13, int i14) {
        this.f9274f.setHotspotBounds(i11, i12, i13, i14);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i11) {
        if (c()) {
            super.setTint(i11);
        } else {
            this.f9274f.setTint(i11);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f9274f.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f9274f.setTintMode(mode);
        }
    }

    i(j jVar, Resources resources) {
        super(jVar, resources);
        g();
    }
}
