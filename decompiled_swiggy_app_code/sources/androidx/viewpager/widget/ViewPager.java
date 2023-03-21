package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.a0;
import androidx.core.view.n0;
import androidx.core.view.t;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {

    /* renamed from: u0  reason: collision with root package name */
    static final int[] f12129u0 = {16842931};

    /* renamed from: v0  reason: collision with root package name */
    private static final Comparator<f> f12130v0 = new a();

    /* renamed from: w0  reason: collision with root package name */
    private static final Interpolator f12131w0 = new b();

    /* renamed from: x0  reason: collision with root package name */
    private static final n f12132x0 = new n();
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H = -1;
    private VelocityTracker I;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private EdgeEffect P;
    private EdgeEffect Q;
    private boolean R = true;
    private boolean S = false;
    private boolean T;
    private int U;
    private List<j> V;
    private j W;

    /* renamed from: a  reason: collision with root package name */
    private int f12133a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<f> f12134b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final f f12135c = new f();

    /* renamed from: c0  reason: collision with root package name */
    private j f12136c0;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f12137d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    a f12138e;

    /* renamed from: f  reason: collision with root package name */
    int f12139f;

    /* renamed from: g  reason: collision with root package name */
    private int f12140g = -1;

    /* renamed from: h  reason: collision with root package name */
    private Parcelable f12141h = null;

    /* renamed from: i  reason: collision with root package name */
    private ClassLoader f12142i = null;
    private Scroller j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private l f12143l;

    /* renamed from: m  reason: collision with root package name */
    private int f12144m;
    private Drawable n;

    /* renamed from: n0  reason: collision with root package name */
    private List<i> f12145n0;

    /* renamed from: o  reason: collision with root package name */
    private int f12146o;

    /* renamed from: o0  reason: collision with root package name */
    private k f12147o0;

    /* renamed from: p  reason: collision with root package name */
    private int f12148p;

    /* renamed from: p0  reason: collision with root package name */
    private int f12149p0;
    private float q = -3.4028235E38f;

    /* renamed from: q0  reason: collision with root package name */
    private int f12150q0;

    /* renamed from: r  reason: collision with root package name */
    private float f12151r = Float.MAX_VALUE;

    /* renamed from: r0  reason: collision with root package name */
    private ArrayList<View> f12152r0;

    /* renamed from: s  reason: collision with root package name */
    private int f12153s;

    /* renamed from: s0  reason: collision with root package name */
    private final Runnable f12154s0 = new c();
    private int t;

    /* renamed from: t0  reason: collision with root package name */
    private int f12155t0 = 0;

    /* renamed from: u  reason: collision with root package name */
    private boolean f12156u;
    private boolean v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f12157w;

    /* renamed from: x  reason: collision with root package name */
    private int f12158x = 1;

    /* renamed from: y  reason: collision with root package name */
    private boolean f12159y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f12160z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f12161c;

        /* renamed from: d  reason: collision with root package name */
        Parcelable f12162d;

        /* renamed from: e  reason: collision with root package name */
        ClassLoader f12163e;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f12161c + "}";
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f12161c);
            parcel.writeParcelable(this.f12162d, i11);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f12161c = parcel.readInt();
            this.f12162d = parcel.readParcelable(classLoader);
            this.f12163e = classLoader;
        }
    }

    static class a implements Comparator<f> {
        a() {
        }

        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f12168b - fVar2.f12168b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.F();
        }
    }

    class d implements t {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f12165a = new Rect();

        d() {
        }

        public n0 a(View view, n0 n0Var) {
            n0 i02 = a0.i0(view, n0Var);
            if (i02.u()) {
                return i02;
            }
            Rect rect = this.f12165a;
            rect.left = i02.p();
            rect.top = i02.r();
            rect.right = i02.q();
            rect.bottom = i02.o();
            int childCount = ViewPager.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                n0 i12 = a0.i(ViewPager.this.getChildAt(i11), i02);
                rect.left = Math.min(i12.p(), rect.left);
                rect.top = Math.min(i12.r(), rect.top);
                rect.right = Math.min(i12.q(), rect.right);
                rect.bottom = Math.min(i12.o(), rect.bottom);
            }
            return i02.w(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: a  reason: collision with root package name */
        Object f12167a;

        /* renamed from: b  reason: collision with root package name */
        int f12168b;

        /* renamed from: c  reason: collision with root package name */
        boolean f12169c;

        /* renamed from: d  reason: collision with root package name */
        float f12170d;

        /* renamed from: e  reason: collision with root package name */
        float f12171e;

        f() {
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        private boolean n() {
            a aVar = ViewPager.this.f12138e;
            return aVar != null && aVar.d() > 1;
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f12138e) != null) {
                accessibilityEvent.setItemCount(aVar.d());
                accessibilityEvent.setFromIndex(ViewPager.this.f12139f);
                accessibilityEvent.setToIndex(ViewPager.this.f12139f);
            }
        }

        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            cVar.c0(ViewPager.class.getName());
            cVar.C0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        public boolean j(View view, int i11, Bundle bundle) {
            if (super.j(view, i11, bundle)) {
                return true;
            }
            if (i11 != 4096) {
                if (i11 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f12139f - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f12139f + 1);
                return true;
            }
        }
    }

    public interface i {
        void a(ViewPager viewPager, a aVar, a aVar2);
    }

    public interface j {
        void a(int i11, float f11, int i12);

        void b(int i11);

        void c(int i11);
    }

    public interface k {
        void a(View view, float f11);
    }

    private class l extends DataSetObserver {
        l() {
        }

        public void onChanged() {
            ViewPager.this.i();
        }

        public void onInvalidated() {
            ViewPager.this.i();
        }
    }

    public static class m implements j {
        public void a(int i11, float f11, int i12) {
        }

        public void b(int i11) {
        }

        public void c(int i11) {
        }
    }

    static class n implements Comparator<View> {
        n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z11 = gVar.f12172a;
            if (z11 != gVar2.f12172a) {
                return z11 ? 1 : -1;
            }
            return gVar.f12176e - gVar2.f12176e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w();
    }

    private void A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i11);
            this.H = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean D(int i11) {
        if (this.f12134b.size() != 0) {
            f u11 = u();
            int clientWidth = getClientWidth();
            int i12 = this.f12144m;
            int i13 = clientWidth + i12;
            float f11 = (float) clientWidth;
            int i14 = u11.f12168b;
            float f12 = ((((float) i11) / f11) - u11.f12171e) / (u11.f12170d + (((float) i12) / f11));
            this.T = false;
            z(i14, f12, (int) (((float) i13) * f12));
            if (this.T) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.R) {
            return false;
        } else {
            this.T = false;
            z(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean E(float f11) {
        boolean z11;
        boolean z12;
        float f12 = this.D - f11;
        this.D = f11;
        float scrollX = ((float) getScrollX()) + f12;
        float clientWidth = (float) getClientWidth();
        float f13 = this.q * clientWidth;
        float f14 = this.f12151r * clientWidth;
        boolean z13 = false;
        f fVar = this.f12134b.get(0);
        ArrayList<f> arrayList = this.f12134b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f12168b != 0) {
            f13 = fVar.f12171e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (fVar2.f12168b != this.f12138e.d() - 1) {
            f14 = fVar2.f12171e * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (scrollX < f13) {
            if (z11) {
                this.P.onPull(Math.abs(f13 - scrollX) / clientWidth);
                z13 = true;
            }
            scrollX = f13;
        } else if (scrollX > f14) {
            if (z12) {
                this.Q.onPull(Math.abs(scrollX - f14) / clientWidth);
                z13 = true;
            }
            scrollX = f14;
        }
        int i11 = (int) scrollX;
        this.D += scrollX - ((float) i11);
        scrollTo(i11, getScrollY());
        D(i11);
        return z13;
    }

    private void H(int i11, int i12, int i13, int i14) {
        if (i12 <= 0 || this.f12134b.isEmpty()) {
            f v11 = v(this.f12139f);
            int min = (int) ((v11 != null ? Math.min(v11.f12171e, this.f12151r) : 0.0f) * ((float) ((i11 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                h(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.j.isFinished()) {
            this.j.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i12 - getPaddingLeft()) - getPaddingRight()) + i14))) * ((float) (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))), getScrollY());
        }
    }

    private void I() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((g) getChildAt(i11).getLayoutParams()).f12172a) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    private void L(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    private boolean M() {
        this.H = -1;
        p();
        this.P.onRelease();
        this.Q.onRelease();
        return this.P.isFinished() || this.Q.isFinished();
    }

    private void N(int i11, boolean z11, int i12, boolean z12) {
        f v11 = v(i11);
        int clientWidth = v11 != null ? (int) (((float) getClientWidth()) * Math.max(this.q, Math.min(v11.f12171e, this.f12151r))) : 0;
        if (z11) {
            R(clientWidth, 0, i12);
            if (z12) {
                l(i11);
                return;
            }
            return;
        }
        if (z12) {
            l(i11);
        }
        h(false);
        scrollTo(clientWidth, 0);
        D(clientWidth);
    }

    private void S() {
        if (this.f12150q0 != 0) {
            ArrayList<View> arrayList = this.f12152r0;
            if (arrayList == null) {
                this.f12152r0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.f12152r0.add(getChildAt(i11));
            }
            Collections.sort(this.f12152r0, f12132x0);
        }
    }

    private void e(f fVar, int i11, f fVar2) {
        int i12;
        int i13;
        f fVar3;
        f fVar4;
        int d11 = this.f12138e.d();
        int clientWidth = getClientWidth();
        float f11 = clientWidth > 0 ? ((float) this.f12144m) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i14 = fVar2.f12168b;
            int i15 = fVar.f12168b;
            if (i14 < i15) {
                float f12 = fVar2.f12171e + fVar2.f12170d + f11;
                int i16 = i14 + 1;
                int i17 = 0;
                while (i16 <= fVar.f12168b && i17 < this.f12134b.size()) {
                    Object obj = this.f12134b.get(i17);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i16 > fVar4.f12168b && i17 < this.f12134b.size() - 1) {
                            i17++;
                            obj = this.f12134b.get(i17);
                        }
                    }
                    while (i16 < fVar4.f12168b) {
                        f12 += this.f12138e.g(i16) + f11;
                        i16++;
                    }
                    fVar4.f12171e = f12;
                    f12 += fVar4.f12170d + f11;
                    i16++;
                }
            } else if (i14 > i15) {
                int size = this.f12134b.size() - 1;
                float f13 = fVar2.f12171e;
                while (true) {
                    i14--;
                    if (i14 < fVar.f12168b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f12134b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i14 < fVar3.f12168b && size > 0) {
                            size--;
                            obj2 = this.f12134b.get(size);
                        }
                    }
                    while (i14 > fVar3.f12168b) {
                        f13 -= this.f12138e.g(i14) + f11;
                        i14--;
                    }
                    f13 -= fVar3.f12170d + f11;
                    fVar3.f12171e = f13;
                }
            }
        }
        int size2 = this.f12134b.size();
        float f14 = fVar.f12171e;
        int i18 = fVar.f12168b;
        int i19 = i18 - 1;
        this.q = i18 == 0 ? f14 : -3.4028235E38f;
        int i21 = d11 - 1;
        this.f12151r = i18 == i21 ? (fVar.f12170d + f14) - 1.0f : Float.MAX_VALUE;
        int i22 = i11 - 1;
        while (i22 >= 0) {
            f fVar5 = this.f12134b.get(i22);
            while (true) {
                i13 = fVar5.f12168b;
                if (i19 <= i13) {
                    break;
                }
                f14 -= this.f12138e.g(i19) + f11;
                i19--;
            }
            f14 -= fVar5.f12170d + f11;
            fVar5.f12171e = f14;
            if (i13 == 0) {
                this.q = f14;
            }
            i22--;
            i19--;
        }
        float f15 = fVar.f12171e + fVar.f12170d + f11;
        int i23 = fVar.f12168b + 1;
        int i24 = i11 + 1;
        while (i24 < size2) {
            f fVar6 = this.f12134b.get(i24);
            while (true) {
                i12 = fVar6.f12168b;
                if (i23 >= i12) {
                    break;
                }
                f15 += this.f12138e.g(i23) + f11;
                i23++;
            }
            if (i12 == i21) {
                this.f12151r = (fVar6.f12170d + f15) - 1.0f;
            }
            fVar6.f12171e = f15;
            f15 += fVar6.f12170d + f11;
            i24++;
            i23++;
        }
        this.S = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(boolean z11) {
        boolean z12 = this.f12155t0 == 2;
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        D(currX);
                    }
                }
            }
        }
        this.f12157w = false;
        for (int i11 = 0; i11 < this.f12134b.size(); i11++) {
            f fVar = this.f12134b.get(i11);
            if (fVar.f12169c) {
                fVar.f12169c = false;
                z12 = true;
            }
        }
        if (!z12) {
            return;
        }
        if (z11) {
            a0.o0(this, this.f12154s0);
        } else {
            this.f12154s0.run();
        }
    }

    private int j(int i11, float f11, int i12, int i13) {
        if (Math.abs(i13) <= this.M || Math.abs(i12) <= this.K) {
            i11 += (int) (f11 + (i11 >= this.f12139f ? 0.4f : 0.6f));
        } else if (i12 <= 0) {
            i11++;
        }
        if (this.f12134b.size() <= 0) {
            return i11;
        }
        ArrayList<f> arrayList = this.f12134b;
        return Math.max(this.f12134b.get(0).f12168b, Math.min(i11, arrayList.get(arrayList.size() - 1).f12168b));
    }

    private void k(int i11, float f11, int i12) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.a(i11, f11, i12);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                j jVar2 = this.V.get(i13);
                if (jVar2 != null) {
                    jVar2.a(i11, f11, i12);
                }
            }
        }
        j jVar3 = this.f12136c0;
        if (jVar3 != null) {
            jVar3.a(i11, f11, i12);
        }
    }

    private void l(int i11) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.c(i11);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.V.get(i12);
                if (jVar2 != null) {
                    jVar2.c(i11);
                }
            }
        }
        j jVar3 = this.f12136c0;
        if (jVar3 != null) {
            jVar3.c(i11);
        }
    }

    private void m(int i11) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.b(i11);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.V.get(i12);
                if (jVar2 != null) {
                    jVar2.b(i11);
                }
            }
        }
        j jVar3 = this.f12136c0;
        if (jVar3 != null) {
            jVar3.b(i11);
        }
    }

    private void o(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).setLayerType(z11 ? this.f12149p0 : 0, (Paint) null);
        }
    }

    private void p() {
        this.f12159y = false;
        this.f12160z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    private Rect r(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.v != z11) {
            this.v = z11;
        }
    }

    private f u() {
        int i11;
        int clientWidth = getClientWidth();
        float f11 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f12 = clientWidth > 0 ? ((float) this.f12144m) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        float f13 = 0.0f;
        int i12 = -1;
        int i13 = 0;
        boolean z11 = true;
        while (i13 < this.f12134b.size()) {
            f fVar2 = this.f12134b.get(i13);
            if (!z11 && fVar2.f12168b != (i11 = i12 + 1)) {
                fVar2 = this.f12135c;
                fVar2.f12171e = f11 + f13 + f12;
                fVar2.f12168b = i11;
                fVar2.f12170d = this.f12138e.g(i11);
                i13--;
            }
            f11 = fVar2.f12171e;
            float f14 = fVar2.f12170d + f11 + f12;
            if (!z11 && scrollX < f11) {
                return fVar;
            }
            if (scrollX < f14 || i13 == this.f12134b.size() - 1) {
                return fVar2;
            }
            i12 = fVar2.f12168b;
            f13 = fVar2.f12170d;
            i13++;
            fVar = fVar2;
            z11 = false;
        }
        return fVar;
    }

    private static boolean x(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean y(float f11, float f12) {
        return (f11 < ((float) this.B) && f12 > 0.0f) || (f11 > ((float) (getWidth() - this.B)) && f12 < 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        int i11 = this.f12139f;
        if (i11 <= 0) {
            return false;
        }
        O(i11 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        a aVar = this.f12138e;
        if (aVar == null || this.f12139f >= aVar.d() - 1) {
            return false;
        }
        O(this.f12139f + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void F() {
        G(this.f12139f);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f12139f
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.v(r2)
            r0.f12139f = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f12138e
            if (r1 != 0) goto L_0x0018
            r17.S()
            return
        L_0x0018:
            boolean r1 = r0.f12157w
            if (r1 == 0) goto L_0x0020
            r17.S()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f12138e
            r1.r(r0)
            int r1 = r0.f12158x
            int r4 = r0.f12139f
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f12138e
            int r6 = r6.d()
            int r7 = r6 + -1
            int r8 = r0.f12139f
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f12133a
            if (r6 != r7) goto L_0x020e
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f12134b
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f12134b
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            int r9 = r8.f12168b
            int r10 = r0.f12139f
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f12139f
            androidx.viewpager.widget.ViewPager$f r8 = r0.a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019b
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f12134b
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f12170d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f12139f
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00fd
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00cb
            if (r3 >= r4) goto L_0x00cb
            if (r11 != 0) goto L_0x00a8
            goto L_0x00fd
        L_0x00a8:
            int r5 = r11.f12168b
            if (r3 != r5) goto L_0x00f9
            boolean r5 = r11.f12169c
            if (r5 != 0) goto L_0x00f9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            r5.remove(r10)
            androidx.viewpager.widget.a r5 = r0.f12138e
            java.lang.Object r11 = r11.f12167a
            r5.a(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00f8
        L_0x00cb:
            if (r11 == 0) goto L_0x00e1
            int r5 = r11.f12168b
            if (r3 != r5) goto L_0x00e1
            float r5 = r11.f12170d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00f8
        L_0x00e1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.a(r3, r5)
            float r5 = r5.f12170d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00f7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            r11 = r5
        L_0x00f9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00fd:
            float r3 = r8.f12170d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x018f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0116
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            if (r12 > 0) goto L_0x011b
            r10 = 0
            goto L_0x0123
        L_0x011b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0123:
            int r11 = r0.f12139f
        L_0x0125:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x018f
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0159
            if (r11 <= r1) goto L_0x0159
            if (r5 != 0) goto L_0x0132
            goto L_0x018f
        L_0x0132:
            int r12 = r5.f12168b
            if (r11 != r12) goto L_0x018e
            boolean r12 = r5.f12169c
            if (r12 != 0) goto L_0x018e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f12134b
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f12138e
            java.lang.Object r5 = r5.f12167a
            r12.a(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x018e
        L_0x0157:
            r5 = 0
            goto L_0x018e
        L_0x0159:
            if (r5 == 0) goto L_0x0175
            int r12 = r5.f12168b
            if (r11 != r12) goto L_0x0175
            float r5 = r5.f12170d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x018e
        L_0x0175:
            androidx.viewpager.widget.ViewPager$f r5 = r0.a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f12170d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0157
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
        L_0x018e:
            goto L_0x0125
        L_0x018f:
            r0.e(r8, r7, r2)
            androidx.viewpager.widget.a r1 = r0.f12138e
            int r2 = r0.f12139f
            java.lang.Object r3 = r8.f12167a
            r1.o(r0, r2, r3)
        L_0x019b:
            androidx.viewpager.widget.a r1 = r0.f12138e
            r1.c(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a5:
            if (r2 >= r1) goto L_0x01ce
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r4 = (androidx.viewpager.widget.ViewPager.g) r4
            r4.f12177f = r2
            boolean r5 = r4.f12172a
            if (r5 != 0) goto L_0x01cb
            float r5 = r4.f12174c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01cb
            androidx.viewpager.widget.ViewPager$f r3 = r0.t(r3)
            if (r3 == 0) goto L_0x01cb
            float r5 = r3.f12170d
            r4.f12174c = r5
            int r3 = r3.f12168b
            r4.f12176e = r3
        L_0x01cb:
            int r2 = r2 + 1
            goto L_0x01a5
        L_0x01ce:
            r17.S()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x020d
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e2
            androidx.viewpager.widget.ViewPager$f r3 = r0.s(r1)
            goto L_0x01e3
        L_0x01e2:
            r3 = 0
        L_0x01e3:
            if (r3 == 0) goto L_0x01eb
            int r1 = r3.f12168b
            int r2 = r0.f12139f
            if (r1 == r2) goto L_0x020d
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x020d
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.t(r1)
            if (r2 == 0) goto L_0x020a
            int r2 = r2.f12168b
            int r3 = r0.f12139f
            if (r2 != r3) goto L_0x020a
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x020a
            goto L_0x020d
        L_0x020a:
            int r5 = r5 + 1
            goto L_0x01ec
        L_0x020d:
            return
        L_0x020e:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021b }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021b }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021b }
            goto L_0x0223
        L_0x021b:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0223:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f12133a
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f12138e
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.G(int):void");
    }

    public void J(i iVar) {
        List<i> list = this.f12145n0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void K(j jVar) {
        List<j> list = this.V;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void O(int i11, boolean z11) {
        this.f12157w = false;
        P(i11, z11, false);
    }

    /* access modifiers changed from: package-private */
    public void P(int i11, boolean z11, boolean z12) {
        Q(i11, z11, z12, 0);
    }

    /* access modifiers changed from: package-private */
    public void Q(int i11, boolean z11, boolean z12, int i12) {
        a aVar = this.f12138e;
        boolean z13 = false;
        if (aVar == null || aVar.d() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z12 || this.f12139f != i11 || this.f12134b.size() == 0) {
            if (i11 < 0) {
                i11 = 0;
            } else if (i11 >= this.f12138e.d()) {
                i11 = this.f12138e.d() - 1;
            }
            int i13 = this.f12158x;
            int i14 = this.f12139f;
            if (i11 > i14 + i13 || i11 < i14 - i13) {
                for (int i15 = 0; i15 < this.f12134b.size(); i15++) {
                    this.f12134b.get(i15).f12169c = true;
                }
            }
            if (this.f12139f != i11) {
                z13 = true;
            }
            if (this.R) {
                this.f12139f = i11;
                if (z13) {
                    l(i11);
                }
                requestLayout();
                return;
            }
            G(i11);
            N(i11, z11, i12, z13);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            i14 = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i14 = getScrollX();
        }
        int i16 = i14;
        int scrollY = getScrollY();
        int i17 = i11 - i16;
        int i18 = i12 - scrollY;
        if (i17 == 0 && i18 == 0) {
            h(false);
            F();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i19 = clientWidth / 2;
        float f11 = (float) clientWidth;
        float f12 = (float) i19;
        float n11 = f12 + (n(Math.min(1.0f, (((float) Math.abs(i17)) * 1.0f) / f11)) * f12);
        int abs = Math.abs(i13);
        if (abs > 0) {
            i15 = Math.round(Math.abs(n11 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i15 = (int) (((((float) Math.abs(i17)) / ((f11 * this.f12138e.g(this.f12139f)) + ((float) this.f12144m))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i15, 600);
        this.k = false;
        this.j.startScroll(i16, scrollY, i17, i18, min);
        a0.n0(this);
    }

    /* access modifiers changed from: package-private */
    public f a(int i11, int i12) {
        f fVar = new f();
        fVar.f12168b = i11;
        fVar.f12167a = this.f12138e.h(this, i11);
        fVar.f12170d = this.f12138e.g(i11);
        if (i12 < 0 || i12 >= this.f12134b.size()) {
            this.f12134b.add(fVar);
        } else {
            this.f12134b.add(i12, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        f t11;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (t11 = t(childAt)) != null && t11.f12168b == this.f12139f) {
                    childAt.addFocusables(arrayList, i11, i12);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i12 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        f t11;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (t11 = t(childAt)) != null && t11.f12168b == this.f12139f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean x11 = gVar.f12172a | x(view);
        gVar.f12172a = x11;
        if (!this.f12156u) {
            super.addView(view, i11, layoutParams);
        } else if (!x11) {
            gVar.f12175d = true;
            addViewInLayout(view, i11, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void b(i iVar) {
        if (this.f12145n0 == null) {
            this.f12145n0 = new ArrayList();
        }
        this.f12145n0.add(iVar);
    }

    public void c(j jVar) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.add(jVar);
    }

    public boolean canScrollHorizontally(int i11) {
        if (this.f12138e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i11 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.q))) {
                return true;
            }
            return false;
        } else if (i11 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f12151r))) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            h(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!D(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        a0.n0(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00ba
            if (r3 == r0) goto L_0x00ba
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f12137d
            android.graphics.Rect r1 = r6.r(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f12137d
            android.graphics.Rect r2 = r6.r(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.B()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00cd
        L_0x009a:
            if (r7 != r4) goto L_0x00cd
            android.graphics.Rect r1 = r6.f12137d
            android.graphics.Rect r1 = r6.r(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f12137d
            android.graphics.Rect r2 = r6.r(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b5
            if (r1 > r2) goto L_0x00b5
            boolean r0 = r6.C()
            goto L_0x0098
        L_0x00b5:
            boolean r0 = r3.requestFocus()
            goto L_0x0098
        L_0x00ba:
            if (r7 == r5) goto L_0x00c9
            if (r7 != r1) goto L_0x00bf
            goto L_0x00c9
        L_0x00bf:
            if (r7 == r4) goto L_0x00c4
            r0 = 2
            if (r7 != r0) goto L_0x00cd
        L_0x00c4:
            boolean r2 = r6.C()
            goto L_0x00cd
        L_0x00c9:
            boolean r2 = r6.B()
        L_0x00cd:
            if (r2 == 0) goto L_0x00d6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || q(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f t11;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (t11 = t(childAt)) != null && t11.f12168b == this.f12139f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z11 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f12138e) != null && aVar.d() > 1)) {
            if (!this.P.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.q * ((float) width));
                this.P.setSize(height, width);
                z11 = false | this.P.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.Q.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f12151r + 1.0f)) * ((float) width2));
                this.Q.setSize(height2, width2);
                z11 |= this.Q.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.P.finish();
            this.Q.finish();
        }
        if (z11) {
            a0.n0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public boolean f(View view, boolean z11, int i11, int i12, int i13) {
        int i14;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom()) {
                    if (f(childAt, true, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z11 || !view.canScrollHorizontally(-i11)) {
            return false;
        }
        return true;
    }

    public void g() {
        List<j> list = this.V;
        if (list != null) {
            list.clear();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f12138e;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i11, int i12) {
        if (this.f12150q0 == 2) {
            i12 = (i11 - 1) - i12;
        }
        return ((g) this.f12152r0.get(i12).getLayoutParams()).f12177f;
    }

    public int getCurrentItem() {
        return this.f12139f;
    }

    public int getOffscreenPageLimit() {
        return this.f12158x;
    }

    public int getPageMargin() {
        return this.f12144m;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int d11 = this.f12138e.d();
        this.f12133a = d11;
        boolean z11 = this.f12134b.size() < (this.f12158x * 2) + 1 && this.f12134b.size() < d11;
        int i11 = this.f12139f;
        int i12 = 0;
        boolean z12 = false;
        while (i12 < this.f12134b.size()) {
            f fVar = this.f12134b.get(i12);
            int e11 = this.f12138e.e(fVar.f12167a);
            if (e11 != -1) {
                if (e11 == -2) {
                    this.f12134b.remove(i12);
                    i12--;
                    if (!z12) {
                        this.f12138e.r(this);
                        z12 = true;
                    }
                    this.f12138e.a(this, fVar.f12168b, fVar.f12167a);
                    int i13 = this.f12139f;
                    if (i13 == fVar.f12168b) {
                        i11 = Math.max(0, Math.min(i13, d11 - 1));
                    }
                } else {
                    int i14 = fVar.f12168b;
                    if (i14 != e11) {
                        if (i14 == this.f12139f) {
                            i11 = e11;
                        }
                        fVar.f12168b = e11;
                    }
                }
                z11 = true;
            }
            i12++;
        }
        if (z12) {
            this.f12138e.c(this);
        }
        Collections.sort(this.f12134b, f12130v0);
        if (z11) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                g gVar = (g) getChildAt(i15).getLayoutParams();
                if (!gVar.f12172a) {
                    gVar.f12174c = 0.0f;
                }
            }
            P(i11, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public float n(float f11) {
        return (float) Math.sin((double) ((f11 - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f12154s0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f12144m
            if (r1 <= 0) goto L_0x00aa
            android.graphics.drawable.Drawable r1 = r0.n
            if (r1 == 0) goto L_0x00aa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f12134b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00aa
            androidx.viewpager.widget.a r1 = r0.f12138e
            if (r1 == 0) goto L_0x00aa
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f12144m
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            float r7 = r5.f12171e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f12134b
            int r8 = r8.size()
            int r9 = r5.f12168b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.f12134b
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.f) r10
            int r10 = r10.f12168b
        L_0x0045:
            if (r9 >= r10) goto L_0x00aa
        L_0x0047:
            int r11 = r5.f12168b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f12134b
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.f12171e
            float r11 = r5.f12170d
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0071
        L_0x0065:
            androidx.viewpager.widget.a r11 = r0.f12138e
            float r11 = r11.g(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x0071:
            int r11 = r0.f12144m
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            android.graphics.drawable.Drawable r11 = r0.n
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f12146o
            int r15 = r0.f12144m
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f12148p
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.n
            r11 = r18
            r3.draw(r11)
            goto L_0x009d
        L_0x0099:
            r11 = r18
            r16 = r3
        L_0x009d:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            M();
            return false;
        }
        if (action != 0) {
            if (this.f12159y) {
                return true;
            }
            if (this.f12160z) {
                return false;
            }
        }
        if (action == 0) {
            float x11 = motionEvent.getX();
            this.F = x11;
            this.D = x11;
            float y11 = motionEvent.getY();
            this.G = y11;
            this.E = y11;
            this.H = motionEvent2.getPointerId(0);
            this.f12160z = false;
            this.k = true;
            this.j.computeScrollOffset();
            if (this.f12155t0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.N) {
                h(false);
                this.f12159y = false;
            } else {
                this.j.abortAnimation();
                this.f12157w = false;
                F();
                this.f12159y = true;
                L(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i11 = this.H;
            if (i11 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i11);
                float x12 = motionEvent2.getX(findPointerIndex);
                float f11 = x12 - this.D;
                float abs = Math.abs(f11);
                float y12 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y12 - this.G);
                int i12 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i12 != 0 && !y(this.D, f11)) {
                    if (f(this, false, (int) f11, (int) x12, (int) y12)) {
                        this.D = x12;
                        this.E = y12;
                        this.f12160z = true;
                        return false;
                    }
                }
                int i13 = this.C;
                if (abs > ((float) i13) && abs * 0.5f > abs2) {
                    this.f12159y = true;
                    L(true);
                    setScrollState(1);
                    float f12 = this.F;
                    float f13 = (float) this.C;
                    this.D = i12 > 0 ? f12 + f13 : f12 - f13;
                    this.E = y12;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i13)) {
                    this.f12160z = true;
                }
                if (this.f12159y && E(x12)) {
                    a0.n0(this);
                }
            }
        } else if (action == 6) {
            A(motionEvent);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent2);
        return this.f12159y;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r12 = (androidx.viewpager.widget.ViewPager.g) r12
            boolean r14 = r12.f12172a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f12173b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f12172a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.t(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f12171e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f12175d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f12175d = r14
            float r9 = r9.f12174c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f12146o = r5
            int r3 = r3 - r7
            r0.f12148p = r3
            r0.U = r11
            boolean r1 = r0.R
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f12139f
            r2 = 0
            r0.N(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.R = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.A
            int r15 = java.lang.Math.min(r15, r1)
            r13.B = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r3 = (androidx.viewpager.widget.ViewPager.g) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f12172a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f12173b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r13.f12153s = r1
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.t = r15
            r13.f12156u = r4
            r13.F()
            r13.f12156u = r0
            int r15 = r13.getChildCount()
        L_0x00c9:
            if (r0 >= r15) goto L_0x00f3
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00f0
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r2 = (androidx.viewpager.widget.ViewPager.g) r2
            if (r2 == 0) goto L_0x00e1
            boolean r4 = r2.f12172a
            if (r4 != 0) goto L_0x00f0
        L_0x00e1:
            float r4 = (float) r14
            float r2 = r2.f12174c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.t
            r1.measure(r2, r4)
        L_0x00f0:
            int r0 = r0 + 1
            goto L_0x00c9
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        f t11;
        int childCount = getChildCount();
        int i14 = -1;
        if ((i11 & 2) != 0) {
            i14 = childCount;
            i13 = 0;
            i12 = 1;
        } else {
            i13 = childCount - 1;
            i12 = -1;
        }
        while (i13 != i14) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 0 && (t11 = t(childAt)) != null && t11.f12168b == this.f12139f && childAt.requestFocus(i11, rect)) {
                return true;
            }
            i13 += i12;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        a aVar = this.f12138e;
        if (aVar != null) {
            aVar.l(savedState.f12162d, savedState.f12163e);
            P(savedState.f12161c, false, true);
            return;
        }
        this.f12140g = savedState.f12161c;
        this.f12141h = savedState.f12162d;
        this.f12142i = savedState.f12163e;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12161c = this.f12139f;
        a aVar = this.f12138e;
        if (aVar != null) {
            savedState.f12162d = aVar.m();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.f12144m;
            H(i11, i13, i15, i15);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.O) {
            return true;
        }
        boolean z11 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f12138e) == null || aVar.d() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.j.abortAnimation();
            this.f12157w = false;
            F();
            float x11 = motionEvent.getX();
            this.F = x11;
            this.D = x11;
            float y11 = motionEvent.getY();
            this.G = y11;
            this.E = y11;
            this.H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f12159y) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.H);
                    if (findPointerIndex == -1) {
                        z11 = M();
                    } else {
                        float x12 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x12 - this.D);
                        float y12 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y12 - this.E);
                        if (abs > ((float) this.C) && abs > abs2) {
                            this.f12159y = true;
                            L(true);
                            float f11 = this.F;
                            this.D = x12 - f11 > 0.0f ? f11 + ((float) this.C) : f11 - ((float) this.C);
                            this.E = y12;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f12159y) {
                    z11 = false | E(motionEvent.getX(motionEvent.findPointerIndex(this.H)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.D = motionEvent.getX(actionIndex);
                    this.H = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    A(motionEvent);
                    this.D = motionEvent.getX(motionEvent.findPointerIndex(this.H));
                }
            } else if (this.f12159y) {
                N(this.f12139f, true, 0, false);
                z11 = M();
            }
        } else if (this.f12159y) {
            VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(1000, (float) this.L);
            int xVelocity = (int) velocityTracker.getXVelocity(this.H);
            this.f12157w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f u11 = u();
            float f12 = (float) clientWidth;
            Q(j(u11.f12168b, ((((float) scrollX) / f12) - u11.f12171e) / (u11.f12170d + (((float) this.f12144m) / f12)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.H)) - this.F)), true, true, xVelocity);
            z11 = M();
        }
        if (z11) {
            a0.n0(this);
        }
        return true;
    }

    public boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return C();
                } else {
                    return d(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return B();
            } else {
                return d(17);
            }
        }
        return false;
    }

    public void removeView(View view) {
        if (this.f12156u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* access modifiers changed from: package-private */
    public f s(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return t(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.f12138e;
        if (aVar2 != null) {
            aVar2.p((DataSetObserver) null);
            this.f12138e.r(this);
            for (int i11 = 0; i11 < this.f12134b.size(); i11++) {
                f fVar = this.f12134b.get(i11);
                this.f12138e.a(this, fVar.f12168b, fVar.f12167a);
            }
            this.f12138e.c(this);
            this.f12134b.clear();
            I();
            this.f12139f = 0;
            scrollTo(0, 0);
        }
        a aVar3 = this.f12138e;
        this.f12138e = aVar;
        this.f12133a = 0;
        if (aVar != null) {
            if (this.f12143l == null) {
                this.f12143l = new l();
            }
            this.f12138e.p(this.f12143l);
            this.f12157w = false;
            boolean z11 = this.R;
            this.R = true;
            this.f12133a = this.f12138e.d();
            if (this.f12140g >= 0) {
                this.f12138e.l(this.f12141h, this.f12142i);
                P(this.f12140g, false, true);
                this.f12140g = -1;
                this.f12141h = null;
                this.f12142i = null;
            } else if (!z11) {
                F();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.f12145n0;
        if (list != null && !list.isEmpty()) {
            int size = this.f12145n0.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f12145n0.get(i12).a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i11) {
        this.f12157w = false;
        P(i11, !this.R, false);
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i11 + " too small; defaulting to " + 1);
            i11 = 1;
        }
        if (i11 != this.f12158x) {
            this.f12158x = i11;
            F();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.W = jVar;
    }

    public void setPageMargin(int i11) {
        int i12 = this.f12144m;
        this.f12144m = i11;
        int width = getWidth();
        H(width, width, i11, i12);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i11) {
        if (this.f12155t0 != i11) {
            this.f12155t0 = i11;
            if (this.f12147o0 != null) {
                o(i11 != 0);
            }
            m(i11);
        }
    }

    /* access modifiers changed from: package-private */
    public f t(View view) {
        for (int i11 = 0; i11 < this.f12134b.size(); i11++) {
            f fVar = this.f12134b.get(i11);
            if (this.f12138e.i(view, fVar.f12167a)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public f v(int i11) {
        for (int i12 = 0; i12 < this.f12134b.size(); i12++) {
            f fVar = this.f12134b.get(i12);
            if (fVar.f12168b == i11) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, f12131w0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f11);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffect(context);
        this.Q = new EdgeEffect(context);
        this.M = (int) (25.0f * f11);
        this.N = (int) (2.0f * f11);
        this.A = (int) (f11 * 16.0f);
        a0.w0(this, new h());
        if (a0.D(this) == 0) {
            a0.H0(this, 1);
        }
        a0.K0(this, new d());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.U
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r9 = (androidx.viewpager.widget.ViewPager.g) r9
            boolean r10 = r9.f12172a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f12173b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.k(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$k r13 = r12.f12147o0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r0 = (androidx.viewpager.widget.ViewPager.g) r0
            boolean r0 = r0.f12172a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$k r3 = r12.f12147o0
            r3.a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.T = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.z(int, float, int):void");
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f12172a;

        /* renamed from: b  reason: collision with root package name */
        public int f12173b;

        /* renamed from: c  reason: collision with root package name */
        float f12174c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        boolean f12175d;

        /* renamed from: e  reason: collision with root package name */
        int f12176e;

        /* renamed from: f  reason: collision with root package name */
        int f12177f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f12129u0);
            this.f12173b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i11) {
        setPageMarginDrawable(androidx.core.content.a.f(getContext(), i11));
    }
}
