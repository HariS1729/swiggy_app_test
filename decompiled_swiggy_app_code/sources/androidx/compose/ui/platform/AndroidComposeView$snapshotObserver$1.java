package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$snapshotObserver$1 extends Lambda implements l<a<? extends k>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f6996a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.f6996a = androidComposeView;
    }

    /* access modifiers changed from: private */
    public static final void c(a aVar) {
        p.j(aVar, "$tmp0");
        aVar.invoke();
    }

    public final void b(a<k> aVar) {
        p.j(aVar, "command");
        Handler handler = this.f6996a.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = this.f6996a.getHandler();
        if (handler2 != null) {
            handler2.post(new q(aVar));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((a) obj);
        return k.f22762a;
    }
}
