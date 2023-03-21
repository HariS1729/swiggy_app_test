package f2;

import i1.r;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintSet.kt */
public interface e {

    /* compiled from: ConstraintSet.kt */
    public static final class a {
        public static boolean a(e eVar, List<? extends r> list) {
            p.j(eVar, "this");
            p.j(list, "measurables");
            return true;
        }
    }

    void a(v vVar, List<? extends r> list);

    boolean d(List<? extends r> list);
}
