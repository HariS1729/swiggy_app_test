package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private final d f1895a;

    /* renamed from: b  reason: collision with root package name */
    private final j f1896b;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1895a;
        if (dVar != null) {
            dVar.b();
        }
        j jVar = this.f1896b;
        if (jVar != null) {
            jVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1895a;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1895a;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        j jVar = this.f1896b;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j jVar = this.f1896b;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1896b.e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1895a;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        d dVar = this.f1895a;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        j jVar = this.f1896b;
        if (jVar != null) {
            jVar.b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        j jVar = this.f1896b;
        if (jVar != null) {
            jVar.b();
        }
    }

    public void setImageResource(int i11) {
        j jVar = this.f1896b;
        if (jVar != null) {
            jVar.g(i11);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        j jVar = this.f1896b;
        if (jVar != null) {
            jVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1895a;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1895a;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        j jVar = this.f1896b;
        if (jVar != null) {
            jVar.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        j jVar = this.f1896b;
        if (jVar != null) {
            jVar.i(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i11) {
        super(l0.b(context), attributeSet, i11);
        j0.a(this, getContext());
        d dVar = new d(this);
        this.f1895a = dVar;
        dVar.e(attributeSet, i11);
        j jVar = new j(this);
        this.f1896b = jVar;
        jVar.f(attributeSet, i11);
    }
}
