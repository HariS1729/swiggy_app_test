package androidx.room;

import android.os.CancellationSignal;
import bp0.k;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import t3.b;
import wp0.k1;

/* compiled from: CoroutinesRoom.kt */
final class CoroutinesRoom$Companion$execute$4$1 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CancellationSignal f11487a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1 f11488b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, k1 k1Var) {
        super(1);
        this.f11487a = cancellationSignal;
        this.f11488b = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        b.a(this.f11487a);
        k1.a.a(this.f11488b, (CancellationException) null, 1, (Object) null);
    }
}
