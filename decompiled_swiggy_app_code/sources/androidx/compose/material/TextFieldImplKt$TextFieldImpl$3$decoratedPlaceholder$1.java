package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import c0.c0;
import d2.e;
import e0.f;
import e0.g;
import e0.t0;
import i1.t;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.d;
import r0.a;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$TextFieldImpl$3$decoratedPlaceholder$1 extends Lambda implements q<d, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f5587a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c0 f5588b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f5589c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5590d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5591e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5592f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$TextFieldImpl$3$decoratedPlaceholder$1(float f11, c0 c0Var, boolean z11, int i11, int i12, p<? super g, ? super Integer, k> pVar) {
        super(3);
        this.f5587a = f11;
        this.f5588b = c0Var;
        this.f5589c = z11;
        this.f5590d = i11;
        this.f5591e = i12;
        this.f5592f = pVar;
    }

    public final void a(d dVar, g gVar, int i11) {
        kotlin.jvm.internal.p.j(dVar, "modifier");
        if ((i11 & 14) == 0) {
            i11 |= gVar.k(dVar) ? 4 : 2;
        }
        if (((i11 & 91) ^ 18) != 0 || !gVar.b()) {
            d a11 = a.a(dVar, this.f5587a);
            c0 c0Var = this.f5588b;
            boolean z11 = this.f5589c;
            int i12 = this.f5590d;
            int i13 = this.f5591e;
            p<g, Integer, k> pVar = this.f5592f;
            gVar.E(-1990474327);
            t h11 = BoxKt.h(p0.a.f16019a.o(), false, gVar, 0);
            gVar.E(1376089394);
            e eVar = (e) gVar.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a12 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(a11);
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
            Updater.c(a13, h11, companion.d());
            Updater.c(a13, eVar, companion.b());
            Updater.c(a13, layoutDirection, companion.c());
            Updater.c(a13, n1Var, companion.f());
            gVar.o();
            b11.invoke(t0.a(t0.b(gVar)), gVar, 0);
            gVar.E(2058660585);
            gVar.E(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3698a;
            gVar.E(-416783238);
            TextFieldImplKt.a(c0Var.f(z11, gVar, ((i12 >> 3) & 14) | ((i13 >> 24) & 112)).getValue().v(), c0.q.f12737a.c(gVar, 6).k(), (Float) null, pVar, gVar, (i12 >> 18) & 7168, 4);
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

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((d) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
