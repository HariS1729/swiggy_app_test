package androidx.compose.animation;

import i1.i;
import i1.j;
import i1.t;
import java.util.List;
import kotlin.jvm.internal.p;
import p.c;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedEnterExitMeasurePolicy implements t {

    /* renamed from: a  reason: collision with root package name */
    private final c f2457a;

    public AnimatedEnterExitMeasurePolicy(c cVar) {
        p.j(cVar, "scope");
        this.f2457a = cVar;
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.v(SequencesKt___SequencesKt.s(s.N(list), new AnimatedEnterExitMeasurePolicy$maxIntrinsicHeight$1(i11)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.v(SequencesKt___SequencesKt.s(s.N(list), new AnimatedEnterExitMeasurePolicy$minIntrinsicHeight$1(i11)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.v(SequencesKt___SequencesKt.s(s.N(list), new AnimatedEnterExitMeasurePolicy$minIntrinsicWidth$1(i11)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: i1.e0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i1.u d(i1.w r10, java.util.List<? extends i1.r> r11, long r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$receiver"
            kotlin.jvm.internal.p.j(r10, r0)
            java.lang.String r0 = "measurables"
            kotlin.jvm.internal.p.j(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.l.u(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x0019:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r11.next()
            i1.r r1 = (i1.r) r1
            i1.e0 r1 = r1.N(r12)
            r0.add(r1)
            goto L_0x0019
        L_0x002d:
            boolean r11 = r0.isEmpty()
            r12 = 0
            r13 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0038
            r11 = r12
            goto L_0x0060
        L_0x0038:
            java.lang.Object r11 = r0.get(r1)
            r2 = r11
            i1.e0 r2 = (i1.e0) r2
            int r2 = r2.A0()
            int r3 = kotlin.collections.k.l(r0)
            if (r13 > r3) goto L_0x0060
            r4 = 1
        L_0x004a:
            int r5 = r4 + 1
            java.lang.Object r6 = r0.get(r4)
            r7 = r6
            i1.e0 r7 = (i1.e0) r7
            int r7 = r7.A0()
            if (r2 >= r7) goto L_0x005b
            r11 = r6
            r2 = r7
        L_0x005b:
            if (r4 != r3) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r4 = r5
            goto L_0x004a
        L_0x0060:
            i1.e0 r11 = (i1.e0) r11
            if (r11 != 0) goto L_0x0066
            r3 = 0
            goto L_0x006b
        L_0x0066:
            int r11 = r11.A0()
            r3 = r11
        L_0x006b:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L_0x0072
            goto L_0x009a
        L_0x0072:
            java.lang.Object r11 = r0.get(r1)
            r12 = r11
            i1.e0 r12 = (i1.e0) r12
            int r12 = r12.e0()
            int r2 = kotlin.collections.k.l(r0)
            if (r13 > r2) goto L_0x0099
        L_0x0083:
            int r4 = r13 + 1
            java.lang.Object r5 = r0.get(r13)
            r6 = r5
            i1.e0 r6 = (i1.e0) r6
            int r6 = r6.e0()
            if (r12 >= r6) goto L_0x0094
            r11 = r5
            r12 = r6
        L_0x0094:
            if (r13 != r2) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r13 = r4
            goto L_0x0083
        L_0x0099:
            r12 = r11
        L_0x009a:
            i1.e0 r12 = (i1.e0) r12
            if (r12 != 0) goto L_0x00a0
            r4 = 0
            goto L_0x00a5
        L_0x00a0:
            int r1 = r12.e0()
            r4 = r1
        L_0x00a5:
            p.c r11 = r9.f2457a
            e0.h0 r11 = r11.a()
            long r12 = d2.q.a(r3, r4)
            d2.p r12 = d2.p.b(r12)
            r11.setValue(r12)
            r5 = 0
            androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1 r6 = new androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            r6.<init>(r0)
            r7 = 4
            r8 = 0
            r2 = r10
            i1.u r10 = i1.v.b(r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedEnterExitMeasurePolicy.d(i1.w, java.util.List, long):i1.u");
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        p.j(jVar, "<this>");
        p.j(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.v(SequencesKt___SequencesKt.s(s.N(list), new AnimatedEnterExitMeasurePolicy$maxIntrinsicWidth$1(i11)));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
