package o2;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import in.swiggy.android.tejas.feature.order.model.network.DashOrderTypes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewOscillator */
public abstract class c extends i2.e {

    /* compiled from: ViewOscillator */
    static class a extends c {
        a() {
        }

        public void i(View view, float f11) {
            view.setAlpha(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    static class b extends c {

        /* renamed from: h  reason: collision with root package name */
        float[] f15907h = new float[1];

        /* renamed from: i  reason: collision with root package name */
        protected ConstraintAttribute f15908i;

        b() {
        }

        /* access modifiers changed from: protected */
        public void b(Object obj) {
            this.f15908i = (ConstraintAttribute) obj;
        }

        public void i(View view, float f11) {
            this.f15907h[0] = a(f11);
            a.b(this.f15908i, view, this.f15907h);
        }
    }

    /* renamed from: o2.c$c  reason: collision with other inner class name */
    /* compiled from: ViewOscillator */
    static class C0156c extends c {
        C0156c() {
        }

        public void i(View view, float f11) {
            view.setElevation(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    public static class d extends c {
        public void i(View view, float f11) {
        }

        public void j(View view, float f11, double d11, double d12) {
            view.setRotation(a(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }
    }

    /* compiled from: ViewOscillator */
    static class e extends c {

        /* renamed from: h  reason: collision with root package name */
        boolean f15909h = false;

        e() {
        }

        public void i(View view, float f11) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f11));
            } else if (!this.f15909h) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f15909h = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(a(f11))});
                    } catch (IllegalAccessException e11) {
                        Log.e("ViewOscillator", "unable to setProgress", e11);
                    } catch (InvocationTargetException e12) {
                        Log.e("ViewOscillator", "unable to setProgress", e12);
                    }
                }
            }
        }
    }

    /* compiled from: ViewOscillator */
    static class f extends c {
        f() {
        }

        public void i(View view, float f11) {
            view.setRotation(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    static class g extends c {
        g() {
        }

        public void i(View view, float f11) {
            view.setRotationX(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    static class h extends c {
        h() {
        }

        public void i(View view, float f11) {
            view.setRotationY(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    static class i extends c {
        i() {
        }

        public void i(View view, float f11) {
            view.setScaleX(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    static class j extends c {
        j() {
        }

        public void i(View view, float f11) {
            view.setScaleY(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    static class k extends c {
        k() {
        }

        public void i(View view, float f11) {
            view.setTranslationX(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    static class l extends c {
        l() {
        }

        public void i(View view, float f11) {
            view.setTranslationY(a(f11));
        }
    }

    /* compiled from: ViewOscillator */
    static class m extends c {
        m() {
        }

        public void i(View view, float f11) {
            view.setTranslationZ(a(f11));
        }
    }

    public static c h(String str) {
        if (str.startsWith(DashOrderTypes.CUSTOM)) {
            return new b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c11 = 13;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case 8:
                return new a();
            case 9:
                return new f();
            case 10:
                return new C0156c();
            case 11:
                return new d();
            case 12:
                return new a();
            case 13:
                return new a();
            default:
                return null;
        }
    }

    public abstract void i(View view, float f11);
}
