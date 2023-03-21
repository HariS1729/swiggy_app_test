package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import bp0.k;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import wp0.d1;
import wp0.k1;
import wp0.n;

/* compiled from: Recomposer.kt */
final class Recomposer$effectJob$1$1 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Recomposer f6057a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.f6057a = recomposer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        n nVar;
        n nVar2;
        CancellationException a11 = d1.a("Recomposer effect job completed", th2);
        Object E = this.f6057a.f6044e;
        Recomposer recomposer = this.f6057a;
        synchronized (E) {
            k1 B = recomposer.f6045f;
            nVar = null;
            if (B != null) {
                recomposer.f6053r.setValue(Recomposer.State.ShuttingDown);
                if (!recomposer.q) {
                    B.g(a11);
                } else if (recomposer.f6051o != null) {
                    nVar2 = recomposer.f6051o;
                    recomposer.f6051o = null;
                    B.C(new Recomposer$effectJob$1$1$1$1(recomposer, th2));
                    nVar = nVar2;
                }
                nVar2 = null;
                recomposer.f6051o = null;
                B.C(new Recomposer$effectJob$1$1$1$1(recomposer, th2));
                nVar = nVar2;
            } else {
                recomposer.f6046g = a11;
                recomposer.f6053r.setValue(Recomposer.State.ShutDown);
                k kVar = k.f22762a;
            }
        }
        if (nVar != null) {
            Result.a aVar = Result.f25582b;
            nVar.resumeWith(Result.b(k.f22762a));
        }
    }
}
