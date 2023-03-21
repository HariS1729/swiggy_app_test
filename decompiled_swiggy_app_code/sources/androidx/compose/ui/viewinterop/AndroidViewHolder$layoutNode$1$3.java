package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import bp0.k;
import k1.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$3 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7709a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LayoutNode f7710b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<View> f7711c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode, Ref$ObjectRef<View> ref$ObjectRef) {
        super(1);
        this.f7709a = androidViewHolder;
        this.f7710b = layoutNode;
        this.f7711c = ref$ObjectRef;
    }

    public final void a(q qVar) {
        p.j(qVar, "owner");
        AndroidComposeView androidComposeView = qVar instanceof AndroidComposeView ? (AndroidComposeView) qVar : null;
        if (androidComposeView != null) {
            androidComposeView.H(this.f7709a, this.f7710b);
        }
        T t = this.f7711c.f25666a;
        if (t != null) {
            this.f7709a.setView$ui_release((View) t);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
