package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionLocalKt;
import e0.a1;
import e0.g;
import e0.m0;
import v1.a0;

/* compiled from: LocalSoftwareKeyboardController.kt */
public final class LocalSoftwareKeyboardController {

    /* renamed from: a  reason: collision with root package name */
    public static final LocalSoftwareKeyboardController f7159a = new LocalSoftwareKeyboardController();

    /* renamed from: b  reason: collision with root package name */
    private static final m0<f1> f7160b = CompositionLocalKt.c((a1) null, LocalSoftwareKeyboardController$LocalSoftwareKeyboardController$1.f7161a, 1, (Object) null);

    private LocalSoftwareKeyboardController() {
    }

    private final f1 a(g gVar, int i11) {
        gVar.E(1835581880);
        a0 a0Var = (a0) gVar.z(CompositionLocalsKt.l());
        if (a0Var == null) {
            gVar.P();
            return null;
        }
        gVar.E(1157296644);
        boolean k = gVar.k(a0Var);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new g0(a0Var);
            gVar.y(F);
        }
        gVar.P();
        g0 g0Var = (g0) F;
        gVar.P();
        return g0Var;
    }

    public final f1 b(g gVar, int i11) {
        gVar.E(-1059476185);
        f1 f1Var = (f1) gVar.z(f7160b);
        if (f1Var == null) {
            f1Var = a(gVar, i11 & 14);
        }
        gVar.P();
        return f1Var;
    }
}
