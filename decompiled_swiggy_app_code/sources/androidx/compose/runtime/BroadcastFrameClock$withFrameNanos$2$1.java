package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import bp0.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: BroadcastFrameClock.kt */
final class BroadcastFrameClock$withFrameNanos$2$1 extends Lambda implements l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BroadcastFrameClock f5874a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<BroadcastFrameClock.a<R>> f5875b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, Ref$ObjectRef<BroadcastFrameClock.a<R>> ref$ObjectRef) {
        super(1);
        this.f5874a = broadcastFrameClock;
        this.f5875b = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return k.f22762a;
    }

    public final void invoke(Throwable th2) {
        BroadcastFrameClock.a aVar;
        Object f11 = this.f5874a.f5868b;
        BroadcastFrameClock broadcastFrameClock = this.f5874a;
        Ref$ObjectRef<BroadcastFrameClock.a<R>> ref$ObjectRef = this.f5875b;
        synchronized (f11) {
            List d11 = broadcastFrameClock.f5870d;
            T t = ref$ObjectRef.f25666a;
            if (t == null) {
                p.B("awaiter");
                aVar = null;
            } else {
                aVar = (BroadcastFrameClock.a) t;
            }
            d11.remove(aVar);
            k kVar = k.f22762a;
        }
    }
}
