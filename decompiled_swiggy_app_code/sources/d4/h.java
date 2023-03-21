package d4;

import bp0.g;
import com.google.common.util.concurrent.b;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import wp0.n;

/* compiled from: ListenableFuture.kt */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n<Object> f14130a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b<Object> f14131b;

    public h(n<Object> nVar, b<Object> bVar) {
        this.f14130a = nVar;
        this.f14131b = bVar;
    }

    public final void run() {
        try {
            n<Object> nVar = this.f14130a;
            Object obj = this.f14131b.get();
            Result.a aVar = Result.f25582b;
            nVar.resumeWith(Result.b(obj));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                cause = th2;
            }
            if (th2 instanceof CancellationException) {
                this.f14130a.r(cause);
                return;
            }
            n<Object> nVar2 = this.f14130a;
            Result.a aVar2 = Result.f25582b;
            nVar2.resumeWith(Result.b(g.a(cause)));
        }
    }
}
