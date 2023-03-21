package androidx.compose.ui.platform;

import android.view.View;
import kotlin.jvm.internal.p;

/* compiled from: ViewLayer.android.kt */
final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final p1 f7331a = new p1();

    private p1() {
    }

    public final void a(View view, int i11) {
        p.j(view, "view");
        view.setOutlineAmbientShadowColor(i11);
    }

    public final void b(View view, int i11) {
        p.j(view, "view");
        view.setOutlineSpotShadowColor(i11);
    }
}
