package androidx.compose.material;

import bp0.k;
import c0.g0;
import e0.g;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.p;
import p1.c0;

/* compiled from: MaterialTheme.kt */
final class MaterialThemeKt$MaterialTheme$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g0 f5084a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5085b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5086c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MaterialThemeKt$MaterialTheme$1(g0 g0Var, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5084a = g0Var;
        this.f5085b = pVar;
        this.f5086c = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            c0 a11 = this.f5084a.a();
            final p<g, Integer, k> pVar = this.f5085b;
            final int i12 = this.f5086c;
            TextKt.a(a11, b.b(gVar, -819893830, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                        MaterialTheme_androidKt.a(pVar, gVar, (i12 >> 9) & 14);
                    } else {
                        gVar.h();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            }), gVar, 48);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
