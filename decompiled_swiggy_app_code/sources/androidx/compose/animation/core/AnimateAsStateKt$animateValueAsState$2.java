package androidx.compose.animation.core;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import yp0.f;

/* compiled from: AnimateAsState.kt */
final class AnimateAsStateKt$animateValueAsState$2 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f<T> f2639a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ T f2640b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimateAsStateKt$animateValueAsState$2(f<T> fVar, T t) {
        super(0);
        this.f2639a = fVar;
        this.f2640b = t;
    }

    public final void invoke() {
        this.f2639a.e(this.f2640b);
    }
}
