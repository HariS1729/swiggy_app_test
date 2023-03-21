package androidx.compose.foundation;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Scroll.kt */
final class ScrollingLayoutModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScrollingLayoutModifier f3168a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f3169b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f3170c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLayoutModifier$measure$1(ScrollingLayoutModifier scrollingLayoutModifier, int i11, e0 e0Var) {
        super(1);
        this.f3168a = scrollingLayoutModifier;
        this.f3169b = i11;
        this.f3170c = e0Var;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        this.f3168a.a().k(this.f3169b);
        int m11 = l.m(this.f3168a.a().j(), 0, this.f3169b);
        int i11 = this.f3168a.c() ? m11 - this.f3169b : -m11;
        e0.a.r(aVar, this.f3170c, this.f3168a.d() ? 0 : i11, this.f3168a.d() ? i11 : 0, 0.0f, (l) null, 12, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
