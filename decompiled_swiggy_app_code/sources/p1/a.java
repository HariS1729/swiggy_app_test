package p1;

import androidx.compose.ui.text.SpanStyleKt;
import kotlin.jvm.internal.p;

/* compiled from: AndroidTextStyle.android.kt */
public final class a {
    public static final t a(r rVar, q qVar) {
        return new t(rVar, qVar);
    }

    public static final q b(q qVar, q qVar2, float f11) {
        p.j(qVar, "start");
        p.j(qVar2, "stop");
        if (qVar.b() == qVar2.b()) {
            return qVar;
        }
        return new q(((Boolean) SpanStyleKt.c(Boolean.valueOf(qVar.b()), Boolean.valueOf(qVar2.b()), f11)).booleanValue());
    }

    public static final r c(r rVar, r rVar2, float f11) {
        p.j(rVar, "start");
        p.j(rVar2, "stop");
        return rVar;
    }
}
