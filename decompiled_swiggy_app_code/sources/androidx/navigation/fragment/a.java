package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.jvm.internal.p;

/* compiled from: Fragment.kt */
public final class a {
    public static final NavController a(Fragment fragment) {
        p.k(fragment, "$this$findNavController");
        NavController d02 = NavHostFragment.d0(fragment);
        p.f(d02, "NavHostFragment.findNavController(this)");
        return d02;
    }
}
