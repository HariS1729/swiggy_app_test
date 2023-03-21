package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import bp0.k;
import defpackage.v1;
import e0.a1;
import e0.h0;
import e2.a;
import fp0.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;
import t0.g;
import t0.l;
import u0.c0;
import u0.d0;
import u0.e0;
import w0.d;
import w0.e;
import wp0.k0;
import wp0.k1;
import wp0.w;
import wp0.y;

/* compiled from: RippleAnimation.kt */
public final class RippleAnimation {

    /* renamed from: a  reason: collision with root package name */
    private f f5818a;

    /* renamed from: b  reason: collision with root package name */
    private final float f5819b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5820c;

    /* renamed from: d  reason: collision with root package name */
    private Float f5821d;

    /* renamed from: e  reason: collision with root package name */
    private Float f5822e;

    /* renamed from: f  reason: collision with root package name */
    private f f5823f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Animatable<Float, v1.k> f5824g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Animatable<Float, v1.k> f5825h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Animatable<Float, v1.k> f5826i;
    private final w<k> j;
    private final h0 k;

    /* renamed from: l  reason: collision with root package name */
    private final h0 f5827l;

    private RippleAnimation(f fVar, float f11, boolean z11) {
        this.f5818a = fVar;
        this.f5819b = f11;
        this.f5820c = z11;
        this.f5824g = v1.b.b(0.0f, 0.0f, 2, (Object) null);
        this.f5825h = v1.b.b(0.0f, 0.0f, 2, (Object) null);
        this.f5826i = v1.b.b(0.0f, 0.0f, 2, (Object) null);
        this.j = y.a((k1) null);
        Boolean bool = Boolean.FALSE;
        this.k = j.e(bool, (a1) null, 2, (Object) null);
        this.f5827l = j.e(bool, (a1) null, 2, (Object) null);
    }

    public /* synthetic */ RippleAnimation(f fVar, float f11, boolean z11, i iVar) {
        this(fVar, f11, z11);
    }

    private final Object f(c<? super k> cVar) {
        Object e11 = k0.e(new RippleAnimation$fadeIn$2(this, (c<? super RippleAnimation$fadeIn$2>) null), cVar);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    private final Object g(c<? super k> cVar) {
        Object e11 = k0.e(new RippleAnimation$fadeOut$2(this, (c<? super RippleAnimation$fadeOut$2>) null), cVar);
        return e11 == b.d() ? e11 : k.f22762a;
    }

    private final boolean i() {
        return ((Boolean) this.f5827l.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    private final void k(boolean z11) {
        this.f5827l.setValue(Boolean.valueOf(z11));
    }

    private final void l(boolean z11) {
        this.k.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(fp0.c<? super bp0.k> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.f5831d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5831d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f5829b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f5831d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            bp0.g.b(r7)
            goto L_0x0072
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.f5828a
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            bp0.g.b(r7)
            goto L_0x0066
        L_0x003f:
            java.lang.Object r2 = r0.f5828a
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            bp0.g.b(r7)
            goto L_0x0056
        L_0x0047:
            bp0.g.b(r7)
            r0.f5828a = r6
            r0.f5831d = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r6
        L_0x0056:
            r2.l(r5)
            wp0.w<bp0.k> r7 = r2.j
            r0.f5828a = r2
            r0.f5831d = r4
            java.lang.Object r7 = r7.Q(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r7 = 0
            r0.f5828a = r7
            r0.f5831d = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            bp0.k r7 = bp0.k.f22762a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.d(fp0.c):java.lang.Object");
    }

    public final void e(w0.f fVar, long j11) {
        float f11;
        Float f12;
        w0.f fVar2 = fVar;
        p.j(fVar2, "$receiver");
        if (this.f5821d == null) {
            this.f5821d = Float.valueOf(d0.c.b(fVar.d()));
        }
        if (this.f5822e == null) {
            if (Float.isNaN(this.f5819b)) {
                f12 = Float.valueOf(d0.c.a(fVar2, this.f5820c, fVar.d()));
            } else {
                f12 = Float.valueOf(fVar2.v0(this.f5819b));
            }
            this.f5822e = f12;
        }
        if (this.f5818a == null) {
            this.f5818a = f.d(fVar.R());
        }
        if (this.f5823f == null) {
            this.f5823f = f.d(g.a(l.i(fVar.d()) / 2.0f, l.g(fVar.d()) / 2.0f));
        }
        if (!i() || j()) {
            f11 = this.f5824g.o().floatValue();
        } else {
            f11 = 1.0f;
        }
        Float f13 = this.f5821d;
        p.g(f13);
        float floatValue = f13.floatValue();
        Float f14 = this.f5822e;
        p.g(f14);
        float a11 = a.a(floatValue, f14.floatValue(), this.f5825h.o().floatValue());
        f fVar3 = this.f5818a;
        p.g(fVar3);
        float m11 = f.m(fVar3.u());
        f fVar4 = this.f5823f;
        p.g(fVar4);
        float a12 = a.a(m11, f.m(fVar4.u()), this.f5826i.o().floatValue());
        f fVar5 = this.f5818a;
        p.g(fVar5);
        float n = f.n(fVar5.u());
        f fVar6 = this.f5823f;
        p.g(fVar6);
        long a13 = g.a(a12, a.a(n, f.n(fVar6.u()), this.f5826i.o().floatValue()));
        long l11 = d0.l(j11, d0.o(j11) * f11, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (this.f5820c) {
            float i11 = l.i(fVar.d());
            float g11 = l.g(fVar.d());
            int b11 = c0.f16752a.b();
            d O = fVar.O();
            long d11 = O.d();
            O.a().a();
            O.c().b(0.0f, 0.0f, i11, g11, b11);
            e.f(fVar, l11, a11, a13, 0.0f, (w0.g) null, (e0) null, 0, 120, (Object) null);
            O.a().o();
            O.b(d11);
            return;
        }
        e.f(fVar, l11, a11, a13, 0.0f, (w0.g) null, (e0) null, 0, 120, (Object) null);
    }

    public final void h() {
        k(true);
        this.j.A(k.f22762a);
    }
}
