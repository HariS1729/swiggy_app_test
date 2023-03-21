package androidx.work;

import bp0.k;
import com.google.common.util.concurrent.b;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: ListenableFuture.kt */
public final class ListenableFutureKt$await$2$2 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b<Object> f12283a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(b<Object> bVar) {
        super(1);
        this.f12283a = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        this.f12283a.cancel(false);
    }
}
