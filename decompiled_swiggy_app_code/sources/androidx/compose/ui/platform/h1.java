package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.internal.p;

/* compiled from: AndroidTextToolbar.android.kt */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f7307a = new h1();

    private h1() {
    }

    public final void a(ActionMode actionMode) {
        p.j(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i11) {
        p.j(view, "view");
        p.j(callback, "actionModeCallback");
        return view.startActionMode(callback, i11);
    }
}
