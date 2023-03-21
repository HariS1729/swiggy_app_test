package androidx.compose.runtime;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import wp0.j0;
import wp0.q0;

@d(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", l = {51}, m = "invokeSuspend")
/* compiled from: ActualAndroid.android.kt */
final class SdkStubsFallbackFrameClock$withFrameNanos$2 extends SuspendLambda implements p<j0, c<? super R>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f6093a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<Long, R> f6094b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SdkStubsFallbackFrameClock$withFrameNanos$2(l<? super Long, ? extends R> lVar, c<? super SdkStubsFallbackFrameClock$withFrameNanos$2> cVar) {
        super(2, cVar);
        this.f6094b = lVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.f6094b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super R> cVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f6093a;
        if (i11 == 0) {
            g.b(obj);
            this.f6093a = 1;
            if (q0.a(16, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return this.f6094b.invoke(a.e(System.nanoTime()));
    }
}
