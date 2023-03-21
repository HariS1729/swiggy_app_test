package androidx.compose.ui.viewinterop;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$runUpdate$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7730a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.f7730a = androidViewHolder;
    }

    public final void invoke() {
        if (this.f7730a.f7694d) {
            SnapshotStateObserver e11 = this.f7730a.k;
            AndroidViewHolder androidViewHolder = this.f7730a;
            e11.j(androidViewHolder, androidViewHolder.f7700l, this.f7730a.getUpdate());
        }
    }
}
