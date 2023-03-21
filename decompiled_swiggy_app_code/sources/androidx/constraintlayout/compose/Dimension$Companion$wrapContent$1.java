package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.b;
import f2.v;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ConstraintLayout.kt */
final class Dimension$Companion$wrapContent$1 extends Lambda implements l<v, b> {

    /* renamed from: a  reason: collision with root package name */
    public static final Dimension$Companion$wrapContent$1 f7974a = new Dimension$Companion$wrapContent$1();

    Dimension$Companion$wrapContent$1() {
        super(1);
    }

    /* renamed from: a */
    public final b invoke(v vVar) {
        p.j(vVar, "it");
        b b11 = b.b(b.j);
        p.i(b11, "Fixed(WRAP_DIMENSION)");
        return b11;
    }
}
