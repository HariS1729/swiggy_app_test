package androidx.compose.ui.node;

import bp0.f;
import java.util.Comparator;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;

/* compiled from: DepthSortedSet.kt */
public final class DepthSortedSet {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6814a;

    /* renamed from: b  reason: collision with root package name */
    private final f f6815b = b.a(LazyThreadSafetyMode.NONE, DepthSortedSet$mapOfOriginalDepth$2.f6818a);

    /* renamed from: c  reason: collision with root package name */
    private final Comparator<LayoutNode> f6816c;

    /* renamed from: d  reason: collision with root package name */
    private final TreeSet<LayoutNode> f6817d;

    /* compiled from: DepthSortedSet.kt */
    public static final class a implements Comparator<LayoutNode> {
        a() {
        }

        /* renamed from: a */
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            p.j(layoutNode, "l1");
            p.j(layoutNode2, "l2");
            int l11 = p.l(layoutNode.Y(), layoutNode2.Y());
            if (l11 != 0) {
                return l11;
            }
            return p.l(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    }

    public DepthSortedSet(boolean z11) {
        this.f6814a = z11;
        a aVar = new a();
        this.f6816c = aVar;
        this.f6817d = new TreeSet<>(aVar);
    }

    private final Map<LayoutNode, Integer> c() {
        return (Map) this.f6815b.getValue();
    }

    public final void a(LayoutNode layoutNode) {
        p.j(layoutNode, "node");
        if (layoutNode.L0()) {
            if (this.f6814a) {
                Integer num = c().get(layoutNode);
                if (num == null) {
                    c().put(layoutNode, Integer.valueOf(layoutNode.Y()));
                } else {
                    if (!(num.intValue() == layoutNode.Y())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f6817d.add(layoutNode);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean b(LayoutNode layoutNode) {
        p.j(layoutNode, "node");
        boolean contains = this.f6817d.contains(layoutNode);
        if (this.f6814a) {
            if (!(contains == c().containsKey(layoutNode))) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    public final boolean d() {
        return this.f6817d.isEmpty();
    }

    public final LayoutNode e() {
        LayoutNode first = this.f6817d.first();
        p.i(first, "node");
        f(first);
        return first;
    }

    public final boolean f(LayoutNode layoutNode) {
        p.j(layoutNode, "node");
        if (layoutNode.L0()) {
            boolean remove = this.f6817d.remove(layoutNode);
            if (this.f6814a) {
                Integer remove2 = c().remove(layoutNode);
                boolean z11 = true;
                if (remove) {
                    int Y = layoutNode.Y();
                    if (remove2 == null || remove2.intValue() != Y) {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (remove2 != null) {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String treeSet = this.f6817d.toString();
        p.i(treeSet, "set.toString()");
        return treeSet;
    }
}
