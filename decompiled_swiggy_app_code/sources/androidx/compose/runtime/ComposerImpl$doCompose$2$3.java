package androidx.compose.runtime;

import bp0.k;
import e0.d1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Composer.kt */
final class ComposerImpl$doCompose$2$3 extends Lambda implements l<d1<?>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposerImpl f5923a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$doCompose$2$3(ComposerImpl composerImpl) {
        super(1);
        this.f5923a = composerImpl;
    }

    public final void a(d1<?> d1Var) {
        p.j(d1Var, "it");
        ComposerImpl composerImpl = this.f5923a;
        composerImpl.B = composerImpl.B + 1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((d1) obj);
        return k.f22762a;
    }
}
