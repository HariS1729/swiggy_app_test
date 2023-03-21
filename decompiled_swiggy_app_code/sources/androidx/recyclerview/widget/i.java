package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import org.apache.fontbox.ttf.OS2WindowsMetricsTable;

/* compiled from: FastScroller */
class i extends RecyclerView.n implements RecyclerView.s {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.t C;

    /* renamed from: a  reason: collision with root package name */
    private final int f11397a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11398b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f11399c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f11400d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11401e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11402f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f11403g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f11404h;

    /* renamed from: i  reason: collision with root package name */
    private final int f11405i;
    private final int j;
    int k;

    /* renamed from: l  reason: collision with root package name */
    int f11406l;

    /* renamed from: m  reason: collision with root package name */
    float f11407m;
    int n;

    /* renamed from: o  reason: collision with root package name */
    int f11408o;

    /* renamed from: p  reason: collision with root package name */
    float f11409p;
    private int q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f11410r = 0;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f11411s;
    private boolean t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f11412u = false;
    private int v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f11413w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f11414x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f11415y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f11416z;

    /* compiled from: FastScroller */
    class a implements Runnable {
        a() {
        }

        public void run() {
            i.this.q(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
        }
    }

    /* compiled from: FastScroller */
    class b extends RecyclerView.t {
        b() {
        }

        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            i.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f11419a = false;

        c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f11419a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f11419a) {
                this.f11419a = false;
            } else if (((Float) i.this.f11416z.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.A = 0;
                iVar.y(0);
            } else {
                i iVar2 = i.this;
                iVar2.A = 2;
                iVar2.v();
            }
        }
    }

    /* compiled from: FastScroller */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.f11399c.setAlpha(floatValue);
            i.this.f11400d.setAlpha(floatValue);
            i.this.v();
        }
    }

    i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f11416z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f11399c = stateListDrawable;
        this.f11400d = drawable;
        this.f11403g = stateListDrawable2;
        this.f11404h = drawable2;
        this.f11401e = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.f11402f = Math.max(i11, drawable.getIntrinsicWidth());
        this.f11405i = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i11, drawable2.getIntrinsicWidth());
        this.f11397a = i12;
        this.f11398b = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        j(recyclerView);
    }

    private void C(float f11) {
        int[] p11 = p();
        float max = Math.max((float) p11[0], Math.min((float) p11[1], f11));
        if (Math.abs(((float) this.f11406l) - max) >= 2.0f) {
            int x11 = x(this.f11407m, max, p11, this.f11411s.computeVerticalScrollRange(), this.f11411s.computeVerticalScrollOffset(), this.f11410r);
            if (x11 != 0) {
                this.f11411s.scrollBy(0, x11);
            }
            this.f11407m = max;
        }
    }

    private void k() {
        this.f11411s.removeCallbacks(this.B);
    }

    private void l() {
        this.f11411s.a1(this);
        this.f11411s.c1(this);
        this.f11411s.d1(this.C);
        k();
    }

    private void m(Canvas canvas) {
        int i11 = this.f11410r;
        int i12 = this.f11405i;
        int i13 = i11 - i12;
        int i14 = this.f11408o;
        int i15 = this.n;
        int i16 = i14 - (i15 / 2);
        this.f11403g.setBounds(0, 0, i15, i12);
        this.f11404h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, (float) i13);
        this.f11404h.draw(canvas);
        canvas.translate((float) i16, 0.0f);
        this.f11403g.draw(canvas);
        canvas.translate((float) (-i16), (float) (-i13));
    }

    private void n(Canvas canvas) {
        int i11 = this.q;
        int i12 = this.f11401e;
        int i13 = i11 - i12;
        int i14 = this.f11406l;
        int i15 = this.k;
        int i16 = i14 - (i15 / 2);
        this.f11399c.setBounds(0, 0, i12, i15);
        this.f11400d.setBounds(0, 0, this.f11402f, this.f11410r);
        if (s()) {
            this.f11400d.draw(canvas);
            canvas.translate((float) this.f11401e, (float) i16);
            canvas.scale(-1.0f, 1.0f);
            this.f11399c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f11401e), (float) (-i16));
            return;
        }
        canvas.translate((float) i13, 0.0f);
        this.f11400d.draw(canvas);
        canvas.translate(0.0f, (float) i16);
        this.f11399c.draw(canvas);
        canvas.translate((float) (-i13), (float) (-i16));
    }

    private int[] o() {
        int[] iArr = this.f11415y;
        int i11 = this.f11398b;
        iArr[0] = i11;
        iArr[1] = this.q - i11;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f11414x;
        int i11 = this.f11398b;
        iArr[0] = i11;
        iArr[1] = this.f11410r - i11;
        return iArr;
    }

    private void r(float f11) {
        int[] o11 = o();
        float max = Math.max((float) o11[0], Math.min((float) o11[1], f11));
        if (Math.abs(((float) this.f11408o) - max) >= 2.0f) {
            int x11 = x(this.f11409p, max, o11, this.f11411s.computeHorizontalScrollRange(), this.f11411s.computeHorizontalScrollOffset(), this.q);
            if (x11 != 0) {
                this.f11411s.scrollBy(x11, 0);
            }
            this.f11409p = max;
        }
    }

    private boolean s() {
        return a0.F(this.f11411s) == 1;
    }

    private void w(int i11) {
        k();
        this.f11411s.postDelayed(this.B, (long) i11);
    }

    private int x(float f11, float f12, int[] iArr, int i11, int i12, int i13) {
        int i14 = iArr[1] - iArr[0];
        if (i14 == 0) {
            return 0;
        }
        int i15 = i11 - i13;
        int i16 = (int) (((f12 - f11) / ((float) i14)) * ((float) i15));
        int i17 = i12 + i16;
        if (i17 >= i15 || i17 < 0) {
            return 0;
        }
        return i16;
    }

    private void z() {
        this.f11411s.h(this);
        this.f11411s.k(this);
        this.f11411s.l(this.C);
    }

    public void A() {
        int i11 = this.A;
        if (i11 != 0) {
            if (i11 == 3) {
                this.f11416z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f11416z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f11416z.setDuration(500);
        this.f11416z.setStartDelay(0);
        this.f11416z.start();
    }

    /* access modifiers changed from: package-private */
    public void B(int i11, int i12) {
        int computeVerticalScrollRange = this.f11411s.computeVerticalScrollRange();
        int i13 = this.f11410r;
        this.t = computeVerticalScrollRange - i13 > 0 && i13 >= this.f11397a;
        int computeHorizontalScrollRange = this.f11411s.computeHorizontalScrollRange();
        int i14 = this.q;
        boolean z11 = computeHorizontalScrollRange - i14 > 0 && i14 >= this.f11397a;
        this.f11412u = z11;
        boolean z12 = this.t;
        if (z12 || z11) {
            if (z12) {
                float f11 = (float) i13;
                this.f11406l = (int) ((f11 * (((float) i12) + (f11 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.k = Math.min(i13, (i13 * i13) / computeVerticalScrollRange);
            }
            if (this.f11412u) {
                float f12 = (float) i14;
                this.f11408o = (int) ((f12 * (((float) i11) + (f12 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
            }
            int i15 = this.v;
            if (i15 == 0 || i15 == 1) {
                y(1);
            }
        } else if (this.v != 0) {
            y(0);
        }
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u11 = u(motionEvent.getX(), motionEvent.getY());
                boolean t11 = t(motionEvent.getX(), motionEvent.getY());
                if (u11 || t11) {
                    if (t11) {
                        this.f11413w = 1;
                        this.f11409p = (float) ((int) motionEvent.getX());
                    } else if (u11) {
                        this.f11413w = 2;
                        this.f11407m = (float) ((int) motionEvent.getY());
                    }
                    y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.v == 2) {
                this.f11407m = 0.0f;
                this.f11409p = 0.0f;
                y(1);
                this.f11413w = 0;
            } else if (motionEvent.getAction() == 2 && this.v == 2) {
                A();
                if (this.f11413w == 1) {
                    r(motionEvent.getX());
                }
                if (this.f11413w == 2) {
                    C(motionEvent.getY());
                }
            }
        }
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i11 = this.v;
        if (i11 == 1) {
            boolean u11 = u(motionEvent.getX(), motionEvent.getY());
            boolean t11 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u11 && !t11) {
                return false;
            }
            if (t11) {
                this.f11413w = 1;
                this.f11409p = (float) ((int) motionEvent.getX());
            } else if (u11) {
                this.f11413w = 2;
                this.f11407m = (float) ((int) motionEvent.getY());
            }
            y(2);
        } else if (i11 == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void c(boolean z11) {
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.q != this.f11411s.getWidth() || this.f11410r != this.f11411s.getHeight()) {
            this.q = this.f11411s.getWidth();
            this.f11410r = this.f11411s.getHeight();
            y(0);
        } else if (this.A != 0) {
            if (this.t) {
                n(canvas);
            }
            if (this.f11412u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11411s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                l();
            }
            this.f11411s = recyclerView;
            if (recyclerView != null) {
                z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i11) {
        int i12 = this.A;
        if (i12 == 1) {
            this.f11416z.cancel();
        } else if (i12 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f11416z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f11416z.setDuration((long) i11);
        this.f11416z.start();
    }

    /* access modifiers changed from: package-private */
    public boolean t(float f11, float f12) {
        if (f12 >= ((float) (this.f11410r - this.f11405i))) {
            int i11 = this.f11408o;
            int i12 = this.n;
            return f11 >= ((float) (i11 - (i12 / 2))) && f11 <= ((float) (i11 + (i12 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean u(float f11, float f12) {
        if (!s() ? f11 >= ((float) (this.q - this.f11401e)) : f11 <= ((float) this.f11401e)) {
            int i11 = this.f11406l;
            int i12 = this.k;
            return f12 >= ((float) (i11 - (i12 / 2))) && f12 <= ((float) (i11 + (i12 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f11411s.invalidate();
    }

    /* access modifiers changed from: package-private */
    public void y(int i11) {
        if (i11 == 2 && this.v != 2) {
            this.f11399c.setState(D);
            k();
        }
        if (i11 == 0) {
            v();
        } else {
            A();
        }
        if (this.v == 2 && i11 != 2) {
            this.f11399c.setState(E);
            w(1200);
        } else if (i11 == 1) {
            w(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.v = i11;
    }
}
