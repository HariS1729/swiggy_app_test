package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.q;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.d;
import androidx.core.view.r;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements r {

    /* renamed from: p1  reason: collision with root package name */
    public static boolean f8375p1;
    Interpolator A = null;
    float A0;
    float B = 0.0f;
    private boolean B0 = false;
    /* access modifiers changed from: private */
    public int C = -1;
    private ArrayList<n> C0 = null;
    int D = -1;
    private ArrayList<n> D0 = null;
    /* access modifiers changed from: private */
    public int E = -1;
    private ArrayList<n> E0 = null;
    /* access modifiers changed from: private */
    public int F = 0;
    private CopyOnWriteArrayList<j> F0 = null;
    /* access modifiers changed from: private */
    public int G = 0;
    private int G0 = 0;
    private boolean H = true;
    private long H0 = -1;
    HashMap<View, m> I = new HashMap<>();
    private float I0 = 0.0f;
    private int J0 = 0;
    private long K = 0;
    private float K0 = 0.0f;
    private float L = 1.0f;
    boolean L0 = false;
    float M = 0.0f;
    protected boolean M0 = false;
    float N = 0.0f;
    int N0;
    private long O;
    int O0;
    float P = 0.0f;
    int P0;
    private boolean Q;
    int Q0;
    boolean R = false;
    int R0;
    boolean S = false;
    int S0;
    private j T;
    float T0;
    private float U;
    private i2.d U0 = new i2.d();
    private float V;
    private boolean V0 = false;
    int W = 0;
    /* access modifiers changed from: private */
    public i W0;
    private Runnable X0 = null;
    private int[] Y0 = null;
    int Z0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: a1  reason: collision with root package name */
    public boolean f8376a1 = false;

    /* renamed from: b1  reason: collision with root package name */
    int f8377b1 = 0;

    /* renamed from: c0  reason: collision with root package name */
    e f8378c0;

    /* renamed from: c1  reason: collision with root package name */
    HashMap<View, o2.e> f8379c1 = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d1  reason: collision with root package name */
    public int f8380d1;
    /* access modifiers changed from: private */

    /* renamed from: e1  reason: collision with root package name */
    public int f8381e1;

    /* renamed from: f1  reason: collision with root package name */
    private int f8382f1;

    /* renamed from: g1  reason: collision with root package name */
    Rect f8383g1 = new Rect();

    /* renamed from: h1  reason: collision with root package name */
    private boolean f8384h1 = false;

    /* renamed from: i1  reason: collision with root package name */
    TransitionState f8385i1 = TransitionState.UNDEFINED;

    /* renamed from: j1  reason: collision with root package name */
    f f8386j1 = new f();

    /* renamed from: k1  reason: collision with root package name */
    private boolean f8387k1 = false;

    /* renamed from: l1  reason: collision with root package name */
    private RectF f8388l1 = new RectF();

    /* renamed from: m1  reason: collision with root package name */
    private View f8389m1 = null;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f8390n0 = false;

    /* renamed from: n1  reason: collision with root package name */
    private Matrix f8391n1 = null;

    /* renamed from: o0  reason: collision with root package name */
    private o2.b f8392o0 = new o2.b();

    /* renamed from: o1  reason: collision with root package name */
    ArrayList<Integer> f8393o1 = new ArrayList<>();

    /* renamed from: p0  reason: collision with root package name */
    private d f8394p0 = new d();

    /* renamed from: q0  reason: collision with root package name */
    private b f8395q0;

    /* renamed from: r0  reason: collision with root package name */
    boolean f8396r0 = true;

    /* renamed from: s0  reason: collision with root package name */
    int f8397s0;

    /* renamed from: t0  reason: collision with root package name */
    int f8398t0;

    /* renamed from: u0  reason: collision with root package name */
    int f8399u0;

    /* renamed from: v0  reason: collision with root package name */
    int f8400v0;

    /* renamed from: w0  reason: collision with root package name */
    boolean f8401w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    float f8402x0;

    /* renamed from: y  reason: collision with root package name */
    q f8403y;

    /* renamed from: y0  reason: collision with root package name */
    float f8404y0;

    /* renamed from: z  reason: collision with root package name */
    Interpolator f8405z;

    /* renamed from: z0  reason: collision with root package name */
    long f8406z0;

    enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f8407a;

        a(MotionLayout motionLayout, View view) {
            this.f8407a = view;
        }

        public void run() {
            this.f8407a.setNestedScrollingEnabled(true);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            MotionLayout.this.W0.a();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8409a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8409a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8409a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8409a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8409a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.c.<clinit>():void");
        }
    }

    class d extends o {

        /* renamed from: a  reason: collision with root package name */
        float f8410a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        float f8411b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        float f8412c;

        d() {
        }

        public float a() {
            return MotionLayout.this.B;
        }

        public void b(float f11, float f12, float f13) {
            this.f8410a = f11;
            this.f8411b = f12;
            this.f8412c = f13;
        }

        public float getInterpolation(float f11) {
            float f12;
            float f13;
            float f14 = this.f8410a;
            if (f14 > 0.0f) {
                float f15 = this.f8412c;
                if (f14 / f15 < f11) {
                    f11 = f14 / f15;
                }
                MotionLayout.this.B = f14 - (f15 * f11);
                f12 = (f14 * f11) - (((f15 * f11) * f11) / 2.0f);
                f13 = this.f8411b;
            } else {
                float f16 = this.f8412c;
                if ((-f14) / f16 < f11) {
                    f11 = (-f14) / f16;
                }
                MotionLayout.this.B = (f16 * f11) + f14;
                f12 = (f14 * f11) + (((f16 * f11) * f11) / 2.0f);
                f13 = this.f8411b;
            }
            return f12 + f13;
        }
    }

    private class e {

        /* renamed from: a  reason: collision with root package name */
        float[] f8414a;

        /* renamed from: b  reason: collision with root package name */
        int[] f8415b;

        /* renamed from: c  reason: collision with root package name */
        float[] f8416c;

        /* renamed from: d  reason: collision with root package name */
        Path f8417d;

        /* renamed from: e  reason: collision with root package name */
        Paint f8418e;

        /* renamed from: f  reason: collision with root package name */
        Paint f8419f;

        /* renamed from: g  reason: collision with root package name */
        Paint f8420g;

        /* renamed from: h  reason: collision with root package name */
        Paint f8421h;

        /* renamed from: i  reason: collision with root package name */
        Paint f8422i;
        private float[] j;
        final int k = -21965;

        /* renamed from: l  reason: collision with root package name */
        final int f8423l = -2067046;

        /* renamed from: m  reason: collision with root package name */
        final int f8424m = -13391360;
        final int n = 1996488704;

        /* renamed from: o  reason: collision with root package name */
        final int f8425o = 10;

        /* renamed from: p  reason: collision with root package name */
        DashPathEffect f8426p;
        int q;

        /* renamed from: r  reason: collision with root package name */
        Rect f8427r = new Rect();

        /* renamed from: s  reason: collision with root package name */
        boolean f8428s = false;
        int t = 1;

        public e() {
            Paint paint = new Paint();
            this.f8418e = paint;
            paint.setAntiAlias(true);
            this.f8418e.setColor(-21965);
            this.f8418e.setStrokeWidth(2.0f);
            this.f8418e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f8419f = paint2;
            paint2.setAntiAlias(true);
            this.f8419f.setColor(-2067046);
            this.f8419f.setStrokeWidth(2.0f);
            this.f8419f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f8420g = paint3;
            paint3.setAntiAlias(true);
            this.f8420g.setColor(-13391360);
            this.f8420g.setStrokeWidth(2.0f);
            this.f8420g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f8421h = paint4;
            paint4.setAntiAlias(true);
            this.f8421h.setColor(-13391360);
            this.f8421h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.f8422i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f8426p = dashPathEffect;
            this.f8420g.setPathEffect(dashPathEffect);
            this.f8416c = new float[100];
            this.f8415b = new int[50];
            if (this.f8428s) {
                this.f8418e.setStrokeWidth(8.0f);
                this.f8422i.setStrokeWidth(8.0f);
                this.f8419f.setStrokeWidth(8.0f);
                this.t = 4;
            }
        }

        private void c(Canvas canvas) {
            canvas.drawLines(this.f8414a, this.f8418e);
        }

        private void d(Canvas canvas) {
            boolean z11 = false;
            boolean z12 = false;
            for (int i11 = 0; i11 < this.q; i11++) {
                int[] iArr = this.f8415b;
                if (iArr[i11] == 1) {
                    z11 = true;
                }
                if (iArr[i11] == 0) {
                    z12 = true;
                }
            }
            if (z11) {
                g(canvas);
            }
            if (z12) {
                e(canvas);
            }
        }

        private void e(Canvas canvas) {
            float[] fArr = this.f8414a;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f11, f13), Math.max(f12, f14), Math.max(f11, f13), Math.max(f12, f14), this.f8420g);
            canvas.drawLine(Math.min(f11, f13), Math.min(f12, f14), Math.min(f11, f13), Math.max(f12, f14), this.f8420g);
        }

        private void f(Canvas canvas, float f11, float f12) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f8414a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            float min = Math.min(f13, f15);
            float max = Math.max(f14, f16);
            float min2 = f11 - Math.min(f13, f15);
            float max2 = Math.max(f14, f16) - f12;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d))) / 100.0f);
            l(str, this.f8421h);
            canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.f8427r.width() / 2))) + min, f12 - 20.0f, this.f8421h);
            canvas.drawLine(f11, f12, Math.min(f13, f15), f12, this.f8420g);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f16 - f14))) + 0.5d))) / 100.0f);
            l(str2, this.f8421h);
            canvas2.drawText(str2, f11 + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f8427r.height() / 2))), this.f8421h);
            canvas.drawLine(f11, f12, f11, Math.max(f14, f16), this.f8420g);
        }

        private void g(Canvas canvas) {
            float[] fArr = this.f8414a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f8420g);
        }

        private void h(Canvas canvas, float f11, float f12) {
            float[] fArr = this.f8414a;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f13 - f15), (double) (f14 - f16));
            float f17 = f15 - f13;
            float f18 = f16 - f14;
            float f19 = (((f11 - f13) * f17) + ((f12 - f14) * f18)) / (hypot * hypot);
            float f21 = f13 + (f17 * f19);
            float f22 = f14 + (f19 * f18);
            Path path = new Path();
            path.moveTo(f11, f12);
            path.lineTo(f21, f22);
            float hypot2 = (float) Math.hypot((double) (f21 - f11), (double) (f22 - f12));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            l(str, this.f8421h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f8427r.width() / 2)), -20.0f, this.f8421h);
            canvas.drawLine(f11, f12, f21, f22, this.f8420g);
        }

        private void i(Canvas canvas, float f11, float f12, int i11, int i12) {
            Canvas canvas2 = canvas;
            String str = "" + (((float) ((int) (((double) (((f11 - ((float) (i11 / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i11)))) + 0.5d))) / 100.0f);
            l(str, this.f8421h);
            canvas2.drawText(str, ((f11 / 2.0f) - ((float) (this.f8427r.width() / 2))) + 0.0f, f12 - 20.0f, this.f8421h);
            canvas.drawLine(f11, f12, Math.min(0.0f, 1.0f), f12, this.f8420g);
            String str2 = "" + (((float) ((int) (((double) (((f12 - ((float) (i12 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i12)))) + 0.5d))) / 100.0f);
            l(str2, this.f8421h);
            canvas2.drawText(str2, f11 + 5.0f, 0.0f - ((f12 / 2.0f) - ((float) (this.f8427r.height() / 2))), this.f8421h);
            canvas.drawLine(f11, f12, f11, Math.max(0.0f, 1.0f), this.f8420g);
        }

        private void j(Canvas canvas, m mVar) {
            this.f8417d.reset();
            for (int i11 = 0; i11 <= 50; i11++) {
                mVar.e(((float) i11) / ((float) 50), this.j, 0);
                Path path = this.f8417d;
                float[] fArr = this.j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f8417d;
                float[] fArr2 = this.j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f8417d;
                float[] fArr3 = this.j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f8417d;
                float[] fArr4 = this.j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f8417d.close();
            }
            this.f8418e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f8417d, this.f8418e);
            canvas.translate(-2.0f, -2.0f);
            this.f8418e.setColor(-65536);
            canvas.drawPath(this.f8417d, this.f8418e);
        }

        private void k(Canvas canvas, int i11, int i12, m mVar) {
            int i13;
            int i14;
            float f11;
            float f12;
            Canvas canvas2 = canvas;
            int i15 = i11;
            m mVar2 = mVar;
            View view = mVar2.f8549b;
            if (view != null) {
                i14 = view.getWidth();
                i13 = mVar2.f8549b.getHeight();
            } else {
                i14 = 0;
                i13 = 0;
            }
            for (int i16 = 1; i16 < i12 - 1; i16++) {
                if (i15 != 4 || this.f8415b[i16 - 1] != 0) {
                    float[] fArr = this.f8416c;
                    int i17 = i16 * 2;
                    float f13 = fArr[i17];
                    float f14 = fArr[i17 + 1];
                    this.f8417d.reset();
                    this.f8417d.moveTo(f13, f14 + 10.0f);
                    this.f8417d.lineTo(f13 + 10.0f, f14);
                    this.f8417d.lineTo(f13, f14 - 10.0f);
                    this.f8417d.lineTo(f13 - 10.0f, f14);
                    this.f8417d.close();
                    int i18 = i16 - 1;
                    mVar2.q(i18);
                    if (i15 == 4) {
                        int[] iArr = this.f8415b;
                        if (iArr[i18] == 1) {
                            h(canvas2, f13 - 0.0f, f14 - 0.0f);
                        } else if (iArr[i18] == 0) {
                            f(canvas2, f13 - 0.0f, f14 - 0.0f);
                        } else if (iArr[i18] == 2) {
                            f12 = f14;
                            f11 = f13;
                            i(canvas, f13 - 0.0f, f14 - 0.0f, i14, i13);
                            canvas2.drawPath(this.f8417d, this.f8422i);
                        }
                        f12 = f14;
                        f11 = f13;
                        canvas2.drawPath(this.f8417d, this.f8422i);
                    } else {
                        f12 = f14;
                        f11 = f13;
                    }
                    if (i15 == 2) {
                        h(canvas2, f11 - 0.0f, f12 - 0.0f);
                    }
                    if (i15 == 3) {
                        f(canvas2, f11 - 0.0f, f12 - 0.0f);
                    }
                    if (i15 == 6) {
                        i(canvas, f11 - 0.0f, f12 - 0.0f, i14, i13);
                    }
                    canvas2.drawPath(this.f8417d, this.f8422i);
                }
            }
            float[] fArr2 = this.f8414a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f8419f);
                float[] fArr3 = this.f8414a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f8419f);
            }
        }

        public void a(Canvas canvas, HashMap<View, m> hashMap, int i11, int i12) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i12 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.E) + Constants.COLON_SEPARATOR + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f8421h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f8418e);
                }
                for (m next : hashMap.values()) {
                    int m11 = next.m();
                    if (i12 > 0 && m11 == 0) {
                        m11 = 1;
                    }
                    if (m11 != 0) {
                        this.q = next.c(this.f8416c, this.f8415b);
                        if (m11 >= 1) {
                            int i13 = i11 / 16;
                            float[] fArr = this.f8414a;
                            if (fArr == null || fArr.length != i13 * 2) {
                                this.f8414a = new float[(i13 * 2)];
                                this.f8417d = new Path();
                            }
                            int i14 = this.t;
                            canvas.translate((float) i14, (float) i14);
                            this.f8418e.setColor(1996488704);
                            this.f8422i.setColor(1996488704);
                            this.f8419f.setColor(1996488704);
                            this.f8420g.setColor(1996488704);
                            next.d(this.f8414a, i13);
                            b(canvas, m11, this.q, next);
                            this.f8418e.setColor(-21965);
                            this.f8419f.setColor(-2067046);
                            this.f8422i.setColor(-2067046);
                            this.f8420g.setColor(-13391360);
                            int i15 = this.t;
                            canvas.translate((float) (-i15), (float) (-i15));
                            b(canvas, m11, this.q, next);
                            if (m11 == 5) {
                                j(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i11, int i12, m mVar) {
            if (i11 == 4) {
                d(canvas);
            }
            if (i11 == 2) {
                g(canvas);
            }
            if (i11 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i11, i12, mVar);
        }

        /* access modifiers changed from: package-private */
        public void l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f8427r);
        }
    }

    class f {

        /* renamed from: a  reason: collision with root package name */
        androidx.constraintlayout.core.widgets.d f8430a = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: b  reason: collision with root package name */
        androidx.constraintlayout.core.widgets.d f8431b = new androidx.constraintlayout.core.widgets.d();

        /* renamed from: c  reason: collision with root package name */
        androidx.constraintlayout.widget.c f8432c = null;

        /* renamed from: d  reason: collision with root package name */
        androidx.constraintlayout.widget.c f8433d = null;

        /* renamed from: e  reason: collision with root package name */
        int f8434e;

        /* renamed from: f  reason: collision with root package name */
        int f8435f;

        f() {
        }

        private void b(int i11, int i12) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.D == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar = this.f8431b;
                androidx.constraintlayout.widget.c cVar = this.f8433d;
                motionLayout2.B(dVar, optimizationLevel, (cVar == null || cVar.f8797d == 0) ? i11 : i12, (cVar == null || cVar.f8797d == 0) ? i12 : i11);
                androidx.constraintlayout.widget.c cVar2 = this.f8432c;
                if (cVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f8430a;
                    int i13 = cVar2.f8797d;
                    int i14 = i13 == 0 ? i11 : i12;
                    if (i13 == 0) {
                        i11 = i12;
                    }
                    motionLayout3.B(dVar2, optimizationLevel, i14, i11);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.c cVar3 = this.f8432c;
            if (cVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.d dVar3 = this.f8430a;
                int i15 = cVar3.f8797d;
                motionLayout4.B(dVar3, optimizationLevel, i15 == 0 ? i11 : i12, i15 == 0 ? i12 : i11);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            androidx.constraintlayout.core.widgets.d dVar4 = this.f8431b;
            androidx.constraintlayout.widget.c cVar4 = this.f8433d;
            int i16 = (cVar4 == null || cVar4.f8797d == 0) ? i11 : i12;
            if (cVar4 == null || cVar4.f8797d == 0) {
                i11 = i12;
            }
            motionLayout5.B(dVar4, optimizationLevel, i16, i11);
        }

        private void j(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.c cVar) {
            SparseArray sparseArray = new SparseArray();
            d.a aVar = new d.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (!(cVar == null || cVar.f8797d == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.B(this.f8431b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it2 = dVar.x1().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next = it2.next();
                next.F0(true);
                sparseArray.put(((View) next.u()).getId(), next);
            }
            Iterator<ConstraintWidget> it3 = dVar.x1().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next2 = it3.next();
                View view = (View) next2.u();
                cVar.l(view.getId(), aVar);
                next2.q1(cVar.E(view.getId()));
                next2.R0(cVar.z(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.a) {
                    cVar.j((androidx.constraintlayout.widget.a) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).w();
                    }
                }
                aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.p(false, view, next2, aVar, sparseArray);
                if (cVar.D(view.getId()) == 1) {
                    next2.p1(view.getVisibility());
                } else {
                    next2.p1(cVar.C(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it4 = dVar.x1().iterator();
            while (it4.hasNext()) {
                ConstraintWidget next3 = it4.next();
                if (next3 instanceof androidx.constraintlayout.core.widgets.i) {
                    m2.a aVar2 = (m2.a) next3;
                    ((androidx.constraintlayout.widget.a) next3.u()).u(dVar, aVar2, sparseArray);
                    ((androidx.constraintlayout.core.widgets.i) aVar2).z1();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x013d A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r18 = this;
                r0 = r18
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.m> r2 = r2.I
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L_0x0017:
                if (r5 >= r1) goto L_0x0037
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.m r7 = new androidx.constraintlayout.motion.widget.m
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.m> r8 = r8.I
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L_0x0017
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 >= r1) goto L_0x0143
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.m> r7 = r7.I
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                androidx.constraintlayout.motion.widget.m r13 = (androidx.constraintlayout.motion.widget.m) r13
                if (r13 != 0) goto L_0x0051
                r16 = r2
                goto L_0x013d
            L_0x0051:
                androidx.constraintlayout.widget.c r7 = r0.f8432c
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                java.lang.String r11 = "MotionLayout"
                if (r7 == 0) goto L_0x00b2
                androidx.constraintlayout.core.widgets.d r7 = r0.f8430a
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.d(r7, r6)
                if (r7 == 0) goto L_0x007d
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r7 = r8.F0(r7)
                androidx.constraintlayout.widget.c r8 = r0.f8432c
                androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r10.getHeight()
                r13.C(r7, r8, r9, r10)
                goto L_0x00e1
            L_0x007d:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.W
                if (r7 == 0) goto L_0x00e1
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.a.b()
                r7.append(r8)
                r7.append(r12)
                java.lang.String r8 = androidx.constraintlayout.motion.widget.a.d(r6)
                r7.append(r8)
                r7.append(r15)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getName()
                r7.append(r8)
                r7.append(r14)
                java.lang.String r7 = r7.toString()
                android.util.Log.e(r11, r7)
                goto L_0x00e1
            L_0x00b2:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                boolean r7 = r7.f8376a1
                if (r7 == 0) goto L_0x00e1
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, o2.e> r7 = r7.f8379c1
                java.lang.Object r7 = r7.get(r6)
                r8 = r7
                o2.e r8 = (o2.e) r8
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r7.f8377b1
                int r16 = r7.f8380d1
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r17 = r7.f8381e1
                r7 = r13
                r9 = r6
                r4 = r11
                r11 = r16
                r16 = r2
                r2 = r12
                r12 = r17
                r7.D(r8, r9, r10, r11, r12)
                goto L_0x00e5
            L_0x00e1:
                r16 = r2
                r4 = r11
                r2 = r12
            L_0x00e5:
                androidx.constraintlayout.widget.c r7 = r0.f8433d
                if (r7 == 0) goto L_0x013d
                androidx.constraintlayout.core.widgets.d r7 = r0.f8431b
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.d(r7, r6)
                if (r7 == 0) goto L_0x0109
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r2 = r2.F0(r7)
                androidx.constraintlayout.widget.c r4 = r0.f8433d
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r6 = r6.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.getHeight()
                r13.z(r2, r4, r6, r7)
                goto L_0x013d
            L_0x0109:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.W
                if (r7 == 0) goto L_0x013d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.a.b()
                r7.append(r8)
                r7.append(r2)
                java.lang.String r2 = androidx.constraintlayout.motion.widget.a.d(r6)
                r7.append(r2)
                r7.append(r15)
                java.lang.Class r2 = r6.getClass()
                java.lang.String r2 = r2.getName()
                r7.append(r2)
                r7.append(r14)
                java.lang.String r2 = r7.toString()
                android.util.Log.e(r4, r2)
            L_0x013d:
                int r5 = r5 + 1
                r2 = r16
                goto L_0x0038
            L_0x0143:
                r16 = r2
                r4 = 0
            L_0x0146:
                if (r4 >= r1) goto L_0x0167
                r2 = r3[r4]
                r5 = r16
                java.lang.Object r2 = r5.get(r2)
                androidx.constraintlayout.motion.widget.m r2 = (androidx.constraintlayout.motion.widget.m) r2
                int r6 = r2.h()
                r7 = -1
                if (r6 == r7) goto L_0x0162
                java.lang.Object r6 = r5.get(r6)
                androidx.constraintlayout.motion.widget.m r6 = (androidx.constraintlayout.motion.widget.m) r6
                r2.G(r6)
            L_0x0162:
                int r4 = r4 + 1
                r16 = r5
                goto L_0x0146
            L_0x0167:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.f.a():void");
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> x12 = dVar.x1();
            HashMap hashMap = new HashMap();
            hashMap.put(dVar, dVar2);
            dVar2.x1().clear();
            dVar2.n(dVar, hashMap);
            Iterator<ConstraintWidget> it2 = x12.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next = it2.next();
                if (next instanceof androidx.constraintlayout.core.widgets.a) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.a();
                } else if (next instanceof androidx.constraintlayout.core.widgets.f) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.f();
                } else if (next instanceof androidx.constraintlayout.core.widgets.e) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.e();
                } else if (next instanceof androidx.constraintlayout.core.widgets.h) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.h();
                } else if (next instanceof m2.a) {
                    constraintWidget = new m2.b();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                dVar2.a(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it3 = x12.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next2 = it3.next();
                ((ConstraintWidget) hashMap.get(next2)).n(next2, hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        public ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.u() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> x12 = dVar.x1();
            int size = x12.size();
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget = x12.get(i11);
                if (constraintWidget.u() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void e(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.c cVar, androidx.constraintlayout.widget.c cVar2) {
            this.f8432c = cVar;
            this.f8433d = cVar2;
            this.f8430a = new androidx.constraintlayout.core.widgets.d();
            this.f8431b = new androidx.constraintlayout.core.widgets.d();
            this.f8430a.b2(MotionLayout.this.f8696c.O1());
            this.f8431b.b2(MotionLayout.this.f8696c.O1());
            this.f8430a.A1();
            this.f8431b.A1();
            c(MotionLayout.this.f8696c, this.f8430a);
            c(MotionLayout.this.f8696c, this.f8431b);
            if (((double) MotionLayout.this.N) > 0.5d) {
                if (cVar != null) {
                    j(this.f8430a, cVar);
                }
                j(this.f8431b, cVar2);
            } else {
                j(this.f8431b, cVar2);
                if (cVar != null) {
                    j(this.f8430a, cVar);
                }
            }
            this.f8430a.e2(MotionLayout.this.x());
            this.f8430a.g2();
            this.f8431b.e2(MotionLayout.this.x());
            this.f8431b.g2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.f8430a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar2.V0(dimensionBehaviour);
                    this.f8431b.V0(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar3 = this.f8430a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar3.m1(dimensionBehaviour2);
                    this.f8431b.m1(dimensionBehaviour2);
                }
            }
        }

        public boolean f(int i11, int i12) {
            return (i11 == this.f8434e && i12 == this.f8435f) ? false : true;
        }

        public void g(int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.R0 = mode;
            motionLayout.S0 = mode2;
            motionLayout.getOptimizationLevel();
            b(i11, i12);
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                b(i11, i12);
                MotionLayout.this.N0 = this.f8430a.a0();
                MotionLayout.this.O0 = this.f8430a.z();
                MotionLayout.this.P0 = this.f8431b.a0();
                MotionLayout.this.Q0 = this.f8431b.z();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.M0 = (motionLayout2.N0 == motionLayout2.P0 && motionLayout2.O0 == motionLayout2.Q0) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i13 = motionLayout3.N0;
            int i14 = motionLayout3.O0;
            int i15 = motionLayout3.R0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) (((float) i13) + (motionLayout3.T0 * ((float) (motionLayout3.P0 - i13))));
            }
            int i16 = i13;
            int i17 = motionLayout3.S0;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                i14 = (int) (((float) i14) + (motionLayout3.T0 * ((float) (motionLayout3.Q0 - i14))));
            }
            MotionLayout.this.A(i11, i12, i16, i14, this.f8430a.W1() || this.f8431b.W1(), this.f8430a.U1() || this.f8431b.U1());
        }

        public void h() {
            g(MotionLayout.this.F, MotionLayout.this.G);
            MotionLayout.this.E0();
        }

        public void i(int i11, int i12) {
            this.f8434e = i11;
            this.f8435f = i12;
        }
    }

    protected interface g {
        void a(MotionEvent motionEvent);

        float b();

        void c(int i11);

        float d();

        void recycle();
    }

    private static class h implements g {

        /* renamed from: b  reason: collision with root package name */
        private static h f8437b = new h();

        /* renamed from: a  reason: collision with root package name */
        VelocityTracker f8438a;

        private h() {
        }

        public static h e() {
            f8437b.f8438a = VelocityTracker.obtain();
            return f8437b;
        }

        public void a(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f8438a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public float b() {
            VelocityTracker velocityTracker = this.f8438a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        public void c(int i11) {
            VelocityTracker velocityTracker = this.f8438a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i11);
            }
        }

        public float d() {
            VelocityTracker velocityTracker = this.f8438a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        public void recycle() {
            VelocityTracker velocityTracker = this.f8438a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8438a = null;
            }
        }
    }

    class i {

        /* renamed from: a  reason: collision with root package name */
        float f8439a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        float f8440b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        int f8441c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f8442d = -1;

        /* renamed from: e  reason: collision with root package name */
        final String f8443e = "motion.progress";

        /* renamed from: f  reason: collision with root package name */
        final String f8444f = "motion.velocity";

        /* renamed from: g  reason: collision with root package name */
        final String f8445g = "motion.StartState";

        /* renamed from: h  reason: collision with root package name */
        final String f8446h = "motion.EndState";

        i() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i11 = this.f8441c;
            if (!(i11 == -1 && this.f8442d == -1)) {
                if (i11 == -1) {
                    MotionLayout.this.K0(this.f8442d);
                } else {
                    int i12 = this.f8442d;
                    if (i12 == -1) {
                        MotionLayout.this.C0(i11, -1, -1);
                    } else {
                        MotionLayout.this.D0(i11, i12);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.f8440b)) {
                MotionLayout.this.B0(this.f8439a, this.f8440b);
                this.f8439a = Float.NaN;
                this.f8440b = Float.NaN;
                this.f8441c = -1;
                this.f8442d = -1;
            } else if (!Float.isNaN(this.f8439a)) {
                MotionLayout.this.setProgress(this.f8439a);
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f8439a);
            bundle.putFloat("motion.velocity", this.f8440b);
            bundle.putInt("motion.StartState", this.f8441c);
            bundle.putInt("motion.EndState", this.f8442d);
            return bundle;
        }

        public void c() {
            this.f8442d = MotionLayout.this.E;
            this.f8441c = MotionLayout.this.C;
            this.f8440b = MotionLayout.this.getVelocity();
            this.f8439a = MotionLayout.this.getProgress();
        }

        public void d(int i11) {
            this.f8442d = i11;
        }

        public void e(float f11) {
            this.f8439a = f11;
        }

        public void f(int i11) {
            this.f8441c = i11;
        }

        public void g(Bundle bundle) {
            this.f8439a = bundle.getFloat("motion.progress");
            this.f8440b = bundle.getFloat("motion.velocity");
            this.f8441c = bundle.getInt("motion.StartState");
            this.f8442d = bundle.getInt("motion.EndState");
        }

        public void h(float f11) {
            this.f8440b = f11;
        }
    }

    public interface j {
        void a(MotionLayout motionLayout, int i11, int i12, float f11);

        void b(MotionLayout motionLayout, int i11);

        void c(MotionLayout motionLayout, int i11, int i12);

        void d(MotionLayout motionLayout, int i11, boolean z11, float f11);
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v0(attributeSet);
    }

    /* access modifiers changed from: private */
    public void E0() {
        int childCount = getChildCount();
        this.f8386j1.a();
        boolean z11 = true;
        this.R = true;
        SparseArray sparseArray = new SparseArray();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            sparseArray.put(childAt.getId(), this.I.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int i13 = this.f8403y.i();
        if (i13 != -1) {
            for (int i14 = 0; i14 < childCount; i14++) {
                m mVar = this.I.get(getChildAt(i14));
                if (mVar != null) {
                    mVar.A(i13);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.I.size()];
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            m mVar2 = this.I.get(getChildAt(i16));
            if (mVar2.h() != -1) {
                sparseBooleanArray.put(mVar2.h(), true);
                iArr[i15] = mVar2.h();
                i15++;
            }
        }
        if (this.E0 != null) {
            for (int i17 = 0; i17 < i15; i17++) {
                m mVar3 = this.I.get(findViewById(iArr[i17]));
                if (mVar3 != null) {
                    this.f8403y.s(mVar3);
                }
            }
            Iterator<n> it2 = this.E0.iterator();
            while (it2.hasNext()) {
                it2.next().D(this, this.I);
            }
            for (int i18 = 0; i18 < i15; i18++) {
                m mVar4 = this.I.get(findViewById(iArr[i18]));
                if (mVar4 != null) {
                    mVar4.F(width, height, this.L, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < i15; i19++) {
                m mVar5 = this.I.get(findViewById(iArr[i19]));
                if (mVar5 != null) {
                    this.f8403y.s(mVar5);
                    mVar5.F(width, height, this.L, getNanoTime());
                }
            }
        }
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            m mVar6 = this.I.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && mVar6 != null) {
                this.f8403y.s(mVar6);
                mVar6.F(width, height, this.L, getNanoTime());
            }
        }
        float D2 = this.f8403y.D();
        if (D2 != 0.0f) {
            boolean z12 = ((double) D2) < 0.0d;
            float abs = Math.abs(D2);
            float f11 = -3.4028235E38f;
            float f12 = Float.MAX_VALUE;
            int i22 = 0;
            float f13 = Float.MAX_VALUE;
            float f14 = -3.4028235E38f;
            while (true) {
                if (i22 >= childCount) {
                    z11 = false;
                    break;
                }
                m mVar7 = this.I.get(getChildAt(i22));
                if (!Float.isNaN(mVar7.f8558m)) {
                    break;
                }
                float n = mVar7.n();
                float o11 = mVar7.o();
                float f15 = z12 ? o11 - n : o11 + n;
                f13 = Math.min(f13, f15);
                f14 = Math.max(f14, f15);
                i22++;
            }
            if (z11) {
                for (int i23 = 0; i23 < childCount; i23++) {
                    m mVar8 = this.I.get(getChildAt(i23));
                    if (!Float.isNaN(mVar8.f8558m)) {
                        f12 = Math.min(f12, mVar8.f8558m);
                        f11 = Math.max(f11, mVar8.f8558m);
                    }
                }
                while (i11 < childCount) {
                    m mVar9 = this.I.get(getChildAt(i11));
                    if (!Float.isNaN(mVar9.f8558m)) {
                        mVar9.f8559o = 1.0f / (1.0f - abs);
                        if (z12) {
                            mVar9.n = abs - (((f11 - mVar9.f8558m) / (f11 - f12)) * abs);
                        } else {
                            mVar9.n = abs - (((mVar9.f8558m - f12) * abs) / (f11 - f12));
                        }
                    }
                    i11++;
                }
                return;
            }
            while (i11 < childCount) {
                m mVar10 = this.I.get(getChildAt(i11));
                float n11 = mVar10.n();
                float o12 = mVar10.o();
                float f16 = z12 ? o12 - n11 : o12 + n11;
                mVar10.f8559o = 1.0f / (1.0f - abs);
                mVar10.n = abs - (((f16 - f13) * abs) / (f14 - f13));
                i11++;
            }
        }
    }

    /* access modifiers changed from: private */
    public Rect F0(ConstraintWidget constraintWidget) {
        this.f8383g1.top = constraintWidget.c0();
        this.f8383g1.left = constraintWidget.b0();
        Rect rect = this.f8383g1;
        int a02 = constraintWidget.a0();
        Rect rect2 = this.f8383g1;
        rect.right = a02 + rect2.left;
        int z11 = constraintWidget.z();
        Rect rect3 = this.f8383g1;
        rect2.bottom = z11 + rect3.top;
        return rect3;
    }

    private static boolean Q0(float f11, float f12, float f13) {
        if (f11 > 0.0f) {
            float f14 = f11 / f13;
            return f12 + ((f11 * f14) - (((f13 * f14) * f14) / 2.0f)) > 1.0f;
        }
        float f15 = (-f11) / f13;
        return f12 + ((f11 * f15) + (((f13 * f15) * f15) / 2.0f)) < 0.0f;
    }

    private boolean f0(View view, MotionEvent motionEvent, float f11, float f12) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f11, f12);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f11, -f12);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f11, f12);
        if (this.f8391n1 == null) {
            this.f8391n1 = new Matrix();
        }
        matrix.invert(this.f8391n1);
        obtain.transform(this.f8391n1);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void g0() {
        q qVar = this.f8403y;
        if (qVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int E2 = qVar.E();
        q qVar2 = this.f8403y;
        h0(E2, qVar2.k(qVar2.E()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<q.b> it2 = this.f8403y.n().iterator();
        while (it2.hasNext()) {
            q.b next = it2.next();
            if (next == this.f8403y.f8588c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            i0(next);
            int A2 = next.A();
            int y11 = next.y();
            String c11 = a.c(getContext(), A2);
            String c12 = a.c(getContext(), y11);
            if (sparseIntArray.get(A2) == y11) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + c11 + "->" + c12);
            }
            if (sparseIntArray2.get(y11) == A2) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + c11 + "->" + c12);
            }
            sparseIntArray.put(A2, y11);
            sparseIntArray2.put(y11, A2);
            if (this.f8403y.k(A2) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + c11);
            }
            if (this.f8403y.k(y11) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + c11);
            }
        }
    }

    private void h0(int i11, androidx.constraintlayout.widget.c cVar) {
        String c11 = a.c(getContext(), i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            if (id2 == -1) {
                Log.w("MotionLayout", "CHECK: " + c11 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (cVar.y(id2) == null) {
                Log.w("MotionLayout", "CHECK: " + c11 + " NO CONSTRAINTS for " + a.d(childAt));
            }
        }
        int[] A2 = cVar.A();
        for (int i13 = 0; i13 < A2.length; i13++) {
            int i14 = A2[i13];
            String c12 = a.c(getContext(), i14);
            if (findViewById(A2[i13]) == null) {
                Log.w("MotionLayout", "CHECK: " + c11 + " NO View matches id " + c12);
            }
            if (cVar.z(i14) == -1) {
                Log.w("MotionLayout", "CHECK: " + c11 + "(" + c12 + ") no LAYOUT_HEIGHT");
            }
            if (cVar.E(i14) == -1) {
                Log.w("MotionLayout", "CHECK: " + c11 + "(" + c12 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void i0(q.b bVar) {
        if (bVar.A() == bVar.y()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void j0() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            m mVar = this.I.get(childAt);
            if (mVar != null) {
                mVar.B(childAt);
            }
        }
    }

    private void m0() {
        boolean z11;
        float signum = Math.signum(this.P - this.N);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f8405z;
        float f11 = this.N + (!(interpolator instanceof o2.b) ? ((((float) (nanoTime - this.O)) * signum) * 1.0E-9f) / this.L : 0.0f);
        if (this.Q) {
            f11 = this.P;
        }
        int i11 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i11 <= 0 || f11 < this.P) && (signum > 0.0f || f11 > this.P)) {
            z11 = false;
        } else {
            f11 = this.P;
            z11 = true;
        }
        if (interpolator != null && !z11) {
            if (this.f8390n0) {
                f11 = interpolator.getInterpolation(((float) (nanoTime - this.K)) * 1.0E-9f);
            } else {
                f11 = interpolator.getInterpolation(f11);
            }
        }
        if ((i11 > 0 && f11 >= this.P) || (signum <= 0.0f && f11 <= this.P)) {
            f11 = this.P;
        }
        this.T0 = f11;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.A;
        if (interpolator2 != null) {
            f11 = interpolator2.getInterpolation(f11);
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            m mVar = this.I.get(childAt);
            if (mVar != null) {
                mVar.u(childAt, f11, nanoTime2, this.U0);
            }
        }
        if (this.M0) {
            requestLayout();
        }
    }

    private void n0() {
        CopyOnWriteArrayList<j> copyOnWriteArrayList;
        if ((this.T != null || ((copyOnWriteArrayList = this.F0) != null && !copyOnWriteArrayList.isEmpty())) && this.K0 != this.M) {
            if (this.J0 != -1) {
                j jVar = this.T;
                if (jVar != null) {
                    jVar.c(this, this.C, this.E);
                }
                CopyOnWriteArrayList<j> copyOnWriteArrayList2 = this.F0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<j> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().c(this, this.C, this.E);
                    }
                }
                this.L0 = true;
            }
            this.J0 = -1;
            float f11 = this.M;
            this.K0 = f11;
            j jVar2 = this.T;
            if (jVar2 != null) {
                jVar2.a(this, this.C, this.E, f11);
            }
            CopyOnWriteArrayList<j> copyOnWriteArrayList3 = this.F0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<j> it3 = copyOnWriteArrayList3.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this, this.C, this.E, this.M);
                }
            }
            this.L0 = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean u0(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.u0(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0075
            android.graphics.RectF r2 = r7.f8388l1
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.f8388l1
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0075
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.f0(r10, r11, r8, r9)
            if (r8 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.u0(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    private void v0(AttributeSet attributeSet) {
        q qVar;
        f8375p1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z11 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.f8403y = new q(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.D = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.P = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.R = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z11 = obtainStyledAttributes.getBoolean(index, z11);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.W == 0) {
                        this.W = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    this.W = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f8403y == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z11) {
                this.f8403y = null;
            }
        }
        if (this.W != 0) {
            g0();
        }
        if (this.D == -1 && (qVar = this.f8403y) != null) {
            this.D = qVar.E();
            this.C = this.f8403y.E();
            this.E = this.f8403y.p();
        }
    }

    private void z0() {
        CopyOnWriteArrayList<j> copyOnWriteArrayList;
        if (this.T != null || ((copyOnWriteArrayList = this.F0) != null && !copyOnWriteArrayList.isEmpty())) {
            this.L0 = false;
            Iterator<Integer> it2 = this.f8393o1.iterator();
            while (it2.hasNext()) {
                Integer next = it2.next();
                j jVar = this.T;
                if (jVar != null) {
                    jVar.b(this, next.intValue());
                }
                CopyOnWriteArrayList<j> copyOnWriteArrayList2 = this.F0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<j> it3 = copyOnWriteArrayList2.iterator();
                    while (it3.hasNext()) {
                        it3.next().b(this, next.intValue());
                    }
                }
            }
            this.f8393o1.clear();
        }
    }

    public void A0() {
        this.f8386j1.h();
        invalidate();
    }

    public void B0(float f11, float f12) {
        if (!isAttachedToWindow()) {
            if (this.W0 == null) {
                this.W0 = new i();
            }
            this.W0.e(f11);
            this.W0.h(f12);
            return;
        }
        setProgress(f11);
        setState(TransitionState.MOVING);
        this.B = f12;
        float f13 = 1.0f;
        int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            if (i11 <= 0) {
                f13 = 0.0f;
            }
            e0(f13);
        } else if (f11 != 0.0f && f11 != 1.0f) {
            if (f11 <= 0.5f) {
                f13 = 0.0f;
            }
            e0(f13);
        }
    }

    public void C0(int i11, int i12, int i13) {
        setState(TransitionState.SETUP);
        this.D = i11;
        this.C = -1;
        this.E = -1;
        androidx.constraintlayout.widget.b bVar = this.k;
        if (bVar != null) {
            bVar.d(i11, (float) i12, (float) i13);
            return;
        }
        q qVar = this.f8403y;
        if (qVar != null) {
            qVar.k(i11).i(this);
        }
    }

    public void D0(int i11, int i12) {
        if (!isAttachedToWindow()) {
            if (this.W0 == null) {
                this.W0 = new i();
            }
            this.W0.f(i11);
            this.W0.d(i12);
            return;
        }
        q qVar = this.f8403y;
        if (qVar != null) {
            this.C = i11;
            this.E = i12;
            qVar.W(i11, i12);
            this.f8386j1.e(this.f8696c, this.f8403y.k(i11), this.f8403y.k(i12));
            A0();
            this.N = 0.0f;
            J0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r10 != 7) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G0(int r10, float r11, float r12) {
        /*
            r9 = this;
            androidx.constraintlayout.motion.widget.q r0 = r9.f8403y
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r9.N
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r9.f8390n0 = r0
            long r1 = r9.getNanoTime()
            r9.K = r1
            androidx.constraintlayout.motion.widget.q r1 = r9.f8403y
            int r1 = r1.o()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.L = r1
            r9.P = r11
            r9.R = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L_0x0093
            if (r10 == r0) goto L_0x0093
            if (r10 == r4) goto L_0x0093
            r5 = 4
            if (r10 == r5) goto L_0x0081
            r5 = 5
            if (r10 == r5) goto L_0x003b
            if (r10 == r3) goto L_0x0093
            if (r10 == r2) goto L_0x0093
            goto L_0x00f1
        L_0x003b:
            float r10 = r9.N
            androidx.constraintlayout.motion.widget.q r0 = r9.f8403y
            float r0 = r0.t()
            boolean r10 = Q0(r12, r10, r0)
            if (r10 == 0) goto L_0x005c
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f8394p0
            float r11 = r9.N
            androidx.constraintlayout.motion.widget.q r0 = r9.f8403y
            float r0 = r0.t()
            r10.b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f8394p0
            r9.f8405z = r10
            goto L_0x00f1
        L_0x005c:
            o2.b r2 = r9.f8392o0
            float r3 = r9.N
            float r6 = r9.L
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            float r7 = r10.t()
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            float r8 = r10.u()
            r4 = r11
            r5 = r12
            r2.b(r3, r4, r5, r6, r7, r8)
            r9.B = r1
            int r10 = r9.D
            r9.P = r11
            r9.D = r10
            o2.b r10 = r9.f8392o0
            r9.f8405z = r10
            goto L_0x00f1
        L_0x0081:
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f8394p0
            float r11 = r9.N
            androidx.constraintlayout.motion.widget.q r0 = r9.f8403y
            float r0 = r0.t()
            r10.b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f8394p0
            r9.f8405z = r10
            goto L_0x00f1
        L_0x0093:
            if (r10 == r0) goto L_0x009f
            if (r10 != r2) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            if (r10 == r4) goto L_0x009c
            if (r10 != r3) goto L_0x00a0
        L_0x009c:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a0
        L_0x009f:
            r11 = 0
        L_0x00a0:
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            int r10 = r10.j()
            if (r10 != 0) goto L_0x00c0
            o2.b r0 = r9.f8392o0
            float r1 = r9.N
            float r4 = r9.L
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            float r5 = r10.t()
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            float r6 = r10.u()
            r2 = r11
            r3 = r12
            r0.b(r1, r2, r3, r4, r5, r6)
            goto L_0x00e7
        L_0x00c0:
            o2.b r0 = r9.f8392o0
            float r1 = r9.N
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            float r4 = r10.A()
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            float r5 = r10.B()
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            float r6 = r10.z()
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            float r7 = r10.C()
            androidx.constraintlayout.motion.widget.q r10 = r9.f8403y
            int r8 = r10.y()
            r2 = r11
            r3 = r12
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00e7:
            int r10 = r9.D
            r9.P = r11
            r9.D = r10
            o2.b r10 = r9.f8392o0
            r9.f8405z = r10
        L_0x00f1:
            r10 = 0
            r9.Q = r10
            long r10 = r9.getNanoTime()
            r9.K = r10
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.G0(int, float, float):void");
    }

    public void H0() {
        e0(1.0f);
        this.X0 = null;
    }

    public void I0(Runnable runnable) {
        e0(1.0f);
        this.X0 = runnable;
    }

    public void J0() {
        e0(0.0f);
    }

    public void K0(int i11) {
        if (!isAttachedToWindow()) {
            if (this.W0 == null) {
                this.W0 = new i();
            }
            this.W0.d(i11);
            return;
        }
        L0(i11, -1, -1);
    }

    public void L0(int i11, int i12, int i13) {
        M0(i11, i12, i13, -1);
    }

    public void M0(int i11, int i12, int i13, int i14) {
        androidx.constraintlayout.widget.h hVar;
        int a11;
        q qVar = this.f8403y;
        if (!(qVar == null || (hVar = qVar.f8587b) == null || (a11 = hVar.a(this.D, i11, (float) i12, (float) i13)) == -1)) {
            i11 = a11;
        }
        int i15 = this.D;
        if (i15 != i11) {
            if (this.C == i11) {
                e0(0.0f);
                if (i14 > 0) {
                    this.L = ((float) i14) / 1000.0f;
                }
            } else if (this.E == i11) {
                e0(1.0f);
                if (i14 > 0) {
                    this.L = ((float) i14) / 1000.0f;
                }
            } else {
                this.E = i11;
                if (i15 != -1) {
                    D0(i15, i11);
                    e0(1.0f);
                    this.N = 0.0f;
                    H0();
                    if (i14 > 0) {
                        this.L = ((float) i14) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f8390n0 = false;
                this.P = 1.0f;
                this.M = 0.0f;
                this.N = 0.0f;
                this.O = getNanoTime();
                this.K = getNanoTime();
                this.Q = false;
                this.f8405z = null;
                if (i14 == -1) {
                    this.L = ((float) this.f8403y.o()) / 1000.0f;
                }
                this.C = -1;
                this.f8403y.W(-1, this.E);
                SparseArray sparseArray = new SparseArray();
                if (i14 == 0) {
                    this.L = ((float) this.f8403y.o()) / 1000.0f;
                } else if (i14 > 0) {
                    this.L = ((float) i14) / 1000.0f;
                }
                int childCount = getChildCount();
                this.I.clear();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    this.I.put(childAt, new m(childAt));
                    sparseArray.put(childAt.getId(), this.I.get(childAt));
                }
                this.R = true;
                this.f8386j1.e(this.f8696c, (androidx.constraintlayout.widget.c) null, this.f8403y.k(i11));
                A0();
                this.f8386j1.a();
                j0();
                int width = getWidth();
                int height = getHeight();
                if (this.E0 != null) {
                    for (int i17 = 0; i17 < childCount; i17++) {
                        m mVar = this.I.get(getChildAt(i17));
                        if (mVar != null) {
                            this.f8403y.s(mVar);
                        }
                    }
                    Iterator<n> it2 = this.E0.iterator();
                    while (it2.hasNext()) {
                        it2.next().D(this, this.I);
                    }
                    for (int i18 = 0; i18 < childCount; i18++) {
                        m mVar2 = this.I.get(getChildAt(i18));
                        if (mVar2 != null) {
                            mVar2.F(width, height, this.L, getNanoTime());
                        }
                    }
                } else {
                    for (int i19 = 0; i19 < childCount; i19++) {
                        m mVar3 = this.I.get(getChildAt(i19));
                        if (mVar3 != null) {
                            this.f8403y.s(mVar3);
                            mVar3.F(width, height, this.L, getNanoTime());
                        }
                    }
                }
                float D2 = this.f8403y.D();
                if (D2 != 0.0f) {
                    float f11 = Float.MAX_VALUE;
                    float f12 = -3.4028235E38f;
                    for (int i21 = 0; i21 < childCount; i21++) {
                        m mVar4 = this.I.get(getChildAt(i21));
                        float o11 = mVar4.o() + mVar4.n();
                        f11 = Math.min(f11, o11);
                        f12 = Math.max(f12, o11);
                    }
                    for (int i22 = 0; i22 < childCount; i22++) {
                        m mVar5 = this.I.get(getChildAt(i22));
                        float n = mVar5.n();
                        float o12 = mVar5.o();
                        mVar5.f8559o = 1.0f / (1.0f - D2);
                        mVar5.n = D2 - ((((n + o12) - f11) * D2) / (f12 - f11));
                    }
                }
                this.M = 0.0f;
                this.N = 0.0f;
                this.R = true;
                invalidate();
            }
        }
    }

    public void N0() {
        this.f8386j1.e(this.f8696c, this.f8403y.k(this.C), this.f8403y.k(this.E));
        A0();
    }

    public void O0(int i11, androidx.constraintlayout.widget.c cVar) {
        q qVar = this.f8403y;
        if (qVar != null) {
            qVar.T(i11, cVar);
        }
        N0();
        if (this.D == i11) {
            cVar.i(this);
        }
    }

    public void P0(int i11, View... viewArr) {
        q qVar = this.f8403y;
        if (qVar != null) {
            qVar.b0(i11, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        u uVar;
        ArrayList<n> arrayList = this.E0;
        if (arrayList != null) {
            Iterator<n> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().C(canvas);
            }
        }
        l0(false);
        q qVar = this.f8403y;
        if (!(qVar == null || (uVar = qVar.f8600s) == null)) {
            uVar.c();
        }
        super.dispatchDraw(canvas);
        if (this.f8403y != null) {
            if ((this.W & 1) == 1 && !isInEditMode()) {
                this.G0++;
                long nanoTime = getNanoTime();
                long j11 = this.H0;
                if (j11 != -1) {
                    long j12 = nanoTime - j11;
                    if (j12 > 200000000) {
                        this.I0 = ((float) ((int) ((((float) this.G0) / (((float) j12) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.G0 = 0;
                        this.H0 = nanoTime;
                    }
                } else {
                    this.H0 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.I0 + " fps " + a.e(this, this.C) + " -> ");
                sb2.append(a.e(this, this.E));
                sb2.append(" (progress: ");
                sb2.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
                sb2.append(" ) state=");
                int i11 = this.D;
                sb2.append(i11 == -1 ? "undefined" : a.e(this, i11));
                String sb3 = sb2.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb3, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb3, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.W > 1) {
                if (this.f8378c0 == null) {
                    this.f8378c0 = new e();
                }
                this.f8378c0.a(canvas, this.I, this.f8403y.o(), this.W);
            }
            ArrayList<n> arrayList2 = this.E0;
            if (arrayList2 != null) {
                Iterator<n> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().B(canvas);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e0(float f11) {
        q qVar = this.f8403y;
        if (qVar != null) {
            float f12 = this.N;
            float f13 = this.M;
            if (f12 != f13 && this.Q) {
                this.N = f13;
            }
            float f14 = this.N;
            if (f14 != f11) {
                this.f8390n0 = false;
                this.P = f11;
                this.L = ((float) qVar.o()) / 1000.0f;
                setProgress(this.P);
                this.f8405z = null;
                this.A = this.f8403y.r();
                this.Q = false;
                this.K = getNanoTime();
                this.R = true;
                this.M = f14;
                this.N = f14;
                invalidate();
            }
        }
    }

    public int[] getConstraintSetIds() {
        q qVar = this.f8403y;
        if (qVar == null) {
            return null;
        }
        return qVar.m();
    }

    public int getCurrentState() {
        return this.D;
    }

    public ArrayList<q.b> getDefinedTransitions() {
        q qVar = this.f8403y;
        if (qVar == null) {
            return null;
        }
        return qVar.n();
    }

    public b getDesignTool() {
        if (this.f8395q0 == null) {
            this.f8395q0 = new b(this);
        }
        return this.f8395q0;
    }

    public int getEndState() {
        return this.E;
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.N;
    }

    public q getScene() {
        return this.f8403y;
    }

    public int getStartState() {
        return this.C;
    }

    public float getTargetPosition() {
        return this.P;
    }

    public Bundle getTransitionState() {
        if (this.W0 == null) {
            this.W0 = new i();
        }
        this.W0.c();
        return this.W0.b();
    }

    public long getTransitionTimeMs() {
        q qVar = this.f8403y;
        if (qVar != null) {
            this.L = ((float) qVar.o()) / 1000.0f;
        }
        return (long) (this.L * 1000.0f);
    }

    public float getVelocity() {
        return this.B;
    }

    public void h(View view, View view2, int i11, int i12) {
        this.f8406z0 = getNanoTime();
        this.A0 = 0.0f;
        this.f8402x0 = 0.0f;
        this.f8404y0 = 0.0f;
    }

    public void i(View view, int i11) {
        q qVar = this.f8403y;
        if (qVar != null) {
            float f11 = this.A0;
            if (f11 != 0.0f) {
                qVar.P(this.f8402x0 / f11, this.f8404y0 / f11);
            }
        }
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void j(View view, int i11, int i12, int i13, int i14, int i15) {
    }

    /* access modifiers changed from: package-private */
    public void k0(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            m mVar = this.I.get(getChildAt(i11));
            if (mVar != null) {
                mVar.f(z11);
            }
        }
    }

    public void l(View view, int i11, int i12, int[] iArr, int i13) {
        q.b bVar;
        r B2;
        int q;
        q qVar = this.f8403y;
        if (qVar != null && (bVar = qVar.f8588c) != null && bVar.C()) {
            int i14 = -1;
            if (!bVar.C() || (B2 = bVar.B()) == null || (q = B2.q()) == -1 || view.getId() == q) {
                if (qVar.v()) {
                    r B3 = bVar.B();
                    if (!(B3 == null || (B3.e() & 4) == 0)) {
                        i14 = i12;
                    }
                    float f11 = this.M;
                    if ((f11 == 1.0f || f11 == 0.0f) && view.canScrollVertically(i14)) {
                        return;
                    }
                }
                if (!(bVar.B() == null || (bVar.B().e() & 1) == 0)) {
                    float w11 = qVar.w((float) i11, (float) i12);
                    float f12 = this.N;
                    if ((f12 <= 0.0f && w11 < 0.0f) || (f12 >= 1.0f && w11 > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new a(this, view));
                        return;
                    }
                }
                float f13 = this.M;
                long nanoTime = getNanoTime();
                float f14 = (float) i11;
                this.f8402x0 = f14;
                float f15 = (float) i12;
                this.f8404y0 = f15;
                this.A0 = (float) (((double) (nanoTime - this.f8406z0)) * 1.0E-9d);
                this.f8406z0 = nanoTime;
                qVar.O(f14, f15);
                if (f13 != this.M) {
                    iArr[0] = i11;
                    iArr[1] = i12;
                }
                l0(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f8401w0 = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l0(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            long r1 = r0.O
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            long r1 = r23.getNanoTime()
            r0.O = r1
        L_0x0010:
            float r1 = r0.N
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0020
            r0.D = r2
        L_0x0020:
            boolean r5 = r0.B0
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0032
            boolean r5 = r0.R
            if (r5 == 0) goto L_0x0244
            if (r24 != 0) goto L_0x0032
            float r5 = r0.P
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0244
        L_0x0032:
            float r5 = r0.P
            float r5 = r5 - r1
            float r1 = java.lang.Math.signum(r5)
            long r8 = r23.getNanoTime()
            android.view.animation.Interpolator r5 = r0.f8405z
            boolean r10 = r5 instanceof androidx.constraintlayout.motion.widget.o
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0053
            long r12 = r0.O
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.L
            float r10 = r10 / r12
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            float r12 = r0.N
            float r12 = r12 + r10
            boolean r13 = r0.Q
            if (r13 == 0) goto L_0x005d
            float r12 = r0.P
        L_0x005d:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x0067
            float r14 = r0.P
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0071
        L_0x0067:
            int r14 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
            float r14 = r0.P
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
        L_0x0071:
            float r12 = r0.P
            r0.R = r7
            r14 = 1
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            r0.N = r12
            r0.M = r12
            r0.O = r8
            r15 = 2
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r5 == 0) goto L_0x0108
            if (r14 != 0) goto L_0x0108
            boolean r14 = r0.f8390n0
            if (r14 == 0) goto L_0x00e8
            long r2 = r0.K
            long r2 = r8 - r2
            float r2 = (float) r2
            float r2 = r2 * r11
            float r2 = r5.getInterpolation(r2)
            android.view.animation.Interpolator r3 = r0.f8405z
            o2.b r5 = r0.f8392o0
            if (r3 != r5) goto L_0x00a5
            boolean r3 = r5.c()
            if (r3 == 0) goto L_0x00a3
            r3 = 2
            goto L_0x00a6
        L_0x00a3:
            r3 = 1
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            r0.N = r2
            r0.O = r8
            android.view.animation.Interpolator r5 = r0.f8405z
            boolean r8 = r5 instanceof androidx.constraintlayout.motion.widget.o
            if (r8 == 0) goto L_0x00e6
            androidx.constraintlayout.motion.widget.o r5 = (androidx.constraintlayout.motion.widget.o) r5
            float r5 = r5.a()
            r0.B = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.L
            float r8 = r8 * r9
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x00c8
            if (r3 != r15) goto L_0x00c8
            r0.R = r7
        L_0x00c8:
            int r8 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d8
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00d8
            r0.N = r8
            r0.R = r7
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00d8:
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e6
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 > 0) goto L_0x00e6
            r0.N = r4
            r0.R = r7
            r12 = 0
            goto L_0x010b
        L_0x00e6:
            r12 = r2
            goto L_0x010b
        L_0x00e8:
            float r2 = r5.getInterpolation(r12)
            android.view.animation.Interpolator r3 = r0.f8405z
            boolean r5 = r3 instanceof androidx.constraintlayout.motion.widget.o
            if (r5 == 0) goto L_0x00fb
            androidx.constraintlayout.motion.widget.o r3 = (androidx.constraintlayout.motion.widget.o) r3
            float r3 = r3.a()
            r0.B = r3
            goto L_0x0106
        L_0x00fb:
            float r12 = r12 + r10
            float r3 = r3.getInterpolation(r12)
            float r3 = r3 - r2
            float r3 = r3 * r1
            float r3 = r3 / r10
            r0.B = r3
        L_0x0106:
            r12 = r2
            goto L_0x010a
        L_0x0108:
            r0.B = r10
        L_0x010a:
            r3 = 0
        L_0x010b:
            float r2 = r0.B
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x011a
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r2)
        L_0x011a:
            if (r3 == r6) goto L_0x0143
            if (r13 <= 0) goto L_0x0124
            float r2 = r0.P
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x012e
        L_0x0124:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
            float r2 = r0.P
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
        L_0x012e:
            float r12 = r0.P
            r0.R = r7
        L_0x0132:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x013c
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0143
        L_0x013c:
            r0.R = r7
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
        L_0x0143:
            int r2 = r23.getChildCount()
            r0.B0 = r7
            long r8 = r23.getNanoTime()
            r0.T0 = r12
            android.view.animation.Interpolator r3 = r0.A
            if (r3 != 0) goto L_0x0155
            r3 = r12
            goto L_0x0159
        L_0x0155:
            float r3 = r3.getInterpolation(r12)
        L_0x0159:
            android.view.animation.Interpolator r5 = r0.A
            if (r5 == 0) goto L_0x0171
            float r10 = r0.L
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r5 = r5.getInterpolation(r10)
            r0.B = r5
            android.view.animation.Interpolator r10 = r0.A
            float r10 = r10.getInterpolation(r12)
            float r5 = r5 - r10
            r0.B = r5
        L_0x0171:
            r5 = 0
        L_0x0172:
            if (r5 >= r2) goto L_0x019a
            android.view.View r10 = r0.getChildAt(r5)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.m> r11 = r0.I
            java.lang.Object r11 = r11.get(r10)
            r17 = r11
            androidx.constraintlayout.motion.widget.m r17 = (androidx.constraintlayout.motion.widget.m) r17
            if (r17 == 0) goto L_0x0197
            boolean r11 = r0.B0
            i2.d r15 = r0.U0
            r18 = r10
            r19 = r3
            r20 = r8
            r22 = r15
            boolean r10 = r17.u(r18, r19, r20, r22)
            r10 = r10 | r11
            r0.B0 = r10
        L_0x0197:
            int r5 = r5 + 1
            goto L_0x0172
        L_0x019a:
            if (r13 <= 0) goto L_0x01a2
            float r2 = r0.P
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01ac
        L_0x01a2:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01ae
            float r2 = r0.P
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01ae
        L_0x01ac:
            r2 = 1
            goto L_0x01af
        L_0x01ae:
            r2 = 0
        L_0x01af:
            boolean r3 = r0.B0
            if (r3 != 0) goto L_0x01be
            boolean r3 = r0.R
            if (r3 != 0) goto L_0x01be
            if (r2 == 0) goto L_0x01be
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L_0x01be:
            boolean r3 = r0.M0
            if (r3 == 0) goto L_0x01c5
            r23.requestLayout()
        L_0x01c5:
            boolean r3 = r0.B0
            r2 = r2 ^ r6
            r2 = r2 | r3
            r0.B0 = r2
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01e9
            int r2 = r0.C
            r3 = -1
            if (r2 == r3) goto L_0x01e9
            int r3 = r0.D
            if (r3 == r2) goto L_0x01e9
            r0.D = r2
            androidx.constraintlayout.motion.widget.q r3 = r0.f8403y
            androidx.constraintlayout.widget.c r2 = r3.k(r2)
            r2.g(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            r7 = 1
        L_0x01e9:
            double r2 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0207
            int r2 = r0.D
            int r3 = r0.E
            if (r2 == r3) goto L_0x0207
            r0.D = r3
            androidx.constraintlayout.motion.widget.q r2 = r0.f8403y
            androidx.constraintlayout.widget.c r2 = r2.k(r3)
            r2.g(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            r7 = 1
        L_0x0207:
            boolean r2 = r0.B0
            if (r2 != 0) goto L_0x0226
            boolean r2 = r0.R
            if (r2 == 0) goto L_0x0210
            goto L_0x0226
        L_0x0210:
            if (r13 <= 0) goto L_0x0218
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0220
        L_0x0218:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0229
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0229
        L_0x0220:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            goto L_0x0229
        L_0x0226:
            r23.invalidate()
        L_0x0229:
            boolean r2 = r0.B0
            if (r2 != 0) goto L_0x0244
            boolean r2 = r0.R
            if (r2 != 0) goto L_0x0244
            if (r13 <= 0) goto L_0x0239
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0241
        L_0x0239:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0244
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0244
        L_0x0241:
            r23.y0()
        L_0x0244:
            float r1 = r0.N
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0258
            int r1 = r0.D
            int r2 = r0.E
            if (r1 == r2) goto L_0x0253
            goto L_0x0254
        L_0x0253:
            r6 = r7
        L_0x0254:
            r0.D = r2
        L_0x0256:
            r7 = r6
            goto L_0x0267
        L_0x0258:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0267
            int r1 = r0.D
            int r2 = r0.C
            if (r1 == r2) goto L_0x0263
            goto L_0x0264
        L_0x0263:
            r6 = r7
        L_0x0264:
            r0.D = r2
            goto L_0x0256
        L_0x0267:
            boolean r1 = r0.f8387k1
            r1 = r1 | r7
            r0.f8387k1 = r1
            if (r7 == 0) goto L_0x0275
            boolean r1 = r0.V0
            if (r1 != 0) goto L_0x0275
            r23.requestLayout()
        L_0x0275:
            float r1 = r0.N
            r0.M = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.l0(boolean):void");
    }

    public void n(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (!(!this.f8401w0 && i11 == 0 && i12 == 0)) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
        }
        this.f8401w0 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.f8588c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.q r1 = r0.f8403y
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.q$b r1 = r1.f8588c
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.r r1 = r1.B()
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.q r1 = r0.f8403y
            androidx.constraintlayout.motion.widget.q$b r1 = r1.f8588c
            androidx.constraintlayout.motion.widget.r r1 = r1.B()
            int r1 = r1.e()
            r1 = r1 & 2
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 1
            return r1
        L_0x0021:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.o(android.view.View, android.view.View, int, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void o0() {
        int i11;
        CopyOnWriteArrayList<j> copyOnWriteArrayList;
        if ((this.T != null || ((copyOnWriteArrayList = this.F0) != null && !copyOnWriteArrayList.isEmpty())) && this.J0 == -1) {
            this.J0 = this.D;
            if (!this.f8393o1.isEmpty()) {
                ArrayList<Integer> arrayList = this.f8393o1;
                i11 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i11 = -1;
            }
            int i12 = this.D;
            if (!(i11 == i12 || i12 == -1)) {
                this.f8393o1.add(Integer.valueOf(i12));
            }
        }
        z0();
        Runnable runnable = this.X0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.Y0;
        if (iArr != null && this.Z0 > 0) {
            K0(iArr[0]);
            int[] iArr2 = this.Y0;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.Z0--;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        q.b bVar;
        int i11;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f8382f1 = display.getRotation();
        }
        q qVar = this.f8403y;
        if (!(qVar == null || (i11 = this.D) == -1)) {
            androidx.constraintlayout.widget.c k = qVar.k(i11);
            this.f8403y.S(this);
            ArrayList<n> arrayList = this.E0;
            if (arrayList != null) {
                Iterator<n> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().A(this);
                }
            }
            if (k != null) {
                k.i(this);
            }
            this.C = this.D;
        }
        y0();
        i iVar = this.W0;
        if (iVar == null) {
            q qVar2 = this.f8403y;
            if (qVar2 != null && (bVar = qVar2.f8588c) != null && bVar.x() == 4) {
                H0();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            }
        } else if (this.f8384h1) {
            post(new b());
        } else {
            iVar.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        r B2;
        int q;
        RectF p11;
        q qVar = this.f8403y;
        if (qVar != null && this.H) {
            u uVar = qVar.f8600s;
            if (uVar != null) {
                uVar.g(motionEvent);
            }
            q.b bVar = this.f8403y.f8588c;
            if (bVar != null && bVar.C() && (B2 = bVar.B()) != null && ((motionEvent.getAction() != 0 || (p11 = B2.p(this, new RectF())) == null || p11.contains(motionEvent.getX(), motionEvent.getY())) && (q = B2.q()) != -1)) {
                View view = this.f8389m1;
                if (view == null || view.getId() != q) {
                    this.f8389m1 = findViewById(q);
                }
                View view2 = this.f8389m1;
                if (view2 != null) {
                    this.f8388l1.set((float) view2.getLeft(), (float) this.f8389m1.getTop(), (float) this.f8389m1.getRight(), (float) this.f8389m1.getBottom());
                    if (this.f8388l1.contains(motionEvent.getX(), motionEvent.getY()) && !u0((float) this.f8389m1.getLeft(), (float) this.f8389m1.getTop(), this.f8389m1, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.V0 = true;
        try {
            if (this.f8403y == null) {
                super.onLayout(z11, i11, i12, i13, i14);
                return;
            }
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            if (!(this.f8399u0 == i15 && this.f8400v0 == i16)) {
                A0();
                l0(true);
            }
            this.f8399u0 = i15;
            this.f8400v0 = i16;
            this.f8397s0 = i15;
            this.f8398t0 = i16;
            this.V0 = false;
        } finally {
            this.V0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i11, int i12) {
        if (this.f8403y == null) {
            super.onMeasure(i11, i12);
            return;
        }
        boolean z11 = false;
        boolean z12 = (this.F == i11 && this.G == i12) ? false : true;
        if (this.f8387k1) {
            this.f8387k1 = false;
            y0();
            z0();
            z12 = true;
        }
        if (this.f8701h) {
            z12 = true;
        }
        this.F = i11;
        this.G = i12;
        int E2 = this.f8403y.E();
        int p11 = this.f8403y.p();
        if ((z12 || this.f8386j1.f(E2, p11)) && this.C != -1) {
            super.onMeasure(i11, i12);
            this.f8386j1.e(this.f8696c, this.f8403y.k(E2), this.f8403y.k(p11));
            this.f8386j1.h();
            this.f8386j1.i(E2, p11);
        } else {
            if (z12) {
                super.onMeasure(i11, i12);
            }
            z11 = true;
        }
        if (this.M0 || z11) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int a02 = this.f8696c.a0() + getPaddingLeft() + getPaddingRight();
            int z13 = this.f8696c.z() + paddingTop;
            int i13 = this.R0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                int i14 = this.N0;
                a02 = (int) (((float) i14) + (this.T0 * ((float) (this.P0 - i14))));
                requestLayout();
            }
            int i15 = this.S0;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                int i16 = this.O0;
                z13 = (int) (((float) i16) + (this.T0 * ((float) (this.Q0 - i16))));
                requestLayout();
            }
            setMeasuredDimension(a02, z13);
        }
        m0();
    }

    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    public void onRtlPropertiesChanged(int i11) {
        q qVar = this.f8403y;
        if (qVar != null) {
            qVar.V(x());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        q qVar = this.f8403y;
        if (qVar == null || !this.H || !qVar.a0()) {
            return super.onTouchEvent(motionEvent);
        }
        q.b bVar = this.f8403y.f8588c;
        if (bVar != null && !bVar.C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f8403y.Q(motionEvent, getCurrentState(), this);
        if (this.f8403y.f8588c.D(4)) {
            return this.f8403y.f8588c.B().r();
        }
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof n) {
            n nVar = (n) view;
            if (this.F0 == null) {
                this.F0 = new CopyOnWriteArrayList<>();
            }
            this.F0.add(nVar);
            if (nVar.z()) {
                if (this.C0 == null) {
                    this.C0 = new ArrayList<>();
                }
                this.C0.add(nVar);
            }
            if (nVar.y()) {
                if (this.D0 == null) {
                    this.D0 = new ArrayList<>();
                }
                this.D0.add(nVar);
            }
            if (nVar.x()) {
                if (this.E0 == null) {
                    this.E0 = new ArrayList<>();
                }
                this.E0.add(nVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<n> arrayList = this.C0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<n> arrayList2 = this.D0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void p0(int i11, boolean z11, float f11) {
        j jVar = this.T;
        if (jVar != null) {
            jVar.d(this, i11, z11, f11);
        }
        CopyOnWriteArrayList<j> copyOnWriteArrayList = this.F0;
        if (copyOnWriteArrayList != null) {
            Iterator<j> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().d(this, i11, z11, f11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q0(int i11, float f11, float f12, float f13, float[] fArr) {
        String str;
        HashMap<View, m> hashMap = this.I;
        View u11 = u(i11);
        m mVar = hashMap.get(u11);
        if (mVar != null) {
            mVar.l(f11, f12, f13, fArr);
            float y11 = u11.getY();
            this.U = f11;
            this.V = y11;
            return;
        }
        if (u11 == null) {
            str = "" + i11;
        } else {
            str = u11.getContext().getResources().getResourceName(i11);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + str);
    }

    public androidx.constraintlayout.widget.c r0(int i11) {
        q qVar = this.f8403y;
        if (qVar == null) {
            return null;
        }
        return qVar.k(i11);
    }

    public void requestLayout() {
        q qVar;
        q.b bVar;
        if (!this.M0 && this.D == -1 && (qVar = this.f8403y) != null && (bVar = qVar.f8588c) != null) {
            int z11 = bVar.z();
            if (z11 != 0) {
                if (z11 == 2) {
                    int childCount = getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        this.I.get(getChildAt(i11)).w();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    /* access modifiers changed from: package-private */
    public m s0(int i11) {
        return this.I.get(findViewById(i11));
    }

    public void setDebugMode(int i11) {
        this.W = i11;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z11) {
        this.f8384h1 = z11;
    }

    public void setInteractionEnabled(boolean z11) {
        this.H = z11;
    }

    public void setInterpolatedProgress(float f11) {
        if (this.f8403y != null) {
            setState(TransitionState.MOVING);
            Interpolator r11 = this.f8403y.r();
            if (r11 != null) {
                setProgress(r11.getInterpolation(f11));
                return;
            }
        }
        setProgress(f11);
    }

    public void setOnHide(float f11) {
        ArrayList<n> arrayList = this.D0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.D0.get(i11).setProgress(f11);
            }
        }
    }

    public void setOnShow(float f11) {
        ArrayList<n> arrayList = this.C0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.C0.get(i11).setProgress(f11);
            }
        }
    }

    public void setProgress(float f11) {
        int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i11 < 0 || f11 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.W0 == null) {
                this.W0 = new i();
            }
            this.W0.e(f11);
            return;
        }
        if (i11 <= 0) {
            if (this.N == 1.0f && this.D == this.E) {
                setState(TransitionState.MOVING);
            }
            this.D = this.C;
            if (this.N == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f11 >= 1.0f) {
            if (this.N == 0.0f && this.D == this.C) {
                setState(TransitionState.MOVING);
            }
            this.D = this.E;
            if (this.N == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.D = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f8403y != null) {
            this.Q = true;
            this.P = f11;
            this.M = f11;
            this.O = -1;
            this.K = -1;
            this.f8405z = null;
            this.R = true;
            invalidate();
        }
    }

    public void setScene(q qVar) {
        this.f8403y = qVar;
        qVar.V(x());
        A0();
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i11) {
        if (!isAttachedToWindow()) {
            if (this.W0 == null) {
                this.W0 = new i();
            }
            this.W0.f(i11);
            this.W0.d(i11);
            return;
        }
        this.D = i11;
    }

    /* access modifiers changed from: package-private */
    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.D != -1) {
            TransitionState transitionState3 = this.f8385i1;
            this.f8385i1 = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                n0();
            }
            int i11 = c.f8409a[transitionState3.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (transitionState == transitionState4) {
                    n0();
                }
                if (transitionState == transitionState2) {
                    o0();
                }
            } else if (i11 == 3 && transitionState == transitionState2) {
                o0();
            }
        }
    }

    public void setTransition(int i11) {
        if (this.f8403y != null) {
            q.b t02 = t0(i11);
            this.C = t02.A();
            this.E = t02.y();
            if (!isAttachedToWindow()) {
                if (this.W0 == null) {
                    this.W0 = new i();
                }
                this.W0.f(this.C);
                this.W0.d(this.E);
                return;
            }
            float f11 = Float.NaN;
            int i12 = this.D;
            float f12 = 0.0f;
            if (i12 == this.C) {
                f11 = 0.0f;
            } else if (i12 == this.E) {
                f11 = 1.0f;
            }
            this.f8403y.X(t02);
            this.f8386j1.e(this.f8696c, this.f8403y.k(this.C), this.f8403y.k(this.E));
            A0();
            if (this.N != f11) {
                if (f11 == 0.0f) {
                    k0(true);
                    this.f8403y.k(this.C).i(this);
                } else if (f11 == 1.0f) {
                    k0(false);
                    this.f8403y.k(this.E).i(this);
                }
            }
            if (!Float.isNaN(f11)) {
                f12 = f11;
            }
            this.N = f12;
            if (Float.isNaN(f11)) {
                Log.v("MotionLayout", a.b() + " transitionToStart ");
                J0();
                return;
            }
            setProgress(f11);
        }
    }

    public void setTransitionDuration(int i11) {
        q qVar = this.f8403y;
        if (qVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            qVar.U(i11);
        }
    }

    public void setTransitionListener(j jVar) {
        this.T = jVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.W0 == null) {
            this.W0 = new i();
        }
        this.W0.g(bundle);
        if (isAttachedToWindow()) {
            this.W0.a();
        }
    }

    public q.b t0(int i11) {
        return this.f8403y.F(i11);
    }

    public String toString() {
        Context context = getContext();
        return a.c(context, this.C) + "->" + a.c(context, this.E) + " (pos:" + this.N + " Dpos/Dt:" + this.B;
    }

    public boolean w0() {
        return this.H;
    }

    /* access modifiers changed from: protected */
    public g x0() {
        return h.e();
    }

    /* access modifiers changed from: package-private */
    public void y0() {
        q qVar = this.f8403y;
        if (qVar != null) {
            if (qVar.g(this, this.D)) {
                requestLayout();
                return;
            }
            int i11 = this.D;
            if (i11 != -1) {
                this.f8403y.f(this, i11);
            }
            if (this.f8403y.a0()) {
                this.f8403y.Y();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void z(int i11) {
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public void setTransition(q.b bVar) {
        this.f8403y.X(bVar);
        setState(TransitionState.SETUP);
        if (this.D == this.f8403y.p()) {
            this.N = 1.0f;
            this.M = 1.0f;
            this.P = 1.0f;
        } else {
            this.N = 0.0f;
            this.M = 0.0f;
            this.P = 0.0f;
        }
        this.O = bVar.D(1) ? -1 : getNanoTime();
        int E2 = this.f8403y.E();
        int p11 = this.f8403y.p();
        if (E2 != this.C || p11 != this.E) {
            this.C = E2;
            this.E = p11;
            this.f8403y.W(E2, p11);
            this.f8386j1.e(this.f8696c, this.f8403y.k(this.C), this.f8403y.k(this.E));
            this.f8386j1.i(this.C, this.E);
            this.f8386j1.h();
            A0();
        }
    }
}
