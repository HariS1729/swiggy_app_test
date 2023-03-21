package e0;

import androidx.compose.runtime.a;

/* compiled from: Composables.kt */
public final class f {
    public static final int a(g gVar, int i11) {
        return gVar.N();
    }

    public static final o0 b(g gVar, int i11) {
        o0 C = gVar.C();
        if (C != null) {
            gVar.l(C);
            return C;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final a d(g gVar, int i11) {
        gVar.E(-1165786124);
        a j = gVar.j();
        gVar.P();
        return j;
    }
}
