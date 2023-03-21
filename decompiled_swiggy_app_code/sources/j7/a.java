package j7;

import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import kotlin.jvm.internal.p;

/* compiled from: DialogActionExt.kt */
public final class a {
    public static final DialogActionButton a(MaterialDialog materialDialog, WhichButton whichButton) {
        DialogActionButton[] actionButtons;
        DialogActionButton dialogActionButton;
        p.k(materialDialog, "$this$getActionButton");
        p.k(whichButton, "which");
        DialogActionButtonLayout buttonsLayout = materialDialog.d().getButtonsLayout();
        if (buttonsLayout != null && (actionButtons = buttonsLayout.getActionButtons()) != null && (dialogActionButton = actionButtons[whichButton.getIndex()]) != null) {
            return dialogActionButton;
        }
        throw new IllegalStateException("The dialog does not have an attached buttons layout.");
    }
}
