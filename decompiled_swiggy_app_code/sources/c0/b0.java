package c0;

import com.truecaller.android.sdk.TruecallerSdkScope;
import e0.g;
import kotlin.jvm.internal.i;
import u0.d0;
import u0.f0;

/* compiled from: Switch.kt */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f12670a = new b0();

    private b0() {
    }

    public final a0 a(long j, long j11, float f11, long j12, long j13, float f12, long j14, long j15, long j16, long j17, g gVar, int i11, int i12, int i13) {
        long j18;
        long j19;
        float f13;
        long j21;
        long j22;
        long j23;
        int i14;
        g gVar2 = gVar;
        int i15 = i13;
        gVar2.E(-1592206455);
        long m11 = (i15 & 1) != 0 ? q.f12737a.a(gVar2, 6).m() : j;
        long j24 = (i15 & 2) != 0 ? m11 : j11;
        float f14 = (i15 & 4) != 0 ? 0.54f : f11;
        long n = (i15 & 8) != 0 ? q.f12737a.a(gVar2, 6).n() : j12;
        long i16 = (i15 & 16) != 0 ? q.f12737a.a(gVar2, 6).i() : j13;
        float f15 = (i15 & 32) != 0 ? 0.38f : f12;
        if ((i15 & 64) != 0) {
            j18 = m11;
            j19 = f0.e(d0.l(m11, d.f12682a.b(gVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), q.f12737a.a(gVar2, 6).n());
        } else {
            j18 = m11;
            j19 = j14;
        }
        if ((i15 & 128) != 0) {
            f13 = f15;
            j21 = f0.e(d0.l(j24, d.f12682a.b(gVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), q.f12737a.a(gVar2, 6).n());
        } else {
            f13 = f15;
            j21 = j15;
        }
        if ((i15 & 256) != 0) {
            j22 = j19;
            i14 = 6;
            j23 = f0.e(d0.l(n, d.f12682a.b(gVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), q.f12737a.a(gVar2, 6).n());
        } else {
            j22 = j19;
            i14 = 6;
            j23 = j16;
        }
        e eVar = new e(j18, d0.l(j24, f14, 0.0f, 0.0f, 0.0f, 14, (Object) null), n, d0.l(i16, f13, 0.0f, 0.0f, 0.0f, 14, (Object) null), j22, d0.l(j21, f14, 0.0f, 0.0f, 0.0f, 14, (Object) null), j23, d0.l((i15 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? f0.e(d0.l(i16, d.f12682a.b(gVar2, i14), 0.0f, 0.0f, 0.0f, 14, (Object) null), q.f12737a.a(gVar2, 6).n()) : j17, f13, 0.0f, 0.0f, 0.0f, 14, (Object) null), (i) null);
        gVar.P();
        return eVar;
    }
}
