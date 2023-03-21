package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.ComposedModifierKt;
import defpackage.v1;
import e0.d1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import p0.d;
import t0.f;
import t0.g;

/* compiled from: SelectionMagnifier.kt */
public final class SelectionMagnifierKt {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final v1.l f4710a = new v1.l(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    private static final v1.q0<f, v1.l> f4711b = VectorConvertersKt.a(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.f4714a, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.f4715a);

    /* renamed from: c  reason: collision with root package name */
    private static final long f4712c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final v1.l0<f> f4713d;

    static {
        long a11 = g.a(0.01f, 0.01f);
        f4712c = a11;
        f4713d = new v1.l0(0.0f, 0.0f, f.d(a11), 3, (i) null);
    }

    public static final d e(d dVar, a<f> aVar, l<? super a<f>, ? extends d> lVar) {
        p.j(dVar, "<this>");
        p.j(aVar, "magnifierCenter");
        p.j(lVar, "platformMagnifier");
        return ComposedModifierKt.d(dVar, (l) null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(aVar, lVar), 1, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [lp0.a<t0.f>, lp0.a] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e0.d1<t0.f> f(lp0.a<t0.f> r4, e0.g r5, int r6) {
        /*
            r6 = -1589795249(0xffffffffa13da64f, float:-6.42558E-19)
            r5.E(r6)
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.E(r6)
            java.lang.Object r0 = r5.F()
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r2 = r1.a()
            if (r0 != r2) goto L_0x001f
            e0.d1 r0 = androidx.compose.runtime.g.c(r4)
            r5.y(r0)
        L_0x001f:
            r5.P()
            e0.d1 r0 = (e0.d1) r0
            r5.E(r6)
            java.lang.Object r4 = r5.F()
            java.lang.Object r6 = r1.a()
            if (r4 != r6) goto L_0x0049
            androidx.compose.animation.core.Animatable r4 = new androidx.compose.animation.core.Animatable
            long r1 = g(r0)
            t0.f r6 = t0.f.d(r1)
            v1$q0<t0.f, v1$l> r1 = f4711b
            long r2 = f4712c
            t0.f r2 = t0.f.d(r2)
            r4.<init>(r6, r1, r2)
            r5.y(r4)
        L_0x0049:
            r5.P()
            androidx.compose.animation.core.Animatable r4 = (androidx.compose.animation.core.Animatable) r4
            bp0.k r6 = bp0.k.f22762a
            androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 r1 = new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1
            r2 = 0
            r1.<init>(r0, r4, r2)
            r0 = 0
            e0.u.e(r6, r1, r5, r0)
            e0.d1 r4 = r4.g()
            r5.P()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionMagnifierKt.f(lp0.a, e0.g, int):e0.d1");
    }

    /* access modifiers changed from: private */
    public static final long g(d1<f> d1Var) {
        return d1Var.getValue().u();
    }
}
