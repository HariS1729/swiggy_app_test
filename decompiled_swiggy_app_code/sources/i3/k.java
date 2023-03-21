package i3;

import android.view.Choreographer;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: JankStatsApi22Impl.kt */
public class k extends j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(i iVar, View view) {
        super(iVar, view);
        p.j(iVar, "jankStats");
        p.j(view, "view");
    }

    public c d(View view, Choreographer choreographer, List<q> list) {
        p.j(view, "view");
        p.j(choreographer, "choreographer");
        p.j(list, "delegates");
        return new d(view, choreographer, list);
    }
}
