package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import bp0.k;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: Recomposer.kt */
final class Recomposer$effectJob$1$1$1$1 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Recomposer f6058a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Throwable f6059b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$effectJob$1$1$1$1(Recomposer recomposer, Throwable th2) {
        super(1);
        this.f6058a = recomposer;
        this.f6059b = th2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        Object E = this.f6058a.f6044e;
        Recomposer recomposer = this.f6058a;
        Throwable th3 = this.f6059b;
        synchronized (E) {
            if (th3 == null) {
                th3 = null;
            } else if (th2 != null) {
                if (!(!(th2 instanceof CancellationException))) {
                    th2 = null;
                }
                if (th2 != null) {
                    b.a(th3, th2);
                }
            }
            recomposer.f6046g = th3;
            recomposer.f6053r.setValue(Recomposer.State.ShutDown);
            k kVar = k.f22762a;
        }
    }
}
