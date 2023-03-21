package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;
import o2.d;

/* compiled from: KeyTimeCycle */
public class j extends d {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f8500g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f8501h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public float f8502i = Float.NaN;
    /* access modifiers changed from: private */
    public float j = Float.NaN;
    /* access modifiers changed from: private */
    public float k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f8503l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public float f8504m = Float.NaN;
    /* access modifiers changed from: private */
    public float n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public float f8505o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public float f8506p = Float.NaN;
    /* access modifiers changed from: private */
    public float q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public float f8507r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public float f8508s = Float.NaN;
    /* access modifiers changed from: private */
    public float t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public int f8509u = 0;
    /* access modifiers changed from: private */
    public String v = null;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public float f8510w = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public float f8511x = 0.0f;

    /* compiled from: KeyTimeCycle */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f8512a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8512a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            f8512a.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            f8512a.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            f8512a.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            f8512a.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            f8512a.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            f8512a.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            f8512a.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            f8512a.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            f8512a.append(R.styleable.KeyTimeCycle_framePosition, 12);
            f8512a.append(R.styleable.KeyTimeCycle_curveFit, 13);
            f8512a.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            f8512a.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            f8512a.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            f8512a.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            f8512a.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            f8512a.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            f8512a.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            f8512a.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void a(j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f8512a.get(index)) {
                    case 1:
                        float unused = jVar.f8502i = typedArray.getFloat(index, jVar.f8502i);
                        break;
                    case 2:
                        float unused2 = jVar.j = typedArray.getDimension(index, jVar.j);
                        break;
                    case 4:
                        float unused3 = jVar.k = typedArray.getFloat(index, jVar.k);
                        break;
                    case 5:
                        float unused4 = jVar.f8503l = typedArray.getFloat(index, jVar.f8503l);
                        break;
                    case 6:
                        float unused5 = jVar.f8504m = typedArray.getFloat(index, jVar.f8504m);
                        break;
                    case 7:
                        float unused6 = jVar.f8505o = typedArray.getFloat(index, jVar.f8505o);
                        break;
                    case 8:
                        float unused7 = jVar.n = typedArray.getFloat(index, jVar.n);
                        break;
                    case 9:
                        String unused8 = jVar.f8500g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f8375p1) {
                            if (typedArray.peekValue(index).type != 3) {
                                jVar.f8457b = typedArray.getResourceId(index, jVar.f8457b);
                                break;
                            } else {
                                jVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, jVar.f8457b);
                            jVar.f8457b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                jVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        jVar.f8456a = typedArray.getInt(index, jVar.f8456a);
                        break;
                    case 13:
                        int unused9 = jVar.f8501h = typedArray.getInteger(index, jVar.f8501h);
                        break;
                    case 14:
                        float unused10 = jVar.f8506p = typedArray.getFloat(index, jVar.f8506p);
                        break;
                    case 15:
                        float unused11 = jVar.q = typedArray.getDimension(index, jVar.q);
                        break;
                    case 16:
                        float unused12 = jVar.f8507r = typedArray.getDimension(index, jVar.f8507r);
                        break;
                    case 17:
                        float unused13 = jVar.f8508s = typedArray.getDimension(index, jVar.f8508s);
                        break;
                    case 18:
                        float unused14 = jVar.t = typedArray.getFloat(index, jVar.t);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused15 = jVar.f8509u = typedArray.getInt(index, jVar.f8509u);
                            break;
                        } else {
                            String unused16 = jVar.v = typedArray.getString(index);
                            int unused17 = jVar.f8509u = 7;
                            break;
                        }
                    case 20:
                        float unused18 = jVar.f8510w = typedArray.getFloat(index, jVar.f8510w);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused19 = jVar.f8511x = typedArray.getFloat(index, jVar.f8511x);
                            break;
                        } else {
                            float unused20 = jVar.f8511x = typedArray.getDimension(index, jVar.f8511x);
                            break;
                        }
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8512a.get(index));
                        break;
                }
            }
        }
    }

    public j() {
        this.f8459d = 3;
        this.f8460e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Q(java.util.HashMap<java.lang.String, o2.f> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x020d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            o2.f r3 = (o2.f) r3
            if (r3 != 0) goto L_0x001e
            goto L_0x0008
        L_0x001e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0045
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r10.f8460e
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            o2.f$b r4 = (o2.f.b) r4
            int r5 = r10.f8456a
            float r7 = r10.f8510w
            int r8 = r10.f8509u
            float r9 = r10.f8511x
            r4.j(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0045:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00ce;
                case -1249320805: goto L_0x00c3;
                case -1225497657: goto L_0x00b8;
                case -1225497656: goto L_0x00ad;
                case -1225497655: goto L_0x00a2;
                case -1001078227: goto L_0x0097;
                case -908189618: goto L_0x008c;
                case -908189617: goto L_0x0083;
                case -40300674: goto L_0x0077;
                case -4379043: goto L_0x006a;
                case 37232917: goto L_0x005d;
                case 92909918: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            r4 = -1
            goto L_0x00d9
        L_0x0050:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            r4 = 11
            goto L_0x00d9
        L_0x005d:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0066
            goto L_0x004d
        L_0x0066:
            r4 = 10
            goto L_0x00d9
        L_0x006a:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0073
            goto L_0x004d
        L_0x0073:
            r4 = 9
            goto L_0x00d9
        L_0x0077:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0080
            goto L_0x004d
        L_0x0080:
            r4 = 8
            goto L_0x00d9
        L_0x0083:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00d9
            goto L_0x004d
        L_0x008c:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x0095
            goto L_0x004d
        L_0x0095:
            r4 = 6
            goto L_0x00d9
        L_0x0097:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00a0
            goto L_0x004d
        L_0x00a0:
            r4 = 5
            goto L_0x00d9
        L_0x00a2:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ab
            goto L_0x004d
        L_0x00ab:
            r4 = 4
            goto L_0x00d9
        L_0x00ad:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00b6
            goto L_0x004d
        L_0x00b6:
            r4 = 3
            goto L_0x00d9
        L_0x00b8:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00c1
            goto L_0x004d
        L_0x00c1:
            r4 = 2
            goto L_0x00d9
        L_0x00c3:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00cc
            goto L_0x004d
        L_0x00cc:
            r4 = 1
            goto L_0x00d9
        L_0x00ce:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00d8
            goto L_0x004d
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            switch(r4) {
                case 0: goto L_0x01f6;
                case 1: goto L_0x01df;
                case 2: goto L_0x01c8;
                case 3: goto L_0x01b1;
                case 4: goto L_0x019a;
                case 5: goto L_0x0183;
                case 6: goto L_0x016c;
                case 7: goto L_0x0155;
                case 8: goto L_0x013e;
                case 9: goto L_0x0127;
                case 10: goto L_0x0110;
                case 11: goto L_0x00f9;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00f9:
            float r1 = r10.f8502i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.f8502i
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0110:
            float r1 = r10.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.n
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0127:
            float r1 = r10.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.j
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x013e:
            float r1 = r10.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.k
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0155:
            float r1 = r10.f8506p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.f8506p
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x016c:
            float r1 = r10.f8505o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.f8505o
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0183:
            float r1 = r10.t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.t
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x019a:
            float r1 = r10.f8508s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.f8508s
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01b1:
            float r1 = r10.f8507r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.f8507r
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01c8:
            float r1 = r10.q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.q
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01df:
            float r1 = r10.f8504m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.f8504m
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01f6:
            float r1 = r10.f8503l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f8456a
            float r5 = r10.f8503l
            float r6 = r10.f8510w
            int r7 = r10.f8509u
            float r8 = r10.f8511x
            r3.b(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.Q(java.util.HashMap):void");
    }

    public void a(HashMap<String, d> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public d clone() {
        return new j().c(this);
    }

    public d c(d dVar) {
        super.c(dVar);
        j jVar = (j) dVar;
        this.f8500g = jVar.f8500g;
        this.f8501h = jVar.f8501h;
        this.f8509u = jVar.f8509u;
        this.f8510w = jVar.f8510w;
        this.f8511x = jVar.f8511x;
        this.t = jVar.t;
        this.f8502i = jVar.f8502i;
        this.j = jVar.j;
        this.k = jVar.k;
        this.n = jVar.n;
        this.f8503l = jVar.f8503l;
        this.f8504m = jVar.f8504m;
        this.f8505o = jVar.f8505o;
        this.f8506p = jVar.f8506p;
        this.q = jVar.q;
        this.f8507r = jVar.f8507r;
        this.f8508s = jVar.f8508s;
        return this;
    }

    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8502i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f8503l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8504m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8507r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8508s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8505o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8506p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("progress");
        }
        if (this.f8460e.size() > 0) {
            for (String str : this.f8460e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTimeCycle));
    }

    public void g(HashMap<String, Integer> hashMap) {
        if (this.f8501h != -1) {
            if (!Float.isNaN(this.f8502i)) {
                hashMap.put("alpha", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.j)) {
                hashMap.put("elevation", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.k)) {
                hashMap.put("rotation", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.f8503l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.f8504m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("translationX", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.f8507r)) {
                hashMap.put("translationY", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.f8508s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.f8505o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.f8505o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f8501h));
            }
            if (!Float.isNaN(this.t)) {
                hashMap.put("progress", Integer.valueOf(this.f8501h));
            }
            if (this.f8460e.size() > 0) {
                for (String str : this.f8460e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f8501h));
                }
            }
        }
    }
}
