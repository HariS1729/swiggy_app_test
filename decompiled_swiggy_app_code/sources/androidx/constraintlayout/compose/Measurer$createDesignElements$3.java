package androidx.constraintlayout.compose;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ConstraintLayout.kt */
final class Measurer$createDesignElements$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Measurer f7989a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f7990b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Measurer$createDesignElements$3(Measurer measurer, int i11) {
        super(2);
        this.f7989a = measurer;
        this.f7990b = i11;
    }

    public final void a(g gVar, int i11) {
        this.f7989a.g(gVar, this.f7990b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
