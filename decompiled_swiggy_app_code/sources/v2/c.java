package v2;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.a0;
import java.util.Arrays;

/* compiled from: ViewDragHelper */
public class c {

    /* renamed from: x  reason: collision with root package name */
    private static final Interpolator f17274x = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f17275a;

    /* renamed from: b  reason: collision with root package name */
    private int f17276b;

    /* renamed from: c  reason: collision with root package name */
    private int f17277c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f17278d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f17279e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f17280f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f17281g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f17282h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f17283i;
    private int[] j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f17284l;

    /* renamed from: m  reason: collision with root package name */
    private float f17285m;
    private float n;

    /* renamed from: o  reason: collision with root package name */
    private int f17286o;

    /* renamed from: p  reason: collision with root package name */
    private final int f17287p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private OverScroller f17288r;

    /* renamed from: s  reason: collision with root package name */
    private final C0200c f17289s;
    private View t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f17290u;
    private final ViewGroup v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f17291w = new b();

    /* compiled from: ViewDragHelper */
    class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper */
    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.K(0);
        }
    }

    /* renamed from: v2.c$c  reason: collision with other inner class name */
    /* compiled from: ViewDragHelper */
    public static abstract class C0200c {
        public abstract int a(View view, int i11, int i12);

        public abstract int b(View view, int i11, int i12);

        public int c(int i11) {
            return i11;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i11, int i12) {
        }

        public boolean g(int i11) {
            return false;
        }

        public void h(int i11, int i12) {
        }

        public void i(View view, int i11) {
        }

        public abstract void j(int i11);

        public abstract void k(View view, int i11, int i12, int i13, int i14);

        public abstract void l(View view, float f11, float f12);

        public abstract boolean m(View view, int i11);
    }

    private c(Context context, ViewGroup viewGroup, C0200c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.v = viewGroup;
            this.f17289s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i11 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f17287p = i11;
            this.f17286o = i11;
            this.f17276b = viewConfiguration.getScaledTouchSlop();
            this.f17285m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f17288r = new OverScroller(context, f17274x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private boolean D(int i11) {
        if (C(i11)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i11 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f17284l.computeCurrentVelocity(1000, this.f17285m);
        p(g(this.f17284l.getXVelocity(this.f17277c), this.n, this.f17285m), g(this.f17284l.getYVelocity(this.f17277c), this.n, this.f17285m));
    }

    private void H(float f11, float f12, int i11) {
        boolean c11 = c(f11, f12, i11, 1);
        if (c(f12, f11, i11, 4)) {
            c11 |= true;
        }
        if (c(f11, f12, i11, 2)) {
            c11 |= true;
        }
        if (c(f12, f11, i11, 8)) {
            c11 |= true;
        }
        if (c11) {
            int[] iArr = this.f17283i;
            iArr[i11] = iArr[i11] | c11;
            this.f17289s.f(c11 ? 1 : 0, i11);
        }
    }

    private void I(float f11, float f12, int i11) {
        s(i11);
        float[] fArr = this.f17278d;
        this.f17280f[i11] = f11;
        fArr[i11] = f11;
        float[] fArr2 = this.f17279e;
        this.f17281g[i11] = f12;
        fArr2[i11] = f12;
        this.f17282h[i11] = y((int) f11, (int) f12);
        this.k |= 1 << i11;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            int pointerId = motionEvent.getPointerId(i11);
            if (D(pointerId)) {
                float x11 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                this.f17280f[pointerId] = x11;
                this.f17281g[pointerId] = y11;
            }
        }
    }

    private boolean c(float f11, float f12, int i11, int i12) {
        float abs = Math.abs(f11);
        float abs2 = Math.abs(f12);
        if ((this.f17282h[i11] & i12) != i12 || (this.q & i12) == 0 || (this.j[i11] & i12) == i12 || (this.f17283i[i11] & i12) == i12) {
            return false;
        }
        int i13 = this.f17276b;
        if (abs <= ((float) i13) && abs2 <= ((float) i13)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f17289s.g(i12)) {
            int[] iArr = this.j;
            iArr[i11] = iArr[i11] | i12;
            return false;
        } else if ((this.f17283i[i11] & i12) != 0 || abs <= ((float) this.f17276b)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean f(View view, float f11, float f12) {
        if (view == null) {
            return false;
        }
        boolean z11 = this.f17289s.d(view) > 0;
        boolean z12 = this.f17289s.e(view) > 0;
        if (z11 && z12) {
            int i11 = this.f17276b;
            if ((f11 * f11) + (f12 * f12) > ((float) (i11 * i11))) {
                return true;
            }
            return false;
        } else if (z11) {
            if (Math.abs(f11) > ((float) this.f17276b)) {
                return true;
            }
            return false;
        } else if (!z12 || Math.abs(f12) <= ((float) this.f17276b)) {
            return false;
        } else {
            return true;
        }
    }

    private float g(float f11, float f12, float f13) {
        float abs = Math.abs(f11);
        if (abs < f12) {
            return 0.0f;
        }
        return abs > f13 ? f11 > 0.0f ? f13 : -f13 : f11;
    }

    private int h(int i11, int i12, int i13) {
        int abs = Math.abs(i11);
        if (abs < i12) {
            return 0;
        }
        return abs > i13 ? i11 > 0 ? i13 : -i13 : i11;
    }

    private void i() {
        float[] fArr = this.f17278d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f17279e, 0.0f);
            Arrays.fill(this.f17280f, 0.0f);
            Arrays.fill(this.f17281g, 0.0f);
            Arrays.fill(this.f17282h, 0);
            Arrays.fill(this.f17283i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
    }

    private void j(int i11) {
        if (this.f17278d != null && C(i11)) {
            this.f17278d[i11] = 0.0f;
            this.f17279e[i11] = 0.0f;
            this.f17280f[i11] = 0.0f;
            this.f17281g[i11] = 0.0f;
            this.f17282h[i11] = 0;
            this.f17283i[i11] = 0;
            this.j[i11] = 0;
            this.k = (~(1 << i11)) & this.k;
        }
    }

    private int k(int i11, int i12, int i13) {
        int i14;
        if (i11 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f11 = (float) (width / 2);
        float q11 = f11 + (q(Math.min(1.0f, ((float) Math.abs(i11)) / ((float) width))) * f11);
        int abs = Math.abs(i12);
        if (abs > 0) {
            i14 = Math.round(Math.abs(q11 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i14 = (int) (((((float) Math.abs(i11)) / ((float) i13)) + 1.0f) * 256.0f);
        }
        return Math.min(i14, 600);
    }

    private int l(View view, int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        float f13;
        float f14;
        int h11 = h(i13, (int) this.n, (int) this.f17285m);
        int h12 = h(i14, (int) this.n, (int) this.f17285m);
        int abs = Math.abs(i11);
        int abs2 = Math.abs(i12);
        int abs3 = Math.abs(h11);
        int abs4 = Math.abs(h12);
        int i15 = abs3 + abs4;
        int i16 = abs + abs2;
        if (h11 != 0) {
            f12 = (float) abs3;
            f11 = (float) i15;
        } else {
            f12 = (float) abs;
            f11 = (float) i16;
        }
        float f15 = f12 / f11;
        if (h12 != 0) {
            f14 = (float) abs4;
            f13 = (float) i15;
        } else {
            f14 = (float) abs2;
            f13 = (float) i16;
        }
        float f16 = f14 / f13;
        return (int) ((((float) k(i11, h11, this.f17289s.d(view))) * f15) + (((float) k(i12, h12, this.f17289s.e(view))) * f16));
    }

    public static c n(ViewGroup viewGroup, float f11, C0200c cVar) {
        c o11 = o(viewGroup, cVar);
        o11.f17276b = (int) (((float) o11.f17276b) * (1.0f / f11));
        return o11;
    }

    public static c o(ViewGroup viewGroup, C0200c cVar) {
        return new c(viewGroup.getContext(), viewGroup, cVar);
    }

    private void p(float f11, float f12) {
        this.f17290u = true;
        this.f17289s.l(this.t, f11, f12);
        this.f17290u = false;
        if (this.f17275a == 1) {
            K(0);
        }
    }

    private float q(float f11) {
        return (float) Math.sin((double) ((f11 - 0.5f) * 0.47123894f));
    }

    private void r(int i11, int i12, int i13, int i14) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i13 != 0) {
            i11 = this.f17289s.a(this.t, i11, i13);
            a0.g0(this.t, i11 - left);
        }
        int i15 = i11;
        if (i14 != 0) {
            i12 = this.f17289s.b(this.t, i12, i14);
            a0.h0(this.t, i12 - top);
        }
        int i16 = i12;
        if (i13 != 0 || i14 != 0) {
            this.f17289s.k(this.t, i15, i16, i15 - left, i16 - top);
        }
    }

    private void s(int i11) {
        float[] fArr = this.f17278d;
        if (fArr == null || fArr.length <= i11) {
            int i12 = i11 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f17279e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f17280f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f17281g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f17282h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f17283i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f17278d = fArr2;
            this.f17279e = fArr3;
            this.f17280f = fArr4;
            this.f17281g = fArr5;
            this.f17282h = iArr;
            this.f17283i = iArr2;
            this.j = iArr3;
        }
    }

    private boolean u(int i11, int i12, int i13, int i14) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i15 = i11 - left;
        int i16 = i12 - top;
        if (i15 == 0 && i16 == 0) {
            this.f17288r.abortAnimation();
            K(0);
            return false;
        }
        this.f17288r.startScroll(left, top, i15, i16, l(this.t, i15, i16, i13, i14));
        K(2);
        return true;
    }

    private int y(int i11, int i12) {
        int i13 = i11 < this.v.getLeft() + this.f17286o ? 1 : 0;
        if (i12 < this.v.getTop() + this.f17286o) {
            i13 |= 4;
        }
        if (i11 > this.v.getRight() - this.f17286o) {
            i13 |= 2;
        }
        return i12 > this.v.getBottom() - this.f17286o ? i13 | 8 : i13;
    }

    public int A() {
        return this.f17275a;
    }

    public boolean B(int i11, int i12) {
        return E(this.t, i11, i12);
    }

    public boolean C(int i11) {
        return ((1 << i11) & this.k) != 0;
    }

    public boolean E(View view, int i11, int i12) {
        if (view != null && i11 >= view.getLeft() && i11 < view.getRight() && i12 >= view.getTop() && i12 < view.getBottom()) {
            return true;
        }
        return false;
    }

    public void F(MotionEvent motionEvent) {
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f17284l == null) {
            this.f17284l = VelocityTracker.obtain();
        }
        this.f17284l.addMovement(motionEvent);
        int i12 = 0;
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View t11 = t((int) x11, (int) y11);
            I(x11, y11, pointerId);
            R(t11, pointerId);
            int i13 = this.f17282h[pointerId];
            int i14 = this.q;
            if ((i13 & i14) != 0) {
                this.f17289s.h(i13 & i14, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f17275a == 1) {
                G();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f17275a == 1) {
                    p(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x12 = motionEvent.getX(actionIndex);
                float y12 = motionEvent.getY(actionIndex);
                I(x12, y12, pointerId2);
                if (this.f17275a == 0) {
                    R(t((int) x12, (int) y12), pointerId2);
                    int i15 = this.f17282h[pointerId2];
                    int i16 = this.q;
                    if ((i15 & i16) != 0) {
                        this.f17289s.h(i15 & i16, pointerId2);
                    }
                } else if (B((int) x12, (int) y12)) {
                    R(this.t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f17275a == 1 && pointerId3 == this.f17277c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i12 >= pointerCount) {
                            i11 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i12);
                        if (pointerId4 != this.f17277c) {
                            View t12 = t((int) motionEvent.getX(i12), (int) motionEvent.getY(i12));
                            View view = this.t;
                            if (t12 == view && R(view, pointerId4)) {
                                i11 = this.f17277c;
                                break;
                            }
                        }
                        i12++;
                    }
                    if (i11 == -1) {
                        G();
                    }
                }
                j(pointerId3);
            }
        } else if (this.f17275a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i12 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i12);
                if (D(pointerId5)) {
                    float x13 = motionEvent.getX(i12);
                    float y13 = motionEvent.getY(i12);
                    float f11 = x13 - this.f17278d[pointerId5];
                    float f12 = y13 - this.f17279e[pointerId5];
                    H(f11, f12, pointerId5);
                    if (this.f17275a != 1) {
                        View t13 = t((int) x13, (int) y13);
                        if (f(t13, f11, f12) && R(t13, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i12++;
            }
            J(motionEvent);
        } else if (D(this.f17277c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f17277c);
            float x14 = motionEvent.getX(findPointerIndex);
            float y14 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f17280f;
            int i17 = this.f17277c;
            int i18 = (int) (x14 - fArr[i17]);
            int i19 = (int) (y14 - this.f17281g[i17]);
            r(this.t.getLeft() + i18, this.t.getTop() + i19, i18, i19);
            J(motionEvent);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(int i11) {
        this.v.removeCallbacks(this.f17291w);
        if (this.f17275a != i11) {
            this.f17275a = i11;
            this.f17289s.j(i11);
            if (this.f17275a == 0) {
                this.t = null;
            }
        }
    }

    public void L(int i11) {
        this.f17286o = i11;
    }

    public void M(int i11) {
        this.q = i11;
    }

    public void N(float f11) {
        this.n = f11;
    }

    public boolean O(int i11, int i12) {
        if (this.f17290u) {
            return u(i11, i12, (int) this.f17284l.getXVelocity(this.f17277c), (int) this.f17284l.getYVelocity(this.f17277c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean P(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f17284l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f17284l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f17284l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.j(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.I(r7, r1, r2)
            int r3 = r0.f17275a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f17282h
            r1 = r1[r2]
            int r3 = r0.q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            v2.c$c r4 = r0.f17289s
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.t(r3, r1)
            android.view.View r3 = r0.t
            if (r1 != r3) goto L_0x0031
            r0.R(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f17278d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f17279e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.D(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f17278d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f17279e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.t(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.f(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            v2.c$c r14 = r0.f17289s
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            v2.c$c r5 = r0.f17289s
            int r5 = r5.b(r7, r15, r14)
            v2.c$c r14 = r0.f17289s
            int r14 = r14.d(r7)
            v2.c$c r15 = r0.f17289s
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.H(r9, r10, r4)
            int r5 = r0.f17275a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.R(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.J(r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.I(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.t(r2, r3)
            android.view.View r3 = r0.t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f17275a
            if (r3 != r4) goto L_0x0125
            r0.R(r2, r1)
        L_0x0125:
            int[] r2 = r0.f17282h
            r2 = r2[r1]
            int r3 = r0.q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            v2.c$c r4 = r0.f17289s
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.f17275a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.c.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i11, int i12) {
        this.t = view;
        this.f17277c = -1;
        boolean u11 = u(i11, i12, 0, 0);
        if (!u11 && this.f17275a == 0 && this.t != null) {
            this.t = null;
        }
        return u11;
    }

    /* access modifiers changed from: package-private */
    public boolean R(View view, int i11) {
        if (view == this.t && this.f17277c == i11) {
            return true;
        }
        if (view == null || !this.f17289s.m(view, i11)) {
            return false;
        }
        this.f17277c = i11;
        b(view, i11);
        return true;
    }

    public void a() {
        this.f17277c = -1;
        i();
        VelocityTracker velocityTracker = this.f17284l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17284l = null;
        }
    }

    public void b(View view, int i11) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.f17277c = i11;
            this.f17289s.i(view, i11);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public boolean d(int i11) {
        int length = this.f17278d.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (e(i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i11, int i12) {
        if (!C(i12)) {
            return false;
        }
        boolean z11 = (i11 & 1) == 1;
        boolean z12 = (i11 & 2) == 2;
        float f11 = this.f17280f[i12] - this.f17278d[i12];
        float f12 = this.f17281g[i12] - this.f17279e[i12];
        if (z11 && z12) {
            int i13 = this.f17276b;
            if ((f11 * f11) + (f12 * f12) > ((float) (i13 * i13))) {
                return true;
            }
            return false;
        } else if (z11) {
            if (Math.abs(f11) > ((float) this.f17276b)) {
                return true;
            }
            return false;
        } else if (!z12 || Math.abs(f12) <= ((float) this.f17276b)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean m(boolean z11) {
        if (this.f17275a == 2) {
            boolean computeScrollOffset = this.f17288r.computeScrollOffset();
            int currX = this.f17288r.getCurrX();
            int currY = this.f17288r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                a0.g0(this.t, left);
            }
            if (top != 0) {
                a0.h0(this.t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f17289s.k(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f17288r.getFinalX() && currY == this.f17288r.getFinalY()) {
                this.f17288r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z11) {
                    this.v.post(this.f17291w);
                } else {
                    K(0);
                }
            }
        }
        if (this.f17275a == 2) {
            return true;
        }
        return false;
    }

    public View t(int i11, int i12) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.v.getChildAt(this.f17289s.c(childCount));
            if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && i12 >= childAt.getTop() && i12 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.t;
    }

    public int w() {
        return this.f17287p;
    }

    public int x() {
        return this.f17286o;
    }

    public int z() {
        return this.f17276b;
    }
}
