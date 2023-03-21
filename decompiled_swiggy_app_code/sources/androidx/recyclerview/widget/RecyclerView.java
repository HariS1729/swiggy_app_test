package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.core.view.accessibility.c;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.o {
    private static final int[] P0 = {16843830};
    static final boolean Q0 = false;
    static final boolean R0;
    static final boolean S0 = true;
    static final boolean T0 = true;
    private static final boolean U0 = false;
    private static final boolean V0 = false;
    private static final Class<?>[] W0;
    static final Interpolator X0 = new c();
    private int A;
    private l.b A0;
    boolean B;
    boolean B0;
    private final AccessibilityManager C;
    s C0;
    private List<q> D;
    private j D0;
    boolean E;
    private final int[] E0;
    boolean F;
    private androidx.core.view.p F0;
    private int G;
    private final int[] G0;
    private int H;
    private final int[] H0;
    private k I;
    final int[] I0;
    final List<d0> J0;
    private EdgeEffect K;
    private Runnable K0;
    private EdgeEffect L;
    private boolean L0;
    private EdgeEffect M;
    private int M0;
    private EdgeEffect N;
    private int N0;
    l O;
    private final x.b O0;
    private int P;
    private int Q;
    private VelocityTracker R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a  reason: collision with root package name */
    private final x f11128a;

    /* renamed from: b  reason: collision with root package name */
    final v f11129b;

    /* renamed from: c  reason: collision with root package name */
    SavedState f11130c;

    /* renamed from: c0  reason: collision with root package name */
    private r f11131c0;

    /* renamed from: d  reason: collision with root package name */
    a f11132d;

    /* renamed from: e  reason: collision with root package name */
    f f11133e;

    /* renamed from: f  reason: collision with root package name */
    final x f11134f;

    /* renamed from: g  reason: collision with root package name */
    boolean f11135g;

    /* renamed from: h  reason: collision with root package name */
    final Runnable f11136h;

    /* renamed from: i  reason: collision with root package name */
    final Rect f11137i;
    private final Rect j;
    final RectF k;

    /* renamed from: l  reason: collision with root package name */
    Adapter f11138l;

    /* renamed from: m  reason: collision with root package name */
    o f11139m;
    w n;

    /* renamed from: n0  reason: collision with root package name */
    private final int f11140n0;

    /* renamed from: o  reason: collision with root package name */
    final List<w> f11141o;

    /* renamed from: o0  reason: collision with root package name */
    private final int f11142o0;

    /* renamed from: p  reason: collision with root package name */
    final ArrayList<n> f11143p;

    /* renamed from: p0  reason: collision with root package name */
    private float f11144p0;
    private final ArrayList<s> q;

    /* renamed from: q0  reason: collision with root package name */
    private float f11145q0;

    /* renamed from: r  reason: collision with root package name */
    private s f11146r;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f11147r0;

    /* renamed from: s  reason: collision with root package name */
    boolean f11148s;

    /* renamed from: s0  reason: collision with root package name */
    final c0 f11149s0;
    boolean t;

    /* renamed from: t0  reason: collision with root package name */
    j f11150t0;

    /* renamed from: u  reason: collision with root package name */
    boolean f11151u;

    /* renamed from: u0  reason: collision with root package name */
    j.b f11152u0;
    boolean v;

    /* renamed from: v0  reason: collision with root package name */
    final a0 f11153v0;

    /* renamed from: w  reason: collision with root package name */
    private int f11154w;

    /* renamed from: w0  reason: collision with root package name */
    private t f11155w0;

    /* renamed from: x  reason: collision with root package name */
    boolean f11156x;

    /* renamed from: x0  reason: collision with root package name */
    private List<t> f11157x0;

    /* renamed from: y  reason: collision with root package name */
    boolean f11158y;

    /* renamed from: y0  reason: collision with root package name */
    boolean f11159y0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11160z;

    /* renamed from: z0  reason: collision with root package name */
    boolean f11161z0;

    public static abstract class Adapter<VH extends d0> {
        private boolean mHasStableIds = false;
        private final h mObservable = new h();
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh2, int i11) {
            boolean z11 = vh2.mBindingAdapter == null;
            if (z11) {
                vh2.mPosition = i11;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i11);
                }
                vh2.setFlags(1, 519);
                androidx.core.os.l.a("RV OnBindView");
            }
            vh2.mBindingAdapter = this;
            onBindViewHolder(vh2, i11, vh2.getUnmodifiedPayloads());
            if (z11) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof p) {
                    ((p) layoutParams).f11216c = true;
                }
                androidx.core.os.l.b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean canRestoreState() {
            int i11 = g.f11188a[this.mStateRestorationPolicy.ordinal()];
            if (i11 == 1) {
                return false;
            }
            if (i11 == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i11) {
            try {
                androidx.core.os.l.a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i11);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i11;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.os.l.b();
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends d0> adapter, d0 d0Var, int i11) {
            if (adapter == this) {
                return i11;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i11) {
            return -1;
        }

        public int getItemViewType(int i11) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i11) {
            this.mObservable.d(i11, 1);
        }

        public final void notifyItemInserted(int i11) {
            this.mObservable.f(i11, 1);
        }

        public final void notifyItemMoved(int i11, int i12) {
            this.mObservable.c(i11, i12);
        }

        public final void notifyItemRangeChanged(int i11, int i12) {
            this.mObservable.d(i11, i12);
        }

        public final void notifyItemRangeInserted(int i11, int i12) {
            this.mObservable.f(i11, i12);
        }

        public final void notifyItemRangeRemoved(int i11, int i12) {
            this.mObservable.g(i11, i12);
        }

        public final void notifyItemRemoved(int i11) {
            this.mObservable.g(i11, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh2, int i11);

        public void onBindViewHolder(VH vh2, int i11, List<Object> list) {
            onBindViewHolder(vh2, i11);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i11);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh2) {
        }

        public void onViewDetachedFromWindow(VH vh2) {
        }

        public void onViewRecycled(VH vh2) {
        }

        public void registerAdapterDataObserver(i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z11) {
            if (!hasObservers()) {
                this.mHasStableIds = z11;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i11, Object obj) {
            this.mObservable.e(i11, 1, obj);
        }

        public final void notifyItemRangeChanged(int i11, int i12, Object obj) {
            this.mObservable.e(i11, i12, obj);
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.v && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f11148s) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f11158y) {
                    recyclerView2.f11156x = true;
                } else {
                    recyclerView2.v();
                }
            }
        }
    }

    public static class a0 {

        /* renamed from: a  reason: collision with root package name */
        int f11164a = -1;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f11165b;

        /* renamed from: c  reason: collision with root package name */
        int f11166c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f11167d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f11168e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f11169f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f11170g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f11171h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f11172i = false;
        boolean j = false;
        boolean k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f11173l = false;

        /* renamed from: m  reason: collision with root package name */
        int f11174m;
        long n;

        /* renamed from: o  reason: collision with root package name */
        int f11175o;

        /* renamed from: p  reason: collision with root package name */
        int f11176p;
        int q;

        /* access modifiers changed from: package-private */
        public void a(int i11) {
            if ((this.f11168e & i11) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i11) + " but it is " + Integer.toBinaryString(this.f11168e));
            }
        }

        public int b() {
            if (this.f11171h) {
                return this.f11166c - this.f11167d;
            }
            return this.f11169f;
        }

        public int c() {
            return this.f11164a;
        }

        public boolean d() {
            return this.f11164a != -1;
        }

        public boolean e() {
            return this.f11171h;
        }

        /* access modifiers changed from: package-private */
        public void f(Adapter adapter) {
            this.f11168e = 1;
            this.f11169f = adapter.getItemCount();
            this.f11171h = false;
            this.f11172i = false;
            this.j = false;
        }

        public boolean g() {
            return this.f11173l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f11164a + ", mData=" + this.f11165b + ", mItemCount=" + this.f11169f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f11166c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f11167d + ", mStructureChanged=" + this.f11170g + ", mInPreLayout=" + this.f11171h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.f11173l + '}';
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            l lVar = RecyclerView.this.O;
            if (lVar != null) {
                lVar.runPendingAnimations();
            }
            RecyclerView.this.B0 = false;
        }
    }

    public static abstract class b0 {
    }

    class c implements Interpolator {
        c() {
        }

        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    class c0 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f11178a;

        /* renamed from: b  reason: collision with root package name */
        private int f11179b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f11180c;

        /* renamed from: d  reason: collision with root package name */
        Interpolator f11181d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f11182e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f11183f = false;

        c0() {
            Interpolator interpolator = RecyclerView.X0;
            this.f11181d = interpolator;
            this.f11180c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i11, int i12) {
            int abs = Math.abs(i11);
            int abs2 = Math.abs(i12);
            boolean z11 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z11 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z11) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            androidx.core.view.a0.o0(RecyclerView.this, this);
        }

        public void b(int i11, int i12) {
            RecyclerView.this.setScrollState(2);
            this.f11179b = 0;
            this.f11178a = 0;
            Interpolator interpolator = this.f11181d;
            Interpolator interpolator2 = RecyclerView.X0;
            if (interpolator != interpolator2) {
                this.f11181d = interpolator2;
                this.f11180c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f11180c.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f11182e) {
                this.f11183f = true;
            } else {
                c();
            }
        }

        public void e(int i11, int i12, int i13, Interpolator interpolator) {
            if (i13 == Integer.MIN_VALUE) {
                i13 = a(i11, i12);
            }
            int i14 = i13;
            if (interpolator == null) {
                interpolator = RecyclerView.X0;
            }
            if (this.f11181d != interpolator) {
                this.f11181d = interpolator;
                this.f11180c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f11179b = 0;
            this.f11178a = 0;
            RecyclerView.this.setScrollState(2);
            this.f11180c.startScroll(0, 0, i11, i12, i14);
            if (Build.VERSION.SDK_INT < 23) {
                this.f11180c.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f11180c.abortAnimation();
        }

        public void run() {
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f11139m == null) {
                f();
                return;
            }
            this.f11183f = false;
            this.f11182e = true;
            recyclerView.v();
            OverScroller overScroller = this.f11180c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f11178a;
                int i14 = currY - this.f11179b;
                this.f11178a = currX;
                this.f11179b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.I0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.G(i13, i14, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.I0;
                    i13 -= iArr2[0];
                    i14 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.u(i13, i14);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f11138l != null) {
                    int[] iArr3 = recyclerView3.I0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.l1(i13, i14, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.I0;
                    i11 = iArr4[0];
                    i12 = iArr4[1];
                    i13 -= i11;
                    i14 -= i12;
                    z zVar = recyclerView4.f11139m.f11200g;
                    if (zVar != null && !zVar.g() && zVar.h()) {
                        int b11 = RecyclerView.this.f11153v0.b();
                        if (b11 == 0) {
                            zVar.r();
                        } else if (zVar.f() >= b11) {
                            zVar.p(b11 - 1);
                            zVar.j(i11, i12);
                        } else {
                            zVar.j(i11, i12);
                        }
                    }
                } else {
                    i12 = 0;
                    i11 = 0;
                }
                if (!RecyclerView.this.f11143p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.I0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.H(i11, i12, i13, i14, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.I0;
                int i15 = i13 - iArr6[0];
                int i16 = i14 - iArr6[1];
                if (!(i11 == 0 && i12 == 0)) {
                    recyclerView6.J(i11, i12);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
                z zVar2 = RecyclerView.this.f11139m.f11200g;
                if ((zVar2 != null && zVar2.g()) || !z11) {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    j jVar = recyclerView7.f11150t0;
                    if (jVar != null) {
                        jVar.f(recyclerView7, i11, i12);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i17 = i15 < 0 ? -currVelocity : i15 > 0 ? currVelocity : 0;
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.b(i17, currVelocity);
                    }
                    if (RecyclerView.T0) {
                        RecyclerView.this.f11152u0.b();
                    }
                }
            }
            z zVar3 = RecyclerView.this.f11139m.f11200g;
            if (zVar3 != null && zVar3.g()) {
                zVar3.j(0, 0);
            }
            this.f11182e = false;
            if (this.f11183f) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.y1(1);
        }
    }

    class d implements x.b {
        d() {
        }

        public void a(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.m(d0Var, cVar, cVar2);
        }

        public void b(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f11139m.v1(d0Var.itemView, recyclerView.f11129b);
        }

        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.f11129b.J(d0Var);
            RecyclerView.this.o(d0Var, cVar, cVar2);
        }

        public void d(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.E) {
                if (recyclerView.O.animateChange(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.Q0();
                }
            } else if (recyclerView.O.animatePersistence(d0Var, cVar, cVar2)) {
                RecyclerView.this.Q0();
            }
        }
    }

    public static abstract class d0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        Adapter<? extends d0> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        v mScrapContainer = null;
        d0 mShadowedHolder = null;
        d0 mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public d0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i11) {
            this.mFlags = i11 | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && androidx.core.view.a0.X(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i11, int i12, boolean z11) {
            addFlags(8);
            offsetPosition(i12, z11);
            this.mPosition = i11;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.d0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends d0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int d02;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (d02 = this.mOwnerRecyclerView.d0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, d02);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i11) {
            return (i11 & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !androidx.core.view.a0.X(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i11, boolean z11) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z11) {
                this.mPreLayoutPosition += i11;
            }
            this.mPosition += i11;
            if (this.itemView.getLayoutParams() != null) {
                ((p) this.itemView.getLayoutParams()).f11216c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i11 = this.mPendingAccessibilityState;
            if (i11 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i11;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = androidx.core.view.a0.D(this.itemView);
            }
            recyclerView.o1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.o1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.s(this);
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i11, int i12) {
            this.mFlags = (i11 & i12) | (this.mFlags & (~i12));
        }

        public final void setIsRecyclable(boolean z11) {
            int i11 = this.mIsRecyclableCount;
            int i12 = z11 ? i11 - 1 : i11 + 1;
            this.mIsRecyclableCount = i12;
            if (i12 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z11 && i12 == 1) {
                this.mFlags |= 16;
            } else if (z11 && i12 == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(v vVar, boolean z11) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z11;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.J(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    class e implements f.b {
        e() {
        }

        public View a(int i11) {
            return RecyclerView.this.getChildAt(i11);
        }

        public int b() {
            return RecyclerView.this.getChildCount();
        }

        public void c(View view) {
            d0 i02 = RecyclerView.i0(view);
            if (i02 != null) {
                i02.onEnteredHiddenState(RecyclerView.this);
            }
        }

        public d0 d(View view) {
            return RecyclerView.i0(view);
        }

        public void e(View view, int i11) {
            RecyclerView.this.addView(view, i11);
            RecyclerView.this.z(view);
        }

        public void f() {
            int b11 = b();
            for (int i11 = 0; i11 < b11; i11++) {
                View a11 = a(i11);
                RecyclerView.this.A(a11);
                a11.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public void g(View view, int i11, ViewGroup.LayoutParams layoutParams) {
            d0 i02 = RecyclerView.i0(view);
            if (i02 != null) {
                if (i02.isTmpDetached() || i02.shouldIgnore()) {
                    i02.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + i02 + RecyclerView.this.Q());
                }
            }
            RecyclerView.this.attachViewToParent(view, i11, layoutParams);
        }

        public void h(int i11) {
            d0 i02;
            View a11 = a(i11);
            if (!(a11 == null || (i02 = RecyclerView.i0(a11)) == null)) {
                if (!i02.isTmpDetached() || i02.shouldIgnore()) {
                    i02.addFlags(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + i02 + RecyclerView.this.Q());
                }
            }
            RecyclerView.this.detachViewFromParent(i11);
        }

        public int i(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        public void j(View view) {
            d0 i02 = RecyclerView.i0(view);
            if (i02 != null) {
                i02.onLeftHiddenState(RecyclerView.this);
            }
        }

        public void k(int i11) {
            View childAt = RecyclerView.this.getChildAt(i11);
            if (childAt != null) {
                RecyclerView.this.A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i11);
        }
    }

    class f implements a.C0076a {
        f() {
        }

        public void a(int i11, int i12) {
            RecyclerView.this.G0(i11, i12);
            RecyclerView.this.f11159y0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public void c(a.b bVar) {
            i(bVar);
        }

        public d0 d(int i11) {
            d0 b02 = RecyclerView.this.b0(i11, true);
            if (b02 != null && !RecyclerView.this.f11133e.n(b02.itemView)) {
                return b02;
            }
            return null;
        }

        public void e(int i11, int i12) {
            RecyclerView.this.F0(i11, i12);
            RecyclerView.this.f11159y0 = true;
        }

        public void f(int i11, int i12) {
            RecyclerView.this.H0(i11, i12, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f11159y0 = true;
            recyclerView.f11153v0.f11167d += i12;
        }

        public void g(int i11, int i12) {
            RecyclerView.this.H0(i11, i12, false);
            RecyclerView.this.f11159y0 = true;
        }

        public void h(int i11, int i12, Object obj) {
            RecyclerView.this.B1(i11, i12, obj);
            RecyclerView.this.f11161z0 = true;
        }

        /* access modifiers changed from: package-private */
        public void i(a.b bVar) {
            int i11 = bVar.f11293a;
            if (i11 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f11139m.Z0(recyclerView, bVar.f11294b, bVar.f11296d);
            } else if (i11 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f11139m.c1(recyclerView2, bVar.f11294b, bVar.f11296d);
            } else if (i11 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f11139m.e1(recyclerView3, bVar.f11294b, bVar.f11296d, bVar.f11295c);
            } else if (i11 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f11139m.b1(recyclerView4, bVar.f11294b, bVar.f11296d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11188a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11188a = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11188a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g.<clinit>():void");
        }
    }

    static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).a();
            }
        }

        public void c(int i11, int i12) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).e(i11, i12, 1);
            }
        }

        public void d(int i11, int i12) {
            e(i11, i12, (Object) null);
        }

        public void e(int i11, int i12, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).c(i11, i12, obj);
            }
        }

        public void f(int i11, int i12) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).d(i11, i12);
            }
        }

        public void g(int i11, int i12) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).f(i11, i12);
            }
        }

        public void h() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((i) this.mObservers.get(size)).g();
            }
        }
    }

    public static abstract class i {
        public void a() {
        }

        public void b(int i11, int i12) {
        }

        public void c(int i11, int i12, Object obj) {
            b(i11, i12);
        }

        public void d(int i11, int i12) {
        }

        public void e(int i11, int i12, int i13) {
        }

        public void f(int i11, int i12) {
        }

        public void g() {
        }
    }

    public interface j {
        int a(int i11, int i12);
    }

    public static class k {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i11) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration = 120;
        private long mChangeDuration = 250;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private b mListener = null;
        private long mMoveDuration = 250;
        private long mRemoveDuration = 120;

        public interface a {
            void a();
        }

        interface b {
            void a(d0 d0Var);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f11189a;

            /* renamed from: b  reason: collision with root package name */
            public int f11190b;

            /* renamed from: c  reason: collision with root package name */
            public int f11191c;

            /* renamed from: d  reason: collision with root package name */
            public int f11192d;

            public c a(d0 d0Var) {
                return b(d0Var, 0);
            }

            public c b(d0 d0Var, int i11) {
                View view = d0Var.itemView;
                this.f11189a = view.getLeft();
                this.f11190b = view.getTop();
                this.f11191c = view.getRight();
                this.f11192d = view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(d0 d0Var) {
            int i11 = d0Var.mFlags & 14;
            if (d0Var.isInvalid()) {
                return 4;
            }
            if ((i11 & 4) != 0) {
                return i11;
            }
            int oldPosition = d0Var.getOldPosition();
            int absoluteAdapterPosition = d0Var.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i11 : i11 | 2048;
        }

        public abstract boolean animateAppearance(d0 d0Var, c cVar, c cVar2);

        public abstract boolean animateChange(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean animateDisappearance(d0 d0Var, c cVar, c cVar2);

        public abstract boolean animatePersistence(d0 d0Var, c cVar, c cVar2);

        public boolean canReuseUpdatedViewHolder(d0 d0Var) {
            return true;
        }

        public boolean canReuseUpdatedViewHolder(d0 d0Var, List<Object> list) {
            return canReuseUpdatedViewHolder(d0Var);
        }

        public final void dispatchAnimationFinished(d0 d0Var) {
            onAnimationFinished(d0Var);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public final void dispatchAnimationStarted(d0 d0Var) {
            onAnimationStarted(d0Var);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mFinishedListeners.get(i11).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(d0 d0Var);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null) {
                if (!isRunning) {
                    aVar.a();
                } else {
                    this.mFinishedListeners.add(aVar);
                }
            }
            return isRunning;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(d0 d0Var) {
        }

        public void onAnimationStarted(d0 d0Var) {
        }

        public c recordPostLayoutInformation(a0 a0Var, d0 d0Var) {
            return obtainHolderInfo().a(d0Var);
        }

        public c recordPreLayoutInformation(a0 a0Var, d0 d0Var, int i11, List<Object> list) {
            return obtainHolderInfo().a(d0Var);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        /* access modifiers changed from: package-private */
        public void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }
    }

    private class m implements l.b {
        m() {
        }

        public void a(d0 d0Var) {
            d0Var.setIsRecyclable(true);
            if (d0Var.mShadowedHolder != null && d0Var.mShadowingHolder == null) {
                d0Var.mShadowedHolder = null;
            }
            d0Var.mShadowingHolder = null;
            if (!d0Var.shouldBeKeptAsChild() && !RecyclerView.this.Z0(d0Var.itemView) && d0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(d0Var.itemView, false);
            }
        }
    }

    public static abstract class n {
        @Deprecated
        public void d(Rect rect, int i11, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            d(rect, ((p) view.getLayoutParams()).b(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        f f11194a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f11195b;

        /* renamed from: c  reason: collision with root package name */
        private final w.b f11196c;

        /* renamed from: d  reason: collision with root package name */
        private final w.b f11197d;

        /* renamed from: e  reason: collision with root package name */
        w f11198e;

        /* renamed from: f  reason: collision with root package name */
        w f11199f;

        /* renamed from: g  reason: collision with root package name */
        z f11200g;

        /* renamed from: h  reason: collision with root package name */
        boolean f11201h = false;

        /* renamed from: i  reason: collision with root package name */
        boolean f11202i = false;
        boolean j = false;
        private boolean k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f11203l = true;

        /* renamed from: m  reason: collision with root package name */
        int f11204m;
        boolean n;

        /* renamed from: o  reason: collision with root package name */
        private int f11205o;

        /* renamed from: p  reason: collision with root package name */
        private int f11206p;
        private int q;

        /* renamed from: r  reason: collision with root package name */
        private int f11207r;

        class a implements w.b {
            a() {
            }

            public View a(int i11) {
                return o.this.T(i11);
            }

            public int b() {
                return o.this.getPaddingLeft();
            }

            public int c() {
                return o.this.v0() - o.this.getPaddingRight();
            }

            public int d(View view) {
                return o.this.b0(view) - ((p) view.getLayoutParams()).leftMargin;
            }

            public int e(View view) {
                return o.this.e0(view) + ((p) view.getLayoutParams()).rightMargin;
            }
        }

        class b implements w.b {
            b() {
            }

            public View a(int i11) {
                return o.this.T(i11);
            }

            public int b() {
                return o.this.getPaddingTop();
            }

            public int c() {
                return o.this.h0() - o.this.getPaddingBottom();
            }

            public int d(View view) {
                return o.this.f0(view) - ((p) view.getLayoutParams()).topMargin;
            }

            public int e(View view) {
                return o.this.Z(view) + ((p) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i11, int i12);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f11210a;

            /* renamed from: b  reason: collision with root package name */
            public int f11211b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f11212c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f11213d;
        }

        public o() {
            a aVar = new a();
            this.f11196c = aVar;
            b bVar = new b();
            this.f11197d = bVar;
            this.f11198e = new w(aVar);
            this.f11199f = new w(bVar);
        }

        private boolean A0(RecyclerView recyclerView, int i11, int i12) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v02 = v0() - getPaddingRight();
            int h02 = h0() - getPaddingBottom();
            Rect rect = this.f11195b.f11137i;
            a0(focusedChild, rect);
            if (rect.left - i11 >= v02 || rect.right - i11 <= paddingLeft || rect.top - i12 >= h02 || rect.bottom - i12 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean E0(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (i13 > 0 && i11 != i13) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i11;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i11;
            }
            return true;
        }

        private void E1(v vVar, int i11, View view) {
            d0 i02 = RecyclerView.i0(view);
            if (!i02.shouldIgnore()) {
                if (!i02.isInvalid() || i02.isRemoved() || this.f11195b.f11138l.hasStableIds()) {
                    I(i11);
                    vVar.D(view);
                    this.f11195b.f11134f.k(i02);
                    return;
                }
                z1(i11);
                vVar.C(i02);
            }
        }

        private void J(int i11, View view) {
            this.f11194a.d(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int V(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.V(int, int, int, int, boolean):int");
        }

        private int[] W(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v02 = v0() - getPaddingRight();
            int h02 = h0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i11 = left - paddingLeft;
            int min = Math.min(0, i11);
            int i12 = top - paddingTop;
            int min2 = Math.min(0, i12);
            int i13 = width - v02;
            int max = Math.max(0, i13);
            int max2 = Math.max(0, height - h02);
            if (k0() != 1) {
                if (min == 0) {
                    min = Math.min(i11, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i13);
            }
            if (min2 == 0) {
                min2 = Math.min(i12, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d p0(Context context, AttributeSet attributeSet, int i11, int i12) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i11, i12);
            dVar.f11210a = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
            dVar.f11211b = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
            dVar.f11212c = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
            dVar.f11213d = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void s(View view, int i11, boolean z11) {
            d0 i02 = RecyclerView.i0(view);
            if (z11 || i02.isRemoved()) {
                this.f11195b.f11134f.b(i02);
            } else {
                this.f11195b.f11134f.p(i02);
            }
            p pVar = (p) view.getLayoutParams();
            if (i02.wasReturnedFromScrap() || i02.isScrap()) {
                if (i02.isScrap()) {
                    i02.unScrap();
                } else {
                    i02.clearReturnedFromScrapFlag();
                }
                this.f11194a.c(view, i11, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f11195b) {
                int m11 = this.f11194a.m(view);
                if (i11 == -1) {
                    i11 = this.f11194a.g();
                }
                if (m11 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f11195b.indexOfChild(view) + this.f11195b.Q());
                } else if (m11 != i11) {
                    this.f11195b.f11139m.J0(m11, i11);
                }
            } else {
                this.f11194a.a(view, i11, false);
                pVar.f11216c = true;
                z zVar = this.f11200g;
                if (zVar != null && zVar.h()) {
                    this.f11200g.k(view);
                }
            }
            if (pVar.f11217d) {
                i02.itemView.invalidate();
                pVar.f11217d = false;
            }
        }

        public static int y(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i12, i13) : size;
            }
            return Math.min(size, Math.max(i12, i13));
        }

        public void A(int i11, c cVar) {
        }

        public boolean A1(RecyclerView recyclerView, View view, Rect rect, boolean z11) {
            return B1(recyclerView, view, rect, z11, false);
        }

        public int B(a0 a0Var) {
            return 0;
        }

        public final boolean B0() {
            return this.f11203l;
        }

        public boolean B1(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
            int[] W = W(view, rect);
            int i11 = W[0];
            int i12 = W[1];
            if ((z12 && !A0(recyclerView, i11, i12)) || (i11 == 0 && i12 == 0)) {
                return false;
            }
            if (z11) {
                recyclerView.scrollBy(i11, i12);
            } else {
                recyclerView.q1(i11, i12);
            }
            return true;
        }

        public int C(a0 a0Var) {
            return 0;
        }

        public boolean C0(v vVar, a0 a0Var) {
            return false;
        }

        public void C1() {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int D(a0 a0Var) {
            return 0;
        }

        public boolean D0() {
            return this.k;
        }

        public void D1() {
            this.f11201h = true;
        }

        public int E(a0 a0Var) {
            return 0;
        }

        public int F(a0 a0Var) {
            return 0;
        }

        public boolean F0() {
            z zVar = this.f11200g;
            return zVar != null && zVar.h();
        }

        public int F1(int i11, v vVar, a0 a0Var) {
            return 0;
        }

        public int G(a0 a0Var) {
            return 0;
        }

        public boolean G0(View view, boolean z11, boolean z12) {
            boolean z13 = this.f11198e.b(view, 24579) && this.f11199f.b(view, 24579);
            return z11 ? z13 : !z13;
        }

        public void G1(int i11) {
        }

        public void H(v vVar) {
            for (int U = U() - 1; U >= 0; U--) {
                E1(vVar, U, T(U));
            }
        }

        public void H0(View view, int i11, int i12, int i13, int i14) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f11215b;
            view.layout(i11 + rect.left + pVar.leftMargin, i12 + rect.top + pVar.topMargin, (i13 - rect.right) - pVar.rightMargin, (i14 - rect.bottom) - pVar.bottomMargin);
        }

        public int H1(int i11, v vVar, a0 a0Var) {
            return 0;
        }

        public void I(int i11) {
            J(i11, T(i11));
        }

        public void I0(View view, int i11, int i12) {
            p pVar = (p) view.getLayoutParams();
            Rect m02 = this.f11195b.m0(view);
            int i13 = i11 + m02.left + m02.right;
            int i14 = i12 + m02.top + m02.bottom;
            int V = V(v0(), w0(), getPaddingLeft() + getPaddingRight() + pVar.leftMargin + pVar.rightMargin + i13, pVar.width, m());
            int V2 = V(h0(), i0(), getPaddingTop() + getPaddingBottom() + pVar.topMargin + pVar.bottomMargin + i14, pVar.height, l());
            if (O1(view, V, V2, pVar)) {
                view.measure(V, V2);
            }
        }

        /* access modifiers changed from: package-private */
        public void I1(RecyclerView recyclerView) {
            J1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void J0(int i11, int i12) {
            View T = T(i11);
            if (T != null) {
                I(i11);
                u(T, i12);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + this.f11195b.toString());
        }

        /* access modifiers changed from: package-private */
        public void J1(int i11, int i12) {
            this.q = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            this.f11205o = mode;
            if (mode == 0 && !RecyclerView.R0) {
                this.q = 0;
            }
            this.f11207r = View.MeasureSpec.getSize(i12);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.f11206p = mode2;
            if (mode2 == 0 && !RecyclerView.R0) {
                this.f11207r = 0;
            }
        }

        /* access modifiers changed from: package-private */
        public void K(RecyclerView recyclerView) {
            this.f11202i = true;
            O0(recyclerView);
        }

        public void K0(int i11) {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                recyclerView.D0(i11);
            }
        }

        public void K1(int i11, int i12) {
            this.f11195b.setMeasuredDimension(i11, i12);
        }

        /* access modifiers changed from: package-private */
        public void L(RecyclerView recyclerView, v vVar) {
            this.f11202i = false;
            Q0(recyclerView, vVar);
        }

        public void L0(int i11) {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                recyclerView.E0(i11);
            }
        }

        public void L1(Rect rect, int i11, int i12) {
            K1(y(i11, rect.width() + getPaddingLeft() + getPaddingRight(), n0()), y(i12, rect.height() + getPaddingTop() + getPaddingBottom(), m0()));
        }

        public View M(View view) {
            View T;
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView == null || (T = recyclerView.T(view)) == null || this.f11194a.n(T)) {
                return null;
            }
            return T;
        }

        public void M0(Adapter adapter, Adapter adapter2) {
        }

        /* access modifiers changed from: package-private */
        public void M1(int i11, int i12) {
            int U = U();
            if (U == 0) {
                this.f11195b.x(i11, i12);
                return;
            }
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = 0; i17 < U; i17++) {
                View T = T(i17);
                Rect rect = this.f11195b.f11137i;
                a0(T, rect);
                int i18 = rect.left;
                if (i18 < i15) {
                    i15 = i18;
                }
                int i19 = rect.right;
                if (i19 > i13) {
                    i13 = i19;
                }
                int i21 = rect.top;
                if (i21 < i16) {
                    i16 = i21;
                }
                int i22 = rect.bottom;
                if (i22 > i14) {
                    i14 = i22;
                }
            }
            this.f11195b.f11137i.set(i15, i16, i13, i14);
            L1(this.f11195b.f11137i, i11, i12);
        }

        public View N(int i11) {
            int U = U();
            for (int i12 = 0; i12 < U; i12++) {
                View T = T(i12);
                d0 i02 = RecyclerView.i0(T);
                if (i02 != null && i02.getLayoutPosition() == i11 && !i02.shouldIgnore() && (this.f11195b.f11153v0.e() || !i02.isRemoved())) {
                    return T;
                }
            }
            return null;
        }

        public boolean N0(RecyclerView recyclerView, ArrayList<View> arrayList, int i11, int i12) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public void N1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f11195b = null;
                this.f11194a = null;
                this.q = 0;
                this.f11207r = 0;
            } else {
                this.f11195b = recyclerView;
                this.f11194a = recyclerView.f11133e;
                this.q = recyclerView.getWidth();
                this.f11207r = recyclerView.getHeight();
            }
            this.f11205o = 1073741824;
            this.f11206p = 1073741824;
        }

        public abstract p O();

        public void O0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean O1(View view, int i11, int i12, p pVar) {
            return view.isLayoutRequested() || !this.k || !E0(view.getWidth(), i11, pVar.width) || !E0(view.getHeight(), i12, pVar.height);
        }

        public p P(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        @Deprecated
        public void P0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        public boolean P1() {
            return false;
        }

        public p Q(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public void Q0(RecyclerView recyclerView, v vVar) {
            P0(recyclerView);
        }

        /* access modifiers changed from: package-private */
        public boolean Q1(View view, int i11, int i12, p pVar) {
            return !this.k || !E0(view.getMeasuredWidth(), i11, pVar.width) || !E0(view.getMeasuredHeight(), i12, pVar.height);
        }

        public int R() {
            return -1;
        }

        public View R0(View view, int i11, v vVar, a0 a0Var) {
            return null;
        }

        public void R1(RecyclerView recyclerView, a0 a0Var, int i11) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int S(View view) {
            return ((p) view.getLayoutParams()).f11215b.bottom;
        }

        public void S0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f11195b;
            T0(recyclerView.f11129b, recyclerView.f11153v0, accessibilityEvent);
        }

        public void S1(z zVar) {
            z zVar2 = this.f11200g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.h())) {
                this.f11200g.r();
            }
            this.f11200g = zVar;
            zVar.q(this.f11195b, this);
        }

        public View T(int i11) {
            f fVar = this.f11194a;
            if (fVar != null) {
                return fVar.f(i11);
            }
            return null;
        }

        public void T0(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z11 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f11195b.canScrollVertically(-1) && !this.f11195b.canScrollHorizontally(-1) && !this.f11195b.canScrollHorizontally(1)) {
                    z11 = false;
                }
                accessibilityEvent.setScrollable(z11);
                Adapter adapter = this.f11195b.f11138l;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void T1() {
            z zVar = this.f11200g;
            if (zVar != null) {
                zVar.r();
            }
        }

        public int U() {
            f fVar = this.f11194a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        public void U0(androidx.core.view.accessibility.c cVar) {
            RecyclerView recyclerView = this.f11195b;
            V0(recyclerView.f11129b, recyclerView.f11153v0, cVar);
        }

        public boolean U1() {
            return false;
        }

        public void V0(v vVar, a0 a0Var, androidx.core.view.accessibility.c cVar) {
            if (this.f11195b.canScrollVertically(-1) || this.f11195b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.C0(true);
            }
            if (this.f11195b.canScrollVertically(1) || this.f11195b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.C0(true);
            }
            cVar.e0(c.b.a(r0(vVar, a0Var), Y(vVar, a0Var), C0(vVar, a0Var), s0(vVar, a0Var)));
        }

        /* access modifiers changed from: package-private */
        public void W0(View view, androidx.core.view.accessibility.c cVar) {
            d0 i02 = RecyclerView.i0(view);
            if (i02 != null && !i02.isRemoved() && !this.f11194a.n(i02.itemView)) {
                RecyclerView recyclerView = this.f11195b;
                X0(recyclerView.f11129b, recyclerView.f11153v0, view, cVar);
            }
        }

        public boolean X() {
            RecyclerView recyclerView = this.f11195b;
            return recyclerView != null && recyclerView.f11135g;
        }

        public void X0(v vVar, a0 a0Var, View view, androidx.core.view.accessibility.c cVar) {
        }

        public int Y(v vVar, a0 a0Var) {
            return -1;
        }

        public View Y0(View view, int i11) {
            return null;
        }

        public int Z(View view) {
            return view.getBottom() + S(view);
        }

        public void Z0(RecyclerView recyclerView, int i11, int i12) {
        }

        public void a0(View view, Rect rect) {
            RecyclerView.j0(view, rect);
        }

        public void a1(RecyclerView recyclerView) {
        }

        public int b0(View view) {
            return view.getLeft() - l0(view);
        }

        public void b1(RecyclerView recyclerView, int i11, int i12, int i13) {
        }

        public int c0(View view) {
            Rect rect = ((p) view.getLayoutParams()).f11215b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void c1(RecyclerView recyclerView, int i11, int i12) {
        }

        public int d0(View view) {
            Rect rect = ((p) view.getLayoutParams()).f11215b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void d1(RecyclerView recyclerView, int i11, int i12) {
        }

        public int e0(View view) {
            return view.getRight() + q0(view);
        }

        public void e1(RecyclerView recyclerView, int i11, int i12, Object obj) {
            d1(recyclerView, i11, i12);
        }

        public int f0(View view) {
            return view.getTop() - t0(view);
        }

        public void f1(v vVar, a0 a0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public View g0() {
            View focusedChild;
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f11194a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void g1(a0 a0Var) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                return androidx.core.view.a0.J(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                return androidx.core.view.a0.K(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0() {
            return this.f11207r;
        }

        public void h1(v vVar, a0 a0Var, int i11, int i12) {
            this.f11195b.x(i11, i12);
        }

        public int i0() {
            return this.f11206p;
        }

        @Deprecated
        public boolean i1(RecyclerView recyclerView, View view, View view2) {
            return F0() || recyclerView.x0();
        }

        public int j0() {
            RecyclerView recyclerView = this.f11195b;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public boolean j1(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return i1(recyclerView, view, view2);
        }

        public int k0() {
            return androidx.core.view.a0.F(this.f11195b);
        }

        public void k1(Parcelable parcelable) {
        }

        public boolean l() {
            return false;
        }

        public int l0(View view) {
            return ((p) view.getLayoutParams()).f11215b.left;
        }

        public Parcelable l1() {
            return null;
        }

        public boolean m() {
            return false;
        }

        public int m0() {
            return androidx.core.view.a0.G(this.f11195b);
        }

        public void m1(int i11) {
        }

        public int n0() {
            return androidx.core.view.a0.H(this.f11195b);
        }

        /* access modifiers changed from: package-private */
        public void n1(z zVar) {
            if (this.f11200g == zVar) {
                this.f11200g = null;
            }
        }

        public void o(View view) {
            p(view, -1);
        }

        public int o0(View view) {
            return ((p) view.getLayoutParams()).b();
        }

        /* access modifiers changed from: package-private */
        public boolean o1(int i11, Bundle bundle) {
            RecyclerView recyclerView = this.f11195b;
            return p1(recyclerView.f11129b, recyclerView.f11153v0, i11, bundle);
        }

        public void p(View view, int i11) {
            s(view, i11, true);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean p1(androidx.recyclerview.widget.RecyclerView.v r8, androidx.recyclerview.widget.RecyclerView.a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f11195b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.h0()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f11195b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.v0()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.h0()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f11195b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.v0()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f11195b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.t1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.p1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        public void q(View view) {
            r(view, -1);
        }

        public int q0(View view) {
            return ((p) view.getLayoutParams()).f11215b.right;
        }

        /* access modifiers changed from: package-private */
        public boolean q1(View view, int i11, Bundle bundle) {
            RecyclerView recyclerView = this.f11195b;
            return r1(recyclerView.f11129b, recyclerView.f11153v0, view, i11, bundle);
        }

        public void r(View view, int i11) {
            s(view, i11, false);
        }

        public int r0(v vVar, a0 a0Var) {
            return -1;
        }

        public boolean r1(v vVar, a0 a0Var, View view, int i11, Bundle bundle) {
            return false;
        }

        public int s0(v vVar, a0 a0Var) {
            return 0;
        }

        public void s1() {
            for (int U = U() - 1; U >= 0; U--) {
                this.f11194a.q(U);
            }
        }

        public void t(String str) {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                recyclerView.p(str);
            }
        }

        public int t0(View view) {
            return ((p) view.getLayoutParams()).f11215b.top;
        }

        public void t1(v vVar) {
            for (int U = U() - 1; U >= 0; U--) {
                if (!RecyclerView.i0(T(U)).shouldIgnore()) {
                    w1(U, vVar);
                }
            }
        }

        public void u(View view, int i11) {
            v(view, i11, (p) view.getLayoutParams());
        }

        public void u0(View view, boolean z11, Rect rect) {
            Matrix matrix;
            if (z11) {
                Rect rect2 = ((p) view.getLayoutParams()).f11215b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f11195b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f11195b.k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* access modifiers changed from: package-private */
        public void u1(v vVar) {
            int j11 = vVar.j();
            for (int i11 = j11 - 1; i11 >= 0; i11--) {
                View n11 = vVar.n(i11);
                d0 i02 = RecyclerView.i0(n11);
                if (!i02.shouldIgnore()) {
                    i02.setIsRecyclable(false);
                    if (i02.isTmpDetached()) {
                        this.f11195b.removeDetachedView(n11, false);
                    }
                    l lVar = this.f11195b.O;
                    if (lVar != null) {
                        lVar.endAnimation(i02);
                    }
                    i02.setIsRecyclable(true);
                    vVar.y(n11);
                }
            }
            vVar.e();
            if (j11 > 0) {
                this.f11195b.invalidate();
            }
        }

        public void v(View view, int i11, p pVar) {
            d0 i02 = RecyclerView.i0(view);
            if (i02.isRemoved()) {
                this.f11195b.f11134f.b(i02);
            } else {
                this.f11195b.f11134f.p(i02);
            }
            this.f11194a.c(view, i11, pVar, i02.isRemoved());
        }

        public int v0() {
            return this.q;
        }

        public void v1(View view, v vVar) {
            y1(view);
            vVar.B(view);
        }

        public void w(View view, Rect rect) {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m0(view));
            }
        }

        public int w0() {
            return this.f11205o;
        }

        public void w1(int i11, v vVar) {
            View T = T(i11);
            z1(i11);
            vVar.B(T);
        }

        public boolean x(p pVar) {
            return pVar != null;
        }

        /* access modifiers changed from: package-private */
        public boolean x0() {
            int U = U();
            for (int i11 = 0; i11 < U; i11++) {
                ViewGroup.LayoutParams layoutParams = T(i11).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean x1(Runnable runnable) {
            RecyclerView recyclerView = this.f11195b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public boolean y0() {
            return this.f11202i;
        }

        public void y1(View view) {
            this.f11194a.p(view);
        }

        public void z(int i11, int i12, a0 a0Var, c cVar) {
        }

        public boolean z0() {
            return this.j;
        }

        public void z1(int i11) {
            if (T(i11) != null) {
                this.f11194a.q(i11);
            }
        }
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
        public abstract boolean a(int i11, int i12);
    }

    public interface s {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z11);
    }

    public static abstract class t {
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        }

        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        }
    }

    public static class u {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f11218a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f11219b = 0;

        static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<d0> f11220a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f11221b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f11222c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f11223d = 0;

            a() {
            }
        }

        private a g(int i11) {
            a aVar = this.f11218a.get(i11);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f11218a.put(i11, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f11219b++;
        }

        public void b() {
            for (int i11 = 0; i11 < this.f11218a.size(); i11++) {
                this.f11218a.valueAt(i11).f11220a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f11219b--;
        }

        /* access modifiers changed from: package-private */
        public void d(int i11, long j) {
            a g11 = g(i11);
            g11.f11223d = j(g11.f11223d, j);
        }

        /* access modifiers changed from: package-private */
        public void e(int i11, long j) {
            a g11 = g(i11);
            g11.f11222c = j(g11.f11222c, j);
        }

        public d0 f(int i11) {
            a aVar = this.f11218a.get(i11);
            if (aVar == null || aVar.f11220a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f11220a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void h(Adapter adapter, Adapter adapter2, boolean z11) {
            if (adapter != null) {
                c();
            }
            if (!z11 && this.f11219b == 0) {
                b();
            }
            if (adapter2 != null) {
                a();
            }
        }

        public void i(d0 d0Var) {
            int itemViewType = d0Var.getItemViewType();
            ArrayList<d0> arrayList = g(itemViewType).f11220a;
            if (this.f11218a.get(itemViewType).f11221b > arrayList.size()) {
                d0Var.resetInternal();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public long j(long j, long j11) {
            return j == 0 ? j11 : ((j / 4) * 3) + (j11 / 4);
        }

        public void k(int i11, int i12) {
            a g11 = g(i11);
            g11.f11221b = i12;
            ArrayList<d0> arrayList = g11.f11220a;
            while (arrayList.size() > i12) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean l(int i11, long j, long j11) {
            long j12 = g(i11).f11223d;
            return j12 == 0 || j + j12 < j11;
        }

        /* access modifiers changed from: package-private */
        public boolean m(int i11, long j, long j11) {
            long j12 = g(i11).f11222c;
            return j12 == 0 || j + j12 < j11;
        }
    }

    public final class v {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<d0> f11224a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<d0> f11225b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<d0> f11226c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<d0> f11227d;

        /* renamed from: e  reason: collision with root package name */
        private int f11228e;

        /* renamed from: f  reason: collision with root package name */
        int f11229f;

        /* renamed from: g  reason: collision with root package name */
        u f11230g;

        public v() {
            ArrayList<d0> arrayList = new ArrayList<>();
            this.f11224a = arrayList;
            this.f11227d = Collections.unmodifiableList(arrayList);
            this.f11228e = 2;
            this.f11229f = 2;
        }

        private boolean H(d0 d0Var, int i11, int i12, long j) {
            d0Var.mBindingAdapter = null;
            d0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = d0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f11230g.l(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f11138l.bindViewHolder(d0Var, i11);
            this.f11230g.d(d0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(d0Var);
            if (!RecyclerView.this.f11153v0.e()) {
                return true;
            }
            d0Var.mPreLayoutPosition = i12;
            return true;
        }

        private void b(d0 d0Var) {
            if (RecyclerView.this.w0()) {
                View view = d0Var.itemView;
                if (androidx.core.view.a0.D(view) == 0) {
                    androidx.core.view.a0.H0(view, 1);
                }
                s sVar = RecyclerView.this.C0;
                if (sVar != null) {
                    androidx.core.view.a n = sVar.n();
                    if (n instanceof s.a) {
                        ((s.a) n).o(view);
                    }
                    androidx.core.view.a0.w0(view, n);
                }
            }
        }

        private void q(ViewGroup viewGroup, boolean z11) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z11) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(d0 d0Var) {
            View view = d0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        public void A(int i11) {
            a(this.f11226c.get(i11), true);
            this.f11226c.remove(i11);
        }

        public void B(View view) {
            d0 i02 = RecyclerView.i0(view);
            if (i02.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (i02.isScrap()) {
                i02.unScrap();
            } else if (i02.wasReturnedFromScrap()) {
                i02.clearReturnedFromScrapFlag();
            }
            C(i02);
            if (RecyclerView.this.O != null && !i02.isRecyclable()) {
                RecyclerView.this.O.endAnimation(i02);
            }
        }

        /* access modifiers changed from: package-private */
        public void C(d0 d0Var) {
            boolean z11;
            boolean z12 = false;
            boolean z13 = true;
            if (d0Var.isScrap() || d0Var.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(d0Var.isScrap());
                sb2.append(" isAttached:");
                if (d0Var.itemView.getParent() != null) {
                    z12 = true;
                }
                sb2.append(z12);
                sb2.append(RecyclerView.this.Q());
                throw new IllegalArgumentException(sb2.toString());
            } else if (d0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.Q());
            } else if (!d0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = d0Var.doesTransientStatePreventRecycling();
                Adapter adapter = RecyclerView.this.f11138l;
                if ((adapter != null && doesTransientStatePreventRecycling && adapter.onFailedToRecycleView(d0Var)) || d0Var.isRecyclable()) {
                    if (this.f11229f <= 0 || d0Var.hasAnyOfTheFlags(526)) {
                        z11 = false;
                    } else {
                        int size = this.f11226c.size();
                        if (size >= this.f11229f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.T0 && size > 0 && !RecyclerView.this.f11152u0.d(d0Var.mPosition)) {
                            int i11 = size - 1;
                            while (i11 >= 0) {
                                if (!RecyclerView.this.f11152u0.d(this.f11226c.get(i11).mPosition)) {
                                    break;
                                }
                                i11--;
                            }
                            size = i11 + 1;
                        }
                        this.f11226c.add(size, d0Var);
                        z11 = true;
                    }
                    if (!z11) {
                        a(d0Var, true);
                        z12 = z11;
                        RecyclerView.this.f11134f.q(d0Var);
                        if (!z12 && !z13 && doesTransientStatePreventRecycling) {
                            d0Var.mBindingAdapter = null;
                            d0Var.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    z12 = z11;
                }
                z13 = false;
                RecyclerView.this.f11134f.q(d0Var);
                if (!z12) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.Q());
            }
        }

        /* access modifiers changed from: package-private */
        public void D(View view) {
            d0 i02 = RecyclerView.i0(view);
            if (!i02.hasAnyOfTheFlags(12) && i02.isUpdated() && !RecyclerView.this.q(i02)) {
                if (this.f11225b == null) {
                    this.f11225b = new ArrayList<>();
                }
                i02.setScrapContainer(this, true);
                this.f11225b.add(i02);
            } else if (!i02.isInvalid() || i02.isRemoved() || RecyclerView.this.f11138l.hasStableIds()) {
                i02.setScrapContainer(this, false);
                this.f11224a.add(i02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.Q());
            }
        }

        /* access modifiers changed from: package-private */
        public void E(u uVar) {
            u uVar2 = this.f11230g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f11230g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f11230g.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void F(b0 b0Var) {
        }

        public void G(int i11) {
            this.f11228e = i11;
            K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.d0 I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f11153v0
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x01da
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f11153v0
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f11132d
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f11138l
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x00f4
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f11138l
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.f11138l
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.f11138l
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.i()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.resetInternal()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.Q0
                if (r1 == 0) goto L_0x00ac
                r6.r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x012c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f11230g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.m(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r2.f11138l
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.T0
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.X(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f11230g
                long r10 = r10 - r0
                r5.e(r9, r10)
                r9 = r2
                goto L_0x012d
            L_0x00f4:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f11153v0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012c:
                r9 = r1
            L_0x012d:
                r10 = r4
                if (r10 == 0) goto L_0x0166
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f11153v0
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x0166
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x0166
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f11153v0
                boolean r0 = r0.k
                if (r0 == 0) goto L_0x0166
                int r0 = androidx.recyclerview.widget.RecyclerView.l.buildAdapterChangeFlagsForAnimations(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.O
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.f11153v0
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.recordPreLayoutInformation(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.V0(r9, r0)
            L_0x0166:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.f11153v0
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x0179
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x0179
                r9.mPreLayoutPosition = r3
                goto L_0x018c
            L_0x0179:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x018e
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x018e
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x018c
                goto L_0x018e
            L_0x018c:
                r0 = 0
                goto L_0x01a1
            L_0x018e:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f11132d
                int r2 = r0.m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.H(r1, r2, r3, r4)
            L_0x01a1:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b7
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01b7:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01cd
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x01cf
            L_0x01cd:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
            L_0x01cf:
                r1.f11214a = r9
                if (r10 == 0) goto L_0x01d6
                if (r0 == 0) goto L_0x01d6
                goto L_0x01d7
            L_0x01d6:
                r7 = 0
            L_0x01d7:
                r1.f11217d = r7
                return r9
            L_0x01da:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.f11153v0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: package-private */
        public void J(d0 d0Var) {
            if (d0Var.mInChangeScrap) {
                this.f11225b.remove(d0Var);
            } else {
                this.f11224a.remove(d0Var);
            }
            d0Var.mScrapContainer = null;
            d0Var.mInChangeScrap = false;
            d0Var.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        public void K() {
            o oVar = RecyclerView.this.f11139m;
            this.f11229f = this.f11228e + (oVar != null ? oVar.f11204m : 0);
            for (int size = this.f11226c.size() - 1; size >= 0 && this.f11226c.size() > this.f11229f; size--) {
                A(size);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean L(d0 d0Var) {
            if (d0Var.isRemoved()) {
                return RecyclerView.this.f11153v0.e();
            }
            int i11 = d0Var.mPosition;
            if (i11 < 0 || i11 >= RecyclerView.this.f11138l.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.Q());
            } else if (!RecyclerView.this.f11153v0.e() && RecyclerView.this.f11138l.getItemViewType(d0Var.mPosition) != d0Var.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.f11138l.hasStableIds() || d0Var.getItemId() == RecyclerView.this.f11138l.getItemId(d0Var.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public void M(int i11, int i12) {
            int i13;
            int i14 = i12 + i11;
            for (int size = this.f11226c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f11226c.get(size);
                if (d0Var != null && (i13 = d0Var.mPosition) >= i11 && i13 < i14) {
                    d0Var.addFlags(2);
                    A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(d0 d0Var, boolean z11) {
            RecyclerView.s(d0Var);
            View view = d0Var.itemView;
            s sVar = RecyclerView.this.C0;
            if (sVar != null) {
                androidx.core.view.a n = sVar.n();
                androidx.core.view.a0.w0(view, n instanceof s.a ? ((s.a) n).n(view) : null);
            }
            if (z11) {
                g(d0Var);
            }
            d0Var.mBindingAdapter = null;
            d0Var.mOwnerRecyclerView = null;
            i().i(d0Var);
        }

        public void c() {
            this.f11224a.clear();
            z();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            int size = this.f11226c.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f11226c.get(i11).clearOldPosition();
            }
            int size2 = this.f11224a.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f11224a.get(i12).clearOldPosition();
            }
            ArrayList<d0> arrayList = this.f11225b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    this.f11225b.get(i13).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f11224a.clear();
            ArrayList<d0> arrayList = this.f11225b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i11) {
            if (i11 < 0 || i11 >= RecyclerView.this.f11153v0.b()) {
                throw new IndexOutOfBoundsException("invalid position " + i11 + ". State item count is " + RecyclerView.this.f11153v0.b() + RecyclerView.this.Q());
            } else if (!RecyclerView.this.f11153v0.e()) {
                return i11;
            } else {
                return RecyclerView.this.f11132d.m(i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void g(d0 d0Var) {
            w wVar = RecyclerView.this.n;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            int size = RecyclerView.this.f11141o.size();
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView.this.f11141o.get(i11).a(d0Var);
            }
            Adapter adapter = RecyclerView.this.f11138l;
            if (adapter != null) {
                adapter.onViewRecycled(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f11153v0 != null) {
                recyclerView.f11134f.q(d0Var);
            }
        }

        /* access modifiers changed from: package-private */
        public d0 h(int i11) {
            int size;
            int m11;
            ArrayList<d0> arrayList = this.f11225b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    d0 d0Var = this.f11225b.get(i13);
                    if (d0Var.wasReturnedFromScrap() || d0Var.getLayoutPosition() != i11) {
                        i13++;
                    } else {
                        d0Var.addFlags(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f11138l.hasStableIds() && (m11 = RecyclerView.this.f11132d.m(i11)) > 0 && m11 < RecyclerView.this.f11138l.getItemCount()) {
                    long itemId = RecyclerView.this.f11138l.getItemId(m11);
                    while (i12 < size) {
                        d0 d0Var2 = this.f11225b.get(i12);
                        if (d0Var2.wasReturnedFromScrap() || d0Var2.getItemId() != itemId) {
                            i12++;
                        } else {
                            d0Var2.addFlags(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public u i() {
            if (this.f11230g == null) {
                this.f11230g = new u();
            }
            return this.f11230g;
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f11224a.size();
        }

        public List<d0> k() {
            return this.f11227d;
        }

        /* access modifiers changed from: package-private */
        public d0 l(long j, int i11, boolean z11) {
            for (int size = this.f11224a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f11224a.get(size);
                if (d0Var.getItemId() == j && !d0Var.wasReturnedFromScrap()) {
                    if (i11 == d0Var.getItemViewType()) {
                        d0Var.addFlags(32);
                        if (d0Var.isRemoved() && !RecyclerView.this.f11153v0.e()) {
                            d0Var.setFlags(2, 14);
                        }
                        return d0Var;
                    } else if (!z11) {
                        this.f11224a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.itemView, false);
                        y(d0Var.itemView);
                    }
                }
            }
            int size2 = this.f11226c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = this.f11226c.get(size2);
                if (d0Var2.getItemId() == j && !d0Var2.isAttachedToTransitionOverlay()) {
                    if (i11 == d0Var2.getItemViewType()) {
                        if (!z11) {
                            this.f11226c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z11) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public d0 m(int i11, boolean z11) {
            View e11;
            int size = this.f11224a.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                d0 d0Var = this.f11224a.get(i13);
                if (d0Var.wasReturnedFromScrap() || d0Var.getLayoutPosition() != i11 || d0Var.isInvalid() || (!RecyclerView.this.f11153v0.f11171h && d0Var.isRemoved())) {
                    i13++;
                } else {
                    d0Var.addFlags(32);
                    return d0Var;
                }
            }
            if (z11 || (e11 = RecyclerView.this.f11133e.e(i11)) == null) {
                int size2 = this.f11226c.size();
                while (i12 < size2) {
                    d0 d0Var2 = this.f11226c.get(i12);
                    if (d0Var2.isInvalid() || d0Var2.getLayoutPosition() != i11 || d0Var2.isAttachedToTransitionOverlay()) {
                        i12++;
                    } else {
                        if (!z11) {
                            this.f11226c.remove(i12);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 i02 = RecyclerView.i0(e11);
            RecyclerView.this.f11133e.s(e11);
            int m11 = RecyclerView.this.f11133e.m(e11);
            if (m11 != -1) {
                RecyclerView.this.f11133e.d(m11);
                D(e11);
                i02.addFlags(8224);
                return i02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + i02 + RecyclerView.this.Q());
        }

        /* access modifiers changed from: package-private */
        public View n(int i11) {
            return this.f11224a.get(i11).itemView;
        }

        public View o(int i11) {
            return p(i11, false);
        }

        /* access modifiers changed from: package-private */
        public View p(int i11, boolean z11) {
            return I(i11, z11, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: package-private */
        public void s() {
            int size = this.f11226c.size();
            for (int i11 = 0; i11 < size; i11++) {
                p pVar = (p) this.f11226c.get(i11).itemView.getLayoutParams();
                if (pVar != null) {
                    pVar.f11216c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void t() {
            int size = this.f11226c.size();
            for (int i11 = 0; i11 < size; i11++) {
                d0 d0Var = this.f11226c.get(i11);
                if (d0Var != null) {
                    d0Var.addFlags(6);
                    d0Var.addChangePayload((Object) null);
                }
            }
            Adapter adapter = RecyclerView.this.f11138l;
            if (adapter == null || !adapter.hasStableIds()) {
                z();
            }
        }

        /* access modifiers changed from: package-private */
        public void u(int i11, int i12) {
            int size = this.f11226c.size();
            for (int i13 = 0; i13 < size; i13++) {
                d0 d0Var = this.f11226c.get(i13);
                if (d0Var != null && d0Var.mPosition >= i11) {
                    d0Var.offsetPosition(i12, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void v(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            if (i11 < i12) {
                i15 = -1;
                i14 = i11;
                i13 = i12;
            } else {
                i15 = 1;
                i13 = i11;
                i14 = i12;
            }
            int size = this.f11226c.size();
            for (int i17 = 0; i17 < size; i17++) {
                d0 d0Var = this.f11226c.get(i17);
                if (d0Var != null && (i16 = d0Var.mPosition) >= i14 && i16 <= i13) {
                    if (i16 == i11) {
                        d0Var.offsetPosition(i12 - i11, false);
                    } else {
                        d0Var.offsetPosition(i15, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void w(int i11, int i12, boolean z11) {
            int i13 = i11 + i12;
            for (int size = this.f11226c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f11226c.get(size);
                if (d0Var != null) {
                    int i14 = d0Var.mPosition;
                    if (i14 >= i13) {
                        d0Var.offsetPosition(-i12, z11);
                    } else if (i14 >= i11) {
                        d0Var.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void x(Adapter adapter, Adapter adapter2, boolean z11) {
            c();
            i().h(adapter, adapter2, z11);
        }

        /* access modifiers changed from: package-private */
        public void y(View view) {
            d0 i02 = RecyclerView.i0(view);
            i02.mScrapContainer = null;
            i02.mInChangeScrap = false;
            i02.clearReturnedFromScrapFlag();
            C(i02);
        }

        /* access modifiers changed from: package-private */
        public void z() {
            for (int size = this.f11226c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f11226c.clear();
            if (RecyclerView.T0) {
                RecyclerView.this.f11152u0.b();
            }
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    private class x extends i {
        x() {
        }

        public void a() {
            RecyclerView.this.p((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f11153v0.f11170g = true;
            recyclerView.T0(true);
            if (!RecyclerView.this.f11132d.p()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void c(int i11, int i12, Object obj) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.f11132d.r(i11, i12, obj)) {
                h();
            }
        }

        public void d(int i11, int i12) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.f11132d.s(i11, i12)) {
                h();
            }
        }

        public void e(int i11, int i12, int i13) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.f11132d.t(i11, i12, i13)) {
                h();
            }
        }

        public void f(int i11, int i12) {
            RecyclerView.this.p((String) null);
            if (RecyclerView.this.f11132d.u(i11, i12)) {
                h();
            }
        }

        public void g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f11130c != null && (adapter = recyclerView.f11138l) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            if (RecyclerView.S0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.t && recyclerView.f11148s) {
                    androidx.core.view.a0.o0(recyclerView, recyclerView.f11136h);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.B = true;
            recyclerView2.requestLayout();
        }
    }

    public static class y implements s {
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        public void c(boolean z11) {
        }
    }

    public static abstract class z {

        /* renamed from: a  reason: collision with root package name */
        private int f11233a = -1;

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f11234b;

        /* renamed from: c  reason: collision with root package name */
        private o f11235c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11236d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f11237e;

        /* renamed from: f  reason: collision with root package name */
        private View f11238f;

        /* renamed from: g  reason: collision with root package name */
        private final a f11239g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        private boolean f11240h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f11241a;

            /* renamed from: b  reason: collision with root package name */
            private int f11242b;

            /* renamed from: c  reason: collision with root package name */
            private int f11243c;

            /* renamed from: d  reason: collision with root package name */
            private int f11244d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f11245e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f11246f;

            /* renamed from: g  reason: collision with root package name */
            private int f11247g;

            public a(int i11, int i12) {
                this(i11, i12, Integer.MIN_VALUE, (Interpolator) null);
            }

            private void e() {
                if (this.f11245e != null && this.f11243c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f11243c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a() {
                return this.f11244d >= 0;
            }

            public void b(int i11) {
                this.f11244d = i11;
            }

            /* access modifiers changed from: package-private */
            public void c(RecyclerView recyclerView) {
                int i11 = this.f11244d;
                if (i11 >= 0) {
                    this.f11244d = -1;
                    recyclerView.z0(i11);
                    this.f11246f = false;
                } else if (this.f11246f) {
                    e();
                    recyclerView.f11149s0.e(this.f11241a, this.f11242b, this.f11243c, this.f11245e);
                    int i12 = this.f11247g + 1;
                    this.f11247g = i12;
                    if (i12 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f11246f = false;
                } else {
                    this.f11247g = 0;
                }
            }

            public void d(int i11, int i12, int i13, Interpolator interpolator) {
                this.f11241a = i11;
                this.f11242b = i12;
                this.f11243c = i13;
                this.f11245e = interpolator;
                this.f11246f = true;
            }

            public a(int i11, int i12, int i13, Interpolator interpolator) {
                this.f11244d = -1;
                this.f11246f = false;
                this.f11247g = 0;
                this.f11241a = i11;
                this.f11242b = i12;
                this.f11243c = i13;
                this.f11245e = interpolator;
            }
        }

        public interface b {
            PointF a(int i11);
        }

        public PointF a(int i11) {
            o e11 = e();
            if (e11 instanceof b) {
                return ((b) e11).a(i11);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i11) {
            return this.f11234b.f11139m.N(i11);
        }

        public int c() {
            return this.f11234b.f11139m.U();
        }

        public int d(View view) {
            return this.f11234b.g0(view);
        }

        public o e() {
            return this.f11235c;
        }

        public int f() {
            return this.f11233a;
        }

        public boolean g() {
            return this.f11236d;
        }

        public boolean h() {
            return this.f11237e;
        }

        /* access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f11 = pointF.x;
            float f12 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f11 * f11) + (f12 * f12)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        public void j(int i11, int i12) {
            PointF a11;
            RecyclerView recyclerView = this.f11234b;
            if (this.f11233a == -1 || recyclerView == null) {
                r();
            }
            if (this.f11236d && this.f11238f == null && this.f11235c != null && (a11 = a(this.f11233a)) != null) {
                float f11 = a11.x;
                if (!(f11 == 0.0f && a11.y == 0.0f)) {
                    recyclerView.l1((int) Math.signum(f11), (int) Math.signum(a11.y), (int[]) null);
                }
            }
            this.f11236d = false;
            View view = this.f11238f;
            if (view != null) {
                if (d(view) == this.f11233a) {
                    o(this.f11238f, recyclerView.f11153v0, this.f11239g);
                    this.f11239g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f11238f = null;
                }
            }
            if (this.f11237e) {
                l(i11, i12, recyclerView.f11153v0, this.f11239g);
                boolean a12 = this.f11239g.a();
                this.f11239g.c(recyclerView);
                if (a12 && this.f11237e) {
                    this.f11236d = true;
                    recyclerView.f11149s0.d();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void k(View view) {
            if (d(view) == f()) {
                this.f11238f = view;
            }
        }

        /* access modifiers changed from: protected */
        public abstract void l(int i11, int i12, a0 a0Var, a aVar);

        /* access modifiers changed from: protected */
        public abstract void m();

        /* access modifiers changed from: protected */
        public abstract void n();

        /* access modifiers changed from: protected */
        public abstract void o(View view, a0 a0Var, a aVar);

        public void p(int i11) {
            this.f11233a = i11;
        }

        /* access modifiers changed from: package-private */
        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f11149s0.f();
            if (this.f11240h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f11234b = recyclerView;
            this.f11235c = oVar;
            int i11 = this.f11233a;
            if (i11 != -1) {
                recyclerView.f11153v0.f11164a = i11;
                this.f11237e = true;
                this.f11236d = true;
                this.f11238f = b(f());
                m();
                this.f11234b.f11149s0.d();
                this.f11240h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        public final void r() {
            if (this.f11237e) {
                this.f11237e = false;
                n();
                this.f11234b.f11153v0.f11164a = -1;
                this.f11238f = null;
                this.f11233a = -1;
                this.f11236d = false;
                this.f11235c.n1(this);
                this.f11235c = null;
                this.f11234b = null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            P0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            Q0 = r3
            r2 = 23
            if (r1 < r2) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            R0 = r1
            S0 = r0
            T0 = r0
            U0 = r3
            V0 = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            W0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            X0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A1() {
        this.f11149s0.f();
        o oVar = this.f11139m;
        if (oVar != null) {
            oVar.T1();
        }
    }

    private void B() {
        int i11 = this.A;
        this.A = 0;
        if (i11 != 0 && w0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            androidx.core.view.accessibility.b.b(obtain, i11);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void C0(int i11, int i12, MotionEvent motionEvent, int i13) {
        o oVar = this.f11139m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f11158y) {
            int[] iArr = this.I0;
            int i14 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean m11 = oVar.m();
            boolean l11 = this.f11139m.l();
            w1(l11 ? m11 | true : m11 ? 1 : 0, i13);
            if (G(m11 ? i11 : 0, l11 ? i12 : 0, this.I0, this.G0, i13)) {
                int[] iArr2 = this.I0;
                i11 -= iArr2[0];
                i12 -= iArr2[1];
            }
            int i15 = m11 ? i11 : 0;
            if (l11) {
                i14 = i12;
            }
            k1(i15, i14, motionEvent, i13);
            j jVar = this.f11150t0;
            if (!(jVar == null || (i11 == 0 && i12 == 0))) {
                jVar.f(this, i11, i12);
            }
            y1(i13);
        }
    }

    private void D() {
        boolean z11 = true;
        this.f11153v0.a(1);
        R(this.f11153v0);
        this.f11153v0.j = false;
        v1();
        this.f11134f.f();
        K0();
        S0();
        i1();
        a0 a0Var = this.f11153v0;
        if (!a0Var.k || !this.f11161z0) {
            z11 = false;
        }
        a0Var.f11172i = z11;
        this.f11161z0 = false;
        this.f11159y0 = false;
        a0Var.f11171h = a0Var.f11173l;
        a0Var.f11169f = this.f11138l.getItemCount();
        W(this.E0);
        if (this.f11153v0.k) {
            int g11 = this.f11133e.g();
            for (int i11 = 0; i11 < g11; i11++) {
                d0 i02 = i0(this.f11133e.f(i11));
                if (!i02.shouldIgnore() && (!i02.isInvalid() || this.f11138l.hasStableIds())) {
                    this.f11134f.e(i02, this.O.recordPreLayoutInformation(this.f11153v0, i02, l.buildAdapterChangeFlagsForAnimations(i02), i02.getUnmodifiedPayloads()));
                    if (this.f11153v0.f11172i && i02.isUpdated() && !i02.isRemoved() && !i02.shouldIgnore() && !i02.isInvalid()) {
                        this.f11134f.c(e0(i02), i02);
                    }
                }
            }
        }
        if (this.f11153v0.f11173l) {
            j1();
            a0 a0Var2 = this.f11153v0;
            boolean z12 = a0Var2.f11170g;
            a0Var2.f11170g = false;
            this.f11139m.f1(this.f11129b, a0Var2);
            this.f11153v0.f11170g = z12;
            for (int i12 = 0; i12 < this.f11133e.g(); i12++) {
                d0 i03 = i0(this.f11133e.f(i12));
                if (!i03.shouldIgnore() && !this.f11134f.i(i03)) {
                    int buildAdapterChangeFlagsForAnimations = l.buildAdapterChangeFlagsForAnimations(i03);
                    boolean hasAnyOfTheFlags = i03.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    l.c recordPreLayoutInformation = this.O.recordPreLayoutInformation(this.f11153v0, i03, buildAdapterChangeFlagsForAnimations, i03.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        V0(i03, recordPreLayoutInformation);
                    } else {
                        this.f11134f.a(i03, recordPreLayoutInformation);
                    }
                }
            }
            t();
        } else {
            t();
        }
        L0();
        x1(false);
        this.f11153v0.f11168e = 2;
    }

    private void E() {
        v1();
        K0();
        this.f11153v0.a(6);
        this.f11132d.j();
        this.f11153v0.f11169f = this.f11138l.getItemCount();
        this.f11153v0.f11167d = 0;
        if (this.f11130c != null && this.f11138l.canRestoreState()) {
            Parcelable parcelable = this.f11130c.f11162c;
            if (parcelable != null) {
                this.f11139m.k1(parcelable);
            }
            this.f11130c = null;
        }
        a0 a0Var = this.f11153v0;
        a0Var.f11171h = false;
        this.f11139m.f1(this.f11129b, a0Var);
        a0 a0Var2 = this.f11153v0;
        a0Var2.f11170g = false;
        a0Var2.k = a0Var2.k && this.O != null;
        a0Var2.f11168e = 4;
        L0();
        x1(false);
    }

    private void F() {
        this.f11153v0.a(4);
        v1();
        K0();
        a0 a0Var = this.f11153v0;
        a0Var.f11168e = 1;
        if (a0Var.k) {
            for (int g11 = this.f11133e.g() - 1; g11 >= 0; g11--) {
                d0 i02 = i0(this.f11133e.f(g11));
                if (!i02.shouldIgnore()) {
                    long e02 = e0(i02);
                    l.c recordPostLayoutInformation = this.O.recordPostLayoutInformation(this.f11153v0, i02);
                    d0 g12 = this.f11134f.g(e02);
                    if (g12 == null || g12.shouldIgnore()) {
                        this.f11134f.d(i02, recordPostLayoutInformation);
                    } else {
                        boolean h11 = this.f11134f.h(g12);
                        boolean h12 = this.f11134f.h(i02);
                        if (!h11 || g12 != i02) {
                            l.c n11 = this.f11134f.n(g12);
                            this.f11134f.d(i02, recordPostLayoutInformation);
                            l.c m11 = this.f11134f.m(i02);
                            if (n11 == null) {
                                o0(e02, i02, g12);
                            } else {
                                n(g12, i02, n11, m11, h11, h12);
                            }
                        } else {
                            this.f11134f.d(i02, recordPostLayoutInformation);
                        }
                    }
                }
            }
            this.f11134f.o(this.O0);
        }
        this.f11139m.u1(this.f11129b);
        a0 a0Var2 = this.f11153v0;
        a0Var2.f11166c = a0Var2.f11169f;
        this.E = false;
        this.F = false;
        a0Var2.k = false;
        a0Var2.f11173l = false;
        this.f11139m.f11201h = false;
        ArrayList<d0> arrayList = this.f11129b.f11225b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f11139m;
        if (oVar.n) {
            oVar.f11204m = 0;
            oVar.n = false;
            this.f11129b.K();
        }
        this.f11139m.g1(this.f11153v0);
        L0();
        x1(false);
        this.f11134f.f();
        int[] iArr = this.E0;
        if (y(iArr[0], iArr[1])) {
            J(0, 0);
        }
        W0();
        g1();
    }

    private boolean L(MotionEvent motionEvent) {
        s sVar = this.f11146r;
        if (sVar != null) {
            sVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f11146r = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return V(motionEvent);
        }
    }

    private void N0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Q) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.Q = motionEvent.getPointerId(i11);
            int x11 = (int) (motionEvent.getX(i11) + 0.5f);
            this.U = x11;
            this.S = x11;
            int y11 = (int) (motionEvent.getY(i11) + 0.5f);
            this.V = y11;
            this.T = y11;
        }
    }

    private boolean R0() {
        return this.O != null && this.f11139m.U1();
    }

    private void S0() {
        boolean z11;
        if (this.E) {
            this.f11132d.y();
            if (this.F) {
                this.f11139m.a1(this);
            }
        }
        if (R0()) {
            this.f11132d.w();
        } else {
            this.f11132d.j();
        }
        boolean z12 = false;
        boolean z13 = this.f11159y0 || this.f11161z0;
        this.f11153v0.k = this.v && this.O != null && ((z11 = this.E) || z13 || this.f11139m.f11201h) && (!z11 || this.f11138l.hasStableIds());
        a0 a0Var = this.f11153v0;
        if (a0Var.k && z13 && !this.E && R0()) {
            z12 = true;
        }
        a0Var.f11173l = z12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void U0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.N()
            android.widget.EdgeEffect r3 = r6.K
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.f.c(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.O()
            android.widget.EdgeEffect r3 = r6.M
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.f.c(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.P()
            android.widget.EdgeEffect r9 = r6.L
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.f.c(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.M()
            android.widget.EdgeEffect r9 = r6.N
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.f.c(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.view.a0.n0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.U0(float, float, float, float):void");
    }

    private boolean V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.q.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar = this.q.get(i11);
            if (!sVar.b(this, motionEvent) || action == 3) {
                i11++;
            } else {
                this.f11146r = sVar;
                return true;
            }
        }
        return false;
    }

    private void W(int[] iArr) {
        int g11 = this.f11133e.g();
        if (g11 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < g11; i13++) {
            d0 i02 = i0(this.f11133e.f(i13));
            if (!i02.shouldIgnore()) {
                int layoutPosition = i02.getLayoutPosition();
                if (layoutPosition < i11) {
                    i11 = layoutPosition;
                }
                if (layoutPosition > i12) {
                    i12 = layoutPosition;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    private void W0() {
        View findViewById;
        if (this.f11147r0 && this.f11138l != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!V0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f11133e.n(focusedChild)) {
                            return;
                        }
                    } else if (this.f11133e.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                d0 a02 = (this.f11153v0.n == -1 || !this.f11138l.hasStableIds()) ? null : a0(this.f11153v0.n);
                if (a02 != null && !this.f11133e.n(a02.itemView) && a02.itemView.hasFocusable()) {
                    view = a02.itemView;
                } else if (this.f11133e.g() > 0) {
                    view = Y();
                }
                if (view != null) {
                    int i11 = this.f11153v0.f11175o;
                    if (!(((long) i11) == -1 || (findViewById = view.findViewById(i11)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    static RecyclerView X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView X = X(viewGroup.getChildAt(i11));
            if (X != null) {
                return X;
            }
        }
        return null;
    }

    private void X0() {
        boolean z11;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z11 = this.K.isFinished();
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = this.L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z11 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z11 |= this.N.isFinished();
        }
        if (z11) {
            androidx.core.view.a0.n0(this);
        }
    }

    private View Y() {
        d0 Z;
        a0 a0Var = this.f11153v0;
        int i11 = a0Var.f11174m;
        if (i11 == -1) {
            i11 = 0;
        }
        int b11 = a0Var.b();
        int i12 = i11;
        while (i12 < b11) {
            d0 Z2 = Z(i12);
            if (Z2 == null) {
                break;
            } else if (Z2.itemView.hasFocusable()) {
                return Z2.itemView;
            } else {
                i12++;
            }
        }
        int min = Math.min(b11, i11);
        while (true) {
            min--;
            if (min < 0 || (Z = Z(min)) == null) {
                return null;
            }
            if (Z.itemView.hasFocusable()) {
                return Z.itemView;
            }
        }
    }

    private void f1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f11137i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f11216c) {
                Rect rect = pVar.f11215b;
                Rect rect2 = this.f11137i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f11137i);
            offsetRectIntoDescendantCoords(view, this.f11137i);
        }
        this.f11139m.B1(this, view, this.f11137i, !this.v, view2 == null);
    }

    private void g(d0 d0Var) {
        View view = d0Var.itemView;
        boolean z11 = view.getParent() == this;
        this.f11129b.J(h0(view));
        if (d0Var.isTmpDetached()) {
            this.f11133e.c(view, -1, view.getLayoutParams(), true);
        } else if (!z11) {
            this.f11133e.b(view, true);
        } else {
            this.f11133e.k(view);
        }
    }

    private void g1() {
        a0 a0Var = this.f11153v0;
        a0Var.n = -1;
        a0Var.f11174m = -1;
        a0Var.f11175o = -1;
    }

    private androidx.core.view.p getScrollingChildHelper() {
        if (this.F0 == null) {
            this.F0 = new androidx.core.view.p(this);
        }
        return this.F0;
    }

    private void h1() {
        VelocityTracker velocityTracker = this.R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        y1(0);
        X0();
    }

    static d0 i0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f11214a;
    }

    private void i1() {
        int i11;
        d0 d0Var = null;
        View focusedChild = (!this.f11147r0 || !hasFocus() || this.f11138l == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = U(focusedChild);
        }
        if (d0Var == null) {
            g1();
            return;
        }
        this.f11153v0.n = this.f11138l.hasStableIds() ? d0Var.getItemId() : -1;
        a0 a0Var = this.f11153v0;
        if (this.E) {
            i11 = -1;
        } else if (d0Var.isRemoved()) {
            i11 = d0Var.mOldPosition;
        } else {
            i11 = d0Var.getAbsoluteAdapterPosition();
        }
        a0Var.f11174m = i11;
        this.f11153v0.f11175o = k0(d0Var.itemView);
    }

    static void j0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f11215b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int k0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String l0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private void n(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z11, boolean z12) {
        d0Var.setIsRecyclable(false);
        if (z11) {
            g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z12) {
                g(d0Var2);
            }
            d0Var.mShadowedHolder = d0Var2;
            g(d0Var);
            this.f11129b.J(d0Var);
            d0Var2.setIsRecyclable(false);
            d0Var2.mShadowingHolder = d0Var;
        }
        if (this.O.animateChange(d0Var, d0Var2, cVar, cVar2)) {
            Q0();
        }
    }

    private void n1(Adapter adapter, boolean z11, boolean z12) {
        Adapter adapter2 = this.f11138l;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f11128a);
            this.f11138l.onDetachedFromRecyclerView(this);
        }
        if (!z11 || z12) {
            Y0();
        }
        this.f11132d.y();
        Adapter adapter3 = this.f11138l;
        this.f11138l = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f11128a);
            adapter.onAttachedToRecyclerView(this);
        }
        o oVar = this.f11139m;
        if (oVar != null) {
            oVar.M0(adapter3, this.f11138l);
        }
        this.f11129b.x(adapter3, this.f11138l, z11);
        this.f11153v0.f11170g = true;
    }

    private void o0(long j11, d0 d0Var, d0 d0Var2) {
        int g11 = this.f11133e.g();
        for (int i11 = 0; i11 < g11; i11++) {
            d0 i02 = i0(this.f11133e.f(i11));
            if (i02 != d0Var && e0(i02) == j11) {
                Adapter adapter = this.f11138l;
                if (adapter == null || !adapter.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + i02 + " \n View Holder 2:" + d0Var + Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + i02 + " \n View Holder 2:" + d0Var + Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + Q());
    }

    private boolean q0() {
        int g11 = this.f11133e.g();
        for (int i11 = 0; i11 < g11; i11++) {
            d0 i02 = i0(this.f11133e.f(i11));
            if (i02 != null && !i02.shouldIgnore() && i02.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void r() {
        h1();
        setScrollState(0);
    }

    static void s(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d0Var.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.mNestedRecyclerView = null;
        }
    }

    @SuppressLint({"InlinedApi"})
    private void s0() {
        if (androidx.core.view.a0.E(this) == 0) {
            androidx.core.view.a0.I0(this, 8);
        }
    }

    private void t0() {
        this.f11133e = new f(new e());
    }

    private void w(Context context, String str, AttributeSet attributeSet, int i11, int i12) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String l02 = l0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(l02, false, classLoader).asSubclass(o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(W0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i11), Integer.valueOf(i12)};
                    } catch (NoSuchMethodException e11) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e12) {
                    e12.initCause(e11);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + l02, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + l02, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + l02, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + l02, e15);
                } catch (IllegalAccessException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + l02, e16);
                } catch (ClassCastException e17) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + l02, e17);
                }
            }
        }
    }

    private boolean y(int i11, int i12) {
        W(this.E0);
        int[] iArr = this.E0;
        return (iArr[0] == i11 && iArr[1] == i12) ? false : true;
    }

    private boolean y0(View view, View view2, int i11) {
        int i12;
        if (view2 == null || view2 == this || view2 == view || T(view2) == null) {
            return false;
        }
        if (view == null || T(view) == null) {
            return true;
        }
        this.f11137i.set(0, 0, view.getWidth(), view.getHeight());
        this.j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f11137i);
        offsetDescendantRectToMyCoords(view2, this.j);
        char c11 = 65535;
        int i13 = this.f11139m.k0() == 1 ? -1 : 1;
        Rect rect = this.f11137i;
        int i14 = rect.left;
        Rect rect2 = this.j;
        int i15 = rect2.left;
        if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i16 = rect.right;
            int i17 = rect2.right;
            i12 = ((i16 > i17 || i14 >= i17) && i14 > i15) ? -1 : 0;
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        if ((i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom) {
            c11 = 1;
        } else {
            int i21 = rect.bottom;
            int i22 = rect2.bottom;
            if ((i21 <= i22 && i18 < i22) || i18 <= i19) {
                c11 = 0;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 17) {
                    if (i11 != 33) {
                        if (i11 != 66) {
                            if (i11 != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i11 + Q());
                            } else if (c11 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i12 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c11 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i12 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c11 > 0 || (c11 == 0 && i12 * i13 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c11 < 0 || (c11 == 0 && i12 * i13 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void A(View view) {
        d0 i02 = i0(view);
        J0(view);
        Adapter adapter = this.f11138l;
        if (!(adapter == null || i02 == null)) {
            adapter.onViewDetachedFromWindow(i02);
        }
        List<q> list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D.get(size).a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void A0() {
        int j11 = this.f11133e.j();
        for (int i11 = 0; i11 < j11; i11++) {
            ((p) this.f11133e.i(i11).getLayoutParams()).f11216c = true;
        }
        this.f11129b.s();
    }

    /* access modifiers changed from: package-private */
    public void B0() {
        int j11 = this.f11133e.j();
        for (int i11 = 0; i11 < j11; i11++) {
            d0 i02 = i0(this.f11133e.i(i11));
            if (i02 != null && !i02.shouldIgnore()) {
                i02.addFlags(6);
            }
        }
        A0();
        this.f11129b.t();
    }

    /* access modifiers changed from: package-private */
    public void B1(int i11, int i12, Object obj) {
        int i13;
        int j11 = this.f11133e.j();
        int i14 = i11 + i12;
        for (int i15 = 0; i15 < j11; i15++) {
            View i16 = this.f11133e.i(i15);
            d0 i02 = i0(i16);
            if (i02 != null && !i02.shouldIgnore() && (i13 = i02.mPosition) >= i11 && i13 < i14) {
                i02.addFlags(2);
                i02.addChangePayload(obj);
                ((p) i16.getLayoutParams()).f11216c = true;
            }
        }
        this.f11129b.M(i11, i12);
    }

    /* access modifiers changed from: package-private */
    public void C() {
        if (this.f11138l == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f11139m == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f11153v0.j = false;
            boolean z11 = this.L0 && !(this.M0 == getWidth() && this.N0 == getHeight());
            this.M0 = 0;
            this.N0 = 0;
            this.L0 = false;
            if (this.f11153v0.f11168e == 1) {
                D();
                this.f11139m.I1(this);
                E();
            } else if (this.f11132d.q() || z11 || this.f11139m.v0() != getWidth() || this.f11139m.h0() != getHeight()) {
                this.f11139m.I1(this);
                E();
            } else {
                this.f11139m.I1(this);
            }
            F();
        }
    }

    public void D0(int i11) {
        int g11 = this.f11133e.g();
        for (int i12 = 0; i12 < g11; i12++) {
            this.f11133e.f(i12).offsetLeftAndRight(i11);
        }
    }

    public void E0(int i11) {
        int g11 = this.f11133e.g();
        for (int i12 = 0; i12 < g11; i12++) {
            this.f11133e.f(i12).offsetTopAndBottom(i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void F0(int i11, int i12) {
        int j11 = this.f11133e.j();
        for (int i13 = 0; i13 < j11; i13++) {
            d0 i02 = i0(this.f11133e.i(i13));
            if (i02 != null && !i02.shouldIgnore() && i02.mPosition >= i11) {
                i02.offsetPosition(i12, false);
                this.f11153v0.f11170g = true;
            }
        }
        this.f11129b.u(i11, i12);
        requestLayout();
    }

    public boolean G(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return getScrollingChildHelper().d(i11, i12, iArr, iArr2, i13);
    }

    /* access modifiers changed from: package-private */
    public void G0(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int j11 = this.f11133e.j();
        if (i11 < i12) {
            i15 = -1;
            i14 = i11;
            i13 = i12;
        } else {
            i13 = i11;
            i14 = i12;
            i15 = 1;
        }
        for (int i17 = 0; i17 < j11; i17++) {
            d0 i02 = i0(this.f11133e.i(i17));
            if (i02 != null && (i16 = i02.mPosition) >= i14 && i16 <= i13) {
                if (i16 == i11) {
                    i02.offsetPosition(i12 - i11, false);
                } else {
                    i02.offsetPosition(i15, false);
                }
                this.f11153v0.f11170g = true;
            }
        }
        this.f11129b.v(i11, i12);
        requestLayout();
    }

    public final void H(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        getScrollingChildHelper().e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    /* access modifiers changed from: package-private */
    public void H0(int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        int j11 = this.f11133e.j();
        for (int i14 = 0; i14 < j11; i14++) {
            d0 i02 = i0(this.f11133e.i(i14));
            if (i02 != null && !i02.shouldIgnore()) {
                int i15 = i02.mPosition;
                if (i15 >= i13) {
                    i02.offsetPosition(-i12, z11);
                    this.f11153v0.f11170g = true;
                } else if (i15 >= i11) {
                    i02.flagRemovedAndOffsetPosition(i11 - 1, -i12, z11);
                    this.f11153v0.f11170g = true;
                }
            }
        }
        this.f11129b.w(i11, i12, z11);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void I(int i11) {
        o oVar = this.f11139m;
        if (oVar != null) {
            oVar.m1(i11);
        }
        O0(i11);
        t tVar = this.f11155w0;
        if (tVar != null) {
            tVar.onScrollStateChanged(this, i11);
        }
        List<t> list = this.f11157x0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11157x0.get(size).onScrollStateChanged(this, i11);
            }
        }
    }

    public void I0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void J(int i11, int i12) {
        this.H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i11, scrollY - i12);
        P0(i11, i12);
        t tVar = this.f11155w0;
        if (tVar != null) {
            tVar.onScrolled(this, i11, i12);
        }
        List<t> list = this.f11157x0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f11157x0.get(size).onScrolled(this, i11, i12);
            }
        }
        this.H--;
    }

    public void J0(View view) {
    }

    /* access modifiers changed from: package-private */
    public void K() {
        int i11;
        for (int size = this.J0.size() - 1; size >= 0; size--) {
            d0 d0Var = this.J0.get(size);
            if (d0Var.itemView.getParent() == this && !d0Var.shouldIgnore() && (i11 = d0Var.mPendingAccessibilityState) != -1) {
                androidx.core.view.a0.H0(d0Var.itemView, i11);
                d0Var.mPendingAccessibilityState = -1;
            }
        }
        this.J0.clear();
    }

    /* access modifiers changed from: package-private */
    public void K0() {
        this.G++;
    }

    /* access modifiers changed from: package-private */
    public void L0() {
        M0(true);
    }

    /* access modifiers changed from: package-private */
    public void M() {
        if (this.N == null) {
            EdgeEffect a11 = this.I.a(this, 3);
            this.N = a11;
            if (this.f11135g) {
                a11.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a11.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void M0(boolean z11) {
        int i11 = this.G - 1;
        this.G = i11;
        if (i11 < 1) {
            this.G = 0;
            if (z11) {
                B();
                K();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void N() {
        if (this.K == null) {
            EdgeEffect a11 = this.I.a(this, 0);
            this.K = a11;
            if (this.f11135g) {
                a11.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a11.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O() {
        if (this.M == null) {
            EdgeEffect a11 = this.I.a(this, 2);
            this.M = a11;
            if (this.f11135g) {
                a11.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a11.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void O0(int i11) {
    }

    /* access modifiers changed from: package-private */
    public void P() {
        if (this.L == null) {
            EdgeEffect a11 = this.I.a(this, 1);
            this.L = a11;
            if (this.f11135g) {
                a11.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a11.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void P0(int i11, int i12) {
    }

    /* access modifiers changed from: package-private */
    public String Q() {
        return " " + super.toString() + ", adapter:" + this.f11138l + ", layout:" + this.f11139m + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    public void Q0() {
        if (!this.B0 && this.f11148s) {
            androidx.core.view.a0.o0(this, this.K0);
            this.B0 = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void R(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f11149s0.f11180c;
            a0Var.f11176p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f11176p = 0;
        a0Var.q = 0;
    }

    public View S(float f11, float f12) {
        for (int g11 = this.f11133e.g() - 1; g11 >= 0; g11--) {
            View f13 = this.f11133e.f(g11);
            float translationX = f13.getTranslationX();
            float translationY = f13.getTranslationY();
            if (f11 >= ((float) f13.getLeft()) + translationX && f11 <= ((float) f13.getRight()) + translationX && f12 >= ((float) f13.getTop()) + translationY && f12 <= ((float) f13.getBottom()) + translationY) {
                return f13;
            }
        }
        return null;
    }

    public View T(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void T0(boolean z11) {
        this.F = z11 | this.F;
        this.E = true;
        B0();
    }

    public d0 U(View view) {
        View T2 = T(view);
        if (T2 == null) {
            return null;
        }
        return h0(T2);
    }

    /* access modifiers changed from: package-private */
    public void V0(d0 d0Var, l.c cVar) {
        d0Var.setFlags(0, 8192);
        if (this.f11153v0.f11172i && d0Var.isUpdated() && !d0Var.isRemoved() && !d0Var.shouldIgnore()) {
            this.f11134f.c(e0(d0Var), d0Var);
        }
        this.f11134f.e(d0Var, cVar);
    }

    /* access modifiers changed from: package-private */
    public void Y0() {
        l lVar = this.O;
        if (lVar != null) {
            lVar.endAnimations();
        }
        o oVar = this.f11139m;
        if (oVar != null) {
            oVar.t1(this.f11129b);
            this.f11139m.u1(this.f11129b);
        }
        this.f11129b.c();
    }

    public d0 Z(int i11) {
        d0 d0Var = null;
        if (this.E) {
            return null;
        }
        int j11 = this.f11133e.j();
        for (int i12 = 0; i12 < j11; i12++) {
            d0 i02 = i0(this.f11133e.i(i12));
            if (i02 != null && !i02.isRemoved() && d0(i02) == i11) {
                if (!this.f11133e.n(i02.itemView)) {
                    return i02;
                }
                d0Var = i02;
            }
        }
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    public boolean Z0(View view) {
        v1();
        boolean r11 = this.f11133e.r(view);
        if (r11) {
            d0 i02 = i0(view);
            this.f11129b.J(i02);
            this.f11129b.C(i02);
        }
        x1(!r11);
        return r11;
    }

    public d0 a0(long j11) {
        Adapter adapter = this.f11138l;
        d0 d0Var = null;
        if (adapter != null && adapter.hasStableIds()) {
            int j12 = this.f11133e.j();
            for (int i11 = 0; i11 < j12; i11++) {
                d0 i02 = i0(this.f11133e.i(i11));
                if (i02 != null && !i02.isRemoved() && i02.getItemId() == j11) {
                    if (!this.f11133e.n(i02.itemView)) {
                        return i02;
                    }
                    d0Var = i02;
                }
            }
        }
        return d0Var;
    }

    public void a1(n nVar) {
        o oVar = this.f11139m;
        if (oVar != null) {
            oVar.t("Cannot remove item decoration during a scroll  or layout");
        }
        this.f11143p.remove(nVar);
        if (this.f11143p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        A0();
        requestLayout();
    }

    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        o oVar = this.f11139m;
        if (oVar == null || !oVar.N0(this, arrayList, i11, i12)) {
            super.addFocusables(arrayList, i11, i12);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i11, int i12) {
        if (i11 < 0) {
            N();
            if (this.K.isFinished()) {
                this.K.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            O();
            if (this.M.isFinished()) {
                this.M.onAbsorb(i11);
            }
        }
        if (i12 < 0) {
            P();
            if (this.L.isFinished()) {
                this.L.onAbsorb(-i12);
            }
        } else if (i12 > 0) {
            M();
            if (this.N.isFinished()) {
                this.N.onAbsorb(i12);
            }
        }
        if (i11 != 0 || i12 != 0) {
            androidx.core.view.a0.n0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public d0 b0(int i11, boolean z11) {
        int j11 = this.f11133e.j();
        d0 d0Var = null;
        for (int i12 = 0; i12 < j11; i12++) {
            d0 i02 = i0(this.f11133e.i(i12));
            if (i02 != null && !i02.isRemoved()) {
                if (z11) {
                    if (i02.mPosition != i11) {
                        continue;
                    }
                } else if (i02.getLayoutPosition() != i11) {
                    continue;
                }
                if (!this.f11133e.n(i02.itemView)) {
                    return i02;
                }
                d0Var = i02;
            }
        }
        return d0Var;
    }

    public void b1(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 < 0 || i11 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
        }
        a1(n0(i11));
    }

    public boolean c0(int i11, int i12) {
        o oVar = this.f11139m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f11158y) {
            return false;
        } else {
            boolean m11 = oVar.m();
            boolean l11 = this.f11139m.l();
            if (!m11 || Math.abs(i11) < this.f11140n0) {
                i11 = 0;
            }
            if (!l11 || Math.abs(i12) < this.f11140n0) {
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            float f11 = (float) i11;
            float f12 = (float) i12;
            if (!dispatchNestedPreFling(f11, f12)) {
                boolean z11 = m11 || l11;
                dispatchNestedFling(f11, f12, z11);
                r rVar = this.f11131c0;
                if (rVar != null && rVar.a(i11, i12)) {
                    return true;
                }
                if (z11) {
                    if (l11) {
                        m11 |= true;
                    }
                    w1(m11 ? 1 : 0, 1);
                    int i13 = this.f11142o0;
                    int max = Math.max(-i13, Math.min(i11, i13));
                    int i14 = this.f11142o0;
                    this.f11149s0.b(max, Math.max(-i14, Math.min(i12, i14)));
                    return true;
                }
            }
            return false;
        }
    }

    public void c1(s sVar) {
        this.q.remove(sVar);
        if (this.f11146r == sVar) {
            this.f11146r = null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f11139m.x((p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.f11139m;
        if (oVar != null && oVar.m()) {
            return this.f11139m.B(this.f11153v0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.f11139m;
        if (oVar != null && oVar.m()) {
            return this.f11139m.C(this.f11153v0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.f11139m;
        if (oVar != null && oVar.m()) {
            return this.f11139m.D(this.f11153v0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.f11139m;
        if (oVar != null && oVar.l()) {
            return this.f11139m.E(this.f11153v0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.f11139m;
        if (oVar != null && oVar.l()) {
            return this.f11139m.F(this.f11153v0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.f11139m;
        if (oVar != null && oVar.l()) {
            return this.f11139m.G(this.f11153v0);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int d0(d0 d0Var) {
        if (d0Var.hasAnyOfTheFlags(524) || !d0Var.isBound()) {
            return -1;
        }
        return this.f11132d.e(d0Var.mPosition);
    }

    public void d1(t tVar) {
        List<t> list = this.f11157x0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return getScrollingChildHelper().a(f11, f12, z11);
    }

    public boolean dispatchNestedPreFling(float f11, float f12) {
        return getScrollingChildHelper().b(f11, f12);
    }

    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i11, i12, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return getScrollingChildHelper().f(i11, i12, i13, i14, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z11;
        super.draw(canvas);
        int size = this.f11143p.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.f11143p.get(i11).i(canvas, this, this.f11153v0);
        }
        EdgeEffect edgeEffect = this.K;
        boolean z13 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z11 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f11135g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.K;
            z11 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f11135g) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.L;
            z11 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f11135g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.M;
            z11 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f11135g) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z12 = true;
            }
            z11 |= z12;
            canvas.restoreToCount(save4);
        }
        if (z11 || this.O == null || this.f11143p.size() <= 0 || !this.O.isRunning()) {
            z13 = z11;
        }
        if (z13) {
            androidx.core.view.a0.n0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(canvas, view, j11);
    }

    /* access modifiers changed from: package-private */
    public long e0(d0 d0Var) {
        return this.f11138l.hasStableIds() ? d0Var.getItemId() : (long) d0Var.mPosition;
    }

    /* access modifiers changed from: package-private */
    public void e1() {
        d0 d0Var;
        int g11 = this.f11133e.g();
        for (int i11 = 0; i11 < g11; i11++) {
            View f11 = this.f11133e.f(i11);
            d0 h02 = h0(f11);
            if (!(h02 == null || (d0Var = h02.mShadowingHolder) == null)) {
                View view = d0Var.itemView;
                int left = f11.getLeft();
                int top = f11.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public int f0(View view) {
        d0 i02 = i0(view);
        if (i02 != null) {
            return i02.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public View focusSearch(View view, int i11) {
        View view2;
        boolean z11;
        View Y0 = this.f11139m.Y0(view, i11);
        if (Y0 != null) {
            return Y0;
        }
        boolean z12 = true;
        boolean z13 = this.f11138l != null && this.f11139m != null && !x0() && !this.f11158y;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z13 || !(i11 == 2 || i11 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i11);
            if (findNextFocus != null || !z13) {
                view2 = findNextFocus;
            } else {
                v();
                if (T(view) == null) {
                    return null;
                }
                v1();
                view2 = this.f11139m.R0(view, i11, this.f11129b, this.f11153v0);
                x1(false);
            }
        } else {
            if (this.f11139m.l()) {
                int i12 = i11 == 2 ? 130 : 33;
                z11 = instance.findNextFocus(this, view, i12) == null;
                if (U0) {
                    i11 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.f11139m.m()) {
                int i13 = (this.f11139m.k0() == 1) ^ (i11 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i13) != null) {
                    z12 = false;
                }
                if (U0) {
                    i11 = i13;
                }
                z11 = z12;
            }
            if (z11) {
                v();
                if (T(view) == null) {
                    return null;
                }
                v1();
                this.f11139m.R0(view, i11, this.f11129b, this.f11153v0);
                x1(false);
            }
            view2 = instance.findNextFocus(this, view, i11);
        }
        if (view2 == null || view2.hasFocusable()) {
            return y0(view, view2, i11) ? view2 : super.focusSearch(view, i11);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i11);
        }
        f1(view2, (View) null);
        return view;
    }

    public int g0(View view) {
        d0 i02 = i0(view);
        if (i02 != null) {
            return i02.getLayoutPosition();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f11139m;
        if (oVar != null) {
            return oVar.O();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f11139m;
        if (oVar != null) {
            return oVar.P(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.f11138l;
    }

    public int getBaseline() {
        o oVar = this.f11139m;
        if (oVar != null) {
            return oVar.R();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i11, int i12) {
        j jVar = this.D0;
        if (jVar == null) {
            return super.getChildDrawingOrder(i11, i12);
        }
        return jVar.a(i11, i12);
    }

    public boolean getClipToPadding() {
        return this.f11135g;
    }

    public s getCompatAccessibilityDelegate() {
        return this.C0;
    }

    public k getEdgeEffectFactory() {
        return this.I;
    }

    public l getItemAnimator() {
        return this.O;
    }

    public int getItemDecorationCount() {
        return this.f11143p.size();
    }

    public o getLayoutManager() {
        return this.f11139m;
    }

    public int getMaxFlingVelocity() {
        return this.f11142o0;
    }

    public int getMinFlingVelocity() {
        return this.f11140n0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (T0) {
            return System.nanoTime();
        }
        return 0;
    }

    public r getOnFlingListener() {
        return this.f11131c0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f11147r0;
    }

    public u getRecycledViewPool() {
        return this.f11129b.i();
    }

    public int getScrollState() {
        return this.P;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    public d0 h0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return i0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i11) {
        o oVar = this.f11139m;
        if (oVar != null) {
            oVar.t("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f11143p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i11 < 0) {
            this.f11143p.add(nVar);
        } else {
            this.f11143p.add(i11, nVar);
        }
        A0();
        requestLayout();
    }

    public boolean isAttachedToWindow() {
        return this.f11148s;
    }

    public final boolean isLayoutSuppressed() {
        return this.f11158y;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(q qVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(qVar);
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        int j11 = this.f11133e.j();
        for (int i11 = 0; i11 < j11; i11++) {
            d0 i02 = i0(this.f11133e.i(i11));
            if (!i02.shouldIgnore()) {
                i02.saveOldPosition();
            }
        }
    }

    public void k(s sVar) {
        this.q.add(sVar);
    }

    /* access modifiers changed from: package-private */
    public boolean k1(int i11, int i12, MotionEvent motionEvent, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i11;
        int i19 = i12;
        MotionEvent motionEvent2 = motionEvent;
        v();
        if (this.f11138l != null) {
            int[] iArr = this.I0;
            iArr[0] = 0;
            iArr[1] = 0;
            l1(i18, i19, iArr);
            int[] iArr2 = this.I0;
            int i21 = iArr2[0];
            int i22 = iArr2[1];
            i17 = i22;
            i16 = i21;
            i15 = i18 - i21;
            i14 = i19 - i22;
        } else {
            i17 = 0;
            i16 = 0;
            i15 = 0;
            i14 = 0;
        }
        if (!this.f11143p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.I0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        H(i16, i17, i15, i14, this.G0, i13, iArr3);
        int[] iArr4 = this.I0;
        int i23 = i15 - iArr4[0];
        int i24 = i14 - iArr4[1];
        boolean z11 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i25 = this.U;
        int[] iArr5 = this.G0;
        this.U = i25 - iArr5[0];
        this.V -= iArr5[1];
        int[] iArr6 = this.H0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !androidx.core.view.n.c(motionEvent2, 8194)) {
                U0(motionEvent.getX(), (float) i23, motionEvent.getY(), (float) i24);
            }
            u(i11, i12);
        }
        if (!(i16 == 0 && i17 == 0)) {
            J(i16, i17);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z11 && i16 == 0 && i17 == 0) {
            return false;
        }
        return true;
    }

    public void l(t tVar) {
        if (this.f11157x0 == null) {
            this.f11157x0 = new ArrayList();
        }
        this.f11157x0.add(tVar);
    }

    /* access modifiers changed from: package-private */
    public void l1(int i11, int i12, int[] iArr) {
        v1();
        K0();
        androidx.core.os.l.a("RV Scroll");
        R(this.f11153v0);
        int F1 = i11 != 0 ? this.f11139m.F1(i11, this.f11129b, this.f11153v0) : 0;
        int H1 = i12 != 0 ? this.f11139m.H1(i12, this.f11129b, this.f11153v0) : 0;
        androidx.core.os.l.b();
        e1();
        L0();
        x1(false);
        if (iArr != null) {
            iArr[0] = F1;
            iArr[1] = H1;
        }
    }

    /* access modifiers changed from: package-private */
    public void m(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.setIsRecyclable(false);
        if (this.O.animateAppearance(d0Var, cVar, cVar2)) {
            Q0();
        }
    }

    /* access modifiers changed from: package-private */
    public Rect m0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f11216c) {
            return pVar.f11215b;
        }
        if (this.f11153v0.e() && (pVar.c() || pVar.e())) {
            return pVar.f11215b;
        }
        Rect rect = pVar.f11215b;
        rect.set(0, 0, 0, 0);
        int size = this.f11143p.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f11137i.set(0, 0, 0, 0);
            this.f11143p.get(i11).e(this.f11137i, view, this, this.f11153v0);
            int i12 = rect.left;
            Rect rect2 = this.f11137i;
            rect.left = i12 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f11216c = false;
        return rect;
    }

    public void m1(int i11) {
        if (!this.f11158y) {
            z1();
            o oVar = this.f11139m;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.G1(i11);
            awakenScrollBars();
        }
    }

    public n n0(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            return this.f11143p.get(i11);
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    /* access modifiers changed from: package-private */
    public void o(d0 d0Var, l.c cVar, l.c cVar2) {
        g(d0Var);
        d0Var.setIsRecyclable(false);
        if (this.O.animateDisappearance(d0Var, cVar, cVar2)) {
            Q0();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean o1(d0 d0Var, int i11) {
        if (x0()) {
            d0Var.mPendingAccessibilityState = i11;
            this.J0.add(d0Var);
            return false;
        }
        androidx.core.view.a0.H0(d0Var.itemView, i11);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = 0;
        boolean z11 = true;
        this.f11148s = true;
        if (!this.v || isLayoutRequested()) {
            z11 = false;
        }
        this.v = z11;
        o oVar = this.f11139m;
        if (oVar != null) {
            oVar.K(this);
        }
        this.B0 = false;
        if (T0) {
            ThreadLocal<j> threadLocal = j.f11422e;
            j jVar = threadLocal.get();
            this.f11150t0 = jVar;
            if (jVar == null) {
                this.f11150t0 = new j();
                Display y11 = androidx.core.view.a0.y(this);
                float f11 = 60.0f;
                if (!isInEditMode() && y11 != null) {
                    float refreshRate = y11.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f11 = refreshRate;
                    }
                }
                j jVar2 = this.f11150t0;
                jVar2.f11426c = (long) (1.0E9f / f11);
                threadLocal.set(jVar2);
            }
            this.f11150t0.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        j jVar;
        super.onDetachedFromWindow();
        l lVar = this.O;
        if (lVar != null) {
            lVar.endAnimations();
        }
        z1();
        this.f11148s = false;
        o oVar = this.f11139m;
        if (oVar != null) {
            oVar.L(this, this.f11129b);
        }
        this.J0.clear();
        removeCallbacks(this.K0);
        this.f11134f.j();
        if (T0 && (jVar = this.f11150t0) != null) {
            jVar.j(this);
            this.f11150t0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f11143p.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f11143p.get(i11).g(canvas, this, this.f11153v0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f11;
        float f12;
        if (this.f11139m != null && !this.f11158y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f12 = this.f11139m.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f11139m.m()) {
                    f11 = motionEvent.getAxisValue(10);
                    if (!(f12 == 0.0f && f11 == 0.0f)) {
                        C0((int) (f11 * this.f11144p0), (int) (f12 * this.f11145q0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f11139m.l()) {
                        f12 = -axisValue;
                    } else if (this.f11139m.m()) {
                        f11 = axisValue;
                        f12 = 0.0f;
                        C0((int) (f11 * this.f11144p0), (int) (f12 * this.f11145q0), motionEvent, 1);
                    }
                }
                f12 = 0.0f;
            }
            f11 = 0.0f;
            C0((int) (f11 * this.f11144p0), (int) (f12 * this.f11145q0), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.f11158y) {
            return false;
        }
        this.f11146r = null;
        if (V(motionEvent)) {
            r();
            return true;
        }
        o oVar = this.f11139m;
        if (oVar == null) {
            return false;
        }
        boolean m11 = oVar.m();
        boolean l11 = this.f11139m.l();
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f11160z) {
                this.f11160z = false;
            }
            this.Q = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.U = x11;
            this.S = x11;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.V = y11;
            this.T = y11;
            if (this.P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                y1(1);
            }
            int[] iArr = this.H0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l11) {
                m11 |= true;
            }
            w1(m11 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.R.clear();
            y1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.Q);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y12 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.P != 1) {
                int i11 = x12 - this.S;
                int i12 = y12 - this.T;
                if (!m11 || Math.abs(i11) <= this.W) {
                    z11 = false;
                } else {
                    this.U = x12;
                    z11 = true;
                }
                if (l11 && Math.abs(i12) > this.W) {
                    this.V = y12;
                    z11 = true;
                }
                if (z11) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            r();
        } else if (actionMasked == 5) {
            this.Q = motionEvent.getPointerId(actionIndex);
            int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.U = x13;
            this.S = x13;
            int y13 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.V = y13;
            this.T = y13;
        } else if (actionMasked == 6) {
            N0(motionEvent);
        }
        if (this.P == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        androidx.core.os.l.a("RV OnLayout");
        C();
        androidx.core.os.l.b();
        this.v = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        o oVar = this.f11139m;
        if (oVar == null) {
            x(i11, i12);
            return;
        }
        boolean z11 = false;
        if (oVar.z0()) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.f11139m.h1(this.f11129b, this.f11153v0, i11, i12);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z11 = true;
            }
            this.L0 = z11;
            if (!z11 && this.f11138l != null) {
                if (this.f11153v0.f11168e == 1) {
                    D();
                }
                this.f11139m.J1(i11, i12);
                this.f11153v0.j = true;
                E();
                this.f11139m.M1(i11, i12);
                if (this.f11139m.P1()) {
                    this.f11139m.J1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f11153v0.j = true;
                    E();
                    this.f11139m.M1(i11, i12);
                }
                this.M0 = getMeasuredWidth();
                this.N0 = getMeasuredHeight();
            }
        } else if (this.t) {
            this.f11139m.h1(this.f11129b, this.f11153v0, i11, i12);
        } else {
            if (this.B) {
                v1();
                K0();
                S0();
                L0();
                a0 a0Var = this.f11153v0;
                if (a0Var.f11173l) {
                    a0Var.f11171h = true;
                } else {
                    this.f11132d.j();
                    this.f11153v0.f11171h = false;
                }
                this.B = false;
                x1(false);
            } else if (this.f11153v0.f11173l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.f11138l;
            if (adapter != null) {
                this.f11153v0.f11169f = adapter.getItemCount();
            } else {
                this.f11153v0.f11169f = 0;
            }
            v1();
            this.f11139m.h1(this.f11129b, this.f11153v0, i11, i12);
            x1(false);
            this.f11153v0.f11171h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (x0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i11, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f11130c = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f11130c;
        if (savedState2 != null) {
            savedState.b(savedState2);
        } else {
            o oVar = this.f11139m;
            if (oVar != null) {
                savedState.f11162c = oVar.l1();
            } else {
                savedState.f11162c = null;
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13 || i12 != i14) {
            v0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f11158y
            r8 = 0
            if (r0 != 0) goto L_0x01df
            boolean r0 = r6.f11160z
            if (r0 == 0) goto L_0x000f
            goto L_0x01df
        L_0x000f:
            boolean r0 = r17.L(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.r()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f11139m
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.m()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f11139m
            boolean r11 = r0.l()
            android.view.VelocityTracker r0 = r6.R
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.R = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.H0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.H0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b3
            if (r0 == r9) goto L_0x0171
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d4
        L_0x0066:
            r17.N0(r18)
            goto L_0x01d4
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.Q = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.U = r0
            r6.S = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.V = r0
            r6.T = r0
            goto L_0x01d4
        L_0x0087:
            r17.r()
            goto L_0x01d4
        L_0x008c:
            int r0 = r6.Q
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.Q
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.U
            int r0 = r0 - r13
            int r1 = r6.V
            int r1 = r1 - r14
            int r2 = r6.P
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.W
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.W
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.W
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.W
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            r15 = r0
            r16 = r1
            int r0 = r6.P
            if (r0 != r9) goto L_0x01d4
            int[] r3 = r6.I0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x010c
            r1 = r15
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r2 = r16
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            int[] r4 = r6.G0
            r5 = 0
            r0 = r17
            boolean r0 = r0.G(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0140
            int[] r0 = r6.I0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.H0
            r1 = r0[r8]
            int[] r2 = r6.G0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0140:
            r0 = r16
            int[] r1 = r6.G0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.U = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.V = r14
            if (r10 == 0) goto L_0x0152
            r1 = r15
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            r2 = r0
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            boolean r1 = r6.k1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0165
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0165:
            androidx.recyclerview.widget.j r1 = r6.f11150t0
            if (r1 == 0) goto L_0x01d4
            if (r15 != 0) goto L_0x016d
            if (r0 == 0) goto L_0x01d4
        L_0x016d:
            r1.f(r6, r15, r0)
            goto L_0x01d4
        L_0x0171:
            android.view.VelocityTracker r0 = r6.R
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.R
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f11142o0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018d
            android.view.VelocityTracker r1 = r6.R
            int r2 = r6.Q
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            if (r11 == 0) goto L_0x019a
            android.view.VelocityTracker r2 = r6.R
            int r3 = r6.Q
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
        L_0x01a3:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.c0(r0, r1)
            if (r0 != 0) goto L_0x01ae
        L_0x01ab:
            r6.setScrollState(r8)
        L_0x01ae:
            r17.h1()
            r8 = 1
            goto L_0x01d4
        L_0x01b3:
            int r0 = r7.getPointerId(r8)
            r6.Q = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.U = r0
            r6.S = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.V = r0
            r6.T = r0
            if (r11 == 0) goto L_0x01d1
            r10 = r10 | 2
        L_0x01d1:
            r6.w1(r10, r8)
        L_0x01d4:
            if (r8 != 0) goto L_0x01db
            android.view.VelocityTracker r0 = r6.R
            r0.addMovement(r12)
        L_0x01db:
            r12.recycle()
            return r9
        L_0x01df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public void p(String str) {
        if (x0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + Q());
            }
            throw new IllegalStateException(str);
        } else if (this.H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + Q()));
        }
    }

    public boolean p0() {
        return !this.v || this.E || this.f11132d.p();
    }

    /* access modifiers changed from: package-private */
    public boolean p1(AccessibilityEvent accessibilityEvent) {
        int i11 = 0;
        if (!x0()) {
            return false;
        }
        int a11 = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
        if (a11 != 0) {
            i11 = a11;
        }
        this.A |= i11;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean q(d0 d0Var) {
        l lVar = this.O;
        return lVar == null || lVar.canReuseUpdatedViewHolder(d0Var, d0Var.getUnmodifiedPayloads());
    }

    public void q1(int i11, int i12) {
        r1(i11, i12, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        this.f11132d = new a(new f());
    }

    public void r1(int i11, int i12, Interpolator interpolator) {
        s1(i11, i12, interpolator, Integer.MIN_VALUE);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z11) {
        d0 i02 = i0(view);
        if (i02 != null) {
            if (i02.isTmpDetached()) {
                i02.clearTmpDetachFlag();
            } else if (!i02.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + i02 + Q());
            }
        }
        view.clearAnimation();
        A(view);
        super.removeDetachedView(view, z11);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f11139m.j1(this, this.f11153v0, view, view2) && view2 != null) {
            f1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        return this.f11139m.A1(this, view, rect, z11);
    }

    public void requestDisallowInterceptTouchEvent(boolean z11) {
        int size = this.q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.q.get(i11).c(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public void requestLayout() {
        if (this.f11154w != 0 || this.f11158y) {
            this.f11156x = true;
        } else {
            super.requestLayout();
        }
    }

    public void s1(int i11, int i12, Interpolator interpolator, int i13) {
        t1(i11, i12, interpolator, i13, false);
    }

    public void scrollBy(int i11, int i12) {
        o oVar = this.f11139m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f11158y) {
            boolean m11 = oVar.m();
            boolean l11 = this.f11139m.l();
            if (m11 || l11) {
                if (!m11) {
                    i11 = 0;
                }
                if (!l11) {
                    i12 = 0;
                }
                k1(i11, i12, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i11, int i12) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!p1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(s sVar) {
        this.C0 = sVar;
        androidx.core.view.a0.w0(this, sVar);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        n1(adapter, false, true);
        T0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != this.D0) {
            this.D0 = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public void setClipToPadding(boolean z11) {
        if (z11 != this.f11135g) {
            v0();
        }
        this.f11135g = z11;
        super.setClipToPadding(z11);
        if (this.v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.g.g(kVar);
        this.I = kVar;
        v0();
    }

    public void setHasFixedSize(boolean z11) {
        this.t = z11;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.O;
        if (lVar2 != null) {
            lVar2.endAnimations();
            this.O.setListener((l.b) null);
        }
        this.O = lVar;
        if (lVar != null) {
            lVar.setListener(this.A0);
        }
    }

    public void setItemViewCacheSize(int i11) {
        this.f11129b.G(i11);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z11) {
        suppressLayout(z11);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.f11139m) {
            z1();
            if (this.f11139m != null) {
                l lVar = this.O;
                if (lVar != null) {
                    lVar.endAnimations();
                }
                this.f11139m.t1(this.f11129b);
                this.f11139m.u1(this.f11129b);
                this.f11129b.c();
                if (this.f11148s) {
                    this.f11139m.L(this, this.f11129b);
                }
                this.f11139m.N1((RecyclerView) null);
                this.f11139m = null;
            } else {
                this.f11129b.c();
            }
            this.f11133e.o();
            this.f11139m = oVar;
            if (oVar != null) {
                if (oVar.f11195b == null) {
                    oVar.N1(this);
                    if (this.f11148s) {
                        this.f11139m.K(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f11195b.Q());
                }
            }
            this.f11129b.K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z11) {
        getScrollingChildHelper().m(z11);
    }

    public void setOnFlingListener(r rVar) {
        this.f11131c0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.f11155w0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z11) {
        this.f11147r0 = z11;
    }

    public void setRecycledViewPool(u uVar) {
        this.f11129b.E(uVar);
    }

    @Deprecated
    public void setRecyclerListener(w wVar) {
        this.n = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i11) {
        if (i11 != this.P) {
            this.P = i11;
            if (i11 != 2) {
                A1();
            }
            I(i11);
        }
    }

    public void setScrollingTouchSlop(int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i11 != 0) {
            if (i11 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i11 + "; using default value");
            } else {
                this.W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.f11129b.F(b0Var);
    }

    public boolean startNestedScroll(int i11) {
        return getScrollingChildHelper().o(i11);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public final void suppressLayout(boolean z11) {
        if (z11 != this.f11158y) {
            p("Do not suppressLayout in layout or scroll");
            if (!z11) {
                this.f11158y = false;
                if (!(!this.f11156x || this.f11139m == null || this.f11138l == null)) {
                    requestLayout();
                }
                this.f11156x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f11158y = true;
            this.f11160z = true;
            z1();
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        int j11 = this.f11133e.j();
        for (int i11 = 0; i11 < j11; i11++) {
            d0 i02 = i0(this.f11133e.i(i11));
            if (!i02.shouldIgnore()) {
                i02.clearOldPosition();
            }
        }
        this.f11129b.d();
    }

    /* access modifiers changed from: package-private */
    public void t1(int i11, int i12, Interpolator interpolator, int i13, boolean z11) {
        o oVar = this.f11139m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f11158y) {
            int i14 = 0;
            if (!oVar.m()) {
                i11 = 0;
            }
            if (!this.f11139m.l()) {
                i12 = 0;
            }
            if (i11 != 0 || i12 != 0) {
                if (i13 == Integer.MIN_VALUE || i13 > 0) {
                    if (z11) {
                        if (i11 != 0) {
                            i14 = 1;
                        }
                        if (i12 != 0) {
                            i14 |= 2;
                        }
                        w1(i14, 1);
                    }
                    this.f11149s0.e(i11, i12, i13, interpolator);
                    return;
                }
                scrollBy(i11, i12);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i11, int i12) {
        boolean z11;
        EdgeEffect edgeEffect = this.K;
        if (edgeEffect == null || edgeEffect.isFinished() || i11 <= 0) {
            z11 = false;
        } else {
            this.K.onRelease();
            z11 = this.K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i11 < 0) {
            this.M.onRelease();
            z11 |= this.M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i12 > 0) {
            this.L.onRelease();
            z11 |= this.L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i12 < 0) {
            this.N.onRelease();
            z11 |= this.N.isFinished();
        }
        if (z11) {
            androidx.core.view.a0.n0(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void u0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + Q());
        }
        Resources resources = getContext().getResources();
        new i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
    }

    public void u1(int i11) {
        if (!this.f11158y) {
            o oVar = this.f11139m;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.R1(this, this.f11153v0, i11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (!this.v || this.E) {
            androidx.core.os.l.a("RV FullInvalidate");
            C();
            androidx.core.os.l.b();
        } else if (this.f11132d.p()) {
            if (this.f11132d.o(4) && !this.f11132d.o(11)) {
                androidx.core.os.l.a("RV PartialInvalidate");
                v1();
                K0();
                this.f11132d.w();
                if (!this.f11156x) {
                    if (q0()) {
                        C();
                    } else {
                        this.f11132d.i();
                    }
                }
                x1(true);
                L0();
                androidx.core.os.l.b();
            } else if (this.f11132d.p()) {
                androidx.core.os.l.a("RV FullInvalidate");
                C();
                androidx.core.os.l.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v0() {
        this.N = null;
        this.L = null;
        this.M = null;
        this.K = null;
    }

    /* access modifiers changed from: package-private */
    public void v1() {
        int i11 = this.f11154w + 1;
        this.f11154w = i11;
        if (i11 == 1 && !this.f11158y) {
            this.f11156x = false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean w0() {
        AccessibilityManager accessibilityManager = this.C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean w1(int i11, int i12) {
        return getScrollingChildHelper().p(i11, i12);
    }

    /* access modifiers changed from: package-private */
    public void x(int i11, int i12) {
        setMeasuredDimension(o.y(i11, getPaddingLeft() + getPaddingRight(), androidx.core.view.a0.H(this)), o.y(i12, getPaddingTop() + getPaddingBottom(), androidx.core.view.a0.G(this)));
    }

    public boolean x0() {
        return this.G > 0;
    }

    /* access modifiers changed from: package-private */
    public void x1(boolean z11) {
        if (this.f11154w < 1) {
            this.f11154w = 1;
        }
        if (!z11 && !this.f11158y) {
            this.f11156x = false;
        }
        if (this.f11154w == 1) {
            if (z11 && this.f11156x && !this.f11158y && this.f11139m != null && this.f11138l != null) {
                C();
            }
            if (!this.f11158y) {
                this.f11156x = false;
            }
        }
        this.f11154w--;
    }

    public void y1(int i11) {
        getScrollingChildHelper().r(i11);
    }

    /* access modifiers changed from: package-private */
    public void z(View view) {
        d0 i02 = i0(view);
        I0(view);
        Adapter adapter = this.f11138l;
        if (!(adapter == null || i02 == null)) {
            adapter.onViewAttachedToWindow(i02);
        }
        List<q> list = this.D;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.D.get(size).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z0(int i11) {
        if (this.f11139m != null) {
            setScrollState(2);
            this.f11139m.G1(i11);
            awakenScrollBars();
        }
    }

    public void z1() {
        setScrollState(0);
        A1();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        Parcelable f11162c;

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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11162c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        public void b(SavedState savedState) {
            this.f11162c = savedState.f11162c;
        }

        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeParcelable(this.f11162c, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i12 = i11;
        this.f11128a = new x();
        this.f11129b = new v();
        this.f11134f = new x();
        this.f11136h = new a();
        this.f11137i = new Rect();
        this.j = new Rect();
        this.k = new RectF();
        this.f11141o = new ArrayList();
        this.f11143p = new ArrayList<>();
        this.q = new ArrayList<>();
        this.f11154w = 0;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = new k();
        this.O = new g();
        this.P = 0;
        this.Q = -1;
        this.f11144p0 = Float.MIN_VALUE;
        this.f11145q0 = Float.MIN_VALUE;
        this.f11147r0 = true;
        this.f11149s0 = new c0();
        this.f11152u0 = T0 ? new j.b() : null;
        this.f11153v0 = new a0();
        this.f11159y0 = false;
        this.f11161z0 = false;
        this.A0 = new m();
        this.B0 = false;
        this.E0 = new int[2];
        this.G0 = new int[2];
        this.H0 = new int[2];
        this.I0 = new int[2];
        this.J0 = new ArrayList();
        this.K0 = new b();
        this.M0 = 0;
        this.N0 = 0;
        this.O0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.W = viewConfiguration.getScaledTouchSlop();
        this.f11144p0 = androidx.core.view.c0.b(viewConfiguration, context2);
        this.f11145q0 = androidx.core.view.c0.e(viewConfiguration, context2);
        this.f11140n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11142o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.O.setListener(this.A0);
        r0();
        t0();
        s0();
        if (androidx.core.view.a0.D(this) == 0) {
            androidx.core.view.a0.H0(this, 1);
        }
        this.C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new s(this));
        int[] iArr = R.styleable.RecyclerView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i12, 0);
        androidx.core.view.a0.u0(this, context, iArr, attributeSet, obtainStyledAttributes, i11, 0);
        String string = obtainStyledAttributes.getString(R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f11135g = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_fastScrollEnabled, false);
        this.f11151u = z11;
        if (z11) {
            u0((StateListDrawable) obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        w(context, string, attributeSet, i11, 0);
        int[] iArr2 = P0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i12, 0);
        androidx.core.view.a0.u0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i11, 0);
        boolean z12 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z12);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        d0 f11214a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f11215b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        boolean f11216c = true;

        /* renamed from: d  reason: collision with root package name */
        boolean f11217d = false;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Deprecated
        public int a() {
            return this.f11214a.getBindingAdapterPosition();
        }

        public int b() {
            return this.f11214a.getLayoutPosition();
        }

        public boolean c() {
            return this.f11214a.isUpdated();
        }

        public boolean d() {
            return this.f11214a.isRemoved();
        }

        public boolean e() {
            return this.f11214a.isInvalid();
        }

        public p(int i11, int i12) {
            super(i11, i12);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(p pVar) {
            super(pVar);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f11139m;
        if (oVar != null) {
            return oVar.Q(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + Q());
    }
}
