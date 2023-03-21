package androidx.compose.ui.node;

import androidx.compose.ui.platform.InspectableValueKt;
import f0.e;
import j1.b;
import k1.m;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;
import s0.i;
import s0.k;
import s0.n;

/* compiled from: LayoutNode.kt */
final class LayoutNode$setModifierLocals$1 extends Lambda implements p<m, d.b, m> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNode f6864a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e<ModifierLocalConsumerEntity> f6865b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNode$setModifierLocals$1(LayoutNode layoutNode, e<ModifierLocalConsumerEntity> eVar) {
        super(2);
        this.f6864a = layoutNode;
        this.f6865b = eVar;
    }

    /* renamed from: a */
    public final m invoke(m mVar, d.b bVar) {
        kotlin.jvm.internal.p.j(mVar, "lastProvider");
        kotlin.jvm.internal.p.j(bVar, "mod");
        if (bVar instanceof i) {
            i iVar = (i) bVar;
            n n = this.f6864a.T(iVar, this.f6865b);
            if (n == null) {
                k kVar = new k(iVar);
                n = new n(kVar, InspectableValueKt.c() ? new LayoutNode$setModifierLocals$1$invoke$lambda1$$inlined$debugInspectorInfo$1(kVar) : InspectableValueKt.a());
            }
            this.f6864a.C(n, mVar, this.f6865b);
            mVar = this.f6864a.D(n, mVar);
        }
        if (bVar instanceof b) {
            this.f6864a.C((b) bVar, mVar, this.f6865b);
        }
        return bVar instanceof j1.d ? this.f6864a.D((j1.d) bVar, mVar) : mVar;
    }
}
