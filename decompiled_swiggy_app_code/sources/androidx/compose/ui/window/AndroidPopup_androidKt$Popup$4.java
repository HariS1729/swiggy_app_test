package androidx.compose.ui.window;

import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$4 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7806a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f7807b;

    /* compiled from: Effects.kt */
    public static final class a implements r {
        public void dispose() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$4(PopupLayout popupLayout, g gVar) {
        super(1);
        this.f7806a = popupLayout;
        this.f7807b = gVar;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        this.f7806a.setPositionProvider(this.f7807b);
        this.f7806a.v();
        return new a();
    }
}
