package f1;

import androidx.compose.ui.node.LayoutNode;
import k1.c;
import kotlin.jvm.internal.p;

/* compiled from: PointerInputEventProcessor.kt */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final LayoutNode f14558a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14559b;

    /* renamed from: c  reason: collision with root package name */
    private final w f14560c = new w();

    /* renamed from: d  reason: collision with root package name */
    private final c<b0> f14561d = new c<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f14562e;

    public z(LayoutNode layoutNode) {
        p.j(layoutNode, "root");
        this.f14558a = layoutNode;
        this.f14559b = new g(layoutNode.d());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0059 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(f1.x r18, f1.h0 r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "pointerEvent"
            kotlin.jvm.internal.p.j(r0, r3)
            java.lang.String r3 = "positionCalculator"
            kotlin.jvm.internal.p.j(r2, r3)
            boolean r3 = r1.f14562e
            r4 = 0
            if (r3 == 0) goto L_0x001a
            int r0 = f1.a0.a(r4, r4)
            return r0
        L_0x001a:
            r3 = 1
            r1.f14562e = r3     // Catch:{ all -> 0x0107 }
            f1.w r5 = r1.f14560c     // Catch:{ all -> 0x0107 }
            f1.h r0 = r5.b(r0, r2)     // Catch:{ all -> 0x0107 }
            java.util.Map r2 = r0.a()     // Catch:{ all -> 0x0107 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0107 }
            boolean r5 = r2 instanceof java.util.Collection     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0037
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0037
        L_0x0035:
            r2 = 0
            goto L_0x005a
        L_0x0037:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0107 }
        L_0x003b:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0035
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0107 }
            f1.v r5 = (f1.v) r5     // Catch:{ all -> 0x0107 }
            boolean r6 = r5.g()     // Catch:{ all -> 0x0107 }
            if (r6 != 0) goto L_0x0056
            boolean r5 = r5.i()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r5 = 0
            goto L_0x0057
        L_0x0056:
            r5 = 1
        L_0x0057:
            if (r5 == 0) goto L_0x003b
            r2 = 1
        L_0x005a:
            if (r2 != 0) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            java.util.Map r5 = r0.a()     // Catch:{ all -> 0x0107 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x0107 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0107 }
        L_0x006b:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0107 }
            if (r6 == 0) goto L_0x00b7
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0107 }
            f1.v r6 = (f1.v) r6     // Catch:{ all -> 0x0107 }
            if (r2 != 0) goto L_0x007f
            boolean r7 = f1.o.b(r6)     // Catch:{ all -> 0x0107 }
            if (r7 == 0) goto L_0x006b
        L_0x007f:
            int r7 = r6.k()     // Catch:{ all -> 0x0107 }
            f1.g0$a r8 = f1.g0.f14488a     // Catch:{ all -> 0x0107 }
            int r8 = r8.d()     // Catch:{ all -> 0x0107 }
            boolean r13 = f1.g0.g(r7, r8)     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.node.LayoutNode r9 = r1.f14558a     // Catch:{ all -> 0x0107 }
            long r10 = r6.f()     // Catch:{ all -> 0x0107 }
            k1.c<f1.b0> r12 = r1.f14561d     // Catch:{ all -> 0x0107 }
            r14 = 0
            r15 = 8
            r16 = 0
            androidx.compose.ui.node.LayoutNode.E0(r9, r10, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0107 }
            k1.c<f1.b0> r7 = r1.f14561d     // Catch:{ all -> 0x0107 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0107 }
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x006b
            f1.g r7 = r1.f14559b     // Catch:{ all -> 0x0107 }
            long r8 = r6.e()     // Catch:{ all -> 0x0107 }
            k1.c<f1.b0> r6 = r1.f14561d     // Catch:{ all -> 0x0107 }
            r7.a(r8, r6)     // Catch:{ all -> 0x0107 }
            k1.c<f1.b0> r6 = r1.f14561d     // Catch:{ all -> 0x0107 }
            r6.clear()     // Catch:{ all -> 0x0107 }
            goto L_0x006b
        L_0x00b7:
            f1.g r2 = r1.f14559b     // Catch:{ all -> 0x0107 }
            r2.d()     // Catch:{ all -> 0x0107 }
            f1.g r2 = r1.f14559b     // Catch:{ all -> 0x0107 }
            r5 = r20
            boolean r2 = r2.b(r0, r5)     // Catch:{ all -> 0x0107 }
            boolean r5 = r0.c()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00cc
        L_0x00ca:
            r3 = 0
            goto L_0x0100
        L_0x00cc:
            java.util.Map r0 = r0.a()     // Catch:{ all -> 0x0107 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0107 }
            boolean r5 = r0 instanceof java.util.Collection     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00df
            boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00df
            goto L_0x00ca
        L_0x00df:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0107 }
        L_0x00e3:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00ca
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0107 }
            f1.v r5 = (f1.v) r5     // Catch:{ all -> 0x0107 }
            boolean r6 = f1.o.j(r5)     // Catch:{ all -> 0x0107 }
            if (r6 == 0) goto L_0x00fd
            boolean r5 = r5.m()     // Catch:{ all -> 0x0107 }
            if (r5 == 0) goto L_0x00fd
            r5 = 1
            goto L_0x00fe
        L_0x00fd:
            r5 = 0
        L_0x00fe:
            if (r5 == 0) goto L_0x00e3
        L_0x0100:
            int r0 = f1.a0.a(r2, r3)     // Catch:{ all -> 0x0107 }
            r1.f14562e = r4
            return r0
        L_0x0107:
            r0 = move-exception
            r1.f14562e = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.z.a(f1.x, f1.h0, boolean):int");
    }

    public final void b() {
        this.f14560c.a();
        this.f14559b.c();
    }
}
