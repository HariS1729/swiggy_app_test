package i1;

import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;
import p0.e;

/* compiled from: ParentDataModifier.kt */
public interface d0 extends d.b {

    /* compiled from: ParentDataModifier.kt */
    public static final class a {
        @Deprecated
        public static boolean a(d0 d0Var, l<? super d.b, Boolean> lVar) {
            p.j(lVar, "predicate");
            return e.a(d0Var, lVar);
        }

        @Deprecated
        public static <R> R b(d0 d0Var, R r11, lp0.p<? super R, ? super d.b, ? extends R> pVar) {
            p.j(pVar, "operation");
            return e.b(d0Var, r11, pVar);
        }

        @Deprecated
        public static <R> R c(d0 d0Var, R r11, lp0.p<? super d.b, ? super R, ? extends R> pVar) {
            p.j(pVar, "operation");
            return e.c(d0Var, r11, pVar);
        }

        @Deprecated
        public static d d(d0 d0Var, d dVar) {
            p.j(dVar, "other");
            return c.a(d0Var, dVar);
        }
    }

    Object U(d2.e eVar, Object obj);
}
