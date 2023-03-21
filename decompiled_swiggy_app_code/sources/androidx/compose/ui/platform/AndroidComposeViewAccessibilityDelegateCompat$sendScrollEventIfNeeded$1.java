package androidx.compose.ui.platform;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c1 f7034a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f7035b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1(c1 c1Var, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.f7034a = c1Var;
        this.f7035b = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r3 == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r14 = this;
            androidx.compose.ui.platform.c1 r0 = r14.f7034a
            n1.h r0 = r0.a()
            androidx.compose.ui.platform.c1 r1 = r14.f7034a
            n1.h r1 = r1.e()
            androidx.compose.ui.platform.c1 r2 = r14.f7034a
            java.lang.Float r2 = r2.b()
            androidx.compose.ui.platform.c1 r3 = r14.f7034a
            java.lang.Float r3 = r3.c()
            r4 = 0
            if (r0 == 0) goto L_0x0031
            if (r2 == 0) goto L_0x0031
            lp0.a r5 = r0.c()
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r2 = r2.floatValue()
            float r5 = r5 - r2
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r1 == 0) goto L_0x004a
            if (r3 == 0) goto L_0x004a
            lp0.a r2 = r1.c()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            float r2 = r2 - r3
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r3 = 0
            r6 = 1
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0053
            r7 = 1
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            if (r7 == 0) goto L_0x005d
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x005b
            r3 = 1
        L_0x005b:
            if (r3 != 0) goto L_0x00dd
        L_0x005d:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = r14.f7035b
            androidx.compose.ui.platform.c1 r4 = r14.f7034a
            int r4 = r4.d()
            int r3 = r3.c0(r4)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r7 = r14.f7035b
            r9 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r11 = 0
            r12 = 8
            r13 = 0
            r8 = r3
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.f0(r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r14.f7035b
            r6 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r3 = r4.C(r3, r6)
            if (r0 == 0) goto L_0x00a7
            lp0.a r4 = r0.c()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setScrollX(r4)
            lp0.a r4 = r0.a()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setMaxScrollX(r4)
        L_0x00a7:
            if (r1 == 0) goto L_0x00cd
            lp0.a r4 = r1.c()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setScrollY(r4)
            lp0.a r4 = r1.a()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setMaxScrollY(r4)
        L_0x00cd:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 < r6) goto L_0x00d8
            int r4 = (int) r5
            int r2 = (int) r2
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.c.a(r3, r4, r2)
        L_0x00d8:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = r14.f7035b
            boolean unused = r2.d0(r3)
        L_0x00dd:
            if (r0 == 0) goto L_0x00ee
            androidx.compose.ui.platform.c1 r2 = r14.f7034a
            lp0.a r0 = r0.c()
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r2.g(r0)
        L_0x00ee:
            if (r1 == 0) goto L_0x00ff
            androidx.compose.ui.platform.c1 r0 = r14.f7034a
            lp0.a r1 = r1.c()
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.h(r1)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1.invoke():void");
    }
}
