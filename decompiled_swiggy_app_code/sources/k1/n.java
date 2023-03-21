package k1;

import androidx.compose.ui.node.LayoutNode;
import f0.e;
import java.util.Comparator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.common.PDPageLabelRange;

/* compiled from: OnPositionedDispatcher.kt */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f15379b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final e<LayoutNode> f15380a = new e<>(new LayoutNode[16], 0);

    /* compiled from: OnPositionedDispatcher.kt */
    public static final class a {

        /* renamed from: k1.n$a$a  reason: collision with other inner class name */
        /* compiled from: OnPositionedDispatcher.kt */
        private static final class C0142a implements Comparator<LayoutNode> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0142a f15381a = new C0142a();

            private C0142a() {
            }

            /* renamed from: a */
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                p.j(layoutNode, PDPageLabelRange.STYLE_LETTERS_LOWER);
                p.j(layoutNode2, "b");
                int l11 = p.l(layoutNode2.Y(), layoutNode.Y());
                if (l11 != 0) {
                    return l11;
                }
                return p.l(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private final void b(LayoutNode layoutNode) {
        layoutNode.R();
        int i11 = 0;
        layoutNode.t1(false);
        e<LayoutNode> A0 = layoutNode.A0();
        int m11 = A0.m();
        if (m11 > 0) {
            Object[] l11 = A0.l();
            do {
                b((LayoutNode) l11[i11]);
                i11++;
            } while (i11 < m11);
        }
    }

    public final void a() {
        this.f15380a.y(a.C0142a.f15381a);
        e<LayoutNode> eVar = this.f15380a;
        int m11 = eVar.m();
        if (m11 > 0) {
            int i11 = m11 - 1;
            Object[] l11 = eVar.l();
            do {
                LayoutNode layoutNode = (LayoutNode) l11[i11];
                if (layoutNode.q0()) {
                    b(layoutNode);
                }
                i11--;
            } while (i11 >= 0);
        }
        this.f15380a.g();
    }

    public final void c(LayoutNode layoutNode) {
        p.j(layoutNode, "node");
        this.f15380a.b(layoutNode);
        layoutNode.t1(true);
    }

    public final void d(LayoutNode layoutNode) {
        p.j(layoutNode, "rootNode");
        this.f15380a.g();
        this.f15380a.b(layoutNode);
        layoutNode.t1(true);
    }
}
