package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import d2.h;
import e0.f;
import e0.g;
import e0.t0;
import i1.t;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.p;
import lp0.q;
import p0.a;
import p0.d;

/* compiled from: AndroidAlertDialog.android.kt */
final class AndroidAlertDialog_androidKt$AlertDialog$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4848a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f4849b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4850c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidAlertDialog_androidKt$AlertDialog$1(p<? super g, ? super Integer, k> pVar, int i11, p<? super g, ? super Integer, k> pVar2) {
        super(2);
        this.f4848a = pVar;
        this.f4849b = i11;
        this.f4850c = pVar2;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            float f11 = (float) 8;
            d j = PaddingKt.j(SizeKt.n(d.f16037h0, 0.0f, 1, (Object) null), h.n(f11), h.n((float) 2));
            p<g, Integer, k> pVar = this.f4848a;
            int i12 = this.f4849b;
            p<g, Integer, k> pVar2 = this.f4850c;
            gVar.E(-1990474327);
            t h11 = BoxKt.h(a.f16019a.o(), false, gVar, 0);
            gVar.E(1376089394);
            e eVar = (e) gVar.z(CompositionLocalsKt.e());
            LayoutDirection layoutDirection = (LayoutDirection) gVar.z(CompositionLocalsKt.j());
            n1 n1Var = (n1) gVar.z(CompositionLocalsKt.n());
            ComposeUiNode.Companion companion = ComposeUiNode.J;
            lp0.a<ComposeUiNode> a11 = companion.a();
            q<t0<ComposeUiNode>, g, Integer, k> b11 = LayoutKt.b(j);
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
            gVar.E(350577093);
            AlertDialogKt.c(h.n(f11), h.n((float) 12), b.b(gVar, -819893906, true, new AndroidAlertDialog_androidKt$AlertDialog$1$1$1(pVar, i12, pVar2)), gVar, 438);
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
