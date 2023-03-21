package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import java.util.ArrayList;

/* compiled from: BasicMeasure */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<ConstraintWidget> f8237a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f8238b = new a();

    /* renamed from: c  reason: collision with root package name */
    private d f8239c;

    /* compiled from: BasicMeasure */
    public static class a {
        public static int k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f8240l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f8241m = 2;

        /* renamed from: a  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f8242a;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f8243b;

        /* renamed from: c  reason: collision with root package name */
        public int f8244c;

        /* renamed from: d  reason: collision with root package name */
        public int f8245d;

        /* renamed from: e  reason: collision with root package name */
        public int f8246e;

        /* renamed from: f  reason: collision with root package name */
        public int f8247f;

        /* renamed from: g  reason: collision with root package name */
        public int f8248g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8249h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8250i;
        public int j;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b  reason: collision with other inner class name */
    /* compiled from: BasicMeasure */
    public interface C0027b {
        void a();

        void b(ConstraintWidget constraintWidget, a aVar);
    }

    public b(d dVar) {
        this.f8239c = dVar;
    }

    private boolean a(C0027b bVar, ConstraintWidget constraintWidget, int i11) {
        this.f8238b.f8242a = constraintWidget.C();
        this.f8238b.f8243b = constraintWidget.X();
        this.f8238b.f8244c = constraintWidget.a0();
        this.f8238b.f8245d = constraintWidget.z();
        a aVar = this.f8238b;
        aVar.f8250i = false;
        aVar.j = i11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f8242a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z11 = dimensionBehaviour == dimensionBehaviour2;
        boolean z12 = aVar.f8243b == dimensionBehaviour2;
        boolean z13 = z11 && constraintWidget.f8179f0 > 0.0f;
        boolean z14 = z12 && constraintWidget.f8179f0 > 0.0f;
        if (z13 && constraintWidget.f8210y[0] == 4) {
            aVar.f8242a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z14 && constraintWidget.f8210y[1] == 4) {
            aVar.f8243b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        bVar.b(constraintWidget, aVar);
        constraintWidget.q1(this.f8238b.f8246e);
        constraintWidget.R0(this.f8238b.f8247f);
        constraintWidget.Q0(this.f8238b.f8249h);
        constraintWidget.G0(this.f8238b.f8248g);
        a aVar2 = this.f8238b;
        aVar2.j = a.k;
        return aVar2.f8250i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f8179f0 <= 0.0f) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(androidx.constraintlayout.core.widgets.d r13) {
        /*
            r12 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r13.V0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.Z1(r1)
            androidx.constraintlayout.core.widgets.analyzer.b$b r2 = r13.O1()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r13.V0
            java.lang.Object r5 = r5.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.f
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof androidx.constraintlayout.core.widgets.a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.p0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.j r6 = r5.f8176e
            if (r6 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.l r7 = r5.f8178f
            if (r7 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r6.f8231e
            boolean r6 = r6.j
            if (r6 == 0) goto L_0x0047
            androidx.constraintlayout.core.widgets.analyzer.e r6 = r7.f8231e
            boolean r6 = r6.j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r5.w(r3)
            r7 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.w(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f8206w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f8208x
            if (r10 == r7) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.Z1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof androidx.constraintlayout.core.widgets.i
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f8206w
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.m0()
            if (r11 != 0) goto L_0x007c
            r10 = 1
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f8208x
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.m0()
            if (r11 != 0) goto L_0x008b
            r10 = 1
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f8179f0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            r12.a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.b.b(androidx.constraintlayout.core.widgets.d):void");
    }

    private void c(d dVar, String str, int i11, int i12, int i13) {
        int L = dVar.L();
        int K = dVar.K();
        dVar.g1(0);
        dVar.f1(0);
        dVar.q1(i12);
        dVar.R0(i13);
        dVar.g1(L);
        dVar.f1(K);
        this.f8239c.d2(i11);
        this.f8239c.y1();
    }

    public long d(d dVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i21;
        boolean z11;
        int i22;
        d dVar2;
        int i23;
        boolean z12;
        int i24;
        boolean z13;
        b bVar = this;
        d dVar3 = dVar;
        int i25 = i11;
        int i26 = i14;
        int i27 = i16;
        C0027b O1 = dVar.O1();
        int size = dVar3.V0.size();
        int a02 = dVar.a0();
        int z14 = dVar.z();
        boolean b11 = g.b(i25, 128);
        boolean z15 = b11 || g.b(i25, 64);
        if (z15) {
            int i28 = 0;
            while (true) {
                if (i28 >= size) {
                    break;
                }
                ConstraintWidget constraintWidget = dVar3.V0.get(i28);
                ConstraintWidget.DimensionBehaviour C = constraintWidget.C();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z16 = (C == dimensionBehaviour) && (constraintWidget.X() == dimensionBehaviour) && constraintWidget.x() > 0.0f;
                if ((!constraintWidget.m0() || !z16) && ((!constraintWidget.o0() || !z16) && !(constraintWidget instanceof i) && !constraintWidget.m0() && !constraintWidget.o0())) {
                    i28++;
                }
            }
            z15 = false;
        }
        if (z15) {
            boolean z17 = androidx.constraintlayout.core.d.f8042r;
        }
        boolean z18 = z15 & ((i26 == 1073741824 && i27 == 1073741824) || b11);
        if (z18) {
            int min = Math.min(dVar.J(), i15);
            int min2 = Math.min(dVar.I(), i17);
            if (i26 == 1073741824 && dVar.a0() != min) {
                dVar3.q1(min);
                dVar.S1();
            }
            if (i27 == 1073741824 && dVar.z() != min2) {
                dVar3.R0(min2);
                dVar.S1();
            }
            if (i26 == 1073741824 && i27 == 1073741824) {
                z11 = dVar3.L1(b11);
                i21 = 2;
            } else {
                boolean M1 = dVar3.M1(b11);
                if (i26 == 1073741824) {
                    M1 &= dVar3.N1(b11, 0);
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                if (i27 == 1073741824) {
                    z11 = dVar3.N1(b11, 1) & M1;
                    i21++;
                } else {
                    z11 = M1;
                }
            }
            if (z11) {
                dVar3.v1(i26 == 1073741824, i27 == 1073741824);
            }
        } else {
            z11 = false;
            i21 = 0;
        }
        if (z11 && i21 == 2) {
            return 0;
        }
        int P1 = dVar.P1();
        if (size > 0) {
            b(dVar);
        }
        e(dVar);
        int size2 = bVar.f8237a.size();
        if (size > 0) {
            c(dVar, "First pass", 0, a02, z14);
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour C2 = dVar.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z19 = C2 == dimensionBehaviour2;
            boolean z21 = dVar.X() == dimensionBehaviour2;
            int max = Math.max(dVar.a0(), bVar.f8239c.L());
            int max2 = Math.max(dVar.z(), bVar.f8239c.K());
            int i29 = 0;
            boolean z22 = false;
            while (i29 < size2) {
                ConstraintWidget constraintWidget2 = bVar.f8237a.get(i29);
                if (!(constraintWidget2 instanceof i)) {
                    i24 = P1;
                } else {
                    int a03 = constraintWidget2.a0();
                    int z23 = constraintWidget2.z();
                    i24 = P1;
                    boolean a11 = bVar.a(O1, constraintWidget2, a.f8240l) | z22;
                    int a04 = constraintWidget2.a0();
                    boolean z24 = a11;
                    int z25 = constraintWidget2.z();
                    if (a04 != a03) {
                        constraintWidget2.q1(a04);
                        if (z19 && constraintWidget2.P() > max) {
                            max = Math.max(max, constraintWidget2.P() + constraintWidget2.q(ConstraintAnchor.Type.RIGHT).f());
                        }
                        z13 = true;
                    } else {
                        z13 = z24;
                    }
                    if (z25 != z23) {
                        constraintWidget2.R0(z25);
                        if (z21 && constraintWidget2.t() > max2) {
                            max2 = Math.max(max2, constraintWidget2.t() + constraintWidget2.q(ConstraintAnchor.Type.BOTTOM).f());
                        }
                        z13 = true;
                    }
                    z22 = z13 | ((i) constraintWidget2).F1();
                }
                i29++;
                d dVar4 = dVar;
                P1 = i24;
            }
            int i31 = P1;
            int i32 = 0;
            int i33 = 2;
            while (i32 < i33) {
                int i34 = 0;
                while (i34 < size2) {
                    ConstraintWidget constraintWidget3 = bVar.f8237a.get(i34);
                    if ((!(constraintWidget3 instanceof m2.a) || (constraintWidget3 instanceof i)) && !(constraintWidget3 instanceof f) && constraintWidget3.Z() != 8 && ((!z18 || !constraintWidget3.f8176e.f8231e.j || !constraintWidget3.f8178f.f8231e.j) && !(constraintWidget3 instanceof i))) {
                        int a05 = constraintWidget3.a0();
                        int z26 = constraintWidget3.z();
                        z12 = z18;
                        int r11 = constraintWidget3.r();
                        int i35 = a.f8240l;
                        i23 = size2;
                        if (i32 == 1) {
                            i35 = a.f8241m;
                        }
                        boolean a12 = bVar.a(O1, constraintWidget3, i35) | z22;
                        int a06 = constraintWidget3.a0();
                        int z27 = constraintWidget3.z();
                        if (a06 != a05) {
                            constraintWidget3.q1(a06);
                            if (z19 && constraintWidget3.P() > max) {
                                max = Math.max(max, constraintWidget3.P() + constraintWidget3.q(ConstraintAnchor.Type.RIGHT).f());
                            }
                            a12 = true;
                        }
                        if (z27 != z26) {
                            constraintWidget3.R0(z27);
                            if (z21 && constraintWidget3.t() > max2) {
                                max2 = Math.max(max2, constraintWidget3.t() + constraintWidget3.q(ConstraintAnchor.Type.BOTTOM).f());
                            }
                            a12 = true;
                        }
                        z22 = (!constraintWidget3.d0() || r11 == constraintWidget3.r()) ? a12 : true;
                    } else {
                        z12 = z18;
                        i23 = size2;
                    }
                    i34++;
                    bVar = this;
                    z18 = z12;
                    size2 = i23;
                }
                boolean z28 = z18;
                int i36 = size2;
                if (!z22) {
                    break;
                }
                i32++;
                c(dVar, "intermediate pass", i32, a02, z14);
                bVar = this;
                z18 = z28;
                size2 = i36;
                i33 = 2;
                z22 = false;
            }
            dVar2 = dVar;
            i22 = i31;
        } else {
            dVar2 = dVar;
            i22 = P1;
        }
        dVar2.c2(i22);
        return 0;
    }

    public void e(d dVar) {
        this.f8237a.clear();
        int size = dVar.V0.size();
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = dVar.V0.get(i11);
            ConstraintWidget.DimensionBehaviour C = constraintWidget.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (C == dimensionBehaviour || constraintWidget.X() == dimensionBehaviour) {
                this.f8237a.add(constraintWidget);
            }
        }
        dVar.S1();
    }
}
