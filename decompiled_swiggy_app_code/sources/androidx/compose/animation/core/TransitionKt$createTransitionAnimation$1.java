package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Transition.kt */
final class TransitionKt$createTransitionAnimation$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<S> f2780a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Transition<S>.d<T, V> f2781b;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Transition f2782a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Transition.d f2783b;

        public a(Transition transition, Transition.d dVar) {
            this.f2782a = transition;
            this.f2783b = dVar;
        }

        public void dispose() {
            this.f2782a.w(this.f2783b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionKt$createTransitionAnimation$1(Transition<S> transition, Transition<S>.d<T, V> dVar) {
        super(1);
        this.f2780a = transition;
        this.f2781b = dVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        this.f2780a.d(this.f2781b);
        return new a(this.f2780a, this.f2781b);
    }
}
