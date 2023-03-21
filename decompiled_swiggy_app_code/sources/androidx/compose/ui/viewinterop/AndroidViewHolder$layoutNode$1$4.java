package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import bp0.k;
import k1.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$4 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7712a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<View> f7713b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$4(AndroidViewHolder androidViewHolder, Ref$ObjectRef<View> ref$ObjectRef) {
        super(1);
        this.f7712a = androidViewHolder;
        this.f7713b = ref$ObjectRef;
    }

    public final void a(q qVar) {
        p.j(qVar, "owner");
        AndroidComposeView androidComposeView = qVar instanceof AndroidComposeView ? (AndroidComposeView) qVar : null;
        if (androidComposeView != null) {
            androidComposeView.h0(this.f7712a);
        }
        this.f7713b.f25666a = this.f7712a.getView();
        this.f7712a.setView$ui_release((View) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
