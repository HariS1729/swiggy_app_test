package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.viewmodel.R;

/* compiled from: ViewTreeViewModelStoreOwner */
public class r0 {
    public static p0 a(View view) {
        p0 p0Var = (p0) view.getTag(R.id.view_tree_view_model_store_owner);
        if (p0Var != null) {
            return p0Var;
        }
        ViewParent parent = view.getParent();
        while (p0Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            p0Var = (p0) view2.getTag(R.id.view_tree_view_model_store_owner);
            parent = view2.getParent();
        }
        return p0Var;
    }

    public static void b(View view, p0 p0Var) {
        view.setTag(R.id.view_tree_view_model_store_owner, p0Var);
    }
}
