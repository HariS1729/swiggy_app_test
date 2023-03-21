package androidx.compose.runtime;

import bp0.k;
import e0.e;
import e0.g0;
import e0.q0;
import e0.u0;
import e0.x0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentReferences$1$1$2$1 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposerImpl f5932a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<q<e<?>, x0, q0, k>> f5933b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u0 f5934c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g0 f5935d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentReferences$1$1$2$1(ComposerImpl composerImpl, List<q<e<?>, x0, q0, k>> list, u0 u0Var, g0 g0Var) {
        super(0);
        this.f5932a = composerImpl;
        this.f5933b = list;
        this.f5934c = u0Var;
        this.f5935d = g0Var;
    }

    public final void invoke() {
        u0 X;
        int[] V;
        ComposerImpl composerImpl = this.f5932a;
        List<q<e<?>, x0, q0, k>> list = this.f5933b;
        u0 u0Var = this.f5934c;
        g0 g0Var = this.f5935d;
        List S = composerImpl.f5886f;
        try {
            composerImpl.f5886f = list;
            X = composerImpl.H;
            V = composerImpl.f5892o;
            composerImpl.f5892o = null;
            composerImpl.H = u0Var;
            composerImpl.K0(g0Var.c(), g0Var.e(), g0Var.f(), true);
            k kVar = k.f22762a;
            composerImpl.H = X;
            composerImpl.f5892o = V;
            composerImpl.f5886f = S;
        } catch (Throwable th2) {
            composerImpl.f5886f = S;
            throw th2;
        }
    }
}
