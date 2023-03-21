package androidx.compose.runtime;

import bp0.k;
import e0.h;
import e0.j;
import f0.a;
import f0.b;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: RecomposeScopeImpl.kt */
final class RecomposeScopeImpl$end$1$2 extends Lambda implements l<h, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecomposeScopeImpl f6036a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6037b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f6038c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i11, a aVar) {
        super(1);
        this.f6036a = recomposeScopeImpl;
        this.f6037b = i11;
        this.f6038c = aVar;
    }

    public final void a(h hVar) {
        p.j(hVar, "composition");
        if (this.f6036a.f6033e == this.f6037b && p.e(this.f6038c, this.f6036a.f6034f) && (hVar instanceof j)) {
            a aVar = this.f6038c;
            int i11 = this.f6037b;
            RecomposeScopeImpl recomposeScopeImpl = this.f6036a;
            int e11 = aVar.e();
            int i12 = 0;
            for (int i13 = 0; i13 < e11; i13++) {
                Object obj = aVar.d()[i13];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
                int i14 = aVar.f()[i13];
                boolean z11 = i14 != i11;
                if (z11) {
                    j jVar = (j) hVar;
                    jVar.C(obj, recomposeScopeImpl);
                    e0.p pVar = obj instanceof e0.p ? (e0.p) obj : null;
                    if (pVar != null) {
                        jVar.B(pVar);
                        b c11 = recomposeScopeImpl.f6035g;
                        if (c11 != null) {
                            c11.i(pVar);
                            if (c11.f() == 0) {
                                recomposeScopeImpl.f6035g = null;
                            }
                        }
                    }
                }
                if (!z11) {
                    if (i12 != i13) {
                        aVar.d()[i12] = obj;
                        aVar.f()[i12] = i14;
                    }
                    i12++;
                }
            }
            int e12 = aVar.e();
            for (int i15 = i12; i15 < e12; i15++) {
                aVar.d()[i15] = null;
            }
            aVar.g(i12);
            if (this.f6038c.e() == 0) {
                this.f6036a.f6034f = null;
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((h) obj);
        return k.f22762a;
    }
}
