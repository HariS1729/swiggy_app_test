package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.y1;
import e0.g;
import e0.m;
import e0.u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import s.e;
import s.l;
import wp0.j0;

/* compiled from: Scroll.kt */
final class ScrollKt$scroll$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f3134a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ScrollState f3135b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f3136c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ y1.k f3137d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f3138e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollKt$scroll$2(boolean z11, ScrollState scrollState, boolean z12, y1.k kVar, boolean z13) {
        super(3);
        this.f3134a = z11;
        this.f3135b = scrollState;
        this.f3136c = z12;
        this.f3137d = kVar;
        this.f3138e = z13;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(1478351300);
        l b11 = b.f3627a.b(gVar, 6);
        gVar.E(773894976);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            m mVar = new m(u.i(EmptyCoroutineContext.f25631a, gVar));
            gVar.y(mVar);
            F = mVar;
        }
        gVar.P();
        j0 a11 = ((m) F).a();
        gVar.P();
        d.a aVar = d.f16037h0;
        boolean z11 = false;
        d c11 = SemanticsModifierKt.c(aVar, false, new ScrollKt$scroll$2$semantics$1(this.f3138e, this.f3134a, this.f3136c, this.f3135b, a11), 1, (Object) null);
        boolean z12 = this.f3134a;
        Orientation orientation = z12 ? Orientation.Vertical : Orientation.Horizontal;
        boolean z13 = !this.f3138e;
        if (gVar.z(CompositionLocalsKt.j()) == LayoutDirection.Rtl) {
            z11 = true;
        }
        d N = s.m.a(e.a(c11, orientation), b11).N(ScrollableKt.h(aVar, this.f3135b, orientation, b11, this.f3136c, (!z11 || z12) ? z13 : !z13, this.f3137d, this.f3135b.h())).N(new ScrollingLayoutModifier(this.f3135b, this.f3138e, this.f3134a, b11));
        gVar.P();
        return N;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
