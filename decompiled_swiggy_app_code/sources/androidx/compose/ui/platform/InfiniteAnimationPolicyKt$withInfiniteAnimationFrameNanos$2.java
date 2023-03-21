package androidx.compose.ui.platform;

import bp0.g;
import bp0.k;
import e0.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;

@d(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {65}, m = "invokeSuspend")
/* compiled from: InfiniteAnimationPolicy.kt */
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends SuspendLambda implements l<c<? super R>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f7151a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Long, R> f7152b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(l<? super Long, ? extends R> lVar, c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> cVar) {
        super(1, cVar);
        this.f7152b = lVar;
    }

    public final c<k> create(c<?> cVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.f7152b, cVar);
    }

    public final Object invoke(c<? super R> cVar) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f7151a;
        if (i11 == 0) {
            g.b(obj);
            l<Long, R> lVar = this.f7152b;
            this.f7151a = 1;
            obj = d0.b(lVar, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
