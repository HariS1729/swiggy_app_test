package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.runtime.R;

/* compiled from: ViewTreeLifecycleOwner */
public class q0 {
    public static r a(View view) {
        r rVar = (r) view.getTag(R.id.view_tree_lifecycle_owner);
        if (rVar != null) {
            return rVar;
        }
        ViewParent parent = view.getParent();
        while (rVar == null && (parent instanceof View)) {
            View view2 = (View) parent;
            rVar = (r) view2.getTag(R.id.view_tree_lifecycle_owner);
            parent = view2.getParent();
        }
        return rVar;
    }

    public static void b(View view, r rVar) {
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
