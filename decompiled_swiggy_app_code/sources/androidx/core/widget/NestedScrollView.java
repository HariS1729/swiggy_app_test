package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.R;
import androidx.core.view.ScrollingView;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.e;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.r;
import androidx.core.view.s;
import com.newrelic.agent.android.analytics.AnalyticsEvent;
import java.util.ArrayList;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;

public class NestedScrollView extends FrameLayout implements r, o, ScrollingView {
    private static final a A = new a();
    private static final int[] B = {16843130};

    /* renamed from: a  reason: collision with root package name */
    private long f9613a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f9614b;

    /* renamed from: c  reason: collision with root package name */
    private OverScroller f9615c;

    /* renamed from: d  reason: collision with root package name */
    public EdgeEffect f9616d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f9617e;

    /* renamed from: f  reason: collision with root package name */
    private int f9618f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9619g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9620h;

    /* renamed from: i  reason: collision with root package name */
    private View f9621i;
    private boolean j;
    private VelocityTracker k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9622l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f9623m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f9624o;

    /* renamed from: p  reason: collision with root package name */
    private int f9625p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private final int[] f9626r;

    /* renamed from: s  reason: collision with root package name */
    private final int[] f9627s;
    private int t;

    /* renamed from: u  reason: collision with root package name */
    private int f9628u;
    private SavedState v;

    /* renamed from: w  reason: collision with root package name */
    private final s f9629w;

    /* renamed from: x  reason: collision with root package name */
    private final p f9630x;

    /* renamed from: y  reason: collision with root package name */
    private float f9631y;

    /* renamed from: z  reason: collision with root package name */
    private c f9632z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f9633a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f9633a + "}";
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f9633a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f9633a = parcel.readInt();
        }
    }

    static class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            e.a(accessibilityEvent, nestedScrollView.getScrollX());
            e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            int scrollRange;
            super.g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.c0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.C0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.b(c.a.f9465r);
                    cVar.b(c.a.C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.b(c.a.q);
                    cVar.b(c.a.E);
                }
            }
        }

        public boolean j(View view, int i11, Bundle bundle) {
            if (super.j(view, i11, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i11 != 4096) {
                if (i11 == 8192 || i11 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.Q(0, max, true);
                    return true;
                } else if (i11 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.Q(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nestedScrollViewStyle);
    }

    private boolean A(View view) {
        return !C(view, 0, getHeight());
    }

    private static boolean B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !B((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private boolean C(View view, int i11, int i12) {
        view.getDrawingRect(this.f9614b);
        offsetDescendantRectToMyCoords(view, this.f9614b);
        return this.f9614b.bottom + i11 >= getScrollY() && this.f9614b.top - i11 <= getScrollY() + i12;
    }

    private void D(int i11, int i12, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i11);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9630x.e(0, scrollY2, 0, i11 - scrollY2, (int[]) null, i12, iArr);
    }

    private void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.q) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.f9618f = (int) motionEvent.getY(i11);
            this.q = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void H() {
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.k = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int I(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f9616d
            float r0 = androidx.core.widget.f.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f9616d
            float r4 = -r4
            float r4 = androidx.core.widget.f.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f9616d
            float r5 = androidx.core.widget.f.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f9616d
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f9617e
            float r0 = androidx.core.widget.f.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f9617e
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.f.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f9617e
            float r5 = androidx.core.widget.f.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f9617e
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0064
            r3.invalidate()
        L_0x0064:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.I(int, float):int");
    }

    private void J(boolean z11) {
        if (z11) {
            R(2, 1);
        } else {
            T(1);
        }
        this.f9628u = getScrollY();
        a0.n0(this);
    }

    private boolean K(int i11, int i12, int i13) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z11 = false;
        boolean z12 = i11 == 33;
        View s11 = s(z12, i12, i13);
        if (s11 == null) {
            s11 = this;
        }
        if (i12 < scrollY || i13 > i14) {
            m(z12 ? i12 - scrollY : i13 - i14);
            z11 = true;
        }
        if (s11 != findFocus()) {
            s11.requestFocus(i11);
        }
        return z11;
    }

    private void L(View view) {
        view.getDrawingRect(this.f9614b);
        offsetDescendantRectToMyCoords(view, this.f9614b);
        int f11 = f(this.f9614b);
        if (f11 != 0) {
            scrollBy(0, f11);
        }
    }

    private boolean M(Rect rect, boolean z11) {
        int f11 = f(rect);
        boolean z12 = f11 != 0;
        if (z12) {
            if (z11) {
                scrollBy(0, f11);
            } else {
                N(0, f11);
            }
        }
        return z12;
    }

    private void O(int i11, int i12, int i13, boolean z11) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f9613a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f9615c;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i12 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i13);
                J(z11);
            } else {
                if (!this.f9615c.isFinished()) {
                    a();
                }
                scrollBy(i11, i12);
            }
            this.f9613a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean S(MotionEvent motionEvent) {
        boolean z11;
        if (f.b(this.f9616d) != 0.0f) {
            f.d(this.f9616d, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z11 = true;
        } else {
            z11 = false;
        }
        if (f.b(this.f9617e) == 0.0f) {
            return z11;
        }
        f.d(this.f9617e, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void a() {
        this.f9615c.abortAnimation();
        T(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    private static int e(int i11, int i12, int i13) {
        if (i12 >= i13 || i11 < 0) {
            return 0;
        }
        return i12 + i11 > i13 ? i13 - i12 : i11;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f9631y == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f9631y = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f9631y;
    }

    private void m(int i11) {
        if (i11 == 0) {
            return;
        }
        if (this.f9623m) {
            N(0, i11);
        } else {
            scrollBy(0, i11);
        }
    }

    private boolean p(int i11) {
        if (f.b(this.f9616d) != 0.0f) {
            this.f9616d.onAbsorb(i11);
        } else if (f.b(this.f9617e) == 0.0f) {
            return false;
        } else {
            this.f9617e.onAbsorb(-i11);
        }
        return true;
    }

    private void q() {
        this.j = false;
        H();
        T(0);
        this.f9616d.onRelease();
        this.f9617e.onRelease();
    }

    private View s(boolean z11, int i11, int i12) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (!z14) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private boolean w(int i11, int i12) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i12 < childAt.getTop() - scrollY || i12 >= childAt.getBottom() - scrollY || i11 < childAt.getLeft() || i11 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void x() {
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker == null) {
            this.k = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void y() {
        this.f9615c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.n = viewConfiguration.getScaledTouchSlop();
        this.f9624o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9625p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void z() {
        if (this.k == null) {
            this.k = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean F(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.v(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f9615c
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.F(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean G(int i11) {
        boolean z11 = i11 == 130;
        int height = getHeight();
        if (z11) {
            this.f9614b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f9614b;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f9614b.top = getScrollY() - height;
            Rect rect2 = this.f9614b;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f9614b;
        int i12 = rect3.top;
        int i13 = height + i12;
        rect3.bottom = i13;
        return K(i11, i12, i13);
    }

    public final void N(int i11, int i12) {
        O(i11, i12, AnalyticsEvent.EVENT_TYPE_LIMIT, false);
    }

    /* access modifiers changed from: package-private */
    public void P(int i11, int i12, int i13, boolean z11) {
        O(i11 - getScrollX(), i12 - getScrollY(), i13, z11);
    }

    /* access modifiers changed from: package-private */
    public void Q(int i11, int i12, boolean z11) {
        P(i11, i12, AnalyticsEvent.EVENT_TYPE_LIMIT, z11);
    }

    public boolean R(int i11, int i12) {
        return this.f9630x.p(i11, i12);
    }

    public void T(int i11) {
        this.f9630x.r(i11);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i11) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !C(findNextFocus, maxScrollAmount, getHeight())) {
            if (i11 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i11 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i11 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f9614b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f9614b);
            m(f(this.f9614b));
            findNextFocus.requestFocus(i11);
        }
        if (findFocus == null || !findFocus.isFocused() || !A(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(PDChoice.FLAG_COMBO);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f9615c.isFinished()) {
            this.f9615c.computeScrollOffset();
            int currY = this.f9615c.getCurrY();
            int i11 = currY - this.f9628u;
            this.f9628u = currY;
            int[] iArr = this.f9627s;
            boolean z11 = false;
            iArr[1] = 0;
            g(0, i11, iArr, (int[]) null, 1);
            int i12 = i11 - this.f9627s[1];
            int scrollRange = getScrollRange();
            if (i12 != 0) {
                int scrollY = getScrollY();
                F(0, i12, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i13 = i12 - scrollY2;
                int[] iArr2 = this.f9627s;
                iArr2[1] = 0;
                k(0, scrollY2, 0, i13, this.f9626r, 1, iArr2);
                i12 = i13 - this.f9627s[1];
            }
            if (i12 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z11 = true;
                }
                if (z11) {
                    if (i12 < 0) {
                        if (this.f9616d.isFinished()) {
                            this.f9616d.onAbsorb((int) this.f9615c.getCurrVelocity());
                        }
                    } else if (this.f9617e.isFinished()) {
                        this.f9617e.onAbsorb((int) this.f9615c.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f9615c.isFinished()) {
                a0.n0(this);
            } else {
                T(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || r(keyEvent);
    }

    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f9630x.a(f11, f12, z11);
    }

    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f9630x.b(f11, f12);
    }

    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return g(i11, i12, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f9630x.f(i11, i12, i13, i14, iArr);
    }

    public void draw(Canvas canvas) {
        int i11;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i12 = 0;
        if (!this.f9616d.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i11 = getPaddingLeft() + 0;
            } else {
                i11 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i11, (float) min);
            this.f9616d.setSize(width, height);
            if (this.f9616d.draw(canvas)) {
                a0.n0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f9617e.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i12 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i12 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f9617e.setSize(width2, height2);
            if (this.f9617e.draw(canvas)) {
                a0.n0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int f(Rect rect) {
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i14 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i13 - verticalFadingEdgeLength : i13;
        int i15 = rect.bottom;
        if (i15 > i14 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i14;
            }
            return Math.min(i12 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        } else if (rect.top >= scrollY || i15 >= i14) {
            return 0;
        } else {
            if (rect.height() > height) {
                i11 = 0 - (i14 - rect.bottom);
            } else {
                i11 = 0 - (scrollY - rect.top);
            }
            return Math.max(i11, -getScrollY());
        }
    }

    public boolean g(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return this.f9630x.d(i11, i12, iArr, iArr2, i13);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f9629w.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(View view, View view2, int i11, int i12) {
        this.f9629w.c(view, view2, i11, i12);
        R(2, i12);
    }

    public boolean hasNestedScrollingParent() {
        return v(0);
    }

    public void i(View view, int i11) {
        this.f9629w.e(view, i11);
        T(i11);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f9630x.l();
    }

    public void j(View view, int i11, int i12, int i13, int i14, int i15) {
        D(i14, i15, (int[]) null);
    }

    public void k(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        this.f9630x.e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    public void l(View view, int i11, int i12, int[] iArr, int i13) {
        g(i11, i12, iArr, (int[]) null, i13);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i11, int i12) {
        view.measure(FrameLayout.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        D(i14, i15, iArr);
    }

    public boolean o(View view, View view2, int i11, int i12) {
        return (i11 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9620h = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00a9
            boolean r0 = r8.j
            if (r0 != 0) goto L_0x00a9
            r0 = 2
            boolean r0 = androidx.core.view.n.c(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = androidx.core.view.n.c(r9, r0)
            if (r0 == 0) goto L_0x002b
            r0 = 26
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x0070
            boolean r2 = r8.c()
            if (r2 == 0) goto L_0x0056
            boolean r9 = androidx.core.view.n.c(r9, r5)
            if (r9 != 0) goto L_0x0056
            r9 = 1
            goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            if (r9 == 0) goto L_0x009d
            android.widget.EdgeEffect r9 = r8.f9616d
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.f.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f9616d
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L_0x009e
        L_0x0070:
            if (r0 <= r2) goto L_0x009c
            boolean r7 = r8.c()
            if (r7 == 0) goto L_0x0080
            boolean r9 = androidx.core.view.n.c(r9, r5)
            if (r9 != 0) goto L_0x0080
            r9 = 1
            goto L_0x0081
        L_0x0080:
            r9 = 0
        L_0x0081:
            if (r9 == 0) goto L_0x0099
            android.widget.EdgeEffect r9 = r8.f9617e
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.f.d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f9617e
            r9.onRelease()
            r8.invalidate()
            r1 = 1
        L_0x0099:
            r9 = r1
            r1 = r2
            goto L_0x009e
        L_0x009c:
            r1 = r0
        L_0x009d:
            r9 = 0
        L_0x009e:
            if (r1 == r3) goto L_0x00a8
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00a8:
            return r9
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.j) {
            return true;
        }
        int i11 = action & 255;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = this.q;
                    if (i12 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i12);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i12 + " in onInterceptTouchEvent");
                        } else {
                            int y11 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y11 - this.f9618f) > this.n && (2 & getNestedScrollAxes()) == 0) {
                                this.j = true;
                                this.f9618f = y11;
                                z();
                                this.k.addMovement(motionEvent);
                                this.t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i11 != 3) {
                    if (i11 == 6) {
                        E(motionEvent);
                    }
                }
            }
            this.j = false;
            this.q = -1;
            H();
            if (this.f9615c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                a0.n0(this);
            }
            T(0);
        } else {
            int y12 = (int) motionEvent.getY();
            if (!w((int) motionEvent.getX(), y12)) {
                if (!S(motionEvent) && this.f9615c.isFinished()) {
                    z11 = false;
                }
                this.j = z11;
                H();
            } else {
                this.f9618f = y12;
                this.q = motionEvent.getPointerId(0);
                x();
                this.k.addMovement(motionEvent);
                this.f9615c.computeScrollOffset();
                if (!S(motionEvent) && this.f9615c.isFinished()) {
                    z11 = false;
                }
                this.j = z11;
                R(2, 0);
            }
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int i15 = 0;
        this.f9619g = false;
        View view = this.f9621i;
        if (view != null && B(view, this)) {
            L(this.f9621i);
        }
        this.f9621i = null;
        if (!this.f9620h) {
            if (this.v != null) {
                scrollTo(getScrollX(), this.v.f9633a);
                this.v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i15 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e11 = e(scrollY, paddingTop, i15);
            if (e11 != scrollY) {
                scrollTo(getScrollX(), e11);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9620h = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f9622l && View.MeasureSpec.getMode(i12) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (z11) {
            return false;
        }
        dispatchNestedFling(0.0f, f12, true);
        t((int) f12);
        return true;
    }

    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        l(view, i11, i12, iArr, 0);
    }

    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        D(i14, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i11) {
        h(view, view2, i11, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        super.scrollTo(i11, i12);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i11, Rect rect) {
        View view;
        if (i11 == 2) {
            i11 = 130;
        } else if (i11 == 1) {
            i11 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i11);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i11);
        }
        if (view != null && !A(view)) {
            return view.requestFocus(i11, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.v = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9633a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        c cVar = this.f9632z;
        if (cVar != null) {
            cVar.a(this, i11, i12, i13, i14);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && C(findFocus, 0, i14)) {
            findFocus.getDrawingRect(this.f9614b);
            offsetDescendantRectToMyCoords(findFocus, this.f9614b);
            m(f(this.f9614b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return o(view, view2, i11, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.z()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.t = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.t
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0230
            r3 = -1
            if (r0 == r14) goto L_0x01df
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x025f
        L_0x002f:
            r23.E(r24)
            int r0 = r10.q
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f9618f = r0
            goto L_0x025f
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f9618f = r1
            int r0 = r11.getPointerId(r0)
            r10.q = r0
            goto L_0x025f
        L_0x0054:
            boolean r0 = r10.j
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f9615c
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            androidx.core.view.a0.n0(r23)
        L_0x007b:
            r10.q = r3
            r23.q()
            goto L_0x025f
        L_0x0082:
            int r0 = r10.q
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.q
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x025f
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f9618f
            int r0 = r0 - r6
            float r1 = r11.getX(r15)
            int r1 = r10.I(r0, r1)
            int r0 = r0 - r1
            boolean r1 = r10.j
            if (r1 != 0) goto L_0x00da
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.n
            if (r1 <= r2) goto L_0x00da
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00cf
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00cf:
            r10.j = r14
            if (r0 <= 0) goto L_0x00d7
            int r1 = r10.n
            int r0 = r0 - r1
            goto L_0x00da
        L_0x00d7:
            int r1 = r10.n
            int r0 = r0 + r1
        L_0x00da:
            r7 = r0
            boolean r0 = r10.j
            if (r0 == 0) goto L_0x025f
            r1 = 0
            int[] r3 = r10.f9627s
            int[] r4 = r10.f9626r
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.g(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00fc
            int[] r0 = r10.f9627s
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.t
            int[] r1 = r10.f9626r
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.t = r0
        L_0x00fc:
            r16 = r7
            int[] r0 = r10.f9626r
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f9618f = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x011b
            if (r0 != r14) goto L_0x0118
            if (r9 <= 0) goto L_0x0118
            goto L_0x011b
        L_0x0118:
            r18 = 0
            goto L_0x011d
        L_0x011b:
            r18 = 1
        L_0x011d:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x013f
            boolean r0 = r10.v(r12)
            if (r0 != 0) goto L_0x013f
            r8 = 1
            goto L_0x0140
        L_0x013f:
            r8 = 0
        L_0x0140:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f9627s
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f9626r
            r6 = 0
            r0 = r23
            r0.k(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f9618f
            int[] r1 = r10.f9626r
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f9618f = r0
            int r0 = r10.t
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.t = r0
            if (r18 == 0) goto L_0x01d5
            int[] r0 = r10.f9627s
            r0 = r0[r14]
            int r0 = r16 - r0
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0197
            android.widget.EdgeEffect r1 = r10.f9616d
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.f.d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f9617e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01c1
            android.widget.EdgeEffect r0 = r10.f9617e
            r0.onRelease()
            goto L_0x01c1
        L_0x0197:
            r2 = r22
            if (r1 <= r2) goto L_0x01c1
            android.widget.EdgeEffect r1 = r10.f9617e
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.f.d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f9616d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01c1
            android.widget.EdgeEffect r0 = r10.f9616d
            r0.onRelease()
        L_0x01c1:
            android.widget.EdgeEffect r0 = r10.f9616d
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01d1
            android.widget.EdgeEffect r0 = r10.f9617e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01d5
        L_0x01d1:
            androidx.core.view.a0.n0(r23)
            goto L_0x01d6
        L_0x01d5:
            r12 = r8
        L_0x01d6:
            if (r12 == 0) goto L_0x025f
            android.view.VelocityTracker r0 = r10.k
            r0.clear()
            goto L_0x025f
        L_0x01df:
            android.view.VelocityTracker r0 = r10.k
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f9625p
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.q
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f9624o
            if (r1 < r4) goto L_0x020d
            boolean r1 = r10.p(r0)
            if (r1 != 0) goto L_0x022a
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x022a
            r10.dispatchNestedFling(r2, r1, r14)
            r10.t(r0)
            goto L_0x022a
        L_0x020d:
            android.widget.OverScroller r15 = r10.f9615c
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x022a
            androidx.core.view.a0.n0(r23)
        L_0x022a:
            r10.q = r3
            r23.q()
            goto L_0x025f
        L_0x0230:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x0237
            return r12
        L_0x0237:
            boolean r0 = r10.j
            if (r0 == 0) goto L_0x0244
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0244
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0244:
            android.widget.OverScroller r0 = r10.f9615c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x024f
            r23.a()
        L_0x024f:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f9618f = r0
            int r0 = r11.getPointerId(r12)
            r10.q = r0
            r10.R(r1, r12)
        L_0x025f:
            android.view.VelocityTracker r0 = r10.k
            if (r0 == 0) goto L_0x0266
            r0.addMovement(r13)
        L_0x0266:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r(KeyEvent keyEvent) {
        this.f9614b.setEmpty();
        int i11 = 130;
        if (!d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i11 = 33;
                    }
                    G(i11);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return b(130);
                } else {
                    return u(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return b(33);
            } else {
                return u(33);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f9619g) {
            L(view2);
        } else {
            this.f9621i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return M(rect, z11);
    }

    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (z11) {
            H();
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public void requestLayout() {
        this.f9619g = true;
        super.requestLayout();
    }

    public void scrollTo(int i11, int i12) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e11 = e(i11, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e12 = e(i12, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e11 != getScrollX() || e12 != getScrollY()) {
                super.scrollTo(e11, e12);
            }
        }
    }

    public void setFillViewport(boolean z11) {
        if (z11 != this.f9622l) {
            this.f9622l = z11;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z11) {
        this.f9630x.m(z11);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.f9632z = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z11) {
        this.f9623m = z11;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i11) {
        return R(i11, 0);
    }

    public void stopNestedScroll() {
        T(0);
    }

    public void t(int i11) {
        if (getChildCount() > 0) {
            this.f9615c.fling(getScrollX(), getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            J(true);
        }
    }

    public boolean u(int i11) {
        int childCount;
        boolean z11 = i11 == 130;
        int height = getHeight();
        Rect rect = this.f9614b;
        rect.top = 0;
        rect.bottom = height;
        if (z11 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f9614b.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f9614b;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f9614b;
        return K(i11, rect3.top, rect3.bottom);
    }

    public boolean v(int i11) {
        return this.f9630x.k(i11);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f9614b = new Rect();
        this.f9619g = true;
        this.f9620h = false;
        this.f9621i = null;
        this.j = false;
        this.f9623m = true;
        this.q = -1;
        this.f9626r = new int[2];
        this.f9627s = new int[2];
        this.f9616d = f.a(context, attributeSet);
        this.f9617e = f.a(context, attributeSet);
        y();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B, i11, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f9629w = new s(this);
        this.f9630x = new p(this);
        setNestedScrollingEnabled(true);
        a0.w0(this, A);
    }

    public void addView(View view, int i11) {
        if (getChildCount() <= 0) {
            super.addView(view, i11);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i11, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
