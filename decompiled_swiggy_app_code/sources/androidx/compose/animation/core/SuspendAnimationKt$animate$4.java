package androidx.compose.animation.core;

import defpackage.v1;
import defpackage.v1.n;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import lp0.l;

@d(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {229, 261}, m = "animate")
/* compiled from: SuspendAnimation.kt */
final class SuspendAnimationKt$animate$4<T, V extends v1.n> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f2711a;

    /* renamed from: b  reason: collision with root package name */
    Object f2712b;

    /* renamed from: c  reason: collision with root package name */
    Object f2713c;

    /* renamed from: d  reason: collision with root package name */
    Object f2714d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f2715e;

    /* renamed from: f  reason: collision with root package name */
    int f2716f;

    SuspendAnimationKt$animate$4(c<? super SuspendAnimationKt$animate$4> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f2715e = obj;
        this.f2716f |= Integer.MIN_VALUE;
        return SuspendAnimationKt.c((v1.i) null, (v1.c) null, 0, (l) null, this);
    }
}
