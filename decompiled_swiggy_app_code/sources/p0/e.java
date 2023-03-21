package p0;

import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: Modifier.kt */
public final /* synthetic */ class e {
    public static boolean a(d.b bVar, l lVar) {
        p.j(lVar, "predicate");
        return ((Boolean) lVar.invoke(bVar)).booleanValue();
    }

    public static Object b(d.b bVar, Object obj, lp0.p pVar) {
        p.j(pVar, "operation");
        return pVar.invoke(obj, bVar);
    }

    public static Object c(d.b bVar, Object obj, lp0.p pVar) {
        p.j(pVar, "operation");
        return pVar.invoke(bVar, obj);
    }
}
