package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TouchResponse */
class r {
    private static final float[][] G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private float A = 10.0f;
    private float B = 1.0f;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private int E = 0;
    private int F = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f8620a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f8621b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f8622c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f8623d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f8624e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f8625f = -1;

    /* renamed from: g  reason: collision with root package name */
    private float f8626g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    private float f8627h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    float f8628i = 0.5f;
    float j = 0.5f;
    private int k = -1;

    /* renamed from: l  reason: collision with root package name */
    boolean f8629l = false;

    /* renamed from: m  reason: collision with root package name */
    private float f8630m = 0.0f;
    private float n = 1.0f;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8631o = false;

    /* renamed from: p  reason: collision with root package name */
    private float[] f8632p = new float[2];
    private int[] q = new int[2];

    /* renamed from: r  reason: collision with root package name */
    private float f8633r;

    /* renamed from: s  reason: collision with root package name */
    private float f8634s;
    private final MotionLayout t;

    /* renamed from: u  reason: collision with root package name */
    private float f8635u = 4.0f;
    private float v = 1.2f;

    /* renamed from: w  reason: collision with root package name */
    private boolean f8636w = true;

    /* renamed from: x  reason: collision with root package name */
    private float f8637x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    private int f8638y = 0;

    /* renamed from: z  reason: collision with root package name */
    private float f8639z = 10.0f;

    /* compiled from: TouchResponse */
    class a implements View.OnTouchListener {
        a(r rVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* compiled from: TouchResponse */
    class b implements NestedScrollView.c {
        b(r rVar) {
        }

        public void a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        }
    }

    r(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    private void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.f8623d = typedArray.getResourceId(index, this.f8623d);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i12 = typedArray.getInt(index, this.f8620a);
                this.f8620a = i12;
                float[][] fArr = G;
                this.f8627h = fArr[i12][0];
                this.f8626g = fArr[i12][1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i13 = typedArray.getInt(index, this.f8621b);
                this.f8621b = i13;
                float[][] fArr2 = H;
                if (i13 < fArr2.length) {
                    this.f8630m = fArr2[i13][0];
                    this.n = fArr2[i13][1];
                } else {
                    this.n = Float.NaN;
                    this.f8630m = Float.NaN;
                    this.f8629l = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.f8635u = typedArray.getFloat(index, this.f8635u);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.v = typedArray.getFloat(index, this.v);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.f8636w = typedArray.getBoolean(index, this.f8636w);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.f8637x = typedArray.getFloat(index, this.f8637x);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.f8639z = typedArray.getFloat(index, this.f8639z);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.f8624e = typedArray.getResourceId(index, this.f8624e);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.f8622c = typedArray.getInt(index, this.f8622c);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.f8638y = typedArray.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.f8625f = typedArray.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.k = typedArray.getResourceId(index, this.k);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnSwipe);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public float a(float f11, float f12) {
        return (f11 * this.f8630m) + (f12 * this.n);
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.f8638y;
    }

    /* access modifiers changed from: package-private */
    public RectF f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i11 = this.f8625f;
        if (i11 == -1 || (findViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.v;
    }

    public float h() {
        return this.f8635u;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f8636w;
    }

    /* access modifiers changed from: package-private */
    public float j(float f11, float f12) {
        this.t.q0(this.f8623d, this.t.getProgress(), this.f8627h, this.f8626g, this.f8632p);
        float f13 = this.f8630m;
        if (f13 != 0.0f) {
            float[] fArr = this.f8632p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f11 * f13) / fArr[0];
        }
        float[] fArr2 = this.f8632p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f12 * this.n) / fArr2[1];
    }

    public int k() {
        return this.E;
    }

    public float l() {
        return this.A;
    }

    public float m() {
        return this.B;
    }

    public float n() {
        return this.C;
    }

    public float o() {
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public RectF p(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i11 = this.f8624e;
        if (i11 == -1 || (findViewById = viewGroup.findViewById(i11)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        return this.f8624e;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return this.f8631o;
    }

    /* access modifiers changed from: package-private */
    public void s(MotionEvent motionEvent, MotionLayout.g gVar, int i11, q qVar) {
        float f11;
        int i12;
        float f12;
        MotionLayout.g gVar2 = gVar;
        if (this.f8629l) {
            t(motionEvent, gVar, i11, qVar);
            return;
        }
        gVar2.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8633r = motionEvent.getRawX();
            this.f8634s = motionEvent.getRawY();
            this.f8631o = false;
        } else if (action == 1) {
            this.f8631o = false;
            gVar2.c(1000);
            float d11 = gVar.d();
            float b11 = gVar.b();
            float progress = this.t.getProgress();
            int i13 = this.f8623d;
            if (i13 != -1) {
                this.t.q0(i13, progress, this.f8627h, this.f8626g, this.f8632p);
            } else {
                float min = (float) Math.min(this.t.getWidth(), this.t.getHeight());
                float[] fArr = this.f8632p;
                fArr[1] = this.n * min;
                fArr[0] = min * this.f8630m;
            }
            float f13 = this.f8630m;
            float[] fArr2 = this.f8632p;
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            if (f13 != 0.0f) {
                f11 = d11 / fArr2[0];
            } else {
                f11 = b11 / fArr2[1];
            }
            float f16 = !Float.isNaN(f11) ? (f11 / 3.0f) + progress : progress;
            if (f16 != 0.0f && f16 != 1.0f && (i12 = this.f8622c) != 3) {
                float f17 = ((double) f16) < 0.5d ? 0.0f : 1.0f;
                if (i12 == 6) {
                    if (progress + f11 < 0.0f) {
                        f11 = Math.abs(f11);
                    }
                    f17 = 1.0f;
                }
                if (this.f8622c == 7) {
                    if (progress + f11 > 1.0f) {
                        f11 = -Math.abs(f11);
                    }
                    f17 = 0.0f;
                }
                this.t.G0(this.f8622c, f17, f11);
                if (0.0f >= progress || 1.0f <= progress) {
                    this.t.setState(MotionLayout.TransitionState.FINISHED);
                }
            } else if (0.0f >= f16 || 1.0f <= f16) {
                this.t.setState(MotionLayout.TransitionState.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f8634s;
            float rawX = motionEvent.getRawX() - this.f8633r;
            if (Math.abs((this.f8630m * rawX) + (this.n * rawY)) > this.f8639z || this.f8631o) {
                float progress2 = this.t.getProgress();
                if (!this.f8631o) {
                    this.f8631o = true;
                    this.t.setProgress(progress2);
                }
                int i14 = this.f8623d;
                if (i14 != -1) {
                    this.t.q0(i14, progress2, this.f8627h, this.f8626g, this.f8632p);
                } else {
                    float min2 = (float) Math.min(this.t.getWidth(), this.t.getHeight());
                    float[] fArr3 = this.f8632p;
                    fArr3[1] = this.n * min2;
                    fArr3[0] = min2 * this.f8630m;
                }
                float f18 = this.f8630m;
                float[] fArr4 = this.f8632p;
                if (((double) Math.abs(((f18 * fArr4[0]) + (this.n * fArr4[1])) * this.f8637x)) < 0.01d) {
                    float[] fArr5 = this.f8632p;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.f8630m != 0.0f) {
                    f12 = rawX / this.f8632p[0];
                } else {
                    f12 = rawY / this.f8632p[1];
                }
                float max = Math.max(Math.min(progress2 + f12, 1.0f), 0.0f);
                if (this.f8622c == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.f8622c == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.t.getProgress();
                if (max != progress3) {
                    int i15 = (progress3 > 0.0f ? 1 : (progress3 == 0.0f ? 0 : -1));
                    if (i15 == 0 || progress3 == 1.0f) {
                        this.t.k0(i15 == 0);
                    }
                    this.t.setProgress(max);
                    gVar2.c(1000);
                    this.t.B = this.f8630m != 0.0f ? gVar.d() / this.f8632p[0] : gVar.b() / this.f8632p[1];
                } else {
                    this.t.B = 0.0f;
                }
                this.f8633r = motionEvent.getRawX();
                this.f8634s = motionEvent.getRawY();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0326  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.g r25, int r26, androidx.constraintlayout.motion.widget.q r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r24
            r1.a(r2)
            int r3 = r24.getAction()
            r4 = 0
            if (r3 == 0) goto L_0x0339
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1
            if (r3 == r10) goto L_0x01c4
            r11 = 2
            if (r3 == r11) goto L_0x001d
            goto L_0x0347
        L_0x001d:
            r24.getRawY()
            r24.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.t
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.k
            if (r12 == r6) goto L_0x006c
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.t
            android.view.View r3 = r3.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.t
            int[] r12 = r0.q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.q
            r11 = r11[r4]
            float r11 = (float) r11
            int r12 = r3.getLeft()
            int r13 = r3.getRight()
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r9
            float r11 = r11 + r12
            int[] r12 = r0.q
            r12 = r12[r10]
            float r12 = (float) r12
            int r13 = r3.getTop()
            int r3 = r3.getBottom()
            int r13 = r13 + r3
            float r3 = (float) r13
            float r3 = r3 / r9
            float r3 = r3 + r12
            r22 = r11
            r11 = r3
            r3 = r22
            goto L_0x00b3
        L_0x006c:
            int r12 = r0.f8623d
            if (r12 == r6) goto L_0x00b3
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.t
            androidx.constraintlayout.motion.widget.m r12 = r13.s0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.t
            int r12 = r12.h()
            android.view.View r12 = r13.findViewById(r12)
            if (r12 != 0) goto L_0x008a
            java.lang.String r9 = "TouchResponse"
            java.lang.String r12 = "could not find view to animate to"
            android.util.Log.e(r9, r12)
            goto L_0x00b3
        L_0x008a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.t
            int[] r11 = r0.q
            r3.getLocationOnScreen(r11)
            int[] r3 = r0.q
            r3 = r3[r4]
            float r3 = (float) r3
            int r11 = r12.getLeft()
            int r13 = r12.getRight()
            int r11 = r11 + r13
            float r11 = (float) r11
            float r11 = r11 / r9
            float r3 = r3 + r11
            int[] r11 = r0.q
            r11 = r11[r10]
            float r11 = (float) r11
            int r13 = r12.getTop()
            int r12 = r12.getBottom()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r9
            float r11 = r11 + r12
        L_0x00b3:
            float r9 = r24.getRawX()
            float r9 = r9 - r3
            float r12 = r24.getRawY()
            float r12 = r12 - r11
            float r13 = r24.getRawY()
            float r13 = r13 - r11
            double r13 = (double) r13
            float r15 = r24.getRawX()
            float r15 = r15 - r3
            r27 = r9
            double r8 = (double) r15
            double r8 = java.lang.Math.atan2(r13, r8)
            float r13 = r0.f8634s
            float r13 = r13 - r11
            double r13 = (double) r13
            float r11 = r0.f8633r
            float r11 = r11 - r3
            double r6 = (double) r11
            double r6 = java.lang.Math.atan2(r13, r6)
            double r6 = r8 - r6
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r13
            float r6 = (float) r6
            r7 = 1134886912(0x43a50000, float:330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f3
            float r6 = r6 - r5
            goto L_0x00fa
        L_0x00f3:
            r7 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00fa
            float r6 = r6 + r5
        L_0x00fa:
            float r7 = java.lang.Math.abs(r6)
            double r13 = (double) r7
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x010c
            boolean r7 = r0.f8631o
            if (r7 == 0) goto L_0x0347
        L_0x010c:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.t
            float r7 = r7.getProgress()
            boolean r11 = r0.f8631o
            if (r11 != 0) goto L_0x011d
            r0.f8631o = r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.t
            r11.setProgress(r7)
        L_0x011d:
            int r11 = r0.f8623d
            r3 = -1
            if (r11 == r3) goto L_0x0146
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.t
            float r5 = r0.f8627h
            float r13 = r0.f8626g
            float[] r14 = r0.f8632p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r13
            r21 = r14
            r16.q0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f8632p
            r5 = r3[r10]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r3[r10] = r5
            goto L_0x014a
        L_0x0146:
            float[] r3 = r0.f8632p
            r3[r10] = r5
        L_0x014a:
            float r3 = r0.f8637x
            float r6 = r6 * r3
            float[] r3 = r0.f8632p
            r3 = r3[r10]
            float r6 = r6 / r3
            float r7 = r7 + r6
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r7, r3)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.t
            float r7 = r7.getProgress()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x01b1
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0171
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0179
        L_0x0171:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.t
            if (r6 != 0) goto L_0x0176
            r4 = 1
        L_0x0176:
            r3.k0(r4)
        L_0x0179:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.t
            r3.setProgress(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.c(r3)
            float r3 = r25.d()
            float r1 = r25.b()
            double r4 = (double) r1
            double r6 = (double) r3
            double r10 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r8
            double r3 = java.lang.Math.sin(r3)
            double r10 = r10 * r3
            r9 = r27
            double r3 = (double) r9
            double r5 = (double) r12
            double r3 = java.lang.Math.hypot(r3, r5)
            double r10 = r10 / r3
            float r1 = (float) r10
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.t
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.B = r1
            goto L_0x01b6
        L_0x01b1:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.t
            r3 = 0
            r1.B = r3
        L_0x01b6:
            float r1 = r24.getRawX()
            r0.f8633r = r1
            float r1 = r24.getRawY()
            r0.f8634s = r1
            goto L_0x0347
        L_0x01c4:
            r0.f8631o = r4
            r6 = 16
            r1.c(r6)
            float r6 = r25.d()
            float r1 = r25.b()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.t
            float r7 = r7.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.t
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r8 = r8 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.t
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.k
            r3 = -1
            if (r12 == r3) goto L_0x021f
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.t
            android.view.View r8 = r8.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.t
            int[] r12 = r0.q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
        L_0x0219:
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r9
            float r11 = r11 + r8
            r8 = r4
            goto L_0x025a
        L_0x021f:
            int r12 = r0.f8623d
            r3 = -1
            if (r12 == r3) goto L_0x025a
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.t
            androidx.constraintlayout.motion.widget.m r8 = r8.s0(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.t
            int r8 = r8.h()
            android.view.View r8 = r11.findViewById(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.t
            int[] r12 = r0.q
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.q
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.q
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
            goto L_0x0219
        L_0x025a:
            float r4 = r24.getRawX()
            float r4 = r4 - r8
            float r2 = r24.getRawY()
            float r2 = r2 - r11
            double r8 = (double) r2
            double r11 = (double) r4
            double r8 = java.lang.Math.atan2(r8, r11)
            double r8 = java.lang.Math.toDegrees(r8)
            int r11 = r0.f8623d
            r3 = -1
            if (r11 == r3) goto L_0x0297
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.t
            float r5 = r0.f8627h
            float r12 = r0.f8626g
            float[] r13 = r0.f8632p
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r12
            r21 = r13
            r16.q0(r17, r18, r19, r20, r21)
            float[] r3 = r0.f8632p
            r5 = r3[r10]
            double r11 = (double) r5
            double r11 = java.lang.Math.toDegrees(r11)
            float r5 = (float) r11
            r3[r10] = r5
            goto L_0x029b
        L_0x0297:
            float[] r3 = r0.f8632p
            r3[r10] = r5
        L_0x029b:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r6 = r6 + r4
            double r3 = (double) r6
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r8
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L_0x02c2
            float r2 = r1 * r3
            float r4 = r0.f8637x
            float r2 = r2 * r4
            float[] r4 = r0.f8632p
            r4 = r4[r10]
            float r2 = r2 / r4
            float r2 = r2 + r7
            goto L_0x02c3
        L_0x02c2:
            r2 = r7
        L_0x02c3:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0326
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0326
            int r4 = r0.f8622c
            r5 = 3
            if (r4 == r5) goto L_0x0326
            float r5 = r0.f8637x
            float r1 = r1 * r5
            float[] r5 = r0.f8632p
            r5 = r5[r10]
            float r1 = r1 / r5
            double r5 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02e5
            r2 = 0
            goto L_0x02e7
        L_0x02e5:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02e7:
            r5 = 6
            if (r4 != r5) goto L_0x02f7
            float r2 = r7 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02f5
            float r1 = java.lang.Math.abs(r1)
        L_0x02f5:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02f7:
            int r4 = r0.f8622c
            r5 = 7
            if (r4 != r5) goto L_0x030a
            float r2 = r7 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0309
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L_0x0309:
            r2 = 0
        L_0x030a:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.t
            int r5 = r0.f8622c
            float r1 = r1 * r3
            r4.G0(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x031e
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0347
        L_0x031e:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x0347
        L_0x0326:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0331
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0347
        L_0x0331:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.t
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x0347
        L_0x0339:
            float r1 = r24.getRawX()
            r0.f8633r = r1
            float r1 = r24.getRawY()
            r0.f8634s = r1
            r0.f8631o = r4
        L_0x0347:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.r.t(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$g, int, androidx.constraintlayout.motion.widget.q):void");
    }

    public String toString() {
        if (Float.isNaN(this.f8630m)) {
            return "rotation";
        }
        return this.f8630m + " , " + this.n;
    }

    /* access modifiers changed from: package-private */
    public void u(float f11, float f12) {
        float f13;
        float progress = this.t.getProgress();
        if (!this.f8631o) {
            this.f8631o = true;
            this.t.setProgress(progress);
        }
        this.t.q0(this.f8623d, progress, this.f8627h, this.f8626g, this.f8632p);
        float f14 = this.f8630m;
        float[] fArr = this.f8632p;
        if (((double) Math.abs((f14 * fArr[0]) + (this.n * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f8632p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f15 = this.f8630m;
        if (f15 != 0.0f) {
            f13 = (f11 * f15) / this.f8632p[0];
        } else {
            f13 = (f12 * this.n) / this.f8632p[1];
        }
        float max = Math.max(Math.min(progress + f13, 1.0f), 0.0f);
        if (max != this.t.getProgress()) {
            this.t.setProgress(max);
        }
    }

    /* access modifiers changed from: package-private */
    public void v(float f11, float f12) {
        float f13;
        boolean z11 = false;
        this.f8631o = false;
        float progress = this.t.getProgress();
        this.t.q0(this.f8623d, progress, this.f8627h, this.f8626g, this.f8632p);
        float f14 = this.f8630m;
        float[] fArr = this.f8632p;
        float f15 = fArr[0];
        float f16 = this.n;
        float f17 = fArr[1];
        float f18 = 0.0f;
        if (f14 != 0.0f) {
            f13 = (f11 * f14) / fArr[0];
        } else {
            f13 = (f12 * f16) / fArr[1];
        }
        if (!Float.isNaN(f13)) {
            progress += f13 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z12 = progress != 1.0f;
            int i11 = this.f8622c;
            if (i11 != 3) {
                z11 = true;
            }
            if (z11 && z12) {
                MotionLayout motionLayout = this.t;
                if (((double) progress) >= 0.5d) {
                    f18 = 1.0f;
                }
                motionLayout.G0(i11, f18, f13);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void w(float f11, float f12) {
        this.f8633r = f11;
        this.f8634s = f12;
    }

    public void x(boolean z11) {
        if (z11) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = G;
        int i11 = this.f8620a;
        this.f8627h = fArr5[i11][0];
        this.f8626g = fArr5[i11][1];
        int i12 = this.f8621b;
        float[][] fArr6 = H;
        if (i12 < fArr6.length) {
            this.f8630m = fArr6[i12][0];
            this.n = fArr6[i12][1];
        }
    }

    /* access modifiers changed from: package-private */
    public void y(float f11, float f12) {
        this.f8633r = f11;
        this.f8634s = f12;
        this.f8631o = false;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        View view;
        int i11 = this.f8623d;
        if (i11 != -1) {
            view = this.t.findViewById(i11);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + a.c(this.t.getContext(), this.f8623d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a(this));
            nestedScrollView.setOnScrollChangeListener(new b(this));
        }
    }
}
