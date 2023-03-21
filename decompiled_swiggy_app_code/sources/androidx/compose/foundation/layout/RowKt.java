package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import defpackage.a2;
import e0.g;
import i1.t;
import kotlin.jvm.internal.p;
import p0.a;

/* compiled from: Row.kt */
public final class RowKt {

    /* renamed from: a  reason: collision with root package name */
    private static final t f3803a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        float a11 = Arrangement.f3654a.g().a();
        a2.i b11 = a2.i.f931a.b(a.f16019a.l());
        f3803a = RowColumnImplKt.y(layoutOrientation, RowKt$DefaultRowMeasurePolicy$1.f3804a, a11, SizeMode.Wrap, b11);
    }

    public static final t a(Arrangement.d dVar, a.c cVar, g gVar, int i11) {
        t tVar;
        p.j(dVar, "horizontalArrangement");
        p.j(cVar, "verticalAlignment");
        gVar.E(-837807694);
        gVar.E(511388516);
        boolean k = gVar.k(dVar) | gVar.k(cVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            if (!p.e(dVar, Arrangement.f3654a.g()) || !p.e(cVar, a.f16019a.l())) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                float a11 = dVar.a();
                a2.i b11 = a2.i.f931a.b(cVar);
                tVar = RowColumnImplKt.y(layoutOrientation, new RowKt$rowMeasurePolicy$1$1(dVar), a11, SizeMode.Wrap, b11);
            } else {
                tVar = f3803a;
            }
            F = tVar;
            gVar.y(F);
        }
        gVar.P();
        t tVar2 = (t) F;
        gVar.P();
        return tVar2;
    }
}
