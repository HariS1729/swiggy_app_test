package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ViewCompositionStrategy.android.kt */
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Lifecycle f7189a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o f7190b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, o oVar) {
        super(0);
        this.f7189a = lifecycle;
        this.f7190b = oVar;
    }

    public final void invoke() {
        this.f7189a.c(this.f7190b);
    }
}
