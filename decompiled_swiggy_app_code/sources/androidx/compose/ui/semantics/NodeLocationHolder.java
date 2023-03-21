package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.LayoutDirection;
import i1.l;
import i1.n;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import n1.r;
import t0.h;

/* compiled from: SemanticsSort.kt */
public final class NodeLocationHolder implements Comparable<NodeLocationHolder> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7402e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static ComparisonStrategy f7403f = ComparisonStrategy.Stripe;

    /* renamed from: a  reason: collision with root package name */
    private final LayoutNode f7404a;

    /* renamed from: b  reason: collision with root package name */
    private final LayoutNode f7405b;

    /* renamed from: c  reason: collision with root package name */
    private final h f7406c;

    /* renamed from: d  reason: collision with root package name */
    private final LayoutDirection f7407d;

    /* compiled from: SemanticsSort.kt */
    public enum ComparisonStrategy {
        Stripe,
        Location
    }

    /* compiled from: SemanticsSort.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(ComparisonStrategy comparisonStrategy) {
            p.j(comparisonStrategy, "<set-?>");
            NodeLocationHolder.f7403f = comparisonStrategy;
        }
    }

    public NodeLocationHolder(LayoutNode layoutNode, LayoutNode layoutNode2) {
        p.j(layoutNode, "subtreeRoot");
        p.j(layoutNode2, "node");
        this.f7404a = layoutNode;
        this.f7405b = layoutNode2;
        this.f7407d = layoutNode.getLayoutDirection();
        LayoutNodeWrapper c02 = layoutNode.c0();
        LayoutNodeWrapper e11 = r.e(layoutNode2);
        h hVar = null;
        if (c02.D() && e11.D()) {
            hVar = l.a(c02, e11, false, 2, (Object) null);
        }
        this.f7406c = hVar;
    }

    /* renamed from: c */
    public int compareTo(NodeLocationHolder nodeLocationHolder) {
        p.j(nodeLocationHolder, "other");
        h hVar = this.f7406c;
        if (hVar == null) {
            return 1;
        }
        if (nodeLocationHolder.f7406c == null) {
            return -1;
        }
        if (f7403f == ComparisonStrategy.Stripe) {
            if (hVar.e() - nodeLocationHolder.f7406c.l() <= 0.0f) {
                return -1;
            }
            if (this.f7406c.l() - nodeLocationHolder.f7406c.e() >= 0.0f) {
                return 1;
            }
        }
        boolean z11 = false;
        if (this.f7407d == LayoutDirection.Ltr) {
            int i11 = ((this.f7406c.i() - nodeLocationHolder.f7406c.i()) > 0.0f ? 1 : ((this.f7406c.i() - nodeLocationHolder.f7406c.i()) == 0.0f ? 0 : -1));
            if (!(i11 == 0)) {
                if (i11 < 0) {
                    return -1;
                }
                return 1;
            }
        } else {
            int i12 = ((this.f7406c.j() - nodeLocationHolder.f7406c.j()) > 0.0f ? 1 : ((this.f7406c.j() - nodeLocationHolder.f7406c.j()) == 0.0f ? 0 : -1));
            if (!(i12 == 0)) {
                if (i12 < 0) {
                    return 1;
                }
                return -1;
            }
        }
        int i13 = ((this.f7406c.l() - nodeLocationHolder.f7406c.l()) > 0.0f ? 1 : ((this.f7406c.l() - nodeLocationHolder.f7406c.l()) == 0.0f ? 0 : -1));
        if (i13 == 0) {
            int i14 = ((this.f7406c.h() - nodeLocationHolder.f7406c.h()) > 0.0f ? 1 : ((this.f7406c.h() - nodeLocationHolder.f7406c.h()) == 0.0f ? 0 : -1));
            if (i14 == 0) {
                int i15 = ((this.f7406c.n() - nodeLocationHolder.f7406c.n()) > 0.0f ? 1 : ((this.f7406c.n() - nodeLocationHolder.f7406c.n()) == 0.0f ? 0 : -1));
                if (i15 == 0) {
                    z11 = true;
                }
                if (z11) {
                    h b11 = n.b(r.e(this.f7405b));
                    h b12 = n.b(r.e(nodeLocationHolder.f7405b));
                    LayoutNode a11 = r.a(this.f7405b, new NodeLocationHolder$compareTo$child1$1(b11));
                    LayoutNode a12 = r.a(nodeLocationHolder.f7405b, new NodeLocationHolder$compareTo$child2$1(b12));
                    if (a11 != null && a12 != null) {
                        return new NodeLocationHolder(this.f7404a, a11).compareTo(new NodeLocationHolder(nodeLocationHolder.f7404a, a12));
                    }
                    if (a11 != null) {
                        return 1;
                    }
                    return -1;
                } else if (i15 < 0) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (i14 < 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (i13 < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public final LayoutNode h() {
        return this.f7405b;
    }
}
