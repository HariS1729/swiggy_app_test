package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.c;

/* compiled from: AppCompatDialogFragment */
public class h extends c {
    public Dialog onCreateDialog(Bundle bundle) {
        return new g(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i11) {
        if (dialog instanceof g) {
            g gVar = (g) dialog;
            if (!(i11 == 1 || i11 == 2)) {
                if (i11 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            gVar.d(1);
            return;
        }
        super.setupDialog(dialog, i11);
    }
}
