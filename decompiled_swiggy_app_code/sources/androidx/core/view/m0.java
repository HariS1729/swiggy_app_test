package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.R;
import androidx.core.view.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: WindowInsetsAnimationCompat */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private e f9528a;

    /* compiled from: WindowInsetsAnimationCompat */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        WindowInsets f9531a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9532b;

        public b(int i11) {
            this.f9532b = i11;
        }

        public final int b() {
            return this.f9532b;
        }

        public void c(m0 m0Var) {
        }

        public void d(m0 m0Var) {
        }

        public abstract n0 e(n0 n0Var, List<m0> list);

        public a f(m0 m0Var, a aVar) {
            return aVar;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat */
    private static class c extends e {

        /* compiled from: WindowInsetsAnimationCompat */
        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            final b f9533a;

            /* renamed from: b  reason: collision with root package name */
            private n0 f9534b;

            /* renamed from: androidx.core.view.m0$c$a$a  reason: collision with other inner class name */
            /* compiled from: WindowInsetsAnimationCompat */
            class C0052a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m0 f9535a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ n0 f9536b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ n0 f9537c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f9538d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ View f9539e;

                C0052a(m0 m0Var, n0 n0Var, n0 n0Var2, int i11, View view) {
                    this.f9535a = m0Var;
                    this.f9536b = n0Var;
                    this.f9537c = n0Var2;
                    this.f9538d = i11;
                    this.f9539e = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f9535a.e(valueAnimator.getAnimatedFraction());
                    c.j(this.f9539e, c.n(this.f9536b, this.f9537c, this.f9535a.b(), this.f9538d), Collections.singletonList(this.f9535a));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ m0 f9541a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ View f9542b;

                b(m0 m0Var, View view) {
                    this.f9541a = m0Var;
                    this.f9542b = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.f9541a.e(1.0f);
                    c.h(this.f9542b, this.f9541a);
                }
            }

            /* renamed from: androidx.core.view.m0$c$a$c  reason: collision with other inner class name */
            /* compiled from: WindowInsetsAnimationCompat */
            class C0053c implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ View f9544a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ m0 f9545b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f9546c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ValueAnimator f9547d;

                C0053c(View view, m0 m0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f9544a = view;
                    this.f9545b = m0Var;
                    this.f9546c = aVar;
                    this.f9547d = valueAnimator;
                }

                public void run() {
                    c.k(this.f9544a, this.f9545b, this.f9546c);
                    this.f9547d.start();
                }
            }

            a(View view, b bVar) {
                this.f9533a = bVar;
                n0 M = a0.M(view);
                this.f9534b = M != null ? new n0.b(M).a() : null;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f9534b = n0.D(windowInsets2, view2);
                    return c.l(view, windowInsets);
                }
                n0 D = n0.D(windowInsets2, view2);
                if (this.f9534b == null) {
                    this.f9534b = a0.M(view);
                }
                if (this.f9534b == null) {
                    this.f9534b = D;
                    return c.l(view, windowInsets);
                }
                b m11 = c.m(view);
                if (m11 != null && Objects.equals(m11.f9531a, windowInsets2)) {
                    return c.l(view, windowInsets);
                }
                int e11 = c.e(D, this.f9534b);
                if (e11 == 0) {
                    return c.l(view, windowInsets);
                }
                n0 n0Var = this.f9534b;
                m0 m0Var = new m0(e11, new DecelerateInterpolator(), 160);
                m0Var.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(m0Var.a());
                a f11 = c.f(D, n0Var, e11);
                c.i(view2, m0Var, windowInsets2, false);
                duration.addUpdateListener(new C0052a(m0Var, D, n0Var, e11, view));
                duration.addListener(new b(m0Var, view2));
                w.a(view2, new C0053c(view, m0Var, f11, duration));
                this.f9534b = D;
                return c.l(view, windowInsets);
            }
        }

        c(int i11, Interpolator interpolator, long j) {
            super(i11, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        static int e(n0 n0Var, n0 n0Var2) {
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if (!n0Var.f(i12).equals(n0Var2.f(i12))) {
                    i11 |= i12;
                }
            }
            return i11;
        }

        static a f(n0 n0Var, n0 n0Var2, int i11) {
            androidx.core.graphics.b f11 = n0Var.f(i11);
            androidx.core.graphics.b f12 = n0Var2.f(i11);
            return new a(androidx.core.graphics.b.b(Math.min(f11.f9235a, f12.f9235a), Math.min(f11.f9236b, f12.f9236b), Math.min(f11.f9237c, f12.f9237c), Math.min(f11.f9238d, f12.f9238d)), androidx.core.graphics.b.b(Math.max(f11.f9235a, f12.f9235a), Math.max(f11.f9236b, f12.f9236b), Math.max(f11.f9237c, f12.f9237c), Math.max(f11.f9238d, f12.f9238d)));
        }

        private static View.OnApplyWindowInsetsListener g(View view, b bVar) {
            return new a(view, bVar);
        }

        static void h(View view, m0 m0Var) {
            b m11 = m(view);
            if (m11 != null) {
                m11.c(m0Var);
                if (m11.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    h(viewGroup.getChildAt(i11), m0Var);
                }
            }
        }

        static void i(View view, m0 m0Var, WindowInsets windowInsets, boolean z11) {
            b m11 = m(view);
            if (m11 != null) {
                m11.f9531a = windowInsets;
                if (!z11) {
                    m11.d(m0Var);
                    z11 = m11.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    i(viewGroup.getChildAt(i11), m0Var, windowInsets, z11);
                }
            }
        }

        static void j(View view, n0 n0Var, List<m0> list) {
            b m11 = m(view);
            if (m11 != null) {
                n0Var = m11.e(n0Var, list);
                if (m11.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    j(viewGroup.getChildAt(i11), n0Var, list);
                }
            }
        }

        static void k(View view, m0 m0Var, a aVar) {
            b m11 = m(view);
            if (m11 != null) {
                m11.f(m0Var, aVar);
                if (m11.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    k(viewGroup.getChildAt(i11), m0Var, aVar);
                }
            }
        }

        static WindowInsets l(View view, WindowInsets windowInsets) {
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        static b m(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f9533a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static n0 n(n0 n0Var, n0 n0Var2, float f11, int i11) {
            n0.b bVar = new n0.b(n0Var);
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) == 0) {
                    bVar.b(i12, n0Var.f(i12));
                } else {
                    androidx.core.graphics.b f12 = n0Var.f(i12);
                    androidx.core.graphics.b f13 = n0Var2.f(i12);
                    float f14 = 1.0f - f11;
                    bVar.b(i12, n0.t(f12, (int) (((double) (((float) (f12.f9235a - f13.f9235a)) * f14)) + 0.5d), (int) (((double) (((float) (f12.f9236b - f13.f9236b)) * f14)) + 0.5d), (int) (((double) (((float) (f12.f9237c - f13.f9237c)) * f14)) + 0.5d), (int) (((double) (((float) (f12.f9238d - f13.f9238d)) * f14)) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void o(View view, b bVar) {
            Object tag = view.getTag(R.id.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(R.id.tag_window_insets_animation_callback, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener g11 = g(view, bVar);
            view.setTag(R.id.tag_window_insets_animation_callback, g11);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(g11);
            }
        }
    }

    /* compiled from: WindowInsetsAnimationCompat */
    private static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f9554a;

        /* renamed from: b  reason: collision with root package name */
        private float f9555b;

        /* renamed from: c  reason: collision with root package name */
        private final Interpolator f9556c;

        /* renamed from: d  reason: collision with root package name */
        private final long f9557d;

        e(int i11, Interpolator interpolator, long j) {
            this.f9554a = i11;
            this.f9556c = interpolator;
            this.f9557d = j;
        }

        public long a() {
            return this.f9557d;
        }

        public float b() {
            Interpolator interpolator = this.f9556c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f9555b);
            }
            return this.f9555b;
        }

        public int c() {
            return this.f9554a;
        }

        public void d(float f11) {
            this.f9555b = f11;
        }
    }

    public m0(int i11, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9528a = new d(i11, interpolator, j);
        } else {
            this.f9528a = new c(i11, interpolator, j);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.o(view, bVar);
        }
    }

    static m0 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new m0(windowInsetsAnimation);
    }

    public long a() {
        return this.f9528a.a();
    }

    public float b() {
        return this.f9528a.b();
    }

    public int c() {
        return this.f9528a.c();
    }

    public void e(float f11) {
        this.f9528a.d(f11);
    }

    /* compiled from: WindowInsetsAnimationCompat */
    private static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        private final WindowInsetsAnimation f9549e;

        /* compiled from: WindowInsetsAnimationCompat */
        private static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a  reason: collision with root package name */
            private final b f9550a;

            /* renamed from: b  reason: collision with root package name */
            private List<m0> f9551b;

            /* renamed from: c  reason: collision with root package name */
            private ArrayList<m0> f9552c;

            /* renamed from: d  reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, m0> f9553d = new HashMap<>();

            a(b bVar) {
                super(bVar.b());
                this.f9550a = bVar;
            }

            private m0 a(WindowInsetsAnimation windowInsetsAnimation) {
                m0 m0Var = this.f9553d.get(windowInsetsAnimation);
                if (m0Var != null) {
                    return m0Var;
                }
                m0 f11 = m0.f(windowInsetsAnimation);
                this.f9553d.put(windowInsetsAnimation, f11);
                return f11;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f9550a.c(a(windowInsetsAnimation));
                this.f9553d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f9550a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<m0> arrayList = this.f9552c;
                if (arrayList == null) {
                    ArrayList<m0> arrayList2 = new ArrayList<>(list.size());
                    this.f9552c = arrayList2;
                    this.f9551b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    m0 a11 = a(windowInsetsAnimation);
                    a11.e(windowInsetsAnimation.getFraction());
                    this.f9552c.add(a11);
                }
                return this.f9550a.e(n0.C(windowInsets), this.f9551b).B();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f9550a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f9549e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.a().e(), aVar.b().e());
        }

        public static androidx.core.graphics.b f(WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.b.d(bounds.getUpperBound());
        }

        public static androidx.core.graphics.b g(WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.b.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        public long a() {
            return this.f9549e.getDurationMillis();
        }

        public float b() {
            return this.f9549e.getInterpolatedFraction();
        }

        public int c() {
            return this.f9549e.getTypeMask();
        }

        public void d(float f11) {
            this.f9549e.setFraction(f11);
        }

        d(int i11, Interpolator interpolator, long j) {
            this(new WindowInsetsAnimation(i11, interpolator, j));
        }
    }

    /* compiled from: WindowInsetsAnimationCompat */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.graphics.b f9529a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.graphics.b f9530b;

        public a(androidx.core.graphics.b bVar, androidx.core.graphics.b bVar2) {
            this.f9529a = bVar;
            this.f9530b = bVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public androidx.core.graphics.b a() {
            return this.f9529a;
        }

        public androidx.core.graphics.b b() {
            return this.f9530b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f9529a + " upper=" + this.f9530b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f9529a = d.g(bounds);
            this.f9530b = d.f(bounds);
        }
    }

    private m0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f9528a = new d(windowInsetsAnimation);
        }
    }
}
