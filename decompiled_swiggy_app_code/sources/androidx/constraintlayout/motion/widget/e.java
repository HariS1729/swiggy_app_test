package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: KeyAttributes */
public class e extends d {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f8461g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f8462h = -1;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8463i = false;
    /* access modifiers changed from: private */
    public float j = Float.NaN;
    /* access modifiers changed from: private */
    public float k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f8464l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public float f8465m = Float.NaN;
    /* access modifiers changed from: private */
    public float n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public float f8466o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public float f8467p = Float.NaN;
    /* access modifiers changed from: private */
    public float q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public float f8468r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public float f8469s = Float.NaN;
    /* access modifiers changed from: private */
    public float t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public float f8470u = Float.NaN;
    /* access modifiers changed from: private */
    public float v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public float f8471w = Float.NaN;

    /* compiled from: KeyAttributes */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f8472a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8472a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            f8472a.append(R.styleable.KeyAttribute_android_elevation, 2);
            f8472a.append(R.styleable.KeyAttribute_android_rotation, 4);
            f8472a.append(R.styleable.KeyAttribute_android_rotationX, 5);
            f8472a.append(R.styleable.KeyAttribute_android_rotationY, 6);
            f8472a.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            f8472a.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            f8472a.append(R.styleable.KeyAttribute_android_scaleX, 7);
            f8472a.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            f8472a.append(R.styleable.KeyAttribute_transitionEasing, 9);
            f8472a.append(R.styleable.KeyAttribute_motionTarget, 10);
            f8472a.append(R.styleable.KeyAttribute_framePosition, 12);
            f8472a.append(R.styleable.KeyAttribute_curveFit, 13);
            f8472a.append(R.styleable.KeyAttribute_android_scaleY, 14);
            f8472a.append(R.styleable.KeyAttribute_android_translationX, 15);
            f8472a.append(R.styleable.KeyAttribute_android_translationY, 16);
            f8472a.append(R.styleable.KeyAttribute_android_translationZ, 17);
            f8472a.append(R.styleable.KeyAttribute_motionProgress, 18);
        }

        public static void a(e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f8472a.get(index)) {
                    case 1:
                        float unused = eVar.j = typedArray.getFloat(index, eVar.j);
                        break;
                    case 2:
                        float unused2 = eVar.k = typedArray.getDimension(index, eVar.k);
                        break;
                    case 4:
                        float unused3 = eVar.f8464l = typedArray.getFloat(index, eVar.f8464l);
                        break;
                    case 5:
                        float unused4 = eVar.f8465m = typedArray.getFloat(index, eVar.f8465m);
                        break;
                    case 6:
                        float unused5 = eVar.n = typedArray.getFloat(index, eVar.n);
                        break;
                    case 7:
                        float unused6 = eVar.f8468r = typedArray.getFloat(index, eVar.f8468r);
                        break;
                    case 8:
                        float unused7 = eVar.q = typedArray.getFloat(index, eVar.q);
                        break;
                    case 9:
                        String unused8 = eVar.f8461g = typedArray.getString(index);
                        break;
                    case 10:
                        if (!MotionLayout.f8375p1) {
                            if (typedArray.peekValue(index).type != 3) {
                                eVar.f8457b = typedArray.getResourceId(index, eVar.f8457b);
                                break;
                            } else {
                                eVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, eVar.f8457b);
                            eVar.f8457b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                eVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 12:
                        eVar.f8456a = typedArray.getInt(index, eVar.f8456a);
                        break;
                    case 13:
                        int unused9 = eVar.f8462h = typedArray.getInteger(index, eVar.f8462h);
                        break;
                    case 14:
                        float unused10 = eVar.f8469s = typedArray.getFloat(index, eVar.f8469s);
                        break;
                    case 15:
                        float unused11 = eVar.t = typedArray.getDimension(index, eVar.t);
                        break;
                    case 16:
                        float unused12 = eVar.f8470u = typedArray.getDimension(index, eVar.f8470u);
                        break;
                    case 17:
                        float unused13 = eVar.v = typedArray.getDimension(index, eVar.v);
                        break;
                    case 18:
                        float unused14 = eVar.f8471w = typedArray.getFloat(index, eVar.f8471w);
                        break;
                    case 19:
                        float unused15 = eVar.f8466o = typedArray.getDimension(index, eVar.f8466o);
                        break;
                    case 20:
                        float unused16 = eVar.f8467p = typedArray.getDimension(index, eVar.f8467p);
                        break;
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8472a.get(index));
                        break;
                }
            }
        }
    }

    public e() {
        this.f8459d = 1;
        this.f8460e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.HashMap<java.lang.String, o2.d> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e0
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            i2.j r2 = (i2.j) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r6.f8460e
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L_0x0008
            o2.d$b r2 = (o2.d.b) r2
            int r3 = r6.f8456a
            r2.h(r3, r1)
            goto L_0x0008
        L_0x003c:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00e2;
                case -1249320805: goto L_0x00d6;
                case -1225497657: goto L_0x00ca;
                case -1225497656: goto L_0x00be;
                case -1225497655: goto L_0x00b3;
                case -1001078227: goto L_0x00a8;
                case -908189618: goto L_0x009d;
                case -908189617: goto L_0x0094;
                case -760884510: goto L_0x0088;
                case -760884509: goto L_0x007b;
                case -40300674: goto L_0x006e;
                case -4379043: goto L_0x0061;
                case 37232917: goto L_0x0054;
                case 92909918: goto L_0x0047;
                default: goto L_0x0044;
            }
        L_0x0044:
            r4 = -1
            goto L_0x00ed
        L_0x0047:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0050
            goto L_0x0044
        L_0x0050:
            r4 = 13
            goto L_0x00ed
        L_0x0054:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005d
            goto L_0x0044
        L_0x005d:
            r4 = 12
            goto L_0x00ed
        L_0x0061:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x006a
            goto L_0x0044
        L_0x006a:
            r4 = 11
            goto L_0x00ed
        L_0x006e:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0077
            goto L_0x0044
        L_0x0077:
            r4 = 10
            goto L_0x00ed
        L_0x007b:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0084
            goto L_0x0044
        L_0x0084:
            r4 = 9
            goto L_0x00ed
        L_0x0088:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0091
            goto L_0x0044
        L_0x0091:
            r4 = 8
            goto L_0x00ed
        L_0x0094:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00ed
            goto L_0x0044
        L_0x009d:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a6
            goto L_0x0044
        L_0x00a6:
            r4 = 6
            goto L_0x00ed
        L_0x00a8:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b1
            goto L_0x0044
        L_0x00b1:
            r4 = 5
            goto L_0x00ed
        L_0x00b3:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00bc
            goto L_0x0044
        L_0x00bc:
            r4 = 4
            goto L_0x00ed
        L_0x00be:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00c8
            goto L_0x0044
        L_0x00c8:
            r4 = 3
            goto L_0x00ed
        L_0x00ca:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d4
            goto L_0x0044
        L_0x00d4:
            r4 = 2
            goto L_0x00ed
        L_0x00d6:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e0
            goto L_0x0044
        L_0x00e0:
            r4 = 1
            goto L_0x00ed
        L_0x00e2:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ec
            goto L_0x0044
        L_0x00ec:
            r4 = 0
        L_0x00ed:
            switch(r4) {
                case 0: goto L_0x01cf;
                case 1: goto L_0x01be;
                case 2: goto L_0x01ad;
                case 3: goto L_0x019c;
                case 4: goto L_0x018b;
                case 5: goto L_0x017a;
                case 6: goto L_0x0169;
                case 7: goto L_0x0158;
                case 8: goto L_0x0147;
                case 9: goto L_0x0136;
                case 10: goto L_0x0125;
                case 11: goto L_0x0114;
                case 12: goto L_0x0103;
                case 13: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x0008
        L_0x00f2:
            float r1 = r6.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.j
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0103:
            float r1 = r6.q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.q
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0114:
            float r1 = r6.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.k
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0125:
            float r1 = r6.f8464l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.f8464l
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0136:
            float r1 = r6.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.f8467p
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0147:
            float r1 = r6.f8465m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.f8466o
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0158:
            float r1 = r6.f8469s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.f8469s
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0169:
            float r1 = r6.f8468r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.f8468r
            r2.b(r1, r3)
            goto L_0x0008
        L_0x017a:
            float r1 = r6.f8471w
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.f8471w
            r2.b(r1, r3)
            goto L_0x0008
        L_0x018b:
            float r1 = r6.v
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.v
            r2.b(r1, r3)
            goto L_0x0008
        L_0x019c:
            float r1 = r6.f8470u
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.f8470u
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01ad:
            float r1 = r6.t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.t
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01be:
            float r1 = r6.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.n
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01cf:
            float r1 = r6.f8465m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f8456a
            float r3 = r6.f8465m
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.e.a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public d clone() {
        return new e().c(this);
    }

    public d c(d dVar) {
        super.c(dVar);
        e eVar = (e) dVar;
        this.f8462h = eVar.f8462h;
        this.f8463i = eVar.f8463i;
        this.j = eVar.j;
        this.k = eVar.k;
        this.f8464l = eVar.f8464l;
        this.f8465m = eVar.f8465m;
        this.n = eVar.n;
        this.f8466o = eVar.f8466o;
        this.f8467p = eVar.f8467p;
        this.q = eVar.q;
        this.f8468r = eVar.f8468r;
        this.f8469s = eVar.f8469s;
        this.t = eVar.t;
        this.f8470u = eVar.f8470u;
        this.v = eVar.v;
        this.f8471w = eVar.f8471w;
        return this;
    }

    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.j)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8464l)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f8465m)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f8466o)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f8467p)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8470u)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8468r)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8469s)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8471w)) {
            hashSet.add("progress");
        }
        if (this.f8460e.size() > 0) {
            for (String str : this.f8460e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyAttribute));
    }

    public void g(HashMap<String, Integer> hashMap) {
        if (this.f8462h != -1) {
            if (!Float.isNaN(this.j)) {
                hashMap.put("alpha", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.k)) {
                hashMap.put("elevation", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.f8464l)) {
                hashMap.put("rotation", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.f8465m)) {
                hashMap.put("rotationX", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("rotationY", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.f8466o)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.f8467p)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.t)) {
                hashMap.put("translationX", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.f8470u)) {
                hashMap.put("translationY", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.v)) {
                hashMap.put("translationZ", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.f8468r)) {
                hashMap.put("scaleX", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.f8469s)) {
                hashMap.put("scaleY", Integer.valueOf(this.f8462h));
            }
            if (!Float.isNaN(this.f8471w)) {
                hashMap.put("progress", Integer.valueOf(this.f8462h));
            }
            if (this.f8460e.size() > 0) {
                for (String str : this.f8460e.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.f8462h));
                }
            }
        }
    }
}
