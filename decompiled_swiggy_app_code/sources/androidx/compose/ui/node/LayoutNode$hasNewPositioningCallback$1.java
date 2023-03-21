package androidx.compose.ui.node;

import f0.e;
import i1.z;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: LayoutNode.kt */
final class LayoutNode$hasNewPositioningCallback$1 extends Lambda implements p<d.b, Boolean, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e<Pair<LayoutNodeWrapper, z>> f6858a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNode$hasNewPositioningCallback$1(e<Pair<LayoutNodeWrapper, z>> eVar) {
        super(2);
        this.f6858a = eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r1 == null) goto L_0x0035;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean a(p0.d.b r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "mod"
            kotlin.jvm.internal.p.j(r7, r0)
            r0 = 0
            if (r8 != 0) goto L_0x0035
            boolean r8 = r7 instanceof i1.z
            if (r8 == 0) goto L_0x0036
            f0.e<kotlin.Pair<androidx.compose.ui.node.LayoutNodeWrapper, i1.z>> r8 = r6.f6858a
            r1 = 0
            if (r8 == 0) goto L_0x0033
            int r2 = r8.m()
            if (r2 <= 0) goto L_0x0031
            java.lang.Object[] r8 = r8.l()
            r3 = 0
        L_0x001c:
            r4 = r8[r3]
            r5 = r4
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r5 = r5.d()
            boolean r5 = kotlin.jvm.internal.p.e(r7, r5)
            if (r5 == 0) goto L_0x002d
            r1 = r4
            goto L_0x0031
        L_0x002d:
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x001c
        L_0x0031:
            kotlin.Pair r1 = (kotlin.Pair) r1
        L_0x0033:
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode$hasNewPositioningCallback$1.a(p0.d$b, boolean):java.lang.Boolean");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((d.b) obj, ((Boolean) obj2).booleanValue());
    }
}
