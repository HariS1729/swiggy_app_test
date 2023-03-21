package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.InspectableValueKt;
import bp0.k;
import j1.c;
import j1.f;
import k1.q;
import kotlin.jvm.internal.p;
import p0.d;
import s0.l;
import s0.n;
import s0.o;
import s0.s;

/* compiled from: FocusProperties.kt */
public final class FocusPropertiesKt {

    /* renamed from: a  reason: collision with root package name */
    private static final f<n> f6392a = c.a(FocusPropertiesKt$ModifierLocalFocusProperties$1.f6394a);

    public static final void a(l lVar) {
        p.j(lVar, "<this>");
        lVar.e(true);
        o.a aVar = o.f16587b;
        lVar.l(aVar.a());
        lVar.i(aVar.a());
        lVar.k(aVar.a());
        lVar.g(aVar.a());
        lVar.a(aVar.a());
        lVar.m(aVar.a());
        lVar.h(aVar.a());
        lVar.c(aVar.a());
    }

    public static final d b(d dVar, lp0.l<? super l, k> lVar) {
        p.j(dVar, "<this>");
        p.j(lVar, "scope");
        return dVar.N(new n(lVar, InspectableValueKt.c() ? new FocusPropertiesKt$focusProperties$$inlined$debugInspectorInfo$1(lVar) : InspectableValueKt.a()));
    }

    public static final f<n> c() {
        return f6392a;
    }

    public static final void d(FocusModifier focusModifier) {
        OwnerSnapshotObserver snapshotObserver;
        p.j(focusModifier, "<this>");
        LayoutNodeWrapper m11 = focusModifier.m();
        if (m11 != null) {
            a(focusModifier.g());
            q t02 = m11.j1().t0();
            if (!(t02 == null || (snapshotObserver = t02.getSnapshotObserver()) == null)) {
                snapshotObserver.e(focusModifier, FocusModifier.q.a(), new FocusPropertiesKt$refreshFocusProperties$1(focusModifier));
            }
            e(focusModifier, focusModifier.g());
        }
    }

    public static final void e(FocusModifier focusModifier, l lVar) {
        p.j(focusModifier, "<this>");
        p.j(lVar, "properties");
        if (lVar.j()) {
            s.a(focusModifier);
        } else {
            s.e(focusModifier);
        }
    }
}
