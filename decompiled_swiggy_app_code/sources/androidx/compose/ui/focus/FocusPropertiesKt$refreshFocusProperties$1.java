package androidx.compose.ui.focus;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import s0.n;

/* compiled from: FocusProperties.kt */
final class FocusPropertiesKt$refreshFocusProperties$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FocusModifier f6395a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusPropertiesKt$refreshFocusProperties$1(FocusModifier focusModifier) {
        super(0);
        this.f6395a = focusModifier;
    }

    public final void invoke() {
        n h11 = this.f6395a.h();
        if (h11 != null) {
            h11.c(this.f6395a.g());
        }
    }
}
