package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.k;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
    }

    public boolean K() {
        return !super.u();
    }

    public boolean u() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.preferenceCategoryStyle, 16842892));
    }
}
