package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.d;
import java.util.ArrayList;

/* compiled from: Chain */
public class b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: androidx.constraintlayout.core.widgets.ConstraintWidget} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: androidx.constraintlayout.core.SolverVariable} */
    /* JADX WARNING: type inference failed for: r5v10, types: [androidx.constraintlayout.core.SolverVariable] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r8 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r8 == 2) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x026d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x052d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x03b2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:330:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(androidx.constraintlayout.core.widgets.d r38, androidx.constraintlayout.core.d r39, int r40, int r41, androidx.constraintlayout.core.widgets.c r42) {
        /*
            r0 = r38
            r9 = r39
            r10 = r40
            r1 = r42
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r1.f8291a
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r1.f8293c
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = r1.f8292b
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r1.f8294d
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r1.f8295e
            float r3 = r1.k
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.f8171b0
            r4 = r4[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r5 = 2
            if (r10 != 0) goto L_0x0034
            int r8 = r2.J0
            if (r8 != 0) goto L_0x0029
            r15 = 1
            goto L_0x002a
        L_0x0029:
            r15 = 0
        L_0x002a:
            if (r8 != r7) goto L_0x002f
            r16 = 1
            goto L_0x0031
        L_0x002f:
            r16 = 0
        L_0x0031:
            if (r8 != r5) goto L_0x0046
            goto L_0x0044
        L_0x0034:
            int r8 = r2.K0
            if (r8 != 0) goto L_0x003a
            r15 = 1
            goto L_0x003b
        L_0x003a:
            r15 = 0
        L_0x003b:
            if (r8 != r7) goto L_0x0040
            r16 = 1
            goto L_0x0042
        L_0x0040:
            r16 = 0
        L_0x0042:
            if (r8 != r5) goto L_0x0046
        L_0x0044:
            r5 = 1
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            r7 = r11
            r8 = 0
        L_0x0049:
            r22 = 0
            if (r8 != 0) goto L_0x0133
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r7.Y
            r6 = r6[r41]
            if (r5 == 0) goto L_0x0056
            r20 = 1
            goto L_0x0058
        L_0x0056:
            r20 = 4
        L_0x0058:
            int r24 = r6.f()
            r25 = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r7.f8171b0
            r3 = r3[r10]
            r26 = r8
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r8) goto L_0x0072
            int[] r3 = r7.f8210y
            r3 = r3[r10]
            if (r3 != 0) goto L_0x0072
            r27 = r15
            r3 = 1
            goto L_0x0075
        L_0x0072:
            r27 = r15
            r3 = 0
        L_0x0075:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r6.f8163f
            if (r15 == 0) goto L_0x0081
            if (r7 == r11) goto L_0x0081
            int r15 = r15.f()
            int r24 = r24 + r15
        L_0x0081:
            r15 = r24
            if (r5 == 0) goto L_0x008e
            if (r7 == r11) goto L_0x008e
            if (r7 == r13) goto L_0x008e
            r24 = r2
            r20 = 8
            goto L_0x0090
        L_0x008e:
            r24 = r2
        L_0x0090:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r6.f8163f
            if (r2 == 0) goto L_0x00ca
            if (r7 != r13) goto L_0x00a1
            r28 = r11
            androidx.constraintlayout.core.SolverVariable r11 = r6.f8166i
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            r1 = 6
            r9.h(r11, r2, r15, r1)
            goto L_0x00ac
        L_0x00a1:
            r28 = r11
            androidx.constraintlayout.core.SolverVariable r1 = r6.f8166i
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            r11 = 8
            r9.h(r1, r2, r15, r11)
        L_0x00ac:
            if (r3 == 0) goto L_0x00b2
            if (r5 != 0) goto L_0x00b2
            r20 = 5
        L_0x00b2:
            if (r7 != r13) goto L_0x00be
            if (r5 == 0) goto L_0x00be
            boolean r1 = r7.l0(r10)
            if (r1 == 0) goto L_0x00be
            r1 = 5
            goto L_0x00c0
        L_0x00be:
            r1 = r20
        L_0x00c0:
            androidx.constraintlayout.core.SolverVariable r2 = r6.f8166i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.f8163f
            androidx.constraintlayout.core.SolverVariable r3 = r3.f8166i
            r9.e(r2, r3, r15, r1)
            goto L_0x00cc
        L_0x00ca:
            r28 = r11
        L_0x00cc:
            if (r4 == 0) goto L_0x0100
            int r1 = r7.Z()
            r2 = 8
            if (r1 == r2) goto L_0x00ee
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r7.f8171b0
            r1 = r1[r10]
            if (r1 != r8) goto L_0x00ee
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r7.Y
            int r2 = r41 + 1
            r2 = r1[r2]
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            r1 = r1[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r1.f8166i
            r3 = 5
            r6 = 0
            r9.h(r2, r1, r6, r3)
            goto L_0x00ef
        L_0x00ee:
            r6 = 0
        L_0x00ef:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r7.Y
            r1 = r1[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r1.f8166i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.Y
            r2 = r2[r41]
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            r3 = 8
            r9.h(r1, r2, r6, r3)
        L_0x0100:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r7.Y
            int r2 = r41 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f8163f
            if (r1 == 0) goto L_0x011f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f8161d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r1.Y
            r3 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f8163f
            if (r3 == 0) goto L_0x011f
            r2 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f8163f
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.f8161d
            if (r2 == r7) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r22 = r1
        L_0x011f:
            if (r22 == 0) goto L_0x0126
            r7 = r22
            r8 = r26
            goto L_0x0127
        L_0x0126:
            r8 = 1
        L_0x0127:
            r1 = r42
            r2 = r24
            r3 = r25
            r15 = r27
            r11 = r28
            goto L_0x0049
        L_0x0133:
            r24 = r2
            r25 = r3
            r28 = r11
            r27 = r15
            if (r14 == 0) goto L_0x019e
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r12.Y
            int r2 = r41 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f8163f
            if (r1 == 0) goto L_0x019e
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.Y
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r14.f8171b0
            r3 = r3[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r6) goto L_0x015b
            int[] r3 = r14.f8210y
            r3 = r3[r10]
            if (r3 != 0) goto L_0x015b
            r3 = 1
            goto L_0x015c
        L_0x015b:
            r3 = 0
        L_0x015c:
            if (r3 == 0) goto L_0x0174
            if (r5 != 0) goto L_0x0174
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.f8163f
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r3.f8161d
            if (r6 != r0) goto L_0x0174
            androidx.constraintlayout.core.SolverVariable r6 = r1.f8166i
            androidx.constraintlayout.core.SolverVariable r3 = r3.f8166i
            int r7 = r1.f()
            int r7 = -r7
            r8 = 5
            r9.e(r6, r3, r7, r8)
            goto L_0x018a
        L_0x0174:
            r8 = 5
            if (r5 == 0) goto L_0x018a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.f8163f
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r3.f8161d
            if (r6 != r0) goto L_0x018a
            androidx.constraintlayout.core.SolverVariable r6 = r1.f8166i
            androidx.constraintlayout.core.SolverVariable r3 = r3.f8166i
            int r7 = r1.f()
            int r7 = -r7
            r11 = 4
            r9.e(r6, r3, r7, r11)
        L_0x018a:
            androidx.constraintlayout.core.SolverVariable r3 = r1.f8166i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r12.Y
            r2 = r6[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f8163f
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            int r1 = r1.f()
            int r1 = -r1
            r6 = 6
            r9.j(r3, r2, r1, r6)
            goto L_0x019f
        L_0x019e:
            r8 = 5
        L_0x019f:
            if (r4 == 0) goto L_0x01ba
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.Y
            int r1 = r41 + 1
            r0 = r0[r1]
            androidx.constraintlayout.core.SolverVariable r0 = r0.f8166i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r12.Y
            r3 = r2[r1]
            androidx.constraintlayout.core.SolverVariable r3 = r3.f8166i
            r1 = r2[r1]
            int r1 = r1.f()
            r2 = 8
            r9.h(r0, r3, r1, r2)
        L_0x01ba:
            r0 = r42
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.f8298h
            if (r1 == 0) goto L_0x026b
            int r2 = r1.size()
            r3 = 1
            if (r2 <= r3) goto L_0x026b
            boolean r4 = r0.f8304r
            if (r4 == 0) goto L_0x01d3
            boolean r4 = r0.t
            if (r4 != 0) goto L_0x01d3
            int r4 = r0.j
            float r4 = (float) r4
            goto L_0x01d5
        L_0x01d3:
            r4 = r25
        L_0x01d5:
            r6 = 0
            r11 = r22
            r7 = 0
            r30 = 0
        L_0x01db:
            if (r7 >= r2) goto L_0x026b
            java.lang.Object r15 = r1.get(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r15
            float[] r3 = r15.N0
            r3 = r3[r10]
            int r19 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r19 >= 0) goto L_0x0207
            boolean r3 = r0.t
            if (r3 == 0) goto L_0x0202
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.Y
            int r15 = r41 + 1
            r15 = r3[r15]
            androidx.constraintlayout.core.SolverVariable r15 = r15.f8166i
            r3 = r3[r41]
            androidx.constraintlayout.core.SolverVariable r3 = r3.f8166i
            r6 = 0
            r8 = 4
            r9.e(r15, r3, r6, r8)
            r8 = 0
            goto L_0x021e
        L_0x0202:
            r8 = 4
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            goto L_0x0208
        L_0x0207:
            r8 = 4
        L_0x0208:
            int r19 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r19 != 0) goto L_0x0223
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.Y
            int r15 = r41 + 1
            r15 = r3[r15]
            androidx.constraintlayout.core.SolverVariable r15 = r15.f8166i
            r3 = r3[r41]
            androidx.constraintlayout.core.SolverVariable r3 = r3.f8166i
            r6 = 8
            r8 = 0
            r9.e(r15, r3, r8, r6)
        L_0x021e:
            r25 = r1
            r18 = r2
            goto L_0x0260
        L_0x0223:
            r8 = 0
            if (r11 == 0) goto L_0x0259
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r6 = r11.Y
            r11 = r6[r41]
            androidx.constraintlayout.core.SolverVariable r11 = r11.f8166i
            int r18 = r41 + 1
            r6 = r6[r18]
            androidx.constraintlayout.core.SolverVariable r6 = r6.f8166i
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r15.Y
            r25 = r1
            r1 = r8[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r1.f8166i
            r8 = r8[r18]
            androidx.constraintlayout.core.SolverVariable r8 = r8.f8166i
            r18 = r2
            androidx.constraintlayout.core.b r2 = r39.r()
            r29 = r2
            r31 = r4
            r32 = r3
            r33 = r11
            r34 = r6
            r35 = r1
            r36 = r8
            r29.l(r30, r31, r32, r33, r34, r35, r36)
            r9.d(r2)
            goto L_0x025d
        L_0x0259:
            r25 = r1
            r18 = r2
        L_0x025d:
            r30 = r3
            r11 = r15
        L_0x0260:
            int r7 = r7 + 1
            r2 = r18
            r1 = r25
            r3 = 1
            r6 = 0
            r8 = 5
            goto L_0x01db
        L_0x026b:
            if (r13 == 0) goto L_0x02c4
            if (r13 == r14) goto L_0x0271
            if (r5 == 0) goto L_0x02c4
        L_0x0271:
            r11 = r28
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r11.Y
            r0 = r0[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r12.Y
            int r2 = r41 + 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f8163f
            if (r0 == 0) goto L_0x0285
            androidx.constraintlayout.core.SolverVariable r0 = r0.f8166i
            r3 = r0
            goto L_0x0287
        L_0x0285:
            r3 = r22
        L_0x0287:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.f8163f
            if (r0 == 0) goto L_0x028f
            androidx.constraintlayout.core.SolverVariable r0 = r0.f8166i
            r5 = r0
            goto L_0x0291
        L_0x028f:
            r5 = r22
        L_0x0291:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.Y
            r0 = r0[r41]
            if (r14 == 0) goto L_0x029b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r14.Y
            r1 = r1[r2]
        L_0x029b:
            if (r3 == 0) goto L_0x04ee
            if (r5 == 0) goto L_0x04ee
            if (r10 != 0) goto L_0x02a6
            r2 = r24
            float r2 = r2.f8197q0
            goto L_0x02aa
        L_0x02a6:
            r2 = r24
            float r2 = r2.f8199r0
        L_0x02aa:
            r4 = r2
            int r6 = r0.f()
            int r7 = r1.f()
            androidx.constraintlayout.core.SolverVariable r2 = r0.f8166i
            androidx.constraintlayout.core.SolverVariable r8 = r1.f8166i
            r10 = 7
            r0 = r39
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04ee
        L_0x02c4:
            r11 = r28
            if (r27 == 0) goto L_0x03b7
            if (r13 == 0) goto L_0x03b7
            int r1 = r0.j
            if (r1 <= 0) goto L_0x02d5
            int r0 = r0.f8299i
            if (r0 != r1) goto L_0x02d5
            r17 = 1
            goto L_0x02d7
        L_0x02d5:
            r17 = 0
        L_0x02d7:
            r8 = r13
            r15 = r8
        L_0x02d9:
            if (r15 == 0) goto L_0x04ee
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r15.P0
            r0 = r0[r10]
            r7 = r0
        L_0x02e0:
            if (r7 == 0) goto L_0x02ef
            int r0 = r7.Z()
            r6 = 8
            if (r0 != r6) goto L_0x02f1
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r7.P0
            r7 = r0[r10]
            goto L_0x02e0
        L_0x02ef:
            r6 = 8
        L_0x02f1:
            if (r7 != 0) goto L_0x02fc
            if (r15 != r14) goto L_0x02f6
            goto L_0x02fc
        L_0x02f6:
            r20 = r7
        L_0x02f8:
            r18 = r8
            goto L_0x03a7
        L_0x02fc:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.Y
            r0 = r0[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r0.f8166i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f8163f
            if (r2 == 0) goto L_0x0309
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            goto L_0x030b
        L_0x0309:
            r2 = r22
        L_0x030b:
            if (r8 == r15) goto L_0x0316
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r8.Y
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            goto L_0x0329
        L_0x0316:
            if (r15 != r13) goto L_0x0329
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r11.Y
            r3 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f8163f
            if (r3 == 0) goto L_0x0327
            r2 = r2[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f8163f
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            goto L_0x0329
        L_0x0327:
            r2 = r22
        L_0x0329:
            int r0 = r0.f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r15.Y
            int r4 = r41 + 1
            r3 = r3[r4]
            int r3 = r3.f()
            if (r7 == 0) goto L_0x0342
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r7.Y
            r5 = r5[r41]
            androidx.constraintlayout.core.SolverVariable r6 = r5.f8166i
        L_0x033f:
            r38 = r7
            goto L_0x0351
        L_0x0342:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.Y
            r5 = r5[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f8163f
            if (r5 == 0) goto L_0x034d
            androidx.constraintlayout.core.SolverVariable r6 = r5.f8166i
            goto L_0x033f
        L_0x034d:
            r38 = r7
            r6 = r22
        L_0x0351:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = r15.Y
            r7 = r7[r4]
            androidx.constraintlayout.core.SolverVariable r7 = r7.f8166i
            if (r5 == 0) goto L_0x035e
            int r5 = r5.f()
            int r3 = r3 + r5
        L_0x035e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r8.Y
            r5 = r5[r4]
            int r5 = r5.f()
            int r0 = r0 + r5
            if (r1 == 0) goto L_0x03a3
            if (r2 == 0) goto L_0x03a3
            if (r6 == 0) goto L_0x03a3
            if (r7 == 0) goto L_0x03a3
            if (r15 != r13) goto L_0x0379
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.Y
            r0 = r0[r41]
            int r0 = r0.f()
        L_0x0379:
            r5 = r0
            if (r15 != r14) goto L_0x0387
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r14.Y
            r0 = r0[r4]
            int r0 = r0.f()
            r18 = r0
            goto L_0x0389
        L_0x0387:
            r18 = r3
        L_0x0389:
            if (r17 == 0) goto L_0x038e
            r19 = 8
            goto L_0x0390
        L_0x038e:
            r19 = 5
        L_0x0390:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r39
            r3 = r5
            r5 = r6
            r6 = r7
            r20 = r38
            r7 = r18
            r18 = r8
            r8 = r19
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x03a7
        L_0x03a3:
            r20 = r38
            goto L_0x02f8
        L_0x03a7:
            int r0 = r15.Z()
            r8 = 8
            if (r0 == r8) goto L_0x03b0
            goto L_0x03b2
        L_0x03b0:
            r15 = r18
        L_0x03b2:
            r8 = r15
            r15 = r20
            goto L_0x02d9
        L_0x03b7:
            r8 = 8
            if (r16 == 0) goto L_0x04ee
            if (r13 == 0) goto L_0x04ee
            int r1 = r0.j
            if (r1 <= 0) goto L_0x03c8
            int r0 = r0.f8299i
            if (r0 != r1) goto L_0x03c8
            r17 = 1
            goto L_0x03ca
        L_0x03c8:
            r17 = 0
        L_0x03ca:
            r7 = r13
            r15 = r7
        L_0x03cc:
            if (r15 == 0) goto L_0x0490
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r15.P0
            r0 = r0[r10]
        L_0x03d2:
            if (r0 == 0) goto L_0x03df
            int r1 = r0.Z()
            if (r1 != r8) goto L_0x03df
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r0.P0
            r0 = r0[r10]
            goto L_0x03d2
        L_0x03df:
            if (r15 == r13) goto L_0x0479
            if (r15 == r14) goto L_0x0479
            if (r0 == 0) goto L_0x0479
            if (r0 != r14) goto L_0x03ea
            r6 = r22
            goto L_0x03eb
        L_0x03ea:
            r6 = r0
        L_0x03eb:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r15.Y
            r0 = r0[r41]
            androidx.constraintlayout.core.SolverVariable r1 = r0.f8166i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f8163f
            if (r2 == 0) goto L_0x03f7
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
        L_0x03f7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r7.Y
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r2 = r2.f8166i
            int r0 = r0.f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r15.Y
            r4 = r4[r3]
            int r4 = r4.f()
            if (r6 == 0) goto L_0x0424
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r6.Y
            r5 = r5[r41]
            androidx.constraintlayout.core.SolverVariable r8 = r5.f8166i
            r38 = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.f8163f
            if (r6 == 0) goto L_0x041c
            androidx.constraintlayout.core.SolverVariable r6 = r6.f8166i
            goto L_0x041e
        L_0x041c:
            r6 = r22
        L_0x041e:
            r37 = r8
            r8 = r6
            r6 = r37
            goto L_0x0437
        L_0x0424:
            r38 = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r14.Y
            r5 = r5[r41]
            if (r5 == 0) goto L_0x042f
            androidx.constraintlayout.core.SolverVariable r6 = r5.f8166i
            goto L_0x0431
        L_0x042f:
            r6 = r22
        L_0x0431:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r8 = r15.Y
            r8 = r8[r3]
            androidx.constraintlayout.core.SolverVariable r8 = r8.f8166i
        L_0x0437:
            if (r5 == 0) goto L_0x043e
            int r5 = r5.f()
            int r4 = r4 + r5
        L_0x043e:
            r18 = r4
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r7.Y
            r3 = r4[r3]
            int r3 = r3.f()
            int r3 = r3 + r0
            if (r17 == 0) goto L_0x044e
            r19 = 8
            goto L_0x0450
        L_0x044e:
            r19 = 4
        L_0x0450:
            if (r1 == 0) goto L_0x046e
            if (r2 == 0) goto L_0x046e
            if (r6 == 0) goto L_0x046e
            if (r8 == 0) goto L_0x046e
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r39
            r5 = r6
            r20 = r38
            r21 = 4
            r6 = r8
            r23 = r7
            r7 = r18
            r10 = 8
            r8 = r19
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0476
        L_0x046e:
            r20 = r38
            r23 = r7
            r10 = 8
            r21 = 4
        L_0x0476:
            r0 = r20
            goto L_0x047f
        L_0x0479:
            r23 = r7
            r10 = 8
            r21 = 4
        L_0x047f:
            int r1 = r15.Z()
            if (r1 == r10) goto L_0x0487
            r7 = r15
            goto L_0x0489
        L_0x0487:
            r7 = r23
        L_0x0489:
            r10 = r40
            r15 = r0
            r8 = 8
            goto L_0x03cc
        L_0x0490:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.Y
            r0 = r0[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r11.Y
            r1 = r1[r41]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f8163f
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.Y
            int r3 = r41 + 1
            r10 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r12.Y
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r2.f8163f
            if (r1 == 0) goto L_0x04dd
            if (r13 == r14) goto L_0x04b7
            androidx.constraintlayout.core.SolverVariable r2 = r0.f8166i
            androidx.constraintlayout.core.SolverVariable r1 = r1.f8166i
            int r0 = r0.f()
            r15 = 5
            r9.e(r2, r1, r0, r15)
            goto L_0x04de
        L_0x04b7:
            r15 = 5
            if (r11 == 0) goto L_0x04de
            androidx.constraintlayout.core.SolverVariable r2 = r0.f8166i
            androidx.constraintlayout.core.SolverVariable r3 = r1.f8166i
            int r4 = r0.f()
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.constraintlayout.core.SolverVariable r6 = r10.f8166i
            androidx.constraintlayout.core.SolverVariable r7 = r11.f8166i
            int r8 = r10.f()
            r17 = 5
            r0 = r39
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r17
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04de
        L_0x04dd:
            r15 = 5
        L_0x04de:
            if (r11 == 0) goto L_0x04ee
            if (r13 == r14) goto L_0x04ee
            androidx.constraintlayout.core.SolverVariable r0 = r10.f8166i
            androidx.constraintlayout.core.SolverVariable r1 = r11.f8166i
            int r2 = r10.f()
            int r2 = -r2
            r9.e(r0, r1, r2, r15)
        L_0x04ee:
            if (r27 != 0) goto L_0x04f2
            if (r16 == 0) goto L_0x054d
        L_0x04f2:
            if (r13 == 0) goto L_0x054d
            if (r13 == r14) goto L_0x054d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r13.Y
            r1 = r0[r41]
            if (r14 != 0) goto L_0x04fd
            r14 = r13
        L_0x04fd:
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r14.Y
            int r3 = r41 + 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.f8163f
            if (r4 == 0) goto L_0x050a
            androidx.constraintlayout.core.SolverVariable r4 = r4.f8166i
            goto L_0x050c
        L_0x050a:
            r4 = r22
        L_0x050c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r2.f8163f
            if (r5 == 0) goto L_0x0513
            androidx.constraintlayout.core.SolverVariable r5 = r5.f8166i
            goto L_0x0515
        L_0x0513:
            r5 = r22
        L_0x0515:
            if (r12 == r14) goto L_0x0525
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r5 = r12.Y
            r5 = r5[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f8163f
            if (r5 == 0) goto L_0x0523
            androidx.constraintlayout.core.SolverVariable r5 = r5.f8166i
            r22 = r5
        L_0x0523:
            r5 = r22
        L_0x0525:
            if (r13 != r14) goto L_0x052b
            r1 = r0[r41]
            r2 = r0[r3]
        L_0x052b:
            if (r4 == 0) goto L_0x054d
            if (r5 == 0) goto L_0x054d
            r6 = 1056964608(0x3f000000, float:0.5)
            int r7 = r1.f()
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r14.Y
            r0 = r0[r3]
            int r8 = r0.f()
            androidx.constraintlayout.core.SolverVariable r1 = r1.f8166i
            androidx.constraintlayout.core.SolverVariable r10 = r2.f8166i
            r11 = 5
            r0 = r39
            r2 = r4
            r3 = r7
            r4 = r6
            r6 = r10
            r7 = r8
            r8 = r11
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x054d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.b.a(androidx.constraintlayout.core.widgets.d, androidx.constraintlayout.core.d, int, int, androidx.constraintlayout.core.widgets.c):void");
    }

    public static void b(d dVar, d dVar2, ArrayList<ConstraintWidget> arrayList, int i11) {
        c[] cVarArr;
        int i12;
        int i13;
        if (i11 == 0) {
            i13 = dVar.f8313g1;
            cVarArr = dVar.f8316j1;
            i12 = 0;
        } else {
            int i14 = dVar.f8314h1;
            cVarArr = dVar.f8315i1;
            i13 = i14;
            i12 = 2;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            c cVar = cVarArr[i15];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f8291a)) {
                a(dVar, dVar2, i11, i12, cVar);
            }
        }
    }
}
