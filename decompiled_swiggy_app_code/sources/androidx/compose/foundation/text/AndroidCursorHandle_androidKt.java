package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.ui.ComposedModifierKt;
import bp0.k;
import d2.h;
import e0.g;
import e0.s0;
import l0.b;
import lp0.l;
import lp0.p;
import p0.d;

/* compiled from: AndroidCursorHandle.android.kt */
public final class AndroidCursorHandle_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final float f4216a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f4217b;

    static {
        float n = h.n((float) 25);
        f4216a = n;
        f4217b = h.n(h.n(n * 2.0f) / 2.4142137f);
    }

    public static final void a(long j, d dVar, p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        kotlin.jvm.internal.p.j(dVar, "modifier");
        g t = gVar.t(-5185995);
        if ((i11 & 14) == 0) {
            i12 = (t.q(j) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= t.k(dVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= t.k(pVar) ? 256 : 128;
        }
        if ((i12 & 731) != 146 || !t.b()) {
            AndroidSelectionHandles_androidKt.b(j, HandleReferencePoint.TopMiddle, b.b(t, -1458480226, true, new AndroidCursorHandle_androidKt$CursorHandle$1(pVar, dVar, i12)), t, (i12 & 14) | 432);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new AndroidCursorHandle_androidKt$CursorHandle$2(j, dVar, pVar, i11));
        }
    }

    public static final void b(d dVar, g gVar, int i11) {
        int i12;
        kotlin.jvm.internal.p.j(dVar, "modifier");
        g t = gVar.t(694251107);
        if ((i11 & 14) == 0) {
            i12 = (t.k(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) != 2 || !t.b()) {
            androidx.compose.foundation.layout.k.a(c(SizeKt.u(dVar, f4217b, f4216a)), t, 0);
        } else {
            t.h();
        }
        s0 v = t.v();
        if (v != null) {
            v.a(new AndroidCursorHandle_androidKt$DefaultCursorHandle$1(dVar, i11));
        }
    }

    public static final d c(d dVar) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        return ComposedModifierKt.d(dVar, (l) null, AndroidCursorHandle_androidKt$drawCursorHandle$1.f4227a, 1, (Object) null);
    }
}
