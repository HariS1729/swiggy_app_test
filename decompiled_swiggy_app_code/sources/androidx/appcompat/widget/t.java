package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.view.a0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper */
class t {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f2287l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f2288m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private int f2289a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2290b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f2291c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f2292d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f2293e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f2294f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f2295g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f2296h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f2297i;
    private final Context j;
    private final c k;

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class a extends c {
        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) t.o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class b extends a {
        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper */
    private static class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) t.o(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    t(TextView textView) {
        this.f2297i = textView;
        this.j = textView.getContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            this.k = new b();
        } else if (i11 >= 23) {
            this.k = new a();
        } else {
            this.k = new c();
        }
    }

    private boolean A() {
        return !(this.f2297i instanceof h);
    }

    private void B(float f11, float f12, float f13) throws IllegalArgumentException {
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f11 + "px) is less or equal to (0px)");
        } else if (f12 <= f11) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f12 + "px) is less or equal to minimum auto-size text size (" + f11 + "px)");
        } else if (f13 > 0.0f) {
            this.f2289a = 1;
            this.f2292d = f11;
            this.f2293e = f12;
            this.f2291c = f13;
            this.f2295g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f13 + "px) is less or equal to (0px)");
        }
    }

    private int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            if (i11 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i11)) < 0) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr2[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f2289a = 0;
        this.f2292d = -1.0f;
        this.f2293e = -1.0f;
        this.f2291c = -1.0f;
        this.f2294f = new int[0];
        this.f2290b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i11, int i12) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f2296h, i11);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f2297i.getLineSpacingExtra(), this.f2297i.getLineSpacingMultiplier()).setIncludePad(this.f2297i.getIncludeFontPadding()).setBreakStrategy(this.f2297i.getBreakStrategy()).setHyphenationFrequency(this.f2297i.getHyphenationFrequency());
        if (i12 == -1) {
            i12 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i12);
        try {
            this.k.a(obtain, this.f2297i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i11) {
        return new StaticLayout(charSequence, this.f2296h, i11, alignment, this.f2297i.getLineSpacingMultiplier(), this.f2297i.getLineSpacingExtra(), this.f2297i.getIncludeFontPadding());
    }

    private int g(RectF rectF) {
        int length = this.f2294f.length;
        if (length != 0) {
            int i11 = length - 1;
            int i12 = 1;
            int i13 = 0;
            while (i12 <= i11) {
                int i14 = (i12 + i11) / 2;
                if (z(this.f2294f[i14], rectF)) {
                    int i15 = i14 + 1;
                    i13 = i12;
                    i12 = i15;
                } else {
                    i13 = i14 - 1;
                    i11 = i13;
                }
            }
            return this.f2294f[i13];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method m(String str) {
        try {
            Method method = f2288m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2288m.put(str, method);
            }
            return method;
        } catch (Exception e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e11);
            return null;
        }
    }

    static <T> T o(Object obj, String str, T t) {
        try {
            return m(str).invoke(obj, new Object[0]);
        } catch (Exception e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e11);
            return t;
        }
    }

    private void u(float f11) {
        if (f11 != this.f2297i.getPaint().getTextSize()) {
            this.f2297i.getPaint().setTextSize(f11);
            boolean isInLayout = this.f2297i.isInLayout();
            if (this.f2297i.getLayout() != null) {
                this.f2290b = false;
                try {
                    Method m11 = m("nullLayouts");
                    if (m11 != null) {
                        m11.invoke(this.f2297i, new Object[0]);
                    }
                } catch (Exception e11) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e11);
                }
                if (!isInLayout) {
                    this.f2297i.requestLayout();
                } else {
                    this.f2297i.forceLayout();
                }
                this.f2297i.invalidate();
            }
        }
    }

    private boolean w() {
        if (!A() || this.f2289a != 1) {
            this.f2290b = false;
        } else {
            if (!this.f2295g || this.f2294f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f2293e - this.f2292d) / this.f2291c))) + 1;
                int[] iArr = new int[floor];
                for (int i11 = 0; i11 < floor; i11++) {
                    iArr[i11] = Math.round(this.f2292d + (((float) i11) * this.f2291c));
                }
                this.f2294f = b(iArr);
            }
            this.f2290b = true;
        }
        return this.f2290b;
    }

    private void x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = typedArray.getDimensionPixelSize(i11, -1);
            }
            this.f2294f = b(iArr);
            y();
        }
    }

    private boolean y() {
        int[] iArr = this.f2294f;
        int length = iArr.length;
        boolean z11 = length > 0;
        this.f2295g = z11;
        if (z11) {
            this.f2289a = 1;
            this.f2292d = (float) iArr[0];
            this.f2293e = (float) iArr[length - 1];
            this.f2291c = -1.0f;
        }
        return z11;
    }

    private boolean z(int i11, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2297i.getText();
        TransformationMethod transformationMethod = this.f2297i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f2297i)) == null)) {
            text = transformation;
        }
        int maxLines = this.f2297i.getMaxLines();
        n(i11);
        StaticLayout d11 = d(text, (Layout.Alignment) o(this.f2297i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d11.getLineCount() <= maxLines && d11.getLineEnd(d11.getLineCount() - 1) == text.length())) && ((float) d11.getHeight()) <= rectF.bottom;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i11;
        if (p()) {
            if (this.f2290b) {
                if (this.f2297i.getMeasuredHeight() > 0 && this.f2297i.getMeasuredWidth() > 0) {
                    if (this.k.b(this.f2297i)) {
                        i11 = 1048576;
                    } else {
                        i11 = (this.f2297i.getMeasuredWidth() - this.f2297i.getTotalPaddingLeft()) - this.f2297i.getTotalPaddingRight();
                    }
                    int height = (this.f2297i.getHeight() - this.f2297i.getCompoundPaddingBottom()) - this.f2297i.getCompoundPaddingTop();
                    if (i11 > 0 && height > 0) {
                        RectF rectF = f2287l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) i11;
                            rectF.bottom = (float) height;
                            float g11 = (float) g(rectF);
                            if (g11 != this.f2297i.getTextSize()) {
                                v(0, g11);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2290b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 23) {
            return e(charSequence, alignment, i11, i12);
        }
        return f(charSequence, alignment, i11);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f2293e);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return Math.round(this.f2292d);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Math.round(this.f2291c);
    }

    /* access modifiers changed from: package-private */
    public int[] k() {
        return this.f2294f;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f2289a;
    }

    /* access modifiers changed from: package-private */
    public void n(int i11) {
        TextPaint textPaint = this.f2296h;
        if (textPaint == null) {
            this.f2296h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2296h.set(this.f2297i.getPaint());
        this.f2296h.setTextSize((float) i11);
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return A() && this.f2289a != 0;
    }

    /* access modifiers changed from: package-private */
    public void q(AttributeSet attributeSet, int i11) {
        int resourceId;
        Context context = this.j;
        int[] iArr = R.styleable.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        TextView textView = this.f2297i;
        a0.u0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i11, 0);
        int i12 = R.styleable.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i12)) {
            this.f2289a = obtainStyledAttributes.getInt(i12, 0);
        }
        int i13 = R.styleable.AppCompatTextView_autoSizeStepGranularity;
        float dimension = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = obtainStyledAttributes.hasValue(i15) ? obtainStyledAttributes.getDimension(i15, -1.0f) : -1.0f;
        int i16 = R.styleable.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i16) && (resourceId = obtainStyledAttributes.getResourceId(i16, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            x(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!A()) {
            this.f2289a = 0;
        } else if (this.f2289a == 1) {
            if (!this.f2295g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                B(dimension2, dimension3, dimension);
            }
            w();
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        if (A()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(i14, (float) i11, displayMetrics), TypedValue.applyDimension(i14, (float) i12, displayMetrics), TypedValue.applyDimension(i14, (float) i13, displayMetrics));
            if (w()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int[] iArr, int i11) throws IllegalArgumentException {
        if (A()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i11 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i12 = 0; i12 < length; i12++) {
                        iArr2[i12] = Math.round(TypedValue.applyDimension(i11, (float) iArr[i12], displayMetrics));
                    }
                }
                this.f2294f = b(iArr2);
                if (!y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2295g = false;
            }
            if (w()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i11) {
        if (!A()) {
            return;
        }
        if (i11 == 0) {
            c();
        } else if (i11 == 1) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (w()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int i11, float f11) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        u(TypedValue.applyDimension(i11, f11, resources.getDisplayMetrics()));
    }
}
