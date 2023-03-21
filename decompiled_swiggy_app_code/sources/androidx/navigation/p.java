package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.w;

@w.b("navigation")
/* compiled from: NavGraphNavigator */
public class p extends w<o> {

    /* renamed from: a  reason: collision with root package name */
    private final x f10961a;

    public p(x xVar) {
        this.f10961a = xVar;
    }

    public boolean e() {
        return true;
    }

    /* renamed from: f */
    public o a() {
        return new o(this);
    }

    /* renamed from: g */
    public m b(o oVar, Bundle bundle, t tVar, w.a aVar) {
        int G = oVar.G();
        if (G != 0) {
            m E = oVar.E(G, false);
            if (E != null) {
                return this.f10961a.d(E.n()).b(E, E.c(bundle), tVar, aVar);
            }
            String F = oVar.F();
            throw new IllegalArgumentException("navigation destination " + F + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException("no start destination defined via app:startDestination for " + oVar.i());
    }
}
