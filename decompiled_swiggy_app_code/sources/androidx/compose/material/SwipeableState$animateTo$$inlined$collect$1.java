package androidx.compose.material;

import defpackage.v1;
import java.util.Map;
import kotlinx.coroutines.flow.e;

/* compiled from: Collect.kt */
public final class SwipeableState$animateTo$$inlined$collect$1 implements e<Map<Float, ? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f5507a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SwipeableState f5508b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v1.g f5509c;

    public SwipeableState$animateTo$$inlined$collect$1(Object obj, SwipeableState swipeableState, v1.g gVar) {
        this.f5507a = obj;
        this.f5508b = swipeableState;
        this.f5509c = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r9, fp0.c<? super bp0.k> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1.AnonymousClass1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1$1 r0 = (androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1.AnonymousClass1) r0
            int r1 = r0.f5511b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5511b = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1$1 r0 = new androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f5510a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f5511b
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r5) goto L_0x0037
            java.lang.Object r9 = r0.f5514e
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r0 = r0.f5513d
            androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1 r0 = (androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1) r0
            bp0.g.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x0062
        L_0x0034:
            r10 = move-exception
            goto L_0x00d5
        L_0x0037:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003f:
            bp0.g.b(r10)
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r10 = r8.f5507a     // Catch:{ all -> 0x00d3 }
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.e(r9, r10)     // Catch:{ all -> 0x00d3 }
            if (r10 == 0) goto L_0x00c7
            androidx.compose.material.SwipeableState r2 = r8.f5508b     // Catch:{ all -> 0x00d3 }
            float r10 = r10.floatValue()     // Catch:{ all -> 0x00d3 }
            v1$g r6 = r8.f5509c     // Catch:{ all -> 0x00d3 }
            r0.f5513d = r8     // Catch:{ all -> 0x00d3 }
            r0.f5514e = r9     // Catch:{ all -> 0x00d3 }
            r0.f5511b = r5     // Catch:{ all -> 0x00d3 }
            java.lang.Object r10 = r2.h(r10, r6, r0)     // Catch:{ all -> 0x00d3 }
            if (r10 != r1) goto L_0x0061
            return r1
        L_0x0061:
            r0 = r8
        L_0x0062:
            androidx.compose.material.SwipeableState r10 = r0.f5508b
            e0.h0 r10 = r10.f5500g
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x007f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00af
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r6 = r2.getKey()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r6 = r6 - r10
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00a0
            r6 = 1
            goto L_0x00a1
        L_0x00a0:
            r6 = 0
        L_0x00a1:
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r1.put(r6, r2)
            goto L_0x007f
        L_0x00af:
            java.util.Collection r9 = r1.values()
            java.lang.Object r9 = kotlin.collections.s.X(r9)
            if (r9 != 0) goto L_0x00bf
            androidx.compose.material.SwipeableState r9 = r0.f5508b
            java.lang.Object r9 = r9.o()
        L_0x00bf:
            androidx.compose.material.SwipeableState r10 = r0.f5508b
            r10.B(r9)
            bp0.k r9 = bp0.k.f22762a
            return r9
        L_0x00c7:
            java.lang.String r10 = "The target value must have an associated anchor."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00d3 }
            r0.<init>(r10)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r10 = move-exception
            r0 = r8
        L_0x00d5:
            androidx.compose.material.SwipeableState r1 = r0.f5508b
            e0.h0 r1 = r1.f5500g
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00f2:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x0122
            java.lang.Object r6 = r9.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r7 = r7 - r1
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0113
            r7 = 1
            goto L_0x0114
        L_0x0113:
            r7 = 0
        L_0x0114:
            if (r7 == 0) goto L_0x00f2
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r2.put(r7, r6)
            goto L_0x00f2
        L_0x0122:
            java.util.Collection r9 = r2.values()
            java.lang.Object r9 = kotlin.collections.s.X(r9)
            if (r9 != 0) goto L_0x0132
            androidx.compose.material.SwipeableState r9 = r0.f5508b
            java.lang.Object r9 = r9.o()
        L_0x0132:
            androidx.compose.material.SwipeableState r0 = r0.f5508b
            r0.B(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$animateTo$$inlined$collect$1.emit(java.lang.Object, fp0.c):java.lang.Object");
    }
}
