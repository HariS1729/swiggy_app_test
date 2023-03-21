package androidx.fragment.app;

import android.os.Bundle;
import kotlin.jvm.internal.p;

/* compiled from: Fragment.kt */
public final class i {
    public static final void a(Fragment fragment, String str, Bundle bundle) {
        p.j(fragment, "$this$setFragmentResult");
        p.j(str, "requestKey");
        p.j(bundle, "result");
        fragment.getParentFragmentManager().u1(str, bundle);
    }
}
