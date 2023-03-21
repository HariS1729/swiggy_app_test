package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import i2.j;
import in.swiggy.android.tejas.feature.order.model.network.DashOrderTypes;
import java.util.HashMap;
import java.util.HashSet;
import o2.c;
import o2.d;

/* compiled from: KeyCycle */
public class f extends d {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f8473g = null;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f8474h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f8475i = -1;
    /* access modifiers changed from: private */
    public String j = null;
    /* access modifiers changed from: private */
    public float k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public float f8476l = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public float f8477m = 0.0f;
    /* access modifiers changed from: private */
    public float n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f8478o = -1;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public float f8479p = Float.NaN;
    /* access modifiers changed from: private */
    public float q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public float f8480r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public float f8481s = Float.NaN;
    /* access modifiers changed from: private */
    public float t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public float f8482u = Float.NaN;
    /* access modifiers changed from: private */
    public float v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public float f8483w = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public float f8484x = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public float f8485y = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public float f8486z = Float.NaN;

    /* compiled from: KeyCycle */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static SparseIntArray f8487a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8487a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            f8487a.append(R.styleable.KeyCycle_framePosition, 2);
            f8487a.append(R.styleable.KeyCycle_transitionEasing, 3);
            f8487a.append(R.styleable.KeyCycle_curveFit, 4);
            f8487a.append(R.styleable.KeyCycle_waveShape, 5);
            f8487a.append(R.styleable.KeyCycle_wavePeriod, 6);
            f8487a.append(R.styleable.KeyCycle_waveOffset, 7);
            f8487a.append(R.styleable.KeyCycle_waveVariesBy, 8);
            f8487a.append(R.styleable.KeyCycle_android_alpha, 9);
            f8487a.append(R.styleable.KeyCycle_android_elevation, 10);
            f8487a.append(R.styleable.KeyCycle_android_rotation, 11);
            f8487a.append(R.styleable.KeyCycle_android_rotationX, 12);
            f8487a.append(R.styleable.KeyCycle_android_rotationY, 13);
            f8487a.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            f8487a.append(R.styleable.KeyCycle_android_scaleX, 15);
            f8487a.append(R.styleable.KeyCycle_android_scaleY, 16);
            f8487a.append(R.styleable.KeyCycle_android_translationX, 17);
            f8487a.append(R.styleable.KeyCycle_android_translationY, 18);
            f8487a.append(R.styleable.KeyCycle_android_translationZ, 19);
            f8487a.append(R.styleable.KeyCycle_motionProgress, 20);
            f8487a.append(R.styleable.KeyCycle_wavePhase, 21);
        }

        /* access modifiers changed from: private */
        public static void b(f fVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                switch (f8487a.get(index)) {
                    case 1:
                        if (!MotionLayout.f8375p1) {
                            if (typedArray.peekValue(index).type != 3) {
                                fVar.f8457b = typedArray.getResourceId(index, fVar.f8457b);
                                break;
                            } else {
                                fVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        } else {
                            int resourceId = typedArray.getResourceId(index, fVar.f8457b);
                            fVar.f8457b = resourceId;
                            if (resourceId != -1) {
                                break;
                            } else {
                                fVar.f8458c = typedArray.getString(index);
                                break;
                            }
                        }
                    case 2:
                        fVar.f8456a = typedArray.getInt(index, fVar.f8456a);
                        break;
                    case 3:
                        String unused = fVar.f8473g = typedArray.getString(index);
                        break;
                    case 4:
                        int unused2 = fVar.f8474h = typedArray.getInteger(index, fVar.f8474h);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type != 3) {
                            int unused3 = fVar.f8475i = typedArray.getInt(index, fVar.f8475i);
                            break;
                        } else {
                            String unused4 = fVar.j = typedArray.getString(index);
                            int unused5 = fVar.f8475i = 7;
                            break;
                        }
                    case 6:
                        float unused6 = fVar.k = typedArray.getFloat(index, fVar.k);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            float unused7 = fVar.f8476l = typedArray.getFloat(index, fVar.f8476l);
                            break;
                        } else {
                            float unused8 = fVar.f8476l = typedArray.getDimension(index, fVar.f8476l);
                            break;
                        }
                    case 8:
                        int unused9 = fVar.f8478o = typedArray.getInt(index, fVar.f8478o);
                        break;
                    case 9:
                        float unused10 = fVar.f8479p = typedArray.getFloat(index, fVar.f8479p);
                        break;
                    case 10:
                        float unused11 = fVar.q = typedArray.getDimension(index, fVar.q);
                        break;
                    case 11:
                        float unused12 = fVar.f8480r = typedArray.getFloat(index, fVar.f8480r);
                        break;
                    case 12:
                        float unused13 = fVar.t = typedArray.getFloat(index, fVar.t);
                        break;
                    case 13:
                        float unused14 = fVar.f8482u = typedArray.getFloat(index, fVar.f8482u);
                        break;
                    case 14:
                        float unused15 = fVar.f8481s = typedArray.getFloat(index, fVar.f8481s);
                        break;
                    case 15:
                        float unused16 = fVar.v = typedArray.getFloat(index, fVar.v);
                        break;
                    case 16:
                        float unused17 = fVar.f8483w = typedArray.getFloat(index, fVar.f8483w);
                        break;
                    case 17:
                        float unused18 = fVar.f8484x = typedArray.getDimension(index, fVar.f8484x);
                        break;
                    case 18:
                        float unused19 = fVar.f8485y = typedArray.getDimension(index, fVar.f8485y);
                        break;
                    case 19:
                        float unused20 = fVar.f8486z = typedArray.getDimension(index, fVar.f8486z);
                        break;
                    case 20:
                        float unused21 = fVar.n = typedArray.getFloat(index, fVar.n);
                        break;
                    case 21:
                        float unused22 = fVar.f8477m = typedArray.getFloat(index, fVar.f8477m) / 360.0f;
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8487a.get(index));
                        break;
                }
            }
        }
    }

    public f() {
        this.f8459d = 4;
        this.f8460e = new HashMap<>();
    }

    public void U(HashMap<String, c> hashMap) {
        c cVar;
        c cVar2;
        HashMap<String, c> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith(DashOrderTypes.CUSTOM)) {
                ConstraintAttribute constraintAttribute = this.f8460e.get(next.substring(7));
                if (!(constraintAttribute == null || constraintAttribute.d() != ConstraintAttribute.AttributeType.FLOAT_TYPE || (cVar2 = hashMap2.get(next)) == null)) {
                    cVar2.d(this.f8456a, this.f8475i, this.j, this.f8478o, this.k, this.f8476l, this.f8477m, constraintAttribute.e(), constraintAttribute);
                }
            } else {
                float V = V(next);
                if (!Float.isNaN(V) && (cVar = hashMap2.get(next)) != null) {
                    cVar.c(this.f8456a, this.f8475i, this.j, this.f8478o, this.k, this.f8476l, this.f8477m, V);
                }
            }
        }
    }

    public float V(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c11 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 11;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c11 = 12;
                    break;
                }
                break;
            case 1530034690:
                if (str.equals("wavePhase")) {
                    c11 = 13;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return this.t;
            case 1:
                return this.f8482u;
            case 2:
                return this.f8484x;
            case 3:
                return this.f8485y;
            case 4:
                return this.f8486z;
            case 5:
                return this.n;
            case 6:
                return this.v;
            case 7:
                return this.f8483w;
            case 8:
                return this.f8480r;
            case 9:
                return this.q;
            case 10:
                return this.f8481s;
            case 11:
                return this.f8479p;
            case 12:
                return this.f8476l;
            case 13:
                return this.f8477m;
            default:
                if (str.startsWith(DashOrderTypes.CUSTOM)) {
                    return Float.NaN;
                }
                Log.v("WARNING! KeyCycle", "  UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    public void a(HashMap<String, d> hashMap) {
        a.g("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String next : hashMap.keySet()) {
            j jVar = hashMap.get(next);
            if (jVar != null) {
                next.hashCode();
                char c11 = 65535;
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (next.equals("progress")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (next.equals("rotation")) {
                            c11 = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c11 = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c11 = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c11 = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c11 = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c11 = 13;
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        jVar.b(this.f8456a, this.t);
                        break;
                    case 1:
                        jVar.b(this.f8456a, this.f8482u);
                        break;
                    case 2:
                        jVar.b(this.f8456a, this.f8484x);
                        break;
                    case 3:
                        jVar.b(this.f8456a, this.f8485y);
                        break;
                    case 4:
                        jVar.b(this.f8456a, this.f8486z);
                        break;
                    case 5:
                        jVar.b(this.f8456a, this.n);
                        break;
                    case 6:
                        jVar.b(this.f8456a, this.v);
                        break;
                    case 7:
                        jVar.b(this.f8456a, this.f8483w);
                        break;
                    case 8:
                        jVar.b(this.f8456a, this.f8480r);
                        break;
                    case 9:
                        jVar.b(this.f8456a, this.q);
                        break;
                    case 10:
                        jVar.b(this.f8456a, this.f8481s);
                        break;
                    case 11:
                        jVar.b(this.f8456a, this.f8479p);
                        break;
                    case 12:
                        jVar.b(this.f8456a, this.f8476l);
                        break;
                    case 13:
                        jVar.b(this.f8456a, this.f8477m);
                        break;
                    default:
                        if (next.startsWith(DashOrderTypes.CUSTOM)) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + next);
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: b */
    public d clone() {
        return new f().c(this);
    }

    public d c(d dVar) {
        super.c(dVar);
        f fVar = (f) dVar;
        this.f8473g = fVar.f8473g;
        this.f8474h = fVar.f8474h;
        this.f8475i = fVar.f8475i;
        this.j = fVar.j;
        this.k = fVar.k;
        this.f8476l = fVar.f8476l;
        this.f8477m = fVar.f8477m;
        this.n = fVar.n;
        this.f8478o = fVar.f8478o;
        this.f8479p = fVar.f8479p;
        this.q = fVar.q;
        this.f8480r = fVar.f8480r;
        this.f8481s = fVar.f8481s;
        this.t = fVar.t;
        this.f8482u = fVar.f8482u;
        this.v = fVar.v;
        this.f8483w = fVar.f8483w;
        this.f8484x = fVar.f8484x;
        this.f8485y = fVar.f8485y;
        this.f8486z = fVar.f8486z;
        return this;
    }

    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f8479p)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f8480r)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f8482u)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f8483w)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f8481s)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8484x)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f8485y)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f8486z)) {
            hashSet.add("translationZ");
        }
        if (this.f8460e.size() > 0) {
            for (String str : this.f8460e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle));
    }
}
