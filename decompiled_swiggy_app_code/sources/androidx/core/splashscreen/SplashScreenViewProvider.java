package androidx.core.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import bp0.f;
import kotlin.jvm.internal.p;

@SuppressLint({"ViewConstructor"})
/* compiled from: SplashScreenViewProvider.kt */
public final class SplashScreenViewProvider {

    /* renamed from: a  reason: collision with root package name */
    private final ViewImpl f9366a;

    /* compiled from: SplashScreenViewProvider.kt */
    private static class ViewImpl {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f9367a;

        /* renamed from: b  reason: collision with root package name */
        private final f f9368b = b.b(new SplashScreenViewProvider$ViewImpl$_splashScreenView$2(this));

        public ViewImpl(Activity activity) {
            p.j(activity, "activity");
            this.f9367a = activity;
        }

        private final ViewGroup d() {
            return (ViewGroup) this.f9368b.getValue();
        }

        public void a() {
            View rootView = ((ViewGroup) this.f9367a.findViewById(16908290)).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                viewGroup.addView(d());
            }
        }

        public final Activity b() {
            return this.f9367a;
        }

        public ViewGroup c() {
            return d();
        }
    }

    /* compiled from: SplashScreenViewProvider.kt */
    private static final class a extends ViewImpl {

        /* renamed from: c  reason: collision with root package name */
        public SplashScreenView f9370c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(activity);
            p.j(activity, "activity");
        }

        public void a() {
        }

        public final SplashScreenView e() {
            SplashScreenView splashScreenView = this.f9370c;
            if (splashScreenView != null) {
                return splashScreenView;
            }
            p.B("platformView");
            return null;
        }

        /* renamed from: f */
        public SplashScreenView c() {
            return e();
        }

        public final void g(SplashScreenView splashScreenView) {
            p.j(splashScreenView, "<set-?>");
            this.f9370c = splashScreenView;
        }
    }

    public SplashScreenViewProvider(Activity activity) {
        ViewImpl viewImpl;
        p.j(activity, "ctx");
        if (Build.VERSION.SDK_INT >= 31) {
            viewImpl = new a(activity);
        } else {
            viewImpl = new ViewImpl(activity);
        }
        viewImpl.a();
        this.f9366a = viewImpl;
    }

    public final View a() {
        return this.f9366a.c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SplashScreenViewProvider(SplashScreenView splashScreenView, Activity activity) {
        this(activity);
        p.j(splashScreenView, "platformView");
        p.j(activity, "ctx");
        ((a) this.f9366a).g(splashScreenView);
    }
}
