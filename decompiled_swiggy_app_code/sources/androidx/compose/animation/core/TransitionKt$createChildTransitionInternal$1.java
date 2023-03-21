package androidx.compose.animation.core;

import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Transition.kt */
final class TransitionKt$createChildTransitionInternal$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<S> f2772a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Transition<T> f2773b;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Transition f2774a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Transition f2775b;

        public a(Transition transition, Transition transition2) {
            this.f2774a = transition;
            this.f2775b = transition2;
        }

        public void dispose() {
            this.f2774a.x(this.f2775b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionKt$createChildTransitionInternal$1(Transition<S> transition, Transition<T> transition2) {
        super(1);
        this.f2772a = transition;
        this.f2773b = transition2;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        this.f2772a.e(this.f2773b);
        return new a(this.f2772a, this.f2773b);
    }
}
