package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n3.d;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
final class ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 extends Lambda implements l<View, d> {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 f11702a = new ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2();

    ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2() {
        super(1);
    }

    /* renamed from: a */
    public final d invoke(View view) {
        p.j(view, "view");
        Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof d) {
            return (d) tag;
        }
        return null;
    }
}
