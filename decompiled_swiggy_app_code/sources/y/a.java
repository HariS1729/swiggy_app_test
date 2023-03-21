package y;

import android.view.View;
import bp0.k;
import fp0.c;
import i1.m;
import i1.n;
import kotlin.jvm.internal.p;
import t0.h;

/* compiled from: BringIntoViewResponder.android.kt */
final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final View f17849a;

    public a(View view) {
        p.j(view, "view");
        this.f17849a = view;
    }

    public Object a(h hVar, m mVar, c<? super k> cVar) {
        this.f17849a.requestRectangleOnScreen(f.c(hVar.r(n.e(mVar))), false);
        return k.f22762a;
    }
}
