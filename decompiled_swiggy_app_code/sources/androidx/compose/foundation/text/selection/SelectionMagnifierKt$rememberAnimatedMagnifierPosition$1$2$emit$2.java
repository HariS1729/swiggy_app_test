package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import bp0.g;
import bp0.k;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import t0.f;
import wp0.j0;

@d(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = {102}, m = "invokeSuspend")
/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Animatable<f, v1.l> f4727b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f4728c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(Animatable<f, v1.l> animatable, long j, c<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2> cVar) {
        super(2, cVar);
        this.f4727b = animatable;
        this.f4728c = j;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(this.f4727b, this.f4728c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4726a;
        if (i11 == 0) {
            g.b(obj);
            Animatable<f, v1.l> animatable = this.f4727b;
            f d12 = f.d(this.f4728c);
            v1.l0 a11 = SelectionMagnifierKt.f4713d;
            this.f4726a = 1;
            if (Animatable.f(animatable, d12, a11, (Object) null, (l) null, this, 12, (Object) null) == d11) {
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
