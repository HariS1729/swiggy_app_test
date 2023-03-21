package v1;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.p;
import p1.a0;
import p1.b;

/* compiled from: TextFieldValue.kt */
public final class z {
    public static final b a(TextFieldValue textFieldValue) {
        p.j(textFieldValue, "<this>");
        return textFieldValue.e().k(textFieldValue.g());
    }

    public static final b b(TextFieldValue textFieldValue, int i11) {
        p.j(textFieldValue, "<this>");
        return textFieldValue.e().subSequence(a0.k(textFieldValue.g()), Math.min(a0.k(textFieldValue.g()) + i11, textFieldValue.h().length()));
    }

    public static final b c(TextFieldValue textFieldValue, int i11) {
        p.j(textFieldValue, "<this>");
        return textFieldValue.e().subSequence(Math.max(0, a0.l(textFieldValue.g()) - i11), a0.l(textFieldValue.g()));
    }
}
