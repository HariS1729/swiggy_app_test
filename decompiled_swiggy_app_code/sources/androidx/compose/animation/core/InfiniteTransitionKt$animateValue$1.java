package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import bp0.k;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: InfiniteTransition.kt */
final class InfiniteTransitionKt$animateValue$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ T f2673a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InfiniteTransition.a<T, V> f2674b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ T f2675c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v1.f0<T> f2676d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteTransitionKt$animateValue$1(T t, InfiniteTransition.a<T, V> aVar, T t11, v1.f0<T> f0Var) {
        super(0);
        this.f2673a = t;
        this.f2674b = aVar;
        this.f2675c = t11;
        this.f2676d = f0Var;
    }

    public final void invoke() {
        if (!p.e(this.f2673a, this.f2674b.d()) || !p.e(this.f2675c, this.f2674b.f())) {
            this.f2674b.p(this.f2673a, this.f2675c, this.f2676d);
        }
    }
}
