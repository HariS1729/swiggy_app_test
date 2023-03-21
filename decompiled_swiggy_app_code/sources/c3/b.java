package c3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.a0;
import c3.a;
import c3.b;
import java.util.ArrayList;
import pc0.x;

/* compiled from: DynamicAnimation */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m  reason: collision with root package name */
    public static final r f12781m = new f("translationX");
    public static final r n = new g("translationY");

    /* renamed from: o  reason: collision with root package name */
    public static final r f12782o = new h("translationZ");

    /* renamed from: p  reason: collision with root package name */
    public static final r f12783p = new i("scaleX");
    public static final r q = new j("scaleY");

    /* renamed from: r  reason: collision with root package name */
    public static final r f12784r = new k("rotation");

    /* renamed from: s  reason: collision with root package name */
    public static final r f12785s = new l("rotationX");
    public static final r t = new m("rotationY");

    /* renamed from: u  reason: collision with root package name */
    public static final r f12786u = new n(x.f81957i);
    public static final r v = new a("y");

    /* renamed from: w  reason: collision with root package name */
    public static final r f12787w = new C0107b("z");

    /* renamed from: x  reason: collision with root package name */
    public static final r f12788x = new c("alpha");

    /* renamed from: y  reason: collision with root package name */
    public static final r f12789y = new d("scrollX");

    /* renamed from: z  reason: collision with root package name */
    public static final r f12790z = new e("scrollY");

    /* renamed from: a  reason: collision with root package name */
    float f12791a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    float f12792b = Float.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    boolean f12793c = false;

    /* renamed from: d  reason: collision with root package name */
    final Object f12794d;

    /* renamed from: e  reason: collision with root package name */
    final c f12795e;

    /* renamed from: f  reason: collision with root package name */
    boolean f12796f = false;

    /* renamed from: g  reason: collision with root package name */
    float f12797g = Float.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    float f12798h = (-Float.MAX_VALUE);

    /* renamed from: i  reason: collision with root package name */
    private long f12799i = 0;
    private float j;
    private final ArrayList<p> k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<q> f12800l = new ArrayList<>();

    /* compiled from: DynamicAnimation */
    static class a extends r {
        a(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getY();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setY(f11);
        }
    }

    /* renamed from: c3.b$b  reason: collision with other inner class name */
    /* compiled from: DynamicAnimation */
    static class C0107b extends r {
        C0107b(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return a0.T(view);
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            a0.V0(view, f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class c extends r {
        c(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getAlpha();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setAlpha(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class d extends r {
        d(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return (float) view.getScrollX();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setScrollX((int) f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class e extends r {
        e(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return (float) view.getScrollY();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setScrollY((int) f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class f extends r {
        f(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getTranslationX();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setTranslationX(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class g extends r {
        g(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getTranslationY();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setTranslationY(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class h extends r {
        h(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return a0.R(view);
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            a0.S0(view, f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class i extends r {
        i(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getScaleX();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setScaleX(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class j extends r {
        j(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getScaleY();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setScaleY(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class k extends r {
        k(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotation();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setRotation(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class l extends r {
        l(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotationX();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setRotationX(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class m extends r {
        m(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getRotationY();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setRotationY(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class n extends r {
        n(String str) {
            super(str, (f) null);
        }

        /* renamed from: c */
        public float a(View view) {
            return view.getX();
        }

        /* renamed from: d */
        public void b(View view, float f11) {
            view.setX(f11);
        }
    }

    /* compiled from: DynamicAnimation */
    static class o {

        /* renamed from: a  reason: collision with root package name */
        float f12801a;

        /* renamed from: b  reason: collision with root package name */
        float f12802b;

        o() {
        }
    }

    /* compiled from: DynamicAnimation */
    public interface p {
        void a(b bVar, boolean z11, float f11, float f12);
    }

    /* compiled from: DynamicAnimation */
    public interface q {
        void a(b bVar, float f11, float f12);
    }

    /* compiled from: DynamicAnimation */
    public static abstract class r extends c<View> {
        /* synthetic */ r(String str, f fVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    <K> b(K k11, c<K> cVar) {
        this.f12794d = k11;
        this.f12795e = cVar;
        if (cVar == f12784r || cVar == f12785s || cVar == t) {
            this.j = 0.1f;
        } else if (cVar == f12788x) {
            this.j = 0.00390625f;
        } else if (cVar == f12783p || cVar == q) {
            this.j = 0.00390625f;
        } else {
            this.j = 1.0f;
        }
    }

    private void b(boolean z11) {
        this.f12796f = false;
        a.d().g(this);
        this.f12799i = 0;
        this.f12793c = false;
        for (int i11 = 0; i11 < this.k.size(); i11++) {
            if (this.k.get(i11) != null) {
                this.k.get(i11).a(this, z11, this.f12792b, this.f12791a);
            }
        }
        f(this.k);
    }

    private float c() {
        return this.f12795e.a(this.f12794d);
    }

    private static <T> void f(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void i() {
        if (!this.f12796f) {
            this.f12796f = true;
            if (!this.f12793c) {
                this.f12792b = c();
            }
            float f11 = this.f12792b;
            if (f11 > this.f12797g || f11 < this.f12798h) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            a.d().a(this, 0);
        }
    }

    public boolean a(long j11) {
        long j12 = this.f12799i;
        if (j12 == 0) {
            this.f12799i = j11;
            g(this.f12792b);
            return false;
        }
        this.f12799i = j11;
        boolean j13 = j(j11 - j12);
        float min = Math.min(this.f12792b, this.f12797g);
        this.f12792b = min;
        float max = Math.max(min, this.f12798h);
        this.f12792b = max;
        g(max);
        if (j13) {
            b(false);
        }
        return j13;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.j * 0.75f;
    }

    public boolean e() {
        return this.f12796f;
    }

    /* access modifiers changed from: package-private */
    public void g(float f11) {
        this.f12795e.b(this.f12794d, f11);
        for (int i11 = 0; i11 < this.f12800l.size(); i11++) {
            if (this.f12800l.get(i11) != null) {
                this.f12800l.get(i11).a(this, this.f12792b, this.f12791a);
            }
        }
        f(this.f12800l);
    }

    public void h() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.f12796f) {
            i();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract boolean j(long j11);
}
