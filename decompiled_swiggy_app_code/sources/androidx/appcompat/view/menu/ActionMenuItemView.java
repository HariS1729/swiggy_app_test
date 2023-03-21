package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.q0;
import defpackage.q1;

public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f  reason: collision with root package name */
    g f1659f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f1660g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f1661h;

    /* renamed from: i  reason: collision with root package name */
    e.b f1662i;
    private a0 j;
    b k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1663l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1664m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f1665o;

    /* renamed from: p  reason: collision with root package name */
    private int f1666p;

    private class a extends a0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public q1.f b() {
            b bVar = ActionMenuItemView.this.k;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            q1.f b11;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f1662i;
            if (bVar == null || !bVar.f(actionMenuItemView.f1659f) || (b11 = b()) == null || !b11.b()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract q1.f a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        return i11 >= 480 || (i11 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        CharSequence charSequence;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f1660g);
        if (this.f1661h != null && (!this.f1659f.B() || (!this.f1663l && !this.f1664m))) {
            z11 = false;
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence2 = null;
        setText(z13 ? this.f1660g : null);
        CharSequence contentDescription = this.f1659f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z13) {
                charSequence = null;
            } else {
                charSequence = this.f1659f.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1659f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z13) {
                charSequence2 = this.f1659f.getTitle();
            }
            q0.a(this, charSequence2);
            return;
        }
        q0.a(this, tooltipText);
    }

    public boolean a() {
        return f();
    }

    public boolean b() {
        return f() && this.f1659f.getIcon() == null;
    }

    public boolean c() {
        return true;
    }

    public void e(g gVar, int i11) {
        this.f1659f = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.j == null) {
            this.j = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public g getItemData() {
        return this.f1659f;
    }

    public void onClick(View view) {
        e.b bVar = this.f1662i;
        if (bVar != null) {
            bVar.f(this.f1659f);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1663l = g();
        h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        boolean f11 = f();
        if (f11 && (i14 = this.f1665o) >= 0) {
            super.setPadding(i14, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i13 = Math.min(size, this.n);
        } else {
            i13 = this.n;
        }
        if (mode != 1073741824 && this.n > 0 && measuredWidth < i13) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
        }
        if (!f11 && this.f1661h != null) {
            super.setPadding((getMeasuredWidth() - this.f1661h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a0 a0Var;
        if (!this.f1659f.hasSubMenu() || (a0Var = this.j) == null || !a0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }

    public void setExpandedFormat(boolean z11) {
        if (this.f1664m != z11) {
            this.f1664m = z11;
            g gVar = this.f1659f;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1661h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i11 = this.f1666p;
            if (intrinsicWidth > i11) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i11) / ((float) intrinsicWidth)));
                intrinsicWidth = i11;
            }
            if (intrinsicHeight > i11) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i11) / ((float) intrinsicHeight)));
            } else {
                i11 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i11);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f1662i = bVar;
    }

    public void setPadding(int i11, int i12, int i13, int i14) {
        this.f1665o = i11;
        super.setPadding(i11, i12, i13, i14);
    }

    public void setPopupCallback(b bVar) {
        this.k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1660g = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Resources resources = context.getResources();
        this.f1663l = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, i11, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1666p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1665o = -1;
        setSaveEnabled(false);
    }
}
