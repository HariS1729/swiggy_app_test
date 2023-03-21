package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import lp0.p;
import lp0.q;

/* compiled from: ConstraintScopeCommon.kt */
public final class AnchorFunctions {

    /* renamed from: a  reason: collision with root package name */
    public static final AnchorFunctions f7878a = new AnchorFunctions();

    /* renamed from: b  reason: collision with root package name */
    private static final q<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>[][] f7879b = {new q[]{AnchorFunctions$verticalAnchorFunctions$1.f7888a, AnchorFunctions$verticalAnchorFunctions$2.f7889a}, new q[]{AnchorFunctions$verticalAnchorFunctions$3.f7890a, AnchorFunctions$verticalAnchorFunctions$4.f7891a}};

    /* renamed from: c  reason: collision with root package name */
    private static final p<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>[][] f7880c = {new p[]{AnchorFunctions$horizontalAnchorFunctions$1.f7884a, AnchorFunctions$horizontalAnchorFunctions$2.f7885a}, new p[]{AnchorFunctions$horizontalAnchorFunctions$3.f7886a, AnchorFunctions$horizontalAnchorFunctions$4.f7887a}};

    /* renamed from: d  reason: collision with root package name */
    private static final p<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a> f7881d = AnchorFunctions$baselineAnchorFunction$1.f7883a;

    /* compiled from: ConstraintScopeCommon.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7882a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f7882a = iArr;
        }
    }

    private AnchorFunctions() {
    }

    /* access modifiers changed from: private */
    public final void c(androidx.constraintlayout.core.state.a aVar, LayoutDirection layoutDirection) {
        aVar.G((Object) null);
        aVar.H((Object) null);
        int i11 = a.f7882a[layoutDirection.ordinal()];
        if (i11 == 1) {
            aVar.h0((Object) null);
            aVar.g0((Object) null);
        } else if (i11 == 2) {
            aVar.y((Object) null);
            aVar.x((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final void d(androidx.constraintlayout.core.state.a aVar, LayoutDirection layoutDirection) {
        aVar.P((Object) null);
        aVar.Q((Object) null);
        int i11 = a.f7882a[layoutDirection.ordinal()];
        if (i11 == 1) {
            aVar.y((Object) null);
            aVar.x((Object) null);
        } else if (i11 == 2) {
            aVar.h0((Object) null);
            aVar.g0((Object) null);
        }
    }

    public final p<androidx.constraintlayout.core.state.a, Object, androidx.constraintlayout.core.state.a>[][] e() {
        return f7880c;
    }

    public final q<androidx.constraintlayout.core.state.a, Object, LayoutDirection, androidx.constraintlayout.core.state.a>[][] f() {
        return f7879b;
    }

    public final int g(int i11, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(layoutDirection, "layoutDirection");
        return i11 >= 0 ? i11 : layoutDirection == LayoutDirection.Ltr ? i11 + 2 : (-i11) - 1;
    }
}
