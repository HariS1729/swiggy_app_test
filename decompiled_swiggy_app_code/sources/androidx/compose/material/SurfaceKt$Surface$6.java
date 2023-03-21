package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import e0.f;
import e0.g;
import e0.t0;
import i1.t;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;
import s.b;
import u0.j1;

/* compiled from: Surface.kt */
final class SurfaceKt$Surface$6 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f5441a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f5442b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j1 f5443c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f5444d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f5445e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d f5446f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5447g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f5448h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurfaceKt$Surface$6(d dVar, float f11, j1 j1Var, b bVar, long j, d dVar2, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5441a = dVar;
        this.f5442b = f11;
        this.f5443c = j1Var;
        this.f5444d = bVar;
        this.f5445e = j;
        this.f5446f = dVar2;
        this.f5447g = pVar;
        this.f5448h = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            d b11 = ShadowKt.b(this.f5441a, this.f5442b, this.f5443c, false);
            b bVar = this.f5444d;
            d N = r0.d.a(BackgroundKt.c(b11.N(bVar != null ? BorderKt.f(d.f16037h0, bVar, this.f5443c) : d.f16037h0), this.f5445e, this.f5443c), this.f5443c).N(this.f5446f);
            p<g, Integer, k> pVar = this.f5447g;
            int i12 = this.f5448h;
            gVar.E(-1990474327);
            t h11 = BoxKt.h(a.f16019a.o(), true, gVar, 48);
            gVar.E(1376089394);
            e eVar = (e) gVar.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b12 = LayoutKt.b(N);
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
            b12.invoke(t0.a(t0.b(gVar)), gVar, 0);
            gVar.E(2058660585);
            gVar.E(-1253629305);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3698a;
            gVar.E(1505976207);
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
}
