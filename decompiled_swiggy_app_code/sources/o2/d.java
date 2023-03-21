package o2;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewSpline */
public abstract class d extends i2.j {

    /* compiled from: ViewSpline */
    static class a extends d {
        a() {
        }

        public void g(View view, float f11) {
            view.setAlpha(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    public static class b extends d {

        /* renamed from: f  reason: collision with root package name */
        String f15910f;

        /* renamed from: g  reason: collision with root package name */
        SparseArray<ConstraintAttribute> f15911g;

        /* renamed from: h  reason: collision with root package name */
        float[] f15912h;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f15910f = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)[1];
            this.f15911g = sparseArray;
        }

        public void b(int i11, float f11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void d(int i11) {
            int size = this.f15911g.size();
            int h11 = this.f15911g.valueAt(0).h();
            double[] dArr = new double[size];
            this.f15912h = new float[h11];
            int[] iArr = new int[2];
            iArr[1] = h11;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i12 = 0; i12 < size; i12++) {
                dArr[i12] = ((double) this.f15911g.keyAt(i12)) * 0.01d;
                this.f15911g.valueAt(i12).f(this.f15912h);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f15912h;
                    if (i13 >= fArr.length) {
                        break;
                    }
                    dArr2[i12][i13] = (double) fArr[i13];
                    i13++;
                }
            }
            this.f14971a = i2.b.a(i11, dArr, dArr2);
        }

        public void g(View view, float f11) {
            this.f14971a.e((double) f11, this.f15912h);
            a.b(this.f15911g.valueAt(0), view, this.f15912h);
        }

        public void h(int i11, ConstraintAttribute constraintAttribute) {
            this.f15911g.append(i11, constraintAttribute);
        }
    }

    /* compiled from: ViewSpline */
    static class c extends d {
        c() {
        }

        public void g(View view, float f11) {
            view.setElevation(a(f11));
        }
    }

    /* renamed from: o2.d$d  reason: collision with other inner class name */
    /* compiled from: ViewSpline */
    public static class C0157d extends d {
        public void g(View view, float f11) {
        }

        public void h(View view, float f11, double d11, double d12) {
            view.setRotation(a(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }
    }

    /* compiled from: ViewSpline */
    static class e extends d {
        e() {
        }

        public void g(View view, float f11) {
            view.setPivotX(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class f extends d {
        f() {
        }

        public void g(View view, float f11) {
            view.setPivotY(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class g extends d {

        /* renamed from: f  reason: collision with root package name */
        boolean f15913f = false;

        g() {
        }

        public void g(View view, float f11) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f11));
            } else if (!this.f15913f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f15913f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f11))});
                    } catch (IllegalAccessException e11) {
                        Log.e("ViewSpline", "unable to setProgress", e11);
                    } catch (InvocationTargetException e12) {
                        Log.e("ViewSpline", "unable to setProgress", e12);
                    }
                }
            }
        }
    }

    /* compiled from: ViewSpline */
    static class h extends d {
        h() {
        }

        public void g(View view, float f11) {
            view.setRotation(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class i extends d {
        i() {
        }

        public void g(View view, float f11) {
            view.setRotationX(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class j extends d {
        j() {
        }

        public void g(View view, float f11) {
            view.setRotationY(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class k extends d {
        k() {
        }

        public void g(View view, float f11) {
            view.setScaleX(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class l extends d {
        l() {
        }

        public void g(View view, float f11) {
            view.setScaleY(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class m extends d {
        m() {
        }

        public void g(View view, float f11) {
            view.setTranslationX(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class n extends d {
        n() {
        }

        public void g(View view, float f11) {
            view.setTranslationY(a(f11));
        }
    }

    /* compiled from: ViewSpline */
    static class o extends d {
        o() {
        }

        public void g(View view, float f11) {
            view.setTranslationZ(a(f11));
        }
    }

    public static d e(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    public static d f(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c11 = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c11 = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c11 = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c11 = 15;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case 8:
                return new a();
            case 9:
                return new e();
            case 10:
                return new f();
            case 11:
                return new h();
            case 12:
                return new c();
            case 13:
                return new C0157d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void g(View view, float f11);
}
