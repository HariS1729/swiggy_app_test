package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$5$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7716a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LayoutNode f7717b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$5$measure$1(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.f7716a = androidViewHolder;
        this.f7717b = layoutNode;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        c.e(this.f7716a, this.f7717b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
