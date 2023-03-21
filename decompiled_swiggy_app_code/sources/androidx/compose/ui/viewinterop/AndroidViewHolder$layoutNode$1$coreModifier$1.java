package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import bp0.k;
import k1.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.c;
import u0.x;
import w0.f;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$coreModifier$1 extends Lambda implements l<f, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNode f7718a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7719b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$coreModifier$1(LayoutNode layoutNode, AndroidViewHolder androidViewHolder) {
        super(1);
        this.f7718a = layoutNode;
        this.f7719b = androidViewHolder;
    }

    public final void a(f fVar) {
        p.j(fVar, "$this$drawBehind");
        LayoutNode layoutNode = this.f7718a;
        AndroidViewHolder androidViewHolder = this.f7719b;
        x a11 = fVar.O().a();
        q t02 = layoutNode.t0();
        AndroidComposeView androidComposeView = t02 instanceof AndroidComposeView ? (AndroidComposeView) t02 : null;
        if (androidComposeView != null) {
            androidComposeView.M(androidViewHolder, c.c(a11));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((f) obj);
        return k.f22762a;
    }
}
