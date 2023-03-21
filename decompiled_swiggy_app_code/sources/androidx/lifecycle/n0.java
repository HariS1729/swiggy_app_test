package androidx.lifecycle;

import g3.a;
import kotlin.jvm.internal.p;

/* compiled from: ViewModelProvider.kt */
public final class n0 {
    public static final a a(p0 p0Var) {
        p.j(p0Var, "owner");
        if (!(p0Var instanceof k)) {
            return a.C0124a.f14730b;
        }
        a defaultViewModelCreationExtras = ((k) p0Var).getDefaultViewModelCreationExtras();
        p.i(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        return defaultViewModelCreationExtras;
    }
}
