package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import e0.m0;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: TouchTarget.kt */
public final class TouchTargetKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<Boolean> f5765a = CompositionLocalKt.d(TouchTargetKt$LocalMinimumTouchTargetEnforcement$1.f5766a);

    public static final m0<Boolean> a() {
        return f5765a;
    }

    public static final d b(d dVar) {
        p.j(dVar, "<this>");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new TouchTargetKt$minimumTouchTargetSize$$inlined$debugInspectorInfo$1() : InspectableValueKt.a(), TouchTargetKt$minimumTouchTargetSize$2.f5767a);
    }
}
