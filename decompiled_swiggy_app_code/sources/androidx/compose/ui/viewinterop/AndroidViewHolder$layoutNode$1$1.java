package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$1 extends Lambda implements l<d, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNode f7706a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f7707b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, d dVar) {
        super(1);
        this.f7706a = layoutNode;
        this.f7707b = dVar;
    }

    public final void a(d dVar) {
        p.j(dVar, "it");
        this.f7706a.a(dVar.N(this.f7707b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d) obj);
        return k.f22762a;
    }
}
