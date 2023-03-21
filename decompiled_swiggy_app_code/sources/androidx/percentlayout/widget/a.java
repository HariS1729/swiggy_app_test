package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.a0;
import androidx.core.view.h;
import androidx.percentlayout.R;

@Deprecated
/* compiled from: PercentLayoutHelper */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f10999a;

    @Deprecated
    /* renamed from: androidx.percentlayout.widget.a$a  reason: collision with other inner class name */
    /* compiled from: PercentLayoutHelper */
    public static class C0075a {

        /* renamed from: a  reason: collision with root package name */
        public float f11000a = -1.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f11001b = -1.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f11002c = -1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f11003d = -1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f11004e = -1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f11005f = -1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f11006g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public float f11007h = -1.0f;

        /* renamed from: i  reason: collision with root package name */
        public float f11008i;
        final c j = new c(0, 0);

        public void a(ViewGroup.LayoutParams layoutParams, int i11, int i12) {
            c cVar = this.j;
            int i13 = layoutParams.width;
            cVar.width = i13;
            int i14 = layoutParams.height;
            cVar.height = i14;
            boolean z11 = false;
            boolean z12 = (cVar.f11010b || i13 == 0) && this.f11000a < 0.0f;
            if ((cVar.f11009a || i14 == 0) && this.f11001b < 0.0f) {
                z11 = true;
            }
            float f11 = this.f11000a;
            if (f11 >= 0.0f) {
                layoutParams.width = Math.round(((float) i11) * f11);
            }
            float f12 = this.f11001b;
            if (f12 >= 0.0f) {
                layoutParams.height = Math.round(((float) i12) * f12);
            }
            float f13 = this.f11008i;
            if (f13 >= 0.0f) {
                if (z12) {
                    layoutParams.width = Math.round(((float) layoutParams.height) * f13);
                    this.j.f11010b = true;
                }
                if (z11) {
                    layoutParams.height = Math.round(((float) layoutParams.width) / this.f11008i);
                    this.j.f11009a = true;
                }
            }
        }

        public void b(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i11, int i12) {
            a(marginLayoutParams, i11, i12);
            c cVar = this.j;
            cVar.leftMargin = marginLayoutParams.leftMargin;
            cVar.topMargin = marginLayoutParams.topMargin;
            cVar.rightMargin = marginLayoutParams.rightMargin;
            cVar.bottomMargin = marginLayoutParams.bottomMargin;
            h.e(cVar, h.b(marginLayoutParams));
            h.d(this.j, h.a(marginLayoutParams));
            float f11 = this.f11002c;
            if (f11 >= 0.0f) {
                marginLayoutParams.leftMargin = Math.round(((float) i11) * f11);
            }
            float f12 = this.f11003d;
            if (f12 >= 0.0f) {
                marginLayoutParams.topMargin = Math.round(((float) i12) * f12);
            }
            float f13 = this.f11004e;
            if (f13 >= 0.0f) {
                marginLayoutParams.rightMargin = Math.round(((float) i11) * f13);
            }
            float f14 = this.f11005f;
            if (f14 >= 0.0f) {
                marginLayoutParams.bottomMargin = Math.round(((float) i12) * f14);
            }
            boolean z11 = false;
            float f15 = this.f11006g;
            boolean z12 = true;
            if (f15 >= 0.0f) {
                h.e(marginLayoutParams, Math.round(((float) i11) * f15));
                z11 = true;
            }
            float f16 = this.f11007h;
            if (f16 >= 0.0f) {
                h.d(marginLayoutParams, Math.round(((float) i11) * f16));
            } else {
                z12 = z11;
            }
            if (z12 && view != null) {
                h.c(marginLayoutParams, a0.F(view));
            }
        }

        public void c(ViewGroup.LayoutParams layoutParams) {
            c cVar = this.j;
            if (!cVar.f11010b) {
                layoutParams.width = cVar.width;
            }
            if (!cVar.f11009a) {
                layoutParams.height = cVar.height;
            }
            cVar.f11010b = false;
            cVar.f11009a = false;
        }

        public void d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            c(marginLayoutParams);
            c cVar = this.j;
            marginLayoutParams.leftMargin = cVar.leftMargin;
            marginLayoutParams.topMargin = cVar.topMargin;
            marginLayoutParams.rightMargin = cVar.rightMargin;
            marginLayoutParams.bottomMargin = cVar.bottomMargin;
            h.e(marginLayoutParams, h.b(cVar));
            h.d(marginLayoutParams, h.a(this.j));
        }

        public String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", new Object[]{Float.valueOf(this.f11000a), Float.valueOf(this.f11001b), Float.valueOf(this.f11002c), Float.valueOf(this.f11003d), Float.valueOf(this.f11004e), Float.valueOf(this.f11005f), Float.valueOf(this.f11006g), Float.valueOf(this.f11007h)});
        }
    }

    @Deprecated
    /* compiled from: PercentLayoutHelper */
    public interface b {
        C0075a a();
    }

    /* compiled from: PercentLayoutHelper */
    static class c extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        boolean f11009a;

        /* renamed from: b  reason: collision with root package name */
        boolean f11010b;

        public c(int i11, int i12) {
            super(i11, i12);
        }
    }

    public a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f10999a = viewGroup;
            return;
        }
        throw new IllegalArgumentException("host must be non-null");
    }

    public static void b(ViewGroup.LayoutParams layoutParams, TypedArray typedArray, int i11, int i12) {
        layoutParams.width = typedArray.getLayoutDimension(i11, 0);
        layoutParams.height = typedArray.getLayoutDimension(i12, 0);
    }

    public static C0075a c(Context context, AttributeSet attributeSet) {
        C0075a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PercentLayout_Layout);
        float fraction = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            aVar = new C0075a();
            aVar.f11000a = fraction;
        } else {
            aVar = null;
        }
        float fraction2 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11001b = fraction2;
        }
        float fraction3 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11002c = fraction3;
            aVar.f11003d = fraction3;
            aVar.f11004e = fraction3;
            aVar.f11005f = fraction3;
        }
        float fraction4 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11002c = fraction4;
        }
        float fraction5 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11003d = fraction5;
        }
        float fraction6 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11004e = fraction6;
        }
        float fraction7 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11005f = fraction7;
        }
        float fraction8 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11006g = fraction8;
        }
        float fraction9 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11007h = fraction9;
        }
        float fraction10 = obtainStyledAttributes.getFraction(R.styleable.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (aVar == null) {
                aVar = new C0075a();
            }
            aVar.f11008i = fraction10;
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private static boolean f(View view, C0075a aVar) {
        return (view.getMeasuredHeightAndState() & -16777216) == 16777216 && aVar.f11001b >= 0.0f && aVar.j.height == -2;
    }

    private static boolean g(View view, C0075a aVar) {
        return (view.getMeasuredWidthAndState() & -16777216) == 16777216 && aVar.f11000a >= 0.0f && aVar.j.width == -2;
    }

    public void a(int i11, int i12) {
        C0075a a11;
        int size = (View.MeasureSpec.getSize(i11) - this.f10999a.getPaddingLeft()) - this.f10999a.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i12) - this.f10999a.getPaddingTop()) - this.f10999a.getPaddingBottom();
        int childCount = this.f10999a.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = this.f10999a.getChildAt(i13);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b) && (a11 = ((b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    a11.b(childAt, (ViewGroup.MarginLayoutParams) layoutParams, size, size2);
                } else {
                    a11.a(layoutParams, size, size2);
                }
            }
        }
    }

    public boolean d() {
        C0075a a11;
        int childCount = this.f10999a.getChildCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f10999a.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b) && (a11 = ((b) layoutParams).a()) != null) {
                if (g(childAt, a11)) {
                    layoutParams.width = -2;
                    z11 = true;
                }
                if (f(childAt, a11)) {
                    layoutParams.height = -2;
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public void e() {
        C0075a a11;
        int childCount = this.f10999a.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ViewGroup.LayoutParams layoutParams = this.f10999a.getChildAt(i11).getLayoutParams();
            if ((layoutParams instanceof b) && (a11 = ((b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    a11.d((ViewGroup.MarginLayoutParams) layoutParams);
                } else {
                    a11.c(layoutParams);
                }
            }
        }
    }
}
