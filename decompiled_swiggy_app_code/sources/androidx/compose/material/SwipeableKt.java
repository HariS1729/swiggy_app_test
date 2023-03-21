package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import c0.s;
import c0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.p;
import p0.d;
import u.k;

/* compiled from: Swipeable.kt */
public final class SwipeableKt {
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float c(float r3, float r4, java.util.Set<java.lang.Float> r5, lp0.p<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = d(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L_0x006c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0062
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0042
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            return r5
        L_0x002b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x005e
            goto L_0x0060
        L_0x0042:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
        L_0x005e:
            r4 = r5
            goto L_0x006c
        L_0x0060:
            r4 = r0
            goto L_0x006c
        L_0x0062:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.c(float, float, java.util.Set, lp0.p, float, float):float");
    }

    private static final List<Float> d(float f11, Set<Float> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = set.iterator();
        while (true) {
            boolean z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (((double) ((Number) next).floatValue()) > ((double) f11) + 0.001d) {
                z11 = false;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        Float j02 = s.j0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : set) {
            if (((double) ((Number) next2).floatValue()) >= ((double) f11) - 0.001d) {
                arrayList2.add(next2);
            }
        }
        Float l02 = s.l0(arrayList2);
        if (j02 == null) {
            return k.n(l02);
        }
        if (l02 == null) {
            return j.d(j02);
        }
        if (p.d(j02, l02)) {
            return j.d(j02);
        }
        return k.m(j02, l02);
    }

    /* access modifiers changed from: private */
    public static final <T> Float e(Map<Float, ? extends T> map, T t) {
        T t11;
        Iterator<T> it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it2.next();
            if (p.e(((Map.Entry) t11).getValue(), t)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t11;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: lp0.l<androidx.compose.ui.platform.n0, bp0.k>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v6, types: [lp0.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> p0.d f(p0.d r16, androidx.compose.material.SwipeableState<T> r17, java.util.Map<java.lang.Float, ? extends T> r18, androidx.compose.foundation.gestures.Orientation r19, boolean r20, boolean r21, u.k r22, lp0.p<? super T, ? super T, ? extends c0.f0> r23, c0.s r24, float r25) {
        /*
            r0 = r16
            java.lang.String r1 = "$this$swipeable"
            kotlin.jvm.internal.p.j(r0, r1)
            java.lang.String r1 = "state"
            r12 = r17
            kotlin.jvm.internal.p.j(r12, r1)
            java.lang.String r1 = "anchors"
            r13 = r18
            kotlin.jvm.internal.p.j(r13, r1)
            java.lang.String r1 = "orientation"
            r14 = r19
            kotlin.jvm.internal.p.j(r14, r1)
            java.lang.String r1 = "thresholds"
            r15 = r23
            kotlin.jvm.internal.p.j(r15, r1)
            boolean r1 = androidx.compose.ui.platform.InspectableValueKt.c()
            if (r1 == 0) goto L_0x0042
            androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0046
        L_0x0042:
            lp0.l r1 = androidx.compose.ui.platform.InspectableValueKt.a()
        L_0x0046:
            androidx.compose.material.SwipeableKt$swipeable$3 r11 = new androidx.compose.material.SwipeableKt$swipeable$3
            r2 = r11
            r3 = r18
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r21
            r9 = r24
            r10 = r23
            r12 = r11
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            p0.d r0 = androidx.compose.ui.ComposedModifierKt.c(r0, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.f(p0.d, androidx.compose.material.SwipeableState, java.util.Map, androidx.compose.foundation.gestures.Orientation, boolean, boolean, u.k, lp0.p, c0.s, float):p0.d");
    }

    public static /* synthetic */ d g(d dVar, SwipeableState swipeableState, Map map, Orientation orientation, boolean z11, boolean z12, k kVar, lp0.p pVar, s sVar, float f11, int i11, Object obj) {
        int i12 = i11;
        return f(dVar, swipeableState, map, orientation, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : kVar, (i12 & 64) != 0 ? SwipeableKt$swipeable$1.f5467a : pVar, (i12 & 128) != 0 ? z.c(z.f12756a, map.keySet(), 0.0f, 0.0f, 6, (Object) null) : sVar, (i12 & 256) != 0 ? z.f12756a.a() : f11);
    }
}
