package coil.compose;

import bp0.k;
import fp0.c;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;
import y6.g;

/* compiled from: SafeCollector.common.kt */
public final class ConstraintsSizeResolver$size$$inlined$mapNotNull$1 implements d<g> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f13461a;

    public ConstraintsSizeResolver$size$$inlined$mapNotNull$1(d dVar) {
        this.f13461a = dVar;
    }

    public Object collect(final e eVar, c cVar) {
        Object collect = this.f13461a.collect(new e() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, fp0.c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 r0 = (coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.f13464b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f13464b = r1
                    goto L_0x0018
                L_0x0013:
                    coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 r0 = new coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f13463a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                    int r2 = r0.f13464b
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    bp0.g.b(r8)
                    goto L_0x004c
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    bp0.g.b(r8)
                    kotlinx.coroutines.flow.e r8 = r3
                    d2.b r7 = (d2.b) r7
                    long r4 = r7.t()
                    y6.g r7 = coil.compose.AsyncImageKt.e(r4)
                    if (r7 != 0) goto L_0x0043
                    goto L_0x004c
                L_0x0043:
                    r0.f13464b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    bp0.k r7 = bp0.k.f22762a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, fp0.c):java.lang.Object");
            }
        }, cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }
}
