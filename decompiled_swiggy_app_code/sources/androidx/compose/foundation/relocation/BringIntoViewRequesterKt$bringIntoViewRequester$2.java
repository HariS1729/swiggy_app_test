package androidx.compose.foundation.relocation;

import e0.g;
import e0.r;
import e0.s;
import e0.u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import y.b;
import y.f;

/* compiled from: BringIntoViewRequester.kt */
final class BringIntoViewRequesterKt$bringIntoViewRequester$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y.d f4149a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BringIntoViewRequesterKt$bringIntoViewRequester$2(y.d dVar) {
        super(3);
        this.f4149a = dVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-992853993);
        b b11 = f.b(gVar, 0);
        gVar.E(1157296644);
        boolean k = gVar.k(b11);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new b(b11);
            gVar.y(F);
        }
        gVar.P();
        final b bVar = (b) F;
        final y.d dVar2 = this.f4149a;
        if (dVar2 instanceof BringIntoViewRequesterImpl) {
            u.b(dVar2, new l<s, r>() {

                /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$2$1$a */
                /* compiled from: Effects.kt */
                public static final class a implements r {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ y.d f4152a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ b f4153b;

                    public a(y.d dVar, b bVar) {
                        this.f4152a = dVar;
                        this.f4153b = bVar;
                    }

                    public void dispose() {
                        ((BringIntoViewRequesterImpl) this.f4152a).b().r(this.f4153b);
                    }
                }

                /* renamed from: a */
                public final r invoke(s sVar) {
                    p.j(sVar, "$this$DisposableEffect");
                    ((BringIntoViewRequesterImpl) dVar2).b().b(bVar);
                    return new a(dVar2, bVar);
                }
            }, gVar, 0);
        }
        gVar.P();
        return bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
