package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.R;
import androidx.core.view.a0;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1812a;

    /* renamed from: b  reason: collision with root package name */
    private View f1813b;

    /* renamed from: c  reason: collision with root package name */
    private View f1814c;

    /* renamed from: d  reason: collision with root package name */
    private View f1815d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f1816e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f1817f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f1818g;

    /* renamed from: h  reason: collision with root package name */
    boolean f1819h;

    /* renamed from: i  reason: collision with root package name */
    boolean f1820i;
    private int j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a0.A0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.f1816e = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.f1817f = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.j = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        boolean z11 = true;
        if (getId() == R.id.split_action_bar) {
            this.f1819h = true;
            this.f1818g = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1819h ? !(this.f1816e == null && this.f1817f == null) : this.f1818g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1816e;
        if (drawable != null && drawable.isStateful()) {
            this.f1816e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1817f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1817f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1818g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1818g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1813b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1816e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1817f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1818g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1814c = findViewById(R.id.action_bar);
        this.f1815d = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1812a || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Drawable drawable;
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.f1813b;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i15 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i11, (measuredHeight - view.getMeasuredHeight()) - i15, i13, measuredHeight - i15);
        }
        if (this.f1819h) {
            Drawable drawable2 = this.f1818g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z12 = false;
            }
        } else {
            if (this.f1816e != null) {
                if (this.f1814c.getVisibility() == 0) {
                    this.f1816e.setBounds(this.f1814c.getLeft(), this.f1814c.getTop(), this.f1814c.getRight(), this.f1814c.getBottom());
                } else {
                    View view2 = this.f1815d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1816e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1816e.setBounds(this.f1815d.getLeft(), this.f1815d.getTop(), this.f1815d.getRight(), this.f1815d.getBottom());
                    }
                }
                z13 = true;
            }
            this.f1820i = z14;
            if (!z14 || (drawable = this.f1817f) == null) {
                z12 = z13;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z12) {
            invalidate();
        }
    }

    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        if (this.f1814c == null && View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i14 = this.j) >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i14, View.MeasureSpec.getSize(i12)), Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
        if (this.f1814c != null) {
            int mode = View.MeasureSpec.getMode(i12);
            View view = this.f1813b;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f1814c)) {
                    i13 = a(this.f1814c);
                } else {
                    i13 = !b(this.f1815d) ? a(this.f1815d) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i13 + a(this.f1813b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i12) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1816e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1816e);
        }
        this.f1816e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1814c;
            if (view != null) {
                this.f1816e.setBounds(view.getLeft(), this.f1814c.getTop(), this.f1814c.getRight(), this.f1814c.getBottom());
            }
        }
        boolean z11 = true;
        if (!this.f1819h ? !(this.f1816e == null && this.f1817f == null) : this.f1818g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1818g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1818g);
        }
        this.f1818g = drawable;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1819h && (drawable2 = this.f1818g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1819h ? this.f1816e == null && this.f1817f == null : this.f1818g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1817f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1817f);
        }
        this.f1817f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1820i && (drawable2 = this.f1817f) != null) {
                drawable2.setBounds(this.f1813b.getLeft(), this.f1813b.getTop(), this.f1813b.getRight(), this.f1813b.getBottom());
            }
        }
        boolean z11 = true;
        if (!this.f1819h ? !(this.f1816e == null && this.f1817f == null) : this.f1818g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(h0 h0Var) {
        View view = this.f1813b;
        if (view != null) {
            removeView(view);
        }
        this.f1813b = h0Var;
        if (h0Var != null) {
            addView(h0Var);
            ViewGroup.LayoutParams layoutParams = h0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            h0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z11) {
        this.f1812a = z11;
        setDescendantFocusability(z11 ? 393216 : 262144);
    }

    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f1816e;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
        Drawable drawable2 = this.f1817f;
        if (drawable2 != null) {
            drawable2.setVisible(z11, false);
        }
        Drawable drawable3 = this.f1818g;
        if (drawable3 != null) {
            drawable3.setVisible(z11, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.startActionModeForChild(view, callback, i11);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1816e && !this.f1819h) || (drawable == this.f1817f && this.f1820i) || ((drawable == this.f1818g && this.f1819h) || super.verifyDrawable(drawable));
    }
}
