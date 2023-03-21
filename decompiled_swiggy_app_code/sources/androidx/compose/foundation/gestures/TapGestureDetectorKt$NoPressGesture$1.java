package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.q;
import t0.f;

@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements q<y1.n, f, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3546a;

    TapGestureDetectorKt$NoPressGesture$1(c<? super TapGestureDetectorKt$NoPressGesture$1> cVar) {
        super(3, cVar);
    }

    public final Object a(y1.n nVar, long j, c<? super k> cVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(cVar).invokeSuspend(k.f22762a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((y1.n) obj, ((f) obj2).u(), (c) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f3546a == 0) {
            g.b(obj);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
