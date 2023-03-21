package v1;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.input.TextFieldValue;
import p1.a0;

/* compiled from: InputState.android.kt */
public final class p {
    public static final ExtractedText a(TextFieldValue textFieldValue) {
        kotlin.jvm.internal.p.j(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = a0.l(textFieldValue.g());
        extractedText.selectionEnd = a0.k(textFieldValue.g());
        extractedText.flags = StringsKt__StringsKt.R(textFieldValue.h(), 10, false, 2, (Object) null) ^ true ? 1 : 0;
        return extractedText;
    }
}
