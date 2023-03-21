package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import i1.o;
import i1.r;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: LayoutId.kt */
public final class LayoutIdKt {
    public static final Object a(r rVar) {
        p.j(rVar, "<this>");
        Object p11 = rVar.p();
        o oVar = p11 instanceof o ? (o) p11 : null;
        if (oVar != null) {
            return oVar.a();
        }
        return null;
    }

    public static final d b(d dVar, Object obj) {
        p.j(dVar, "<this>");
        p.j(obj, "layoutId");
        return dVar.N(new a(obj, InspectableValueKt.c() ? new LayoutIdKt$layoutId$$inlined$debugInspectorInfo$1(obj) : InspectableValueKt.a()));
    }
}
