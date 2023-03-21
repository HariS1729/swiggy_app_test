package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.cardview.R;

public class CardView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f2327h = {16842801};

    /* renamed from: i  reason: collision with root package name */
    private static final c f2328i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2329a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2330b;

    /* renamed from: c  reason: collision with root package name */
    int f2331c;

    /* renamed from: d  reason: collision with root package name */
    int f2332d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f2333e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f2334f;

    /* renamed from: g  reason: collision with root package name */
    private final b f2335g;

    class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f2336a;

        a() {
        }

        public void a(int i11, int i12, int i13, int i14) {
            CardView.this.f2334f.set(i11, i12, i13, i14);
            CardView cardView = CardView.this;
            Rect rect = cardView.f2333e;
            CardView.super.setPadding(i11 + rect.left, i12 + rect.top, i13 + rect.right, i14 + rect.bottom);
        }

        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        public void c(Drawable drawable) {
            this.f2336a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public Drawable d() {
            return this.f2336a;
        }

        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        public View f() {
            return CardView.this;
        }
    }

    static {
        a aVar = new a();
        f2328i = aVar;
        aVar.n();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public void d(int i11, int i12, int i13, int i14) {
        this.f2333e.set(i11, i12, i13, i14);
        f2328i.e(this.f2335g);
    }

    public ColorStateList getCardBackgroundColor() {
        return f2328i.j(this.f2335g);
    }

    public float getCardElevation() {
        return f2328i.d(this.f2335g);
    }

    public int getContentPaddingBottom() {
        return this.f2333e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2333e.left;
    }

    public int getContentPaddingRight() {
        return this.f2333e.right;
    }

    public int getContentPaddingTop() {
        return this.f2333e.top;
    }

    public float getMaxCardElevation() {
        return f2328i.b(this.f2335g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2330b;
    }

    public float getRadius() {
        return f2328i.a(this.f2335g);
    }

    public boolean getUseCompatPadding() {
        return this.f2329a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        c cVar = f2328i;
        if (!(cVar instanceof a)) {
            int mode = View.MeasureSpec.getMode(i11);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.f(this.f2335g)), View.MeasureSpec.getSize(i11)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i12 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) cVar.c(this.f2335g)), View.MeasureSpec.getSize(i12)), mode2);
            }
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, i12);
    }

    public void setCardBackgroundColor(int i11) {
        f2328i.o(this.f2335g, ColorStateList.valueOf(i11));
    }

    public void setCardElevation(float f11) {
        f2328i.i(this.f2335g, f11);
    }

    public void setMaxCardElevation(float f11) {
        f2328i.g(this.f2335g, f11);
    }

    public void setMinimumHeight(int i11) {
        this.f2332d = i11;
        super.setMinimumHeight(i11);
    }

    public void setMinimumWidth(int i11) {
        this.f2331c = i11;
        super.setMinimumWidth(i11);
    }

    public void setPadding(int i11, int i12, int i13, int i14) {
    }

    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
    }

    public void setPreventCornerOverlap(boolean z11) {
        if (z11 != this.f2330b) {
            this.f2330b = z11;
            f2328i.k(this.f2335g);
        }
    }

    public void setRadius(float f11) {
        f2328i.h(this.f2335g, f11);
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f2329a != z11) {
            this.f2329a = z11;
            f2328i.m(this.f2335g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int i12;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f2333e = rect;
        this.f2334f = new Rect();
        a aVar = new a();
        this.f2335g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardView, i11, R.style.CardView);
        int i13 = R.styleable.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i13)) {
            valueOf = obtainStyledAttributes.getColorStateList(i13);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2327h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i12 = getResources().getColor(R.color.cardview_light_background);
            } else {
                i12 = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i12);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardMaxElevation, 0.0f);
        this.f2329a = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardUseCompatPadding, false);
        this.f2330b = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f11 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2331c = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minWidth, 0);
        this.f2332d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f2328i.l(aVar, context, colorStateList, dimension, dimension2, f11);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2328i.o(this.f2335g, colorStateList);
    }
}
