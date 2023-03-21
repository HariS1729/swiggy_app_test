package y3;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.b0;
import androidx.transition.h0;

/* compiled from: SidePropagation */
public class d extends f {

    /* renamed from: b  reason: collision with root package name */
    private float f18018b = 3.0f;

    /* renamed from: c  reason: collision with root package name */
    private int f18019c = 80;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int h(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f18019c
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L_0x0019
            int r7 = androidx.core.view.a0.F(r7)
            if (r7 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 == 0) goto L_0x0017
        L_0x0015:
            r0 = 5
            goto L_0x0029
        L_0x0017:
            r0 = 3
            goto L_0x0029
        L_0x0019:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L_0x0029
            int r7 = androidx.core.view.a0.F(r7)
            if (r7 != r4) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0029:
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x0048
            r7 = 48
            if (r0 == r7) goto L_0x003f
            r7 = 80
            if (r0 == r7) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L_0x0059
        L_0x003f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L_0x0059
        L_0x0048:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L_0x0059
        L_0x0051:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.d.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int i(ViewGroup viewGroup) {
        int i11 = this.f18019c;
        if (i11 == 3 || i11 == 5 || i11 == 8388611 || i11 == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }

    public long c(ViewGroup viewGroup, b0 b0Var, h0 h0Var, h0 h0Var2) {
        int i11;
        int i12;
        int i13;
        h0 h0Var3 = h0Var;
        if (h0Var3 == null && h0Var2 == null) {
            return 0;
        }
        Rect C = b0Var.C();
        if (h0Var2 == null || e(h0Var3) == 0) {
            i11 = -1;
        } else {
            h0Var3 = h0Var2;
            i11 = 1;
        }
        int f11 = f(h0Var3);
        int g11 = g(h0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (C != null) {
            i13 = C.centerX();
            i12 = C.centerY();
        } else {
            i13 = (round + width) / 2;
            i12 = (round2 + height) / 2;
        }
        float h11 = ((float) h(viewGroup, f11, g11, i13, i12, round, round2, width, height)) / ((float) i(viewGroup));
        long B = b0Var.B();
        if (B < 0) {
            B = 300;
        }
        return (long) Math.round((((float) (B * ((long) i11))) / this.f18018b) * h11);
    }

    public void j(int i11) {
        this.f18019c = i11;
    }
}
