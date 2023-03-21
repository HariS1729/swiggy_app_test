package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import c0.q;
import d2.e;
import e0.f;
import e0.g;
import e0.n0;
import e0.t0;
import i1.t;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.p;
import p0.a;
import p0.d;
import p1.c0;
import u0.d0;

/* compiled from: FloatingActionButton.kt */
final class FloatingActionButtonKt$FloatingActionButton$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f5060a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5061b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5062c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FloatingActionButtonKt$FloatingActionButton$2(long j, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5060a = j;
        this.f5061b = pVar;
        this.f5062c = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            n0[] n0VarArr = {ContentAlphaKt.a().c(Float.valueOf(d0.o(this.f5060a)))};
            final p<g, Integer, k> pVar = this.f5061b;
            final int i12 = this.f5062c;
            CompositionLocalKt.a(n0VarArr, b.b(gVar, -819890951, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                        c0 c11 = q.f12737a.c(gVar, 6).c();
                        final p<g, Integer, k> pVar = pVar;
                        final int i12 = i12;
                        TextKt.a(c11, b.b(gVar, -819891143, true, new p<g, Integer, k>() {
                            public final void a(g gVar, int i11) {
                                if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                                    d g11 = SizeKt.g(d.f16037h0, FloatingActionButtonKt.f5044a, FloatingActionButtonKt.f5044a);
                                    a e11 = a.f16019a.e();
                                    p<g, Integer, k> pVar = pVar;
                                    int i12 = i12;
                                    gVar.E(-1990474327);
                                    t h11 = BoxKt.h(e11, false, gVar, 6);
                                    gVar.E(1376089394);
                                    e eVar = (e) gVar.z(CompositionLocalsKt.e());
                                    LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
                                    n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
                                    ComposeUiNode.Companion companion = ComposeUiNode.J;
                                    lp0.a<ComposeUiNode> a11 = companion.a();
                                    lp0.q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(g11);
                                    if (!(gVar.u() instanceof e0.e)) {
                                        f.c();
                                    }
                                    gVar.f();
                                    if (gVar.s()) {
                                        gVar.K(a11);
                                    } else {
                                        gVar.c();
                                    }
                                    gVar.J();
                                    g a12 = Updater.a(gVar);
                                    Updater.c(a12, h11, companion.d());
                                    Updater.c(a12, eVar, companion.b());
                                    Updater.c(a12, layoutDirection, companion.c());
                                    Updater.c(a12, n1Var, companion.f());
                                    gVar.o();
                                    b11.invoke(t0.a(t0.b(gVar)), gVar, 0);
                                    gVar.E(2058660585);
                                    gVar.E(-1253629305);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3698a;
                                    gVar.E(638020740);
                                    pVar.invoke(gVar, Integer.valueOf((i12 >> 21) & 14));
                                    gVar.P();
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
