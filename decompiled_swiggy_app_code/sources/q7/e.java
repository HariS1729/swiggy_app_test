package q7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.TextView;
import bp0.k;
import com.afollestad.materialdialogs.MaterialDialog;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: MDUtil.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f16390a = new e();

    /* compiled from: MDUtil.kt */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private Integer f16391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f16392b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l f16393c;

        a(T t, l lVar) {
            this.f16392b = t;
            this.f16393c = lVar;
        }

        public void onGlobalLayout() {
            Integer num = this.f16391a;
            if (num != null) {
                int measuredWidth = this.f16392b.getMeasuredWidth();
                if (num != null && num.intValue() == measuredWidth) {
                    this.f16392b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
            }
            if (this.f16392b.getMeasuredWidth() > 0 && this.f16392b.getMeasuredHeight() > 0) {
                Integer num2 = this.f16391a;
                int measuredWidth2 = this.f16392b.getMeasuredWidth();
                if (num2 == null || num2.intValue() != measuredWidth2) {
                    this.f16391a = Integer.valueOf(this.f16392b.getMeasuredWidth());
                    this.f16393c.invoke(this.f16392b);
                }
            }
        }
    }

    private e() {
    }

    public static /* synthetic */ boolean f(e eVar, int i11, double d11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            d11 = 0.5d;
        }
        return eVar.e(i11, d11);
    }

    public static /* synthetic */ void h(e eVar, TextView textView, Context context, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        eVar.g(textView, context, num, num2);
    }

    public static /* synthetic */ int j(e eVar, Context context, Integer num, Integer num2, lp0.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        if ((i11 & 8) != 0) {
            aVar = null;
        }
        return eVar.i(context, num, num2, aVar);
    }

    public static /* synthetic */ Drawable m(e eVar, Context context, Integer num, Integer num2, Drawable drawable, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        if ((i11 & 8) != 0) {
            drawable = null;
        }
        return eVar.l(context, num, num2, drawable);
    }

    public static /* synthetic */ CharSequence r(e eVar, MaterialDialog materialDialog, Integer num, Integer num2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            num2 = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return eVar.q(materialDialog, num, num2, z11);
    }

    public static /* synthetic */ void u(e eVar, View view, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = view != null ? view.getPaddingLeft() : 0;
        }
        int i16 = i11;
        if ((i15 & 2) != 0) {
            i12 = view != null ? view.getPaddingTop() : 0;
        }
        int i17 = i12;
        if ((i15 & 4) != 0) {
            i13 = view != null ? view.getPaddingRight() : 0;
        }
        int i18 = i13;
        if ((i15 & 8) != 0) {
            i14 = view != null ? view.getPaddingBottom() : 0;
        }
        eVar.t(view, i16, i17, i18, i14);
    }

    public final int a(TextView textView) {
        p.k(textView, "$this$additionalPaddingForFont");
        TextPaint paint = textView.getPaint();
        p.f(paint, "paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f11 = fontMetrics.descent - fontMetrics.ascent;
        if (f11 > ((float) textView.getMeasuredHeight())) {
            return (int) (f11 - ((float) textView.getMeasuredHeight()));
        }
        return 0;
    }

    public final void b(String str, Object obj, Integer num) {
        p.k(str, "method");
        if (num == null && obj == null) {
            throw new IllegalArgumentException(str + ": You must specify a resource ID or literal value");
        }
    }

    public final <T extends View> int c(T t, int i11) {
        p.k(t, "$this$dimenPx");
        Context context = t.getContext();
        p.f(context, LogCategory.CONTEXT);
        return context.getResources().getDimensionPixelSize(i11);
    }

    public final Pair<Integer, Integer> d(WindowManager windowManager) {
        p.k(windowManager, "$this$getWidthAndHeight");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public final boolean e(int i11, double d11) {
        return i11 != 0 && ((double) 1) - ((((((double) Color.red(i11)) * 0.299d) + (((double) Color.green(i11)) * 0.587d)) + (((double) Color.blue(i11)) * 0.114d)) / ((double) 255)) >= d11;
    }

    public final void g(TextView textView, Context context, Integer num, Integer num2) {
        int j;
        int j11;
        p.k(context, LogCategory.CONTEXT);
        if (textView == null) {
            return;
        }
        if (num != null || num2 != null) {
            if (!(num == null || (j11 = j(this, context, (Integer) null, num, (lp0.a) null, 10, (Object) null)) == 0)) {
                textView.setTextColor(j11);
            }
            if (num2 != null && (j = j(this, context, (Integer) null, num2, (lp0.a) null, 10, (Object) null)) != 0) {
                textView.setHintTextColor(j);
            }
        }
    }

    public final int i(Context context, Integer num, Integer num2, lp0.a<Integer> aVar) {
        p.k(context, LogCategory.CONTEXT);
        int i11 = 0;
        if (num2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int color = obtainStyledAttributes.getColor(0, 0);
                if (color == 0 && aVar != null) {
                    return aVar.invoke().intValue();
                }
                obtainStyledAttributes.recycle();
                return color;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            if (num != null) {
                i11 = num.intValue();
            }
            return androidx.core.content.a.c(context, i11);
        }
    }

    public final float k(Context context, int i11, lp0.a<Float> aVar) {
        float f11;
        p.k(context, LogCategory.CONTEXT);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i11});
        if (aVar != null) {
            try {
                Float invoke = aVar.invoke();
                if (invoke != null) {
                    f11 = invoke.floatValue();
                    float dimension = obtainStyledAttributes.getDimension(0, f11);
                    obtainStyledAttributes.recycle();
                    return dimension;
                }
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
        f11 = 0.0f;
        float dimension2 = obtainStyledAttributes.getDimension(0, f11);
        obtainStyledAttributes.recycle();
        return dimension2;
    }

    public final Drawable l(Context context, Integer num, Integer num2, Drawable drawable) {
        p.k(context, LogCategory.CONTEXT);
        if (num2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
                if (drawable2 != null || drawable == null) {
                    drawable = drawable2;
                }
                return drawable;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else if (num == null) {
            return drawable;
        } else {
            return androidx.core.content.a.f(context, num.intValue());
        }
    }

    public final float n(Context context, int i11, float f11) {
        p.k(context, LogCategory.CONTEXT);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i11});
        try {
            return obtainStyledAttributes.getFloat(0, f11);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final int o(Context context, int i11, int i12) {
        p.k(context, LogCategory.CONTEXT);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i11});
        try {
            return obtainStyledAttributes.getInt(0, i12);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final CharSequence p(Context context, Integer num, Integer num2, boolean z11) {
        p.k(context, LogCategory.CONTEXT);
        int intValue = num != null ? num.intValue() : num2 != null ? num2.intValue() : 0;
        if (intValue == 0) {
            return null;
        }
        CharSequence text = context.getResources().getText(intValue);
        p.f(text, "context.resources.getText(resourceId)");
        return z11 ? Html.fromHtml(text.toString()) : text;
    }

    public final CharSequence q(MaterialDialog materialDialog, Integer num, Integer num2, boolean z11) {
        p.k(materialDialog, "materialDialog");
        return p(materialDialog.e(), num, num2, z11);
    }

    public final float s(Context context, int i11, lp0.a<Integer> aVar) {
        int i12;
        p.k(context, LogCategory.CONTEXT);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i11});
        if (aVar != null) {
            try {
                Integer invoke = aVar.invoke();
                if (invoke != null) {
                    i12 = invoke.intValue();
                    float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(0, i12);
                    obtainStyledAttributes.recycle();
                    return dimensionPixelSize;
                }
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
        i12 = 0;
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(0, i12);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize2;
    }

    public final <T extends View> void t(T t, int i11, int i12, int i13, int i14) {
        if ((t == null || i11 != t.getPaddingLeft() || i12 != t.getPaddingTop() || i13 != t.getPaddingRight() || i14 != t.getPaddingBottom()) && t != null) {
            t.setPadding(i11, i12, i13, i14);
        }
    }

    public final <T extends View> void v(T t, l<? super T, k> lVar) {
        p.k(t, "$this$waitForWidth");
        p.k(lVar, RenderingDetails.TYPE_BLOCK);
        if (t.getMeasuredWidth() <= 0 || t.getMeasuredHeight() <= 0) {
            t.getViewTreeObserver().addOnGlobalLayoutListener(new a(t, lVar));
        } else {
            lVar.invoke(t);
        }
    }
}
