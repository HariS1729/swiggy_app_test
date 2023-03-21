package androidx.lifecycle;

import kotlin.jvm.internal.p;
import wp0.e2;
import wp0.j0;
import wp0.k1;
import wp0.u0;

/* compiled from: ViewModel.kt */
public final class k0 {
    public static final j0 a(j0 j0Var) {
        p.j(j0Var, "<this>");
        j0 j0Var2 = (j0) j0Var.h1("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (j0Var2 != null) {
            return j0Var2;
        }
        Object j12 = j0Var.j1("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new c(e2.b((k1) null, 1, (Object) null).plus(u0.c().N0())));
        p.i(j12, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (j0) j12;
    }
}
