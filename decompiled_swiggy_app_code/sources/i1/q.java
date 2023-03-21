package i1;

import androidx.compose.ui.layout.b;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import p0.d;
import p0.e;

/* compiled from: LayoutModifier.kt */
public interface q extends d.b {

    /* compiled from: LayoutModifier.kt */
    public static final class a {
        @Deprecated
        public static boolean a(q qVar, l<? super d.b, Boolean> lVar) {
            p.j(lVar, "predicate");
            return e.a(qVar, lVar);
        }

        @Deprecated
        public static <R> R b(q qVar, R r11, lp0.p<? super R, ? super d.b, ? extends R> pVar) {
            p.j(pVar, "operation");
            return e.b(qVar, r11, pVar);
        }

        @Deprecated
        public static <R> R c(q qVar, R r11, lp0.p<? super d.b, ? super R, ? extends R> pVar) {
            p.j(pVar, "operation");
            return e.c(qVar, r11, pVar);
        }

        @Deprecated
        public static int d(q qVar, j jVar, i iVar, int i11) {
            p.j(jVar, "receiver");
            p.j(iVar, "measurable");
            return b.a(qVar, jVar, iVar, i11);
        }

        @Deprecated
        public static int e(q qVar, j jVar, i iVar, int i11) {
            p.j(jVar, "receiver");
            p.j(iVar, "measurable");
            return b.b(qVar, jVar, iVar, i11);
        }

        @Deprecated
        public static int f(q qVar, j jVar, i iVar, int i11) {
            p.j(jVar, "receiver");
            p.j(iVar, "measurable");
            return b.c(qVar, jVar, iVar, i11);
        }

        @Deprecated
        public static int g(q qVar, j jVar, i iVar, int i11) {
            p.j(jVar, "receiver");
            p.j(iVar, "measurable");
            return b.d(qVar, jVar, iVar, i11);
        }

        @Deprecated
        public static d h(q qVar, d dVar) {
            p.j(dVar, "other");
            return c.a(qVar, dVar);
        }
    }

    u K(w wVar, r rVar, long j);

    int L(j jVar, i iVar, int i11);

    int f0(j jVar, i iVar, int i11);

    int n0(j jVar, i iVar, int i11);

    int p(j jVar, i iVar, int i11);
}
