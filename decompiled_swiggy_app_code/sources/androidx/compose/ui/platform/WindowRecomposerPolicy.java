package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import wp0.g1;
import wp0.k1;
import xp0.c;

/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposerPolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final WindowRecomposerPolicy f7208a = new WindowRecomposerPolicy();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<x1> f7209b = new AtomicReference<>(x1.f7391a.a());

    /* renamed from: c  reason: collision with root package name */
    public static final int f7210c = 8;

    /* compiled from: WindowRecomposer.android.kt */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1 f7211a;

        a(k1 k1Var) {
            this.f7211a = k1Var;
        }

        public void onViewAttachedToWindow(View view) {
            p.j(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            p.j(view, "v");
            view.removeOnAttachStateChangeListener(this);
            k1.a.a(this.f7211a, (CancellationException) null, 1, (Object) null);
        }
    }

    private WindowRecomposerPolicy() {
    }

    public final Recomposer a(View view) {
        p.j(view, "rootView");
        Recomposer a11 = f7209b.get().a(view);
        WindowRecomposer_androidKt.i(view, a11);
        g1 g1Var = g1.f29466a;
        Handler handler = view.getHandler();
        p.i(handler, "rootView.handler");
        view.addOnAttachStateChangeListener(new a(j.d(g1Var, c.b(handler, "windowRecomposer cleanup").Q0(), (CoroutineStart) null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(a11, view, (fp0.c<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1>) null), 2, (Object) null)));
        return a11;
    }
}
