package f2;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import lp0.p;
import n1.q;
import sp0.j;

/* compiled from: ToolingUtils.kt */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ j<Object>[] f14611a = {s.f(new MutablePropertyReference1Impl(s.d(w.class, "compose_release"), "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"))};

    /* renamed from: b  reason: collision with root package name */
    private static final SemanticsPropertyKey<j> f14612b;

    /* renamed from: c  reason: collision with root package name */
    private static final SemanticsPropertyKey f14613c;

    static {
        SemanticsPropertyKey<j> semanticsPropertyKey = new SemanticsPropertyKey<>("DesignInfoProvider", (p) null, 2, (i) null);
        f14612b = semanticsPropertyKey;
        f14613c = semanticsPropertyKey;
    }

    public static final void a(q qVar, j jVar) {
        kotlin.jvm.internal.p.j(qVar, "<this>");
        kotlin.jvm.internal.p.j(jVar, "<set-?>");
        f14613c.c(qVar, f14611a[0], jVar);
    }
}
