package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifierKt;
import bp0.k;
import e0.g;
import e0.s0;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import w0.f;

/* compiled from: Canvas.kt */
public final class CanvasKt {
    public static final void a(d dVar, l<? super f, k> lVar, g gVar, int i11) {
        int i12;
        p.j(dVar, "modifier");
        p.j(lVar, "onDraw");
        g t = gVar.t(-932836462);
        if ((i11 & 14) == 0) {
            i12 = (t.k(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(lVar) ? 32 : 16;
        }
        if ((i12 & 91) != 18 || !t.b()) {
            androidx.compose.foundation.layout.k.a(DrawModifierKt.a(dVar, lVar), t, 0);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new CanvasKt$Canvas$1(dVar, lVar, i11));
        }
    }
}
