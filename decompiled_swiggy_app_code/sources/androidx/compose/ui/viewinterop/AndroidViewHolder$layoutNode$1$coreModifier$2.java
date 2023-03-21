package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import i1.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends Lambda implements l<m, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f7720a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LayoutNode f7721b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$coreModifier$2(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        super(1);
        this.f7720a = androidViewHolder;
        this.f7721b = layoutNode;
    }

    public final void a(m mVar) {
        p.j(mVar, "it");
        c.e(this.f7720a, this.f7721b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((m) obj);
        return k.f22762a;
    }
}
