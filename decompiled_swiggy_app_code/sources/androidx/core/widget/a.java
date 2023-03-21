package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.a0;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    private static final int f9634r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    final C0054a f9635a = new C0054a();

    /* renamed from: b  reason: collision with root package name */
    private final Interpolator f9636b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    final View f9637c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f9638d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f9639e = {0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    private float[] f9640f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: g  reason: collision with root package name */
    private int f9641g;

    /* renamed from: h  reason: collision with root package name */
    private int f9642h;

    /* renamed from: i  reason: collision with root package name */
    private float[] f9643i = {0.0f, 0.0f};
    private float[] j = {0.0f, 0.0f};
    private float[] k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l  reason: collision with root package name */
    private boolean f9644l;

    /* renamed from: m  reason: collision with root package name */
    boolean f9645m;
    boolean n;

    /* renamed from: o  reason: collision with root package name */
    boolean f9646o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9647p;
    private boolean q;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    private static class C0054a {

        /* renamed from: a  reason: collision with root package name */
        private int f9648a;

        /* renamed from: b  reason: collision with root package name */
        private int f9649b;

        /* renamed from: c  reason: collision with root package name */
        private float f9650c;

        /* renamed from: d  reason: collision with root package name */
        private float f9651d;

        /* renamed from: e  reason: collision with root package name */
        private long f9652e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private long f9653f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f9654g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f9655h = 0;

        /* renamed from: i  reason: collision with root package name */
        private long f9656i = -1;
        private float j;
        private int k;

        C0054a() {
        }

        private float e(long j11) {
            long j12 = this.f9652e;
            if (j11 < j12) {
                return 0.0f;
            }
            long j13 = this.f9656i;
            if (j13 < 0 || j11 < j13) {
                return a.e(((float) (j11 - j12)) / ((float) this.f9648a), 0.0f, 1.0f) * 0.5f;
            }
            float f11 = this.j;
            return (1.0f - f11) + (f11 * a.e(((float) (j11 - j13)) / ((float) this.k), 0.0f, 1.0f));
        }

        private float g(float f11) {
            return (-4.0f * f11 * f11) + (f11 * 4.0f);
        }

        public void a() {
            if (this.f9653f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g11 = g(e(currentAnimationTimeMillis));
                this.f9653f = currentAnimationTimeMillis;
                float f11 = ((float) (currentAnimationTimeMillis - this.f9653f)) * g11;
                this.f9654g = (int) (this.f9650c * f11);
                this.f9655h = (int) (f11 * this.f9651d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f9654g;
        }

        public int c() {
            return this.f9655h;
        }

        public int d() {
            float f11 = this.f9650c;
            return (int) (f11 / Math.abs(f11));
        }

        public int f() {
            float f11 = this.f9651d;
            return (int) (f11 / Math.abs(f11));
        }

        public boolean h() {
            return this.f9656i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f9656i + ((long) this.k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int) (currentAnimationTimeMillis - this.f9652e), 0, this.f9649b);
            this.j = e(currentAnimationTimeMillis);
            this.f9656i = currentAnimationTimeMillis;
        }

        public void j(int i11) {
            this.f9649b = i11;
        }

        public void k(int i11) {
            this.f9648a = i11;
        }

        public void l(float f11, float f12) {
            this.f9650c = f11;
            this.f9651d = f12;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f9652e = currentAnimationTimeMillis;
            this.f9656i = -1;
            this.f9653f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.f9654g = 0;
            this.f9655h = 0;
        }
    }

    /* compiled from: AutoScrollHelper */
    private class b implements Runnable {
        b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f9646o) {
                if (aVar.f9645m) {
                    aVar.f9645m = false;
                    aVar.f9635a.m();
                }
                C0054a aVar2 = a.this.f9635a;
                if (aVar2.h() || !a.this.u()) {
                    a.this.f9646o = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.n) {
                    aVar3.n = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                a0.o0(a.this.f9637c, this);
            }
        }
    }

    public a(View view) {
        this.f9637c = view;
        float f11 = Resources.getSystem().getDisplayMetrics().density;
        float f12 = (float) ((int) ((1575.0f * f11) + 0.5f));
        o(f12, f12);
        float f13 = (float) ((int) ((f11 * 315.0f) + 0.5f));
        p(f13, f13);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f9634r);
        r(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
        q(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
    }

    private float d(int i11, float f11, float f12, float f13) {
        float h11 = h(this.f9639e[i11], f12, this.f9640f[i11], f11);
        int i12 = (h11 > 0.0f ? 1 : (h11 == 0.0f ? 0 : -1));
        if (i12 == 0) {
            return 0.0f;
        }
        float f14 = this.f9643i[i11];
        float f15 = this.j[i11];
        float f16 = this.k[i11];
        float f17 = f14 * f13;
        if (i12 > 0) {
            return e(h11 * f17, f15, f16);
        }
        return -e((-h11) * f17, f15, f16);
    }

    static float e(float f11, float f12, float f13) {
        return f11 > f13 ? f13 : f11 < f12 ? f12 : f11;
    }

    static int f(int i11, int i12, int i13) {
        return i11 > i13 ? i13 : i11 < i12 ? i12 : i11;
    }

    private float g(float f11, float f12) {
        if (f12 == 0.0f) {
            return 0.0f;
        }
        int i11 = this.f9641g;
        if (i11 == 0 || i11 == 1) {
            if (f11 < f12) {
                if (f11 >= 0.0f) {
                    return 1.0f - (f11 / f12);
                }
                return (!this.f9646o || i11 != 1) ? 0.0f : 1.0f;
            }
        } else if (i11 == 2 && f11 < 0.0f) {
            return f11 / (-f12);
        }
    }

    private float h(float f11, float f12, float f13, float f14) {
        float f15;
        float e11 = e(f11 * f12, 0.0f, f13);
        float g11 = g(f12 - f14, e11) - g(f14, e11);
        if (g11 < 0.0f) {
            f15 = -this.f9636b.getInterpolation(-g11);
        } else if (g11 <= 0.0f) {
            return 0.0f;
        } else {
            f15 = this.f9636b.getInterpolation(g11);
        }
        return e(f15, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f9645m) {
            this.f9646o = false;
        } else {
            this.f9635a.i();
        }
    }

    private void v() {
        int i11;
        if (this.f9638d == null) {
            this.f9638d = new b();
        }
        this.f9646o = true;
        this.f9645m = true;
        if (this.f9644l || (i11 = this.f9642h) <= 0) {
            this.f9638d.run();
        } else {
            a0.p0(this.f9637c, this.f9638d, (long) i11);
        }
        this.f9644l = true;
    }

    public abstract boolean a(int i11);

    public abstract boolean b(int i11);

    /* access modifiers changed from: package-private */
    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f9637c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i11, int i12);

    public a k(int i11) {
        this.f9642h = i11;
        return this;
    }

    public a l(int i11) {
        this.f9641g = i11;
        return this;
    }

    public a m(boolean z11) {
        if (this.f9647p && !z11) {
            i();
        }
        this.f9647p = z11;
        return this;
    }

    public a n(float f11, float f12) {
        float[] fArr = this.f9640f;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    public a o(float f11, float f12) {
        float[] fArr = this.k;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f9647p
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.i()
            goto L_0x0058
        L_0x001a:
            r5.n = r2
            r5.f9644l = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f9637c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f9637c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f9635a
            r7.l(r0, r6)
            boolean r6 = r5.f9646o
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.u()
            if (r6 == 0) goto L_0x0058
            r5.v()
        L_0x0058:
            boolean r6 = r5.q
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f9646o
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f11, float f12) {
        float[] fArr = this.j;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    public a q(int i11) {
        this.f9635a.j(i11);
        return this;
    }

    public a r(int i11) {
        this.f9635a.k(i11);
        return this;
    }

    public a s(float f11, float f12) {
        float[] fArr = this.f9639e;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    public a t(float f11, float f12) {
        float[] fArr = this.f9643i;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        C0054a aVar = this.f9635a;
        int f11 = aVar.f();
        int d11 = aVar.d();
        return (f11 != 0 && b(f11)) || (d11 != 0 && a(d11));
    }
}
