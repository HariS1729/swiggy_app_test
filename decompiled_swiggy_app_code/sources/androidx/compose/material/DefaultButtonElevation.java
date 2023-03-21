package androidx.compose.material;

import c0.b;
import kotlin.jvm.internal.i;

/* compiled from: Button.kt */
final class DefaultButtonElevation implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f4942a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final float f4943b;

    /* renamed from: c  reason: collision with root package name */
    private final float f4944c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final float f4945d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final float f4946e;

    private DefaultButtonElevation(float f11, float f12, float f13, float f14, float f15) {
        this.f4942a = f11;
        this.f4943b = f12;
        this.f4944c = f13;
        this.f4945d = f14;
        this.f4946e = f15;
    }

    public /* synthetic */ DefaultButtonElevation(float f11, float f12, float f13, float f14, float f15, i iVar) {
        this(f11, f12, f13, f14, f15);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e0.d1<d2.h> a(boolean r16, u.i r17, e0.g r18, int r19) {
        /*
            r15 = this;
            r6 = r15
            r0 = r17
            r7 = r18
            java.lang.String r1 = "interactionSource"
            kotlin.jvm.internal.p.j(r0, r1)
            r1 = -1598809227(0xffffffffa0b41b75, float:-3.0511356E-19)
            r7.E(r1)
            r1 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r7.E(r1)
            java.lang.Object r2 = r18.F()
            e0.g$a r3 = e0.g.f14172a
            java.lang.Object r4 = r3.a()
            if (r2 != r4) goto L_0x0029
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = androidx.compose.runtime.g.d()
            r7.y(r2)
        L_0x0029:
            r18.P()
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = (androidx.compose.runtime.snapshots.SnapshotStateList) r2
            androidx.compose.material.DefaultButtonElevation$elevation$1 r4 = new androidx.compose.material.DefaultButtonElevation$elevation$1
            r5 = 0
            r4.<init>(r0, r2, r5)
            int r8 = r19 >> 3
            r8 = r8 & 14
            e0.u.e(r0, r4, r7, r8)
            java.lang.Object r0 = kotlin.collections.s.i0(r2)
            r4 = r0
            u.h r4 = (u.h) r4
            if (r16 != 0) goto L_0x0048
            float r0 = r6.f4944c
        L_0x0046:
            r8 = r0
            goto L_0x0060
        L_0x0048:
            boolean r0 = r4 instanceof u.n
            if (r0 == 0) goto L_0x004f
            float r0 = r6.f4943b
            goto L_0x0046
        L_0x004f:
            boolean r0 = r4 instanceof u.f
            if (r0 == 0) goto L_0x0056
            float r0 = r6.f4945d
            goto L_0x0046
        L_0x0056:
            boolean r0 = r4 instanceof u.d
            if (r0 == 0) goto L_0x005d
            float r0 = r6.f4946e
            goto L_0x0046
        L_0x005d:
            float r0 = r6.f4942a
            goto L_0x0046
        L_0x0060:
            r7.E(r1)
            java.lang.Object r0 = r18.F()
            java.lang.Object r1 = r3.a()
            if (r0 != r1) goto L_0x0083
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            d2.h r10 = d2.h.k(r8)
            d2.h$a r1 = d2.h.f13997b
            v1$q0 r11 = androidx.compose.animation.core.VectorConvertersKt.b(r1)
            r12 = 0
            r13 = 4
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            r7.y(r0)
        L_0x0083:
            r18.P()
            r9 = r0
            androidx.compose.animation.core.Animatable r9 = (androidx.compose.animation.core.Animatable) r9
            r10 = 0
            if (r16 != 0) goto L_0x00a2
            r0 = -1598807427(0xffffffffa0b4227d, float:-3.0516009E-19)
            r7.E(r0)
            d2.h r0 = d2.h.k(r8)
            androidx.compose.material.DefaultButtonElevation$elevation$2 r1 = new androidx.compose.material.DefaultButtonElevation$elevation$2
            r1.<init>(r9, r8, r5)
            e0.u.e(r0, r1, r7, r10)
            r18.P()
            goto L_0x00bc
        L_0x00a2:
            r0 = -1598807256(0xffffffffa0b42328, float:-3.051645E-19)
            r7.E(r0)
            d2.h r11 = d2.h.k(r8)
            androidx.compose.material.DefaultButtonElevation$elevation$3 r12 = new androidx.compose.material.DefaultButtonElevation$elevation$3
            r5 = 0
            r0 = r12
            r1 = r9
            r2 = r15
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            e0.u.e(r11, r12, r7, r10)
            r18.P()
        L_0x00bc:
            e0.d1 r0 = r9.g()
            r18.P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DefaultButtonElevation.a(boolean, u.i, e0.g, int):e0.d1");
    }
}
