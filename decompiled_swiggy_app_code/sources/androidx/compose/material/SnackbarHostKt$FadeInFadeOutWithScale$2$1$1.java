package androidx.compose.material;

import bp0.k;
import c0.v;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;

/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<v, g, Integer, k> f5311a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f5312b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5313c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(q<? super v, ? super g, ? super Integer, k> qVar, v vVar, int i11) {
        super(2);
        this.f5311a = qVar;
        this.f5312b = vVar;
        this.f5313c = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            q<v, g, Integer, k> qVar = this.f5311a;
            v vVar = this.f5312b;
            kotlin.jvm.internal.p.g(vVar);
            qVar.invoke(vVar, gVar, Integer.valueOf((this.f5313c >> 3) & 112));
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
