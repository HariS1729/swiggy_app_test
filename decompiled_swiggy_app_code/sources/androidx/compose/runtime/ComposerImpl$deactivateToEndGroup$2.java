package androidx.compose.runtime;

import bp0.k;
import e0.e;
import e0.g;
import e0.j;
import e0.q0;
import e0.r0;
import e0.x0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;

/* compiled from: Composer.kt */
final class ComposerImpl$deactivateToEndGroup$2 extends Lambda implements p<Integer, Object, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposerImpl f5915a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5916b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$deactivateToEndGroup$2(ComposerImpl composerImpl, int i11) {
        super(2);
        this.f5915a = composerImpl;
        this.f5916b = i11;
    }

    public final void a(final int i11, final Object obj) {
        if (obj instanceof r0) {
            this.f5915a.H.N(this.f5916b);
            ComposerImpl composerImpl = this.f5915a;
            final int i12 = this.f5916b;
            ComposerImpl.p1(composerImpl, false, new q<e<?>, x0, q0, k>() {
                public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
                    kotlin.jvm.internal.p.j(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.p.j(x0Var, "slots");
                    kotlin.jvm.internal.p.j(q0Var, "rememberManager");
                    if (kotlin.jvm.internal.p.e(obj, x0Var.P0(i12, i11))) {
                        q0Var.c((r0) obj);
                        x0Var.K0(i11, g.f14172a.a());
                        return;
                    }
                    ComposerKt.x("Slot table is out of sync".toString());
                    throw new KotlinNothingValueException();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((e) obj, (x0) obj2, (q0) obj3);
                    return k.f22762a;
                }
            }, 1, (Object) null);
        } else if (obj instanceof RecomposeScopeImpl) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
            j l11 = recomposeScopeImpl.l();
            if (l11 != null) {
                l11.D(true);
                recomposeScopeImpl.x();
            }
            this.f5915a.H.N(this.f5916b);
            ComposerImpl composerImpl2 = this.f5915a;
            final int i13 = this.f5916b;
            ComposerImpl.p1(composerImpl2, false, new q<e<?>, x0, q0, k>() {
                public final void a(e<?> eVar, x0 x0Var, q0 q0Var) {
                    kotlin.jvm.internal.p.j(eVar, "<anonymous parameter 0>");
                    kotlin.jvm.internal.p.j(x0Var, "slots");
                    kotlin.jvm.internal.p.j(q0Var, "<anonymous parameter 2>");
                    if (kotlin.jvm.internal.p.e(obj, x0Var.P0(i13, i11))) {
                        x0Var.K0(i11, g.f14172a.a());
                    } else {
                        ComposerKt.x("Slot table is out of sync".toString());
                        throw new KotlinNothingValueException();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((e) obj, (x0) obj2, (q0) obj3);
                    return k.f22762a;
                }
            }, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a(((Number) obj).intValue(), obj2);
        return k.f22762a;
    }
}
