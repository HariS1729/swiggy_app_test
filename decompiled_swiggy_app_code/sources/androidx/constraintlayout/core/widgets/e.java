package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.d;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Flow */
public class e extends i {
    private int A1 = 0;
    private int B1 = -1;
    private int C1 = 0;
    private ArrayList<a> D1 = new ArrayList<>();
    private ConstraintWidget[] E1 = null;
    private ConstraintWidget[] F1 = null;
    private int[] G1 = null;
    /* access modifiers changed from: private */
    public ConstraintWidget[] H1;
    /* access modifiers changed from: private */
    public int I1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: k1  reason: collision with root package name */
    public int f8333k1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: l1  reason: collision with root package name */
    public int f8334l1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: m1  reason: collision with root package name */
    public int f8335m1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: n1  reason: collision with root package name */
    public int f8336n1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: o1  reason: collision with root package name */
    public int f8337o1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: p1  reason: collision with root package name */
    public int f8338p1 = -1;
    /* access modifiers changed from: private */

    /* renamed from: q1  reason: collision with root package name */
    public float f8339q1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: r1  reason: collision with root package name */
    public float f8340r1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: s1  reason: collision with root package name */
    public float f8341s1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: t1  reason: collision with root package name */
    public float f8342t1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: u1  reason: collision with root package name */
    public float f8343u1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: v1  reason: collision with root package name */
    public float f8344v1 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: w1  reason: collision with root package name */
    public int f8345w1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: x1  reason: collision with root package name */
    public int f8346x1 = 0;
    /* access modifiers changed from: private */

    /* renamed from: y1  reason: collision with root package name */
    public int f8347y1 = 2;
    /* access modifiers changed from: private */

    /* renamed from: z1  reason: collision with root package name */
    public int f8348z1 = 2;

    /* compiled from: Flow */
    private class a {

        /* renamed from: a  reason: collision with root package name */
        private int f8349a;

        /* renamed from: b  reason: collision with root package name */
        private ConstraintWidget f8350b;

        /* renamed from: c  reason: collision with root package name */
        private ConstraintAnchor f8351c;

        /* renamed from: d  reason: collision with root package name */
        private ConstraintAnchor f8352d;

        /* renamed from: e  reason: collision with root package name */
        private ConstraintAnchor f8353e;

        /* renamed from: f  reason: collision with root package name */
        private ConstraintAnchor f8354f;

        /* renamed from: g  reason: collision with root package name */
        private int f8355g;

        /* renamed from: h  reason: collision with root package name */
        private int f8356h;

        /* renamed from: i  reason: collision with root package name */
        private int f8357i;
        private int j;
        private int k;

        /* renamed from: l  reason: collision with root package name */
        private int f8358l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e f8359m;

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f8358l
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.k
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.e r5 = r0.f8359m
                int r5 = r5.I1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                androidx.constraintlayout.core.widgets.e r4 = r0.f8359m
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r4.H1
                int r5 = r0.k
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.z0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0382
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8350b
                if (r3 != 0) goto L_0x002f
                goto L_0x0382
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = 0
            L_0x0036:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.k
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                int r11 = r11.I1
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                androidx.constraintlayout.core.widgets.e r10 = r0.f8359m
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.H1
                int r11 = r0.k
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.Z()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                r6 = 0
                int r9 = r0.f8349a
                if (r9 != 0) goto L_0x020c
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r0.f8350b
                androidx.constraintlayout.core.widgets.e r10 = r0.f8359m
                int r10 = r10.f8334l1
                r9.k1(r10)
                int r10 = r0.f8356h
                if (r18 <= 0) goto L_0x0084
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                int r11 = r11.f8346x1
                int r10 = r10 + r11
            L_0x0084:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f8352d
                r11.a(r12, r10)
                if (r19 == 0) goto L_0x0096
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r9.T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8354f
                int r12 = r0.j
                r10.a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f8352d
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f8161d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.R
                r10.a(r11, r2)
            L_0x00a3:
                androidx.constraintlayout.core.widgets.e r10 = r0.f8359m
                int r10 = r10.f8348z1
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r9.d0()
                if (r10 != 0) goto L_0x00dd
                r10 = 0
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.k
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.e r14 = r0.f8359m
                int r14 = r14.I1
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                androidx.constraintlayout.core.widgets.e r13 = r0.f8359m
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r13.H1
                int r14 = r0.k
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.d0()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r9
            L_0x00de:
                r10 = 0
            L_0x00df:
                if (r10 >= r1) goto L_0x0382
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.k
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.e r15 = r0.f8359m
                int r15 = r15.I1
                if (r14 < r15) goto L_0x00f5
                goto L_0x0382
            L_0x00f5:
                androidx.constraintlayout.core.widgets.e r14 = r0.f8359m
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r14.H1
                int r15 = r0.k
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r6
            L_0x0103:
                r6 = 3
                goto L_0x0206
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8351c
                int r3 = r0.f8355g
                r14.l(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                androidx.constraintlayout.core.widgets.e r3 = r0.f8359m
                int r3 = r3.f8333k1
                r11 = 1065353216(0x3f800000, float:1.0)
                androidx.constraintlayout.core.widgets.e r13 = r0.f8359m
                float r13 = r13.f8339q1
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.k
                if (r15 != 0) goto L_0x0149
                androidx.constraintlayout.core.widgets.e r15 = r0.f8359m
                int r15 = r15.f8335m1
                if (r15 == r5) goto L_0x0149
                androidx.constraintlayout.core.widgets.e r3 = r0.f8359m
                int r3 = r3.f8335m1
                if (r17 == 0) goto L_0x0141
                androidx.constraintlayout.core.widgets.e r13 = r0.f8359m
                float r13 = r13.f8341s1
            L_0x013f:
                float r11 = r11 - r13
                goto L_0x0147
            L_0x0141:
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                float r11 = r11.f8341s1
            L_0x0147:
                r13 = r11
                goto L_0x0169
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                androidx.constraintlayout.core.widgets.e r15 = r0.f8359m
                int r15 = r15.f8337o1
                if (r15 == r5) goto L_0x0169
                androidx.constraintlayout.core.widgets.e r3 = r0.f8359m
                int r3 = r3.f8337o1
                if (r17 == 0) goto L_0x0162
                androidx.constraintlayout.core.widgets.e r13 = r0.f8359m
                float r13 = r13.f8343u1
                goto L_0x013f
            L_0x0162:
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                float r11 = r11.f8343u1
                goto L_0x0147
            L_0x0169:
                r14.T0(r3)
                r14.S0(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8353e
                int r13 = r0.f8357i
                r14.l(r3, r11, r13)
            L_0x017c:
                if (r6 == 0) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.S
                androidx.constraintlayout.core.widgets.e r13 = r0.f8359m
                int r13 = r13.f8345w1
                r3.a(r11, r13)
                if (r10 != r7) goto L_0x0194
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.Q
                int r11 = r0.f8355g
                r3.u(r11)
            L_0x0194:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r14.Q
                r3.a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.S
                int r6 = r0.f8357i
                r3.u(r6)
            L_0x01a7:
                if (r14 == r9) goto L_0x0103
                androidx.constraintlayout.core.widgets.e r3 = r0.f8359m
                int r3 = r3.f8348z1
                r6 = 3
                if (r3 != r6) goto L_0x01c8
                boolean r3 = r12.d0()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.d0()
                if (r3 == 0) goto L_0x01c8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.U
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.U
                r3.a(r11, r2)
                goto L_0x0206
            L_0x01c8:
                androidx.constraintlayout.core.widgets.e r3 = r0.f8359m
                int r3 = r3.f8348z1
                if (r3 == 0) goto L_0x01ff
                r11 = 1
                if (r3 == r11) goto L_0x01f7
                if (r4 == 0) goto L_0x01e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8352d
                int r13 = r0.f8356h
                r3.a(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8354f
                int r13 = r0.j
                r3.a(r11, r13)
                goto L_0x0206
            L_0x01e8:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.R
                r3.a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.T
                r3.a(r11, r2)
                goto L_0x0206
            L_0x01f7:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.T
                r3.a(r11, r2)
                goto L_0x0206
            L_0x01ff:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.R
                r3.a(r11, r2)
            L_0x0206:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto L_0x00df
            L_0x020c:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f8350b
                androidx.constraintlayout.core.widgets.e r9 = r0.f8359m
                int r9 = r9.f8333k1
                r3.T0(r9)
                int r9 = r0.f8355g
                if (r18 <= 0) goto L_0x0222
                androidx.constraintlayout.core.widgets.e r10 = r0.f8359m
                int r10 = r10.f8345w1
                int r9 = r9 + r10
            L_0x0222:
                if (r17 == 0) goto L_0x0244
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8353e
                r10.a(r11, r9)
                if (r19 == 0) goto L_0x0236
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f8351c
                int r11 = r0.f8357i
                r9.a(r10, r11)
            L_0x0236:
                if (r18 <= 0) goto L_0x0263
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f8353e
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.f8161d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.S
                r9.a(r10, r2)
                goto L_0x0263
            L_0x0244:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8351c
                r10.a(r11, r9)
                if (r19 == 0) goto L_0x0256
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f8353e
                int r11 = r0.f8357i
                r9.a(r10, r11)
            L_0x0256:
                if (r18 <= 0) goto L_0x0263
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f8351c
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.f8161d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.Q
                r9.a(r10, r2)
            L_0x0263:
                r9 = 0
            L_0x0264:
                if (r9 >= r1) goto L_0x0382
                int r10 = r0.k
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                int r11 = r11.I1
                if (r10 < r11) goto L_0x0273
                goto L_0x0382
            L_0x0273:
                androidx.constraintlayout.core.widgets.e r10 = r0.f8359m
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r10.H1
                int r11 = r0.k
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0283
                r12 = 1
                goto L_0x037e
            L_0x0283:
                if (r9 != 0) goto L_0x02cf
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f8352d
                int r13 = r0.f8356h
                r10.l(r11, r12, r13)
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                int r11 = r11.f8334l1
                androidx.constraintlayout.core.widgets.e r12 = r0.f8359m
                float r12 = r12.f8340r1
                int r13 = r0.k
                if (r13 != 0) goto L_0x02b3
                androidx.constraintlayout.core.widgets.e r13 = r0.f8359m
                int r13 = r13.f8336n1
                if (r13 == r5) goto L_0x02b3
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                int r11 = r11.f8336n1
                androidx.constraintlayout.core.widgets.e r12 = r0.f8359m
                float r12 = r12.f8342t1
                goto L_0x02c9
            L_0x02b3:
                if (r19 == 0) goto L_0x02c9
                androidx.constraintlayout.core.widgets.e r13 = r0.f8359m
                int r13 = r13.f8338p1
                if (r13 == r5) goto L_0x02c9
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                int r11 = r11.f8338p1
                androidx.constraintlayout.core.widgets.e r12 = r0.f8359m
                float r12 = r12.f8344v1
            L_0x02c9:
                r10.k1(r11)
                r10.j1(r12)
            L_0x02cf:
                int r11 = r1 + -1
                if (r9 != r11) goto L_0x02dc
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f8354f
                int r13 = r0.j
                r10.l(r11, r12, r13)
            L_0x02dc:
                if (r6 == 0) goto L_0x0307
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.R
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r6.T
                androidx.constraintlayout.core.widgets.e r13 = r0.f8359m
                int r13 = r13.f8346x1
                r11.a(r12, r13)
                if (r9 != r7) goto L_0x02f4
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.R
                int r12 = r0.f8356h
                r11.u(r12)
            L_0x02f4:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.T
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r10.R
                r11.a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L_0x0307
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.T
                int r11 = r0.j
                r6.u(r11)
            L_0x0307:
                if (r10 == r3) goto L_0x037c
                r6 = 2
                if (r17 == 0) goto L_0x0339
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                int r11 = r11.f8347y1
                if (r11 == 0) goto L_0x0331
                r12 = 1
                if (r11 == r12) goto L_0x0329
                if (r11 == r6) goto L_0x031a
                goto L_0x037c
            L_0x031a:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.Q
                r6.a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.S
                r6.a(r11, r2)
                goto L_0x037c
            L_0x0329:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.Q
                r6.a(r11, r2)
                goto L_0x037c
            L_0x0331:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.S
                r6.a(r11, r2)
                goto L_0x037c
            L_0x0339:
                androidx.constraintlayout.core.widgets.e r11 = r0.f8359m
                int r11 = r11.f8347y1
                if (r11 == 0) goto L_0x0373
                r12 = 1
                if (r11 == r12) goto L_0x036b
                if (r11 == r6) goto L_0x0347
                goto L_0x037d
            L_0x0347:
                if (r4 == 0) goto L_0x035c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8351c
                int r13 = r0.f8355g
                r6.a(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f8353e
                int r13 = r0.f8357i
                r6.a(r11, r13)
                goto L_0x037d
            L_0x035c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.Q
                r6.a(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.S
                r6.a(r11, r2)
                goto L_0x037d
            L_0x036b:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.S
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.S
                r6.a(r11, r2)
                goto L_0x037d
            L_0x0373:
                r12 = 1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.Q
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.Q
                r6.a(r11, r2)
                goto L_0x037d
            L_0x037c:
                r12 = 1
            L_0x037d:
                r6 = r10
            L_0x037e:
                int r9 = r9 + 1
                goto L_0x0264
            L_0x0382:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.a.a(boolean, int, boolean):void");
        }
    }

    private void Z1(boolean z11) {
        ConstraintWidget constraintWidget;
        float f11;
        int i11;
        if (this.G1 != null && this.F1 != null && this.E1 != null) {
            for (int i12 = 0; i12 < this.I1; i12++) {
                this.H1[i12].z0();
            }
            int[] iArr = this.G1;
            int i13 = iArr[0];
            int i14 = iArr[1];
            ConstraintWidget constraintWidget2 = null;
            float f12 = this.f8339q1;
            int i15 = 0;
            while (i15 < i13) {
                if (z11) {
                    i11 = (i13 - i15) - 1;
                    f11 = 1.0f - this.f8339q1;
                } else {
                    f11 = f12;
                    i11 = i15;
                }
                ConstraintWidget constraintWidget3 = this.F1[i11];
                if (!(constraintWidget3 == null || constraintWidget3.Z() == 8)) {
                    if (i15 == 0) {
                        constraintWidget3.l(constraintWidget3.Q, this.Q, C1());
                        constraintWidget3.T0(this.f8333k1);
                        constraintWidget3.S0(f11);
                    }
                    if (i15 == i13 - 1) {
                        constraintWidget3.l(constraintWidget3.S, this.S, D1());
                    }
                    if (i15 > 0 && constraintWidget2 != null) {
                        constraintWidget3.l(constraintWidget3.Q, constraintWidget2.S, this.f8345w1);
                        constraintWidget2.l(constraintWidget2.S, constraintWidget3.Q, 0);
                    }
                    constraintWidget2 = constraintWidget3;
                }
                i15++;
                f12 = f11;
            }
            for (int i16 = 0; i16 < i14; i16++) {
                ConstraintWidget constraintWidget4 = this.E1[i16];
                if (!(constraintWidget4 == null || constraintWidget4.Z() == 8)) {
                    if (i16 == 0) {
                        constraintWidget4.l(constraintWidget4.R, this.R, E1());
                        constraintWidget4.k1(this.f8334l1);
                        constraintWidget4.j1(this.f8340r1);
                    }
                    if (i16 == i14 - 1) {
                        constraintWidget4.l(constraintWidget4.T, this.T, B1());
                    }
                    if (i16 > 0 && constraintWidget2 != null) {
                        constraintWidget4.l(constraintWidget4.R, constraintWidget2.T, this.f8346x1);
                        constraintWidget2.l(constraintWidget2.T, constraintWidget4.R, 0);
                    }
                    constraintWidget2 = constraintWidget4;
                }
            }
            for (int i17 = 0; i17 < i13; i17++) {
                for (int i18 = 0; i18 < i14; i18++) {
                    int i19 = (i18 * i13) + i17;
                    if (this.C1 == 1) {
                        i19 = (i17 * i14) + i18;
                    }
                    ConstraintWidget[] constraintWidgetArr = this.H1;
                    if (!(i19 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i19]) == null || constraintWidget.Z() == 8)) {
                        ConstraintWidget constraintWidget5 = this.F1[i17];
                        ConstraintWidget constraintWidget6 = this.E1[i18];
                        if (constraintWidget != constraintWidget5) {
                            constraintWidget.l(constraintWidget.Q, constraintWidget5.Q, 0);
                            constraintWidget.l(constraintWidget.S, constraintWidget5.S, 0);
                        }
                        if (constraintWidget != constraintWidget6) {
                            constraintWidget.l(constraintWidget.R, constraintWidget6.R, 0);
                            constraintWidget.l(constraintWidget.T, constraintWidget6.T, 0);
                        }
                    }
                }
            }
        }
    }

    public void g(d dVar, boolean z11) {
        super.g(dVar, z11);
        boolean z12 = N() != null && ((d) N()).V1();
        int i11 = this.A1;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = this.D1.size();
                int i12 = 0;
                while (i12 < size) {
                    this.D1.get(i12).a(z12, i12, i12 == size + -1);
                    i12++;
                }
            } else if (i11 == 2) {
                Z1(z12);
            } else if (i11 == 3) {
                int size2 = this.D1.size();
                int i13 = 0;
                while (i13 < size2) {
                    this.D1.get(i13).a(z12, i13, i13 == size2 + -1);
                    i13++;
                }
            }
        } else if (this.D1.size() > 0) {
            this.D1.get(0).a(z12, 0, true);
        }
        G1(false);
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.n(constraintWidget, hashMap);
        e eVar = (e) constraintWidget;
        this.f8333k1 = eVar.f8333k1;
        this.f8334l1 = eVar.f8334l1;
        this.f8335m1 = eVar.f8335m1;
        this.f8336n1 = eVar.f8336n1;
        this.f8337o1 = eVar.f8337o1;
        this.f8338p1 = eVar.f8338p1;
        this.f8339q1 = eVar.f8339q1;
        this.f8340r1 = eVar.f8340r1;
        this.f8341s1 = eVar.f8341s1;
        this.f8342t1 = eVar.f8342t1;
        this.f8343u1 = eVar.f8343u1;
        this.f8344v1 = eVar.f8344v1;
        this.f8345w1 = eVar.f8345w1;
        this.f8346x1 = eVar.f8346x1;
        this.f8347y1 = eVar.f8347y1;
        this.f8348z1 = eVar.f8348z1;
        this.A1 = eVar.A1;
        this.B1 = eVar.B1;
        this.C1 = eVar.C1;
    }
}
