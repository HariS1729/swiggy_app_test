package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: TextFieldScroll.kt */
final class TextFieldScrollerPosition$Companion$Saver$2 extends Lambda implements l<List<? extends Object>, TextFieldScrollerPosition> {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldScrollerPosition$Companion$Saver$2 f4622a = new TextFieldScrollerPosition$Companion$Saver$2();

    TextFieldScrollerPosition$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: a */
    public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
        p.j(list, "restored");
        return new TextFieldScrollerPosition(((Boolean) list.get(1)).booleanValue() ? Orientation.Vertical : Orientation.Horizontal, ((Float) list.get(0)).floatValue());
    }
}
