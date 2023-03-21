package androidx.compose.ui.semantics;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: SemanticsProperties.kt */
final class SemanticsProperties$ContentDescription$1 extends Lambda implements p<List<? extends String>, List<? extends String>, List<? extends String>> {

    /* renamed from: a  reason: collision with root package name */
    public static final SemanticsProperties$ContentDescription$1 f7448a = new SemanticsProperties$ContentDescription$1();

    SemanticsProperties$ContentDescription$1() {
        super(2);
    }

    /* renamed from: a */
    public final List<String> invoke(List<String> list, List<String> list2) {
        List<String> G0;
        kotlin.jvm.internal.p.j(list2, "childValue");
        if (list == null || (G0 = s.G0(list)) == null) {
            return list2;
        }
        G0.addAll(list2);
        return G0;
    }
}
