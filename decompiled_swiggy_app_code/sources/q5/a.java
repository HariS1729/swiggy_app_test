package q5;

import android.content.Context;
import android.util.Log;
import c6.d;
import co.hyperverge.hypersnapsdk.objects.HVDocConfig;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.objects.HVFaceConfig;
import co.hyperverge.hypersnapsdk.objects.b;
import java.util.Map;
import w5.n;

/* compiled from: AnalyticsTracker */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f16377a = a.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private b f16378b;

    public a(Context context) {
        try {
            Map<String, Boolean> u11 = n.w().u();
            if ((u11 == null || !u11.containsKey("analytics")) ? true : u11.get("analytics").booleanValue()) {
                this.f16378b = r5.a.w0(context);
            } else {
                this.f16378b = null;
            }
        } catch (Exception | NoClassDefFoundError e11) {
            this.f16378b = null;
            Log.e(this.f16377a, e11.getMessage());
        }
    }

    private boolean s0() {
        return this.f16378b != null;
    }

    public void A() {
        if (s0()) {
            this.f16378b.A();
        }
    }

    public void B(long j) {
        if (s0()) {
            this.f16378b.B(j);
        }
    }

    public void C(HVFaceConfig hVFaceConfig) {
        if (s0()) {
            this.f16378b.C(hVFaceConfig);
        }
    }

    public void D(long j) {
        if (s0()) {
            this.f16378b.D(j);
        }
    }

    public void E(HVFaceConfig hVFaceConfig) {
        if (s0()) {
            this.f16378b.E(hVFaceConfig);
        }
    }

    public void F() {
        if (s0()) {
            this.f16378b.F();
        }
    }

    public void G(HVDocConfig hVDocConfig, String str, long j) {
        if (s0()) {
            this.f16378b.G(hVDocConfig, str, j);
        }
    }

    public void H(long j) {
        if (s0()) {
            this.f16378b.H(j);
        }
    }

    public void I(b bVar, HVError hVError, String str) {
        if (s0()) {
            this.f16378b.I(bVar, hVError, str);
        }
    }

    public void J() {
        if (s0()) {
            this.f16378b.J();
        }
    }

    public void K(long j) {
        if (s0()) {
            this.f16378b.K(j);
        }
    }

    public void L(HVFaceConfig hVFaceConfig) {
        if (s0()) {
            this.f16378b.L(hVFaceConfig);
        }
    }

    public void M(long j) {
        if (s0()) {
            this.f16378b.M(j);
        }
    }

    public void N() {
        if (s0()) {
            this.f16378b.N();
        }
    }

    public void O() {
        if (s0()) {
            this.f16378b.O();
        }
    }

    public void P(b bVar, long j) {
        if (s0()) {
            this.f16378b.P(bVar, j);
        }
    }

    public void Q(b bVar, HVError hVError) {
        if (s0()) {
            this.f16378b.Q(bVar, hVError);
        }
    }

    public void R() {
        if (s0()) {
            this.f16378b.R();
        }
    }

    public void S(HVError hVError) {
        if (s0()) {
            this.f16378b.S(hVError);
        }
    }

    public void T(HVError hVError) {
        if (s0()) {
            this.f16378b.T(hVError);
        }
    }

    public void U(HVError hVError, HVDocConfig hVDocConfig, long j) {
        if (s0()) {
            this.f16378b.U(hVError, hVDocConfig, j);
        }
    }

    public void V(d dVar, HVFaceConfig hVFaceConfig, long j) {
        if (s0()) {
            this.f16378b.V(dVar, hVFaceConfig, j);
        }
    }

    public void W(String str, String str2, String str3, String str4) {
        if (s0()) {
            this.f16378b.W(str, str2, str3, str4);
        }
    }

    public void X(HVDocConfig hVDocConfig) {
        if (s0()) {
            this.f16378b.X(hVDocConfig);
        }
    }

    public void Y(HVError hVError) {
        if (s0()) {
            this.f16378b.Y(hVError);
        }
    }

    public void Z(HVDocConfig hVDocConfig) {
        if (s0()) {
            this.f16378b.Z(hVDocConfig);
        }
    }

    public void a(long j) {
        if (s0()) {
            this.f16378b.a(j);
        }
    }

    public void a0() {
        if (s0()) {
            this.f16378b.a0();
        }
    }

    public void b() {
        if (s0()) {
            this.f16378b.b();
        }
    }

    public void b0(HVError hVError) {
        if (s0()) {
            this.f16378b.b0(hVError);
        }
    }

    public void c(long j) {
        if (s0()) {
            this.f16378b.c(j);
        }
    }

    public void c0(long j) {
        if (s0()) {
            this.f16378b.c0(j);
        }
    }

    public void d() {
        if (s0()) {
            this.f16378b.d();
        }
    }

    public void d0(String str, long j, long j11) {
        if (s0()) {
            this.f16378b.d0(str, j, j11);
        }
    }

    public void e(long j) {
        if (s0()) {
            this.f16378b.e(j);
        }
    }

    public void e0() {
        if (s0()) {
            this.f16378b.e0();
        }
    }

    public void f() {
        if (s0()) {
            this.f16378b.f();
        }
    }

    public void f0(HVError hVError, d dVar, HVFaceConfig hVFaceConfig) {
        if (s0()) {
            this.f16378b.f0(hVError, dVar, hVFaceConfig);
        }
    }

    public void g(long j) {
        if (s0()) {
            this.f16378b.g(j);
        }
    }

    public void g0(long j) {
        if (s0()) {
            this.f16378b.g0(j);
        }
    }

    public void h() {
        if (s0()) {
            this.f16378b.h();
        }
    }

    public void h0() {
        if (s0()) {
            this.f16378b.h0();
        }
    }

    public void i() {
        if (s0()) {
            this.f16378b.i();
        }
    }

    public void i0(String str, int i11) {
        if (s0()) {
            this.f16378b.i0(str, i11);
        }
    }

    public void j() {
        if (s0()) {
            this.f16378b.j();
        }
    }

    public void j0(HVError hVError) {
        if (s0()) {
            this.f16378b.j0(hVError);
        }
    }

    public void k() {
        if (s0()) {
            this.f16378b.k();
        }
    }

    public void k0(long j) {
        if (s0()) {
            this.f16378b.k0(j);
        }
    }

    public void l() {
        if (s0()) {
            this.f16378b.l();
        }
    }

    public void l0(HVDocConfig hVDocConfig) {
        if (s0()) {
            this.f16378b.l0(hVDocConfig);
        }
    }

    public void m() {
        if (s0()) {
            this.f16378b.m();
        }
    }

    public void m0(String str, int i11) {
        if (s0()) {
            this.f16378b.m0(str, i11);
        }
    }

    public void n() {
        if (s0()) {
            this.f16378b.n();
        }
    }

    public void n0(long j) {
        if (s0()) {
            this.f16378b.n0(j);
        }
    }

    public void o() {
        if (s0()) {
            this.f16378b.o();
        }
    }

    public void o0(HVError hVError) {
        if (s0()) {
            this.f16378b.o0(hVError);
        }
    }

    public void p(String str, String str2) {
        if (s0()) {
            this.f16378b.p(str, str2);
        }
    }

    public void p0(HVFaceConfig hVFaceConfig, long j) {
        if (s0()) {
            this.f16378b.p0(hVFaceConfig, j);
        }
    }

    public void q(long j) {
        if (s0()) {
            this.f16378b.q(j);
        }
    }

    public void q0(long j) {
        if (s0()) {
            this.f16378b.q0(j);
        }
    }

    public void r(HVError hVError, long j) {
        if (s0()) {
            this.f16378b.r(hVError, j);
        }
    }

    public void r0(HVError hVError) {
        if (s0()) {
            this.f16378b.r0(hVError);
        }
    }

    public void s(d dVar, String str, long j) {
        if (s0()) {
            this.f16378b.s(dVar, str, j);
        }
    }

    public void t(HVError hVError, HVFaceConfig hVFaceConfig, long j) {
        if (s0()) {
            this.f16378b.t(hVError, hVFaceConfig, j);
        }
    }

    public void u() {
        if (s0()) {
            this.f16378b.u();
        }
    }

    public void v() {
        if (s0()) {
            this.f16378b.v();
        }
    }

    public void w(long j) {
        if (s0()) {
            this.f16378b.w(j);
        }
    }

    public void x(d dVar, HVError hVError) {
        if (s0()) {
            this.f16378b.x(dVar, hVError);
        }
    }

    public void y() {
        if (s0()) {
            this.f16378b.y();
        }
    }

    public void z(long j) {
        if (s0()) {
            this.f16378b.z(j);
        }
    }

    public void a() {
        if (s0()) {
            this.f16378b.a();
        }
    }

    public void b(HVDocConfig hVDocConfig, long j) {
        if (s0()) {
            this.f16378b.b(hVDocConfig, j);
        }
    }

    public void d(long j) {
        if (s0()) {
            this.f16378b.d(j);
        }
    }

    public void f(HVFaceConfig hVFaceConfig, String str, long j) {
        if (s0()) {
            this.f16378b.f(hVFaceConfig, str, j);
        }
    }

    public void h(b bVar, String str, long j) {
        if (s0()) {
            this.f16378b.h(bVar, str, j);
        }
    }

    public void i(HVError hVError, long j) {
        if (s0()) {
            this.f16378b.i(hVError, j);
        }
    }

    public void k(long j) {
        if (s0()) {
            this.f16378b.k(j);
        }
    }

    public void v(String str, String str2) {
        if (s0()) {
            this.f16378b.v(str, str2);
        }
    }

    public void a(String str) {
        if (s0()) {
            this.f16378b.a(str);
        }
    }
}
