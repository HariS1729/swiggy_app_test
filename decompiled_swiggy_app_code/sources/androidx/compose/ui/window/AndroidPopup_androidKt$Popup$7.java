package androidx.compose.ui.window;

import bp0.k;
import i1.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$7 extends Lambda implements l<m, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7812a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$7(PopupLayout popupLayout) {
        super(1);
        this.f7812a = popupLayout;
    }

    public final void a(m mVar) {
        p.j(mVar, "childCoordinates");
        m s11 = mVar.s();
        p.g(s11);
        this.f7812a.u(s11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((m) obj);
        return k.f22762a;
    }
}
