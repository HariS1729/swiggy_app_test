package androidx.core.splashscreen;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.splashscreen.SplashScreenViewProvider;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: SplashScreenViewProvider.kt */
final class SplashScreenViewProvider$ViewImpl$_splashScreenView$2 extends Lambda implements a<ViewGroup> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SplashScreenViewProvider.ViewImpl f9369a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SplashScreenViewProvider$ViewImpl$_splashScreenView$2(SplashScreenViewProvider.ViewImpl viewImpl) {
        super(0);
        this.f9369a = viewImpl;
    }

    /* renamed from: a */
    public final ViewGroup invoke() {
        View inflate = FrameLayout.inflate(this.f9369a.b(), R.layout.splash_screen_view, (ViewGroup) null);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) inflate;
    }
}
