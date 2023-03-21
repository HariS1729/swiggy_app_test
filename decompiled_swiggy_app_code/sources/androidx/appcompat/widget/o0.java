package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
import f.a;

/* compiled from: TintTypedArray */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2220a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f2221b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f2222c;

    private o0(Context context, TypedArray typedArray) {
        this.f2220a = context;
        this.f2221b = typedArray;
    }

    public static o0 t(Context context, int i11, int[] iArr) {
        return new o0(context, context.obtainStyledAttributes(i11, iArr));
    }

    public static o0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new o0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static o0 v(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12) {
        return new o0(context, context.obtainStyledAttributes(attributeSet, iArr, i11, i12));
    }

    public boolean a(int i11, boolean z11) {
        return this.f2221b.getBoolean(i11, z11);
    }

    public int b(int i11, int i12) {
        return this.f2221b.getColor(i11, i12);
    }

    public ColorStateList c(int i11) {
        int resourceId;
        ColorStateList a11;
        if (!this.f2221b.hasValue(i11) || (resourceId = this.f2221b.getResourceId(i11, 0)) == 0 || (a11 = a.a(this.f2220a, resourceId)) == null) {
            return this.f2221b.getColorStateList(i11);
        }
        return a11;
    }

    public float d(int i11, float f11) {
        return this.f2221b.getDimension(i11, f11);
    }

    public int e(int i11, int i12) {
        return this.f2221b.getDimensionPixelOffset(i11, i12);
    }

    public int f(int i11, int i12) {
        return this.f2221b.getDimensionPixelSize(i11, i12);
    }

    public Drawable g(int i11) {
        int resourceId;
        if (!this.f2221b.hasValue(i11) || (resourceId = this.f2221b.getResourceId(i11, 0)) == 0) {
            return this.f2221b.getDrawable(i11);
        }
        return a.b(this.f2220a, resourceId);
    }

    public Drawable h(int i11) {
        int resourceId;
        if (!this.f2221b.hasValue(i11) || (resourceId = this.f2221b.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return g.b().d(this.f2220a, resourceId, true);
    }

    public float i(int i11, float f11) {
        return this.f2221b.getFloat(i11, f11);
    }

    public Typeface j(int i11, int i12, h.e eVar) {
        int resourceId = this.f2221b.getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2222c == null) {
            this.f2222c = new TypedValue();
        }
        return h.h(this.f2220a, resourceId, this.f2222c, i12, eVar);
    }

    public int k(int i11, int i12) {
        return this.f2221b.getInt(i11, i12);
    }

    public int l(int i11, int i12) {
        return this.f2221b.getInteger(i11, i12);
    }

    public int m(int i11, int i12) {
        return this.f2221b.getLayoutDimension(i11, i12);
    }

    public int n(int i11, int i12) {
        return this.f2221b.getResourceId(i11, i12);
    }

    public String o(int i11) {
        return this.f2221b.getString(i11);
    }

    public CharSequence p(int i11) {
        return this.f2221b.getText(i11);
    }

    public CharSequence[] q(int i11) {
        return this.f2221b.getTextArray(i11);
    }

    public TypedArray r() {
        return this.f2221b;
    }

    public boolean s(int i11) {
        return this.f2221b.hasValue(i11);
    }

    public void w() {
        this.f2221b.recycle();
    }
}
