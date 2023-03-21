package androidx.compose.ui.platform;

import android.view.KeyEvent;
import d1.b;
import d1.c;
import d1.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$keyInputModifier$1 extends Lambda implements l<b, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f6992a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f6992a = androidComposeView;
    }

    public final Boolean a(KeyEvent keyEvent) {
        p.j(keyEvent, "it");
        s0.b O = this.f6992a.O(keyEvent);
        if (O == null || !c.e(d.b(keyEvent), c.f13981a.a())) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.f6992a.getFocusManager().a(O.o()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((b) obj).f());
    }
}
