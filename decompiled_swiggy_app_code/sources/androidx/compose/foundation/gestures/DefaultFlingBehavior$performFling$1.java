package androidx.compose.foundation.gestures;

import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", l = {496}, m = "performFling")
/* compiled from: Scrollable.kt */
final class DefaultFlingBehavior$performFling$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f3216a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f3217b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DefaultFlingBehavior f3218c;

    /* renamed from: d  reason: collision with root package name */
    int f3219d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultFlingBehavior$performFling$1(DefaultFlingBehavior defaultFlingBehavior, c<? super DefaultFlingBehavior$performFling$1> cVar) {
        super(cVar);
        this.f3218c = defaultFlingBehavior;
    }

    public final Object invokeSuspend(Object obj) {
        this.f3217b = obj;
        this.f3219d |= Integer.MIN_VALUE;
        return this.f3218c.a((y1.p) null, 0.0f, this);
    }
}
