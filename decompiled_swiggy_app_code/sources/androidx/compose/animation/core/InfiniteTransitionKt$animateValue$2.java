package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InfiniteTransition.kt */
final class InfiniteTransitionKt$animateValue$2 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InfiniteTransition f2677a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InfiniteTransition.a<T, V> f2678b;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfiniteTransition f2679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InfiniteTransition.a f2680b;

        public a(InfiniteTransition infiniteTransition, InfiniteTransition.a aVar) {
            this.f2679a = infiniteTransition;
            this.f2680b = aVar;
        }

        public void dispose() {
            this.f2679a.g(this.f2680b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteTransitionKt$animateValue$2(InfiniteTransition infiniteTransition, InfiniteTransition.a<T, V> aVar) {
        super(1);
        this.f2677a = infiniteTransition;
        this.f2678b = aVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        this.f2677a.c(this.f2678b);
        return new a(this.f2677a, this.f2678b);
    }
}
