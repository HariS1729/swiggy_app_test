package f1;

import f0.e;
import i1.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;
import t0.f;

/* compiled from: HitPathTracker.kt */
public final class k extends l {

    /* renamed from: b  reason: collision with root package name */
    private final b0 f14505b;

    /* renamed from: c  reason: collision with root package name */
    private final e<u> f14506c = new e<>(new u[16], 0);

    /* renamed from: d  reason: collision with root package name */
    private final Map<u, v> f14507d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private m f14508e;

    /* renamed from: f  reason: collision with root package name */
    private n f14509f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14510g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14511h = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14512i = true;

    public k(b0 b0Var) {
        p.j(b0Var, "pointerInputFilter");
        this.f14505b = b0Var;
    }

    private final void i() {
        this.f14507d.clear();
        this.f14508e = null;
    }

    private final boolean l(n nVar, n nVar2) {
        if (nVar == null || nVar.c().size() != nVar2.c().size()) {
            return true;
        }
        int size = nVar2.c().size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!f.j(nVar.c().get(i11).f(), nVar2.c().get(i11).f())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.util.Map<f1.u, f1.v> r31, i1.m r32, f1.h r33, boolean r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "changes"
            kotlin.jvm.internal.p.j(r1, r4)
            java.lang.String r4 = "parentCoordinates"
            kotlin.jvm.internal.p.j(r2, r4)
            java.lang.String r4 = "internalPointerEvent"
            kotlin.jvm.internal.p.j(r3, r4)
            boolean r4 = super.a(r31, r32, r33, r34)
            f1.b0 r5 = r0.f14505b
            boolean r5 = r5.D0()
            r6 = 1
            if (r5 != 0) goto L_0x0025
            return r6
        L_0x0025:
            f1.b0 r5 = r0.f14505b
            i1.m r5 = r5.l0()
            r0.f14508e = r5
            java.util.Set r5 = r31.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0035:
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x00da
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            f1.u r9 = (f1.u) r9
            long r9 = r9.g()
            java.lang.Object r7 = r7.getValue()
            r11 = r7
            f1.v r11 = (f1.v) r11
            f0.e<f1.u> r7 = r0.f14506c
            f1.u r12 = f1.u.a(r9)
            boolean r7 = r7.h(r12)
            if (r7 == 0) goto L_0x0035
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r12 = r11.d()
            int r13 = r12.size()
        L_0x006c:
            if (r8 >= r13) goto L_0x009c
            java.lang.Object r14 = r12.get(r8)
            f1.f r14 = (f1.f) r14
            f1.f r15 = new f1.f
            long r16 = r14.b()
            i1.m r6 = r0.f14508e
            kotlin.jvm.internal.p.g(r6)
            r21 = r12
            r22 = r13
            long r12 = r14.a()
            long r18 = r6.r(r2, r12)
            r20 = 0
            r6 = r15
            r15.<init>(r16, r18, r20)
            r7.add(r6)
            int r8 = r8 + 1
            r12 = r21
            r13 = r22
            r6 = 1
            goto L_0x006c
        L_0x009c:
            java.util.Map<f1.u, f1.v> r6 = r0.f14507d
            f1.u r8 = f1.u.a(r9)
            i1.m r9 = r0.f14508e
            kotlin.jvm.internal.p.g(r9)
            long r12 = r11.h()
            long r21 = r9.r(r2, r12)
            i1.m r9 = r0.f14508e
            kotlin.jvm.internal.p.g(r9)
            long r12 = r11.f()
            long r16 = r9.r(r2, r12)
            r12 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 731(0x2db, float:1.024E-42)
            r29 = 0
            r25 = r7
            f1.v r7 = f1.v.c(r11, r12, r14, r16, r18, r19, r21, r23, r24, r25, r26, r28, r29)
            r6.put(r8, r7)
            r6 = 1
            goto L_0x0035
        L_0x00da:
            java.util.Map<f1.u, f1.v> r2 = r0.f14507d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00f0
            f0.e<f1.u> r1 = r0.f14506c
            r1.g()
            f0.e r1 = r30.g()
            r1.g()
            r2 = 1
            return r2
        L_0x00f0:
            r2 = 1
            f0.e<f1.u> r5 = r0.f14506c
            int r5 = r5.m()
            int r5 = r5 - r2
        L_0x00f8:
            r2 = -1
            if (r2 >= r5) goto L_0x011b
            f0.e<f1.u> r2 = r0.f14506c
            java.lang.Object[] r2 = r2.l()
            r2 = r2[r5]
            f1.u r2 = (f1.u) r2
            long r6 = r2.g()
            f1.u r2 = f1.u.a(r6)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L_0x0118
            f0.e<f1.u> r2 = r0.f14506c
            r2.u(r5)
        L_0x0118:
            int r5 = r5 + -1
            goto L_0x00f8
        L_0x011b:
            f1.n r1 = new f1.n
            java.util.Map<f1.u, f1.v> r2 = r0.f14507d
            java.util.Collection r2 = r2.values()
            java.util.List r2 = kotlin.collections.s.E0(r2)
            r1.<init>(r2, r3)
            java.util.List r2 = r1.c()
            int r5 = r2.size()
            r6 = 0
        L_0x0133:
            if (r6 >= r5) goto L_0x014a
            java.lang.Object r7 = r2.get(r6)
            r9 = r7
            f1.v r9 = (f1.v) r9
            long r9 = r9.e()
            boolean r9 = r3.d(r9)
            if (r9 == 0) goto L_0x0147
            goto L_0x014b
        L_0x0147:
            int r6 = r6 + 1
            goto L_0x0133
        L_0x014a:
            r7 = 0
        L_0x014b:
            f1.v r7 = (f1.v) r7
            if (r7 == 0) goto L_0x01fa
            if (r34 != 0) goto L_0x0154
            r0.f14511h = r8
            goto L_0x0176
        L_0x0154:
            boolean r2 = r0.f14511h
            if (r2 != 0) goto L_0x0176
            boolean r2 = r7.g()
            if (r2 != 0) goto L_0x0164
            boolean r2 = r7.i()
            if (r2 == 0) goto L_0x0176
        L_0x0164:
            i1.m r2 = r0.f14508e
            kotlin.jvm.internal.p.g(r2)
            long r2 = r2.a()
            boolean r2 = f1.o.e(r7, r2)
            r3 = 1
            r2 = r2 ^ r3
            r0.f14511h = r2
            goto L_0x0177
        L_0x0176:
            r3 = 1
        L_0x0177:
            boolean r2 = r0.f14511h
            boolean r5 = r0.f14510g
            if (r2 == r5) goto L_0x01ba
            int r2 = r1.f()
            f1.p$a r5 = f1.p.f14519a
            int r6 = r5.c()
            boolean r2 = f1.p.i(r2, r6)
            if (r2 != 0) goto L_0x01a9
            int r2 = r1.f()
            int r6 = r5.a()
            boolean r2 = f1.p.i(r2, r6)
            if (r2 != 0) goto L_0x01a9
            int r2 = r1.f()
            int r6 = r5.b()
            boolean r2 = f1.p.i(r2, r6)
            if (r2 == 0) goto L_0x01ba
        L_0x01a9:
            boolean r2 = r0.f14511h
            if (r2 == 0) goto L_0x01b2
            int r2 = r5.a()
            goto L_0x01b6
        L_0x01b2:
            int r2 = r5.b()
        L_0x01b6:
            r1.g(r2)
            goto L_0x01fb
        L_0x01ba:
            int r2 = r1.f()
            f1.p$a r5 = f1.p.f14519a
            int r6 = r5.a()
            boolean r2 = f1.p.i(r2, r6)
            if (r2 == 0) goto L_0x01da
            boolean r2 = r0.f14510g
            if (r2 == 0) goto L_0x01da
            boolean r2 = r0.f14512i
            if (r2 != 0) goto L_0x01da
            int r2 = r5.c()
            r1.g(r2)
            goto L_0x01fb
        L_0x01da:
            int r2 = r1.f()
            int r6 = r5.b()
            boolean r2 = f1.p.i(r2, r6)
            if (r2 == 0) goto L_0x01fb
            boolean r2 = r0.f14511h
            if (r2 == 0) goto L_0x01fb
            boolean r2 = r7.g()
            if (r2 == 0) goto L_0x01fb
            int r2 = r5.c()
            r1.g(r2)
            goto L_0x01fb
        L_0x01fa:
            r3 = 1
        L_0x01fb:
            if (r4 != 0) goto L_0x0218
            int r2 = r1.f()
            f1.p$a r4 = f1.p.f14519a
            int r4 = r4.c()
            boolean r2 = f1.p.i(r2, r4)
            if (r2 == 0) goto L_0x0218
            f1.n r2 = r0.f14509f
            boolean r2 = r0.l(r2, r1)
            if (r2 == 0) goto L_0x0216
            goto L_0x0218
        L_0x0216:
            r6 = 0
            goto L_0x0219
        L_0x0218:
            r6 = 1
        L_0x0219:
            r0.f14509f = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.k.a(java.util.Map, i1.m, f1.h, boolean):boolean");
    }

    public void b(h hVar) {
        p.j(hVar, "internalPointerEvent");
        super.b(hVar);
        n nVar = this.f14509f;
        if (nVar != null) {
            this.f14510g = this.f14511h;
            List<v> c11 = nVar.c();
            int size = c11.size();
            for (int i11 = 0; i11 < size; i11++) {
                v vVar = c11.get(i11);
                if (!vVar.g() && (!hVar.d(vVar.e()) || !this.f14511h)) {
                    this.f14506c.r(u.a(vVar.e()));
                }
            }
            this.f14511h = false;
            this.f14512i = p.i(nVar.f(), p.f14519a.b());
        }
    }

    public void d() {
        e<k> g11 = g();
        int m11 = g11.m();
        if (m11 > 0) {
            int i11 = 0;
            Object[] l11 = g11.l();
            do {
                ((k) l11[i11]).d();
                i11++;
            } while (i11 < m11);
        }
        this.f14505b.E0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r0 = g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(f1.h r8) {
        /*
            r7 = this;
            java.lang.String r0 = "internalPointerEvent"
            kotlin.jvm.internal.p.j(r8, r0)
            java.util.Map<f1.u, f1.v> r0 = r7.f14507d
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            r1 = 0
            goto L_0x004f
        L_0x0011:
            f1.b0 r0 = r7.f14505b
            boolean r0 = r0.D0()
            if (r0 != 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            f1.n r0 = r7.f14509f
            kotlin.jvm.internal.p.g(r0)
            i1.m r3 = r7.f14508e
            kotlin.jvm.internal.p.g(r3)
            long r3 = r3.a()
            f1.b0 r5 = r7.f14505b
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r5.F0(r0, r6, r3)
            f1.b0 r0 = r7.f14505b
            boolean r0 = r0.D0()
            if (r0 == 0) goto L_0x004f
            f0.e r0 = r7.g()
            int r3 = r0.m()
            if (r3 <= 0) goto L_0x004f
            java.lang.Object[] r0 = r0.l()
        L_0x0045:
            r4 = r0[r2]
            f1.k r4 = (f1.k) r4
            r4.e(r8)
            int r2 = r2 + r1
            if (r2 < r3) goto L_0x0045
        L_0x004f:
            r7.b(r8)
            r7.i()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.k.e(f1.h):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        r3 = g();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(java.util.Map<f1.u, f1.v> r9, i1.m r10, f1.h r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            kotlin.jvm.internal.p.j(r10, r9)
            java.lang.String r9 = "internalPointerEvent"
            kotlin.jvm.internal.p.j(r11, r9)
            java.util.Map<f1.u, f1.v> r9 = r8.f14507d
            boolean r9 = r9.isEmpty()
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L_0x001b
        L_0x0019:
            r10 = 0
            goto L_0x006f
        L_0x001b:
            f1.b0 r9 = r8.f14505b
            boolean r9 = r9.D0()
            if (r9 != 0) goto L_0x0024
            goto L_0x0019
        L_0x0024:
            f1.n r9 = r8.f14509f
            kotlin.jvm.internal.p.g(r9)
            i1.m r1 = r8.f14508e
            kotlin.jvm.internal.p.g(r1)
            long r1 = r1.a()
            f1.b0 r3 = r8.f14505b
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r3.F0(r9, r4, r1)
            f1.b0 r3 = r8.f14505b
            boolean r3 = r3.D0()
            if (r3 == 0) goto L_0x0060
            f0.e r3 = r8.g()
            int r4 = r3.m()
            if (r4 <= 0) goto L_0x0060
            java.lang.Object[] r3 = r3.l()
        L_0x004f:
            r5 = r3[r0]
            f1.k r5 = (f1.k) r5
            java.util.Map<f1.u, f1.v> r6 = r8.f14507d
            i1.m r7 = r8.f14508e
            kotlin.jvm.internal.p.g(r7)
            r5.f(r6, r7, r11, r12)
            int r0 = r0 + r10
            if (r0 < r4) goto L_0x004f
        L_0x0060:
            f1.b0 r11 = r8.f14505b
            boolean r11 = r11.D0()
            if (r11 == 0) goto L_0x006f
            f1.b0 r11 = r8.f14505b
            androidx.compose.ui.input.pointer.PointerEventPass r12 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r11.F0(r9, r12, r1)
        L_0x006f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.k.f(java.util.Map, i1.m, f1.h, boolean):boolean");
    }

    public final e<u> j() {
        return this.f14506c;
    }

    public final b0 k() {
        return this.f14505b;
    }

    public final void m() {
        this.f14511h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f14505b + ", children=" + g() + ", pointerIds=" + this.f14506c + ')';
    }
}
