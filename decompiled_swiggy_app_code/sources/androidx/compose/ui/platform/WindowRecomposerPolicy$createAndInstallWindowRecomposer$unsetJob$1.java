package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.a;
import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {233}, m = "invokeSuspend")
/* compiled from: WindowRecomposer.android.kt */
final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7212a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Recomposer f7213b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f7214c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer recomposer, View view, c<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1> cVar) {
        super(2, cVar);
        this.f7213b = recomposer;
        this.f7214c = view;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.f7213b, this.f7214c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f7212a;
        if (i11 == 0) {
            g.b(obj);
            Recomposer recomposer = this.f7213b;
            this.f7212a = 1;
            if (recomposer.b0(this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            try {
                g.b(obj);
            } catch (Throwable th2) {
                if (WindowRecomposer_androidKt.f(this.f7214c) == this.f7213b) {
                    WindowRecomposer_androidKt.i(this.f7214c, (a) null);
                }
                throw th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (WindowRecomposer_androidKt.f(this.f7214c) == this.f7213b) {
            WindowRecomposer_androidKt.i(this.f7214c, (a) null);
        }
        return k.f22762a;
    }
}
