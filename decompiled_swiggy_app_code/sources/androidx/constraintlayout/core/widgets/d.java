package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import com.truecaller.android.sdk.TruecallerSdkScope;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m2.c;

/* compiled from: ConstraintWidgetContainer */
public class d extends c {
    b W0 = new b(this);
    public androidx.constraintlayout.core.widgets.analyzer.d X0 = new androidx.constraintlayout.core.widgets.analyzer.d(this);
    private int Y0;
    protected b.C0027b Z0 = null;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f8307a1 = false;

    /* renamed from: b1  reason: collision with root package name */
    protected androidx.constraintlayout.core.d f8308b1 = new androidx.constraintlayout.core.d();

    /* renamed from: c1  reason: collision with root package name */
    int f8309c1;

    /* renamed from: d1  reason: collision with root package name */
    int f8310d1;

    /* renamed from: e1  reason: collision with root package name */
    int f8311e1;

    /* renamed from: f1  reason: collision with root package name */
    int f8312f1;

    /* renamed from: g1  reason: collision with root package name */
    public int f8313g1 = 0;

    /* renamed from: h1  reason: collision with root package name */
    public int f8314h1 = 0;

    /* renamed from: i1  reason: collision with root package name */
    c[] f8315i1 = new c[4];

    /* renamed from: j1  reason: collision with root package name */
    c[] f8316j1 = new c[4];

    /* renamed from: k1  reason: collision with root package name */
    public boolean f8317k1 = false;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f8318l1 = false;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f8319m1 = false;

    /* renamed from: n1  reason: collision with root package name */
    public int f8320n1 = 0;

    /* renamed from: o1  reason: collision with root package name */
    public int f8321o1 = 0;

    /* renamed from: p1  reason: collision with root package name */
    private int f8322p1 = 257;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f8323q1 = false;

    /* renamed from: r1  reason: collision with root package name */
    private boolean f8324r1 = false;

    /* renamed from: s1  reason: collision with root package name */
    private boolean f8325s1 = false;

    /* renamed from: t1  reason: collision with root package name */
    int f8326t1 = 0;

    /* renamed from: u1  reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f8327u1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f8328v1 = null;

    /* renamed from: w1  reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f8329w1 = null;

    /* renamed from: x1  reason: collision with root package name */
    private WeakReference<ConstraintAnchor> f8330x1 = null;

    /* renamed from: y1  reason: collision with root package name */
    HashSet<ConstraintWidget> f8331y1 = new HashSet<>();

    /* renamed from: z1  reason: collision with root package name */
    public b.a f8332z1 = new b.a();

    public d() {
    }

    private void D1(ConstraintWidget constraintWidget) {
        int i11 = this.f8313g1 + 1;
        c[] cVarArr = this.f8316j1;
        if (i11 >= cVarArr.length) {
            this.f8316j1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f8316j1[this.f8313g1] = new c(constraintWidget, 0, V1());
        this.f8313g1++;
    }

    private void G1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f8308b1.h(solverVariable, this.f8308b1.q(constraintAnchor), 0, 5);
    }

    private void H1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f8308b1.h(this.f8308b1.q(constraintAnchor), solverVariable, 0, 5);
    }

    private void I1(ConstraintWidget constraintWidget) {
        int i11 = this.f8314h1 + 1;
        c[] cVarArr = this.f8315i1;
        if (i11 >= cVarArr.length) {
            this.f8315i1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f8315i1[this.f8314h1] = new c(constraintWidget, 1, V1());
        this.f8314h1++;
    }

    public static boolean Y1(int i11, ConstraintWidget constraintWidget, b.C0027b bVar, b.a aVar, int i12) {
        int i13;
        int i14;
        if (bVar == null) {
            return false;
        }
        if (constraintWidget.Z() == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.f8246e = 0;
            aVar.f8247f = 0;
            return false;
        }
        aVar.f8242a = constraintWidget.C();
        aVar.f8243b = constraintWidget.X();
        aVar.f8244c = constraintWidget.a0();
        aVar.f8245d = constraintWidget.z();
        aVar.f8250i = false;
        aVar.j = i12;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f8242a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z11 = dimensionBehaviour == dimensionBehaviour2;
        boolean z12 = aVar.f8243b == dimensionBehaviour2;
        boolean z13 = z11 && constraintWidget.f8179f0 > 0.0f;
        boolean z14 = z12 && constraintWidget.f8179f0 > 0.0f;
        if (z11 && constraintWidget.e0(0) && constraintWidget.f8206w == 0 && !z13) {
            aVar.f8242a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z12 && constraintWidget.f8208x == 0) {
                aVar.f8242a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z11 = false;
        }
        if (z12 && constraintWidget.e0(1) && constraintWidget.f8208x == 0 && !z14) {
            aVar.f8243b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z11 && constraintWidget.f8206w == 0) {
                aVar.f8243b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z12 = false;
        }
        if (constraintWidget.r0()) {
            aVar.f8242a = ConstraintWidget.DimensionBehaviour.FIXED;
            z11 = false;
        }
        if (constraintWidget.s0()) {
            aVar.f8243b = ConstraintWidget.DimensionBehaviour.FIXED;
            z12 = false;
        }
        if (z13) {
            if (constraintWidget.f8210y[0] == 4) {
                aVar.f8242a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z12) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f8243b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i14 = aVar.f8245d;
                } else {
                    aVar.f8242a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.b(constraintWidget, aVar);
                    i14 = aVar.f8247f;
                }
                aVar.f8242a = dimensionBehaviour4;
                aVar.f8244c = (int) (constraintWidget.x() * ((float) i14));
            }
        }
        if (z14) {
            if (constraintWidget.f8210y[1] == 4) {
                aVar.f8243b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z11) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f8242a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i13 = aVar.f8244c;
                } else {
                    aVar.f8243b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.b(constraintWidget, aVar);
                    i13 = aVar.f8246e;
                }
                aVar.f8243b = dimensionBehaviour6;
                if (constraintWidget.y() == -1) {
                    aVar.f8245d = (int) (((float) i13) / constraintWidget.x());
                } else {
                    aVar.f8245d = (int) (constraintWidget.x() * ((float) i13));
                }
            }
        }
        bVar.b(constraintWidget, aVar);
        constraintWidget.q1(aVar.f8246e);
        constraintWidget.R0(aVar.f8247f);
        constraintWidget.Q0(aVar.f8249h);
        constraintWidget.G0(aVar.f8248g);
        aVar.j = b.a.k;
        return aVar.f8250i;
    }

    private void a2() {
        this.f8313g1 = 0;
        this.f8314h1 = 0;
    }

    /* access modifiers changed from: package-private */
    public void B1(ConstraintWidget constraintWidget, int i11) {
        if (i11 == 0) {
            D1(constraintWidget);
        } else if (i11 == 1) {
            I1(constraintWidget);
        }
    }

    public boolean C1(androidx.constraintlayout.core.d dVar) {
        boolean Z1 = Z1(64);
        g(dVar, Z1);
        int size = this.V0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = this.V0.get(i11);
            constraintWidget.Y0(0, false);
            constraintWidget.Y0(1, false);
            if (constraintWidget instanceof a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget2 = this.V0.get(i12);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).E1();
                }
            }
        }
        this.f8331y1.clear();
        for (int i13 = 0; i13 < size; i13++) {
            ConstraintWidget constraintWidget3 = this.V0.get(i13);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof i) {
                    this.f8331y1.add(constraintWidget3);
                } else {
                    constraintWidget3.g(dVar, Z1);
                }
            }
        }
        while (this.f8331y1.size() > 0) {
            int size2 = this.f8331y1.size();
            Iterator<ConstraintWidget> it2 = this.f8331y1.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                i iVar = (i) it2.next();
                if (iVar.A1(this.f8331y1)) {
                    iVar.g(dVar, Z1);
                    this.f8331y1.remove(iVar);
                    break;
                }
            }
            if (size2 == this.f8331y1.size()) {
                Iterator<ConstraintWidget> it3 = this.f8331y1.iterator();
                while (it3.hasNext()) {
                    it3.next().g(dVar, Z1);
                }
                this.f8331y1.clear();
            }
        }
        if (androidx.constraintlayout.core.d.f8042r) {
            HashSet hashSet = new HashSet();
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget4 = this.V0.get(i14);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            e(this, dVar, hashSet, C() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) it4.next();
                g.a(this, dVar, constraintWidget5);
                constraintWidget5.g(dVar, Z1);
            }
        } else {
            for (int i15 = 0; i15 < size; i15++) {
                ConstraintWidget constraintWidget6 = this.V0.get(i15);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f8171b0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.V0(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.m1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.g(dVar, Z1);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.V0(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.m1(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, dVar, constraintWidget6);
                    if (!constraintWidget6.f()) {
                        constraintWidget6.g(dVar, Z1);
                    }
                }
            }
        }
        if (this.f8313g1 > 0) {
            b.b(this, dVar, (ArrayList<ConstraintWidget>) null, 0);
        }
        if (this.f8314h1 > 0) {
            b.b(this, dVar, (ArrayList<ConstraintWidget>) null, 1);
        }
        return true;
    }

    public void E1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8330x1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f8330x1.get()).e()) {
            this.f8330x1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void F1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8328v1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f8328v1.get()).e()) {
            this.f8328v1 = new WeakReference<>(constraintAnchor);
        }
    }

    /* access modifiers changed from: package-private */
    public void J1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8329w1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f8329w1.get()).e()) {
            this.f8329w1 = new WeakReference<>(constraintAnchor);
        }
    }

    /* access modifiers changed from: package-private */
    public void K1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8327u1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > ((ConstraintAnchor) this.f8327u1.get()).e()) {
            this.f8327u1 = new WeakReference<>(constraintAnchor);
        }
    }

    public boolean L1(boolean z11) {
        return this.X0.f(z11);
    }

    public boolean M1(boolean z11) {
        return this.X0.g(z11);
    }

    public boolean N1(boolean z11, int i11) {
        return this.X0.h(z11, i11);
    }

    public b.C0027b O1() {
        return this.Z0;
    }

    public int P1() {
        return this.f8322p1;
    }

    public androidx.constraintlayout.core.d Q1() {
        return this.f8308b1;
    }

    public void R(StringBuilder sb2) {
        sb2.append(this.f8193o + ":{\n");
        sb2.append("  actualWidth:" + this.f8175d0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f8177e0);
        sb2.append("\n");
        Iterator<ConstraintWidget> it2 = x1().iterator();
        while (it2.hasNext()) {
            it2.next().R(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public boolean R1() {
        return false;
    }

    public void S1() {
        this.X0.j();
    }

    public void T1() {
        this.X0.k();
    }

    public boolean U1() {
        return this.f8325s1;
    }

    public boolean V1() {
        return this.f8307a1;
    }

    public boolean W1() {
        return this.f8324r1;
    }

    public long X1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i21 = i18;
        this.f8309c1 = i21;
        int i22 = i19;
        this.f8310d1 = i22;
        return this.W0.d(this, i11, i21, i22, i12, i13, i14, i15, i16, i17);
    }

    public boolean Z1(int i11) {
        return (this.f8322p1 & i11) == i11;
    }

    public void b2(b.C0027b bVar) {
        this.Z0 = bVar;
        this.X0.n(bVar);
    }

    public void c2(int i11) {
        this.f8322p1 = i11;
        androidx.constraintlayout.core.d.f8042r = Z1(TruecallerSdkScope.FOOTER_TYPE_MANUALLY);
    }

    public void d2(int i11) {
        this.Y0 = i11;
    }

    public void e2(boolean z11) {
        this.f8307a1 = z11;
    }

    public boolean f2(androidx.constraintlayout.core.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean Z1 = Z1(64);
        w1(dVar, Z1);
        int size = this.V0.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintWidget constraintWidget = this.V0.get(i11);
            constraintWidget.w1(dVar, Z1);
            if (constraintWidget.g0()) {
                z11 = true;
            }
        }
        return z11;
    }

    public void g2() {
        this.W0.e(this);
    }

    public void v1(boolean z11, boolean z12) {
        super.v1(z11, z12);
        int size = this.V0.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.V0.get(i11).v1(z11, z12);
        }
    }

    public void x0() {
        this.f8308b1.D();
        this.f8309c1 = 0;
        this.f8311e1 = 0;
        this.f8310d1 = 0;
        this.f8312f1 = 0;
        this.f8323q1 = false;
        super.x0();
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0312  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f8183h0 = r2
            r1.f8185i0 = r2
            r1.f8324r1 = r2
            r1.f8325s1 = r2
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r0 = r1.V0
            int r3 = r0.size()
            int r0 = r18.a0()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.z()
            int r4 = java.lang.Math.max(r2, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f8171b0
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.Y0
            if (r8 != 0) goto L_0x0088
            int r8 = r1.f8322p1
            boolean r8 = androidx.constraintlayout.core.widgets.g.b(r8, r6)
            if (r8 == 0) goto L_0x0088
            androidx.constraintlayout.core.widgets.analyzer.b$b r8 = r18.O1()
            androidx.constraintlayout.core.widgets.analyzer.f.h(r1, r8)
            r8 = 0
        L_0x003c:
            if (r8 >= r3) goto L_0x0088
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r9 = r1.V0
            java.lang.Object r9 = r9.get(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r9
            boolean r10 = r9.q0()
            if (r10 == 0) goto L_0x0085
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.f
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.a
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9 instanceof androidx.constraintlayout.core.widgets.i
            if (r10 != 0) goto L_0x0085
            boolean r10 = r9.p0()
            if (r10 != 0) goto L_0x0085
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.w(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.w(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0076
            int r10 = r9.f8206w
            if (r10 == r6) goto L_0x0076
            if (r11 != r12) goto L_0x0076
            int r10 = r9.f8208x
            if (r10 == r6) goto L_0x0076
            r10 = 1
            goto L_0x0077
        L_0x0076:
            r10 = 0
        L_0x0077:
            if (r10 != 0) goto L_0x0085
            androidx.constraintlayout.core.widgets.analyzer.b$a r10 = new androidx.constraintlayout.core.widgets.analyzer.b$a
            r10.<init>()
            androidx.constraintlayout.core.widgets.analyzer.b$b r11 = r1.Z0
            int r12 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            Y1(r2, r9, r11, r10, r12)
        L_0x0085:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0088:
            r8 = 2
            if (r3 <= r8) goto L_0x00d1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r9) goto L_0x0091
            if (r7 != r9) goto L_0x00d1
        L_0x0091:
            int r10 = r1.f8322p1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = androidx.constraintlayout.core.widgets.g.b(r10, r11)
            if (r10 == 0) goto L_0x00d1
            androidx.constraintlayout.core.widgets.analyzer.b$b r10 = r18.O1()
            boolean r10 = androidx.constraintlayout.core.widgets.analyzer.g.c(r1, r10)
            if (r10 == 0) goto L_0x00d1
            if (r5 != r9) goto L_0x00b9
            int r10 = r18.a0()
            if (r0 >= r10) goto L_0x00b5
            if (r0 <= 0) goto L_0x00b5
            r1.q1(r0)
            r1.f8324r1 = r6
            goto L_0x00b9
        L_0x00b5:
            int r0 = r18.a0()
        L_0x00b9:
            if (r7 != r9) goto L_0x00cd
            int r9 = r18.z()
            if (r4 >= r9) goto L_0x00c9
            if (r4 <= 0) goto L_0x00c9
            r1.R0(r4)
            r1.f8325s1 = r6
            goto L_0x00cd
        L_0x00c9:
            int r4 = r18.z()
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = 1
            goto L_0x00d4
        L_0x00d1:
            r9 = r4
            r4 = r0
            r0 = 0
        L_0x00d4:
            r10 = 64
            boolean r11 = r1.Z1(r10)
            if (r11 != 0) goto L_0x00e7
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.Z1(r11)
            if (r11 == 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r11 = 0
            goto L_0x00e8
        L_0x00e7:
            r11 = 1
        L_0x00e8:
            androidx.constraintlayout.core.d r12 = r1.f8308b1
            r12.f8055h = r2
            r12.f8056i = r2
            int r13 = r1.f8322p1
            if (r13 == 0) goto L_0x00f6
            if (r11 == 0) goto L_0x00f6
            r12.f8056i = r6
        L_0x00f6:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r11 = r1.V0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r12 == r13) goto L_0x0109
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r18.X()
            if (r12 != r13) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r12 = 0
            goto L_0x010a
        L_0x0109:
            r12 = 1
        L_0x010a:
            r18.a2()
            r13 = 0
        L_0x010e:
            if (r13 >= r3) goto L_0x0124
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r14 = r1.V0
            java.lang.Object r14 = r14.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            boolean r15 = r14 instanceof m2.c
            if (r15 == 0) goto L_0x0121
            m2.c r14 = (m2.c) r14
            r14.y1()
        L_0x0121:
            int r13 = r13 + 1
            goto L_0x010e
        L_0x0124:
            boolean r10 = r1.Z1(r10)
            r13 = r0
            r0 = 0
            r14 = 1
        L_0x012b:
            if (r14 == 0) goto L_0x0319
            int r15 = r0 + 1
            androidx.constraintlayout.core.d r0 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            r0.D()     // Catch:{ Exception -> 0x01dc }
            r18.a2()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.d r0 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            r1.o(r0)     // Catch:{ Exception -> 0x01dc }
            r0 = 0
        L_0x013d:
            if (r0 >= r3) goto L_0x0151
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r6 = r1.V0     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r6     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.d r2 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            r6.o(r2)     // Catch:{ Exception -> 0x01dc }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x013d
        L_0x0151:
            androidx.constraintlayout.core.d r0 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            boolean r14 = r1.C1(r0)     // Catch:{ Exception -> 0x01dc }
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f8327u1     // Catch:{ Exception -> 0x01dc }
            r2 = 0
            if (r0 == 0) goto L_0x0177
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0177
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f8327u1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.d r6 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.R     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.SolverVariable r6 = r6.q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.H1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f8327u1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x0177:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f8329w1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0196
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0196
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f8329w1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.d r6 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.T     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.SolverVariable r6 = r6.q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.G1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f8329w1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x0196:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f8328v1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01b5
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f8328v1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.d r6 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.Q     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.SolverVariable r6 = r6.q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.H1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f8328v1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x01b5:
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f8330x1     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01d4
            java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.f8330x1     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.d r6 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r1.S     // Catch:{ Exception -> 0x01dc }
            androidx.constraintlayout.core.SolverVariable r6 = r6.q(r8)     // Catch:{ Exception -> 0x01dc }
            r1.G1(r0, r6)     // Catch:{ Exception -> 0x01dc }
            r1.f8330x1 = r2     // Catch:{ Exception -> 0x01dc }
        L_0x01d4:
            if (r14 == 0) goto L_0x01f6
            androidx.constraintlayout.core.d r0 = r1.f8308b1     // Catch:{ Exception -> 0x01dc }
            r0.z()     // Catch:{ Exception -> 0x01dc }
            goto L_0x01f6
        L_0x01dc:
            r0 = move-exception
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f6:
            if (r14 == 0) goto L_0x0201
            androidx.constraintlayout.core.d r0 = r1.f8308b1
            boolean[] r2 = androidx.constraintlayout.core.widgets.g.f8364a
            boolean r0 = r1.f2(r0, r2)
            goto L_0x021a
        L_0x0201:
            androidx.constraintlayout.core.d r0 = r1.f8308b1
            r1.w1(r0, r10)
            r0 = 0
        L_0x0207:
            if (r0 >= r3) goto L_0x0219
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.V0
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            androidx.constraintlayout.core.d r6 = r1.f8308b1
            r2.w1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0207
        L_0x0219:
            r0 = 0
        L_0x021a:
            r2 = 8
            if (r12 == 0) goto L_0x028b
            if (r15 >= r2) goto L_0x028b
            boolean[] r6 = androidx.constraintlayout.core.widgets.g.f8364a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x028b
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x022a:
            if (r6 >= r3) goto L_0x0254
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r1.V0
            java.lang.Object r2 = r2.get(r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            r16 = r0
            int r0 = r2.f8183h0
            int r17 = r2.a0()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f8185i0
            int r2 = r2.z()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x022a
        L_0x0254:
            r16 = r0
            int r0 = r1.f8194o0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f8196p0
            int r2 = java.lang.Math.max(r2, r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 != r6) goto L_0x0277
            int r8 = r18.a0()
            if (r8 >= r0) goto L_0x0277
            r1.q1(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0277:
            if (r7 != r6) goto L_0x028d
            int r0 = r18.z()
            if (r0 >= r2) goto L_0x028d
            r1.R0(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x028d
        L_0x028b:
            r16 = r0
        L_0x028d:
            int r0 = r1.f8194o0
            int r2 = r18.a0()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.a0()
            if (r0 <= r2) goto L_0x02aa
            r1.q1(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02aa:
            int r0 = r1.f8196p0
            int r2 = r18.z()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.z()
            if (r0 <= r2) goto L_0x02c8
            r1.R0(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = 1
            r16 = 1
            goto L_0x02ca
        L_0x02c8:
            r6 = 1
            r2 = r13
        L_0x02ca:
            if (r2 != 0) goto L_0x0309
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            r8 = 0
            r0 = r0[r8]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x02eb
            if (r4 <= 0) goto L_0x02eb
            int r0 = r18.a0()
            if (r0 <= r4) goto L_0x02eb
            r1.f8324r1 = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r8] = r2
            r1.q1(r4)
            r2 = 1
            r16 = 1
        L_0x02eb:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0309
            if (r9 <= 0) goto L_0x0309
            int r0 = r18.z()
            if (r0 <= r9) goto L_0x0309
            r1.f8325s1 = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0[r6] = r2
            r1.R0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030e
        L_0x0309:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030e:
            if (r15 <= r0) goto L_0x0312
            r14 = 0
            goto L_0x0313
        L_0x0312:
            r14 = r2
        L_0x0313:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x012b
        L_0x0319:
            r1.V0 = r11
            if (r13 == 0) goto L_0x0325
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r1.f8171b0
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0325:
            androidx.constraintlayout.core.d r0 = r1.f8308b1
            androidx.constraintlayout.core.c r0 = r0.v()
            r1.B0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.d.y1():void");
    }

    public d(int i11, int i12) {
        super(i11, i12);
    }
}
