package androidx.compose.foundation.gestures;

import d2.e;
import defpackage.y1;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.sync.c;
import kotlinx.coroutines.sync.d;

/* compiled from: TapGestureDetector.kt */
final class PressGestureScopeImpl implements y1.n, e {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f3447a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3448b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3449c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3450d = d.a(false);

    public PressGestureScopeImpl(e eVar) {
        p.j(eVar, "density");
        this.f3447a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object H(fp0.c<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.f3454d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3454d = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f3452b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f3454d
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f3451a
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            bp0.g.b(r5)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            bp0.g.b(r5)
            boolean r5 = r4.f3448b
            if (r5 != 0) goto L_0x004e
            boolean r5 = r4.f3449c
            if (r5 != 0) goto L_0x004e
            kotlinx.coroutines.sync.c r5 = r4.f3450d
            r0.f3451a = r4
            r0.f3454d = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.c.a.a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r4
        L_0x004f:
            boolean r5 = r0.f3448b
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.H(fp0.c):java.lang.Object");
    }

    public float M(float f11) {
        return this.f3447a.M(f11);
    }

    public long S(long j) {
        return this.f3447a.S(j);
    }

    public final void b() {
        this.f3449c = true;
        c.a.c(this.f3450d, (Object) null, 1, (Object) null);
    }

    public float getDensity() {
        return this.f3447a.getDensity();
    }

    public int j0(float f11) {
        return this.f3447a.j0(f11);
    }

    public float k(int i11) {
        return this.f3447a.k(i11);
    }

    public float m0(long j) {
        return this.f3447a.m0(j);
    }

    public long o(long j) {
        return this.f3447a.o(j);
    }

    public final void p() {
        this.f3448b = true;
        c.a.c(this.f3450d, (Object) null, 1, (Object) null);
    }

    public long q(int i11) {
        return this.f3447a.q(i11);
    }

    public final void r() {
        c.a.b(this.f3450d, (Object) null, 1, (Object) null);
        this.f3448b = false;
        this.f3449c = false;
    }

    public float u0() {
        return this.f3447a.u0();
    }

    public float v0(float f11) {
        return this.f3447a.v0(f11);
    }

    public int y0(long j) {
        return this.f3447a.y0(j);
    }
}
