package androidx.compose.animation.core;

import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Transition.kt */
final class TransitionKt$updateTransition$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<T> f2784a;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Transition f2785a;

        public a(Transition transition) {
            this.f2785a = transition;
        }

        public void dispose() {
            this.f2785a.t();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionKt$updateTransition$1(Transition<T> transition) {
        super(1);
        this.f2784a = transition;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f2784a);
    }
}
