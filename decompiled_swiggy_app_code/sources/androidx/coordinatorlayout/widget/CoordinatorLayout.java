package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R;
import androidx.core.view.a0;
import androidx.core.view.n0;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.t;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements q, r {

    /* renamed from: u  reason: collision with root package name */
    static final String f8910u;
    static final Class<?>[] v = {Context.class, AttributeSet.class};

    /* renamed from: w  reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f8911w = new ThreadLocal<>();

    /* renamed from: x  reason: collision with root package name */
    static final Comparator<View> f8912x = new h();

    /* renamed from: y  reason: collision with root package name */
    private static final androidx.core.util.e<Rect> f8913y = new androidx.core.util.f(12);

    /* renamed from: a  reason: collision with root package name */
    private final List<View> f8914a;

    /* renamed from: b  reason: collision with root package name */
    private final a<View> f8915b;

    /* renamed from: c  reason: collision with root package name */
    private final List<View> f8916c;

    /* renamed from: d  reason: collision with root package name */
    private final List<View> f8917d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f8918e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f8919f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f8920g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8921h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8922i;
    private int[] j;
    private View k;

    /* renamed from: l  reason: collision with root package name */
    private View f8923l;

    /* renamed from: m  reason: collision with root package name */
    private g f8924m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private n0 f8925o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8926p;
    private Drawable q;

    /* renamed from: r  reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f8927r;

    /* renamed from: s  reason: collision with root package name */
    private t f8928s;
    private final s t;

    class a implements t {
        a() {
        }

        public n0 a(View view, n0 n0Var) {
            return CoordinatorLayout.this.X(n0Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i11, int i12) {
            if (i12 == 0) {
                return z(coordinatorLayout, v, view, view2, i11);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i11) {
            if (i11 == 0) {
                B(coordinatorLayout, v, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v) {
            return d(coordinatorLayout, v) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public n0 f(CoordinatorLayout coordinatorLayout, V v, n0 n0Var) {
            return n0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v, int i11) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v, int i11, int i12, int i13, int i14) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f11, float f12, boolean z11) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f11, float f12) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i11, int i12, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i11, int i12, int[] iArr, int i13) {
            if (i13 == 0) {
                p(coordinatorLayout, v, view, i11, i12, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i11, int i12, int i13, int i14) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v, View view, int i11, int i12, int i13, int i14, int i15) {
            if (i15 == 0) {
                r(coordinatorLayout, v, view, i11, i12, i13, i14);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
            s(coordinatorLayout, v, view, i11, i12, i13, i14, i15);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i11) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i11, int i12) {
            if (i12 == 0) {
                u(coordinatorLayout, v, view, view2, i11);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z11) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i11) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f8927r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.I(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f8927r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.I(0);
            return true;
        }
    }

    static class h implements Comparator<View> {
        h() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float T = a0.T(view);
            float T2 = a0.T(view2);
            if (T > T2) {
                return -1;
            }
            return T < T2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f8910u = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
            r0.<init>()
            f8912x = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            v = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f8911w = r0
            androidx.core.util.f r0 = new androidx.core.util.f
            r1 = 12
            r0.<init>(r1)
            f8913y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        Comparator<View> comparator = f8912x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean B(View view) {
        return this.f8915b.j(view);
    }

    private void D(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        Rect a11 = a();
        a11.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f8925o != null && a0.C(this) && !a0.C(view)) {
            a11.left += this.f8925o.p();
            a11.top += this.f8925o.r();
            a11.right -= this.f8925o.q();
            a11.bottom -= this.f8925o.o();
        }
        Rect a12 = a();
        androidx.core.view.e.a(T(fVar.f8934c), view.getMeasuredWidth(), view.getMeasuredHeight(), a11, a12, i11);
        view.layout(a12.left, a12.top, a12.right, a12.bottom);
        P(a11);
        P(a12);
    }

    private void E(View view, View view2, int i11) {
        Rect a11 = a();
        Rect a12 = a();
        try {
            u(view2, a11);
            v(view, i11, a11, a12);
            view.layout(a12.left, a12.top, a12.right, a12.bottom);
        } finally {
            P(a11);
            P(a12);
        }
    }

    private void F(View view, int i11, int i12) {
        f fVar = (f) view.getLayoutParams();
        int b11 = androidx.core.view.e.b(U(fVar.f8934c), i12);
        int i13 = b11 & 7;
        int i14 = b11 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i12 == 1) {
            i11 = width - i11;
        }
        int x11 = x(i11) - measuredWidth;
        int i15 = 0;
        if (i13 == 1) {
            x11 += measuredWidth / 2;
        } else if (i13 == 5) {
            x11 += measuredWidth;
        }
        if (i14 == 16) {
            i15 = 0 + (measuredHeight / 2);
        } else if (i14 == 80) {
            i15 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(x11, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void G(View view, Rect rect, int i11) {
        boolean z11;
        boolean z12;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        if (a0.a0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f11 = fVar.f();
            Rect a11 = a();
            Rect a12 = a();
            a12.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f11 == null || !f11.b(this, view, a11)) {
                a11.set(a12);
            } else if (!a12.contains(a11)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a11.toShortString() + " | Bounds:" + a12.toShortString());
            }
            P(a12);
            if (a11.isEmpty()) {
                P(a11);
                return;
            }
            int b11 = androidx.core.view.e.b(fVar.f8939h, i11);
            boolean z13 = true;
            if ((b11 & 48) != 48 || (i16 = (a11.top - fVar.topMargin) - fVar.j) >= (i17 = rect.top)) {
                z11 = false;
            } else {
                W(view, i17 - i16);
                z11 = true;
            }
            if ((b11 & 80) == 80 && (height = ((getHeight() - a11.bottom) - fVar.bottomMargin) + fVar.j) < (i15 = rect.bottom)) {
                W(view, height - i15);
                z11 = true;
            }
            if (!z11) {
                W(view, 0);
            }
            if ((b11 & 3) != 3 || (i13 = (a11.left - fVar.leftMargin) - fVar.f8940i) >= (i14 = rect.left)) {
                z12 = false;
            } else {
                V(view, i14 - i13);
                z12 = true;
            }
            if ((b11 & 5) != 5 || (width = ((getWidth() - a11.right) - fVar.rightMargin) + fVar.f8940i) >= (i12 = rect.right)) {
                z13 = z12;
            } else {
                V(view, width - i12);
            }
            if (!z13) {
                V(view, 0);
            }
            P(a11);
        }
    }

    static c L(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f8910u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f8911w;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e11) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e11);
        }
    }

    private boolean M(MotionEvent motionEvent, int i11) {
        MotionEvent motionEvent2 = motionEvent;
        int i12 = i11;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f8916c;
        A(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = list.get(i13);
            f fVar = (f) view.getLayoutParams();
            c f11 = fVar.f();
            if ((!z11 && !z12) || actionMasked == 0) {
                if (!z11 && f11 != null) {
                    if (i12 == 0) {
                        z11 = f11.k(this, view, motionEvent2);
                    } else if (i12 == 1) {
                        z11 = f11.D(this, view, motionEvent2);
                    }
                    if (z11) {
                        this.k = view;
                    }
                }
                boolean c11 = fVar.c();
                boolean i14 = fVar.i(this, view);
                z12 = i14 && !c11;
                if (i14 && !z12) {
                    break;
                }
            } else if (f11 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i12 == 0) {
                    f11.k(this, view, motionEvent3);
                } else if (i12 == 1) {
                    f11.D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z11;
    }

    private void N() {
        this.f8914a.clear();
        this.f8915b.c();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f z11 = z(childAt);
            z11.d(this, childAt);
            this.f8915b.b(childAt);
            for (int i12 = 0; i12 < childCount; i12++) {
                if (i12 != i11) {
                    View childAt2 = getChildAt(i12);
                    if (z11.b(this, childAt, childAt2)) {
                        if (!this.f8915b.d(childAt2)) {
                            this.f8915b.b(childAt2);
                        }
                        this.f8915b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f8914a.addAll(this.f8915b.i());
        Collections.reverse(this.f8914a);
    }

    private static void P(Rect rect) {
        rect.setEmpty();
        f8913y.a(rect);
    }

    private void R(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            c f11 = ((f) childAt.getLayoutParams()).f();
            if (f11 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z11) {
                    f11.k(this, childAt, obtain);
                } else {
                    f11.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).m();
        }
        this.k = null;
        this.f8921h = false;
    }

    private static int S(int i11) {
        if (i11 == 0) {
            return 17;
        }
        return i11;
    }

    private static int T(int i11) {
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        return (i11 & 112) == 0 ? i11 | 48 : i11;
    }

    private static int U(int i11) {
        if (i11 == 0) {
            return 8388661;
        }
        return i11;
    }

    private void V(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        int i12 = fVar.f8940i;
        if (i12 != i11) {
            a0.g0(view, i11 - i12);
            fVar.f8940i = i11;
        }
    }

    private void W(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        int i12 = fVar.j;
        if (i12 != i11) {
            a0.h0(view, i11 - i12);
            fVar.j = i11;
        }
    }

    private void Y() {
        if (a0.C(this)) {
            if (this.f8928s == null) {
                this.f8928s = new a();
            }
            a0.K0(this, this.f8928s);
            setSystemUiVisibility(1280);
            return;
        }
        a0.K0(this, (t) null);
    }

    private static Rect a() {
        Rect b11 = f8913y.b();
        return b11 == null ? new Rect() : b11;
    }

    private static int c(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    private void d(f fVar, Rect rect, int i11, int i12) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i11) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i12) - fVar.bottomMargin));
        rect.set(max, max2, i11 + max, i12 + max2);
    }

    private n0 e(n0 n0Var) {
        c f11;
        if (n0Var.u()) {
            return n0Var;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (a0.C(childAt) && (f11 = ((f) childAt.getLayoutParams()).f()) != null) {
                n0Var = f11.f(this, childAt, n0Var);
                if (n0Var.u()) {
                    break;
                }
            }
        }
        return n0Var;
    }

    private void w(View view, int i11, Rect rect, Rect rect2, f fVar, int i12, int i13) {
        int i14;
        int i15;
        int b11 = androidx.core.view.e.b(S(fVar.f8934c), i11);
        int b12 = androidx.core.view.e.b(T(fVar.f8935d), i11);
        int i16 = b11 & 7;
        int i17 = b11 & 112;
        int i18 = b12 & 7;
        int i19 = b12 & 112;
        if (i18 == 1) {
            i14 = rect.left + (rect.width() / 2);
        } else if (i18 != 5) {
            i14 = rect.left;
        } else {
            i14 = rect.right;
        }
        if (i19 == 16) {
            i15 = rect.top + (rect.height() / 2);
        } else if (i19 != 80) {
            i15 = rect.top;
        } else {
            i15 = rect.bottom;
        }
        if (i16 == 1) {
            i14 -= i12 / 2;
        } else if (i16 != 5) {
            i14 -= i12;
        }
        if (i17 == 16) {
            i15 -= i13 / 2;
        } else if (i17 != 80) {
            i15 -= i13;
        }
        rect2.set(i14, i15, i12 + i14, i13 + i15);
    }

    private int x(int i11) {
        int[] iArr = this.j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i11);
            return 0;
        } else if (i11 >= 0 && i11 < iArr.length) {
            return iArr[i11];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i11 + " out of range for " + this);
            return 0;
        }
    }

    public boolean C(View view, int i11, int i12) {
        Rect a11 = a();
        u(view, a11);
        try {
            return a11.contains(i11, i12);
        } finally {
            P(a11);
        }
    }

    /* access modifiers changed from: package-private */
    public void H(View view, int i11) {
        c f11;
        View view2 = view;
        f fVar = (f) view.getLayoutParams();
        if (fVar.k != null) {
            Rect a11 = a();
            Rect a12 = a();
            Rect a13 = a();
            u(fVar.k, a11);
            boolean z11 = false;
            r(view2, false, a12);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i12 = measuredHeight;
            w(view, i11, a11, a13, fVar, measuredWidth, measuredHeight);
            if (!(a13.left == a12.left && a13.top == a12.top)) {
                z11 = true;
            }
            d(fVar, a13, measuredWidth, i12);
            int i13 = a13.left - a12.left;
            int i14 = a13.top - a12.top;
            if (i13 != 0) {
                a0.g0(view2, i13);
            }
            if (i14 != 0) {
                a0.h0(view2, i14);
            }
            if (z11 && (f11 = fVar.f()) != null) {
                f11.h(this, view2, fVar.k);
            }
            P(a11);
            P(a12);
            P(a13);
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(int i11) {
        boolean z11;
        int i12 = i11;
        int F = a0.F(this);
        int size = this.f8914a.size();
        Rect a11 = a();
        Rect a12 = a();
        Rect a13 = a();
        for (int i13 = 0; i13 < size; i13++) {
            View view = this.f8914a.get(i13);
            f fVar = (f) view.getLayoutParams();
            if (i12 != 0 || view.getVisibility() != 8) {
                for (int i14 = 0; i14 < i13; i14++) {
                    if (fVar.f8941l == this.f8914a.get(i14)) {
                        H(view, F);
                    }
                }
                r(view, true, a12);
                if (fVar.f8938g != 0 && !a12.isEmpty()) {
                    int b11 = androidx.core.view.e.b(fVar.f8938g, F);
                    int i15 = b11 & 112;
                    if (i15 == 48) {
                        a11.top = Math.max(a11.top, a12.bottom);
                    } else if (i15 == 80) {
                        a11.bottom = Math.max(a11.bottom, getHeight() - a12.top);
                    }
                    int i16 = b11 & 7;
                    if (i16 == 3) {
                        a11.left = Math.max(a11.left, a12.right);
                    } else if (i16 == 5) {
                        a11.right = Math.max(a11.right, getWidth() - a12.left);
                    }
                }
                if (fVar.f8939h != 0 && view.getVisibility() == 0) {
                    G(view, a11, F);
                }
                if (i12 != 2) {
                    y(view, a13);
                    if (!a13.equals(a12)) {
                        O(view, a12);
                    }
                }
                for (int i17 = i13 + 1; i17 < size; i17++) {
                    View view2 = this.f8914a.get(i17);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f11 = fVar2.f();
                    if (f11 != null && f11.e(this, view2, view)) {
                        if (i12 != 0 || !fVar2.g()) {
                            if (i12 != 2) {
                                z11 = f11.h(this, view2, view);
                            } else {
                                f11.i(this, view2, view);
                                z11 = true;
                            }
                            if (i12 == 1) {
                                fVar2.p(z11);
                            }
                        } else {
                            fVar2.k();
                        }
                    }
                }
            }
        }
        P(a11);
        P(a12);
        P(a13);
    }

    public void J(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.k;
            if (view2 != null) {
                E(view, view2, i11);
                return;
            }
            int i12 = fVar.f8936e;
            if (i12 >= 0) {
                F(view, i12, i11);
            } else {
                D(view, i11);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void K(View view, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* access modifiers changed from: package-private */
    public void O(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        if (this.f8922i && this.f8924m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8924m);
        }
        this.n = false;
    }

    /* access modifiers changed from: package-private */
    public final n0 X(n0 n0Var) {
        if (androidx.core.util.c.a(this.f8925o, n0Var)) {
            return n0Var;
        }
        this.f8925o = n0Var;
        boolean z11 = true;
        boolean z12 = n0Var != null && n0Var.r() > 0;
        this.f8926p = z12;
        if (z12 || getBackground() != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
        n0 e11 = e(n0Var);
        requestLayout();
        return e11;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f8922i) {
            if (this.f8924m == null) {
                this.f8924m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8924m);
        }
        this.n = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j11) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f8932a;
        if (cVar != null) {
            float d11 = cVar.d(this, view);
            if (d11 > 0.0f) {
                if (this.f8918e == null) {
                    this.f8918e = new Paint();
                }
                this.f8918e.setColor(fVar.f8932a.c(this, view));
                this.f8918e.setAlpha(c(Math.round(d11 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f8918e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j11);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q;
        boolean z11 = false;
        if (drawable != null && drawable.isStateful()) {
            z11 = false | drawable.setState(drawableState);
        }
        if (z11) {
            invalidate();
        }
    }

    public void f(View view) {
        List g11 = this.f8915b.g(view);
        if (g11 != null && !g11.isEmpty()) {
            for (int i11 = 0; i11 < g11.size(); i11++) {
                View view2 = (View) g11.get(i11);
                c f11 = ((f) view2.getLayoutParams()).f();
                if (f11 != null) {
                    f11.h(this, view2, view);
                }
            }
        }
    }

    public boolean g(View view, View view2) {
        boolean z11 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect a11 = a();
        r(view, view.getParent() != this, a11);
        Rect a12 = a();
        r(view2, view2.getParent() != this, a12);
        try {
            if (a11.left <= a12.right && a11.top <= a12.bottom && a11.right >= a12.left && a11.bottom >= a12.top) {
                z11 = true;
            }
            return z11;
        } finally {
            P(a11);
            P(a12);
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        N();
        return Collections.unmodifiableList(this.f8914a);
    }

    public final n0 getLastWindowInsets() {
        return this.f8925o;
    }

    public int getNestedScrollAxes() {
        return this.t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.q;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h(View view, View view2, int i11, int i12) {
        c f11;
        this.t.c(view, view2, i11, i12);
        this.f8923l = view2;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i12) && (f11 = fVar.f()) != null) {
                f11.v(this, childAt, view, view2, i11, i12);
            }
        }
    }

    public void i(View view, int i11) {
        this.t.e(view, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11)) {
                c f11 = fVar.f();
                if (f11 != null) {
                    f11.C(this, childAt, view, i11);
                }
                fVar.l(i11);
                fVar.k();
            }
        }
        this.f8923l = null;
    }

    public void j(View view, int i11, int i12, int i13, int i14, int i15) {
        n(view, i11, i12, i13, i14, 0, this.f8920g);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            } else if (B(getChildAt(i11))) {
                z11 = true;
                break;
            } else {
                i11++;
            }
        }
        if (z11 == this.n) {
            return;
        }
        if (z11) {
            b();
        } else {
            Q();
        }
    }

    public void l(View view, int i11, int i12, int[] iArr, int i13) {
        c f11;
        int i14;
        int i15;
        int childCount = getChildCount();
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                int i19 = i13;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i13) && (f11 = fVar.f()) != null) {
                    int[] iArr2 = this.f8919f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f11.q(this, childAt, view, i11, i12, iArr2, i13);
                    int[] iArr3 = this.f8919f;
                    if (i11 > 0) {
                        i14 = Math.max(i16, iArr3[0]);
                    } else {
                        i14 = Math.min(i16, iArr3[0]);
                    }
                    i16 = i14;
                    int[] iArr4 = this.f8919f;
                    if (i12 > 0) {
                        i15 = Math.max(i17, iArr4[1]);
                    } else {
                        i15 = Math.min(i17, iArr4[1]);
                    }
                    i17 = i15;
                    z11 = true;
                }
            }
        }
        iArr[0] = i16;
        iArr[1] = i17;
        if (z11) {
            I(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public void n(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        c f11;
        int i16;
        int i17;
        int childCount = getChildCount();
        boolean z11 = false;
        int i18 = 0;
        int i19 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i15) && (f11 = fVar.f()) != null) {
                    int[] iArr2 = this.f8919f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f11.t(this, childAt, view, i11, i12, i13, i14, i15, iArr2);
                    int[] iArr3 = this.f8919f;
                    if (i13 > 0) {
                        i16 = Math.max(i18, iArr3[0]);
                    } else {
                        i16 = Math.min(i18, iArr3[0]);
                    }
                    i18 = i16;
                    if (i14 > 0) {
                        i17 = Math.max(i19, this.f8919f[1]);
                    } else {
                        i17 = Math.min(i19, this.f8919f[1]);
                    }
                    i19 = i17;
                    z11 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i18;
        iArr[1] = iArr[1] + i19;
        if (z11) {
            I(1);
        }
    }

    public boolean o(View view, View view2, int i11, int i12) {
        int i13 = i12;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f11 = fVar.f();
                if (f11 != null) {
                    boolean A = f11.A(this, childAt, view, view2, i11, i12);
                    z11 |= A;
                    fVar.r(i13, A);
                } else {
                    fVar.r(i13, false);
                }
            }
        }
        return z11;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R(false);
        if (this.n) {
            if (this.f8924m == null) {
                this.f8924m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8924m);
        }
        if (this.f8925o == null && a0.C(this)) {
            a0.t0(this);
        }
        this.f8922i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        R(false);
        if (this.n && this.f8924m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8924m);
        }
        View view = this.f8923l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f8922i = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8926p && this.q != null) {
            n0 n0Var = this.f8925o;
            int r11 = n0Var != null ? n0Var.r() : 0;
            if (r11 > 0) {
                this.q.setBounds(0, 0, getWidth(), r11);
                this.q.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            R(true);
        }
        boolean M = M(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            R(true);
        }
        return M;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        c f11;
        int F = a0.F(this);
        int size = this.f8914a.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = this.f8914a.get(i15);
            if (view.getVisibility() != 8 && ((f11 = ((f) view.getLayoutParams()).f()) == null || !f11.l(this, view, F))) {
                J(view, F);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.N()
            r30.k()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.view.a0.F(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.view.n0 r3 = r7.f8925o
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.view.a0.C(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f8914a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f8914a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f8936e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.x(r0)
            int r11 = r1.f8934c
            int r11 = U(r11)
            int r11 = androidx.core.view.e.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = androidx.core.view.a0.C(r20)
            if (r0 != 0) goto L_0x00f1
            androidx.core.view.n0 r0 = r7.f8925o
            int r0 = r0.p()
            androidx.core.view.n0 r2 = r7.f8925o
            int r2 = r2.q()
            int r0 = r0 + r2
            androidx.core.view.n0 r2 = r7.f8925o
            int r2 = r2.r()
            androidx.core.view.n0 r11 = r7.f8925o
            int r11 = r11.o()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.K(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        c f13;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f13 = fVar.f()) != null) {
                    z12 |= f13.n(this, childAt, view, f11, f12, z11);
                }
            }
        }
        if (z12) {
            I(1);
        }
        return z12;
    }

    public boolean onNestedPreFling(View view, float f11, float f12) {
        c f13;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f13 = fVar.f()) != null) {
                    z11 |= f13.o(this, childAt, view, f11, f12);
                }
            }
        }
        return z11;
    }

    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        l(view, i11, i12, iArr, 0);
    }

    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        j(view, i11, i12, i13, i14, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i11) {
        h(view, view2, i11, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f8929c;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            c f11 = z(childAt).f();
            if (!(id2 == -1 || f11 == null || (parcelable2 = sparseArray.get(id2)) == null)) {
                f11.x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y11;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            c f11 = ((f) childAt.getLayoutParams()).f();
            if (!(id2 == -1 || f11 == null || (y11 = f11.y(this, childAt)) == null)) {
                sparseArray.append(id2, y11);
            }
        }
        savedState.f8929c = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return o(view, view2, i11, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.M(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.k
            boolean r6 = r6.D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.k
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.R(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void r(View view, boolean z11, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z11) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        c f11 = ((f) view.getLayoutParams()).f();
        if (f11 == null || !f11.w(this, view, rect, z11)) {
            return super.requestChildRectangleOnScreen(view, rect, z11);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (z11 && !this.f8921h) {
            R(false);
            this.f8921h = true;
        }
    }

    public List<View> s(View view) {
        List<View> h11 = this.f8915b.h(view);
        this.f8917d.clear();
        if (h11 != null) {
            this.f8917d.addAll(h11);
        }
        return this.f8917d;
    }

    public void setFitsSystemWindows(boolean z11) {
        super.setFitsSystemWindows(z11);
        Y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f8927r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.q.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.q, a0.F(this));
                this.q.setVisible(getVisibility() == 0, false);
                this.q.setCallback(this);
            }
            a0.n0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i11) {
        setStatusBarBackground(new ColorDrawable(i11));
    }

    public void setStatusBarBackgroundResource(int i11) {
        setStatusBarBackground(i11 != 0 ? androidx.core.content.a.f(getContext(), i11) : null);
    }

    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.q;
        if (drawable != null && drawable.isVisible() != z11) {
            this.q.setVisible(z11, false);
        }
    }

    public List<View> t(View view) {
        List g11 = this.f8915b.g(view);
        this.f8917d.clear();
        if (g11 != null) {
            this.f8917d.addAll(g11);
        }
        return this.f8917d;
    }

    /* access modifiers changed from: package-private */
    public void u(View view, Rect rect) {
        b.a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    public void v(View view, int i11, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(view, i11, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    /* access modifiers changed from: package-private */
    public void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* access modifiers changed from: package-private */
    public f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f8933b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f8933b = true;
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e11) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e11);
                    }
                }
                fVar.f8933b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArray;
        this.f8914a = new ArrayList();
        this.f8915b = new a<>();
        this.f8916c = new ArrayList();
        this.f8917d = new ArrayList();
        this.f8919f = new int[2];
        this.f8920g = new int[2];
        this.t = new s(this);
        if (i11 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout, i11, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i11 == 0) {
                saveAttributeDataForStyleable(context, R.styleable.CoordinatorLayout, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, R.styleable.CoordinatorLayout, attributeSet, typedArray, i11, 0);
            }
        }
        int resourceId = typedArray.getResourceId(R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.j = resources.getIntArray(resourceId);
            float f11 = resources.getDisplayMetrics().density;
            int length = this.j.length;
            for (int i12 = 0; i12 < length; i12++) {
                int[] iArr = this.j;
                iArr[i12] = (int) (((float) iArr[i12]) * f11);
            }
        }
        this.q = typedArray.getDrawable(R.styleable.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        Y();
        super.setOnHierarchyChangeListener(new e());
        if (a0.D(this) == 0) {
            a0.H0(this, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        SparseArray<Parcelable> f8929c;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f8929c = new SparseArray<>(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                this.f8929c.append(iArr[i11], readParcelableArray[i11]);
            }
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            SparseArray<Parcelable> sparseArray = this.f8929c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = this.f8929c.keyAt(i12);
                parcelableArr[i12] = this.f8929c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i11);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        c f8932a;

        /* renamed from: b  reason: collision with root package name */
        boolean f8933b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f8934c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f8935d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f8936e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f8937f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f8938g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f8939h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f8940i;
        int j;
        View k;

        /* renamed from: l  reason: collision with root package name */
        View f8941l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f8942m;
        private boolean n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f8943o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f8944p;
        final Rect q = new Rect();

        /* renamed from: r  reason: collision with root package name */
        Object f8945r;

        public f(int i11, int i12) {
            super(i11, i12);
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f8937f);
            this.k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f8941l = null;
                            this.k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f8941l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f8941l = null;
                    this.k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f8941l = null;
                this.k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f8937f) + " to anchor view " + view);
            }
        }

        private boolean s(View view, int i11) {
            int b11 = androidx.core.view.e.b(((f) view.getLayoutParams()).f8938g, i11);
            return b11 != 0 && (androidx.core.view.e.b(this.f8939h, i11) & b11) == b11;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f8937f) {
                return false;
            }
            View view2 = this.k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f8941l = null;
                    this.k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f8941l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.k == null && this.f8937f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f8932a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f8941l
                if (r4 == r0) goto L_0x001b
                int r0 = androidx.core.view.a0.F(r2)
                boolean r0 = r1.s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f8932a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.f.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f8932a == null) {
                this.f8942m = false;
            }
            return this.f8942m;
        }

        /* access modifiers changed from: package-private */
        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f8937f == -1) {
                this.f8941l = null;
                this.k = null;
                return null;
            }
            if (this.k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.k;
        }

        public int e() {
            return this.f8937f;
        }

        public c f() {
            return this.f8932a;
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            return this.f8944p;
        }

        /* access modifiers changed from: package-private */
        public Rect h() {
            return this.q;
        }

        /* access modifiers changed from: package-private */
        public boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z11 = this.f8942m;
            if (z11) {
                return true;
            }
            c cVar = this.f8932a;
            boolean a11 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z11;
            this.f8942m = a11;
            return a11;
        }

        /* access modifiers changed from: package-private */
        public boolean j(int i11) {
            if (i11 == 0) {
                return this.n;
            }
            if (i11 != 1) {
                return false;
            }
            return this.f8943o;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.f8944p = false;
        }

        /* access modifiers changed from: package-private */
        public void l(int i11) {
            r(i11, false);
        }

        /* access modifiers changed from: package-private */
        public void m() {
            this.f8942m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f8932a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f8932a = cVar;
                this.f8945r = null;
                this.f8933b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void p(boolean z11) {
            this.f8944p = z11;
        }

        /* access modifiers changed from: package-private */
        public void q(Rect rect) {
            this.q.set(rect);
        }

        /* access modifiers changed from: package-private */
        public void r(int i11, boolean z11) {
            if (i11 == 0) {
                this.n = z11;
            } else if (i11 == 1) {
                this.f8943o = z11;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
            this.f8934c = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f8937f = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f8935d = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f8936e = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f8938g = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f8939h = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i11 = R.styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i11);
            this.f8933b = hasValue;
            if (hasValue) {
                this.f8932a = CoordinatorLayout.L(context, attributeSet, obtainStyledAttributes.getString(i11));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f8932a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super(fVar);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
