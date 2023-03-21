package o7;

import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import kotlin.jvm.internal.p;

/* compiled from: DialogListExt.kt */
public final class a {
    public static final RecyclerView.Adapter<?> a(MaterialDialog materialDialog) {
        p.k(materialDialog, "$this$getListAdapter");
        DialogRecyclerView recyclerView = materialDialog.d().getContentLayout().getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getAdapter();
        }
        return null;
    }
}
