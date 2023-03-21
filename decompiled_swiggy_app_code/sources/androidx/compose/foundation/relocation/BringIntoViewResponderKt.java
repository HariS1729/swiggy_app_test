package androidx.compose.foundation.relocation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import i1.m;
import kotlin.jvm.internal.p;
import p0.d;
import t0.h;
import y.e;

/* compiled from: BringIntoViewResponder.kt */
public final class BringIntoViewResponderKt {
    public static final d c(d dVar, e eVar) {
        p.j(dVar, "<this>");
        p.j(eVar, "responder");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new BringIntoViewResponderKt$bringIntoViewResponder$$inlined$debugInspectorInfo$1(eVar) : InspectableValueKt.a(), new BringIntoViewResponderKt$bringIntoViewResponder$2(eVar));
    }

    /* access modifiers changed from: private */
    public static final boolean d(h hVar, h hVar2) {
        return hVar.i() <= hVar2.i() && hVar.l() <= hVar2.l() && hVar.j() >= hVar2.j() && hVar.e() >= hVar2.e();
    }

    /* access modifiers changed from: private */
    public static final h e(m mVar, m mVar2, h hVar) {
        return hVar.r(mVar.B(mVar2, false).m());
    }
}
