package androidx.compose.animation.core;

import bp0.k;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import lp0.a;
import lp0.l;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$6 extends Lambda implements l<Long, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<v1.f<T, V>> f2718a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ T f2719b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v1.c<T, V> f2720c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ V f2721d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v1.i<T, V> f2722e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l<v1.f<T, V>, k> f2723f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$animate$6(Ref$ObjectRef<v1.f<T, V>> ref$ObjectRef, T t, v1.c<T, V> cVar, V v, v1.i<T, V> iVar, l<? super v1.f<T, V>, k> lVar) {
        super(1);
        this.f2718a = ref$ObjectRef;
        this.f2719b = t;
        this.f2720c = cVar;
        this.f2721d = v;
        this.f2722e = iVar;
        this.f2723f = lVar;
    }

    public final void a(long j) {
        Ref$ObjectRef<v1.f<T, V>> ref$ObjectRef = this.f2718a;
        T t = this.f2719b;
        v1.q0<T, V> d11 = this.f2720c.d();
        V v = this.f2721d;
        T f11 = this.f2720c.f();
        final v1.i<T, V> iVar = this.f2722e;
        v1.f fVar = new v1.f(t, d11, v, j, f11, j, true, new a<k>() {
            public final void invoke() {
                iVar.r(false);
            }
        });
        SuspendAnimationKt.j(fVar, j, this.f2720c, this.f2722e, this.f2723f);
        ref$ObjectRef.f25666a = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Number) obj).longValue());
        return k.f22762a;
    }
}
