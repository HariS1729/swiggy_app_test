package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import defpackage.a2;
import e0.d1;
import e0.f;
import e0.g;
import e0.n0;
import e0.t0;
import i1.t;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;
import p1.c0;
import u0.d0;

/* compiled from: Button.kt */
final class ButtonKt$Button$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<d0> f4881a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a2.p f4882b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q<a2.t, g, Integer, k> f4883c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4884d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ButtonKt$Button$2(d1<d0> d1Var, a2.p pVar, q<? super a2.t, ? super g, ? super Integer, k> qVar, int i11) {
        super(2);
        this.f4881a = d1Var;
        this.f4882b = pVar;
        this.f4883c = qVar;
        this.f4884d = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            n0[] n0VarArr = {ContentAlphaKt.a().c(Float.valueOf(d0.o(ButtonKt.b(this.f4881a))))};
            final a2.p pVar = this.f4882b;
            final q<a2.t, g, Integer, k> qVar = this.f4883c;
            final int i12 = this.f4884d;
            CompositionLocalKt.a(n0VarArr, b.b(gVar, -819891427, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                        c0 c11 = c0.q.f12737a.c(gVar, 6).c();
                        final a2.p pVar = pVar;
                        final q<a2.t, g, Integer, k> qVar = qVar;
                        final int i12 = i12;
                        TextKt.a(c11, b.b(gVar, -819891337, true, new p<g, Integer, k>() {
                            public final void a(g gVar, int i11) {
                                if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                                    d.a aVar = d.f16037h0;
                                    a aVar2 = a.f5770a;
                                    d h11 = PaddingKt.h(SizeKt.g(aVar, aVar2.e(), aVar2.d()), pVar);
                                    Arrangement.e b11 = Arrangement.f3654a.b();
                                    a.c i12 = a.f16019a.i();
                                    q<a2.t, g, Integer, k> qVar = qVar;
                                    int i13 = ((i12 >> 18) & 7168) | 432;
                                    gVar.E(-1989997165);
                                    int i14 = i13 >> 3;
                                    t a11 = RowKt.a(b11, i12, gVar, (i14 & 112) | (i14 & 14));
                                    gVar.E(1376089394);
                                    e eVar = (e) gVar.z(CompositionLocalsKt.e());
                                    LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
                                    n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
                                    ComposeUiNode.Companion companion = ComposeUiNode.J;
                                    lp0.a<ComposeUiNode> a12 = companion.a();
                                    q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(h11);
                                    int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
                                    if (!(gVar.u() instanceof e0.e)) {
                                        f.c();
                                    }
                                    gVar.f();
                                    if (gVar.s()) {
                                        gVar.K(a12);
                                    } else {
                                        gVar.c();
                                    }
                                    gVar.J();
                                    g a13 = Updater.a(gVar);
                                    Updater.c(a13, a11, companion.d());
                                    Updater.c(a13, eVar, companion.b());
                                    Updater.c(a13, layoutDirection, companion.c());
                                    Updater.c(a13, n1Var, companion.f());
                                    gVar.o();
                                    b12.invoke(t0.a(t0.b(gVar)), gVar, Integer.valueOf((i15 >> 3) & 112));
                                    gVar.E(2058660585);
                                    gVar.E(-326682362);
                                    if (((((i15 >> 9) & 14) & 11) ^ 2) != 0 || !gVar.b()) {
                                        qVar.invoke(RowScopeInstance.f3806a, gVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
                                    } else {
                                        gVar.h();
                                    }
                                    gVar.P();
                                    gVar.P();
                                    gVar.d();
                                    gVar.P();
                                    gVar.P();
                                    return;
                                }
                                gVar.h();
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((g) obj, ((Number) obj2).intValue());
                                return k.f22762a;
                            }
                        }), gVar, 48);
                        return;
                    }
                    gVar.h();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            }), gVar, 56);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
