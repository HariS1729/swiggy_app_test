package androidx.compose.animation.core;

import bp0.g;
import bp0.k;
import defpackage.v1;
import fp0.c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.p;
import lp0.l;

@d(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {291}, m = "invokeSuspend")
/* compiled from: Animatable.kt */
final class Animatable$runAnimation$2 extends SuspendLambda implements l<c<? super v1.e<T, V>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f2616a;

    /* renamed from: b  reason: collision with root package name */
    Object f2617b;

    /* renamed from: c  reason: collision with root package name */
    int f2618c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Animatable<T, V> f2619d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ T f2620e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v1.c<T, V> f2621f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f2622g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l<Animatable<T, V>, k> f2623h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Animatable$runAnimation$2(Animatable<T, V> animatable, T t, v1.c<T, V> cVar, long j, l<? super Animatable<T, V>, k> lVar, c<? super Animatable$runAnimation$2> cVar2) {
        super(1, cVar2);
        this.f2619d = animatable;
        this.f2620e = t;
        this.f2621f = cVar;
        this.f2622g = j;
        this.f2623h = lVar;
    }

    public final c<k> create(c<?> cVar) {
        return new Animatable$runAnimation$2(this.f2619d, this.f2620e, this.f2621f, this.f2622g, this.f2623h, cVar);
    }

    public final Object invoke(c<? super v1.e<T, V>> cVar) {
        return ((Animatable$runAnimation$2) create(cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        v1.i iVar;
        Ref$BooleanRef ref$BooleanRef;
        Object d11 = b.d();
        int i11 = this.f2618c;
        if (i11 == 0) {
            g.b(obj);
            this.f2619d.l().t((v1.n) this.f2619d.n().a().invoke(this.f2620e));
            this.f2619d.u(this.f2621f.f());
            this.f2619d.t(true);
            final v1.i d12 = v1.j.d(this.f2619d.l(), (Object) null, (v1.n) null, 0, Long.MIN_VALUE, false, 23, (Object) null);
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            v1.c<T, V> cVar = this.f2621f;
            long j = this.f2622g;
            final Animatable<T, V> animatable = this.f2619d;
            final l<Animatable<T, V>, k> lVar = this.f2623h;
            AnonymousClass1 r62 = new l<v1.f<T, V>, k>() {
                public final void a(v1.f<T, V> fVar) {
                    p.j(fVar, "$this$animate");
                    SuspendAnimationKt.k(fVar, animatable.l());
                    Object a11 = animatable.h(fVar.e());
                    if (!p.e(a11, fVar.e())) {
                        animatable.l().s(a11);
                        d12.s(a11);
                        l<Animatable<T, V>, k> lVar = lVar;
                        if (lVar != null) {
                            lVar.invoke(animatable);
                        }
                        fVar.a();
                        ref$BooleanRef2.f25661a = true;
                        return;
                    }
                    l<Animatable<T, V>, k> lVar2 = lVar;
                    if (lVar2 != null) {
                        lVar2.invoke(animatable);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((v1.f) obj);
                    return k.f22762a;
                }
            };
            this.f2616a = d12;
            this.f2617b = ref$BooleanRef2;
            this.f2618c = 1;
            if (SuspendAnimationKt.c(d12, cVar, j, r62, this) == d11) {
                return d11;
            }
            iVar = d12;
            ref$BooleanRef = ref$BooleanRef2;
        } else if (i11 == 1) {
            ref$BooleanRef = (Ref$BooleanRef) this.f2617b;
            iVar = (v1.i) this.f2616a;
            try {
                g.b(obj);
            } catch (CancellationException e11) {
                this.f2619d.j();
                throw e11;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AnimationEndReason animationEndReason = ref$BooleanRef.f25661a ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
        this.f2619d.j();
        return new v1.e(iVar, animationEndReason);
    }
}
