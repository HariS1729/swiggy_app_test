package androidx.compose.ui;

import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.c;
import p0.d;
import p0.e;

/* compiled from: ComposedModifier.kt */
class a extends o0 implements d.b {

    /* renamed from: b  reason: collision with root package name */
    private final q<d, g, Integer, d> f6326b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l<? super n0, k> lVar, q<? super d, ? super g, ? super Integer, ? extends d> qVar) {
        super(lVar);
        p.j(lVar, "inspectorInfo");
        p.j(qVar, "factory");
        this.f6326b = qVar;
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public final q<d, g, Integer, d> c() {
        return this.f6326b;
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
