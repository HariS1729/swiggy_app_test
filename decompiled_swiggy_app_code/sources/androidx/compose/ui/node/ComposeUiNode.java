package androidx.compose.ui.node;

import androidx.compose.ui.platform.n1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import i1.t;
import lp0.a;
import lp0.p;
import p0.d;

/* compiled from: ComposeUiNode.kt */
public interface ComposeUiNode {
    public static final Companion J = Companion.f6802a;

    /* compiled from: ComposeUiNode.kt */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ Companion f6802a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        private static final a<ComposeUiNode> f6803b = LayoutNode.U.a();

        /* renamed from: c  reason: collision with root package name */
        private static final p<ComposeUiNode, d, k> f6804c = ComposeUiNode$Companion$SetModifier$1.f6812a;

        /* renamed from: d  reason: collision with root package name */
        private static final p<ComposeUiNode, e, k> f6805d = ComposeUiNode$Companion$SetDensity$1.f6809a;

        /* renamed from: e  reason: collision with root package name */
        private static final p<ComposeUiNode, t, k> f6806e = ComposeUiNode$Companion$SetMeasurePolicy$1.f6811a;

        /* renamed from: f  reason: collision with root package name */
        private static final p<ComposeUiNode, LayoutDirection, k> f6807f = ComposeUiNode$Companion$SetLayoutDirection$1.f6810a;

        /* renamed from: g  reason: collision with root package name */
        private static final p<ComposeUiNode, n1, k> f6808g = ComposeUiNode$Companion$SetViewConfiguration$1.f6813a;

        private Companion() {
        }

        public final a<ComposeUiNode> a() {
            return f6803b;
        }

        public final p<ComposeUiNode, e, k> b() {
            return f6805d;
        }

        public final p<ComposeUiNode, LayoutDirection, k> c() {
            return f6807f;
        }

        public final p<ComposeUiNode, t, k> d() {
            return f6806e;
        }

        public final p<ComposeUiNode, d, k> e() {
            return f6804c;
        }

        public final p<ComposeUiNode, n1, k> f() {
            return f6808g;
        }
    }

    void a(d dVar);

    void c(LayoutDirection layoutDirection);

    void e(t tVar);

    void f(n1 n1Var);

    void i(e eVar);
}
