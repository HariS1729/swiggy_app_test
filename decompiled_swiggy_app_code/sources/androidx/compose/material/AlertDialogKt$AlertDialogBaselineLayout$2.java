package androidx.compose.material;

import i1.i;
import i1.j;
import i1.t;
import java.util.List;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogBaselineLayout$2 implements t {

    /* renamed from: a  reason: collision with root package name */
    public static final AlertDialogKt$AlertDialogBaselineLayout$2 f4807a = new AlertDialogKt$AlertDialogBaselineLayout$2();

    AlertDialogKt$AlertDialogBaselineLayout$2() {
    }

    public int a(j jVar, List<? extends i> list, int i11) {
        return t.a.a(this, jVar, list, i11);
    }

    public int b(j jVar, List<? extends i> list, int i11) {
        return t.a.c(this, jVar, list, i11);
    }

    public int c(j jVar, List<? extends i> list, int i11) {
        return t.a.d(this, jVar, list, i11);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i1.u d(i1.w r12, java.util.List<? extends i1.r> r13, long r14) {
        /*
            r11 = this;
            java.lang.String r0 = "$this$Layout"
            kotlin.jvm.internal.p.j(r12, r0)
            java.lang.String r0 = "measurables"
            kotlin.jvm.internal.p.j(r13, r0)
            java.util.Iterator r0 = r13.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()
            r3 = r1
            i1.r r3 = (i1.r) r3
            java.lang.Object r3 = androidx.compose.ui.layout.LayoutIdKt.a(r3)
            java.lang.String r4 = "title"
            boolean r3 = kotlin.jvm.internal.p.e(r3, r4)
            if (r3 == 0) goto L_0x000e
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            i1.r r1 = (i1.r) r1
            if (r1 != 0) goto L_0x0030
            r0 = r2
            goto L_0x0040
        L_0x0030:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 11
            r10 = 0
            r3 = r14
            long r3 = d2.b.e(r3, r5, r6, r7, r8, r9, r10)
            i1.e0 r0 = r1.N(r3)
        L_0x0040:
            java.util.Iterator r13 = r13.iterator()
        L_0x0044:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x005e
            java.lang.Object r1 = r13.next()
            r3 = r1
            i1.r r3 = (i1.r) r3
            java.lang.Object r3 = androidx.compose.ui.layout.LayoutIdKt.a(r3)
            java.lang.String r4 = "text"
            boolean r3 = kotlin.jvm.internal.p.e(r3, r4)
            if (r3 == 0) goto L_0x0044
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            i1.r r1 = (i1.r) r1
            if (r1 != 0) goto L_0x0065
            r13 = r2
            goto L_0x0075
        L_0x0065:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 11
            r10 = 0
            r3 = r14
            long r13 = d2.b.e(r3, r5, r6, r7, r8, r9, r10)
            i1.e0 r13 = r1.N(r13)
        L_0x0075:
            r14 = 0
            if (r0 != 0) goto L_0x007a
            r15 = 0
            goto L_0x007e
        L_0x007a:
            int r15 = r0.A0()
        L_0x007e:
            if (r13 != 0) goto L_0x0082
            r1 = 0
            goto L_0x008e
        L_0x0082:
            int r1 = r13.A0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
        L_0x008e:
            int r4 = java.lang.Math.max(r15, r1)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0098
        L_0x0096:
            r1 = 0
            goto L_0x00b7
        L_0x0098:
            i1.h r1 = androidx.compose.ui.layout.AlignmentLineKt.a()
            int r1 = r0.A(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            if (r1 != r15) goto L_0x00ac
            r1 = r2
            goto L_0x00b0
        L_0x00ac:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x00b0:
            if (r1 != 0) goto L_0x00b3
            goto L_0x0096
        L_0x00b3:
            int r1 = r1.intValue()
        L_0x00b7:
            if (r0 != 0) goto L_0x00bb
        L_0x00b9:
            r3 = 0
            goto L_0x00da
        L_0x00bb:
            i1.h r3 = androidx.compose.ui.layout.AlignmentLineKt.b()
            int r3 = r0.A(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
            if (r3 != r15) goto L_0x00cf
            r3 = r2
            goto L_0x00d3
        L_0x00cf:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x00d3:
            if (r3 != 0) goto L_0x00d6
            goto L_0x00b9
        L_0x00d6:
            int r3 = r3.intValue()
        L_0x00da:
            long r5 = androidx.compose.material.AlertDialogKt.f4804c
            int r5 = r12.y0(r5)
            int r5 = r5 - r1
            if (r13 != 0) goto L_0x00e7
        L_0x00e5:
            r15 = 0
            goto L_0x00fd
        L_0x00e7:
            i1.h r1 = androidx.compose.ui.layout.AlignmentLineKt.a()
            int r1 = r13.A(r1)
            if (r1 != r15) goto L_0x00f2
            goto L_0x00f6
        L_0x00f2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x00f6:
            if (r2 != 0) goto L_0x00f9
            goto L_0x00e5
        L_0x00f9:
            int r15 = r2.intValue()
        L_0x00fd:
            if (r0 != 0) goto L_0x0108
            long r1 = androidx.compose.material.AlertDialogKt.f4806e
            int r1 = r12.y0(r1)
            goto L_0x0110
        L_0x0108:
            long r1 = androidx.compose.material.AlertDialogKt.f4805d
            int r1 = r12.y0(r1)
        L_0x0110:
            if (r0 != 0) goto L_0x0114
            r2 = 0
            goto L_0x0119
        L_0x0114:
            int r2 = r0.e0()
            int r2 = r2 + r5
        L_0x0119:
            if (r0 != 0) goto L_0x011e
            int r6 = r1 - r15
            goto L_0x0127
        L_0x011e:
            if (r3 != 0) goto L_0x0123
            int r6 = r2 - r15
            goto L_0x0126
        L_0x0123:
            int r6 = r5 + r3
            int r6 = r6 - r15
        L_0x0126:
            int r6 = r6 + r1
        L_0x0127:
            if (r13 != 0) goto L_0x012a
            goto L_0x0143
        L_0x012a:
            if (r3 != 0) goto L_0x0133
            int r14 = r13.e0()
            int r14 = r14 + r1
            int r14 = r14 - r15
            goto L_0x0143
        L_0x0133:
            int r7 = r13.e0()
            int r7 = r7 + r1
            int r7 = r7 - r15
            if (r0 != 0) goto L_0x013c
            goto L_0x0140
        L_0x013c:
            int r14 = r0.e0()
        L_0x0140:
            int r14 = r14 - r3
            int r7 = r7 - r14
            r14 = r7
        L_0x0143:
            int r14 = r14 + r2
            r15 = 0
            androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 r7 = new androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
            r7.<init>(r0, r5, r13, r6)
            r8 = 4
            r9 = 0
            r3 = r12
            r5 = r14
            r6 = r15
            i1.u r12 = i1.v.b(r3, r4, r5, r6, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2.d(i1.w, java.util.List, long):i1.u");
    }

    public int e(j jVar, List<? extends i> list, int i11) {
        return t.a.b(this, jVar, list, i11);
    }
}
