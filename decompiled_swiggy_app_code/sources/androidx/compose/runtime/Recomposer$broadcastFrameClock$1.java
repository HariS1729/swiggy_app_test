package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import bp0.k;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import wp0.d1;
import wp0.n;

/* compiled from: Recomposer.kt */
final class Recomposer$broadcastFrameClock$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Recomposer f6056a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.f6056a = recomposer;
    }

    public final void invoke() {
        n r11;
        Object E = this.f6056a.f6044e;
        Recomposer recomposer = this.f6056a;
        synchronized (E) {
            r11 = recomposer.U();
            if (((Recomposer.State) recomposer.f6053r.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                throw d1.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.f6046g);
            }
        }
        if (r11 != null) {
            Result.a aVar = Result.f25582b;
            r11.resumeWith(Result.b(k.f22762a));
        }
    }
}
