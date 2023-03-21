package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import c0.c;
import c0.q;
import com.truecaller.android.sdk.TruecallerSdkScope;
import e0.g;
import e0.m0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.d0;
import u0.f0;

/* compiled from: Colors.kt */
public final class ColorsKt {

    /* renamed from: a  reason: collision with root package name */
    private static final m0<c> f4924a = CompositionLocalKt.d(ColorsKt$LocalColors$1.f4925a);

    public static final long a(c cVar, long j) {
        p.j(cVar, "$this$contentColorFor");
        if (d0.n(j, cVar.j())) {
            return cVar.g();
        }
        if (d0.n(j, cVar.k())) {
            return cVar.g();
        }
        if (d0.n(j, cVar.l())) {
            return cVar.h();
        }
        if (d0.n(j, cVar.m())) {
            return cVar.h();
        }
        if (d0.n(j, cVar.c())) {
            return cVar.e();
        }
        if (d0.n(j, cVar.n())) {
            return cVar.i();
        }
        if (d0.n(j, cVar.d())) {
            return cVar.f();
        }
        return d0.f16756b.f();
    }

    public static final long b(long j, g gVar, int i11) {
        long a11 = a(q.f12737a.a(gVar, 6), j);
        return (a11 > d0.f16756b.f() ? 1 : (a11 == d0.f16756b.f() ? 0 : -1)) != 0 ? a11 : ((d0) gVar.z(ContentColorKt.a())).v();
    }

    public static final m0<c> c() {
        return f4924a;
    }

    public static final c d(long j, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22) {
        return new c(j, j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, true, (i) null);
    }

    public static /* synthetic */ c e(long j, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, int i11, Object obj) {
        int i12 = i11;
        return d((i12 & 1) != 0 ? f0.c(4284612846L) : j, (i12 & 2) != 0 ? f0.c(4281794739L) : j11, (i12 & 4) != 0 ? f0.c(4278442694L) : j12, (i12 & 8) != 0 ? f0.c(4278290310L) : j13, (i12 & 16) != 0 ? d0.f16756b.g() : j14, (i12 & 32) != 0 ? d0.f16756b.g() : j15, (i12 & 64) != 0 ? f0.c(4289724448L) : j16, (i12 & 128) != 0 ? d0.f16756b.g() : j17, (i12 & 256) != 0 ? d0.f16756b.a() : j18, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? d0.f16756b.a() : j19, (i12 & 1024) != 0 ? d0.f16756b.a() : j21, (i12 & 2048) != 0 ? d0.f16756b.g() : j22);
    }

    public static final void f(c cVar, c cVar2) {
        p.j(cVar, "<this>");
        p.j(cVar2, "other");
        cVar.x(cVar2.j());
        cVar.y(cVar2.k());
        cVar.z(cVar2.l());
        cVar.A(cVar2.m());
        cVar.p(cVar2.c());
        cVar.B(cVar2.n());
        cVar.q(cVar2.d());
        cVar.u(cVar2.g());
        cVar.v(cVar2.h());
        cVar.s(cVar2.e());
        cVar.w(cVar2.i());
        cVar.t(cVar2.f());
        cVar.r(cVar2.o());
    }
}
