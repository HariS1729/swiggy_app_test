package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import m2.b;

/* compiled from: Grouping */
public class g {
    public static m a(ConstraintWidget constraintWidget, int i11, ArrayList<m> arrayList, m mVar) {
        int i12;
        int y12;
        if (i11 == 0) {
            i12 = constraintWidget.S0;
        } else {
            i12 = constraintWidget.T0;
        }
        int i13 = 0;
        if (i12 != -1 && (mVar == null || i12 != mVar.f8278b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                m mVar2 = arrayList.get(i14);
                if (mVar2.c() == i12) {
                    if (mVar != null) {
                        mVar.g(i11, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                } else {
                    i14++;
                }
            }
        } else if (i12 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if ((constraintWidget instanceof b) && (y12 = ((b) constraintWidget).y1(i11)) != -1) {
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        break;
                    }
                    m mVar3 = arrayList.get(i15);
                    if (mVar3.c() == y12) {
                        mVar = mVar3;
                        break;
                    }
                    i15++;
                }
            }
            if (mVar == null) {
                mVar = new m(i11);
            }
            arrayList.add(mVar);
        }
        if (mVar.a(constraintWidget)) {
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                ConstraintAnchor x12 = fVar.x1();
                if (fVar.y1() == 0) {
                    i13 = 1;
                }
                x12.c(i13, arrayList, mVar);
            }
            if (i11 == 0) {
                constraintWidget.S0 = mVar.c();
                constraintWidget.Q.c(i11, arrayList, mVar);
                constraintWidget.S.c(i11, arrayList, mVar);
            } else {
                constraintWidget.T0 = mVar.c();
                constraintWidget.R.c(i11, arrayList, mVar);
                constraintWidget.U.c(i11, arrayList, mVar);
                constraintWidget.T.c(i11, arrayList, mVar);
            }
            constraintWidget.X.c(i11, arrayList, mVar);
        }
        return mVar;
    }

    private static m b(ArrayList<m> arrayList, int i11) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            m mVar = arrayList.get(i12);
            if (i11 == mVar.f8278b) {
                return mVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0395 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(androidx.constraintlayout.core.widgets.d r16, androidx.constraintlayout.core.widgets.analyzer.b.C0027b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.x1()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r16.C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r16.X()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = r5.C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = r5.X()
            boolean r6 = d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof androidx.constraintlayout.core.widgets.e
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x0116
            java.lang.Object r13 = r1.get(r5)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r16.C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = r16.X()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r13.C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r13.X()
            boolean r4 = d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x0062
            androidx.constraintlayout.core.widgets.analyzer.b$a r4 = r0.f8332z1
            int r12 = androidx.constraintlayout.core.widgets.analyzer.b.a.k
            r14 = r17
            androidx.constraintlayout.core.widgets.d.Y1(r3, r13, r14, r4, r12)
            goto L_0x0064
        L_0x0062:
            r14 = r17
        L_0x0064:
            boolean r4 = r13 instanceof androidx.constraintlayout.core.widgets.f
            if (r4 == 0) goto L_0x008d
            r12 = r13
            androidx.constraintlayout.core.widgets.f r12 = (androidx.constraintlayout.core.widgets.f) r12
            int r15 = r12.y1()
            if (r15 != 0) goto L_0x007b
            if (r8 != 0) goto L_0x0078
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0078:
            r8.add(r12)
        L_0x007b:
            int r15 = r12.y1()
            r3 = 1
            if (r15 != r3) goto L_0x008d
            if (r6 != 0) goto L_0x008a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x008a:
            r6.add(r12)
        L_0x008d:
            boolean r3 = r13 instanceof m2.b
            if (r3 == 0) goto L_0x00d1
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.a
            if (r3 == 0) goto L_0x00ba
            r3 = r13
            androidx.constraintlayout.core.widgets.a r3 = (androidx.constraintlayout.core.widgets.a) r3
            int r12 = r3.D1()
            if (r12 != 0) goto L_0x00a8
            if (r7 != 0) goto L_0x00a5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a5:
            r7.add(r3)
        L_0x00a8:
            int r12 = r3.D1()
            r15 = 1
            if (r12 != r15) goto L_0x00d1
            if (r9 != 0) goto L_0x00b6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b6:
            r9.add(r3)
            goto L_0x00d1
        L_0x00ba:
            r3 = r13
            m2.b r3 = (m2.b) r3
            if (r7 != 0) goto L_0x00c4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00c4:
            r7.add(r3)
            if (r9 != 0) goto L_0x00ce
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00ce:
            r9.add(r3)
        L_0x00d1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f8163f
            if (r3 != 0) goto L_0x00ee
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f8163f
            if (r3 != 0) goto L_0x00ee
            if (r4 != 0) goto L_0x00ee
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.a
            if (r3 != 0) goto L_0x00ee
            if (r10 != 0) goto L_0x00eb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00eb:
            r10.add(r13)
        L_0x00ee:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f8163f
            if (r3 != 0) goto L_0x0111
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f8163f
            if (r3 != 0) goto L_0x0111
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.U
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f8163f
            if (r3 != 0) goto L_0x0111
            if (r4 != 0) goto L_0x0111
            boolean r3 = r13 instanceof androidx.constraintlayout.core.widgets.a
            if (r3 != 0) goto L_0x0111
            if (r11 != 0) goto L_0x010e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x010e:
            r11.add(r13)
        L_0x0111:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x003a
        L_0x0116:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0133
            java.util.Iterator r4 = r6.iterator()
        L_0x0121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0133
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.f r5 = (androidx.constraintlayout.core.widgets.f) r5
            r6 = 0
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x0121
        L_0x0133:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x0154
            java.util.Iterator r4 = r7.iterator()
        L_0x013b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0154
            java.lang.Object r5 = r4.next()
            m2.b r5 = (m2.b) r5
            androidx.constraintlayout.core.widgets.analyzer.m r7 = a(r5, r6, r3, r12)
            r5.x1(r3, r6, r7)
            r7.b(r3)
            r6 = 0
            r12 = 0
            goto L_0x013b
        L_0x0154:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x017c
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0168:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x017c
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f8161d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0168
        L_0x017c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01a4
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0190:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a4
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f8161d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0190
        L_0x01a4:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01cc
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01cc
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f8161d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x01b8
        L_0x01cc:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01e4
            java.util.Iterator r4 = r10.iterator()
        L_0x01d4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e4
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            a(r5, r6, r3, r7)
            goto L_0x01d4
        L_0x01e4:
            if (r8 == 0) goto L_0x01fb
            java.util.Iterator r4 = r8.iterator()
        L_0x01ea:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01fb
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.f r5 = (androidx.constraintlayout.core.widgets.f) r5
            r6 = 1
            a(r5, r6, r3, r7)
            goto L_0x01ea
        L_0x01fb:
            r6 = 1
            if (r9 == 0) goto L_0x021b
            java.util.Iterator r4 = r9.iterator()
        L_0x0202:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x021b
            java.lang.Object r5 = r4.next()
            m2.b r5 = (m2.b) r5
            androidx.constraintlayout.core.widgets.analyzer.m r8 = a(r5, r6, r3, r7)
            r5.x1(r3, r6, r8)
            r8.b(r3)
            r6 = 1
            r7 = 0
            goto L_0x0202
        L_0x021b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0243
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x022f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0243
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f8161d
            r6 = 1
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x022f
        L_0x0243:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x026b
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0257:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x026b
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f8161d
            r6 = 1
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0257
        L_0x026b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0293
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x027f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0293
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f8161d
            r6 = 1
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x027f
        L_0x0293:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.q(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x02bb
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02bb
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f8161d
            r6 = 1
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x02a7
        L_0x02bb:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02d3
            java.util.Iterator r4 = r11.iterator()
        L_0x02c3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02d3
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            a(r5, r6, r3, r12)
            goto L_0x02c3
        L_0x02d3:
            r4 = 0
        L_0x02d4:
            if (r4 >= r2) goto L_0x0300
            java.lang.Object r5 = r1.get(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r5
            boolean r6 = r5.w0()
            if (r6 == 0) goto L_0x02fd
            int r6 = r5.S0
            androidx.constraintlayout.core.widgets.analyzer.m r6 = b(r3, r6)
            int r5 = r5.T0
            androidx.constraintlayout.core.widgets.analyzer.m r5 = b(r3, r5)
            if (r6 == 0) goto L_0x02fd
            if (r5 == 0) goto L_0x02fd
            r7 = 0
            r6.g(r7, r5)
            r7 = 2
            r5.i(r7)
            r3.remove(r6)
        L_0x02fd:
            int r4 = r4 + 1
            goto L_0x02d4
        L_0x0300:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0309
            r1 = 0
            return r1
        L_0x0309:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.C()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r2) goto L_0x034b
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x0317:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x033c
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.m r4 = (androidx.constraintlayout.core.widgets.analyzer.m) r4
            int r5 = r4.d()
            r7 = 1
            if (r5 != r7) goto L_0x032b
            goto L_0x0317
        L_0x032b:
            r5 = 0
            r4.h(r5)
            androidx.constraintlayout.core.d r7 = r16.Q1()
            int r7 = r4.f(r7, r5)
            if (r7 <= r6) goto L_0x0317
            r2 = r4
            r6 = r7
            goto L_0x0317
        L_0x033c:
            if (r2 == 0) goto L_0x034b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.V0(r1)
            r0.q1(r6)
            r1 = 1
            r2.h(r1)
            goto L_0x034c
        L_0x034b:
            r2 = r12
        L_0x034c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r16.X()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r1 != r4) goto L_0x0390
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x035a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x037f
            java.lang.Object r4 = r1.next()
            androidx.constraintlayout.core.widgets.analyzer.m r4 = (androidx.constraintlayout.core.widgets.analyzer.m) r4
            int r5 = r4.d()
            if (r5 != 0) goto L_0x036d
            goto L_0x035a
        L_0x036d:
            r5 = 0
            r4.h(r5)
            androidx.constraintlayout.core.d r7 = r16.Q1()
            r8 = 1
            int r7 = r4.f(r7, r8)
            if (r7 <= r6) goto L_0x035a
            r3 = r4
            r6 = r7
            goto L_0x035a
        L_0x037f:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0392
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r0.m1(r1)
            r0.R0(r6)
            r3.h(r8)
            r4 = r3
            goto L_0x0393
        L_0x0390:
            r5 = 0
            r8 = 1
        L_0x0392:
            r4 = r12
        L_0x0393:
            if (r2 != 0) goto L_0x039a
            if (r4 == 0) goto L_0x0398
            goto L_0x039a
        L_0x0398:
            r3 = 0
            goto L_0x039b
        L_0x039a:
            r3 = 1
        L_0x039b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.g.c(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.widgets.analyzer.b$b):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r5, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r6, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r7, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r8) {
        /*
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1 = 0
            r2 = 1
            if (r7 == r0) goto L_0x0013
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 == r3) goto L_0x0013
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r7 != r4) goto L_0x0011
            if (r5 == r3) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            if (r8 == r0) goto L_0x0023
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 == r7) goto L_0x0023
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r8 != r0) goto L_0x0021
            if (r6 == r7) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r6 = 0
            goto L_0x0024
        L_0x0023:
            r6 = 1
        L_0x0024:
            if (r5 != 0) goto L_0x002a
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.g.d(androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour):boolean");
    }
}
