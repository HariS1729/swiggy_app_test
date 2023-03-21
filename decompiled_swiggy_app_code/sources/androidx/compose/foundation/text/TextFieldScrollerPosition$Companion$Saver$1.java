package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;

/* compiled from: TextFieldScroll.kt */
final class TextFieldScrollerPosition$Companion$Saver$1 extends Lambda implements p<d, TextFieldScrollerPosition, List<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldScrollerPosition$Companion$Saver$1 f4621a = new TextFieldScrollerPosition$Companion$Saver$1();

    TextFieldScrollerPosition$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: a */
    public final List<Object> invoke(d dVar, TextFieldScrollerPosition textFieldScrollerPosition) {
        kotlin.jvm.internal.p.j(dVar, "$this$listSaver");
        kotlin.jvm.internal.p.j(textFieldScrollerPosition, "it");
        Object[] objArr = new Object[2];
        boolean z11 = false;
        objArr[0] = Float.valueOf(textFieldScrollerPosition.d());
        if (textFieldScrollerPosition.f() == Orientation.Vertical) {
            z11 = true;
        }
        objArr[1] = Boolean.valueOf(z11);
        return k.m(objArr);
    }
}
