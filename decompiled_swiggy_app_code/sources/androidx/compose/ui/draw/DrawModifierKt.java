package androidx.compose.ui.draw;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import r0.c;
import r0.g;
import w0.f;

/* compiled from: DrawModifier.kt */
public final class DrawModifierKt {
    public static final d a(d dVar, l<? super f, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onDraw");
        return dVar.N(new a(lVar, InspectableValueKt.c() ? new DrawModifierKt$drawBehind$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a()));
    }

    public static final d b(d dVar, l<? super c, g> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onBuildDrawCache");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new DrawModifierKt$drawWithCache$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a(), new DrawModifierKt$drawWithCache$2(lVar));
    }

    public static final d c(d dVar, l<? super w0.c, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onDraw");
        return dVar.N(new c(lVar, InspectableValueKt.c() ? new DrawModifierKt$drawWithContent$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a()));
    }
}
