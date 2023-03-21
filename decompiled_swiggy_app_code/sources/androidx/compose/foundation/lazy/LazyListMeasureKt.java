package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import java.util.ArrayList;
import java.util.List;
import rp0.d;
import w.q;
import w.s;

/* compiled from: LazyListMeasure.kt */
public final class LazyListMeasureKt {
    private static final List<q> a(List<s> list, List<s> list2, List<s> list3, int i11, int i12, int i13, int i14, int i15, boolean z11, Arrangement.l lVar, Arrangement.d dVar, boolean z12, e eVar) {
        List<s> list4 = list;
        int i16 = i11;
        int i17 = i12;
        Arrangement.l lVar2 = lVar;
        boolean z13 = z12;
        int i18 = i14;
        int i19 = z11 ? i17 : i16;
        boolean z14 = true;
        boolean z15 = i13 < Math.min(i19, i18);
        if (z15) {
            if (!(i15 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z15) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z14 = false;
            }
            if (z14) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i21 = 0; i21 < size; i21++) {
                    iArr[i21] = list.get(b(i21, z13, size)).d();
                }
                int[] iArr2 = new int[size];
                for (int i22 = 0; i22 < size; i22++) {
                    iArr2[i22] = 0;
                }
                if (!z11) {
                    e eVar2 = eVar;
                    if (dVar != null) {
                        dVar.c(eVar, i19, iArr, LayoutDirection.Ltr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (lVar2 != null) {
                    lVar2.b(eVar, i19, iArr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                d L = ArraysKt___ArraysKt.L(iArr2);
                if (z13) {
                    L = l.s(L);
                }
                int f11 = L.f();
                int g11 = L.g();
                int h11 = L.h();
                if ((h11 > 0 && f11 <= g11) || (h11 < 0 && g11 <= f11)) {
                    while (true) {
                        int i23 = iArr2[f11];
                        s sVar = list.get(b(f11, z13, size));
                        if (z13) {
                            i23 = (i19 - i23) - sVar.d();
                        }
                        arrayList.add(sVar.f(i23, i16, i17));
                        if (f11 == g11) {
                            break;
                        }
                        f11 += h11;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size2 = list2.size();
            int i24 = i15;
            for (int i25 = 0; i25 < size2; i25++) {
                List<s> list5 = list2;
                s sVar2 = list2.get(i25);
                i24 -= sVar2.e();
                arrayList.add(sVar2.f(i24, i16, i17));
            }
            int size3 = list.size();
            int i26 = i15;
            for (int i27 = 0; i27 < size3; i27++) {
                s sVar3 = list.get(i27);
                arrayList.add(sVar3.f(i26, i16, i17));
                i26 += sVar3.e();
            }
            int size4 = list3.size();
            for (int i28 = 0; i28 < size4; i28++) {
                s sVar4 = list3.get(i28);
                arrayList.add(sVar4.f(i26, i16, i17));
                i26 += sVar4.e();
            }
        }
        return arrayList;
    }

    private static final int b(int i11, boolean z11, int i12) {
        return !z11 ? i11 : (i12 - i11) - 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: w.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final w.m c(int r31, w.t r32, int r33, int r34, int r35, int r36, int r37, float r38, long r39, boolean r41, java.util.List<java.lang.Integer> r42, androidx.compose.foundation.layout.Arrangement.l r43, androidx.compose.foundation.layout.Arrangement.d r44, boolean r45, d2.e r46, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r47, w.e r48, lp0.q<? super java.lang.Integer, ? super java.lang.Integer, ? super lp0.l<? super i1.e0.a, bp0.k>, ? extends i1.u> r49) {
        /*
            r9 = r31
            r6 = r32
            r7 = r33
            r3 = r34
            r0 = r39
            r2 = r48
            r8 = r49
            java.lang.String r4 = "itemProvider"
            kotlin.jvm.internal.p.j(r6, r4)
            java.lang.String r4 = "headerIndexes"
            r5 = r42
            kotlin.jvm.internal.p.j(r5, r4)
            java.lang.String r4 = "density"
            r15 = r46
            kotlin.jvm.internal.p.j(r15, r4)
            java.lang.String r4 = "placementAnimator"
            r14 = r47
            kotlin.jvm.internal.p.j(r14, r4)
            java.lang.String r4 = "beyondBoundsInfo"
            kotlin.jvm.internal.p.j(r2, r4)
            java.lang.String r4 = "layout"
            kotlin.jvm.internal.p.j(r8, r4)
            r23 = 1
            r4 = 0
            if (r3 < 0) goto L_0x0039
            r10 = 1
            goto L_0x003a
        L_0x0039:
            r10 = 0
        L_0x003a:
            java.lang.String r11 = "Failed requirement."
            if (r10 == 0) goto L_0x0390
            if (r35 < 0) goto L_0x0042
            r10 = 1
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            if (r10 == 0) goto L_0x0386
            if (r9 > 0) goto L_0x0089
            w.m r13 = new w.m
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            int r9 = d2.b.p(r39)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r0 = d2.b.o(r39)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1 r1 = androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$1.f4028a
            java.lang.Object r0 = r8.invoke(r9, r0, r1)
            r8 = r0
            i1.u r8 = (i1.u) r8
            java.util.List r9 = kotlin.collections.k.j()
            int r10 = -r3
            int r11 = r7 + r35
            r12 = 0
            if (r41 == 0) goto L_0x0073
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0075
        L_0x0073:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0075:
            r14 = r0
            r0 = r13
            r1 = r2
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r8
            r6 = r9
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r45
            r11 = r14
            r12 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        L_0x0089:
            r10 = r36
            if (r10 < r9) goto L_0x0095
            int r10 = r9 + -1
            int r10 = w.a.b(r10)
            r11 = 0
            goto L_0x0097
        L_0x0095:
            r11 = r37
        L_0x0097:
            int r12 = np0.c.c(r38)
            int r11 = r11 - r12
            int r13 = w.a.b(r4)
            boolean r13 = w.a.d(r10, r13)
            if (r13 == 0) goto L_0x00aa
            if (r11 >= 0) goto L_0x00aa
            int r12 = r12 + r11
            r11 = 0
        L_0x00aa:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r11 = r11 - r3
            int r4 = -r3
            r5 = 0
        L_0x00b2:
            if (r11 >= 0) goto L_0x00e0
            r36 = 0
            int r16 = w.a.b(r36)
            int r16 = r10 - r16
            if (r16 <= 0) goto L_0x00e0
            int r10 = r10 + -1
            int r10 = w.a.b(r10)
            w.s r14 = r6.a(r10)
            r37 = r10
            r10 = 0
            r13.add(r10, r14)
            int r10 = r14.a()
            int r5 = java.lang.Math.max(r5, r10)
            int r10 = r14.e()
            int r11 = r11 + r10
            r10 = r37
            r14 = r47
            goto L_0x00b2
        L_0x00e0:
            if (r11 >= r4) goto L_0x00e4
            int r12 = r12 + r11
            r11 = r4
        L_0x00e4:
            int r11 = r11 + r3
            int r14 = r7 + r35
            r16 = r5
            r36 = r10
            r5 = 0
            int r10 = rp0.l.d(r14, r5)
            int r5 = -r11
            r17 = r5
            int r5 = r13.size()
            r18 = r36
            r37 = r11
            r11 = 0
        L_0x00fc:
            if (r11 >= r5) goto L_0x0113
            java.lang.Object r19 = r13.get(r11)
            w.s r19 = (w.s) r19
            int r18 = r18 + 1
            int r18 = w.a.b(r18)
            int r19 = r19.e()
            int r17 = r17 + r19
            int r11 = r11 + 1
            goto L_0x00fc
        L_0x0113:
            r5 = r37
            r11 = r16
            r15 = r18
            r16 = r36
            r36 = r14
            r14 = r17
        L_0x011f:
            if (r14 <= r10) goto L_0x0127
            boolean r17 = r13.isEmpty()
            if (r17 == 0) goto L_0x0164
        L_0x0127:
            if (r15 >= r9) goto L_0x0164
            r37 = r10
            w.s r10 = r6.a(r15)
            int r17 = r10.e()
            int r14 = r14 + r17
            if (r14 > r4) goto L_0x014b
            r24 = r4
            int r4 = r9 + -1
            if (r15 == r4) goto L_0x014d
            int r4 = r15 + 1
            int r4 = w.a.b(r4)
            int r10 = r10.e()
            int r5 = r5 - r10
            r16 = r4
            goto L_0x0159
        L_0x014b:
            r24 = r4
        L_0x014d:
            int r4 = r10.a()
            int r4 = java.lang.Math.max(r11, r4)
            r13.add(r10)
            r11 = r4
        L_0x0159:
            int r15 = r15 + 1
            int r15 = w.a.b(r15)
            r10 = r37
            r4 = r24
            goto L_0x011f
        L_0x0164:
            r24 = r4
            if (r14 >= r7) goto L_0x019e
            int r4 = r7 - r14
            int r5 = r5 - r4
            int r14 = r14 + r4
        L_0x016c:
            if (r5 >= r3) goto L_0x0196
            r15 = 0
            int r10 = w.a.b(r15)
            int r10 = r16 - r10
            if (r10 <= 0) goto L_0x0196
            int r16 = r16 + -1
            int r10 = w.a.b(r16)
            w.s r8 = r6.a(r10)
            r13.add(r15, r8)
            int r15 = r8.a()
            int r11 = java.lang.Math.max(r11, r15)
            int r8 = r8.e()
            int r5 = r5 + r8
            r8 = r49
            r16 = r10
            goto L_0x016c
        L_0x0196:
            int r12 = r12 + r4
            if (r5 >= 0) goto L_0x019e
            int r12 = r12 + r5
            int r14 = r14 + r5
            r8 = r14
            r5 = 0
            goto L_0x019f
        L_0x019e:
            r8 = r14
        L_0x019f:
            int r4 = np0.c.c(r38)
            int r4 = np0.c.a(r4)
            int r10 = np0.c.a(r12)
            if (r4 != r10) goto L_0x01bd
            int r4 = np0.c.c(r38)
            int r4 = java.lang.Math.abs(r4)
            int r10 = java.lang.Math.abs(r12)
            if (r4 < r10) goto L_0x01bd
            float r4 = (float) r12
            goto L_0x01bf
        L_0x01bd:
            r4 = r38
        L_0x01bf:
            int r15 = -r5
            java.lang.Object r10 = kotlin.collections.s.W(r13)
            w.s r10 = (w.s) r10
            if (r3 <= 0) goto L_0x01fc
            int r12 = r13.size()
            r14 = r10
            r10 = r5
            r5 = 0
        L_0x01cf:
            if (r5 >= r12) goto L_0x01f6
            java.lang.Object r16 = r13.get(r5)
            w.s r16 = (w.s) r16
            int r3 = r16.e()
            if (r10 == 0) goto L_0x01f6
            if (r3 > r10) goto L_0x01f6
            r37 = r4
            int r4 = kotlin.collections.k.l(r13)
            if (r5 == r4) goto L_0x01f8
            int r10 = r10 - r3
            int r5 = r5 + 1
            java.lang.Object r3 = r13.get(r5)
            r14 = r3
            w.s r14 = (w.s) r14
            r3 = r34
            r4 = r37
            goto L_0x01cf
        L_0x01f6:
            r37 = r4
        L_0x01f8:
            r25 = r10
            r5 = r14
            goto L_0x0201
        L_0x01fc:
            r37 = r4
            r25 = r5
            r5 = r10
        L_0x0201:
            boolean r3 = r48.d()
            if (r3 == 0) goto L_0x0241
            java.lang.Object r3 = kotlin.collections.s.W(r13)
            w.s r3 = (w.s) r3
            int r3 = r3.b()
            int r4 = e(r2, r9)
            if (r3 <= r4) goto L_0x0241
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r4 = kotlin.collections.s.W(r13)
            w.s r4 = (w.s) r4
            int r4 = r4.b()
            int r4 = r4 + -1
            int r10 = e(r2, r9)
            if (r10 > r4) goto L_0x023e
        L_0x022e:
            int r12 = w.a.b(r4)
            w.s r12 = r6.a(r12)
            r3.add(r12)
            if (r4 == r10) goto L_0x023e
            int r4 = r4 + -1
            goto L_0x022e
        L_0x023e:
            bp0.k r4 = bp0.k.f22762a
            goto L_0x0245
        L_0x0241:
            java.util.List r3 = kotlin.collections.k.j()
        L_0x0245:
            boolean r4 = r48.d()
            if (r4 == 0) goto L_0x0282
            java.lang.Object r4 = kotlin.collections.s.h0(r13)
            w.s r4 = (w.s) r4
            int r4 = r4.b()
            int r10 = d(r2, r9)
            if (r4 >= r10) goto L_0x0282
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r10 = kotlin.collections.s.h0(r13)
            w.s r10 = (w.s) r10
            int r10 = r10.b()
            int r2 = d(r2, r9)
        L_0x026e:
            if (r10 >= r2) goto L_0x027e
            int r10 = r10 + 1
            int r12 = w.a.b(r10)
            w.s r12 = r6.a(r12)
            r4.add(r12)
            goto L_0x026e
        L_0x027e:
            bp0.k r2 = bp0.k.f22762a
            r12 = r4
            goto L_0x0287
        L_0x0282:
            java.util.List r2 = kotlin.collections.k.j()
            r12 = r2
        L_0x0287:
            java.lang.Object r2 = kotlin.collections.s.W(r13)
            boolean r2 = kotlin.jvm.internal.p.e(r5, r2)
            if (r2 == 0) goto L_0x02a0
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x02a0
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x02a0
            r26 = 1
            goto L_0x02a2
        L_0x02a0:
            r26 = 0
        L_0x02a2:
            if (r41 == 0) goto L_0x02a6
            r2 = r11
            goto L_0x02a7
        L_0x02a6:
            r2 = r8
        L_0x02a7:
            int r27 = d2.c.g(r0, r2)
            if (r41 == 0) goto L_0x02ae
            r11 = r8
        L_0x02ae:
            int r28 = d2.c.f(r0, r11)
            r10 = r13
            r11 = r3
            r29 = r13
            r13 = r27
            r30 = r36
            r14 = r28
            r0 = r15
            r4 = 0
            r15 = r8
            r16 = r33
            r17 = r0
            r18 = r41
            r19 = r43
            r20 = r44
            r21 = r45
            r22 = r46
            java.util.List r10 = a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = r42.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02ef
            r0 = r10
            r1 = r32
            r2 = r42
            r3 = r34
            r13 = r37
            r12 = r24
            r11 = 0
            r4 = r27
            r14 = r5
            r5 = r28
            w.q r0 = w.g.a(r0, r1, r2, r3, r4, r5)
            goto L_0x02f6
        L_0x02ef:
            r13 = r37
            r14 = r5
            r12 = r24
            r11 = 0
            r0 = 0
        L_0x02f6:
            r15 = r0
            int r1 = (int) r13
            r0 = r47
            r2 = r27
            r3 = r28
            r4 = r45
            r5 = r10
            r6 = r32
            r0.e(r1, r2, r3, r4, r5, r6)
            if (r8 <= r7) goto L_0x030a
            r3 = 1
            goto L_0x030b
        L_0x030a:
            r3 = 0
        L_0x030b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3 r2 = new androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
            r2.<init>(r10, r15)
            r4 = r49
            java.lang.Object r0 = r4.invoke(r0, r1, r2)
            r5 = r0
            i1.u r5 = (i1.u) r5
            if (r26 == 0) goto L_0x0325
            r6 = r10
            goto L_0x036a
        L_0x0325:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            int r1 = r10.size()
            r4 = 0
        L_0x0333:
            if (r4 >= r1) goto L_0x0369
            java.lang.Object r2 = r10.get(r4)
            r6 = r2
            w.q r6 = (w.q) r6
            int r7 = r6.getIndex()
            java.lang.Object r8 = kotlin.collections.s.W(r29)
            w.s r8 = (w.s) r8
            int r8 = r8.b()
            if (r7 < r8) goto L_0x035c
            int r7 = r6.getIndex()
            java.lang.Object r8 = kotlin.collections.s.h0(r29)
            w.s r8 = (w.s) r8
            int r8 = r8.b()
            if (r7 <= r8) goto L_0x035e
        L_0x035c:
            if (r6 != r15) goto L_0x0360
        L_0x035e:
            r6 = 1
            goto L_0x0361
        L_0x0360:
            r6 = 0
        L_0x0361:
            if (r6 == 0) goto L_0x0366
            r0.add(r2)
        L_0x0366:
            int r4 = r4 + 1
            goto L_0x0333
        L_0x0369:
            r6 = r0
        L_0x036a:
            if (r41 == 0) goto L_0x036f
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            goto L_0x0371
        L_0x036f:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
        L_0x0371:
            r11 = r0
            w.m r15 = new w.m
            r0 = r15
            r1 = r14
            r2 = r25
            r4 = r13
            r7 = r12
            r8 = r30
            r9 = r31
            r10 = r45
            r12 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r15
        L_0x0386:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r11.toString()
            r0.<init>(r1)
            throw r0
        L_0x0390:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r11.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.c(int, w.t, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$l, androidx.compose.foundation.layout.Arrangement$d, boolean, d2.e, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, w.e, lp0.q):w.m");
    }

    private static final int d(w.e eVar, int i11) {
        return Math.min(eVar.b(), i11 - 1);
    }

    private static final int e(w.e eVar, int i11) {
        return Math.min(eVar.c(), i11 - 1);
    }
}
