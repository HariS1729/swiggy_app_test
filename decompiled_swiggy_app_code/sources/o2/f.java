package o2;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.xiaomi.mipush.sdk.Constants;
import i2.o;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewTimeCycle */
public abstract class f extends o {

    /* compiled from: ViewTimeCycle */
    static class a extends f {
        a() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setAlpha(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class b extends f {

        /* renamed from: l  reason: collision with root package name */
        String f15919l;

        /* renamed from: m  reason: collision with root package name */
        SparseArray<ConstraintAttribute> f15920m;
        SparseArray<float[]> n = new SparseArray<>();

        /* renamed from: o  reason: collision with root package name */
        float[] f15921o;

        /* renamed from: p  reason: collision with root package name */
        float[] f15922p;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f15919l = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
            this.f15920m = sparseArray;
        }

        public void b(int i11, float f11, float f12, int i12, float f13) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void e(int i11) {
            int size = this.f15920m.size();
            int h11 = this.f15920m.valueAt(0).h();
            double[] dArr = new double[size];
            int i12 = h11 + 2;
            this.f15921o = new float[i12];
            this.f15922p = new float[h11];
            int[] iArr = new int[2];
            iArr[1] = i12;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = this.f15920m.keyAt(i13);
                float[] valueAt = this.n.valueAt(i13);
                dArr[i13] = ((double) keyAt) * 0.01d;
                this.f15920m.valueAt(i13).f(this.f15921o);
                int i14 = 0;
                while (true) {
                    float[] fArr = this.f15921o;
                    if (i14 >= fArr.length) {
                        break;
                    }
                    dArr2[i13][i14] = (double) fArr[i14];
                    i14++;
                }
                dArr2[i13][h11] = (double) valueAt[0];
                dArr2[i13][h11 + 1] = (double) valueAt[1];
            }
            this.f14998a = i2.b.a(i11, dArr, dArr2);
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            View view2 = view;
            long j11 = j;
            this.f14998a.e((double) f11, this.f15921o);
            float[] fArr = this.f15921o;
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            long j12 = j11 - this.f15006i;
            if (Float.isNaN(this.j)) {
                float a11 = dVar.a(view2, this.f15919l, 0);
                this.j = a11;
                if (Float.isNaN(a11)) {
                    this.j = 0.0f;
                }
            }
            float f14 = (float) ((((double) this.j) + ((((double) j12) * 1.0E-9d) * ((double) f12))) % 1.0d);
            this.j = f14;
            this.f15006i = j11;
            float a12 = a(f14);
            this.f15005h = false;
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.f15922p;
                if (i11 >= fArr2.length) {
                    break;
                }
                boolean z11 = this.f15005h;
                float[] fArr3 = this.f15921o;
                this.f15005h = z11 | (((double) fArr3[i11]) != 0.0d);
                fArr2[i11] = (fArr3[i11] * a12) + f13;
                i11++;
            }
            a.b(this.f15920m.valueAt(0), view2, this.f15922p);
            if (f12 != 0.0f) {
                this.f15005h = true;
            }
            return this.f15005h;
        }

        public void j(int i11, ConstraintAttribute constraintAttribute, float f11, int i12, float f12) {
            this.f15920m.append(i11, constraintAttribute);
            this.n.append(i11, new float[]{f11, f12});
            this.f14999b = Math.max(this.f14999b, i12);
        }
    }

    /* compiled from: ViewTimeCycle */
    static class c extends f {
        c() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setElevation(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    public static class d extends f {
        public boolean i(View view, float f11, long j, i2.d dVar) {
            return this.f15005h;
        }

        public boolean j(View view, i2.d dVar, float f11, long j, double d11, double d12) {
            view.setRotation(f(f11, j, view, dVar) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    static class e extends f {

        /* renamed from: l  reason: collision with root package name */
        boolean f15923l = false;

        e() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            View view2 = view;
            if (view2 instanceof MotionLayout) {
                ((MotionLayout) view2).setProgress(f(f11, j, view, dVar));
            } else if (this.f15923l) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f15923l = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, new Object[]{Float.valueOf(f(f11, j, view, dVar))});
                    } catch (IllegalAccessException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    } catch (InvocationTargetException e12) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e12);
                    }
                }
            }
            return this.f15005h;
        }
    }

    /* renamed from: o2.f$f  reason: collision with other inner class name */
    /* compiled from: ViewTimeCycle */
    static class C0158f extends f {
        C0158f() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setRotation(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    static class g extends f {
        g() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setRotationX(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    static class h extends f {
        h() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setRotationY(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    static class i extends f {
        i() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setScaleX(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    static class j extends f {
        j() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setScaleY(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    static class k extends f {
        k() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setTranslationX(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    static class l extends f {
        l() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setTranslationY(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    /* compiled from: ViewTimeCycle */
    static class m extends f {
        m() {
        }

        public boolean i(View view, float f11, long j, i2.d dVar) {
            view.setTranslationZ(f(f11, j, view, dVar));
            return this.f15005h;
        }
    }

    public static f g(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    public static f h(String str, long j11) {
        f fVar;
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
        }
        switch (c11) {
            case 0:
                fVar = new g();
                break;
            case 1:
                fVar = new h();
                break;
            case 2:
                fVar = new k();
                break;
            case 3:
                fVar = new l();
                break;
            case 4:
                fVar = new m();
                break;
            case 5:
                fVar = new e();
                break;
            case 6:
                fVar = new i();
                break;
            case 7:
                fVar = new j();
                break;
            case 8:
                fVar = new C0158f();
                break;
            case 9:
                fVar = new c();
                break;
            case 10:
                fVar = new d();
                break;
            case 11:
                fVar = new a();
                break;
            default:
                return null;
        }
        fVar.c(j11);
        return fVar;
    }

    public float f(float f11, long j11, View view, i2.d dVar) {
        long j12 = j11;
        View view2 = view;
        i2.d dVar2 = dVar;
        this.f14998a.e((double) f11, this.f15004g);
        float[] fArr = this.f15004g;
        float f12 = fArr[1];
        int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i11 == 0) {
            this.f15005h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float a11 = dVar2.a(view2, this.f15003f, 0);
            this.j = a11;
            if (Float.isNaN(a11)) {
                this.j = 0.0f;
            }
        }
        float f13 = (float) ((((double) this.j) + ((((double) (j12 - this.f15006i)) * 1.0E-9d) * ((double) f12))) % 1.0d);
        this.j = f13;
        dVar2.b(view2, this.f15003f, 0, f13);
        this.f15006i = j12;
        float f14 = this.f15004g[0];
        float a12 = (a(this.j) * f14) + this.f15004g[2];
        this.f15005h = (f14 == 0.0f && i11 == 0) ? false : true;
        return a12;
    }

    public abstract boolean i(View view, float f11, long j11, i2.d dVar);
}
