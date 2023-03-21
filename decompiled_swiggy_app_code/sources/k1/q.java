package k1;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.e0;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.h;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.v1;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import f1.s;
import lp0.l;
import q0.d;
import q0.i;
import s0.f;
import u0.x;
import u1.h;
import u1.i;
import v1.a0;

/* compiled from: Owner.kt */
public interface q {

    /* renamed from: g0  reason: collision with root package name */
    public static final a f15382g0 = a.f15383a;

    /* compiled from: Owner.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f15383a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static boolean f15384b;

        private a() {
        }

        public final boolean a() {
            return f15384b;
        }
    }

    /* compiled from: Owner.kt */
    public interface b {
        void h();
    }

    void a(boolean z11);

    void e(LayoutNode layoutNode, long j);

    long f(long j);

    void g();

    h getAccessibilityManager();

    d getAutofill();

    i getAutofillTree();

    e0 getClipboardManager();

    e getDensity();

    f getFocusManager();

    i.b getFontFamilyResolver();

    h.a getFontLoader();

    a1.a getHapticFeedBack();

    b1.b getInputModeManager();

    LayoutDirection getLayoutDirection();

    s getPointerIconService();

    h getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    a0 getTextInputService();

    g1 getTextToolbar();

    n1 getViewConfiguration();

    v1 getWindowInfo();

    void h(b bVar);

    long i(long j);

    void j(LayoutNode layoutNode);

    void k(LayoutNode layoutNode);

    void l(LayoutNode layoutNode, boolean z11);

    o m(l<? super x, k> lVar, lp0.a<k> aVar);

    void n(LayoutNode layoutNode);

    void o(LayoutNode layoutNode);

    void q();

    void r(lp0.a<k> aVar);

    boolean requestFocus();

    void s(LayoutNode layoutNode, boolean z11);

    void setShowLayoutBounds(boolean z11);
}
