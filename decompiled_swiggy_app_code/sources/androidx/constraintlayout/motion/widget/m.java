package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import i2.b;
import i2.j;
import in.swiggy.android.tejas.oldapi.models.enums.CartRenderingType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import o2.c;
import o2.d;
import o2.e;
import o2.f;

/* compiled from: MotionController */
public class m {
    private ArrayList<d> A = new ArrayList<>();
    private HashMap<String, f> B;
    private HashMap<String, d> C;
    private HashMap<String, c> D;
    private k[] E;
    private int F;
    private int G;
    private View H;
    private int I;
    private float J;
    private Interpolator K;
    private boolean L;

    /* renamed from: a  reason: collision with root package name */
    Rect f8548a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    View f8549b;

    /* renamed from: c  reason: collision with root package name */
    int f8550c;

    /* renamed from: d  reason: collision with root package name */
    boolean f8551d = false;

    /* renamed from: e  reason: collision with root package name */
    String f8552e;

    /* renamed from: f  reason: collision with root package name */
    private int f8553f = -1;

    /* renamed from: g  reason: collision with root package name */
    private p f8554g = new p();

    /* renamed from: h  reason: collision with root package name */
    private p f8555h = new p();

    /* renamed from: i  reason: collision with root package name */
    private l f8556i = new l();
    private l j = new l();
    private b[] k;

    /* renamed from: l  reason: collision with root package name */
    private b f8557l;

    /* renamed from: m  reason: collision with root package name */
    float f8558m = Float.NaN;
    float n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    float f8559o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    float f8560p;
    float q;

    /* renamed from: r  reason: collision with root package name */
    private int[] f8561r;

    /* renamed from: s  reason: collision with root package name */
    private double[] f8562s;
    private double[] t;

    /* renamed from: u  reason: collision with root package name */
    private String[] f8563u;
    private int[] v;

    /* renamed from: w  reason: collision with root package name */
    private int f8564w = 4;

    /* renamed from: x  reason: collision with root package name */
    private float[] f8565x = new float[4];

    /* renamed from: y  reason: collision with root package name */
    private ArrayList<p> f8566y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    private float[] f8567z = new float[1];

    /* compiled from: MotionController */
    class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i2.c f8568a;

        a(i2.c cVar) {
            this.f8568a = cVar;
        }

        public float getInterpolation(float f11) {
            return (float) this.f8568a.a((double) f11);
        }
    }

    m(View view) {
        int i11 = d.f8455f;
        this.F = i11;
        this.G = i11;
        this.H = null;
        this.I = i11;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        E(view);
    }

    private float g(float f11, float[] fArr) {
        float f12 = 0.0f;
        float f13 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f14 = this.f8559o;
            if (((double) f14) != 1.0d) {
                float f15 = this.n;
                if (f11 < f15) {
                    f11 = 0.0f;
                }
                if (f11 > f15 && ((double) f11) < 1.0d) {
                    f11 = Math.min((f11 - f15) * f14, 1.0f);
                }
            }
        }
        i2.c cVar = this.f8554g.f8571a;
        float f16 = Float.NaN;
        Iterator<p> it2 = this.f8566y.iterator();
        while (it2.hasNext()) {
            p next = it2.next();
            i2.c cVar2 = next.f8571a;
            if (cVar2 != null) {
                float f17 = next.f8573c;
                if (f17 < f11) {
                    cVar = cVar2;
                    f12 = f17;
                } else if (Float.isNaN(f16)) {
                    f16 = next.f8573c;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f16)) {
                f13 = f16;
            }
            float f18 = f13 - f12;
            double d11 = (double) ((f11 - f12) / f18);
            f11 = (((float) cVar.a(d11)) * f18) + f12;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d11);
            }
        }
        return f11;
    }

    private static Interpolator p(Context context, int i11, String str, int i12) {
        if (i11 == -2) {
            return AnimationUtils.loadInterpolator(context, i12);
        }
        if (i11 == -1) {
            return new a(i2.c.c(str));
        }
        if (i11 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i11 == 1) {
            return new AccelerateInterpolator();
        }
        if (i11 == 2) {
            return new DecelerateInterpolator();
        }
        if (i11 == 4) {
            return new BounceInterpolator();
        }
        if (i11 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private float r() {
        char c11;
        float f11;
        float[] fArr = new float[2];
        float f12 = 1.0f / ((float) 99);
        double d11 = 0.0d;
        double d12 = 0.0d;
        float f13 = 0.0f;
        int i11 = 0;
        while (i11 < 100) {
            float f14 = ((float) i11) * f12;
            double d13 = (double) f14;
            i2.c cVar = this.f8554g.f8571a;
            Iterator<p> it2 = this.f8566y.iterator();
            float f15 = Float.NaN;
            float f16 = 0.0f;
            while (it2.hasNext()) {
                p next = it2.next();
                i2.c cVar2 = next.f8571a;
                if (cVar2 != null) {
                    float f17 = next.f8573c;
                    if (f17 < f14) {
                        cVar = cVar2;
                        f16 = f17;
                    } else if (Float.isNaN(f15)) {
                        f15 = next.f8573c;
                    }
                }
            }
            if (cVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f18 = f15 - f16;
                d13 = (double) ((((float) cVar.a((double) ((f14 - f16) / f18))) * f18) + f16);
            }
            this.k[0].d(d13, this.f8562s);
            float f19 = f13;
            int i12 = i11;
            this.f8554g.g(d13, this.f8561r, this.f8562s, fArr, 0);
            if (i12 > 0) {
                c11 = 0;
                f11 = (float) (((double) f19) + Math.hypot(d12 - ((double) fArr[1]), d11 - ((double) fArr[0])));
            } else {
                c11 = 0;
                f11 = f19;
            }
            d11 = (double) fArr[c11];
            i11 = i12 + 1;
            f13 = f11;
            d12 = (double) fArr[1];
        }
        return f13;
    }

    private void t(p pVar) {
        int binarySearch = Collections.binarySearch(this.f8566y, pVar);
        if (binarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + pVar.f8574d + "\" outside of range");
        }
        this.f8566y.add((-binarySearch) - 1, pVar);
    }

    private void v(p pVar) {
        pVar.q((float) ((int) this.f8549b.getX()), (float) ((int) this.f8549b.getY()), (float) this.f8549b.getWidth(), (float) this.f8549b.getHeight());
    }

    public void A(int i11) {
        this.F = i11;
    }

    /* access modifiers changed from: package-private */
    public void B(View view) {
        p pVar = this.f8554g;
        pVar.f8573c = 0.0f;
        pVar.f8574d = 0.0f;
        pVar.q(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f8556i.k(view);
    }

    /* access modifiers changed from: package-private */
    public void C(Rect rect, androidx.constraintlayout.widget.c cVar, int i11, int i12) {
        int i13 = cVar.f8797d;
        if (i13 != 0) {
            x(rect, this.f8548a, i13, i11, i12);
        }
        p pVar = this.f8554g;
        pVar.f8573c = 0.0f;
        pVar.f8574d = 0.0f;
        v(pVar);
        this.f8554g.q((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        c.a B2 = cVar.B(this.f8550c);
        this.f8554g.a(B2);
        this.f8558m = B2.f8804d.f8864g;
        this.f8556i.j(rect, cVar, i13, this.f8550c);
        this.G = B2.f8806f.f8883i;
        c.C0030c cVar2 = B2.f8804d;
        this.I = cVar2.k;
        this.J = cVar2.j;
        Context context = this.f8549b.getContext();
        c.C0030c cVar3 = B2.f8804d;
        this.K = p(context, cVar3.f8868m, cVar3.f8867l, cVar3.n);
    }

    public void D(e eVar, View view, int i11, int i12, int i13) {
        p pVar = this.f8554g;
        pVar.f8573c = 0.0f;
        pVar.f8574d = 0.0f;
        Rect rect = new Rect();
        if (i11 == 1) {
            int i14 = eVar.f15915b + eVar.f15917d;
            rect.left = ((eVar.f15916c + eVar.f15918e) - eVar.b()) / 2;
            rect.top = i12 - ((i14 + eVar.a()) / 2);
            rect.right = rect.left + eVar.b();
            rect.bottom = rect.top + eVar.a();
        } else if (i11 == 2) {
            int i15 = eVar.f15915b + eVar.f15917d;
            rect.left = i13 - (((eVar.f15916c + eVar.f15918e) + eVar.b()) / 2);
            rect.top = (i15 - eVar.a()) / 2;
            rect.right = rect.left + eVar.b();
            rect.bottom = rect.top + eVar.a();
        }
        this.f8554g.q((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f8556i.i(rect, view, i11, eVar.f15914a);
    }

    public void E(View view) {
        this.f8549b = view;
        this.f8550c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f8552e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        r11 = (java.lang.Integer) r5.get(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(int r18, int r19, float r20, long r21) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<double> r1 = double.class
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r0.F
            int r7 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r6 == r7) goto L_0x0027
            androidx.constraintlayout.motion.widget.p r7 = r0.f8554g
            r7.k = r6
        L_0x0027:
            androidx.constraintlayout.motion.widget.l r6 = r0.f8556i
            androidx.constraintlayout.motion.widget.l r7 = r0.j
            r6.g(r7, r3)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.d> r6 = r0.A
            if (r6 == 0) goto L_0x008e
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L_0x0037:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x008f
            java.lang.Object r9 = r6.next()
            androidx.constraintlayout.motion.widget.d r9 = (androidx.constraintlayout.motion.widget.d) r9
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.h
            if (r10 == 0) goto L_0x0066
            androidx.constraintlayout.motion.widget.h r9 = (androidx.constraintlayout.motion.widget.h) r9
            androidx.constraintlayout.motion.widget.p r10 = new androidx.constraintlayout.motion.widget.p
            androidx.constraintlayout.motion.widget.p r15 = r0.f8554g
            androidx.constraintlayout.motion.widget.p r14 = r0.f8555h
            r11 = r10
            r12 = r18
            r13 = r19
            r16 = r14
            r14 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r0.t(r10)
            int r9 = r9.f8499g
            int r10 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r9 == r10) goto L_0x0037
            r0.f8553f = r9
            goto L_0x0037
        L_0x0066:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.f
            if (r10 == 0) goto L_0x006e
            r9.d(r4)
            goto L_0x0037
        L_0x006e:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.j
            if (r10 == 0) goto L_0x0076
            r9.d(r2)
            goto L_0x0037
        L_0x0076:
            boolean r10 = r9 instanceof androidx.constraintlayout.motion.widget.k
            if (r10 == 0) goto L_0x0087
            if (r8 != 0) goto L_0x0081
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0081:
            androidx.constraintlayout.motion.widget.k r9 = (androidx.constraintlayout.motion.widget.k) r9
            r8.add(r9)
            goto L_0x0037
        L_0x0087:
            r9.g(r5)
            r9.d(r3)
            goto L_0x0037
        L_0x008e:
            r8 = 0
        L_0x008f:
            r6 = 0
            if (r8 == 0) goto L_0x009c
            androidx.constraintlayout.motion.widget.k[] r9 = new androidx.constraintlayout.motion.widget.k[r6]
            java.lang.Object[] r8 = r8.toArray(r9)
            androidx.constraintlayout.motion.widget.k[] r8 = (androidx.constraintlayout.motion.widget.k[]) r8
            r0.E = r8
        L_0x009c:
            boolean r8 = r3.isEmpty()
            java.lang.String r9 = ","
            java.lang.String r10 = "CUSTOM,"
            r11 = 1
            if (r8 != 0) goto L_0x0173
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.C = r8
            java.util.Iterator r8 = r3.iterator()
        L_0x00b2:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x010d
            java.lang.Object r12 = r8.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r12.startsWith(r10)
            if (r13 == 0) goto L_0x00fc
            android.util.SparseArray r13 = new android.util.SparseArray
            r13.<init>()
            java.lang.String[] r14 = r12.split(r9)
            r14 = r14[r11]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.d> r15 = r0.A
            java.util.Iterator r15 = r15.iterator()
        L_0x00d5:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00f7
            java.lang.Object r16 = r15.next()
            r7 = r16
            androidx.constraintlayout.motion.widget.d r7 = (androidx.constraintlayout.motion.widget.d) r7
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r7.f8460e
            if (r11 != 0) goto L_0x00e9
        L_0x00e7:
            r11 = 1
            goto L_0x00d5
        L_0x00e9:
            java.lang.Object r11 = r11.get(r14)
            androidx.constraintlayout.widget.ConstraintAttribute r11 = (androidx.constraintlayout.widget.ConstraintAttribute) r11
            if (r11 == 0) goto L_0x00e7
            int r7 = r7.f8456a
            r13.append(r7, r11)
            goto L_0x00e7
        L_0x00f7:
            o2.d r7 = o2.d.e(r12, r13)
            goto L_0x0100
        L_0x00fc:
            o2.d r7 = o2.d.f(r12)
        L_0x0100:
            if (r7 != 0) goto L_0x0103
            goto L_0x010b
        L_0x0103:
            r7.c(r12)
            java.util.HashMap<java.lang.String, o2.d> r11 = r0.C
            r11.put(r12, r7)
        L_0x010b:
            r11 = 1
            goto L_0x00b2
        L_0x010d:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.d> r7 = r0.A
            if (r7 == 0) goto L_0x012b
            java.util.Iterator r7 = r7.iterator()
        L_0x0115:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x012b
            java.lang.Object r8 = r7.next()
            androidx.constraintlayout.motion.widget.d r8 = (androidx.constraintlayout.motion.widget.d) r8
            boolean r11 = r8 instanceof androidx.constraintlayout.motion.widget.e
            if (r11 == 0) goto L_0x0115
            java.util.HashMap<java.lang.String, o2.d> r11 = r0.C
            r8.a(r11)
            goto L_0x0115
        L_0x012b:
            androidx.constraintlayout.motion.widget.l r7 = r0.f8556i
            java.util.HashMap<java.lang.String, o2.d> r8 = r0.C
            r7.a(r8, r6)
            androidx.constraintlayout.motion.widget.l r7 = r0.j
            java.util.HashMap<java.lang.String, o2.d> r8 = r0.C
            r11 = 100
            r7.a(r8, r11)
            java.util.HashMap<java.lang.String, o2.d> r7 = r0.C
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0145:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0173
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r11 = r5.containsKey(r8)
            if (r11 == 0) goto L_0x0164
            java.lang.Object r11 = r5.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x0164
            int r11 = r11.intValue()
            goto L_0x0165
        L_0x0164:
            r11 = 0
        L_0x0165:
            java.util.HashMap<java.lang.String, o2.d> r12 = r0.C
            java.lang.Object r8 = r12.get(r8)
            i2.j r8 = (i2.j) r8
            if (r8 == 0) goto L_0x0145
            r8.d(r11)
            goto L_0x0145
        L_0x0173:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x0241
            java.util.HashMap<java.lang.String, o2.f> r7 = r0.B
            if (r7 != 0) goto L_0x0184
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r0.B = r7
        L_0x0184:
            java.util.Iterator r2 = r2.iterator()
        L_0x0188:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01ed
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap<java.lang.String, o2.f> r8 = r0.B
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x019d
            goto L_0x0188
        L_0x019d:
            boolean r8 = r7.startsWith(r10)
            if (r8 == 0) goto L_0x01db
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
            java.lang.String[] r11 = r7.split(r9)
            r12 = 1
            r11 = r11[r12]
            java.util.ArrayList<androidx.constraintlayout.motion.widget.d> r12 = r0.A
            java.util.Iterator r12 = r12.iterator()
        L_0x01b5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01d4
            java.lang.Object r13 = r12.next()
            androidx.constraintlayout.motion.widget.d r13 = (androidx.constraintlayout.motion.widget.d) r13
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r14 = r13.f8460e
            if (r14 != 0) goto L_0x01c6
            goto L_0x01b5
        L_0x01c6:
            java.lang.Object r14 = r14.get(r11)
            androidx.constraintlayout.widget.ConstraintAttribute r14 = (androidx.constraintlayout.widget.ConstraintAttribute) r14
            if (r14 == 0) goto L_0x01b5
            int r13 = r13.f8456a
            r8.append(r13, r14)
            goto L_0x01b5
        L_0x01d4:
            o2.f r8 = o2.f.g(r7, r8)
            r11 = r21
            goto L_0x01e1
        L_0x01db:
            r11 = r21
            o2.f r8 = o2.f.h(r7, r11)
        L_0x01e1:
            if (r8 != 0) goto L_0x01e4
            goto L_0x0188
        L_0x01e4:
            r8.d(r7)
            java.util.HashMap<java.lang.String, o2.f> r13 = r0.B
            r13.put(r7, r8)
            goto L_0x0188
        L_0x01ed:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.d> r2 = r0.A
            if (r2 == 0) goto L_0x020d
            java.util.Iterator r2 = r2.iterator()
        L_0x01f5:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x020d
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.motion.widget.d r7 = (androidx.constraintlayout.motion.widget.d) r7
            boolean r8 = r7 instanceof androidx.constraintlayout.motion.widget.j
            if (r8 == 0) goto L_0x01f5
            androidx.constraintlayout.motion.widget.j r7 = (androidx.constraintlayout.motion.widget.j) r7
            java.util.HashMap<java.lang.String, o2.f> r8 = r0.B
            r7.Q(r8)
            goto L_0x01f5
        L_0x020d:
            java.util.HashMap<java.lang.String, o2.f> r2 = r0.B
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0217:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0241
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r5.containsKey(r7)
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r5.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0235
        L_0x0234:
            r8 = 0
        L_0x0235:
            java.util.HashMap<java.lang.String, o2.f> r9 = r0.B
            java.lang.Object r7 = r9.get(r7)
            o2.f r7 = (o2.f) r7
            r7.e(r8)
            goto L_0x0217
        L_0x0241:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r2 = r0.f8566y
            int r2 = r2.size()
            r5 = 2
            int r2 = r2 + r5
            androidx.constraintlayout.motion.widget.p[] r7 = new androidx.constraintlayout.motion.widget.p[r2]
            androidx.constraintlayout.motion.widget.p r8 = r0.f8554g
            r7[r6] = r8
            int r8 = r2 + -1
            androidx.constraintlayout.motion.widget.p r9 = r0.f8555h
            r7[r8] = r9
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r8 = r0.f8566y
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0264
            int r8 = r0.f8553f
            r9 = -1
            if (r8 != r9) goto L_0x0264
            r0.f8553f = r6
        L_0x0264:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.p> r8 = r0.f8566y
            java.util.Iterator r8 = r8.iterator()
            r9 = 1
        L_0x026b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x027d
            java.lang.Object r11 = r8.next()
            androidx.constraintlayout.motion.widget.p r11 = (androidx.constraintlayout.motion.widget.p) r11
            int r12 = r9 + 1
            r7[r9] = r11
            r9 = r12
            goto L_0x026b
        L_0x027d:
            r8 = 18
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            androidx.constraintlayout.motion.widget.p r11 = r0.f8555h
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.f8582o
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0290:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x02bf
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            androidx.constraintlayout.motion.widget.p r13 = r0.f8554g
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r13 = r13.f8582o
            boolean r13 = r13.containsKey(r12)
            if (r13 == 0) goto L_0x0290
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            boolean r13 = r3.contains(r13)
            if (r13 != 0) goto L_0x0290
            r9.add(r12)
            goto L_0x0290
        L_0x02bf:
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.Object[] r3 = r9.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r0.f8563u = r3
            int r3 = r3.length
            int[] r3 = new int[r3]
            r0.v = r3
            r3 = 0
        L_0x02cf:
            java.lang.String[] r9 = r0.f8563u
            int r10 = r9.length
            if (r3 >= r10) goto L_0x0305
            r9 = r9[r3]
            int[] r10 = r0.v
            r10[r3] = r6
            r10 = 0
        L_0x02db:
            if (r10 >= r2) goto L_0x0302
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.f8582o
            boolean r11 = r11.containsKey(r9)
            if (r11 == 0) goto L_0x02ff
            r11 = r7[r10]
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r11 = r11.f8582o
            java.lang.Object r11 = r11.get(r9)
            androidx.constraintlayout.widget.ConstraintAttribute r11 = (androidx.constraintlayout.widget.ConstraintAttribute) r11
            if (r11 == 0) goto L_0x02ff
            int[] r9 = r0.v
            r10 = r9[r3]
            int r11 = r11.h()
            int r10 = r10 + r11
            r9[r3] = r10
            goto L_0x0302
        L_0x02ff:
            int r10 = r10 + 1
            goto L_0x02db
        L_0x0302:
            int r3 = r3 + 1
            goto L_0x02cf
        L_0x0305:
            r3 = r7[r6]
            int r3 = r3.k
            int r10 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r3 == r10) goto L_0x030f
            r3 = 1
            goto L_0x0310
        L_0x030f:
            r3 = 0
        L_0x0310:
            int r9 = r9.length
            int r8 = r8 + r9
            boolean[] r9 = new boolean[r8]
            r10 = 1
        L_0x0315:
            if (r10 >= r2) goto L_0x0325
            r11 = r7[r10]
            int r12 = r10 + -1
            r12 = r7[r12]
            java.lang.String[] r13 = r0.f8563u
            r11.e(r12, r9, r13, r3)
            int r10 = r10 + 1
            goto L_0x0315
        L_0x0325:
            r3 = 1
            r10 = 0
        L_0x0327:
            if (r3 >= r8) goto L_0x0332
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x032f
            int r10 = r10 + 1
        L_0x032f:
            int r3 = r3 + 1
            goto L_0x0327
        L_0x0332:
            int[] r3 = new int[r10]
            r0.f8561r = r3
            int r3 = java.lang.Math.max(r5, r10)
            double[] r10 = new double[r3]
            r0.f8562s = r10
            double[] r3 = new double[r3]
            r0.t = r3
            r3 = 1
            r10 = 0
        L_0x0344:
            if (r3 >= r8) goto L_0x0354
            boolean r11 = r9[r3]
            if (r11 == 0) goto L_0x0351
            int[] r11 = r0.f8561r
            int r12 = r10 + 1
            r11[r10] = r3
            r10 = r12
        L_0x0351:
            int r3 = r3 + 1
            goto L_0x0344
        L_0x0354:
            int[] r3 = r0.f8561r
            int r3 = r3.length
            int[] r8 = new int[r5]
            r9 = 1
            r8[r9] = r3
            r8[r6] = r2
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r8)
            double[][] r3 = (double[][]) r3
            double[] r8 = new double[r2]
            r9 = 0
        L_0x0367:
            if (r9 >= r2) goto L_0x037c
            r10 = r7[r9]
            r11 = r3[r9]
            int[] r12 = r0.f8561r
            r10.f(r11, r12)
            r10 = r7[r9]
            float r10 = r10.f8573c
            double r10 = (double) r10
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0367
        L_0x037c:
            r9 = 0
        L_0x037d:
            int[] r10 = r0.f8561r
            int r11 = r10.length
            if (r9 >= r11) goto L_0x03be
            r10 = r10[r9]
            java.lang.String[] r11 = androidx.constraintlayout.motion.widget.p.t
            int r11 = r11.length
            if (r10 >= r11) goto L_0x03bb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String[] r11 = androidx.constraintlayout.motion.widget.p.t
            int[] r12 = r0.f8561r
            r12 = r12[r9]
            r11 = r11[r12]
            r10.append(r11)
            java.lang.String r11 = " ["
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = 0
        L_0x03a3:
            if (r11 >= r2) goto L_0x03bb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r10)
            r10 = r3[r11]
            r13 = r10[r9]
            r12.append(r13)
            java.lang.String r10 = r12.toString()
            int r11 = r11 + 1
            goto L_0x03a3
        L_0x03bb:
            int r9 = r9 + 1
            goto L_0x037d
        L_0x03be:
            java.lang.String[] r9 = r0.f8563u
            int r9 = r9.length
            r10 = 1
            int r9 = r9 + r10
            i2.b[] r9 = new i2.b[r9]
            r0.k = r9
            r9 = 0
        L_0x03c8:
            java.lang.String[] r10 = r0.f8563u
            int r11 = r10.length
            if (r9 >= r11) goto L_0x0424
            r10 = r10[r9]
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x03d3:
            if (r11 >= r2) goto L_0x040b
            r15 = r7[r11]
            boolean r15 = r15.l(r10)
            if (r15 == 0) goto L_0x0406
            if (r14 != 0) goto L_0x03f5
            double[] r12 = new double[r2]
            r14 = r7[r11]
            int r14 = r14.j(r10)
            int[] r15 = new int[r5]
            r16 = 1
            r15[r16] = r14
            r15[r6] = r2
            java.lang.Object r14 = java.lang.reflect.Array.newInstance(r1, r15)
            double[][] r14 = (double[][]) r14
        L_0x03f5:
            r15 = r7[r11]
            float r15 = r15.f8573c
            double r5 = (double) r15
            r12[r13] = r5
            r5 = r7[r11]
            r6 = r14[r13]
            r15 = 0
            r5.i(r10, r6, r15)
            int r13 = r13 + 1
        L_0x0406:
            int r11 = r11 + 1
            r5 = 2
            r6 = 0
            goto L_0x03d3
        L_0x040b:
            double[] r5 = java.util.Arrays.copyOf(r12, r13)
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r14, r13)
            double[][] r6 = (double[][]) r6
            i2.b[] r10 = r0.k
            int r9 = r9 + 1
            int r11 = r0.f8553f
            i2.b r5 = i2.b.a(r11, r5, r6)
            r10[r9] = r5
            r5 = 2
            r6 = 0
            goto L_0x03c8
        L_0x0424:
            i2.b[] r5 = r0.k
            int r6 = r0.f8553f
            i2.b r3 = i2.b.a(r6, r8, r3)
            r6 = 0
            r5[r6] = r3
            r3 = r7[r6]
            int r3 = r3.k
            int r5 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r3 == r5) goto L_0x0476
            int[] r3 = new int[r2]
            double[] r5 = new double[r2]
            r8 = 2
            int[] r9 = new int[r8]
            r10 = 1
            r9[r10] = r8
            r9[r6] = r2
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r9)
            double[][] r1 = (double[][]) r1
            r15 = 0
        L_0x044a:
            if (r15 >= r2) goto L_0x0470
            r6 = r7[r15]
            int r6 = r6.k
            r3[r15] = r6
            r6 = r7[r15]
            float r6 = r6.f8573c
            double r8 = (double) r6
            r5[r15] = r8
            r6 = r1[r15]
            r8 = r7[r15]
            float r8 = r8.f8575e
            double r8 = (double) r8
            r10 = 0
            r6[r10] = r8
            r6 = r1[r15]
            r8 = r7[r15]
            float r8 = r8.f8576f
            double r8 = (double) r8
            r11 = 1
            r6[r11] = r8
            int r15 = r15 + 1
            goto L_0x044a
        L_0x0470:
            i2.b r1 = i2.b.b(r3, r5, r1)
            r0.f8557l = r1
        L_0x0476:
            r1 = 2143289344(0x7fc00000, float:NaN)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.D = r2
            java.util.ArrayList<androidx.constraintlayout.motion.widget.d> r2 = r0.A
            if (r2 == 0) goto L_0x04eb
            java.util.Iterator r2 = r4.iterator()
        L_0x0487:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b3
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            o2.c r4 = o2.c.h(r3)
            if (r4 != 0) goto L_0x049a
            goto L_0x0487
        L_0x049a:
            boolean r5 = r4.g()
            if (r5 == 0) goto L_0x04aa
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 == 0) goto L_0x04aa
            float r1 = r17.r()
        L_0x04aa:
            r4.e(r3)
            java.util.HashMap<java.lang.String, o2.c> r5 = r0.D
            r5.put(r3, r4)
            goto L_0x0487
        L_0x04b3:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.d> r2 = r0.A
            java.util.Iterator r2 = r2.iterator()
        L_0x04b9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d1
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.d r3 = (androidx.constraintlayout.motion.widget.d) r3
            boolean r4 = r3 instanceof androidx.constraintlayout.motion.widget.f
            if (r4 == 0) goto L_0x04b9
            androidx.constraintlayout.motion.widget.f r3 = (androidx.constraintlayout.motion.widget.f) r3
            java.util.HashMap<java.lang.String, o2.c> r4 = r0.D
            r3.U(r4)
            goto L_0x04b9
        L_0x04d1:
            java.util.HashMap<java.lang.String, o2.c> r2 = r0.D
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x04db:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04eb
            java.lang.Object r3 = r2.next()
            o2.c r3 = (o2.c) r3
            r3.f(r1)
            goto L_0x04db
        L_0x04eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.F(int, int, float, long):void");
    }

    public void G(m mVar) {
        this.f8554g.t(mVar, mVar.f8554g);
        this.f8555h.t(mVar, mVar.f8555h);
    }

    public void a(d dVar) {
        this.A.add(dVar);
    }

    /* access modifiers changed from: package-private */
    public void b(ArrayList<d> arrayList) {
        this.A.addAll(arrayList);
    }

    /* access modifiers changed from: package-private */
    public int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] g11 = this.k[0].g();
        if (iArr != null) {
            Iterator<p> it2 = this.f8566y.iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                iArr[i11] = it2.next().f8583p;
                i11++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < g11.length; i13++) {
            this.k[0].d(g11[i13], this.f8562s);
            this.f8554g.g(g11[i13], this.f8561r, this.f8562s, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    /* access modifiers changed from: package-private */
    public void d(float[] fArr, int i11) {
        double d11;
        int i12 = i11;
        float f11 = 1.0f;
        float f12 = 1.0f / ((float) (i12 - 1));
        HashMap<String, d> hashMap = this.C;
        o2.c cVar = null;
        j jVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, d> hashMap2 = this.C;
        j jVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, o2.c> hashMap3 = this.D;
        o2.c cVar2 = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, o2.c> hashMap4 = this.D;
        if (hashMap4 != null) {
            cVar = hashMap4.get("translationY");
        }
        o2.c cVar3 = cVar;
        int i13 = 0;
        while (i13 < i12) {
            float f13 = ((float) i13) * f12;
            float f14 = this.f8559o;
            if (f14 != f11) {
                float f15 = this.n;
                if (f13 < f15) {
                    f13 = 0.0f;
                }
                if (f13 > f15 && ((double) f13) < 1.0d) {
                    f13 = Math.min((f13 - f15) * f14, f11);
                }
            }
            float f16 = f13;
            double d12 = (double) f16;
            i2.c cVar4 = this.f8554g.f8571a;
            float f17 = Float.NaN;
            Iterator<p> it2 = this.f8566y.iterator();
            float f18 = 0.0f;
            while (it2.hasNext()) {
                p next = it2.next();
                i2.c cVar5 = next.f8571a;
                double d13 = d12;
                if (cVar5 != null) {
                    float f19 = next.f8573c;
                    if (f19 < f16) {
                        f18 = f19;
                        cVar4 = cVar5;
                    } else if (Float.isNaN(f17)) {
                        f17 = next.f8573c;
                    }
                }
                d12 = d13;
            }
            double d14 = d12;
            if (cVar4 != null) {
                if (Float.isNaN(f17)) {
                    f17 = 1.0f;
                }
                float f21 = f17 - f18;
                d11 = (double) ((((float) cVar4.a((double) ((f16 - f18) / f21))) * f21) + f18);
            } else {
                d11 = d14;
            }
            this.k[0].d(d11, this.f8562s);
            b bVar = this.f8557l;
            if (bVar != null) {
                double[] dArr = this.f8562s;
                if (dArr.length > 0) {
                    bVar.d(d11, dArr);
                }
            }
            int i14 = i13 * 2;
            float f22 = f16;
            int i15 = i13;
            this.f8554g.g(d11, this.f8561r, this.f8562s, fArr, i14);
            if (cVar2 != null) {
                fArr[i14] = fArr[i14] + cVar2.a(f22);
            } else if (jVar != null) {
                fArr[i14] = fArr[i14] + jVar.a(f22);
            }
            if (cVar3 != null) {
                int i16 = i14 + 1;
                fArr[i16] = fArr[i16] + cVar3.a(f22);
            } else if (jVar2 != null) {
                int i17 = i14 + 1;
                fArr[i17] = fArr[i17] + jVar2.a(f22);
            }
            i13 = i15 + 1;
            f11 = 1.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public void e(float f11, float[] fArr, int i11) {
        this.k[0].d((double) g(f11, (float[]) null), this.f8562s);
        this.f8554g.k(this.f8561r, this.f8562s, fArr, i11);
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z11) {
        if (CartRenderingType.TYPE_BUTTON.equals(a.d(this.f8549b)) && this.E != null) {
            int i11 = 0;
            while (true) {
                k[] kVarArr = this.E;
                if (i11 < kVarArr.length) {
                    kVarArr[i11].u(z11 ? -100.0f : 100.0f, this.f8549b);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public int h() {
        return this.f8554g.f8580l;
    }

    public void i(double d11, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.k[0].d(d11, dArr);
        this.k[0].f(d11, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f8554g.h(d11, this.f8561r, dArr, fArr, dArr2, fArr2);
    }

    public float j() {
        return this.f8560p;
    }

    public float k() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void l(float f11, float f12, float f13, float[] fArr) {
        double[] dArr;
        float g11 = g(f11, this.f8567z);
        b[] bVarArr = this.k;
        int i11 = 0;
        if (bVarArr != null) {
            double d11 = (double) g11;
            bVarArr[0].f(d11, this.t);
            this.k[0].d(d11, this.f8562s);
            float f14 = this.f8567z[0];
            while (true) {
                dArr = this.t;
                if (i11 >= dArr.length) {
                    break;
                }
                dArr[i11] = dArr[i11] * ((double) f14);
                i11++;
            }
            b bVar = this.f8557l;
            if (bVar != null) {
                double[] dArr2 = this.f8562s;
                if (dArr2.length > 0) {
                    bVar.d(d11, dArr2);
                    this.f8557l.f(d11, this.t);
                    this.f8554g.r(f12, f13, fArr, this.f8561r, this.t, this.f8562s);
                    return;
                }
                return;
            }
            this.f8554g.r(f12, f13, fArr, this.f8561r, dArr, this.f8562s);
            return;
        }
        p pVar = this.f8555h;
        float f15 = pVar.f8575e;
        p pVar2 = this.f8554g;
        float f16 = f15 - pVar2.f8575e;
        float f17 = pVar.f8576f - pVar2.f8576f;
        float f18 = (pVar.f8577g - pVar2.f8577g) + f16;
        float f19 = (pVar.f8578h - pVar2.f8578h) + f17;
        fArr[0] = (f16 * (1.0f - f12)) + (f18 * f12);
        fArr[1] = (f17 * (1.0f - f13)) + (f19 * f13);
    }

    public int m() {
        int i11 = this.f8554g.f8572b;
        Iterator<p> it2 = this.f8566y.iterator();
        while (it2.hasNext()) {
            i11 = Math.max(i11, it2.next().f8572b);
        }
        return Math.max(i11, this.f8555h.f8572b);
    }

    public float n() {
        return this.f8555h.f8575e;
    }

    public float o() {
        return this.f8555h.f8576f;
    }

    /* access modifiers changed from: package-private */
    public p q(int i11) {
        return this.f8566y.get(i11);
    }

    public View s() {
        return this.f8549b;
    }

    public String toString() {
        return " start: x: " + this.f8554g.f8575e + " y: " + this.f8554g.f8576f + " end: x: " + this.f8555h.f8575e + " y: " + this.f8555h.f8576f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: o2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: o2.f$d} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u(android.view.View r21, float r22, long r23, i2.d r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.g(r2, r1)
            int r3 = r0.I
            int r4 = androidx.constraintlayout.motion.widget.d.f8455f
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0045
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.J
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002e
            float r5 = r0.J
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002e:
            android.view.animation.Interpolator r5 = r0.K
            if (r5 == 0) goto L_0x0037
            float r2 = r5.getInterpolation(r2)
            goto L_0x0042
        L_0x0037:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0041
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0045:
            r14 = r2
            java.util.HashMap<java.lang.String, o2.d> r2 = r0.C
            if (r2 == 0) goto L_0x0062
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0052:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()
            o2.d r3 = (o2.d) r3
            r3.g(r11, r14)
            goto L_0x0052
        L_0x0062:
            java.util.HashMap<java.lang.String, o2.f> r2 = r0.B
            r15 = 0
            if (r2 == 0) goto L_0x0096
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = 0
        L_0x0071:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r7.next()
            o2.f r1 = (o2.f) r1
            boolean r2 = r1 instanceof o2.f.d
            if (r2 == 0) goto L_0x0085
            r8 = r1
            o2.f$d r8 = (o2.f.d) r8
            goto L_0x0071
        L_0x0085:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.i(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x0071
        L_0x0092:
            r16 = r9
            r9 = r8
            goto L_0x0099
        L_0x0096:
            r9 = r1
            r16 = 0
        L_0x0099:
            i2.b[] r1 = r0.k
            r10 = 1
            if (r1 == 0) goto L_0x01f3
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.f8562s
            r1.d(r7, r2)
            i2.b[] r1 = r0.k
            r1 = r1[r15]
            double[] r2 = r0.t
            r1.f(r7, r2)
            i2.b r1 = r0.f8557l
            if (r1 == 0) goto L_0x00c2
            double[] r2 = r0.f8562s
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00c2
            r1.d(r7, r2)
            i2.b r1 = r0.f8557l
            double[] r2 = r0.t
            r1.f(r7, r2)
        L_0x00c2:
            boolean r1 = r0.L
            if (r1 != 0) goto L_0x00e2
            androidx.constraintlayout.motion.widget.p r1 = r0.f8554g
            int[] r4 = r0.f8561r
            double[] r5 = r0.f8562s
            double[] r6 = r0.t
            r17 = 0
            boolean r3 = r0.f8551d
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.s(r2, r3, r4, r5, r6, r7, r8)
            r0.f8551d = r15
            goto L_0x00e3
        L_0x00e2:
            r12 = r7
        L_0x00e3:
            int r1 = r0.G
            int r2 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r1 == r2) goto L_0x0145
            android.view.View r1 = r0.H
            if (r1 != 0) goto L_0x00fb
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.G
            android.view.View r1 = r1.findViewById(r2)
            r0.H = r1
        L_0x00fb:
            android.view.View r1 = r0.H
            if (r1 == 0) goto L_0x0145
            int r1 = r1.getTop()
            android.view.View r2 = r0.H
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.H
            int r3 = r3.getLeft()
            android.view.View r4 = r0.H
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0145
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0145:
            java.util.HashMap<java.lang.String, o2.d> r1 = r0.C
            if (r1 == 0) goto L_0x0173
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0151:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0173
            java.lang.Object r1 = r8.next()
            i2.j r1 = (i2.j) r1
            boolean r2 = r1 instanceof o2.d.C0157d
            if (r2 == 0) goto L_0x0151
            double[] r2 = r0.t
            int r3 = r2.length
            if (r3 <= r10) goto L_0x0151
            o2.d$d r1 = (o2.d.C0157d) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.h(r2, r3, r4, r6)
            goto L_0x0151
        L_0x0173:
            if (r9 == 0) goto L_0x0190
            double[] r1 = r0.t
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = 1
            r9 = r17
            boolean r1 = r1.j(r2, r3, r4, r5, r7, r9)
            r1 = r16 | r1
            r16 = r1
            goto L_0x0192
        L_0x0190:
            r19 = 1
        L_0x0192:
            r10 = 1
        L_0x0193:
            i2.b[] r1 = r0.k
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b7
            r1 = r1[r10]
            float[] r2 = r0.f8565x
            r1.e(r12, r2)
            androidx.constraintlayout.motion.widget.p r1 = r0.f8554g
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r1.f8582o
            java.lang.String[] r2 = r0.f8563u
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            float[] r2 = r0.f8565x
            o2.a.b(r1, r11, r2)
            int r10 = r10 + 1
            goto L_0x0193
        L_0x01b7:
            androidx.constraintlayout.motion.widget.l r1 = r0.f8556i
            int r2 = r1.f8529b
            if (r2 != 0) goto L_0x01e1
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c8
            int r1 = r1.f8530c
            r11.setVisibility(r1)
            goto L_0x01e1
        L_0x01c8:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d6
            androidx.constraintlayout.motion.widget.l r1 = r0.j
            int r1 = r1.f8530c
            r11.setVisibility(r1)
            goto L_0x01e1
        L_0x01d6:
            androidx.constraintlayout.motion.widget.l r2 = r0.j
            int r2 = r2.f8530c
            int r1 = r1.f8530c
            if (r2 == r1) goto L_0x01e1
            r11.setVisibility(r15)
        L_0x01e1:
            androidx.constraintlayout.motion.widget.k[] r1 = r0.E
            if (r1 == 0) goto L_0x0247
            r1 = 0
        L_0x01e6:
            androidx.constraintlayout.motion.widget.k[] r2 = r0.E
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0247
            r2 = r2[r1]
            r2.u(r14, r11)
            int r1 = r1 + 1
            goto L_0x01e6
        L_0x01f3:
            r19 = 1
            androidx.constraintlayout.motion.widget.p r1 = r0.f8554g
            float r2 = r1.f8575e
            androidx.constraintlayout.motion.widget.p r3 = r0.f8555h
            float r4 = r3.f8575e
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f8576f
            float r5 = r3.f8576f
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f8577g
            float r6 = r3.f8577g
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f8578h
            float r3 = r3.f8578h
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0235
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0235
            boolean r1 = r0.f8551d
            if (r1 == 0) goto L_0x0244
        L_0x0235:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.f8551d = r15
        L_0x0244:
            r11.layout(r10, r9, r2, r4)
        L_0x0247:
            java.util.HashMap<java.lang.String, o2.c> r1 = r0.D
            if (r1 == 0) goto L_0x0276
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x0253:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0276
            java.lang.Object r1 = r8.next()
            o2.c r1 = (o2.c) r1
            boolean r2 = r1 instanceof o2.c.d
            if (r2 == 0) goto L_0x0272
            o2.c$d r1 = (o2.c.d) r1
            double[] r2 = r0.t
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.j(r2, r3, r4, r6)
            goto L_0x0253
        L_0x0272:
            r1.i(r11, r14)
            goto L_0x0253
        L_0x0276:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.u(android.view.View, float, long, i2.d):boolean");
    }

    public void w() {
        this.f8551d = true;
    }

    /* access modifiers changed from: package-private */
    public void x(Rect rect, Rect rect2, int i11, int i12, int i13) {
        if (i11 == 1) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i13 - ((i14 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i11 == 2) {
            int i15 = rect.left + rect.right;
            rect2.left = i12 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i11 == 3) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i16 / 2);
            rect2.top = i13 - ((i16 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        } else if (i11 == 4) {
            int i17 = rect.left + rect.right;
            rect2.left = i12 - (((rect.bottom + rect.top) + rect.width()) / 2);
            rect2.top = (i17 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
        }
    }

    /* access modifiers changed from: package-private */
    public void y(View view) {
        p pVar = this.f8554g;
        pVar.f8573c = 0.0f;
        pVar.f8574d = 0.0f;
        this.L = true;
        pVar.q(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f8555h.q(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f8556i.k(view);
        this.j.k(view);
    }

    /* access modifiers changed from: package-private */
    public void z(Rect rect, androidx.constraintlayout.widget.c cVar, int i11, int i12) {
        int i13 = cVar.f8797d;
        if (i13 != 0) {
            x(rect, this.f8548a, i13, i11, i12);
            rect = this.f8548a;
        }
        p pVar = this.f8555h;
        pVar.f8573c = 1.0f;
        pVar.f8574d = 1.0f;
        v(pVar);
        this.f8555h.q((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        this.f8555h.a(cVar.B(this.f8550c));
        this.j.j(rect, cVar, i13, this.f8550c);
    }
}
