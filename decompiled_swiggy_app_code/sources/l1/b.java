package l1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.p;

/* compiled from: PrimaryTextActionModeCallback.android.kt */
public final class b implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final c f15435a;

    public b(c cVar) {
        p.j(cVar, "callback");
        this.f15435a = cVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f15435a.d(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f15435a.e(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f15435a.f();
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f15435a.g(actionMode, menu);
    }
}
