package androidx.compose.ui.viewinterop;

import android.os.Looper;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$snapshotObserver$1 extends Lambda implements l<a<? extends k>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7731a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$snapshotObserver$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f7731a = androidViewHolder;
    }

    /* access modifiers changed from: private */
    public static final void c(a aVar) {
        p.j(aVar, "$tmp0");
        aVar.invoke();
    }

    public final void b(a<k> aVar) {
        p.j(aVar, "command");
        if (this.f7731a.getHandler().getLooper() == Looper.myLooper()) {
            aVar.invoke();
        } else {
            this.f7731a.getHandler().post(new b(aVar));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((a) obj);
        return k.f22762a;
    }
}
