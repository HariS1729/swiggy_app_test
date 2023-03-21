package s0;

import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import s0.b;

/* compiled from: FocusOrderModifier.kt */
public final class j {

    /* compiled from: FocusOrderModifier.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16573a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f16573a = iArr;
        }
    }

    public static final o a(FocusModifier focusModifier, int i11, LayoutDirection layoutDirection) {
        o oVar;
        o oVar2;
        p.j(focusModifier, "$this$customFocusSearch");
        p.j(layoutDirection, "layoutDirection");
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.d())) {
            return focusModifier.g().getNext();
        }
        if (b.l(i11, aVar.f())) {
            return focusModifier.g().f();
        }
        if (b.l(i11, aVar.h())) {
            return focusModifier.g().b();
        }
        if (b.l(i11, aVar.a())) {
            return focusModifier.g().d();
        }
        if (b.l(i11, aVar.c())) {
            int i12 = a.f16573a[layoutDirection.ordinal()];
            if (i12 == 1) {
                oVar2 = focusModifier.g().getStart();
            } else if (i12 == 2) {
                oVar2 = focusModifier.g().getEnd();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (p.e(oVar2, o.f16587b.a())) {
                oVar2 = null;
            }
            if (oVar2 == null) {
                return focusModifier.g().getLeft();
            }
        } else if (b.l(i11, aVar.g())) {
            int i13 = a.f16573a[layoutDirection.ordinal()];
            if (i13 == 1) {
                oVar = focusModifier.g().getEnd();
            } else if (i13 == 2) {
                oVar = focusModifier.g().getStart();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (p.e(oVar, o.f16587b.a())) {
                oVar = null;
            }
            if (oVar2 == null) {
                return focusModifier.g().getRight();
            }
        } else if (b.l(i11, aVar.b())) {
            return o.f16587b.a();
        } else {
            if (b.l(i11, aVar.e())) {
                return o.f16587b.a();
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return oVar2;
    }
}
