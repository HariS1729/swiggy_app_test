package androidx.compose.animation.core;

import bp0.k;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;

/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$3 extends Lambda implements l<v1.f<T, V>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<T, T, k> f2709a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v1.q0<T, V> f2710b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendAnimationKt$animate$3(p<? super T, ? super T, k> pVar, v1.q0<T, V> q0Var) {
        super(1);
        this.f2709a = pVar;
        this.f2710b = q0Var;
    }

    public final void a(v1.f<T, V> fVar) {
        kotlin.jvm.internal.p.j(fVar, "$this$animate");
        this.f2709a.invoke(fVar.e(), this.f2710b.b().invoke(fVar.g()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((v1.f) obj);
        return k.f22762a;
    }
}
