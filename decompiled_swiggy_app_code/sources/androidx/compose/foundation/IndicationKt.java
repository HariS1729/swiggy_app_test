package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import e0.m0;
import kotlin.jvm.internal.p;
import p0.d;
import s.h;
import u.i;

/* compiled from: Indication.kt */
public final class IndicationKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<h> f3056a = CompositionLocalKt.d(IndicationKt$LocalIndication$1.f3059a);

    public static final m0<h> a() {
        return f3056a;
    }

    public static final d b(d dVar, i iVar, h hVar) {
        p.j(dVar, "<this>");
        p.j(iVar, "interactionSource");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new IndicationKt$indication$$inlined$debugInspectorInfo$1(hVar, iVar) : InspectableValueKt.a(), new IndicationKt$indication$2(hVar, iVar));
    }
}
