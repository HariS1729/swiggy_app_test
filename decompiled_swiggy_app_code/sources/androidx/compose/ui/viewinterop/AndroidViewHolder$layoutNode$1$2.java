package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import d2.e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$2 extends Lambda implements l<e, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNode f7708a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$2(LayoutNode layoutNode) {
        super(1);
        this.f7708a = layoutNode;
    }

    public final void a(e eVar) {
        p.j(eVar, "it");
        this.f7708a.i(eVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e) obj);
        return k.f22762a;
    }
}
