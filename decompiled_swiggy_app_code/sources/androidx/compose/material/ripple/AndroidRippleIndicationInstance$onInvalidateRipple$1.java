package androidx.compose.material.ripple;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Ripple.android.kt */
final class AndroidRippleIndicationInstance$onInvalidateRipple$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidRippleIndicationInstance f5799a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidRippleIndicationInstance$onInvalidateRipple$1(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        super(0);
        this.f5799a = androidRippleIndicationInstance;
    }

    public final void invoke() {
        AndroidRippleIndicationInstance androidRippleIndicationInstance = this.f5799a;
        androidRippleIndicationInstance.o(!androidRippleIndicationInstance.l());
    }
}
