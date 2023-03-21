package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.e;
import androidx.core.view.a0;
import androidx.core.view.h0;
import defpackage.p1;

public class ActionBarContextView extends a {

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f1821i;
    private CharSequence j;
    private View k;

    /* renamed from: l  reason: collision with root package name */
    private View f1822l;

    /* renamed from: m  reason: collision with root package name */
    private View f1823m;
    private LinearLayout n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f1824o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f1825p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private int f1826r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1827s;
    private int t;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p1.c f1828a;

        a(p1.c cVar) {
            this.f1828a = cVar;
        }

        public void onClick(View view) {
            this.f1828a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void i() {
        if (this.n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.n = linearLayout;
            this.f1824o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1825p = (TextView) this.n.findViewById(R.id.action_bar_subtitle);
            if (this.q != 0) {
                this.f1824o.setTextAppearance(getContext(), this.q);
            }
            if (this.f1826r != 0) {
                this.f1825p.setTextAppearance(getContext(), this.f1826r);
            }
        }
        this.f1824o.setText(this.f1821i);
        this.f1825p.setText(this.j);
        boolean z11 = !TextUtils.isEmpty(this.f1821i);
        boolean z12 = !TextUtils.isEmpty(this.j);
        int i11 = 0;
        this.f1825p.setVisibility(z12 ? 0 : 8);
        LinearLayout linearLayout2 = this.n;
        if (!z11 && !z12) {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    public /* bridge */ /* synthetic */ h0 f(int i11, long j11) {
        return super.f(i11, j11);
    }

    public void g() {
        if (this.k == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.f1821i;
    }

    public void h(p1.c cVar) {
        View view = this.k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.t, this, false);
            this.k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.k);
        }
        View findViewById = this.k.findViewById(R.id.action_mode_close_button);
        this.f1822l = findViewById;
        findViewById.setOnClickListener(new a(cVar));
        e eVar = (e) cVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f2056d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f2056d = actionMenuPresenter2;
        actionMenuPresenter2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f2056d, this.f2054b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f2056d.q(this);
        this.f2055c = actionMenuView;
        a0.A0(actionMenuView, (Drawable) null);
        addView(this.f2055c, layoutParams);
    }

    public boolean j() {
        return this.f1827s;
    }

    public void k() {
        removeAllViews();
        this.f1823m = null;
        this.f2055c = null;
        this.f2056d = null;
        View view = this.f1822l;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.f2056d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f2056d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.f2056d.E();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1821i);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean b11 = u0.b(this);
        int paddingRight = b11 ? (i13 - i11) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
        View view = this.k;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            int i15 = b11 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i16 = b11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d11 = a.d(paddingRight, i15, b11);
            paddingRight = a.d(d11 + e(this.k, d11, paddingTop, paddingTop2, b11), i16, b11);
        }
        int i17 = paddingRight;
        LinearLayout linearLayout = this.n;
        if (!(linearLayout == null || this.f1823m != null || linearLayout.getVisibility() == 8)) {
            i17 += e(this.n, i17, paddingTop, paddingTop2, b11);
        }
        int i18 = i17;
        View view2 = this.f1823m;
        if (view2 != null) {
            e(view2, i18, paddingTop, paddingTop2, b11);
        }
        int paddingLeft = b11 ? getPaddingLeft() : (i13 - i11) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2055c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b11);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int i13 = 1073741824;
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i12) != 0) {
            int size = View.MeasureSpec.getSize(i11);
            int i14 = this.f2057e;
            if (i14 <= 0) {
                i14 = View.MeasureSpec.getSize(i12);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i15 = i14 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
            View view = this.k;
            if (view != null) {
                int c11 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
                paddingLeft = c11 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f2055c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f2055c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.n;
            if (linearLayout != null && this.f1823m == null) {
                if (this.f1827s) {
                    this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.n.getMeasuredWidth();
                    boolean z11 = measuredWidth <= paddingLeft;
                    if (z11) {
                        paddingLeft -= measuredWidth;
                    }
                    this.n.setVisibility(z11 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1823m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i16 = layoutParams.width;
                int i17 = i16 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i16 >= 0) {
                    paddingLeft = Math.min(i16, paddingLeft);
                }
                int i18 = layoutParams.height;
                if (i18 == -2) {
                    i13 = Integer.MIN_VALUE;
                }
                if (i18 >= 0) {
                    i15 = Math.min(i18, i15);
                }
                this.f1823m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i17), View.MeasureSpec.makeMeasureSpec(i15, i13));
            }
            if (this.f2057e <= 0) {
                int childCount = getChildCount();
                int i19 = 0;
                for (int i21 = 0; i21 < childCount; i21++) {
                    int measuredHeight = getChildAt(i21).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i19) {
                        i19 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i19);
                return;
            }
            setMeasuredDimension(size, i14);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i11) {
        this.f2057e = i11;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1823m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1823m = view;
        if (!(view == null || (linearLayout = this.n) == null)) {
            removeView(linearLayout);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1821i = charSequence;
        i();
    }

    public void setTitleOptional(boolean z11) {
        if (z11 != this.f1827s) {
            requestLayout();
        }
        this.f1827s = z11;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        o0 v = o0.v(context, attributeSet, R.styleable.ActionMode, i11, 0);
        a0.A0(this, v.g(R.styleable.ActionMode_background));
        this.q = v.n(R.styleable.ActionMode_titleTextStyle, 0);
        this.f1826r = v.n(R.styleable.ActionMode_subtitleTextStyle, 0);
        this.f2057e = v.m(R.styleable.ActionMode_height, 0);
        this.t = v.n(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
        v.w();
    }
}
