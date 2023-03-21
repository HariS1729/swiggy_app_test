package androidx.compose.foundation;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import d2.e;
import d2.k;
import kotlin.jvm.internal.i;
import lp0.a;
import lp0.l;
import lp0.p;
import p0.d;
import s.j;
import s.o;
import t0.f;

/* compiled from: Magnifier.kt */
public final class MagnifierKt {

    /* renamed from: a  reason: collision with root package name */
    private static final SemanticsPropertyKey<a<f>> f3062a = new SemanticsPropertyKey<>("MagnifierPositionInRoot", (p) null, 2, (i) null);

    public static final SemanticsPropertyKey<a<f>> a() {
        return f3062a;
    }

    public static final boolean b(int i11) {
        return i11 >= 28;
    }

    public static /* synthetic */ boolean c(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Build.VERSION.SDK_INT;
        }
        return b(i11);
    }

    public static final d d(d dVar, l<? super e, f> lVar, l<? super e, f> lVar2, float f11, j jVar, l<? super k, bp0.k> lVar3) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        kotlin.jvm.internal.p.j(lVar, "sourceCenter");
        kotlin.jvm.internal.p.j(lVar2, "magnifierCenter");
        kotlin.jvm.internal.p.j(jVar, "style");
        l magnifierKt$magnifier$$inlined$debugInspectorInfo$1 = InspectableValueKt.c() ? new MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(lVar, lVar2, f11, jVar) : InspectableValueKt.a();
        d dVar2 = d.f16037h0;
        if (c(0, 1, (Object) null)) {
            dVar2 = e(dVar2, lVar, lVar2, f11, jVar, lVar3, o.f16550a.a());
        }
        return InspectableValueKt.b(dVar, magnifierKt$magnifier$$inlined$debugInspectorInfo$1, dVar2);
    }

    @SuppressLint({"ModifierInspectorInfo"})
    public static final d e(d dVar, l<? super e, f> lVar, l<? super e, f> lVar2, float f11, j jVar, l<? super k, bp0.k> lVar3, o oVar) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        kotlin.jvm.internal.p.j(lVar, "sourceCenter");
        kotlin.jvm.internal.p.j(lVar2, "magnifierCenter");
        kotlin.jvm.internal.p.j(jVar, "style");
        kotlin.jvm.internal.p.j(oVar, "platformMagnifierFactory");
        return ComposedModifierKt.d(dVar, (l) null, new MagnifierKt$magnifier$4(lVar, lVar2, f11, lVar3, oVar, jVar), 1, (Object) null);
    }

    public static /* synthetic */ d f(d dVar, l lVar, l lVar2, float f11, j jVar, l lVar3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar2 = MagnifierKt$magnifier$1.f3067a;
        }
        l lVar4 = lVar2;
        float f12 = (i11 & 4) != 0 ? Float.NaN : f11;
        if ((i11 & 8) != 0) {
            jVar = j.f16539g.a();
        }
        j jVar2 = jVar;
        if ((i11 & 16) != 0) {
            lVar3 = null;
        }
        return d(dVar, lVar, lVar4, f12, jVar2, lVar3);
    }
}
