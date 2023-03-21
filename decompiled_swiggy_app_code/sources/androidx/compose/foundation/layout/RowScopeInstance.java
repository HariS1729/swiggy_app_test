package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.a2;
import kotlin.jvm.internal.p;
import p0.a;
import p0.d;

/* compiled from: Row.kt */
public final class RowScopeInstance implements a2.t {

    /* renamed from: a  reason: collision with root package name */
    public static final RowScopeInstance f3806a = new RowScopeInstance();

    private RowScopeInstance() {
    }

    public d a(d dVar, float f11, boolean z11) {
        p.j(dVar, "<this>");
        if (((double) f11) > 0.0d) {
            return dVar.N(new a2.n(f11, z11, InspectableValueKt.c() ? new RowScopeInstance$weight$$inlined$debugInspectorInfo$1(f11, z11) : InspectableValueKt.a()));
        }
        throw new IllegalArgumentException(("invalid weight " + f11 + "; must be greater than zero").toString());
    }

    public d b(d dVar, a.c cVar) {
        p.j(dVar, "<this>");
        p.j(cVar, "alignment");
        return dVar.N(new a2.w(cVar, InspectableValueKt.c() ? new RowScopeInstance$align$$inlined$debugInspectorInfo$1(cVar) : InspectableValueKt.a()));
    }
}
