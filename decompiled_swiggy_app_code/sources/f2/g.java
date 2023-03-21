package f2;

import androidx.constraintlayout.compose.ConstraintLayoutKt;
import com.newrelic.agent.android.agentdata.HexAttribute;
import f2.e;
import i1.r;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintSet.kt */
public interface g extends e {

    /* compiled from: ConstraintSet.kt */
    public static final class a {
        public static void a(g gVar, v vVar, List<? extends r> list) {
            p.j(gVar, "this");
            p.j(vVar, HexAttribute.HEX_ATTR_THREAD_STATE);
            p.j(list, "measurables");
            ConstraintLayoutKt.e(vVar, list);
            e e11 = gVar.e();
            g gVar2 = e11 instanceof g ? (g) e11 : null;
            if (gVar2 != null) {
                gVar2.a(vVar, list);
            }
            gVar.c(vVar);
        }

        public static boolean b(g gVar, List<? extends r> list) {
            p.j(gVar, "this");
            p.j(list, "measurables");
            return e.a.a(gVar, list);
        }
    }

    void a(v vVar, List<? extends r> list);

    void c(v vVar);

    e e();
}
