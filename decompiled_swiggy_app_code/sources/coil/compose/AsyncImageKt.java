package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import com.truecaller.android.sdk.TruecallerSdkScope;
import d2.b;
import d2.e;
import e0.g;
import e0.s0;
import i1.c;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;
import p0.d;
import u0.e0;
import w0.f;
import y6.c;
import y6.h;
import y6.i;

/* compiled from: AsyncImage.kt */
public final class AsyncImageKt {
    public static final void a(Object obj, String str, ImageLoader imageLoader, d dVar, l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, l<? super AsyncImagePainter.b, k> lVar2, a aVar, c cVar, float f11, e0 e0Var, int i11, g gVar, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i14;
        g t = gVar.t(-1423043153);
        d.a aVar2 = (i17 & 8) != 0 ? d.f16037h0 : dVar;
        l<AsyncImagePainter.b, AsyncImagePainter.b> a11 = (i17 & 16) != 0 ? AsyncImagePainter.v.a() : lVar;
        l<? super AsyncImagePainter.b, k> lVar3 = (i17 & 32) != 0 ? null : lVar2;
        a e11 = (i17 & 64) != 0 ? a.f16019a.e() : aVar;
        c e12 = (i17 & 128) != 0 ? c.f14864a.e() : cVar;
        float f12 = (i17 & 256) != 0 ? 1.0f : f11;
        e0 e0Var2 = (i17 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? null : e0Var;
        if ((i17 & 1024) != 0) {
            i16 = i13 & -15;
            i15 = f.f17432j0.b();
        } else {
            i15 = i11;
            i16 = i13;
        }
        x6.g f13 = f(UtilsKt.e(obj, t, 8), e12, t, 8 | ((i12 >> 18) & 112));
        int i18 = i12 >> 6;
        int i19 = i12 >> 9;
        int i21 = 57344 & i19;
        AsyncImagePainter e13 = n6.a.e(f13, imageLoader, a11, lVar3, e12, i15, t, ((i16 << 15) & 458752) | (i18 & 7168) | (i18 & 896) | 72 | i21, 0);
        h K = f13.K();
        b(K instanceof ConstraintsSizeResolver ? aVar2.N((d) K) : aVar2, e13, str, e11, e12, f12, e0Var2, t, (i19 & 7168) | ((i12 << 3) & 896) | i21 | (i19 & 458752) | (3670016 & i19));
        s0 v = t.v();
        if (v != null) {
            AsyncImageKt$AsyncImage$2 asyncImageKt$AsyncImage$2 = r0;
            AsyncImageKt$AsyncImage$2 asyncImageKt$AsyncImage$22 = new AsyncImageKt$AsyncImage$2(obj, str, imageLoader, aVar2, a11, lVar3, e11, e12, f12, e0Var2, i15, i12, i13, i14);
            v.a(asyncImageKt$AsyncImage$2);
        }
    }

    public static final void b(d dVar, Painter painter, String str, a aVar, c cVar, float f11, e0 e0Var, g gVar, int i11) {
        g t = gVar.t(-341425049);
        d dVar2 = dVar;
        String str2 = str;
        d N = r0.d.b(d(dVar, str)).N(new ContentPainterModifier(painter, aVar, cVar, f11, e0Var));
        AsyncImageKt$Content$1 asyncImageKt$Content$1 = AsyncImageKt$Content$1.f13417a;
        t.E(1376091099);
        e eVar = (e) t.z(CompositionLocalsKt.e());
        LayoutDirection layoutDirection = (LayoutDirection) t.z(CompositionLocalsKt.j());
        n1 n1Var = (n1) t.z(CompositionLocalsKt.n());
        d e11 = ComposedModifierKt.e(t, N);
        ComposeUiNode.Companion companion = ComposeUiNode.J;
        lp0.a<ComposeUiNode> a11 = companion.a();
        t.E(1546164872);
        if (!(t.u() instanceof e0.e)) {
            e0.f.c();
        }
        t.f();
        if (t.s()) {
            t.K(new AsyncImageKt$Content$$inlined$Layout$1(a11));
        } else {
            t.c();
        }
        t.J();
        g a12 = Updater.a(t);
        Updater.c(a12, asyncImageKt$Content$1, companion.d());
        Updater.c(a12, eVar, companion.b());
        Updater.c(a12, layoutDirection, companion.c());
        Updater.c(a12, n1Var, companion.f());
        Updater.c(a12, e11, companion.e());
        t.o();
        t.d();
        t.P();
        t.P();
        s0 v = t.v();
        if (v != null) {
            v.a(new AsyncImageKt$Content$2(dVar, painter, str, aVar, cVar, f11, e0Var, i11));
        }
    }

    private static final d d(d dVar, String str) {
        return str != null ? SemanticsModifierKt.c(dVar, false, new AsyncImageKt$contentDescription$1(str), 1, (Object) null) : dVar;
    }

    /* access modifiers changed from: private */
    public static final y6.g e(long j) {
        if (b.r(j)) {
            return null;
        }
        return new y6.g(b.j(j) ? y6.a.a(b.n(j)) : c.b.f18025a, b.i(j) ? y6.a.a(b.m(j)) : c.b.f18025a);
    }

    public static final x6.g f(x6.g gVar, i1.c cVar, g gVar2, int i11) {
        h hVar;
        gVar2.E(-1553384610);
        if (gVar.q().m() == null) {
            if (p.e(cVar, i1.c.f14864a.g())) {
                hVar = i.a(y6.g.f18031d);
            } else {
                gVar2.E(-3687241);
                Object F = gVar2.F();
                if (F == g.f14172a.a()) {
                    F = new ConstraintsSizeResolver();
                    gVar2.y(F);
                }
                gVar2.P();
                hVar = (h) F;
            }
            gVar = x6.g.R(gVar, (Context) null, 1, (Object) null).p(hVar).a();
        }
        gVar2.P();
        return gVar;
    }
}
