package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.a2;
import kotlin.jvm.internal.p;
import p0.a;
import p0.d;

/* compiled from: Box.kt */
public final class BoxScopeInstance implements a2.e {

    /* renamed from: a  reason: collision with root package name */
    public static final BoxScopeInstance f3698a = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    public d b(d dVar, a aVar) {
        p.j(dVar, "<this>");
        p.j(aVar, "alignment");
        return dVar.N(new b(aVar, false, InspectableValueKt.c() ? new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(aVar) : InspectableValueKt.a()));
    }

    public d d(d dVar) {
        p.j(dVar, "<this>");
        return dVar.N(new b(a.f16019a.e(), true, InspectableValueKt.c() ? new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1() : InspectableValueKt.a()));
    }
}
