package androidx.compose.runtime;

import bp0.k;
import e0.e0;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Composer.kt */
final class ComposerImpl$invokeMovableContentLambda$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0<Object> f5948a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f5949b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$invokeMovableContentLambda$1(e0<Object> e0Var, Object obj) {
        super(2);
        this.f5948a = e0Var;
        this.f5949b = obj;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            this.f5948a.a().invoke(this.f5949b, gVar, 8);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
