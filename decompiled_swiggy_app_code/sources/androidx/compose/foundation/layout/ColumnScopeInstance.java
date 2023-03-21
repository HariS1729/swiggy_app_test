package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.a2;
import kotlin.jvm.internal.p;
import p0.a;
import p0.d;

/* compiled from: Column.kt */
public final class ColumnScopeInstance implements a2.h {

    /* renamed from: a  reason: collision with root package name */
    public static final ColumnScopeInstance f3715a = new ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    public d a(d dVar, float f11, boolean z11) {
        p.j(dVar, "<this>");
        if (((double) f11) > 0.0d) {
            return dVar.N(new a2.n(f11, z11, InspectableValueKt.c() ? new ColumnScopeInstance$weight$$inlined$debugInspectorInfo$1(f11, z11) : InspectableValueKt.a()));
        }
        throw new IllegalArgumentException(("invalid weight " + f11 + "; must be greater than zero").toString());
    }

    public d b(d dVar, a.b bVar) {
        p.j(dVar, "<this>");
        p.j(bVar, "alignment");
        return dVar.N(new a2.l(bVar, InspectableValueKt.c() ? new ColumnScopeInstance$align$$inlined$debugInspectorInfo$1(bVar) : InspectableValueKt.a()));
    }
}
