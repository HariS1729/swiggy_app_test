package androidx.savedstate;

import android.view.View;
import kotlin.jvm.internal.p;
import n3.d;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
public final class ViewTreeSavedStateRegistryOwner {
    public static final d a(View view) {
        p.j(view, "<this>");
        return (d) SequencesKt___SequencesKt.o(SequencesKt___SequencesKt.u(SequencesKt__SequencesKt.e(view, ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1.f11701a), ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2.f11702a));
    }

    public static final void b(View view, d dVar) {
        p.j(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, dVar);
    }
}
