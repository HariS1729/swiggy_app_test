package e0;

import androidx.compose.runtime.g;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: CompositionLocal.kt */
public final class t<T> extends m0<T> {

    /* renamed from: b  reason: collision with root package name */
    private final a1<T> f14219b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(a1<T> a1Var, a<? extends T> aVar) {
        super(aVar);
        p.j(a1Var, HttpRequest.HEADER_POLICY);
        p.j(aVar, "defaultFactory");
        this.f14219b = a1Var;
    }

    public d1<T> b(T t, g gVar, int i11) {
        gVar.E(-84026900);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = g.g(t, this.f14219b);
            gVar.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        h0Var.setValue(t);
        gVar.P();
        return h0Var;
    }
}
