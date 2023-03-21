package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", l = {70}, m = "invokeSuspend")
/* compiled from: ForEachGesture.kt */
final class ForEachGestureKt$awaitAllPointersUp$2 extends RestrictedSuspendLambda implements p<f1.d, c<? super k>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f3431b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f3432c;

    ForEachGestureKt$awaitAllPointersUp$2(c<? super ForEachGestureKt$awaitAllPointersUp$2> cVar) {
        super(2, cVar);
    }

    /* renamed from: a */
    public final Object invoke(f1.d dVar, c<? super k> cVar) {
        return ((ForEachGestureKt$awaitAllPointersUp$2) create(dVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ForEachGestureKt$awaitAllPointersUp$2 forEachGestureKt$awaitAllPointersUp$2 = new ForEachGestureKt$awaitAllPointersUp$2(cVar);
        forEachGestureKt$awaitAllPointersUp$2.f3432c = obj;
        return forEachGestureKt$awaitAllPointersUp$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3431b;
        if (i11 == 0) {
            g.b(obj);
            this.f3431b = 1;
            if (ForEachGestureKt.b((f1.d) this.f3432c, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
