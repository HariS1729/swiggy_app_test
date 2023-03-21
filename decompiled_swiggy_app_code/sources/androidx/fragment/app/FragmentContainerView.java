package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.a0;
import androidx.core.view.n0;
import androidx.fragment.R;
import java.util.ArrayList;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<View> f10317a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<View> f10318b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f10319c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10320d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f10320d = true;
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f10318b;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f10317a == null) {
                this.f10317a = new ArrayList<>();
            }
            this.f10317a.add(view);
        }
    }

    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.D0(view) != null) {
            super.addView(view, i11, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        if (FragmentManager.D0(view) != null) {
            return super.addViewInLayout(view, i11, layoutParams, z11);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        n0 n0Var;
        n0 C = n0.C(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f10319c;
        if (onApplyWindowInsetsListener != null) {
            n0Var = n0.C(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            n0Var = a0.i0(this, C);
        }
        if (!n0Var.u()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                a0.i(getChildAt(i11), n0Var);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f10320d && this.f10317a != null) {
            for (int i11 = 0; i11 < this.f10317a.size(); i11++) {
                super.drawChild(canvas, this.f10317a.get(i11), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f10320d || (arrayList = this.f10317a) == null || arrayList.size() <= 0 || !this.f10317a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f10318b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f10317a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f10320d = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z11) {
        if (z11) {
            a(view);
        }
        super.removeDetachedView(view, z11);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i11) {
        a(getChildAt(i11));
        super.removeViewAt(i11);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            a(getChildAt(i13));
        }
        super.removeViews(i11, i12);
    }

    public void removeViewsInLayout(int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            a(getChildAt(i13));
        }
        super.removeViewsInLayout(i11, i12);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z11) {
        this.f10320d = z11;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f10319c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f10318b == null) {
                this.f10318b = new ArrayList<>();
            }
            this.f10318b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        String str;
        this.f10320d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FragmentContainerView);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f10320d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment j02 = fragmentManager.j0(id2);
        if (classAttribute != null && j02 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a11 = fragmentManager.u0().a(context.getClassLoader(), classAttribute);
            a11.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.n().A(true).d(this, a11, string).m();
        }
        fragmentManager.Y0(this);
    }
}
