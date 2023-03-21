package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$2 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PopupLayout f7795a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ lp0.a<k> f7796b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f7797c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f7798d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LayoutDirection f7799e;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PopupLayout f7800a;

        public a(PopupLayout popupLayout) {
            this.f7800a = popupLayout;
        }

        public void dispose() {
            this.f7800a.e();
            this.f7800a.n();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$2(PopupLayout popupLayout, lp0.a<k> aVar, h hVar, String str, LayoutDirection layoutDirection) {
        super(1);
        this.f7795a = popupLayout;
        this.f7796b = aVar;
        this.f7797c = hVar;
        this.f7798d = str;
        this.f7799e = layoutDirection;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        this.f7795a.q();
        this.f7795a.s(this.f7796b, this.f7797c, this.f7798d, this.f7799e);
        return new a(this.f7795a);
    }
}
