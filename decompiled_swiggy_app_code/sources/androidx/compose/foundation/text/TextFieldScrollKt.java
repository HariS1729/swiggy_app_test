package androidx.compose.foundation.text;

import a0.s;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.input.TextFieldValue;
import d2.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import p0.d;
import p1.y;
import t0.h;
import u.k;
import v1.d0;
import v1.f0;

/* compiled from: TextFieldScroll.kt */
public final class TextFieldScrollKt {

    /* compiled from: TextFieldScroll.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4609a;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            f4609a = iArr;
        }
    }

    /* access modifiers changed from: private */
    public static final h b(e eVar, int i11, d0 d0Var, y yVar, boolean z11, int i12) {
        h hVar;
        float f11;
        float f12;
        if (yVar == null || (hVar = yVar.d(d0Var.a().b(i11))) == null) {
            hVar = h.f16667e.a();
        }
        h hVar2 = hVar;
        int j02 = eVar.j0(TextFieldCursorKt.d());
        if (z11) {
            f11 = (((float) i12) - hVar2.i()) - ((float) j02);
        } else {
            f11 = hVar2.i();
        }
        float f13 = f11;
        if (z11) {
            f12 = ((float) i12) - hVar2.i();
        } else {
            f12 = hVar2.i() + ((float) j02);
        }
        return h.d(hVar2, f13, 0.0f, f12, 0.0f, 10, (Object) null);
    }

    public static final d c(d dVar, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, f0 f0Var, lp0.a<s> aVar) {
        d dVar2;
        p.j(dVar, "<this>");
        p.j(textFieldScrollerPosition, "scrollerPosition");
        p.j(textFieldValue, "textFieldValue");
        p.j(f0Var, "visualTransformation");
        p.j(aVar, "textLayoutResultProvider");
        Orientation f11 = textFieldScrollerPosition.f();
        int e11 = textFieldScrollerPosition.e(textFieldValue.g());
        textFieldScrollerPosition.i(textFieldValue.g());
        d0 a11 = f0Var.a(textFieldValue.e());
        int i11 = a.f4609a[f11.ordinal()];
        if (i11 == 1) {
            dVar2 = new VerticalScrollLayoutModifier(textFieldScrollerPosition, e11, a11, aVar);
        } else if (i11 == 2) {
            dVar2 = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, e11, a11, aVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return r0.d.b(dVar).N(dVar2);
    }

    public static final d d(d dVar, TextFieldScrollerPosition textFieldScrollerPosition, k kVar, boolean z11) {
        p.j(dVar, "<this>");
        p.j(textFieldScrollerPosition, "scrollerPosition");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(textFieldScrollerPosition, kVar, z11) : InspectableValueKt.a(), new TextFieldScrollKt$textFieldScrollable$2(textFieldScrollerPosition, z11, kVar));
    }
}
