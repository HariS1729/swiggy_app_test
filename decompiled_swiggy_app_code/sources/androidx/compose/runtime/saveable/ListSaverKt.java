package androidx.compose.runtime.saveable;

import java.util.List;
import kotlin.jvm.internal.x;
import lp0.l;
import lp0.p;
import m0.c;
import m0.d;

/* compiled from: ListSaver.kt */
public final class ListSaverKt {
    public static final <Original, Saveable> c<Original, Object> a(p<? super d, ? super Original, ? extends List<? extends Saveable>> pVar, l<? super List<? extends Saveable>, ? extends Original> lVar) {
        kotlin.jvm.internal.p.j(pVar, "save");
        kotlin.jvm.internal.p.j(lVar, "restore");
        return SaverKt.a(new ListSaverKt$listSaver$1(pVar), (l) x.e(lVar, 1));
    }
}
