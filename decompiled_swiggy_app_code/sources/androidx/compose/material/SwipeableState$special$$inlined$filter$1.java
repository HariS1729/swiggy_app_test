package androidx.compose.material;

import bp0.k;
import fp0.c;
import java.util.Map;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;

/* compiled from: SafeCollector.common.kt */
public final class SwipeableState$special$$inlined$filter$1 implements d<Map<Float, ? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f5515a;

    public SwipeableState$special$$inlined$filter$1(d dVar) {
        this.f5515a = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.f5515a.collect(new e<Map<Float, ? extends T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, fp0.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.f5518b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f5518b = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f5517a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                    int r2 = r0.f5518b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    bp0.g.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    bp0.g.b(r6)
                    kotlinx.coroutines.flow.e r6 = r3
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L_0x0049
                    r0.f5518b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    bp0.k r5 = bp0.k.f22762a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, fp0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }
}
