package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.core.view.a0;
import androidx.core.view.h0;
import androidx.core.view.i0;

/* compiled from: AbsActionBarView */
abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0014a f2053a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f2054b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f2055c;

    /* renamed from: d  reason: collision with root package name */
    protected ActionMenuPresenter f2056d;

    /* renamed from: e  reason: collision with root package name */
    protected int f2057e;

    /* renamed from: f  reason: collision with root package name */
    protected h0 f2058f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2059g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2060h;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    protected class C0014a implements i0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2061a = false;

        /* renamed from: b  reason: collision with root package name */
        int f2062b;

        protected C0014a() {
        }

        public void a(View view) {
            this.f2061a = true;
        }

        public void b(View view) {
            if (!this.f2061a) {
                a aVar = a.this;
                aVar.f2058f = null;
                a.super.setVisibility(this.f2062b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.f2061a = false;
        }

        public C0014a d(h0 h0Var, int i11) {
            a.this.f2058f = h0Var;
            this.f2062b = i11;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i11, int i12, boolean z11) {
        return z11 ? i11 - i12 : i11 + i12;
    }

    /* access modifiers changed from: protected */
    public int c(View view, int i11, int i12, int i13) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), i12);
        return Math.max(0, (i11 - view.getMeasuredWidth()) - i13);
    }

    /* access modifiers changed from: protected */
    public int e(View view, int i11, int i12, int i13, boolean z11) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = i12 + ((i13 - measuredHeight) / 2);
        if (z11) {
            view.layout(i11 - measuredWidth, i14, i11, measuredHeight + i14);
        } else {
            view.layout(i11, i14, i11 + measuredWidth, measuredHeight + i14);
        }
        return z11 ? -measuredWidth : measuredWidth;
    }

    public h0 f(int i11, long j) {
        h0 h0Var = this.f2058f;
        if (h0Var != null) {
            h0Var.c();
        }
        if (i11 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            h0 b11 = a0.e(this).b(1.0f);
            b11.f(j);
            b11.h(this.f2053a.d(b11, i11));
            return b11;
        }
        h0 b12 = a0.e(this).b(0.0f);
        b12.f(j);
        b12.h(this.f2053a.d(b12, i11));
        return b12;
    }

    public int getAnimatedVisibility() {
        if (this.f2058f != null) {
            return this.f2053a.f2062b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f2057e;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f2056d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2060h = false;
        }
        if (!this.f2060h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2060h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2060h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2059g = false;
        }
        if (!this.f2059g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2059g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2059g = false;
        }
        return true;
    }

    public void setContentHeight(int i11) {
        this.f2057e = i11;
        requestLayout();
    }

    public void setVisibility(int i11) {
        if (i11 != getVisibility()) {
            h0 h0Var = this.f2058f;
            if (h0Var != null) {
                h0Var.c();
            }
            super.setVisibility(i11);
        }
    }

    a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2053a = new C0014a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2054b = context;
        } else {
            this.f2054b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
