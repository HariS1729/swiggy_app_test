package y1;

import kotlin.jvm.internal.p;
import p1.u;

/* compiled from: TextPaintExtensions.android.kt */
public final class d {
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p1.u a(x1.h r24, p1.u r25, lp0.r<? super u1.i, ? super u1.v, ? super u1.s, ? super u1.t, ? extends android.graphics.Typeface> r26, d2.e r27) {
        /*
            r0 = r24
            r1 = r26
            r2 = r27
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.p.j(r0, r3)
            java.lang.String r3 = "style"
            r4 = r25
            kotlin.jvm.internal.p.j(r4, r3)
            java.lang.String r3 = "resolveTypeface"
            kotlin.jvm.internal.p.j(r1, r3)
            java.lang.String r3 = "density"
            kotlin.jvm.internal.p.j(r2, r3)
            long r5 = r25.i()
            long r5 = d2.r.g(r5)
            d2.t$a r3 = d2.t.f14026b
            long r7 = r3.b()
            boolean r7 = d2.t.g(r5, r7)
            if (r7 == 0) goto L_0x003c
            long r5 = r25.i()
            float r2 = r2.m0(r5)
            r0.setTextSize(r2)
            goto L_0x0057
        L_0x003c:
            long r7 = r3.a()
            boolean r2 = d2.t.g(r5, r7)
            if (r2 == 0) goto L_0x0057
            float r2 = r24.getTextSize()
            long r5 = r25.i()
            float r5 = d2.r.h(r5)
            float r2 = r2 * r5
            r0.setTextSize(r2)
        L_0x0057:
            boolean r2 = b(r25)
            if (r2 == 0) goto L_0x00a0
            u1.i r2 = r25.g()
            u1.v r5 = r25.l()
            if (r5 != 0) goto L_0x006d
            u1.v$a r5 = u1.v.f16949b
            u1.v r5 = r5.f()
        L_0x006d:
            u1.s r6 = r25.j()
            if (r6 == 0) goto L_0x0078
            int r6 = r6.i()
            goto L_0x007e
        L_0x0078:
            u1.s$a r6 = u1.s.f16939b
            int r6 = r6.b()
        L_0x007e:
            u1.s r6 = u1.s.c(r6)
            u1.t r7 = r25.k()
            if (r7 == 0) goto L_0x008d
            int r7 = r7.m()
            goto L_0x0093
        L_0x008d:
            u1.t$a r7 = u1.t.f16943b
            int r7 = r7.a()
        L_0x0093:
            u1.t r7 = u1.t.e(r7)
            java.lang.Object r1 = r1.invoke(r2, r5, r6, r7)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r0.setTypeface(r1)
        L_0x00a0:
            w1.f r1 = r25.n()
            r2 = 0
            if (r1 == 0) goto L_0x00e7
            w1.f r1 = r25.n()
            w1.f$a r5 = w1.f.f17448c
            w1.f r5 = r5.a()
            boolean r1 = kotlin.jvm.internal.p.e(r1, r5)
            if (r1 != 0) goto L_0x00e7
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r1 < r5) goto L_0x00c7
            y1.b r1 = y1.b.f18009a
            w1.f r5 = r25.n()
            r1.b(r0, r5)
            goto L_0x00e7
        L_0x00c7:
            w1.f r1 = r25.n()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00d8
            w1.e$a r1 = w1.e.f17446b
            w1.e r1 = r1.a()
            goto L_0x00e0
        L_0x00d8:
            w1.f r1 = r25.n()
            w1.e r1 = r1.c(r2)
        L_0x00e0:
            java.util.Locale r1 = y1.a.a(r1)
            r0.setTextLocale(r1)
        L_0x00e7:
            long r5 = r25.m()
            long r5 = d2.r.g(r5)
            long r7 = r3.a()
            boolean r1 = d2.t.g(r5, r7)
            if (r1 == 0) goto L_0x0105
            long r5 = r25.m()
            float r1 = d2.r.h(r5)
            r0.setLetterSpacing(r1)
            goto L_0x010c
        L_0x0105:
            long r7 = r3.b()
            d2.t.g(r5, r7)
        L_0x010c:
            java.lang.String r1 = r25.h()
            if (r1 == 0) goto L_0x0125
            java.lang.String r1 = r25.h()
            java.lang.String r5 = ""
            boolean r1 = kotlin.jvm.internal.p.e(r1, r5)
            if (r1 != 0) goto L_0x0125
            java.lang.String r1 = r25.h()
            r0.setFontFeatureSettings(r1)
        L_0x0125:
            a2.h r1 = r25.s()
            if (r1 == 0) goto L_0x015c
            a2.h r1 = r25.s()
            a2.h$a r5 = a2.h.f927c
            a2.h r5 = r5.a()
            boolean r1 = kotlin.jvm.internal.p.e(r1, r5)
            if (r1 != 0) goto L_0x015c
            float r1 = r24.getTextScaleX()
            a2.h r5 = r25.s()
            float r5 = r5.b()
            float r1 = r1 * r5
            r0.setTextScaleX(r1)
            float r1 = r24.getTextSkewX()
            a2.h r5 = r25.s()
            float r5 = r5.c()
            float r1 = r1 + r5
            r0.setTextSkewX(r1)
        L_0x015c:
            long r5 = r25.f()
            r0.b(r5)
            u0.u r1 = r25.e()
            t0.l$a r5 = t0.l.f16682b
            long r5 = r5.a()
            r0.a(r1, r5)
            u0.h1 r1 = r25.p()
            r0.c(r1)
            a2.e r1 = r25.q()
            r0.d(r1)
            long r0 = r25.m()
            long r0 = d2.r.g(r0)
            long r5 = r3.b()
            boolean r0 = d2.t.g(r0, r5)
            if (r0 == 0) goto L_0x01a7
            long r0 = r25.m()
            float r0 = d2.r.h(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x019f
            r0 = 1
            goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            if (r0 != 0) goto L_0x01a7
            long r0 = r25.m()
            goto L_0x01ad
        L_0x01a7:
            d2.r$a r0 = d2.r.f14022b
            long r0 = r0.a()
        L_0x01ad:
            r13 = r0
            long r0 = r25.c()
            u0.d0$a r3 = u0.d0.f16756b
            long r5 = r3.e()
            boolean r0 = u0.d0.n(r0, r5)
            if (r0 == 0) goto L_0x01c3
            long r0 = r3.f()
            goto L_0x01c7
        L_0x01c3:
            long r0 = r25.c()
        L_0x01c7:
            r18 = r0
            a2.a r0 = r25.d()
            a2.a$a r1 = a2.a.f884b
            float r1 = r1.a()
            if (r0 != 0) goto L_0x01d6
            goto L_0x01de
        L_0x01d6:
            float r0 = r0.h()
            boolean r2 = a2.a.e(r0, r1)
        L_0x01de:
            if (r2 == 0) goto L_0x01e2
            r0 = 0
            goto L_0x01e6
        L_0x01e2:
            a2.a r0 = r25.d()
        L_0x01e6:
            r15 = r0
            p1.u r0 = new p1.u
            r3 = r0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 13951(0x367f, float:1.955E-41)
            r23 = 0
            r3.<init>((long) r4, (long) r6, (u1.v) r8, (u1.s) r9, (u1.t) r10, (u1.i) r11, (java.lang.String) r12, (long) r13, (a2.a) r15, (a2.h) r16, (w1.f) r17, (long) r18, (a2.e) r20, (u0.h1) r21, (int) r22, (kotlin.jvm.internal.i) r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.d.a(x1.h, p1.u, lp0.r, d2.e):p1.u");
    }

    public static final boolean b(u uVar) {
        p.j(uVar, "<this>");
        return (uVar.g() == null && uVar.j() == null && uVar.l() == null) ? false : true;
    }
}
