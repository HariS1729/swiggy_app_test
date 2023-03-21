package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import f1.a;
import f1.b;
import f1.r;
import kotlin.jvm.internal.p;

/* compiled from: AndroidComposeView.android.kt */
final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f7345a = new t();

    private t() {
    }

    public final void a(View view, r rVar) {
        PointerIcon pointerIcon;
        p.j(view, "view");
        if (rVar instanceof a) {
            pointerIcon = ((a) rVar).a();
        } else if (rVar instanceof b) {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), ((b) rVar).a());
        } else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!p.e(view.getPointerIcon(), pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
