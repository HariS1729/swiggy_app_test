package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import i1.m;
import j1.c;
import j1.f;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: FocusedBounds.kt */
public final class FocusedBoundsKt {

    /* renamed from: a  reason: collision with root package name */
    private static final f<l<m, k>> f3004a = c.a(FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1.f3006a);

    public static final f<l<m, k>> a() {
        return f3004a;
    }

    public static final d b(d dVar, l<? super m, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "onPositioned");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new FocusedBoundsKt$onFocusedBoundsChanged$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a(), new FocusedBoundsKt$onFocusedBoundsChanged$2(lVar));
    }
}
