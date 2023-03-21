package f1;

import i1.m;
import kotlin.jvm.internal.p;

/* compiled from: HitPathTracker.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final m f14486a;

    /* renamed from: b  reason: collision with root package name */
    private final l f14487b = new l();

    public g(m mVar) {
        p.j(mVar, "rootCoordinates");
        this.f14486a = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r12, java.util.List<? extends f1.b0> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "pointerInputFilters"
            kotlin.jvm.internal.p.j(r14, r0)
            f1.l r0 = r11.f14487b
            int r1 = r14.size()
            r2 = 0
            r3 = 1
            r4 = 0
        L_0x000e:
            if (r4 >= r1) goto L_0x007a
            java.lang.Object r5 = r14.get(r4)
            f1.b0 r5 = (f1.b0) r5
            if (r3 == 0) goto L_0x005f
            f0.e r6 = r0.g()
            int r7 = r6.m()
            if (r7 <= 0) goto L_0x003b
            java.lang.Object[] r6 = r6.l()
            r8 = 0
        L_0x0027:
            r9 = r6[r8]
            r10 = r9
            f1.k r10 = (f1.k) r10
            f1.b0 r10 = r10.k()
            boolean r10 = kotlin.jvm.internal.p.e(r10, r5)
            if (r10 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x0027
        L_0x003b:
            r9 = 0
        L_0x003c:
            f1.k r9 = (f1.k) r9
            if (r9 == 0) goto L_0x005e
            r9.m()
            f0.e r0 = r9.j()
            f1.u r5 = f1.u.a(r12)
            boolean r0 = r0.h(r5)
            if (r0 != 0) goto L_0x005c
            f0.e r0 = r9.j()
            f1.u r5 = f1.u.a(r12)
            r0.b(r5)
        L_0x005c:
            r0 = r9
            goto L_0x0077
        L_0x005e:
            r3 = 0
        L_0x005f:
            f1.k r6 = new f1.k
            r6.<init>(r5)
            f0.e r5 = r6.j()
            f1.u r7 = f1.u.a(r12)
            r5.b(r7)
            f0.e r0 = r0.g()
            r0.b(r6)
            r0 = r6
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.g.a(long, java.util.List):void");
    }

    public final boolean b(h hVar, boolean z11) {
        p.j(hVar, "internalPointerEvent");
        if (!this.f14487b.a(hVar.a(), this.f14486a, hVar, z11)) {
            return false;
        }
        boolean f11 = this.f14487b.f(hVar.a(), this.f14486a, hVar, z11);
        if (this.f14487b.e(hVar) || f11) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.f14487b.d();
        this.f14487b.c();
    }

    public final void d() {
        this.f14487b.h();
    }
}
