package m4;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import d4.a;
import d4.i;
import d4.j;
import e4.c;
import e4.e;
import e4.f;
import e4.g;
import java.util.List;
import l4.p;

/* compiled from: EnqueueRunnable */
public class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final String f15636c = i.f("EnqueueRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final g f15637a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15638b = new c();

    public b(g gVar) {
        this.f15637a = gVar;
    }

    private static boolean b(g gVar) {
        boolean c11 = c(gVar.i(), gVar.h(), (String[]) g.n(gVar).toArray(new String[0]), gVar.f(), gVar.d());
        gVar.m();
        return c11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e1 A[LOOP:7: B:120:0x01db->B:122:0x01e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x020a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(e4.i r19, java.util.List<? extends androidx.work.e> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.ExistingWorkPolicy r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.w()
            r7 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            l4.q r8 = r6.N()
            l4.p r8 = r8.m(r15)
            if (r8 != 0) goto L_0x0045
            d4.i r0 = d4.i.c()
            java.lang.String r1 = f15636c
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.b(r1, r2, r4)
            return r3
        L_0x0045:
            androidx.work.WorkInfo$State r8 = r8.f15494b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r8 != r15) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r8 != r15) goto L_0x0055
            r14 = 1
            goto L_0x005a
        L_0x0055:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r8 != r15) goto L_0x005a
            r13 = 1
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r8 = android.text.TextUtils.isEmpty(r22)
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x014e
            l4.q r10 = r6.N()
            java.util.List r10 = r10.q(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x014e
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.APPEND
            if (r3 == r11) goto L_0x00ca
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r3 != r11) goto L_0x0085
            goto L_0x00ca
        L_0x0085:
            androidx.work.ExistingWorkPolicy r11 = androidx.work.ExistingWorkPolicy.KEEP
            if (r3 != r11) goto L_0x00a5
            java.util.Iterator r3 = r10.iterator()
        L_0x008d:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x00a5
            java.lang.Object r11 = r3.next()
            l4.p$b r11 = (l4.p.b) r11
            androidx.work.WorkInfo$State r11 = r11.f15508b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r11 == r15) goto L_0x00a3
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.RUNNING
            if (r11 != r15) goto L_0x008d
        L_0x00a3:
            r11 = 0
            return r11
        L_0x00a5:
            r11 = 0
            m4.a r3 = m4.a.c(r2, r0, r11)
            r3.run()
            l4.q r3 = r6.N()
            java.util.Iterator r10 = r10.iterator()
        L_0x00b5:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00c7
            java.lang.Object r15 = r10.next()
            l4.p$b r15 = (l4.p.b) r15
            java.lang.String r15 = r15.f15507a
            r3.a(r15)
            goto L_0x00b5
        L_0x00c7:
            r3 = 1
            goto L_0x014f
        L_0x00ca:
            r11 = 0
            l4.b r9 = r6.F()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00d8:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0113
            java.lang.Object r16 = r10.next()
            r7 = r16
            l4.p$b r7 = (l4.p.b) r7
            java.lang.String r11 = r7.f15507a
            boolean r11 = r9.d(r11)
            if (r11 != 0) goto L_0x010c
            androidx.work.WorkInfo$State r11 = r7.f15508b
            r17 = r9
            androidx.work.WorkInfo$State r9 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r11 != r9) goto L_0x00f8
            r9 = 1
            goto L_0x00f9
        L_0x00f8:
            r9 = 0
        L_0x00f9:
            r9 = r9 & r12
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.FAILED
            if (r11 != r12) goto L_0x0100
            r14 = 1
            goto L_0x0105
        L_0x0100:
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo.State.CANCELLED
            if (r11 != r12) goto L_0x0105
            r13 = 1
        L_0x0105:
            java.lang.String r7 = r7.f15507a
            r15.add(r7)
            r12 = r9
            goto L_0x010e
        L_0x010c:
            r17 = r9
        L_0x010e:
            r9 = r17
            r7 = 1
            r11 = 0
            goto L_0x00d8
        L_0x0113:
            androidx.work.ExistingWorkPolicy r7 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r3 != r7) goto L_0x0140
            if (r13 != 0) goto L_0x011b
            if (r14 == 0) goto L_0x0140
        L_0x011b:
            l4.q r3 = r6.N()
            java.util.List r7 = r3.q(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0127:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0139
            java.lang.Object r9 = r7.next()
            l4.p$b r9 = (l4.p.b) r9
            java.lang.String r9 = r9.f15507a
            r3.a(r9)
            goto L_0x0127
        L_0x0139:
            java.util.List r15 = java.util.Collections.emptyList()
            r3 = 0
            r13 = 0
            goto L_0x0141
        L_0x0140:
            r3 = r14
        L_0x0141:
            java.lang.Object[] r1 = r15.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r7 = r1.length
            if (r7 <= 0) goto L_0x014c
            r9 = 1
            goto L_0x014d
        L_0x014c:
            r9 = 0
        L_0x014d:
            r14 = r3
        L_0x014e:
            r3 = 0
        L_0x014f:
            java.util.Iterator r7 = r20.iterator()
        L_0x0153:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0210
            java.lang.Object r10 = r7.next()
            androidx.work.e r10 = (androidx.work.e) r10
            l4.p r11 = r10.c()
            if (r9 == 0) goto L_0x017a
            if (r12 != 0) goto L_0x017a
            if (r14 == 0) goto L_0x016e
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            r11.f15494b = r15
            goto L_0x0182
        L_0x016e:
            if (r13 == 0) goto L_0x0175
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            r11.f15494b = r15
            goto L_0x0182
        L_0x0175:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.BLOCKED
            r11.f15494b = r15
            goto L_0x0182
        L_0x017a:
            boolean r15 = r11.d()
            if (r15 != 0) goto L_0x0185
            r11.n = r4
        L_0x0182:
            r17 = r4
            goto L_0x018b
        L_0x0185:
            r17 = r4
            r4 = 0
            r11.n = r4
        L_0x018b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 < r5) goto L_0x0199
            r5 = 25
            if (r4 > r5) goto L_0x0199
            g(r11)
            goto L_0x01a8
        L_0x0199:
            r5 = 22
            if (r4 > r5) goto L_0x01a8
            java.lang.String r4 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r4 = h(r0, r4)
            if (r4 == 0) goto L_0x01a8
            g(r11)
        L_0x01a8:
            androidx.work.WorkInfo$State r4 = r11.f15494b
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.ENQUEUED
            if (r4 != r5) goto L_0x01af
            r3 = 1
        L_0x01af:
            l4.q r4 = r6.N()
            r4.o(r11)
            if (r9 == 0) goto L_0x01d3
            int r4 = r1.length
            r5 = 0
        L_0x01ba:
            if (r5 >= r4) goto L_0x01d3
            r11 = r1[r5]
            l4.a r15 = new l4.a
            java.lang.String r0 = r10.a()
            r15.<init>(r0, r11)
            l4.b r0 = r6.F()
            r0.b(r15)
            int r5 = r5 + 1
            r0 = r19
            goto L_0x01ba
        L_0x01d3:
            java.util.Set r0 = r10.b()
            java.util.Iterator r0 = r0.iterator()
        L_0x01db:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01f8
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            l4.t r5 = r6.O()
            l4.s r11 = new l4.s
            java.lang.String r15 = r10.a()
            r11.<init>(r4, r15)
            r5.a(r11)
            goto L_0x01db
        L_0x01f8:
            if (r8 == 0) goto L_0x020a
            l4.k r0 = r6.L()
            l4.j r4 = new l4.j
            java.lang.String r5 = r10.a()
            r4.<init>(r2, r5)
            r0.b(r4)
        L_0x020a:
            r0 = r19
            r4 = r17
            goto L_0x0153
        L_0x0210:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.c(e4.i, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    private static boolean e(g gVar) {
        List<g> g11 = gVar.g();
        boolean z11 = false;
        if (g11 != null) {
            boolean z12 = false;
            for (g next : g11) {
                if (!next.l()) {
                    z12 |= e(next);
                } else {
                    i.c().h(f15636c, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", next.e())}), new Throwable[0]);
                }
            }
            z11 = z12;
        }
        return b(gVar) | z11;
    }

    private static void g(p pVar) {
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        a aVar = pVar.j;
        String str = pVar.f15495c;
        if (str.equals(cls.getName())) {
            return;
        }
        if (aVar.f() || aVar.i()) {
            b.a aVar2 = new b.a();
            aVar2.c(pVar.f15497e).g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f15495c = cls.getName();
            pVar.f15497e = aVar2.a();
        }
    }

    private static boolean h(e4.i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (e eVar : iVar.v()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase w11 = this.f15637a.i().w();
        w11.e();
        try {
            boolean e11 = e(this.f15637a);
            w11.C();
            return e11;
        } finally {
            w11.i();
        }
    }

    public j d() {
        return this.f15638b;
    }

    public void f() {
        e4.i i11 = this.f15637a.i();
        f.b(i11.q(), i11.w(), i11.v());
    }

    public void run() {
        try {
            if (!this.f15637a.j()) {
                if (a()) {
                    d.a(this.f15637a.i().p(), RescheduleReceiver.class, true);
                    f();
                }
                this.f15638b.b(j.f14135a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f15637a}));
        } catch (Throwable th2) {
            this.f15638b.b(new j.b.a(th2));
        }
    }
}
