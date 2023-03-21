package i1;

import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: MeasurePolicy.kt */
public interface t {

    /* compiled from: MeasurePolicy.kt */
    public static final class a {
        @Deprecated
        public static int a(t tVar, j jVar, List<? extends i> list, int i11) {
            p.j(jVar, "receiver");
            p.j(list, "measurables");
            return s.a(tVar, jVar, list, i11);
        }

        @Deprecated
        public static int b(t tVar, j jVar, List<? extends i> list, int i11) {
            p.j(jVar, "receiver");
            p.j(list, "measurables");
            return s.b(tVar, jVar, list, i11);
        }

        @Deprecated
        public static int c(t tVar, j jVar, List<? extends i> list, int i11) {
            p.j(jVar, "receiver");
            p.j(list, "measurables");
            return s.c(tVar, jVar, list, i11);
        }

        @Deprecated
        public static int d(t tVar, j jVar, List<? extends i> list, int i11) {
            p.j(jVar, "receiver");
            p.j(list, "measurables");
            return s.d(tVar, jVar, list, i11);
        }
    }

    int a(j jVar, List<? extends i> list, int i11);

    int b(j jVar, List<? extends i> list, int i11);

    int c(j jVar, List<? extends i> list, int i11);

    u d(w wVar, List<? extends r> list, long j);

    int e(j jVar, List<? extends i> list, int i11);
}
