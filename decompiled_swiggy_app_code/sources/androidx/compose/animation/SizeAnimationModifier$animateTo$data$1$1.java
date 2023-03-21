package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifier;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import bp0.g;
import bp0.k;
import defpackage.v1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = {121}, m = "invokeSuspend")
/* compiled from: AnimationModifier.kt */
final class SizeAnimationModifier$animateTo$data$1$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f2586a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SizeAnimationModifier.a f2587b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f2588c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SizeAnimationModifier f2589d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeAnimationModifier$animateTo$data$1$1(SizeAnimationModifier.a aVar, long j, SizeAnimationModifier sizeAnimationModifier, c<? super SizeAnimationModifier$animateTo$data$1$1> cVar) {
        super(2, cVar);
        this.f2587b = aVar;
        this.f2588c = j;
        this.f2589d = sizeAnimationModifier;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SizeAnimationModifier$animateTo$data$1$1(this.f2587b, this.f2588c, this.f2589d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SizeAnimationModifier$animateTo$data$1$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        p<d2.p, d2.p, k> d11;
        Object d12 = b.d();
        int i11 = this.f2586a;
        if (i11 == 0) {
            g.b(obj);
            Animatable<d2.p, v1.l> a11 = this.f2587b.a();
            d2.p b11 = d2.p.b(this.f2588c);
            v1.g<d2.p> c11 = this.f2589d.c();
            this.f2586a = 1;
            obj = Animatable.f(a11, b11, c11, (Object) null, (l) null, this, 12, (Object) null);
            if (obj == d12) {
                return d12;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v1.e eVar = (v1.e) obj;
        if (eVar.a() == AnimationEndReason.Finished && (d11 = this.f2589d.d()) != null) {
            d11.invoke(d2.p.b(this.f2587b.b()), eVar.b().getValue());
        }
        return k.f22762a;
    }
}
