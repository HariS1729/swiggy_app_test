package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: FragmentContainer */
public abstract class e {
    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract View c(int i11);

    public abstract boolean d();
}
