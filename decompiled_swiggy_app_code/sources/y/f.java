package y;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e0.g;
import t0.h;

/* compiled from: BringIntoViewResponder.android.kt */
public final class f {
    public static final b b(g gVar, int i11) {
        gVar.E(-1031410916);
        View view = (View) gVar.z(AndroidCompositionLocals_androidKt.k());
        gVar.E(1157296644);
        boolean k = gVar.k(view);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new a(view);
            gVar.y(F);
        }
        gVar.P();
        a aVar = (a) F;
        gVar.P();
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final Rect c(h hVar) {
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }
}
