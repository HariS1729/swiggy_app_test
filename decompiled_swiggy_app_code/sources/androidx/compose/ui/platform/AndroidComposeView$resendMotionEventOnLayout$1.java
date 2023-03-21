package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$resendMotionEventOnLayout$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f6993a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.f6993a = androidComposeView;
    }

    public final void invoke() {
        MotionEvent y11 = this.f6993a.f6971t0;
        if (y11 != null) {
            int actionMasked = y11.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.f6993a.f6973u0 = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.f6993a;
                androidComposeView.post(androidComposeView.f6978x0);
            }
        }
    }
}
