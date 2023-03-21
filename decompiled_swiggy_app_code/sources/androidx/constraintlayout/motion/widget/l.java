package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.c;
import com.xiaomi.mipush.sdk.Constants;
import i2.c;
import in.swiggy.android.tejas.feature.order.model.network.DashOrderTypes;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import o2.d;
import pc0.x;

/* compiled from: MotionConstrainedPoint */
class l implements Comparable<l> {
    static String[] D = {"position", x.f81957i, "y", "width", "height", "pathRotate"};
    int A = 0;
    double[] B = new double[18];
    double[] C = new double[18];

    /* renamed from: a  reason: collision with root package name */
    private float f8528a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    int f8529b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f8530c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8531d = false;

    /* renamed from: e  reason: collision with root package name */
    private float f8532e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    private float f8533f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private float f8534g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f8535h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    private float f8536i = 1.0f;
    private float j = 1.0f;
    private float k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    private float f8537l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    private float f8538m = 0.0f;
    private float n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f8539o = 0.0f;

    /* renamed from: p  reason: collision with root package name */
    private c f8540p;
    private int q = 0;

    /* renamed from: r  reason: collision with root package name */
    private float f8541r;

    /* renamed from: s  reason: collision with root package name */
    private float f8542s;
    private float t;

    /* renamed from: u  reason: collision with root package name */
    private float f8543u;
    private float v;

    /* renamed from: w  reason: collision with root package name */
    private float f8544w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    private float f8545x = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    private int f8546y = -1;

    /* renamed from: z  reason: collision with root package name */
    LinkedHashMap<String, ConstraintAttribute> f8547z = new LinkedHashMap<>();

    private boolean f(float f11, float f12) {
        if (Float.isNaN(f11) || Float.isNaN(f12)) {
            if (Float.isNaN(f11) != Float.isNaN(f12)) {
                return true;
            }
            return false;
        } else if (Math.abs(f11 - f12) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    public void a(HashMap<String, d> hashMap, int i11) {
        for (String next : hashMap.keySet()) {
            d dVar = hashMap.get(next);
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
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c11 = 8;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c11 = 9;
                        break;
                    }
                    break;
                case -40300674:
                    if (next.equals("rotation")) {
                        c11 = 10;
                        break;
                    }
                    break;
                case -4379043:
                    if (next.equals("elevation")) {
                        c11 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (next.equals("transitionPathRotate")) {
                        c11 = 12;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c11 = 13;
                        break;
                    }
                    break;
            }
            float f11 = 1.0f;
            float f12 = 0.0f;
            switch (c11) {
                case 0:
                    if (!Float.isNaN(this.f8534g)) {
                        f12 = this.f8534g;
                    }
                    dVar.b(i11, f12);
                    break;
                case 1:
                    if (!Float.isNaN(this.f8535h)) {
                        f12 = this.f8535h;
                    }
                    dVar.b(i11, f12);
                    break;
                case 2:
                    if (!Float.isNaN(this.f8538m)) {
                        f12 = this.f8538m;
                    }
                    dVar.b(i11, f12);
                    break;
                case 3:
                    if (!Float.isNaN(this.n)) {
                        f12 = this.n;
                    }
                    dVar.b(i11, f12);
                    break;
                case 4:
                    if (!Float.isNaN(this.f8539o)) {
                        f12 = this.f8539o;
                    }
                    dVar.b(i11, f12);
                    break;
                case 5:
                    if (!Float.isNaN(this.f8545x)) {
                        f12 = this.f8545x;
                    }
                    dVar.b(i11, f12);
                    break;
                case 6:
                    if (!Float.isNaN(this.f8536i)) {
                        f11 = this.f8536i;
                    }
                    dVar.b(i11, f11);
                    break;
                case 7:
                    if (!Float.isNaN(this.j)) {
                        f11 = this.j;
                    }
                    dVar.b(i11, f11);
                    break;
                case 8:
                    if (!Float.isNaN(this.k)) {
                        f12 = this.k;
                    }
                    dVar.b(i11, f12);
                    break;
                case 9:
                    if (!Float.isNaN(this.f8537l)) {
                        f12 = this.f8537l;
                    }
                    dVar.b(i11, f12);
                    break;
                case 10:
                    if (!Float.isNaN(this.f8533f)) {
                        f12 = this.f8533f;
                    }
                    dVar.b(i11, f12);
                    break;
                case 11:
                    if (!Float.isNaN(this.f8532e)) {
                        f12 = this.f8532e;
                    }
                    dVar.b(i11, f12);
                    break;
                case 12:
                    if (!Float.isNaN(this.f8544w)) {
                        f12 = this.f8544w;
                    }
                    dVar.b(i11, f12);
                    break;
                case 13:
                    if (!Float.isNaN(this.f8528a)) {
                        f11 = this.f8528a;
                    }
                    dVar.b(i11, f11);
                    break;
                default:
                    if (!next.startsWith(DashOrderTypes.CUSTOM)) {
                        Log.e("MotionPaths", "UNKNOWN spline " + next);
                        break;
                    } else {
                        String str = next.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
                        if (!this.f8547z.containsKey(str)) {
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.f8547z.get(str);
                            if (!(dVar instanceof d.b)) {
                                Log.e("MotionPaths", next + " ViewSpline not a CustomSet frame = " + i11 + ", value" + constraintAttribute.e() + dVar);
                                break;
                            } else {
                                ((d.b) dVar).h(i11, constraintAttribute);
                                break;
                            }
                        }
                    }
            }
        }
    }

    public void c(View view) {
        this.f8530c = view.getVisibility();
        this.f8528a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f8531d = false;
        this.f8532e = view.getElevation();
        this.f8533f = view.getRotation();
        this.f8534g = view.getRotationX();
        this.f8535h = view.getRotationY();
        this.f8536i = view.getScaleX();
        this.j = view.getScaleY();
        this.k = view.getPivotX();
        this.f8537l = view.getPivotY();
        this.f8538m = view.getTranslationX();
        this.n = view.getTranslationY();
        this.f8539o = view.getTranslationZ();
    }

    public void d(c.a aVar) {
        float f11;
        c.d dVar = aVar.f8803c;
        int i11 = dVar.f8871c;
        this.f8529b = i11;
        int i12 = dVar.f8870b;
        this.f8530c = i12;
        if (i12 == 0 || i11 != 0) {
            f11 = dVar.f8872d;
        } else {
            f11 = 0.0f;
        }
        this.f8528a = f11;
        c.e eVar = aVar.f8806f;
        this.f8531d = eVar.f8885m;
        this.f8532e = eVar.n;
        this.f8533f = eVar.f8876b;
        this.f8534g = eVar.f8877c;
        this.f8535h = eVar.f8878d;
        this.f8536i = eVar.f8879e;
        this.j = eVar.f8880f;
        this.k = eVar.f8881g;
        this.f8537l = eVar.f8882h;
        this.f8538m = eVar.j;
        this.n = eVar.k;
        this.f8539o = eVar.f8884l;
        this.f8540p = i2.c.c(aVar.f8804d.f8861d);
        c.C0030c cVar = aVar.f8804d;
        this.f8544w = cVar.f8866i;
        this.q = cVar.f8863f;
        this.f8546y = cVar.f8859b;
        this.f8545x = aVar.f8803c.f8873e;
        for (String next : aVar.f8807g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f8807g.get(next);
            if (constraintAttribute.g()) {
                this.f8547z.put(next, constraintAttribute);
            }
        }
    }

    /* renamed from: e */
    public int compareTo(l lVar) {
        return Float.compare(this.f8541r, lVar.f8541r);
    }

    /* access modifiers changed from: package-private */
    public void g(l lVar, HashSet<String> hashSet) {
        if (f(this.f8528a, lVar.f8528a)) {
            hashSet.add("alpha");
        }
        if (f(this.f8532e, lVar.f8532e)) {
            hashSet.add("elevation");
        }
        int i11 = this.f8530c;
        int i12 = lVar.f8530c;
        if (i11 != i12 && this.f8529b == 0 && (i11 == 0 || i12 == 0)) {
            hashSet.add("alpha");
        }
        if (f(this.f8533f, lVar.f8533f)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f8544w) || !Float.isNaN(lVar.f8544w)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f8545x) || !Float.isNaN(lVar.f8545x)) {
            hashSet.add("progress");
        }
        if (f(this.f8534g, lVar.f8534g)) {
            hashSet.add("rotationX");
        }
        if (f(this.f8535h, lVar.f8535h)) {
            hashSet.add("rotationY");
        }
        if (f(this.k, lVar.k)) {
            hashSet.add("transformPivotX");
        }
        if (f(this.f8537l, lVar.f8537l)) {
            hashSet.add("transformPivotY");
        }
        if (f(this.f8536i, lVar.f8536i)) {
            hashSet.add("scaleX");
        }
        if (f(this.j, lVar.j)) {
            hashSet.add("scaleY");
        }
        if (f(this.f8538m, lVar.f8538m)) {
            hashSet.add("translationX");
        }
        if (f(this.n, lVar.n)) {
            hashSet.add("translationY");
        }
        if (f(this.f8539o, lVar.f8539o)) {
            hashSet.add("translationZ");
        }
    }

    /* access modifiers changed from: package-private */
    public void h(float f11, float f12, float f13, float f14) {
        this.f8542s = f11;
        this.t = f12;
        this.f8543u = f13;
        this.v = f14;
    }

    public void i(Rect rect, View view, int i11, float f11) {
        h((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        c(view);
        this.k = Float.NaN;
        this.f8537l = Float.NaN;
        if (i11 == 1) {
            this.f8533f = f11 - 90.0f;
        } else if (i11 == 2) {
            this.f8533f = f11 + 90.0f;
        }
    }

    public void j(Rect rect, androidx.constraintlayout.widget.c cVar, int i11, int i12) {
        h((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        d(cVar.B(i12));
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                }
            }
            float f11 = this.f8533f + 90.0f;
            this.f8533f = f11;
            if (f11 > 180.0f) {
                this.f8533f = f11 - 360.0f;
                return;
            }
            return;
        }
        this.f8533f -= 90.0f;
    }

    public void k(View view) {
        h(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        c(view);
    }
}
