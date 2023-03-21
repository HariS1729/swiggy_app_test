package androidx.constraintlayout.compose;

import bp0.k;
import defpackage.a2;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ConstraintLayout.kt */
final class Measurer$drawDebugBounds$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Measurer f7993a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a2.e f7994b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f7995c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f7996d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Measurer$drawDebugBounds$2(Measurer measurer, a2.e eVar, float f11, int i11) {
        super(2);
        this.f7993a = measurer;
        this.f7994b = eVar;
        this.f7995c = f11;
        this.f7996d = i11;
    }

    public final void a(g gVar, int i11) {
        this.f7993a.h(this.f7994b, this.f7995c, gVar, this.f7996d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
