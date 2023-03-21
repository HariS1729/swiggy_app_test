package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p1.b;

/* compiled from: SemanticsProperties.kt */
final class SemanticsProperties$Text$1 extends Lambda implements p<List<? extends b>, List<? extends b>, List<? extends b>> {

    /* renamed from: a  reason: collision with root package name */
    public static final SemanticsProperties$Text$1 f7455a = new SemanticsProperties$Text$1();

    SemanticsProperties$Text$1() {
        super(2);
    }

    /* renamed from: a */
    public final List<b> invoke(List<b> list, List<b> list2) {
        List<b> G0;
        kotlin.jvm.internal.p.j(list2, "childValue");
        if (list == null || (G0 = s.G0(list)) == null) {
            return list2;
        }
        G0.addAll(list2);
        return G0;
    }
}
