package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import defpackage.a2;
import e0.g;
import i1.t;
import kotlin.jvm.internal.p;
import p0.a;

/* compiled from: Column.kt */
public final class ColumnKt {

    /* renamed from: a  reason: collision with root package name */
    private static final t f3712a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        float a11 = Arrangement.f3654a.h().a();
        a2.i a12 = a2.i.f931a.a(a.f16019a.k());
        f3712a = RowColumnImplKt.y(layoutOrientation, ColumnKt$DefaultColumnMeasurePolicy$1.f3713a, a11, SizeMode.Wrap, a12);
    }

    public static final t a(Arrangement.l lVar, a.b bVar, g gVar, int i11) {
        t tVar;
        p.j(lVar, "verticalArrangement");
        p.j(bVar, "horizontalAlignment");
        gVar.E(1089876336);
        gVar.E(511388516);
        boolean k = gVar.k(lVar) | gVar.k(bVar);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            if (!p.e(lVar, Arrangement.f3654a.h()) || !p.e(bVar, a.f16019a.k())) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
                float a11 = lVar.a();
                a2.i a12 = a2.i.f931a.a(bVar);
                tVar = RowColumnImplKt.y(layoutOrientation, new ColumnKt$columnMeasurePolicy$1$1(lVar), a11, SizeMode.Wrap, a12);
            } else {
                tVar = f3712a;
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
