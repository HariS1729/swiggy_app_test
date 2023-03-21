package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import o2.d;

/* compiled from: KeyTrigger */
public class k extends d {
    HashMap<String, Method> A;

    /* renamed from: g  reason: collision with root package name */
    private int f8513g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f8514h = null;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f8515i;
    /* access modifiers changed from: private */
    public String j;
    /* access modifiers changed from: private */
    public String k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f8516l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f8517m;
    private View n;

    /* renamed from: o  reason: collision with root package name */
    float f8518o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f8519p;
    private boolean q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8520r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public float f8521s;
    private float t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f8522u;
    int v;

    /* renamed from: w  reason: collision with root package name */
    int f8523w;

    /* renamed from: x  reason: collision with root package name */
    int f8524x;

    /* renamed from: y  reason: collision with root package name */
    RectF f8525y;

    /* renamed from: z  reason: collision with root package name */
    RectF f8526z;

    /* compiled from: KeyTrigger */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f8527a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8527a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            f8527a.append(R.styleable.KeyTrigger_onCross, 4);
            f8527a.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            f8527a.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            f8527a.append(R.styleable.KeyTrigger_motionTarget, 7);
            f8527a.append(R.styleable.KeyTrigger_triggerId, 6);
            f8527a.append(R.styleable.KeyTrigger_triggerSlack, 5);
            f8527a.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            f8527a.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            f8527a.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            f8527a.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            f8527a.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f8527a.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void a(k kVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f8527a.get(index)) {
                    case 1:
                        String unused = kVar.j = typedArray.getString(index);
                        break;
                    case 2:
                        String unused2 = kVar.k = typedArray.getString(index);
                        break;
                    case 4:
                        String unused3 = kVar.f8514h = typedArray.getString(index);
                        break;
                    case 5:
                        kVar.f8518o = typedArray.getFloat(index, kVar.f8518o);
                        break;
                    case 6:
                        int unused4 = kVar.f8516l = typedArray.getResourceId(index, kVar.f8516l);
                        break;
                    case 7:
                        if (!MotionLayout.f8375p1) {
                            if (typedArray.peekValue(index).type != 3) {
                                kVar.f8457b = typedArray.getResourceId(index, kVar.f8457b);
                                break;
                            } else {
                                kVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, kVar.f8457b);
                            kVar.f8457b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                kVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, kVar.f8456a);
                        kVar.f8456a = integer;
                        float unused5 = kVar.f8521s = (((float) integer) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        int unused6 = kVar.f8517m = typedArray.getResourceId(index, kVar.f8517m);
                        break;
                    case 10:
                        boolean unused7 = kVar.f8522u = typedArray.getBoolean(index, kVar.f8522u);
                        break;
                    case 11:
                        int unused8 = kVar.f8515i = typedArray.getResourceId(index, kVar.f8515i);
                        break;
                    case 12:
                        kVar.f8524x = typedArray.getResourceId(index, kVar.f8524x);
                        break;
                    case 13:
                        kVar.v = typedArray.getResourceId(index, kVar.v);
                        break;
                    case 14:
                        kVar.f8523w = typedArray.getResourceId(index, kVar.f8523w);
                        break;
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8527a.get(index));
                        break;
                }
            }
        }
    }

    public k() {
        int i11 = d.f8455f;
        this.f8515i = i11;
        this.j = null;
        this.k = null;
        this.f8516l = i11;
        this.f8517m = i11;
        this.n = null;
        this.f8518o = 0.1f;
        this.f8519p = true;
        this.q = true;
        this.f8520r = true;
        this.f8521s = Float.NaN;
        this.f8522u = false;
        this.v = i11;
        this.f8523w = i11;
        this.f8524x = i11;
        this.f8525y = new RectF();
        this.f8526z = new RectF();
        this.A = new HashMap<>();
        this.f8459d = 5;
        this.f8460e = new HashMap<>();
    }

    private void v(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                w(str, view);
                return;
            }
            if (this.A.containsKey(str)) {
                method = this.A.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.A.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.A.put(str, (Object) null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + a.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f8514h + "\"on class " + view.getClass().getSimpleName() + " " + a.d(view));
            }
        }
    }

    private void w(String str, View view) {
        ConstraintAttribute constraintAttribute;
        boolean z11 = str.length() == 1;
        if (!z11) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String next : this.f8460e.keySet()) {
            String lowerCase = next.toLowerCase(Locale.ROOT);
            if ((z11 || lowerCase.matches(str)) && (constraintAttribute = this.f8460e.get(next)) != null) {
                constraintAttribute.a(view);
            }
        }
    }

    private void x(RectF rectF, View view, boolean z11) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z11) {
            view.getMatrix().mapRect(rectF);
        }
    }

    public void a(HashMap<String, d> hashMap) {
    }

    /* renamed from: b */
    public d clone() {
        return new k().c(this);
    }

    public d c(d dVar) {
        super.c(dVar);
        k kVar = (k) dVar;
        this.f8513g = kVar.f8513g;
        this.f8514h = kVar.f8514h;
        this.f8515i = kVar.f8515i;
        this.j = kVar.j;
        this.k = kVar.k;
        this.f8516l = kVar.f8516l;
        this.f8517m = kVar.f8517m;
        this.n = kVar.n;
        this.f8518o = kVar.f8518o;
        this.f8519p = kVar.f8519p;
        this.q = kVar.q;
        this.f8520r = kVar.f8520r;
        this.f8521s = kVar.f8521s;
        this.t = kVar.t;
        this.f8522u = kVar.f8522u;
        this.f8525y = kVar.f8525y;
        this.f8526z = kVar.f8526z;
        this.A = kVar.A;
        return this;
    }

    public void d(HashSet<String> hashSet) {
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTrigger), context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.f8517m
            int r1 = androidx.constraintlayout.motion.widget.d.f8455f
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0062
            android.view.View r0 = r9.n
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.f8517m
            android.view.View r0 = r0.findViewById(r1)
            r9.n = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.f8525y
            android.view.View r1 = r9.n
            boolean r4 = r9.f8522u
            r9.x(r0, r1, r4)
            android.graphics.RectF r0 = r9.f8526z
            boolean r1 = r9.f8522u
            r9.x(r0, r11, r1)
            android.graphics.RectF r0 = r9.f8525y
            android.graphics.RectF r1 = r9.f8526z
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r9.f8519p
            if (r0 == 0) goto L_0x003c
            r9.f8519p = r2
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r9.f8520r
            if (r1 == 0) goto L_0x0045
            r9.f8520r = r2
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r9.q = r3
            r4 = r1
            r1 = 0
            goto L_0x00e3
        L_0x004c:
            boolean r0 = r9.f8519p
            if (r0 != 0) goto L_0x0054
            r9.f8519p = r3
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            boolean r1 = r9.q
            if (r1 == 0) goto L_0x005d
            r9.q = r2
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            r9.f8520r = r3
            goto L_0x00e2
        L_0x0062:
            boolean r0 = r9.f8519p
            r1 = 0
            if (r0 == 0) goto L_0x0078
            float r0 = r9.f8521s
            float r4 = r10 - r0
            float r5 = r9.t
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r9.f8519p = r2
            r0 = 1
            goto L_0x0089
        L_0x0078:
            float r0 = r9.f8521s
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.f8518o
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r9.f8519p = r3
        L_0x0088:
            r0 = 0
        L_0x0089:
            boolean r4 = r9.q
            if (r4 == 0) goto L_0x00a2
            float r4 = r9.f8521s
            float r5 = r10 - r4
            float r6 = r9.t
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            r9.q = r2
            r4 = 1
            goto L_0x00b3
        L_0x00a2:
            float r4 = r9.f8521s
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.f8518o
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b2
            r9.q = r3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            boolean r5 = r9.f8520r
            if (r5 == 0) goto L_0x00d1
            float r5 = r9.f8521s
            float r6 = r10 - r5
            float r7 = r9.t
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cc
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cc
            r9.f8520r = r2
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x00e3
        L_0x00d1:
            float r1 = r9.f8521s
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.f8518o
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e1
            r9.f8520r = r3
        L_0x00e1:
            r1 = r4
        L_0x00e2:
            r4 = 0
        L_0x00e3:
            r9.t = r10
            if (r1 != 0) goto L_0x00eb
            if (r0 != 0) goto L_0x00eb
            if (r4 == 0) goto L_0x00f6
        L_0x00eb:
            android.view.ViewParent r5 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.f8516l
            r5.p0(r6, r4, r10)
        L_0x00f6:
            int r10 = r9.f8515i
            int r5 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r10 != r5) goto L_0x00fe
            r10 = r11
            goto L_0x010a
        L_0x00fe:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r5 = r9.f8515i
            android.view.View r10 = r10.findViewById(r5)
        L_0x010a:
            if (r1 == 0) goto L_0x0128
            java.lang.String r1 = r9.j
            if (r1 == 0) goto L_0x0113
            r9.v(r1, r10)
        L_0x0113:
            int r1 = r9.v
            int r5 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r1 == r5) goto L_0x0128
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r9.v
            android.view.View[] r6 = new android.view.View[r3]
            r6[r2] = r10
            r1.P0(r5, r6)
        L_0x0128:
            if (r4 == 0) goto L_0x0146
            java.lang.String r1 = r9.k
            if (r1 == 0) goto L_0x0131
            r9.v(r1, r10)
        L_0x0131:
            int r1 = r9.f8523w
            int r4 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r1 == r4) goto L_0x0146
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r4 = r9.f8523w
            android.view.View[] r5 = new android.view.View[r3]
            r5[r2] = r10
            r1.P0(r4, r5)
        L_0x0146:
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = r9.f8514h
            if (r0 == 0) goto L_0x014f
            r9.v(r0, r10)
        L_0x014f:
            int r0 = r9.f8524x
            int r1 = androidx.constraintlayout.motion.widget.d.f8455f
            if (r0 == r1) goto L_0x0164
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.f8524x
            android.view.View[] r1 = new android.view.View[r3]
            r1[r2] = r10
            r11.P0(r0, r1)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.k.u(float, android.view.View):void");
    }
}
