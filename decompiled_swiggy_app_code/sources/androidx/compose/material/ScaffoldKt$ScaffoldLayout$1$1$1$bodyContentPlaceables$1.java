package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import bp0.k;
import defpackage.a2;
import e0.g;
import i1.j0;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j0 f5285a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5286b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q<a2.p, g, Integer, k> f5287c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5288d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(j0 j0Var, int i11, q<? super a2.p, ? super g, ? super Integer, k> qVar, int i12) {
        super(2);
        this.f5285a = j0Var;
        this.f5286b = i11;
        this.f5287c = qVar;
        this.f5288d = i12;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            this.f5287c.invoke(PaddingKt.e(0.0f, 0.0f, 0.0f, this.f5285a.k(this.f5286b), 7, (Object) null), gVar, Integer.valueOf((this.f5288d >> 6) & 112));
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
