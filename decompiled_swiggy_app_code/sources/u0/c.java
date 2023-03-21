package u0;

import android.graphics.Canvas;
import kotlin.jvm.internal.p;

/* compiled from: AndroidCanvas.android.kt */
public final class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Canvas f16751a = new Canvas();

    public static final x a(l0 l0Var) {
        p.j(l0Var, "image");
        b bVar = new b();
        bVar.w(new Canvas(f.b(l0Var)));
        return bVar;
    }

    public static final Canvas c(x xVar) {
        p.j(xVar, "<this>");
        return ((b) xVar).v();
    }
}
