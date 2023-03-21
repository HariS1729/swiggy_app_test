package l1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.internal.p;
import t0.h;

/* compiled from: FloatingTextActionModeCallback.android.kt */
public final class a extends ActionMode.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    private final c f15434a;

    public a(c cVar) {
        p.j(cVar, "callback");
        this.f15434a = cVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f15434a.d(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f15434a.e(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f15434a.f();
    }

    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        h c11 = this.f15434a.c();
        if (rect != null) {
            rect.set((int) c11.i(), (int) c11.l(), (int) c11.j(), (int) c11.e());
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f15434a.g(actionMode, menu);
    }
}
