package coil.util;

import androidx.lifecycle.Lifecycle;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "awaitStarted")
/* renamed from: coil.util.-Lifecycles$awaitStarted$1  reason: invalid class name */
/* compiled from: Lifecycles.kt */
final class Lifecycles$awaitStarted$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f13686a;

    /* renamed from: b  reason: collision with root package name */
    Object f13687b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f13688c;

    /* renamed from: d  reason: collision with root package name */
    int f13689d;

    Lifecycles$awaitStarted$1(c<? super Lifecycles$awaitStarted$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.f13688c = obj;
        this.f13689d |= Integer.MIN_VALUE;
        return Lifecycles.a((Lifecycle) null, this);
    }
}
