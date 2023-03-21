package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.k;

public final class PreferenceScreen extends PreferenceGroup {
    private boolean Q = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, R.attr.preferenceScreenStyle, 16842891));
    }

    /* access modifiers changed from: protected */
    public void y() {
        if (k() == null && j() == null && O() != 0) {
            p();
            throw null;
        }
    }
}
