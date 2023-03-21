package d0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.Ripple;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.d1;
import e0.g;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.d0;

/* compiled from: Ripple.android.kt */
public final class a extends Ripple {
    private a(boolean z11, float f11, d1<d0> d1Var) {
        super(z11, f11, d1Var, (i) null);
    }

    public /* synthetic */ a(boolean z11, float f11, d1 d1Var, i iVar) {
        this(z11, f11, d1Var);
    }

    private final ViewGroup c(g gVar, int i11) {
        gVar.E(601470064);
        Object z11 = gVar.z(AndroidCompositionLocals_androidKt.k());
        while (!(z11 instanceof ViewGroup)) {
            ViewParent parent = ((View) z11).getParent();
            if (parent instanceof View) {
                p.i(parent, "parent");
                z11 = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + z11 + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) z11;
        gVar.P();
        return viewGroup;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: androidx.compose.material.ripple.AndroidRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: androidx.compose.material.ripple.AndroidRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: androidx.compose.material.ripple.CommonRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: androidx.compose.material.ripple.CommonRippleIndicationInstance} */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r15v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ac, code lost:
        if (r15 == e0.g.f14172a.a()) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r15 == e0.g.f14172a.a()) goto L_0x0046;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.material.ripple.b b(u.i r9, boolean r10, float r11, e0.d1<u0.d0> r12, e0.d1<d0.b> r13, e0.g r14, int r15) {
        /*
            r8 = this;
            java.lang.String r0 = "interactionSource"
            kotlin.jvm.internal.p.j(r9, r0)
            java.lang.String r0 = "color"
            kotlin.jvm.internal.p.j(r12, r0)
            java.lang.String r0 = "rippleAlpha"
            kotlin.jvm.internal.p.j(r13, r0)
            r0 = 1643266907(0x61f2435b, float:5.586207E20)
            r14.E(r0)
            int r15 = r15 >> 15
            r15 = r15 & 14
            android.view.ViewGroup r15 = r8.c(r14, r15)
            r0 = 1643267286(0x61f244d6, float:5.5863403E20)
            r14.E(r0)
            boolean r0 = r15.isInEditMode()
            if (r0 == 0) goto L_0x0060
            r15 = -3686552(0xffffffffffc7bf68, float:NaN)
            r14.E(r15)
            boolean r9 = r14.k(r9)
            boolean r15 = r14.k(r8)
            r9 = r9 | r15
            java.lang.Object r15 = r14.F()
            if (r9 != 0) goto L_0x0046
            e0.g$a r9 = e0.g.f14172a
            java.lang.Object r9 = r9.a()
            if (r15 != r9) goto L_0x0054
        L_0x0046:
            androidx.compose.material.ripple.CommonRippleIndicationInstance r15 = new androidx.compose.material.ripple.CommonRippleIndicationInstance
            r5 = 0
            r0 = r15
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r14.y(r15)
        L_0x0054:
            r14.P()
            androidx.compose.material.ripple.CommonRippleIndicationInstance r15 = (androidx.compose.material.ripple.CommonRippleIndicationInstance) r15
            r14.P()
            r14.P()
            return r15
        L_0x0060:
            r14.P()
            r0 = 0
            r1 = 0
            int r2 = r15.getChildCount()
        L_0x0069:
            if (r1 >= r2) goto L_0x0079
            int r3 = r1 + 1
            android.view.View r1 = r15.getChildAt(r1)
            boolean r4 = r1 instanceof d0.d
            if (r4 == 0) goto L_0x0077
            r0 = r1
            goto L_0x0079
        L_0x0077:
            r1 = r3
            goto L_0x0069
        L_0x0079:
            if (r0 != 0) goto L_0x008c
            d0.d r0 = new d0.d
            android.content.Context r1 = r15.getContext()
            java.lang.String r2 = "view.context"
            kotlin.jvm.internal.p.i(r1, r2)
            r0.<init>(r1)
            r15.addView(r0)
        L_0x008c:
            r15 = -3686095(0xffffffffffc7c131, float:NaN)
            r14.E(r15)
            boolean r9 = r14.k(r9)
            boolean r15 = r14.k(r8)
            r9 = r9 | r15
            boolean r15 = r14.k(r0)
            r9 = r9 | r15
            java.lang.Object r15 = r14.F()
            if (r9 != 0) goto L_0x00ae
            e0.g$a r9 = e0.g.f14172a
            java.lang.Object r9 = r9.a()
            if (r15 != r9) goto L_0x00bf
        L_0x00ae:
            androidx.compose.material.ripple.AndroidRippleIndicationInstance r15 = new androidx.compose.material.ripple.AndroidRippleIndicationInstance
            r6 = r0
            d0.d r6 = (d0.d) r6
            r7 = 0
            r1 = r15
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.y(r15)
        L_0x00bf:
            r14.P()
            androidx.compose.material.ripple.AndroidRippleIndicationInstance r15 = (androidx.compose.material.ripple.AndroidRippleIndicationInstance) r15
            r14.P()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a.b(u.i, boolean, float, e0.d1, e0.d1, e0.g, int):androidx.compose.material.ripple.b");
    }
}
