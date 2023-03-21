package androidx.compose.ui.platform;

import b1.a;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$_inputModeManager$1 extends Lambda implements l<a, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f6983a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f6983a = androidComposeView;
    }

    public final Boolean a(int i11) {
        boolean z11;
        a.C0099a aVar = a.f12567b;
        if (a.f(i11, aVar.b())) {
            z11 = this.f6983a.isInTouchMode();
        } else {
            z11 = a.f(i11, aVar.a()) ? this.f6983a.isInTouchMode() ? this.f6983a.requestFocusFromTouch() : true : false;
        }
        return Boolean.valueOf(z11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((a) obj).i());
    }
}
