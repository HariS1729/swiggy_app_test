package m7;

import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import q7.f;

/* compiled from: DialogActionButtonLayout.kt */
public final class a {
    public static final boolean a(DialogActionButtonLayout dialogActionButtonLayout) {
        if (dialogActionButtonLayout == null) {
            return false;
        }
        return ((dialogActionButtonLayout.getVisibleButtons().length == 0) ^ true) || f.e(dialogActionButtonLayout.getCheckBoxPrompt());
    }
}
