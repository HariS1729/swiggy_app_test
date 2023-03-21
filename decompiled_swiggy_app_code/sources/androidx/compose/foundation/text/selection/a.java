package androidx.compose.foundation.text.selection;

import androidx.compose.ui.platform.n1;
import f1.n;
import f1.v;
import kotlin.jvm.internal.p;
import t0.f;

/* compiled from: TextSelectionMouseDetector.kt */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final n1 f4795a;

    /* renamed from: b  reason: collision with root package name */
    private int f4796b;

    /* renamed from: c  reason: collision with root package name */
    private v f4797c;

    public a(n1 n1Var) {
        p.j(n1Var, "viewConfiguration");
        this.f4795a = n1Var;
    }

    public final int a() {
        return this.f4796b;
    }

    public final boolean b(v vVar, v vVar2) {
        p.j(vVar, "prevClick");
        p.j(vVar2, "newClick");
        return ((double) f.k(f.q(vVar2.f(), vVar.f()))) < 100.0d;
    }

    public final boolean c(v vVar, v vVar2) {
        p.j(vVar, "prevClick");
        p.j(vVar2, "newClick");
        return vVar2.l() - vVar.l() < this.f4795a.c();
    }

    public final void d(n nVar) {
        p.j(nVar, "event");
        v vVar = this.f4797c;
        v vVar2 = nVar.c().get(0);
        if (vVar == null || !c(vVar, vVar2) || !b(vVar, vVar2)) {
            this.f4796b = 1;
        } else {
            this.f4796b++;
        }
        this.f4797c = vVar2;
    }
}
