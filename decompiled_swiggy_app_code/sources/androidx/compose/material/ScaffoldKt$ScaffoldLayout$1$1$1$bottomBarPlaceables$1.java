package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import bp0.k;
import e0.g;
import e0.n0;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0.k f5289a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5290b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5291c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(c0.k kVar, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5289a = kVar;
        this.f5290b = pVar;
        this.f5291c = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            CompositionLocalKt.a(new n0[]{ScaffoldKt.e().c(this.f5289a)}, this.f5290b, gVar, ((this.f5291c >> 15) & 112) | 8);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
