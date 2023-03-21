package androidx.compose.foundation.layout;

import d2.c;
import i1.e0;
import i1.i;
import i1.j;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.p;

/* renamed from: androidx.compose.foundation.layout.IntrinsicSizeModifier$-CC  reason: invalid class name */
/* compiled from: Intrinsic.kt */
public final /* synthetic */ class IntrinsicSizeModifier$CC {
    public static boolean a(f fVar) {
        return true;
    }

    public static int b(f fVar, j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return iVar.x(i11);
    }

    public static int c(f fVar, j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return iVar.L(i11);
    }

    public static u d(f fVar, w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        long T = fVar.T(wVar, rVar, j);
        if (fVar.z0()) {
            T = c.e(j, T);
        }
        e0 N = rVar.N(T);
        return v.b(wVar, N.A0(), N.e0(), (Map) null, new IntrinsicSizeModifier$measure$1(N), 4, (Object) null);
    }

    public static int e(f fVar, j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return iVar.J(i11);
    }

    public static int f(f fVar, j jVar, i iVar, int i11) {
        p.j(jVar, "<this>");
        p.j(iVar, "measurable");
        return iVar.K(i11);
    }
}
