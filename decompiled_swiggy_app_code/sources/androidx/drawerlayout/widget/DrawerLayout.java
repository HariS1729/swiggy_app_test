package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.a0;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.f;
import androidx.core.view.n0;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.R;
import java.util.ArrayList;
import java.util.List;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;
import v2.c;

public class DrawerLayout extends ViewGroup {
    private static final int[] M = {16843828};
    static final int[] N = {16842931};
    static final boolean O = true;
    private static final boolean P = true;
    private static boolean Q;
    private CharSequence A;
    private Object B;
    private boolean C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private final ArrayList<View> H;
    private Rect I;
    private Matrix K;
    private final androidx.core.view.accessibility.f L;

    /* renamed from: a  reason: collision with root package name */
    private final d f10139a;

    /* renamed from: b  reason: collision with root package name */
    private float f10140b;

    /* renamed from: c  reason: collision with root package name */
    private int f10141c;

    /* renamed from: d  reason: collision with root package name */
    private int f10142d;

    /* renamed from: e  reason: collision with root package name */
    private float f10143e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f10144f;

    /* renamed from: g  reason: collision with root package name */
    private final v2.c f10145g;

    /* renamed from: h  reason: collision with root package name */
    private final v2.c f10146h;

    /* renamed from: i  reason: collision with root package name */
    private final g f10147i;
    private final g j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10148l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10149m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f10150o;

    /* renamed from: p  reason: collision with root package name */
    private int f10151p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10152r;

    /* renamed from: s  reason: collision with root package name */
    private e f10153s;
    private List<e> t;

    /* renamed from: u  reason: collision with root package name */
    private float f10154u;
    private float v;

    /* renamed from: w  reason: collision with root package name */
    private Drawable f10155w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f10156x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f10157y;

    /* renamed from: z  reason: collision with root package name */
    private CharSequence f10158z;

    class a implements androidx.core.view.accessibility.f {
        a() {
        }

        public boolean a(View view, f.a aVar) {
            if (!DrawerLayout.this.C(view) || DrawerLayout.this.r(view) == 2) {
                return false;
            }
            DrawerLayout.this.f(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f10166d = new Rect();

        c() {
        }

        private void n(androidx.core.view.accessibility.c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (DrawerLayout.A(childAt)) {
                    cVar.c(childAt);
                }
            }
        }

        private void o(androidx.core.view.accessibility.c cVar, androidx.core.view.accessibility.c cVar2) {
            Rect rect = this.f10166d;
            cVar2.n(rect);
            cVar.Z(rect);
            cVar.M0(cVar2.O());
            cVar.u0(cVar2.v());
            cVar.c0(cVar2.p());
            cVar.g0(cVar2.r());
            cVar.k0(cVar2.G());
            cVar.n0(cVar2.I());
            cVar.W(cVar2.C());
            cVar.D0(cVar2.M());
            cVar.a(cVar2.k());
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s11;
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View p11 = DrawerLayout.this.p();
            if (p11 == null || (s11 = DrawerLayout.this.s(DrawerLayout.this.t(p11))) == null) {
                return true;
            }
            text.add(s11);
            return true;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            if (DrawerLayout.O) {
                super.g(view, cVar);
            } else {
                androidx.core.view.accessibility.c R = androidx.core.view.accessibility.c.R(cVar);
                super.g(view, R);
                cVar.F0(view);
                ViewParent L = a0.L(view);
                if (L instanceof View) {
                    cVar.w0((View) L);
                }
                o(cVar, R);
                R.T();
                n(cVar, (ViewGroup) view);
            }
            cVar.c0("androidx.drawerlayout.widget.DrawerLayout");
            cVar.m0(false);
            cVar.n0(false);
            cVar.U(c.a.f9456e);
            cVar.U(c.a.f9457f);
        }

        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.O || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends androidx.core.view.a {
        d() {
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            if (!DrawerLayout.A(view)) {
                cVar.w0((View) null);
            }
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i11);

        void d(View view, float f11);
    }

    private class g extends c.C0200c {

        /* renamed from: a  reason: collision with root package name */
        private final int f10172a;

        /* renamed from: b  reason: collision with root package name */
        private v2.c f10173b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f10174c = new a();

        class a implements Runnable {
            a() {
            }

            public void run() {
                g.this.o();
            }
        }

        g(int i11) {
            this.f10172a = i11;
        }

        private void n() {
            int i11 = 3;
            if (this.f10172a == 3) {
                i11 = 5;
            }
            View n = DrawerLayout.this.n(i11);
            if (n != null) {
                DrawerLayout.this.f(n);
            }
        }

        public int a(View view, int i11, int i12) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i11, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i11, width));
        }

        public int b(View view, int i11, int i12) {
            return view.getTop();
        }

        public int d(View view) {
            if (DrawerLayout.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        public void f(int i11, int i12) {
            View view;
            if ((i11 & 1) == 1) {
                view = DrawerLayout.this.n(3);
            } else {
                view = DrawerLayout.this.n(5);
            }
            if (view != null && DrawerLayout.this.r(view) == 0) {
                this.f10173b.b(view, i12);
            }
        }

        public boolean g(int i11) {
            return false;
        }

        public void h(int i11, int i12) {
            DrawerLayout.this.postDelayed(this.f10174c, 160);
        }

        public void i(View view, int i11) {
            ((f) view.getLayoutParams()).f10170c = false;
            n();
        }

        public void j(int i11) {
            DrawerLayout.this.V(i11, this.f10173b.v());
        }

        public void k(View view, int i11, int i12, int i13, int i14) {
            float f11;
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                f11 = (float) (i11 + width);
            } else {
                f11 = (float) (DrawerLayout.this.getWidth() - i11);
            }
            float f12 = f11 / ((float) width);
            DrawerLayout.this.S(view, f12);
            view.setVisibility(f12 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        public void l(View view, float f11, float f12) {
            int i11;
            float u11 = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                int i12 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                i11 = (i12 > 0 || (i12 == 0 && u11 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f11 < 0.0f || (f11 == 0.0f && u11 > 0.5f)) {
                    width2 -= width;
                }
                i11 = width2;
            }
            this.f10173b.O(i11, view.getTop());
            DrawerLayout.this.invalidate();
        }

        public boolean m(View view, int i11) {
            return DrawerLayout.this.D(view) && DrawerLayout.this.c(view, this.f10172a) && DrawerLayout.this.r(view) == 0;
        }

        /* access modifiers changed from: package-private */
        public void o() {
            View view;
            int i11;
            int x11 = this.f10173b.x();
            int i12 = 0;
            boolean z11 = this.f10172a == 3;
            if (z11) {
                view = DrawerLayout.this.n(3);
                if (view != null) {
                    i12 = -view.getWidth();
                }
                i11 = i12 + x11;
            } else {
                view = DrawerLayout.this.n(5);
                i11 = DrawerLayout.this.getWidth() - x11;
            }
            if (view == null) {
                return;
            }
            if (((z11 && view.getLeft() < i11) || (!z11 && view.getLeft() > i11)) && DrawerLayout.this.r(view) == 0) {
                this.f10173b.Q(view, i11, view.getTop());
                ((f) view.getLayoutParams()).f10170c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f10174c);
        }

        public void q(v2.c cVar) {
            this.f10173b = cVar;
        }
    }

    static {
        boolean z11 = true;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29) {
            z11 = false;
        }
        Q = z11;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    static boolean A(View view) {
        return (a0.D(view) == 4 || a0.D(view) == 2) ? false : true;
    }

    private boolean F(float f11, float f12, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int) f11, (int) f12);
    }

    private void G(Drawable drawable, int i11) {
        if (drawable != null && androidx.core.graphics.drawable.a.h(drawable)) {
            androidx.core.graphics.drawable.a.m(drawable, i11);
        }
    }

    private Drawable N() {
        int F2 = a0.F(this);
        if (F2 == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                G(drawable, F2);
                return this.D;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                G(drawable2, F2);
                return this.E;
            }
        }
        return this.F;
    }

    private Drawable O() {
        int F2 = a0.F(this);
        if (F2 == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                G(drawable, F2);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.D;
            if (drawable2 != null) {
                G(drawable2, F2);
                return this.D;
            }
        }
        return this.G;
    }

    private void P() {
        if (!P) {
            this.f10156x = N();
            this.f10157y = O();
        }
    }

    private void T(View view) {
        c.a aVar = c.a.f9470y;
        a0.q0(view, aVar.b());
        if (C(view) && r(view) != 2) {
            a0.s0(view, aVar, (CharSequence) null, this.L);
        }
    }

    private void U(View view, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((z11 || D(childAt)) && (!z11 || childAt != view)) {
                a0.H0(childAt, 4);
            } else {
                a0.H0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v11 = v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v11);
            v11.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.K == null) {
                this.K = new Matrix();
            }
            matrix.invert(this.K);
            obtain.transform(this.K);
        }
        return obtain;
    }

    static String w(int i11) {
        return (i11 & 3) == 3 ? "LEFT" : (i11 & 5) == 5 ? "RIGHT" : Integer.toHexString(i11);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((f) getChildAt(i11).getLayoutParams()).f10170c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    /* access modifiers changed from: package-private */
    public boolean B(View view) {
        return ((f) view.getLayoutParams()).f10168a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((f) view.getLayoutParams()).f10171d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public boolean D(View view) {
        int b11 = androidx.core.view.e.b(((f) view.getLayoutParams()).f10168a, a0.F(view));
        return ((b11 & 3) == 0 && (b11 & 5) == 0) ? false : true;
    }

    public boolean E(View view) {
        if (D(view)) {
            return ((f) view.getLayoutParams()).f10169b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    public void H(View view, float f11) {
        float u11 = u(view);
        float width = (float) view.getWidth();
        int i11 = ((int) (width * f11)) - ((int) (u11 * width));
        if (!c(view, 3)) {
            i11 = -i11;
        }
        view.offsetLeftAndRight(i11);
        S(view, f11);
    }

    public void I(int i11) {
        J(i11, true);
    }

    public void J(int i11, boolean z11) {
        View n11 = n(i11);
        if (n11 != null) {
            L(n11, z11);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i11));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z11) {
        if (D(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f10149m) {
                fVar.f10169b = 1.0f;
                fVar.f10171d = 1;
                U(view, true);
                T(view);
            } else if (z11) {
                fVar.f10171d |= 2;
                if (c(view, 3)) {
                    this.f10145g.Q(view, 0, view.getTop());
                } else {
                    this.f10146h.Q(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                H(view, 1.0f);
                V(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void M(e eVar) {
        List<e> list;
        if (eVar != null && (list = this.t) != null) {
            list.remove(eVar);
        }
    }

    public void Q(Object obj, boolean z11) {
        this.B = obj;
        this.C = z11;
        setWillNotDraw(!z11 && getBackground() == null);
        requestLayout();
    }

    public void R(int i11, int i12) {
        View n11;
        int b11 = androidx.core.view.e.b(i12, a0.F(this));
        if (i12 == 3) {
            this.n = i11;
        } else if (i12 == 5) {
            this.f10150o = i11;
        } else if (i12 == 8388611) {
            this.f10151p = i11;
        } else if (i12 == 8388613) {
            this.q = i11;
        }
        if (i11 != 0) {
            (b11 == 3 ? this.f10145g : this.f10146h).a();
        }
        if (i11 == 1) {
            View n12 = n(b11);
            if (n12 != null) {
                f(n12);
            }
        } else if (i11 == 2 && (n11 = n(b11)) != null) {
            K(n11);
        }
    }

    /* access modifiers changed from: package-private */
    public void S(View view, float f11) {
        f fVar = (f) view.getLayoutParams();
        if (f11 != fVar.f10169b) {
            fVar.f10169b = f11;
            l(view, f11);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(int i11, View view) {
        int A2 = this.f10145g.A();
        int A3 = this.f10146h.A();
        int i12 = 2;
        if (A2 == 1 || A3 == 1) {
            i12 = 1;
        } else if (!(A2 == 2 || A3 == 2)) {
            i12 = 0;
        }
        if (view != null && i11 == 0) {
            float f11 = ((f) view.getLayoutParams()).f10169b;
            if (f11 == 0.0f) {
                j(view);
            } else if (f11 == 1.0f) {
                k(view);
            }
        }
        if (i12 != this.k) {
            this.k = i12;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).c(i12);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar != null) {
            if (this.t == null) {
                this.t = new ArrayList();
            }
            this.t.add(eVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z11 = false;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (!D(childAt)) {
                    this.H.add(childAt);
                } else if (C(childAt)) {
                    childAt.addFocusables(arrayList, i11, i12);
                    z11 = true;
                }
            }
            if (!z11) {
                int size = this.H.size();
                for (int i14 = 0; i14 < size; i14++) {
                    View view = this.H.get(i14);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i11, i12);
                    }
                }
            }
            this.H.clear();
        }
    }

    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (o() != null || D(view)) {
            a0.H0(view, 4);
        } else {
            a0.H0(view, 1);
        }
        if (!O) {
            a0.w0(view, this.f10139a);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.f10152r) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f10152r = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view, int i11) {
        return (t(view) & i11) == i11;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f11 = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            f11 = Math.max(f11, ((f) getChildAt(i11).getLayoutParams()).f10169b);
        }
        this.f10143e = f11;
        boolean m11 = this.f10145g.m(true);
        boolean m12 = this.f10146h.m(true);
        if (m11 || m12) {
            a0.n0(this);
        }
    }

    public void d(int i11) {
        e(i11, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f10143e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            View childAt = getChildAt(i11);
            if (F(x11, y11, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j11) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B2 = B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i11 = 0;
        if (B2) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != view2 && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i12) {
                            i12 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i12, 0, width, getHeight());
            i11 = i12;
        }
        boolean drawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(save);
        float f11 = this.f10143e;
        if (f11 > 0.0f && B2) {
            int i14 = this.f10142d;
            this.f10144f.setColor((i14 & 16777215) | (((int) (((float) ((-16777216 & i14) >>> 24)) * f11)) << 24));
            canvas.drawRect((float) i11, 0.0f, (float) width, (float) getHeight(), this.f10144f);
        } else if (this.f10156x != null && c(view2, 3)) {
            int intrinsicWidth = this.f10156x.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f10145g.x()), 1.0f));
            this.f10156x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f10156x.setAlpha((int) (max * 255.0f));
            this.f10156x.draw(canvas);
        } else if (this.f10157y != null && c(view2, 5)) {
            int intrinsicWidth2 = this.f10157y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f10146h.x()), 1.0f));
            this.f10157y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f10157y.setAlpha((int) (max2 * 255.0f));
            this.f10157y.draw(canvas);
        }
        return drawChild;
    }

    public void e(int i11, boolean z11) {
        View n11 = n(i11);
        if (n11 != null) {
            g(n11, z11);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i11));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z11) {
        if (D(view)) {
            f fVar = (f) view.getLayoutParams();
            if (this.f10149m) {
                fVar.f10169b = 0.0f;
                fVar.f10171d = 0;
            } else if (z11) {
                fVar.f10171d |= 4;
                if (c(view, 3)) {
                    this.f10145g.Q(view, -view.getWidth(), view.getTop());
                } else {
                    this.f10146h.Q(view, getWidth(), view.getTop());
                }
            } else {
                H(view, 0.0f);
                V(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (P) {
            return this.f10140b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f10155w;
    }

    public void h() {
        i(false);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z11) {
        boolean z12;
        int childCount = getChildCount();
        boolean z13 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (D(childAt) && (!z11 || fVar.f10170c)) {
                int width = childAt.getWidth();
                if (c(childAt, 3)) {
                    z12 = this.f10145g.Q(childAt, -width, childAt.getTop());
                } else {
                    z12 = this.f10146h.Q(childAt, getWidth(), childAt.getTop());
                }
                z13 |= z12;
                fVar.f10170c = false;
            }
        }
        this.f10147i.p();
        this.j.p();
        if (z13) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f10171d & 1) == 1) {
            fVar.f10171d = 0;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).b(view);
                }
            }
            U(view, false);
            T(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f10171d & 1) == 0) {
            fVar.f10171d = 1;
            List<e> list = this.t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.t.get(size).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(View view, float f11) {
        List<e> list = this.t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.t.get(size).d(view, f11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View n(int i11) {
        int b11 = androidx.core.view.e.b(i11, a0.F(this)) & 7;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if ((t(childAt) & 7) == b11) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View o() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((((f) childAt.getLayoutParams()).f10171d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10149m = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10149m = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.C && this.f10155w != null) {
            Object obj = this.B;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.f10155w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f10155w.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.f10145g.t((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            v2.c r1 = r6.f10145g
            boolean r1 = r1.P(r7)
            v2.c r2 = r6.f10146h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            v2.c r7 = r6.f10145g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f10147i
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.j
            r7.p()
            goto L_0x0036
        L_0x0031:
            r6.i(r2)
            r6.f10152r = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f10154u = r0
            r6.v = r7
            float r4 = r6.f10143e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            v2.c r4 = r6.f10145g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.f10152r = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.y()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f10152r
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 != 4 || !z()) {
            return super.onKeyDown(i11, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        View p11 = p();
        if (p11 != null && r(p11) == 0) {
            h();
        }
        return p11 != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        WindowInsets rootWindowInsets;
        float f11;
        int i15;
        this.f10148l = true;
        int i16 = i13 - i11;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i18 = fVar.leftMargin;
                    childAt.layout(i18, fVar.topMargin, childAt.getMeasuredWidth() + i18, fVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f12 = (float) measuredWidth;
                        i15 = (-measuredWidth) + ((int) (fVar.f10169b * f12));
                        f11 = ((float) (measuredWidth + i15)) / f12;
                    } else {
                        float f13 = (float) measuredWidth;
                        int i19 = i16 - ((int) (fVar.f10169b * f13));
                        f11 = ((float) (i16 - i19)) / f13;
                        i15 = i19;
                    }
                    boolean z12 = f11 != fVar.f10169b;
                    int i21 = fVar.f10168a & 112;
                    if (i21 == 16) {
                        int i22 = i14 - i12;
                        int i23 = (i22 - measuredHeight) / 2;
                        int i24 = fVar.topMargin;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = i23 + measuredHeight;
                            int i26 = fVar.bottomMargin;
                            if (i25 > i22 - i26) {
                                i23 = (i22 - i26) - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i23, measuredWidth + i15, measuredHeight + i23);
                    } else if (i21 != 80) {
                        int i27 = fVar.topMargin;
                        childAt.layout(i15, i27, measuredWidth + i15, measuredHeight + i27);
                    } else {
                        int i28 = i14 - i12;
                        childAt.layout(i15, (i28 - fVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i28 - fVar.bottomMargin);
                    }
                    if (z12) {
                        S(childAt, f11);
                    }
                    int i29 = fVar.f10169b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i29) {
                        childAt.setVisibility(i29);
                    }
                }
            }
        }
        if (Q && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.b n11 = n0.C(rootWindowInsets).n();
            v2.c cVar = this.f10145g;
            cVar.L(Math.max(cVar.w(), n11.f9235a));
            v2.c cVar2 = this.f10146h;
            cVar2.L(Math.max(cVar2.w(), n11.f9237c));
        }
        this.f10148l = false;
        this.f10149m = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
                }
                if (mode2 == 0) {
                    size2 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i13 = 0;
        boolean z11 = this.B != null && a0.C(this);
        int F2 = a0.F(this);
        int childCount = getChildCount();
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z11) {
                    int b11 = androidx.core.view.e.b(fVar.f10168a, F2);
                    if (a0.C(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.B;
                        if (b11 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i13, windowInsets.getSystemWindowInsetBottom());
                        } else if (b11 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i13, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.B;
                        if (b11 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i13, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b11 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i13, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        fVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        fVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        fVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        fVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - fVar.leftMargin) - fVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - fVar.topMargin) - fVar.bottomMargin, 1073741824));
                } else if (D(childAt)) {
                    if (P) {
                        float z14 = a0.z(childAt);
                        float f11 = this.f10140b;
                        if (z14 != f11) {
                            a0.E0(childAt, f11);
                        }
                    }
                    int t11 = t(childAt) & 7;
                    boolean z15 = t11 == 3;
                    if ((!z15 || !z12) && (z15 || !z13)) {
                        if (z15) {
                            z12 = true;
                        } else {
                            z13 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i11, this.f10141c + fVar.leftMargin + fVar.rightMargin, fVar.width), ViewGroup.getChildMeasureSpec(i12, fVar.topMargin + fVar.bottomMargin, fVar.height));
                        i14++;
                        i13 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(t11) + " but this " + "DrawerLayout" + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i14 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i15 = i11;
            int i16 = i12;
            i14++;
            i13 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n11;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i11 = savedState.f10159c;
        if (!(i11 == 0 || (n11 = n(i11)) == null)) {
            K(n11);
        }
        int i12 = savedState.f10160d;
        if (i12 != 3) {
            R(i12, 3);
        }
        int i13 = savedState.f10161e;
        if (i13 != 3) {
            R(i13, 5);
        }
        int i14 = savedState.f10162f;
        if (i14 != 3) {
            R(i14, 8388611);
        }
        int i15 = savedState.f10163g;
        if (i15 != 3) {
            R(i15, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i11) {
        P();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            f fVar = (f) getChildAt(i11).getLayoutParams();
            int i12 = fVar.f10171d;
            boolean z11 = true;
            boolean z12 = i12 == 1;
            if (i12 != 2) {
                z11 = false;
            }
            if (z12 || z11) {
                savedState.f10159c = fVar.f10168a;
            } else {
                i11++;
            }
        }
        savedState.f10160d = this.n;
        savedState.f10161e = this.f10150o;
        savedState.f10162f = this.f10151p;
        savedState.f10163g = this.q;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r(r7) != 2) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            v2.c r0 = r6.f10145g
            r0.F(r7)
            v2.c r0 = r6.f10146h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x0070
        L_0x001a:
            r6.i(r2)
            r6.f10152r = r1
            goto L_0x0070
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            v2.c r3 = r6.f10145g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L_0x005d
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L_0x005d
            float r3 = r6.f10154u
            float r0 = r0 - r3
            float r3 = r6.v
            float r7 = r7 - r3
            v2.c r3 = r6.f10145g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005d
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L_0x005d
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            r6.i(r1)
            goto L_0x0070
        L_0x0062:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f10154u = r0
            r6.v = r7
            r6.f10152r = r1
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public View p() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i11) {
        int F2 = a0.F(this);
        if (i11 == 3) {
            int i12 = this.n;
            if (i12 != 3) {
                return i12;
            }
            int i13 = F2 == 0 ? this.f10151p : this.q;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        } else if (i11 == 5) {
            int i14 = this.f10150o;
            if (i14 != 3) {
                return i14;
            }
            int i15 = F2 == 0 ? this.q : this.f10151p;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        } else if (i11 == 8388611) {
            int i16 = this.f10151p;
            if (i16 != 3) {
                return i16;
            }
            int i17 = F2 == 0 ? this.n : this.f10150o;
            if (i17 != 3) {
                return i17;
            }
            return 0;
        } else if (i11 != 8388613) {
            return 0;
        } else {
            int i18 = this.q;
            if (i18 != 3) {
                return i18;
            }
            int i19 = F2 == 0 ? this.f10150o : this.n;
            if (i19 != 3) {
                return i19;
            }
            return 0;
        }
    }

    public int r(View view) {
        if (D(view)) {
            return q(((f) view.getLayoutParams()).f10168a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (z11) {
            i(true);
        }
    }

    public void requestLayout() {
        if (!this.f10148l) {
            super.requestLayout();
        }
    }

    public CharSequence s(int i11) {
        int b11 = androidx.core.view.e.b(i11, a0.F(this));
        if (b11 == 3) {
            return this.f10158z;
        }
        if (b11 == 5) {
            return this.A;
        }
        return null;
    }

    public void setDrawerElevation(float f11) {
        this.f10140b = f11;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (D(childAt)) {
                a0.E0(childAt, this.f10140b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f10153s;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f10153s = eVar;
    }

    public void setDrawerLockMode(int i11) {
        R(i11, 3);
        R(i11, 5);
    }

    public void setScrimColor(int i11) {
        this.f10142d = i11;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f10155w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i11) {
        this.f10155w = new ColorDrawable(i11);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public int t(View view) {
        return androidx.core.view.e.b(((f) view.getLayoutParams()).f10168a, a0.F(this));
    }

    /* access modifiers changed from: package-private */
    public float u(View view) {
        return ((f) view.getLayoutParams()).f10169b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.drawerLayoutStyle);
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f10139a = new d();
        this.f10142d = -1728053248;
        this.f10144f = new Paint();
        this.f10149m = true;
        this.n = 3;
        this.f10150o = 3;
        this.f10151p = 3;
        this.q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.L = new a();
        setDescendantFocusability(262144);
        float f11 = getResources().getDisplayMetrics().density;
        this.f10141c = (int) ((64.0f * f11) + 0.5f);
        float f12 = f11 * 400.0f;
        g gVar = new g(3);
        this.f10147i = gVar;
        g gVar2 = new g(5);
        this.j = gVar2;
        v2.c n11 = v2.c.n(this, 1.0f, gVar);
        this.f10145g = n11;
        n11.M(1);
        n11.N(f12);
        gVar.q(n11);
        v2.c n12 = v2.c.n(this, 1.0f, gVar2);
        this.f10146h = n12;
        n12.M(2);
        n12.N(f12);
        gVar2.q(n12);
        setFocusableInTouchMode(true);
        a0.H0(this, 1);
        a0.w0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (a0.C(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(M);
            try {
                this.f10155w = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.DrawerLayout, i11, 0);
        try {
            int i12 = R.styleable.DrawerLayout_elevation;
            if (obtainStyledAttributes2.hasValue(i12)) {
                this.f10140b = obtainStyledAttributes2.getDimension(i12, 0.0f);
            } else {
                this.f10140b = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.H = new ArrayList<>();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i11) {
        this.f10155w = i11 != 0 ? androidx.core.content.a.f(getContext(), i11) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f10168a = 0;

        /* renamed from: b  reason: collision with root package name */
        float f10169b;

        /* renamed from: c  reason: collision with root package name */
        boolean f10170c;

        /* renamed from: d  reason: collision with root package name */
        int f10171d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.N);
            this.f10168a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public f(int i11, int i12) {
            super(i11, i12);
        }

        public f(f fVar) {
            super(fVar);
            this.f10168a = fVar.f10168a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f10159c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f10160d;

        /* renamed from: e  reason: collision with root package name */
        int f10161e;

        /* renamed from: f  reason: collision with root package name */
        int f10162f;

        /* renamed from: g  reason: collision with root package name */
        int f10163g;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f10159c = parcel.readInt();
            this.f10160d = parcel.readInt();
            this.f10161e = parcel.readInt();
            this.f10162f = parcel.readInt();
            this.f10163g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f10159c);
            parcel.writeInt(this.f10160d);
            parcel.writeInt(this.f10161e);
            parcel.writeInt(this.f10162f);
            parcel.writeInt(this.f10163g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
