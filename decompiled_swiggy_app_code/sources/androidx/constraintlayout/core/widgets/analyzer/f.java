package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.a;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;

/* compiled from: Direct */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static b.a f8262a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f8263b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f8264c = 0;

    private static boolean a(int i11, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour C = constraintWidget.C();
        ConstraintWidget.DimensionBehaviour X = constraintWidget.X();
        d dVar = constraintWidget.N() != null ? (d) constraintWidget.N() : null;
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour C2 = dVar.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour X2 = dVar.X();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z11 = C == dimensionBehaviour5 || constraintWidget.r0() || C == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (C == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f8206w == 0 && constraintWidget.f8179f0 == 0.0f && constraintWidget.e0(0)) || (C == dimensionBehaviour2 && constraintWidget.f8206w == 1 && constraintWidget.h0(0, constraintWidget.a0()));
        boolean z12 = X == dimensionBehaviour5 || constraintWidget.s0() || X == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (X == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f8208x == 0 && constraintWidget.f8179f0 == 0.0f && constraintWidget.e0(1)) || (X == dimensionBehaviour && constraintWidget.f8208x == 1 && constraintWidget.h0(1, constraintWidget.z()));
        if (constraintWidget.f8179f0 > 0.0f && (z11 || z12)) {
            return true;
        }
        if (!z11 || !z12) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r11 = r12.S.f8163f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r11 = r12.Q.f8163f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(int r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.core.widgets.analyzer.b.C0027b r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r17.k0()
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = f8263b
            r4 = 1
            int r3 = r3 + r4
            f8263b = r3
            boolean r3 = r0 instanceof androidx.constraintlayout.core.widgets.d
            if (r3 != 0) goto L_0x002f
            boolean r3 = r17.q0()
            if (r3 == 0) goto L_0x002f
            int r3 = r16 + 1
            boolean r5 = a(r3, r0)
            if (r5 == 0) goto L_0x002f
            androidx.constraintlayout.core.widgets.analyzer.b$a r5 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r5.<init>()
            int r6 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            androidx.constraintlayout.core.widgets.d.Y1(r3, r0, r1, r5, r6)
        L_0x002f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.q(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.q(r5)
            int r6 = r3.e()
            int r7 = r5.e()
            java.util.HashSet r8 = r3.d()
            r9 = 0
            r10 = 8
            if (r8 == 0) goto L_0x0131
            boolean r8 = r3.n()
            if (r8 == 0) goto L_0x0131
            java.util.HashSet r3 = r3.d()
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0131
            java.lang.Object r8 = r3.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r8.f8161d
            int r13 = r16 + 1
            boolean r14 = a(r13, r12)
            boolean r15 = r12.q0()
            if (r15 == 0) goto L_0x0080
            if (r14 == 0) goto L_0x0080
            androidx.constraintlayout.core.widgets.analyzer.b$a r15 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r15.<init>()
            int r11 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            androidx.constraintlayout.core.widgets.d.Y1(r13, r12, r1, r15, r11)
        L_0x0080:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.Q
            if (r8 != r11) goto L_0x0090
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f8163f
            if (r11 == 0) goto L_0x0090
            boolean r11 = r11.n()
            if (r11 != 0) goto L_0x00a0
        L_0x0090:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.S
            if (r8 != r11) goto L_0x00a2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f8163f
            if (r11 == 0) goto L_0x00a2
            boolean r11 = r11.n()
            if (r11 == 0) goto L_0x00a2
        L_0x00a0:
            r11 = 1
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r12.C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r4) goto L_0x00e6
            if (r14 == 0) goto L_0x00ae
            goto L_0x00e6
        L_0x00ae:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r12.C()
            if (r8 != r4) goto L_0x00ec
            int r4 = r12.A
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.f8212z
            if (r4 < 0) goto L_0x00ec
            int r4 = r12.Z()
            if (r4 == r10) goto L_0x00ce
            int r4 = r12.f8206w
            if (r4 != 0) goto L_0x00ec
            float r4 = r12.x()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00ec
        L_0x00ce:
            boolean r4 = r12.m0()
            if (r4 != 0) goto L_0x00ec
            boolean r4 = r12.p0()
            if (r4 != 0) goto L_0x00ec
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.m0()
            if (r4 != 0) goto L_0x00ec
            e(r13, r0, r1, r12, r2)
            goto L_0x00ec
        L_0x00e6:
            boolean r4 = r12.q0()
            if (r4 == 0) goto L_0x00ef
        L_0x00ec:
            r4 = 1
            goto L_0x005a
        L_0x00ef:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r12.Q
            if (r8 != r4) goto L_0x010a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f8163f
            if (r14 != 0) goto L_0x010a
            int r4 = r4.f()
            int r4 = r4 + r6
            int r8 = r12.a0()
            int r8 = r8 + r4
            r12.L0(r4, r8)
            b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x010a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.S
            if (r8 != r14) goto L_0x0125
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f8163f
            if (r4 != 0) goto L_0x0125
            int r4 = r14.f()
            int r4 = r6 - r4
            int r8 = r12.a0()
            int r8 = r4 - r8
            r12.L0(r8, r4)
            b(r13, r12, r1, r2)
            goto L_0x00ec
        L_0x0125:
            if (r11 == 0) goto L_0x00ec
            boolean r4 = r12.m0()
            if (r4 != 0) goto L_0x00ec
            d(r13, r1, r12, r2)
            goto L_0x00ec
        L_0x0131:
            boolean r3 = r0 instanceof androidx.constraintlayout.core.widgets.f
            if (r3 == 0) goto L_0x0136
            return
        L_0x0136:
            java.util.HashSet r3 = r5.d()
            if (r3 == 0) goto L_0x0225
            boolean r3 = r5.n()
            if (r3 == 0) goto L_0x0225
            java.util.HashSet r3 = r5.d()
            java.util.Iterator r3 = r3.iterator()
        L_0x014a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0225
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.f8161d
            r6 = 1
            int r8 = r16 + 1
            boolean r11 = a(r8, r5)
            boolean r12 = r5.q0()
            if (r12 == 0) goto L_0x0171
            if (r11 == 0) goto L_0x0171
            androidx.constraintlayout.core.widgets.analyzer.b$a r12 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r12.<init>()
            int r13 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            androidx.constraintlayout.core.widgets.d.Y1(r8, r5, r1, r12, r13)
        L_0x0171:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.Q
            if (r4 != r12) goto L_0x0181
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f8163f
            if (r12 == 0) goto L_0x0181
            boolean r12 = r12.n()
            if (r12 != 0) goto L_0x0191
        L_0x0181:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.S
            if (r4 != r12) goto L_0x0193
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f8163f
            if (r12 == 0) goto L_0x0193
            boolean r12 = r12.n()
            if (r12 == 0) goto L_0x0193
        L_0x0191:
            r12 = 1
            goto L_0x0194
        L_0x0193:
            r12 = 0
        L_0x0194:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = r5.C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r13 != r14) goto L_0x01d8
            if (r11 == 0) goto L_0x019f
            goto L_0x01d8
        L_0x019f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r5.C()
            if (r4 != r14) goto L_0x014a
            int r4 = r5.A
            if (r4 < 0) goto L_0x014a
            int r4 = r5.f8212z
            if (r4 < 0) goto L_0x014a
            int r4 = r5.Z()
            if (r4 == r10) goto L_0x01bf
            int r4 = r5.f8206w
            if (r4 != 0) goto L_0x014a
            float r4 = r5.x()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x014a
        L_0x01bf:
            boolean r4 = r5.m0()
            if (r4 != 0) goto L_0x014a
            boolean r4 = r5.p0()
            if (r4 != 0) goto L_0x014a
            if (r12 == 0) goto L_0x014a
            boolean r4 = r5.m0()
            if (r4 != 0) goto L_0x014a
            e(r8, r0, r1, r5, r2)
            goto L_0x014a
        L_0x01d8:
            boolean r11 = r5.q0()
            if (r11 == 0) goto L_0x01e0
            goto L_0x014a
        L_0x01e0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.Q
            if (r4 != r11) goto L_0x01fc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r5.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.f8163f
            if (r13 != 0) goto L_0x01fc
            int r4 = r11.f()
            int r4 = r4 + r7
            int r11 = r5.a0()
            int r11 = r11 + r4
            r5.L0(r4, r11)
            b(r8, r5, r1, r2)
            goto L_0x014a
        L_0x01fc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r5.S
            if (r4 != r13) goto L_0x0218
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r11.f8163f
            if (r4 != 0) goto L_0x0218
            int r4 = r13.f()
            int r4 = r7 - r4
            int r11 = r5.a0()
            int r11 = r4 - r11
            r5.L0(r11, r4)
            b(r8, r5, r1, r2)
            goto L_0x014a
        L_0x0218:
            if (r12 == 0) goto L_0x014a
            boolean r4 = r5.m0()
            if (r4 != 0) goto L_0x014a
            d(r8, r1, r5, r2)
            goto L_0x014a
        L_0x0225:
            r17.u0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.f.b(int, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.b$b, boolean):void");
    }

    private static void c(int i11, a aVar, b.C0027b bVar, int i12, boolean z11) {
        if (!aVar.z1()) {
            return;
        }
        if (i12 == 0) {
            b(i11 + 1, aVar, bVar, z11);
        } else {
            i(i11 + 1, aVar, bVar);
        }
    }

    private static void d(int i11, b.C0027b bVar, ConstraintWidget constraintWidget, boolean z11) {
        float A = constraintWidget.A();
        int e11 = constraintWidget.Q.f8163f.e();
        int e12 = constraintWidget.S.f8163f.e();
        int f11 = constraintWidget.Q.f() + e11;
        int f12 = e12 - constraintWidget.S.f();
        if (e11 == e12) {
            A = 0.5f;
        } else {
            e11 = f11;
            e12 = f12;
        }
        int a02 = constraintWidget.a0();
        int i12 = (e12 - e11) - a02;
        if (e11 > e12) {
            i12 = (e11 - e12) - a02;
        }
        int i13 = ((int) (i12 > 0 ? (A * ((float) i12)) + 0.5f : A * ((float) i12))) + e11;
        int i14 = i13 + a02;
        if (e11 > e12) {
            i14 = i13 - a02;
        }
        constraintWidget.L0(i13, i14);
        b(i11 + 1, constraintWidget, bVar, z11);
    }

    private static void e(int i11, ConstraintWidget constraintWidget, b.C0027b bVar, ConstraintWidget constraintWidget2, boolean z11) {
        int i12;
        float A = constraintWidget2.A();
        int e11 = constraintWidget2.Q.f8163f.e() + constraintWidget2.Q.f();
        int e12 = constraintWidget2.S.f8163f.e() - constraintWidget2.S.f();
        if (e12 >= e11) {
            int a02 = constraintWidget2.a0();
            if (constraintWidget2.Z() != 8) {
                int i13 = constraintWidget2.f8206w;
                if (i13 == 2) {
                    if (constraintWidget instanceof d) {
                        i12 = constraintWidget.a0();
                    } else {
                        i12 = constraintWidget.N().a0();
                    }
                    a02 = (int) (constraintWidget2.A() * 0.5f * ((float) i12));
                } else if (i13 == 0) {
                    a02 = e12 - e11;
                }
                a02 = Math.max(constraintWidget2.f8212z, a02);
                int i14 = constraintWidget2.A;
                if (i14 > 0) {
                    a02 = Math.min(i14, a02);
                }
            }
            int i15 = e11 + ((int) ((A * ((float) ((e12 - e11) - a02))) + 0.5f));
            constraintWidget2.L0(i15, a02 + i15);
            b(i11 + 1, constraintWidget2, bVar, z11);
        }
    }

    private static void f(int i11, b.C0027b bVar, ConstraintWidget constraintWidget) {
        float V = constraintWidget.V();
        int e11 = constraintWidget.R.f8163f.e();
        int e12 = constraintWidget.T.f8163f.e();
        int f11 = constraintWidget.R.f() + e11;
        int f12 = e12 - constraintWidget.T.f();
        if (e11 == e12) {
            V = 0.5f;
        } else {
            e11 = f11;
            e12 = f12;
        }
        int z11 = constraintWidget.z();
        int i12 = (e12 - e11) - z11;
        if (e11 > e12) {
            i12 = (e11 - e12) - z11;
        }
        int i13 = (int) (i12 > 0 ? (V * ((float) i12)) + 0.5f : V * ((float) i12));
        int i14 = e11 + i13;
        int i15 = i14 + z11;
        if (e11 > e12) {
            i14 = e11 - i13;
            i15 = i14 - z11;
        }
        constraintWidget.O0(i14, i15);
        i(i11 + 1, constraintWidget, bVar);
    }

    private static void g(int i11, ConstraintWidget constraintWidget, b.C0027b bVar, ConstraintWidget constraintWidget2) {
        int i12;
        float V = constraintWidget2.V();
        int e11 = constraintWidget2.R.f8163f.e() + constraintWidget2.R.f();
        int e12 = constraintWidget2.T.f8163f.e() - constraintWidget2.T.f();
        if (e12 >= e11) {
            int z11 = constraintWidget2.z();
            if (constraintWidget2.Z() != 8) {
                int i13 = constraintWidget2.f8208x;
                if (i13 == 2) {
                    if (constraintWidget instanceof d) {
                        i12 = constraintWidget.z();
                    } else {
                        i12 = constraintWidget.N().z();
                    }
                    z11 = (int) (V * 0.5f * ((float) i12));
                } else if (i13 == 0) {
                    z11 = e12 - e11;
                }
                z11 = Math.max(constraintWidget2.C, z11);
                int i14 = constraintWidget2.D;
                if (i14 > 0) {
                    z11 = Math.min(i14, z11);
                }
            }
            int i15 = e11 + ((int) ((V * ((float) ((e12 - e11) - z11))) + 0.5f));
            constraintWidget2.O0(i15, z11 + i15);
            i(i11 + 1, constraintWidget2, bVar);
        }
    }

    public static void h(d dVar, b.C0027b bVar) {
        ConstraintWidget.DimensionBehaviour C = dVar.C();
        ConstraintWidget.DimensionBehaviour X = dVar.X();
        f8263b = 0;
        f8264c = 0;
        dVar.A0();
        ArrayList<ConstraintWidget> x12 = dVar.x1();
        int size = x12.size();
        for (int i11 = 0; i11 < size; i11++) {
            x12.get(i11).A0();
        }
        boolean V1 = dVar.V1();
        if (C == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.L0(0, dVar.a0());
        } else {
            dVar.M0(0);
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            ConstraintWidget constraintWidget = x12.get(i12);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                if (fVar.y1() == 1) {
                    if (fVar.z1() != -1) {
                        fVar.C1(fVar.z1());
                    } else if (fVar.A1() != -1 && dVar.r0()) {
                        fVar.C1(dVar.a0() - fVar.A1());
                    } else if (dVar.r0()) {
                        fVar.C1((int) ((fVar.B1() * ((float) dVar.a0())) + 0.5f));
                    }
                    z11 = true;
                }
            } else if ((constraintWidget instanceof a) && ((a) constraintWidget).D1() == 0) {
                z12 = true;
            }
        }
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                ConstraintWidget constraintWidget2 = x12.get(i13);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                    if (fVar2.y1() == 1) {
                        b(0, fVar2, bVar, V1);
                    }
                }
            }
        }
        b(0, dVar, bVar, V1);
        if (z12) {
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget3 = x12.get(i14);
                if (constraintWidget3 instanceof a) {
                    a aVar = (a) constraintWidget3;
                    if (aVar.D1() == 0) {
                        c(0, aVar, bVar, 0, V1);
                    }
                }
            }
        }
        if (X == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.O0(0, dVar.z());
        } else {
            dVar.N0(0);
        }
        boolean z13 = false;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            ConstraintWidget constraintWidget4 = x12.get(i15);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar3 = (androidx.constraintlayout.core.widgets.f) constraintWidget4;
                if (fVar3.y1() == 0) {
                    if (fVar3.z1() != -1) {
                        fVar3.C1(fVar3.z1());
                    } else if (fVar3.A1() != -1 && dVar.s0()) {
                        fVar3.C1(dVar.z() - fVar3.A1());
                    } else if (dVar.s0()) {
                        fVar3.C1((int) ((fVar3.B1() * ((float) dVar.z())) + 0.5f));
                    }
                    z13 = true;
                }
            } else if ((constraintWidget4 instanceof a) && ((a) constraintWidget4).D1() == 1) {
                z14 = true;
            }
        }
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget5 = x12.get(i16);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar4 = (androidx.constraintlayout.core.widgets.f) constraintWidget5;
                    if (fVar4.y1() == 0) {
                        i(1, fVar4, bVar);
                    }
                }
            }
        }
        i(0, dVar, bVar);
        if (z14) {
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget6 = x12.get(i17);
                if (constraintWidget6 instanceof a) {
                    a aVar2 = (a) constraintWidget6;
                    if (aVar2.D1() == 1) {
                        c(0, aVar2, bVar, 1, V1);
                    }
                }
            }
        }
        for (int i18 = 0; i18 < size; i18++) {
            ConstraintWidget constraintWidget7 = x12.get(i18);
            if (constraintWidget7.q0() && a(0, constraintWidget7)) {
                d.Y1(0, constraintWidget7, bVar, f8262a, b.a.k);
                if (!(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.f)) {
                    b(0, constraintWidget7, bVar, V1);
                    i(0, constraintWidget7, bVar);
                } else if (((androidx.constraintlayout.core.widgets.f) constraintWidget7).y1() == 0) {
                    i(0, constraintWidget7, bVar);
                } else {
                    b(0, constraintWidget7, bVar, V1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r14 = r11.T.f8163f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        r14 = r11.R.f8163f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void i(int r16, androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.core.widgets.analyzer.b.C0027b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r17.t0()
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            int r2 = f8264c
            r3 = 1
            int r2 = r2 + r3
            f8264c = r2
            boolean r2 = r0 instanceof androidx.constraintlayout.core.widgets.d
            if (r2 != 0) goto L_0x002d
            boolean r2 = r17.q0()
            if (r2 == 0) goto L_0x002d
            int r2 = r16 + 1
            boolean r4 = a(r2, r0)
            if (r4 == 0) goto L_0x002d
            androidx.constraintlayout.core.widgets.analyzer.b$a r4 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r4.<init>()
            int r5 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            androidx.constraintlayout.core.widgets.d.Y1(r2, r0, r1, r4, r5)
        L_0x002d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.q(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.q(r4)
            int r5 = r2.e()
            int r6 = r4.e()
            java.util.HashSet r7 = r2.d()
            r8 = 0
            r9 = 8
            if (r7 == 0) goto L_0x0132
            boolean r7 = r2.n()
            if (r7 == 0) goto L_0x0132
            java.util.HashSet r2 = r2.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0132
            java.lang.Object r7 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r7.f8161d
            int r12 = r16 + 1
            boolean r13 = a(r12, r11)
            boolean r14 = r11.q0()
            if (r14 == 0) goto L_0x007e
            if (r13 == 0) goto L_0x007e
            androidx.constraintlayout.core.widgets.analyzer.b$a r14 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r14.<init>()
            int r15 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            androidx.constraintlayout.core.widgets.d.Y1(r12, r11, r1, r14, r15)
        L_0x007e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.R
            if (r7 != r14) goto L_0x008e
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f8163f
            if (r14 == 0) goto L_0x008e
            boolean r14 = r14.n()
            if (r14 != 0) goto L_0x009e
        L_0x008e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.T
            if (r7 != r14) goto L_0x00a0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r14.f8163f
            if (r14 == 0) goto L_0x00a0
            boolean r14 = r14.n()
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = 1
            goto L_0x00a1
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r11.X()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r15 != r10) goto L_0x00e5
            if (r13 == 0) goto L_0x00ac
            goto L_0x00e5
        L_0x00ac:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r11.X()
            if (r7 != r10) goto L_0x0058
            int r7 = r11.D
            if (r7 < 0) goto L_0x0058
            int r7 = r11.C
            if (r7 < 0) goto L_0x0058
            int r7 = r11.Z()
            if (r7 == r9) goto L_0x00cc
            int r7 = r11.f8208x
            if (r7 != 0) goto L_0x0058
            float r7 = r11.x()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0058
        L_0x00cc:
            boolean r7 = r11.o0()
            if (r7 != 0) goto L_0x0058
            boolean r7 = r11.p0()
            if (r7 != 0) goto L_0x0058
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.o0()
            if (r7 != 0) goto L_0x0058
            g(r12, r0, r1, r11)
            goto L_0x0058
        L_0x00e5:
            boolean r10 = r11.q0()
            if (r10 == 0) goto L_0x00ed
            goto L_0x0058
        L_0x00ed:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r11.R
            if (r7 != r10) goto L_0x0109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r13.f8163f
            if (r13 != 0) goto L_0x0109
            int r7 = r10.f()
            int r7 = r7 + r5
            int r10 = r11.z()
            int r10 = r10 + r7
            r11.O0(r7, r10)
            i(r12, r11, r1)
            goto L_0x0058
        L_0x0109:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r11.T
            if (r7 != r13) goto L_0x0125
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r10.f8163f
            if (r7 != 0) goto L_0x0125
            int r7 = r13.f()
            int r7 = r5 - r7
            int r10 = r11.z()
            int r10 = r7 - r10
            r11.O0(r10, r7)
            i(r12, r11, r1)
            goto L_0x0058
        L_0x0125:
            if (r14 == 0) goto L_0x0058
            boolean r7 = r11.o0()
            if (r7 != 0) goto L_0x0058
            f(r12, r1, r11)
            goto L_0x0058
        L_0x0132:
            boolean r2 = r0 instanceof androidx.constraintlayout.core.widgets.f
            if (r2 == 0) goto L_0x0137
            return
        L_0x0137:
            java.util.HashSet r2 = r4.d()
            if (r2 == 0) goto L_0x0225
            boolean r2 = r4.n()
            if (r2 == 0) goto L_0x0225
            java.util.HashSet r2 = r4.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x014b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0225
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.f8161d
            int r7 = r16 + 1
            boolean r10 = a(r7, r5)
            boolean r11 = r5.q0()
            if (r11 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            androidx.constraintlayout.core.widgets.analyzer.b$a r11 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r11.<init>()
            int r12 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            androidx.constraintlayout.core.widgets.d.Y1(r7, r5, r1, r11, r12)
        L_0x0171:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.R
            if (r4 != r11) goto L_0x0181
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f8163f
            if (r11 == 0) goto L_0x0181
            boolean r11 = r11.n()
            if (r11 != 0) goto L_0x0191
        L_0x0181:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.T
            if (r4 != r11) goto L_0x0193
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r5.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f8163f
            if (r11 == 0) goto L_0x0193
            boolean r11 = r11.n()
            if (r11 == 0) goto L_0x0193
        L_0x0191:
            r11 = 1
            goto L_0x0194
        L_0x0193:
            r11 = 0
        L_0x0194:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r5.X()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x01d8
            if (r10 == 0) goto L_0x019f
            goto L_0x01d8
        L_0x019f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r5.X()
            if (r4 != r13) goto L_0x014b
            int r4 = r5.D
            if (r4 < 0) goto L_0x014b
            int r4 = r5.C
            if (r4 < 0) goto L_0x014b
            int r4 = r5.Z()
            if (r4 == r9) goto L_0x01bf
            int r4 = r5.f8208x
            if (r4 != 0) goto L_0x014b
            float r4 = r5.x()
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x014b
        L_0x01bf:
            boolean r4 = r5.o0()
            if (r4 != 0) goto L_0x014b
            boolean r4 = r5.p0()
            if (r4 != 0) goto L_0x014b
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.o0()
            if (r4 != 0) goto L_0x014b
            g(r7, r0, r1, r5)
            goto L_0x014b
        L_0x01d8:
            boolean r10 = r5.q0()
            if (r10 == 0) goto L_0x01e0
            goto L_0x014b
        L_0x01e0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r5.R
            if (r4 != r10) goto L_0x01fc
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r12.f8163f
            if (r12 != 0) goto L_0x01fc
            int r4 = r10.f()
            int r4 = r4 + r6
            int r10 = r5.z()
            int r10 = r10 + r4
            r5.O0(r4, r10)
            i(r7, r5, r1)
            goto L_0x014b
        L_0x01fc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r5.T
            if (r4 != r12) goto L_0x0218
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r10.f8163f
            if (r4 != 0) goto L_0x0218
            int r4 = r12.f()
            int r4 = r6 - r4
            int r10 = r5.z()
            int r10 = r4 - r10
            r5.O0(r10, r4)
            i(r7, r5, r1)
            goto L_0x014b
        L_0x0218:
            if (r11 == 0) goto L_0x014b
            boolean r4 = r5.o0()
            if (r4 != 0) goto L_0x014b
            f(r7, r1, r5)
            goto L_0x014b
        L_0x0225:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.q(r2)
            java.util.HashSet r4 = r2.d()
            if (r4 == 0) goto L_0x028a
            boolean r4 = r2.n()
            if (r4 == 0) goto L_0x028a
            int r4 = r2.e()
            java.util.HashSet r2 = r2.d()
            java.util.Iterator r2 = r2.iterator()
        L_0x0243:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x028a
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.f8161d
            int r7 = r16 + 1
            boolean r8 = a(r7, r6)
            boolean r9 = r6.q0()
            if (r9 == 0) goto L_0x0269
            if (r8 == 0) goto L_0x0269
            androidx.constraintlayout.core.widgets.analyzer.b$a r9 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r9.<init>()
            int r10 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            androidx.constraintlayout.core.widgets.d.Y1(r7, r6, r1, r9, r10)
        L_0x0269:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r6.X()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r9 != r10) goto L_0x0273
            if (r8 == 0) goto L_0x0243
        L_0x0273:
            boolean r8 = r6.q0()
            if (r8 == 0) goto L_0x027a
            goto L_0x0243
        L_0x027a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r6.U
            if (r5 != r8) goto L_0x0243
            int r5 = r5.f()
            int r5 = r5 + r4
            r6.K0(r5)
            i(r7, r6, r1)     // Catch:{ all -> 0x028e }
            goto L_0x0243
        L_0x028a:
            r17.v0()
            return
        L_0x028e:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.f.i(int, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.analyzer.b$b):void");
    }
}
