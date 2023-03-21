package d0;

import defpackage.v1;
import e0.d1;
import e0.g;
import kotlin.jvm.internal.i;
import u.b;
import u.d;
import u.f;
import u0.d0;

/* compiled from: Ripple.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final v1.p0<Float> f13819a = new v1.p0(15, 0, v1.z.c(), 2, (i) null);

    /* access modifiers changed from: private */
    public static final v1.g<Float> c(u.h hVar) {
        if (hVar instanceof f) {
            return f13819a;
        }
        if (hVar instanceof d) {
            return new v1.p0(45, 0, v1.z.c(), 2, (i) null);
        }
        if (hVar instanceof b) {
            return new v1.p0(45, 0, v1.z.c(), 2, (i) null);
        }
        return f13819a;
    }

    /* access modifiers changed from: private */
    public static final v1.g<Float> d(u.h hVar) {
        if (hVar instanceof f) {
            return f13819a;
        }
        if (hVar instanceof d) {
            return f13819a;
        }
        if (hVar instanceof b) {
            return new v1.p0(150, 0, v1.z.c(), 2, (i) null);
        }
        return f13819a;
    }

    public static final s.h e(boolean z11, float f11, long j, g gVar, int i11, int i12) {
        gVar.E(-1508283743);
        if ((i12 & 1) != 0) {
            z11 = true;
        }
        if ((i12 & 2) != 0) {
            f11 = d2.h.f13997b.c();
        }
        if ((i12 & 4) != 0) {
            j = d0.f16756b.f();
        }
        d1 m11 = androidx.compose.runtime.g.m(d0.h(j), gVar, (i11 >> 6) & 14);
        Boolean valueOf = Boolean.valueOf(z11);
        d2.h k = d2.h.k(f11);
        gVar.E(-3686552);
        boolean k11 = gVar.k(valueOf) | gVar.k(k);
        Object F = gVar.F();
        if (k11 || F == g.f14172a.a()) {
            F = new a(z11, f11, m11, (i) null);
            gVar.y(F);
        }
        gVar.P();
        a aVar = (a) F;
        gVar.P();
        return aVar;
    }
}
