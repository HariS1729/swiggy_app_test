package androidx.compose.ui.viewinterop;

import android.view.View;
import bp0.k;
import e1.b;
import fp0.c;
import lp0.l;

/* compiled from: AndroidView.android.kt */
public final class AndroidView_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final l<View, k> f7733a = AndroidView_androidKt$NoOpUpdate$1.f7760a;

    /* compiled from: AndroidView.android.kt */
    public static final class a implements b {
        a() {
        }

        public /* synthetic */ long a(long j, long j11, int i11) {
            return e1.a.b(this, j, j11, i11);
        }

        public /* synthetic */ Object c(long j, c cVar) {
            return e1.a.c(this, j, cVar);
        }

        public /* synthetic */ Object d(long j, long j11, c cVar) {
            return e1.a.a(this, j, j11, cVar);
        }

        public /* synthetic */ long e(long j, int i11) {
            return e1.a.d(this, j, i11);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> void a(lp0.l<? super android.content.Context, ? extends T> r17, p0.d r18, lp0.l<? super T, bp0.k> r19, e0.g r20, int r21, int r22) {
        /*
            r8 = r17
            r9 = r21
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.p.j(r8, r0)
            r0 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            r1 = r20
            e0.g r10 = r1.t(r0)
            r0 = r22 & 1
            if (r0 == 0) goto L_0x0019
            r0 = r9 | 6
            goto L_0x0029
        L_0x0019:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x0028
            boolean r0 = r10.k(r8)
            if (r0 == 0) goto L_0x0025
            r0 = 4
            goto L_0x0026
        L_0x0025:
            r0 = 2
        L_0x0026:
            r0 = r0 | r9
            goto L_0x0029
        L_0x0028:
            r0 = r9
        L_0x0029:
            r1 = r22 & 2
            if (r1 == 0) goto L_0x0030
            r0 = r0 | 48
            goto L_0x0043
        L_0x0030:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0043
            r2 = r18
            boolean r3 = r10.k(r2)
            if (r3 == 0) goto L_0x003f
            r3 = 32
            goto L_0x0041
        L_0x003f:
            r3 = 16
        L_0x0041:
            r0 = r0 | r3
            goto L_0x0045
        L_0x0043:
            r2 = r18
        L_0x0045:
            r3 = r22 & 4
            if (r3 == 0) goto L_0x004c
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x005f
            r4 = r19
            boolean r5 = r10.k(r4)
            if (r5 == 0) goto L_0x005b
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r0 = r0 | r5
            goto L_0x0061
        L_0x005f:
            r4 = r19
        L_0x0061:
            r0 = r0 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r0 != r5) goto L_0x0074
            boolean r0 = r10.b()
            if (r0 != 0) goto L_0x006e
            goto L_0x0074
        L_0x006e:
            r10.h()
            r3 = r4
            goto L_0x01c6
        L_0x0074:
            if (r1 == 0) goto L_0x007a
            p0.d$a r0 = p0.d.f16037h0
            r11 = r0
            goto L_0x007b
        L_0x007a:
            r11 = r2
        L_0x007b:
            if (r3 == 0) goto L_0x0081
            lp0.l<android.view.View, bp0.k> r0 = f7733a
            r12 = r0
            goto L_0x0082
        L_0x0081:
            r12 = r4
        L_0x0082:
            e0.m0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r10.z(r0)
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.E(r0)
            java.lang.Object r2 = r10.F()
            e0.g$a r3 = e0.g.f14172a
            java.lang.Object r4 = r3.a()
            if (r2 != r4) goto L_0x00a7
            androidx.compose.ui.viewinterop.AndroidView_androidKt$a r2 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$a
            r2.<init>()
            r10.y(r2)
        L_0x00a7:
            r10.P()
            androidx.compose.ui.viewinterop.AndroidView_androidKt$a r2 = (androidx.compose.ui.viewinterop.AndroidView_androidKt.a) r2
            r10.E(r0)
            java.lang.Object r4 = r10.F()
            java.lang.Object r5 = r3.a()
            if (r4 != r5) goto L_0x00c1
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r4.<init>()
            r10.y(r4)
        L_0x00c1:
            r10.P()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r4
            p0.d$a r5 = p0.d.f16037h0
            p0.d r2 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.a(r5, r2, r4)
            p0.d r2 = r11.N(r2)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1 r5 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$modifierWithSemantics$1.f7759a
            r6 = 1
            p0.d r2 = androidx.compose.ui.semantics.SemanticsModifierKt.b(r2, r6, r5)
            p0.d r13 = androidx.compose.ui.ComposedModifierKt.e(r10, r2)
            e0.m0 r2 = androidx.compose.ui.platform.CompositionLocalsKt.e()
            java.lang.Object r2 = r10.z(r2)
            r14 = r2
            d2.e r14 = (d2.e) r14
            e0.m0 r2 = androidx.compose.ui.platform.CompositionLocalsKt.j()
            java.lang.Object r2 = r10.z(r2)
            r15 = r2
            androidx.compose.ui.unit.LayoutDirection r15 = (androidx.compose.ui.unit.LayoutDirection) r15
            r2 = 0
            androidx.compose.runtime.a r5 = e0.f.d(r10, r2)
            e0.m0 r6 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.b()
            java.lang.Object r6 = r10.z(r6)
            r7 = r6
            m0.b r7 = (m0.b) r7
            int r2 = e0.f.a(r10, r2)
            java.lang.String r6 = java.lang.String.valueOf(r2)
            r10.E(r0)
            java.lang.Object r0 = r10.F()
            java.lang.Object r2 = r3.a()
            if (r0 != r2) goto L_0x011e
            k1.t r0 = new k1.t
            r0.<init>()
            r10.y(r0)
        L_0x011e:
            r10.P()
            r3 = r0
            k1.t r3 = (k1.t) r3
            e0.m0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.i()
            java.lang.Object r0 = r10.z(r0)
            r2 = r0
            androidx.lifecycle.r r2 = (androidx.lifecycle.r) r2
            e0.m0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r0 = r10.z(r0)
            n3.d r0 = (n3.d) r0
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1 r8 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
            r9 = r0
            r0 = r8
            r18 = r11
            r11 = r2
            r2 = r5
            r5 = r3
            r3 = r4
            r4 = r17
            r19 = r5
            r5 = r7
            r20 = r6
            r16 = r7
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 1886828752(0x7076b8d0, float:3.0542695E29)
            r10.E(r0)
            e0.e r0 = r10.u()
            boolean r0 = r0 instanceof k1.w
            if (r0 != 0) goto L_0x0162
            e0.f.c()
        L_0x0162:
            r10.w()
            boolean r0 = r10.s()
            if (r0 == 0) goto L_0x0174
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1 r0 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
            r0.<init>(r8)
            r10.K(r0)
            goto L_0x0177
        L_0x0174:
            r10.c()
        L_0x0177:
            e0.g r0 = androidx.compose.runtime.Updater.a(r10)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
            r2 = r19
            r1.<init>(r2)
            androidx.compose.runtime.Updater.c(r0, r13, r1)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
            r1.<init>(r2)
            androidx.compose.runtime.Updater.c(r0, r14, r1)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
            r1.<init>(r2)
            androidx.compose.runtime.Updater.c(r0, r11, r1)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$4
            r1.<init>(r2)
            androidx.compose.runtime.Updater.c(r0, r9, r1)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$5
            r1.<init>(r2)
            androidx.compose.runtime.Updater.c(r0, r12, r1)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6 r1 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6
            r1.<init>(r2)
            androidx.compose.runtime.Updater.c(r0, r15, r1)
            r10.d()
            r10.P()
            r6 = r16
            if (r6 == 0) goto L_0x01c3
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3 r0 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3
            r1 = r20
            r0.<init>(r6, r1, r2)
            r2 = 8
            e0.u.a(r6, r1, r0, r10, r2)
        L_0x01c3:
            r2 = r18
            r3 = r12
        L_0x01c6:
            e0.s0 r6 = r10.v()
            if (r6 != 0) goto L_0x01cd
            goto L_0x01dc
        L_0x01cd:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4 r7 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
            r0 = r7
            r1 = r17
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.a(lp0.l, p0.d, lp0.l, e0.g, int, int):void");
    }

    public static final l<View, k> b() {
        return f7733a;
    }
}
