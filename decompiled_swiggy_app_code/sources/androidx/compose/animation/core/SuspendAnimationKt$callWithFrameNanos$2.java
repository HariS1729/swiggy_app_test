package androidx.compose.animation.core;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$callWithFrameNanos$2 extends Lambda implements l<Long, R> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<Long, R> f2731a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$callWithFrameNanos$2(l<? super Long, ? extends R> lVar) {
        super(1);
        this.f2731a = lVar;
    }

    public final R a(long j) {
        return this.f2731a.invoke(Long.valueOf(j / 1));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).longValue());
    }
}
