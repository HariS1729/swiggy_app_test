package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.m0;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import u.k;
import x.j;

/* compiled from: Focusable.kt */
public final class FocusableKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0 f2957a = new m0(InspectableValueKt.c() ? new FocusableKt$special$$inlined$debugInspectorInfo$1() : InspectableValueKt.a());

    public static final d b(d dVar) {
        p.j(dVar, "<this>");
        return FocusModifierKt.a(FocusPropertiesKt.b(dVar.N(f2957a), FocusableKt$focusGroup$1.f2963a));
    }

    public static final d c(d dVar, boolean z11, k kVar) {
        p.j(dVar, "<this>");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new FocusableKt$focusable$$inlined$debugInspectorInfo$1(z11, kVar) : InspectableValueKt.a(), new FocusableKt$focusable$2(kVar, z11));
    }

    public static /* synthetic */ d d(d dVar, boolean z11, k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            kVar = null;
        }
        return c(dVar, z11, kVar);
    }

    public static final d e(d dVar, boolean z11, k kVar) {
        p.j(dVar, "<this>");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new FocusableKt$focusableInNonTouchMode$$inlined$debugInspectorInfo$1(z11, kVar) : InspectableValueKt.a(), new FocusableKt$focusableInNonTouchMode$2(z11, kVar));
    }

    /* access modifiers changed from: private */
    public static final d f(d dVar, l<? super j, bp0.k> lVar) {
        return InspectableValueKt.b(dVar, InspectableValueKt.c() ? new FocusableKt$onPinnableParentAvailable$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a(), d.f16037h0.N(new h(lVar)));
    }
}
