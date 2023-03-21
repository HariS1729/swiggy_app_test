package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableState */
final class j extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f9276a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f9277b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f9278c = null;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f9279d = h.f9268g;

    j(j jVar) {
        if (jVar != null) {
            this.f9276a = jVar.f9276a;
            this.f9277b = jVar.f9277b;
            this.f9278c = jVar.f9278c;
            this.f9279d = jVar.f9279d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f9277b != null;
    }

    public int getChangingConfigurations() {
        int i11 = this.f9276a;
        Drawable.ConstantState constantState = this.f9277b;
        return i11 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new i(this, resources);
    }
}
