package androidx.compose.ui.window;

import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: AndroidPopup.android.kt */
final class PopupLayout$canCalculatePosition$2 extends Lambda implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7857a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.f7857a = popupLayout;
    }

    /* renamed from: a */
    public final Boolean invoke() {
        return Boolean.valueOf((this.f7857a.getParentLayoutCoordinates() == null || this.f7857a.m0getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
