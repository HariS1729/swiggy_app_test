package androidx.compose.runtime;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import wp0.n;

/* compiled from: Latch.kt */
final class Latch$await$2$2 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Latch f6012a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n<k> f6013b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Latch$await$2$2(Latch latch, n<? super k> nVar) {
        super(1);
        this.f6012a = latch;
        this.f6013b = nVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        Object b11 = this.f6012a.f6008a;
        Latch latch = this.f6012a;
        n<k> nVar = this.f6013b;
        synchronized (b11) {
            latch.f6009b.remove(nVar);
            k kVar = k.f22762a;
        }
    }
}
