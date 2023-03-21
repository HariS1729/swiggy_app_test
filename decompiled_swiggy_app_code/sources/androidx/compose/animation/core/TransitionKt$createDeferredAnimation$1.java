package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Transition.kt */
final class TransitionKt$createDeferredAnimation$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Transition<S> f2776a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Transition<S>.defpackage.a<T, V> f2777b;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Transition f2778a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Transition.a f2779b;

        public a(Transition transition, Transition.a aVar) {
            this.f2778a = transition;
            this.f2779b = aVar;
        }

        public void dispose() {
            this.f2778a.v(this.f2779b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionKt$createDeferredAnimation$1(Transition<S> transition, Transition<S>.defpackage.a<T, V> aVar) {
        super(1);
        this.f2776a = transition;
        this.f2777b = aVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        return new a(this.f2776a, this.f2777b);
    }
}
