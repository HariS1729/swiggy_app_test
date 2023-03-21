package androidx.compose.ui.node;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: LayoutNode.kt */
final class LayoutNode$performMeasure$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNode f6862a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f6863b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNode$performMeasure$1(LayoutNode layoutNode, long j) {
        super(0);
        this.f6862a = layoutNode;
        this.f6863b = j;
    }

    public final void invoke() {
        this.f6862a.s0().N(this.f6863b);
    }
}
