package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import d2.h;
import e0.g;
import e0.s0;
import i1.c;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;
import p0.d;
import u0.d0;
import u0.e0;

/* compiled from: Icon.kt */
public final class IconKt {

    /* renamed from: a  reason: collision with root package name */
    private static final d f5076a = SizeKt.t(d.f16037h0, h.n((float) 24));

    public static final void a(Painter painter, String str, d dVar, long j, g gVar, int i11, int i12) {
        d dVar2;
        Painter painter2 = painter;
        String str2 = str;
        p.j(painter2, "painter");
        g t = gVar.t(1547384967);
        d.a aVar = (i12 & 4) != 0 ? d.f16037h0 : dVar;
        long l11 = (i12 & 8) != 0 ? d0.l(((d0) t.z(ContentColorKt.a())).v(), ((Number) t.z(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j;
        e0 c11 = d0.n(l11, d0.f16756b.f()) ? null : e0.a.c(e0.f16769b, l11, 0, 2, (Object) null);
        t.E(1547385320);
        if (str2 != null) {
            d.a aVar2 = d.f16037h0;
            t.E(-3686930);
            boolean k = t.k(str2);
            Object F = t.F();
            if (k || F == g.f14172a.a()) {
                F = new IconKt$Icon$semantics$1$1(str2);
                t.y(F);
            }
            t.P();
            dVar2 = SemanticsModifierKt.c(aVar2, false, (l) F, 1, (Object) null);
        } else {
            dVar2 = d.f16037h0;
        }
        t.P();
        BoxKt.a(PainterModifierKt.b(b(GraphicsLayerModifierKt.f(aVar), painter2), painter, false, (a) null, c.f14864a.e(), 0.0f, c11, 22, (Object) null).N(dVar2), t, 0);
        s0 v = t.v();
        if (v != null) {
            v.a(new IconKt$Icon$3(painter, str, aVar, l11, i11, i12));
        }
    }

    private static final d b(d dVar, Painter painter) {
        d dVar2;
        if (t0.l.f(painter.k(), t0.l.f16682b.a()) || c(painter.k())) {
            dVar2 = f5076a;
        } else {
            dVar2 = d.f16037h0;
        }
        return dVar.N(dVar2);
    }

    private static final boolean c(long j) {
        return Float.isInfinite(t0.l.i(j)) && Float.isInfinite(t0.l.g(j));
    }
}
