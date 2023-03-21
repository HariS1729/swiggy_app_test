package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import c0.d;
import c0.q;
import d2.h;
import defpackage.a2;
import e0.g;
import kotlin.jvm.internal.i;
import u0.d0;
import u0.f0;

/* compiled from: Button.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5770a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final float f5771b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f5772c;

    /* renamed from: d  reason: collision with root package name */
    private static final a2.p f5773d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f5774e = h.n((float) 64);

    /* renamed from: f  reason: collision with root package name */
    private static final float f5775f = h.n((float) 36);

    /* renamed from: g  reason: collision with root package name */
    private static final float f5776g = h.n((float) 18);

    /* renamed from: h  reason: collision with root package name */
    private static final float f5777h;

    /* renamed from: i  reason: collision with root package name */
    private static final float f5778i = h.n((float) 1);
    private static final float j;
    private static final a2.p k;

    static {
        float n = h.n((float) 16);
        f5771b = n;
        float f11 = (float) 8;
        float n11 = h.n(f11);
        f5772c = n11;
        a2.p d11 = PaddingKt.d(n, n11, n, n11);
        f5773d = d11;
        f5777h = h.n(f11);
        float n12 = h.n(f11);
        j = n12;
        k = PaddingKt.d(n12, d11.d(), n12, d11.a());
    }

    private a() {
    }

    public final c0.a a(long j11, long j12, long j13, long j14, g gVar, int i11, int i12) {
        long j15;
        g gVar2 = gVar;
        gVar2.E(2063545420);
        long j16 = (i12 & 1) != 0 ? q.f12737a.a(gVar2, 6).j() : j11;
        long b11 = (i12 & 2) != 0 ? ColorsKt.b(j16, gVar2, i11 & 14) : j12;
        if ((i12 & 4) != 0) {
            q qVar = q.f12737a;
            j15 = f0.e(d0.l(qVar.a(gVar2, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null), qVar.a(gVar2, 6).n());
        } else {
            j15 = j13;
        }
        b bVar = new b(j16, b11, j15, (i12 & 8) != 0 ? d0.l(q.f12737a.a(gVar2, 6).i(), d.f12682a.b(gVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j14, (i) null);
        gVar.P();
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r3 == e0.g.f14172a.a()) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c0.b b(float r14, float r15, float r16, float r17, float r18, e0.g r19, int r20, int r21) {
        /*
            r13 = this;
            r0 = r19
            r1 = 399130879(0x17ca40ff, float:1.3070351E-24)
            r0.E(r1)
            r1 = r21 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0014
            float r1 = (float) r2
            float r1 = d2.h.n(r1)
            r4 = r1
            goto L_0x0015
        L_0x0014:
            r4 = r14
        L_0x0015:
            r1 = r21 & 2
            if (r1 == 0) goto L_0x0022
            r1 = 8
            float r1 = (float) r1
            float r1 = d2.h.n(r1)
            r5 = r1
            goto L_0x0023
        L_0x0022:
            r5 = r15
        L_0x0023:
            r1 = r21 & 4
            r3 = 0
            if (r1 == 0) goto L_0x002f
            float r1 = (float) r3
            float r1 = d2.h.n(r1)
            r6 = r1
            goto L_0x0031
        L_0x002f:
            r6 = r16
        L_0x0031:
            r1 = r21 & 8
            r7 = 4
            if (r1 == 0) goto L_0x003c
            float r1 = (float) r7
            float r1 = d2.h.n(r1)
            goto L_0x003e
        L_0x003c:
            r1 = r17
        L_0x003e:
            r8 = r21 & 16
            if (r8 == 0) goto L_0x0048
            float r8 = (float) r7
            float r8 = d2.h.n(r8)
            goto L_0x004a
        L_0x0048:
            r8 = r18
        L_0x004a:
            r9 = 5
            java.lang.Object[] r10 = new java.lang.Object[r9]
            d2.h r11 = d2.h.k(r4)
            r10[r3] = r11
            d2.h r11 = d2.h.k(r5)
            r12 = 1
            r10[r12] = r11
            d2.h r11 = d2.h.k(r6)
            r10[r2] = r11
            r2 = 3
            d2.h r11 = d2.h.k(r1)
            r10[r2] = r11
            d2.h r2 = d2.h.k(r8)
            r10[r7] = r2
            r2 = -3685570(0xffffffffffc7c33e, float:NaN)
            r0.E(r2)
            r2 = 0
        L_0x0074:
            if (r3 >= r9) goto L_0x0080
            r7 = r10[r3]
            int r3 = r3 + 1
            boolean r7 = r0.k(r7)
            r2 = r2 | r7
            goto L_0x0074
        L_0x0080:
            java.lang.Object r3 = r19.F()
            if (r2 != 0) goto L_0x008e
            e0.g$a r2 = e0.g.f14172a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0099
        L_0x008e:
            androidx.compose.material.DefaultButtonElevation r2 = new androidx.compose.material.DefaultButtonElevation
            r9 = 0
            r3 = r2
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.y(r2)
        L_0x0099:
            r19.P()
            androidx.compose.material.DefaultButtonElevation r3 = (androidx.compose.material.DefaultButtonElevation) r3
            r19.P()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.b(float, float, float, float, float, e0.g, int, int):c0.b");
    }

    public final a2.p c() {
        return f5773d;
    }

    public final float d() {
        return f5775f;
    }

    public final float e() {
        return f5774e;
    }

    public final a2.p f() {
        return k;
    }

    public final c0.a g(long j11, long j12, long j13, g gVar, int i11, int i12) {
        g gVar2 = gVar;
        gVar2.E(1409305054);
        long e11 = (i12 & 1) != 0 ? d0.f16756b.e() : j11;
        b bVar = new b(e11, (i12 & 2) != 0 ? q.f12737a.a(gVar2, 6).j() : j12, e11, (i12 & 4) != 0 ? d0.l(q.f12737a.a(gVar2, 6).i(), d.f12682a.b(gVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null) : j13, (i) null);
        gVar.P();
        return bVar;
    }
}
