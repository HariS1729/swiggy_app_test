package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;
import bp0.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import l1.b;
import l1.c;
import lp0.a;
import t0.h;

/* compiled from: AndroidTextToolbar.android.kt */
public final class AndroidTextToolbar implements g1 {

    /* renamed from: a  reason: collision with root package name */
    private final View f7070a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ActionMode f7071b;

    /* renamed from: c  reason: collision with root package name */
    private final c f7072c = new c(new AndroidTextToolbar$textActionModeCallback$1(this), (h) null, (a) null, (a) null, (a) null, (a) null, 62, (i) null);

    /* renamed from: d  reason: collision with root package name */
    private TextToolbarStatus f7073d = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        p.j(view, "view");
        this.f7070a = view;
    }

    public void a(h hVar, a<k> aVar, a<k> aVar2, a<k> aVar3, a<k> aVar4) {
        ActionMode actionMode;
        p.j(hVar, "rect");
        this.f7072c.l(hVar);
        this.f7072c.h(aVar);
        this.f7072c.i(aVar3);
        this.f7072c.j(aVar2);
        this.f7072c.k(aVar4);
        ActionMode actionMode2 = this.f7071b;
        if (actionMode2 == null) {
            this.f7073d = TextToolbarStatus.Shown;
            if (Build.VERSION.SDK_INT >= 23) {
                actionMode = h1.f7307a.b(this.f7070a, new l1.a(this.f7072c), 1);
            } else {
                actionMode = this.f7070a.startActionMode(new b(this.f7072c));
            }
            this.f7071b = actionMode;
        } else if (actionMode2 != null) {
            actionMode2.invalidate();
        }
    }

    public void b() {
        this.f7073d = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.f7071b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f7071b = null;
    }

    public TextToolbarStatus getStatus() {
        return this.f7073d;
    }
}
