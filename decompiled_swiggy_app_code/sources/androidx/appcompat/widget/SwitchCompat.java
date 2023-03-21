package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.core.view.a0;
import androidx.core.widget.l;
import com.newrelic.agent.android.util.SafeJsonPrimitive;

public class SwitchCompat extends CompoundButton {
    private static final Property<SwitchCompat, Float> O = new a(Float.class, "thumbPos");
    private static final int[] P = {16842912};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private final TextPaint F;
    private ColorStateList G;
    private Layout H;
    private Layout I;
    private TransformationMethod K;
    ObjectAnimator L;
    private final s M;
    private final Rect N;

    /* renamed from: a  reason: collision with root package name */
    private Drawable f1999a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f2000b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f2001c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2002d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2003e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f2004f;

    /* renamed from: g  reason: collision with root package name */
    private ColorStateList f2005g;

    /* renamed from: h  reason: collision with root package name */
    private PorterDuff.Mode f2006h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2007i;
    private boolean j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private int f2008l;

    /* renamed from: m  reason: collision with root package name */
    private int f2009m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f2010o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f2011p;
    private boolean q;

    /* renamed from: r  reason: collision with root package name */
    private int f2012r;

    /* renamed from: s  reason: collision with root package name */
    private int f2013s;
    private float t;

    /* renamed from: u  reason: collision with root package name */
    private float f2014u;
    private VelocityTracker v;

    /* renamed from: w  reason: collision with root package name */
    private int f2015w;

    /* renamed from: x  reason: collision with root package name */
    float f2016x;

    /* renamed from: y  reason: collision with root package name */
    private int f2017y;

    /* renamed from: z  reason: collision with root package name */
    private int f2018z;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f2016x);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f11) {
            switchCompat.setThumbPosition(f11.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    private void a(boolean z11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, O, new float[]{z11 ? 1.0f : 0.0f});
        this.L = ofFloat;
        ofFloat.setDuration(250);
        this.L.setAutoCancel(true);
        this.L.start();
    }

    private void b() {
        Drawable drawable = this.f1999a;
        if (drawable == null) {
            return;
        }
        if (this.f2002d || this.f2003e) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f1999a = mutate;
            if (this.f2002d) {
                androidx.core.graphics.drawable.a.o(mutate, this.f2000b);
            }
            if (this.f2003e) {
                androidx.core.graphics.drawable.a.p(this.f1999a, this.f2001c);
            }
            if (this.f1999a.isStateful()) {
                this.f1999a.setState(getDrawableState());
            }
        }
    }

    private void c() {
        Drawable drawable = this.f2004f;
        if (drawable == null) {
            return;
        }
        if (this.f2007i || this.j) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f2004f = mutate;
            if (this.f2007i) {
                androidx.core.graphics.drawable.a.o(mutate, this.f2005g);
            }
            if (this.j) {
                androidx.core.graphics.drawable.a.p(this.f2004f, this.f2006h);
            }
            if (this.f2004f.isStateful()) {
                this.f2004f.setState(getDrawableState());
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f11, float f12, float f13) {
        return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
    }

    private boolean g(float f11, float f12) {
        if (this.f1999a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1999a.getPadding(this.N);
        int i11 = this.C;
        int i12 = this.f2013s;
        int i13 = i11 - i12;
        int i14 = (this.B + thumbOffset) - i12;
        Rect rect = this.N;
        int i15 = this.A + i14 + rect.left + rect.right + i12;
        int i16 = this.E + i12;
        if (f11 <= ((float) i14) || f11 >= ((float) i15) || f12 <= ((float) i13) || f12 >= ((float) i16)) {
            return false;
        }
        return true;
    }

    private boolean getTargetCheckedState() {
        return this.f2016x > 0.5f;
    }

    private int getThumbOffset() {
        float f11;
        if (u0.b(this)) {
            f11 = 1.0f - this.f2016x;
        } else {
            f11 = this.f2016x;
        }
        return (int) ((f11 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f2004f;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.N;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1999a;
        if (drawable2 != null) {
            rect = x.d(drawable2);
        } else {
            rect = x.f2305c;
        }
        return ((((this.f2017y - this.A) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.F;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f2011p;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_off);
            }
            a0.O0(this, charSequence);
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f2010o;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_on);
            }
            a0.O0(this, charSequence);
        }
    }

    private void m(int i11, int i12) {
        Typeface typeface;
        if (i11 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i11 != 2) {
            typeface = i11 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        l(typeface, i12);
    }

    private void n(MotionEvent motionEvent) {
        this.f2012r = 0;
        boolean z11 = true;
        boolean z12 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z12) {
            this.v.computeCurrentVelocity(1000);
            float xVelocity = this.v.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f2015w)) {
                z11 = getTargetCheckedState();
            } else if (!u0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z11 = false;
            }
        } else {
            z11 = isChecked;
        }
        if (z11 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z11);
        e(motionEvent);
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i11;
        int i12;
        Rect rect2 = this.N;
        int i13 = this.B;
        int i14 = this.C;
        int i15 = this.D;
        int i16 = this.E;
        int thumbOffset = getThumbOffset() + i13;
        Drawable drawable = this.f1999a;
        if (drawable != null) {
            rect = x.d(drawable);
        } else {
            rect = x.f2305c;
        }
        Drawable drawable2 = this.f2004f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i17 = rect2.left;
            thumbOffset += i17;
            if (rect != null) {
                int i18 = rect.left;
                if (i18 > i17) {
                    i13 += i18 - i17;
                }
                int i19 = rect.top;
                int i21 = rect2.top;
                i11 = i19 > i21 ? (i19 - i21) + i14 : i14;
                int i22 = rect.right;
                int i23 = rect2.right;
                if (i22 > i23) {
                    i15 -= i22 - i23;
                }
                int i24 = rect.bottom;
                int i25 = rect2.bottom;
                if (i24 > i25) {
                    i12 = i16 - (i24 - i25);
                    this.f2004f.setBounds(i13, i11, i15, i12);
                }
            } else {
                i11 = i14;
            }
            i12 = i16;
            this.f2004f.setBounds(i13, i11, i15, i12);
        }
        Drawable drawable3 = this.f1999a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i26 = thumbOffset - rect2.left;
            int i27 = thumbOffset + this.A + rect2.right;
            this.f1999a.setBounds(i26, i14, i27, i16);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, i26, i14, i27, i16);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f1999a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f11, f12);
        }
        Drawable drawable2 = this.f2004f;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f11, f12);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1999a;
        boolean z11 = false;
        if (drawable != null && drawable.isStateful()) {
            z11 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2004f;
        if (drawable2 != null && drawable2.isStateful()) {
            z11 |= drawable2.setState(drawableState);
        }
        if (z11) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!u0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2017y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2009m : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (u0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2017y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2009m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.q;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.f2008l;
    }

    public int getSwitchPadding() {
        return this.f2009m;
    }

    public CharSequence getTextOff() {
        return this.f2011p;
    }

    public CharSequence getTextOn() {
        return this.f2010o;
    }

    public Drawable getThumbDrawable() {
        return this.f1999a;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.f2000b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2001c;
    }

    public Drawable getTrackDrawable() {
        return this.f2004f;
    }

    public ColorStateList getTrackTintList() {
        return this.f2005g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2006h;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1999a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2004f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.L.end();
            this.L = null;
        }
    }

    public void k(Context context, int i11) {
        o0 t11 = o0.t(context, i11, R.styleable.TextAppearance);
        ColorStateList c11 = t11.c(R.styleable.TextAppearance_android_textColor);
        if (c11 != null) {
            this.G = c11;
        } else {
            this.G = getTextColors();
        }
        int f11 = t11.f(R.styleable.TextAppearance_android_textSize, 0);
        if (f11 != 0) {
            float f12 = (float) f11;
            if (f12 != this.F.getTextSize()) {
                this.F.setTextSize(f12);
                requestLayout();
            }
        }
        m(t11.k(R.styleable.TextAppearance_android_typeface, -1), t11.k(R.styleable.TextAppearance_android_textStyle, -1));
        if (t11.a(R.styleable.TextAppearance_textAllCaps, false)) {
            this.K = new i.a(getContext());
        } else {
            this.K = null;
        }
        t11.w();
    }

    public void l(Typeface typeface, int i11) {
        Typeface typeface2;
        float f11 = 0.0f;
        boolean z11 = false;
        if (i11 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i11);
            } else {
                typeface2 = Typeface.create(typeface, i11);
            }
            setSwitchTypeface(typeface2);
            int i12 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i11;
            TextPaint textPaint = this.F;
            if ((i12 & 1) != 0) {
                z11 = true;
            }
            textPaint.setFakeBoldText(z11);
            TextPaint textPaint2 = this.F;
            if ((i12 & 2) != 0) {
                f11 = -0.25f;
            }
            textPaint2.setTextSkewX(f11);
            return;
        }
        this.F.setFakeBoldText(false);
        this.F.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, P);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.f2004f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i12 = this.C;
        int i13 = this.E;
        int i14 = i12 + rect.top;
        int i15 = i13 - rect.bottom;
        Drawable drawable2 = this.f1999a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d11 = x.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d11.left;
                rect.right -= d11.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.H : this.I;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.G;
            if (colorStateList != null) {
                this.F.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.F.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i11 = bounds.left + bounds.right;
            } else {
                i11 = getWidth();
            }
            canvas.translate((float) ((i11 / 2) - (layout.getWidth() / 2)), (float) (((i14 + i15) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f2010o : this.f2011p;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(SafeJsonPrimitive.NULL_CHAR);
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        super.onLayout(z11, i11, i12, i13, i14);
        int i22 = 0;
        if (this.f1999a != null) {
            Rect rect = this.N;
            Drawable drawable = this.f2004f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d11 = x.d(this.f1999a);
            i15 = Math.max(0, d11.left - rect.left);
            i22 = Math.max(0, d11.right - rect.right);
        } else {
            i15 = 0;
        }
        if (u0.b(this)) {
            i17 = getPaddingLeft() + i15;
            i16 = ((this.f2017y + i17) - i15) - i22;
        } else {
            i16 = (getWidth() - getPaddingRight()) - i22;
            i17 = (i16 - this.f2017y) + i15 + i22;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i21 = this.f2018z;
            i19 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i21 / 2);
        } else if (gravity != 80) {
            i19 = getPaddingTop();
            i21 = this.f2018z;
        } else {
            i18 = getHeight() - getPaddingBottom();
            i19 = i18 - this.f2018z;
            this.B = i17;
            this.C = i19;
            this.E = i18;
            this.D = i16;
        }
        i18 = i21 + i19;
        this.B = i17;
        this.C = i19;
        this.E = i18;
        this.D = i16;
    }

    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        if (this.q) {
            if (this.H == null) {
                this.H = h(this.f2010o);
            }
            if (this.I == null) {
                this.I = h(this.f2011p);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.f1999a;
        int i15 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i14 = (this.f1999a.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f1999a.getIntrinsicHeight();
        } else {
            i14 = 0;
            i13 = 0;
        }
        this.A = Math.max(this.q ? Math.max(this.H.getWidth(), this.I.getWidth()) + (this.k * 2) : 0, i14);
        Drawable drawable2 = this.f2004f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f2004f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f1999a;
        if (drawable3 != null) {
            Rect d11 = x.d(drawable3);
            i16 = Math.max(i16, d11.left);
            i17 = Math.max(i17, d11.right);
        }
        int max = Math.max(this.f2008l, (this.A * 2) + i16 + i17);
        int max2 = Math.max(i15, i13);
        this.f2017y = max;
        this.f2018z = max2;
        super.onMeasure(i11, i12);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2010o : this.f2011p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.v
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f2012r
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.t
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.u0.b(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f2016x
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f2016x
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.t = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.t
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f2013s
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f2014u
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f2013s
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f2012r = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.t = r0
            r6.f2014u = r3
            return r1
        L_0x008b:
            int r0 = r6.f2012r
            if (r0 != r2) goto L_0x0096
            r6.n(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f2012r = r0
            android.view.VelocityTracker r0 = r6.v
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.f2012r = r1
            r6.t = r0
            r6.f2014u = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z11) {
        super.setChecked(z11);
        boolean isChecked = isChecked();
        if (isChecked) {
            j();
        } else {
            i();
        }
        if (getWindowToken() == null || !a0.a0(this)) {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.q(this, callback));
    }

    public void setShowText(boolean z11) {
        if (this.q != z11) {
            this.q = z11;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z11) {
        this.n = z11;
        invalidate();
    }

    public void setSwitchMinWidth(int i11) {
        this.f2008l = i11;
        requestLayout();
    }

    public void setSwitchPadding(int i11) {
        this.f2009m = i11;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.F.getTypeface() != null && !this.F.getTypeface().equals(typeface)) || (this.F.getTypeface() == null && typeface != null)) {
            this.F.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2011p = charSequence;
        requestLayout();
        if (!isChecked()) {
            i();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2010o = charSequence;
        requestLayout();
        if (isChecked()) {
            j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1999a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1999a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f11) {
        this.f2016x = f11;
        invalidate();
    }

    public void setThumbResource(int i11) {
        setThumbDrawable(f.a.b(getContext(), i11));
    }

    public void setThumbTextPadding(int i11) {
        this.k = i11;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2000b = colorStateList;
        this.f2002d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2001c = mode;
        this.f2003e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2004f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2004f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i11) {
        setTrackDrawable(f.a.b(getContext(), i11));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2005g = colorStateList;
        this.f2007i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2006h = mode;
        this.j = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1999a || drawable == this.f2004f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2000b = null;
        this.f2001c = null;
        this.f2002d = false;
        this.f2003e = false;
        this.f2005g = null;
        this.f2006h = null;
        this.f2007i = false;
        this.j = false;
        this.v = VelocityTracker.obtain();
        this.N = new Rect();
        j0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = R.styleable.SwitchCompat;
        o0 v11 = o0.v(context, attributeSet, iArr, i11, 0);
        a0.u0(this, context, iArr, attributeSet, v11.r(), i11, 0);
        Drawable g11 = v11.g(R.styleable.SwitchCompat_android_thumb);
        this.f1999a = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        Drawable g12 = v11.g(R.styleable.SwitchCompat_track);
        this.f2004f = g12;
        if (g12 != null) {
            g12.setCallback(this);
        }
        this.f2010o = v11.p(R.styleable.SwitchCompat_android_textOn);
        this.f2011p = v11.p(R.styleable.SwitchCompat_android_textOff);
        this.q = v11.a(R.styleable.SwitchCompat_showText, true);
        this.k = v11.f(R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.f2008l = v11.f(R.styleable.SwitchCompat_switchMinWidth, 0);
        this.f2009m = v11.f(R.styleable.SwitchCompat_switchPadding, 0);
        this.n = v11.a(R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList c11 = v11.c(R.styleable.SwitchCompat_thumbTint);
        if (c11 != null) {
            this.f2000b = c11;
            this.f2002d = true;
        }
        PorterDuff.Mode e11 = x.e(v11.k(R.styleable.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f2001c != e11) {
            this.f2001c = e11;
            this.f2003e = true;
        }
        if (this.f2002d || this.f2003e) {
            b();
        }
        ColorStateList c12 = v11.c(R.styleable.SwitchCompat_trackTint);
        if (c12 != null) {
            this.f2005g = c12;
            this.f2007i = true;
        }
        PorterDuff.Mode e12 = x.e(v11.k(R.styleable.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f2006h != e12) {
            this.f2006h = e12;
            this.j = true;
        }
        if (this.f2007i || this.j) {
            c();
        }
        int n11 = v11.n(R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (n11 != 0) {
            k(context, n11);
        }
        s sVar = new s(this);
        this.M = sVar;
        sVar.m(attributeSet, i11);
        v11.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2013s = viewConfiguration.getScaledTouchSlop();
        this.f2015w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
