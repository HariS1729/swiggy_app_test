package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$3 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7801a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<k> f7802b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f7803c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f7804d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LayoutDirection f7805e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$3(PopupLayout popupLayout, a<k> aVar, h hVar, String str, LayoutDirection layoutDirection) {
        super(0);
        this.f7801a = popupLayout;
        this.f7802b = aVar;
        this.f7803c = hVar;
        this.f7804d = str;
        this.f7805e = layoutDirection;
    }

    public final void invoke() {
        this.f7801a.s(this.f7802b, this.f7803c, this.f7804d, this.f7805e);
    }
}
