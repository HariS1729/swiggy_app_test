package r2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.window.SplashScreenView;
import androidx.core.splashscreen.R;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@SuppressLint({"CustomSplashScreen"})
/* compiled from: SplashScreen.kt */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16434b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0175b f16435a;

    /* compiled from: SplashScreen.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final b a(Activity activity) {
            p.j(activity, "<this>");
            b bVar = new b(activity, (i) null);
            bVar.b();
            return bVar;
        }
    }

    /* renamed from: r2.b$b  reason: collision with other inner class name */
    /* compiled from: SplashScreen.kt */
    private static class C0175b {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f16436a;

        /* renamed from: b  reason: collision with root package name */
        private int f16437b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f16438c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f16439d;

        /* renamed from: e  reason: collision with root package name */
        private Drawable f16440e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f16441f;

        /* renamed from: g  reason: collision with root package name */
        private d f16442g = d.f28268a;

        /* renamed from: h  reason: collision with root package name */
        private e f16443h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public SplashScreenViewProvider f16444i;

        /* renamed from: r2.b$b$a */
        /* compiled from: SplashScreen.kt */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0175b f16445a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f16446b;

            a(C0175b bVar, View view) {
                this.f16445a = bVar;
                this.f16446b = view;
            }

            public boolean onPreDraw() {
                if (this.f16445a.i().a()) {
                    return false;
                }
                this.f16446b.getViewTreeObserver().removeOnPreDrawListener(this);
                SplashScreenViewProvider c11 = this.f16445a.f16444i;
                if (c11 == null) {
                    return true;
                }
                this.f16445a.e(c11);
                return true;
            }
        }

        /* renamed from: r2.b$b$b  reason: collision with other inner class name */
        /* compiled from: SplashScreen.kt */
        public static final class C0176b implements View.OnLayoutChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0175b f16447a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SplashScreenViewProvider f16448b;

            C0176b(C0175b bVar, SplashScreenViewProvider splashScreenViewProvider) {
                this.f16447a = bVar;
                this.f16448b = splashScreenViewProvider;
            }

            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                p.j(view, "view");
                if (view.isAttachedToWindow()) {
                    view.removeOnLayoutChangeListener(this);
                    if (!this.f16447a.i().a()) {
                        this.f16447a.e(this.f16448b);
                    } else {
                        this.f16447a.f16444i = this.f16448b;
                    }
                }
            }
        }

        public C0175b(Activity activity) {
            p.j(activity, "activity");
            this.f16436a = activity;
        }

        /* access modifiers changed from: private */
        public static final void f(SplashScreenViewProvider splashScreenViewProvider, e eVar) {
            p.j(splashScreenViewProvider, "$splashScreenViewProvider");
            p.j(eVar, "$finalListener");
            splashScreenViewProvider.a().bringToFront();
            eVar.a(splashScreenViewProvider);
        }

        private final void g(View view, Drawable drawable) {
            float f11;
            ImageView imageView = (ImageView) view.findViewById(R.id.splashscreen_icon_view);
            if (this.f16441f) {
                Drawable drawable2 = imageView.getContext().getDrawable(R.drawable.icon_background);
                f11 = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawable2 != null) {
                    imageView.setBackground(new a(drawable2, f11));
                }
            } else {
                f11 = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new a(drawable, f11));
        }

        /* access modifiers changed from: private */
        public static final boolean o() {
            return false;
        }

        public final void e(SplashScreenViewProvider splashScreenViewProvider) {
            p.j(splashScreenViewProvider, "splashScreenViewProvider");
            e eVar = this.f16443h;
            if (eVar != null) {
                this.f16443h = null;
                splashScreenViewProvider.a().postOnAnimation(new c(splashScreenViewProvider, eVar));
            }
        }

        public final Activity h() {
            return this.f16436a;
        }

        public final d i() {
            return this.f16442g;
        }

        public void j() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.f16436a.getTheme();
            boolean z11 = true;
            if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
                this.f16438c = Integer.valueOf(typedValue.resourceId);
                this.f16439d = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.f16440e = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
                if (typedValue.resourceId != R.dimen.splashscreen_icon_size_with_background) {
                    z11 = false;
                }
                this.f16441f = z11;
            }
            p.i(theme, "currentTheme");
            m(theme, typedValue);
        }

        public void k(d dVar) {
            p.j(dVar, "keepOnScreenCondition");
            this.f16442g = dVar;
            View findViewById = this.f16436a.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new a(this, findViewById));
        }

        public void l(e eVar) {
            p.j(eVar, "exitAnimationListener");
            this.f16443h = eVar;
            SplashScreenViewProvider splashScreenViewProvider = new SplashScreenViewProvider(this.f16436a);
            Integer num = this.f16438c;
            Integer num2 = this.f16439d;
            View a11 = splashScreenViewProvider.a();
            if (num != null && num.intValue() != 0) {
                a11.setBackgroundResource(num.intValue());
            } else if (num2 != null) {
                a11.setBackgroundColor(num2.intValue());
            } else {
                a11.setBackground(this.f16436a.getWindow().getDecorView().getBackground());
            }
            Drawable drawable = this.f16440e;
            if (drawable != null) {
                g(a11, drawable);
            }
            a11.addOnLayoutChangeListener(new C0176b(this, splashScreenViewProvider));
        }

        /* access modifiers changed from: protected */
        public final void m(Resources.Theme theme, TypedValue typedValue) {
            p.j(theme, "currentTheme");
            p.j(typedValue, "typedValue");
            if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true)) {
                int i11 = typedValue.resourceId;
                this.f16437b = i11;
                if (i11 != 0) {
                    this.f16436a.setTheme(i11);
                }
            }
        }

        public final void n(d dVar) {
            p.j(dVar, "<set-?>");
            this.f16442g = dVar;
        }
    }

    /* compiled from: SplashScreen.kt */
    private static final class c extends C0175b {
        private ViewTreeObserver.OnPreDrawListener j;
        private boolean k = true;

        /* renamed from: l  reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f16449l;

        /* compiled from: SplashScreen.kt */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f16450a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Activity f16451b;

            a(c cVar, Activity activity) {
                this.f16450a = cVar;
                this.f16451b = activity;
            }

            public void onChildViewAdded(View view, View view2) {
                if (view2 instanceof SplashScreenView) {
                    c cVar = this.f16450a;
                    cVar.s(cVar.r((SplashScreenView) view2));
                    ((ViewGroup) this.f16451b.getWindow().getDecorView()).setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
                }
            }

            public void onChildViewRemoved(View view, View view2) {
            }
        }

        /* renamed from: r2.b$c$b  reason: collision with other inner class name */
        /* compiled from: SplashScreen.kt */
        public static final class C0177b implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f16452a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ View f16453b;

            C0177b(c cVar, View view) {
                this.f16452a = cVar;
                this.f16453b = view;
            }

            public boolean onPreDraw() {
                if (this.f16452a.i().a()) {
                    return false;
                }
                this.f16453b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity);
            p.j(activity, "activity");
            this.f16449l = new a(this, activity);
        }

        private final void q() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = h().getTheme();
            Window window = h().getWindow();
            boolean z11 = true;
            if (theme.resolveAttribute(16843857, typedValue, true)) {
                window.setStatusBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(16843858, typedValue, true)) {
                window.setNavigationBarColor(typedValue.data);
            }
            if (theme.resolveAttribute(16843856, typedValue, true)) {
                if (typedValue.data != 0) {
                    window.addFlags(Integer.MIN_VALUE);
                } else {
                    window.clearFlags(Integer.MIN_VALUE);
                }
            }
            if (theme.resolveAttribute(16844293, typedValue, true)) {
                window.setNavigationBarContrastEnforced(typedValue.data != 0);
            }
            if (theme.resolveAttribute(16844292, typedValue, true)) {
                if (typedValue.data == 0) {
                    z11 = false;
                }
                window.setStatusBarContrastEnforced(z11);
            }
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            p.i(theme, "theme");
            f.b(theme, viewGroup, typedValue);
            viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
            window.setDecorFitsSystemWindows(this.k);
        }

        /* access modifiers changed from: private */
        public static final void t(c cVar, e eVar, SplashScreenView splashScreenView) {
            p.j(cVar, "this$0");
            p.j(eVar, "$exitAnimationListener");
            p.j(splashScreenView, "splashScreenView");
            cVar.q();
            eVar.a(new SplashScreenViewProvider(splashScreenView, cVar.h()));
        }

        public void j() {
            Resources.Theme theme = h().getTheme();
            p.i(theme, "activity.theme");
            m(theme, new TypedValue());
            ((ViewGroup) h().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f16449l);
        }

        public void k(d dVar) {
            p.j(dVar, "keepOnScreenCondition");
            n(dVar);
            View findViewById = h().findViewById(16908290);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (this.j != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.j);
            }
            C0177b bVar = new C0177b(this, findViewById);
            this.j = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }

        public void l(e eVar) {
            p.j(eVar, "exitAnimationListener");
            h().getSplashScreen().setOnExitAnimationListener(new e(this, eVar));
        }

        public final boolean r(SplashScreenView splashScreenView) {
            p.j(splashScreenView, "child");
            WindowInsets build = new WindowInsets.Builder().build();
            p.i(build, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return build != splashScreenView.getRootView().computeSystemWindowInsets(build, rect) || !rect.isEmpty();
        }

        public final void s(boolean z11) {
            this.k = z11;
        }
    }

    /* compiled from: SplashScreen.kt */
    public interface d {
        boolean a();
    }

    /* compiled from: SplashScreen.kt */
    public interface e {
        void a(SplashScreenViewProvider splashScreenViewProvider);
    }

    private b(Activity activity) {
        C0175b bVar;
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new c(activity);
        } else {
            bVar = new C0175b(activity);
        }
        this.f16435a = bVar;
    }

    public /* synthetic */ b(Activity activity, i iVar) {
        this(activity);
    }

    /* access modifiers changed from: private */
    public final void b() {
        this.f16435a.j();
    }

    public static final b c(Activity activity) {
        return f16434b.a(activity);
    }

    public final void d(d dVar) {
        p.j(dVar, "condition");
        this.f16435a.k(dVar);
    }

    public final void e(e eVar) {
        p.j(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f16435a.l(eVar);
    }
}
