package v1;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;

/* compiled from: EditCommand.kt */
public final class i implements d {
    public void a(g gVar) {
        p.j(gVar, "buffer");
        gVar.a();
    }

    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    public int hashCode() {
        return s.b(i.class).hashCode();
    }

    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
