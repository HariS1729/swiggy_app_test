package androidx.compose.runtime.saveable;

import androidx.compose.runtime.g;
import m0.b;
import n0.l;

/* compiled from: RememberSaveable.kt */
public final class RememberSaveableKt {

    /* renamed from: a  reason: collision with root package name */
    private static final int f6180a = 36;

    /* JADX WARNING: type inference failed for: r8v0, types: [lp0.a<? extends T>, java.lang.Object, lp0.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T b(java.lang.Object[] r5, m0.c<T, ? extends java.lang.Object> r6, java.lang.String r7, lp0.a<? extends T> r8, e0.g r9, int r10, int r11) {
        /*
            java.lang.String r10 = "inputs"
            kotlin.jvm.internal.p.j(r5, r10)
            java.lang.String r10 = "init"
            kotlin.jvm.internal.p.j(r8, r10)
            r10 = 441892779(0x1a56bfab, float:4.440899E-23)
            r9.E(r10)
            r10 = r11 & 2
            if (r10 == 0) goto L_0x0018
            m0.c r6 = androidx.compose.runtime.saveable.SaverKt.b()
        L_0x0018:
            r10 = r11 & 4
            r11 = 0
            if (r10 == 0) goto L_0x001e
            r7 = r11
        L_0x001e:
            r10 = 1059366469(0x3f24a645, float:0.6431621)
            r9.E(r10)
            r10 = 0
            if (r7 == 0) goto L_0x0030
            int r0 = r7.length()
            if (r0 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r0 != 0) goto L_0x0034
            goto L_0x0047
        L_0x0034:
            int r7 = e0.f.a(r9, r10)
            int r0 = f6180a
            int r0 = kotlin.text.b.a(r0)
            java.lang.String r7 = java.lang.Integer.toString(r7, r0)
            java.lang.String r0 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.p.i(r7, r0)
        L_0x0047:
            r9.P()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>"
            java.util.Objects.requireNonNull(r6, r0)
            e0.m0 r0 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.b()
            java.lang.Object r0 = r9.z(r0)
            m0.b r0 = (m0.b) r0
            int r1 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            r1 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r9.E(r1)
            int r1 = r5.length
            r2 = 0
            r3 = 0
        L_0x0067:
            if (r2 >= r1) goto L_0x0073
            r4 = r5[r2]
            boolean r4 = r9.k(r4)
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L_0x0067
        L_0x0073:
            java.lang.Object r5 = r9.F()
            if (r3 != 0) goto L_0x0081
            e0.g$a r1 = e0.g.f14172a
            java.lang.Object r1 = r1.a()
            if (r5 != r1) goto L_0x0098
        L_0x0081:
            if (r0 == 0) goto L_0x008d
            java.lang.Object r5 = r0.c(r7)
            if (r5 == 0) goto L_0x008d
            java.lang.Object r11 = r6.a(r5)
        L_0x008d:
            if (r11 != 0) goto L_0x0094
            java.lang.Object r5 = r8.invoke()
            goto L_0x0095
        L_0x0094:
            r5 = r11
        L_0x0095:
            r9.y(r5)
        L_0x0098:
            r9.P()
            if (r0 == 0) goto L_0x00ad
            e0.d1 r6 = androidx.compose.runtime.g.m(r6, r9, r10)
            e0.d1 r8 = androidx.compose.runtime.g.m(r5, r9, r10)
            androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1 r11 = new androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1
            r11.<init>(r0, r7, r6, r8)
            e0.u.a(r0, r7, r11, r9, r10)
        L_0x00ad:
            r9.P()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.RememberSaveableKt.b(java.lang.Object[], m0.c, java.lang.String, lp0.a, e0.g, int, int):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void c(b bVar, Object obj) {
        String str;
        if (obj != null && !bVar.a(obj)) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (lVar.c() == g.i() || lVar.c() == g.o() || lVar.c() == g.l()) {
                    str = "MutableState containing " + lVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }
}
