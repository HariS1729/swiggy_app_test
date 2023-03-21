package androidx.compose.material;

import bp0.k;
import c0.t;
import defpackage.a2;
import e0.g;
import kotlin.jvm.internal.Lambda;
import l0.a;
import l0.b;
import lp0.p;
import lp0.q;
import p0.d;
import u0.j1;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$Scaffold$child$1 extends Lambda implements q<d, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f5245a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f5246b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5247c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f5248d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5249e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5250f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ q<a2.p, g, Integer, k> f5251g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5252h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5253i;
    final /* synthetic */ int j;
    final /* synthetic */ q<SnackbarHostState, g, Integer, k> k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ t f5254l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$Scaffold$child$1(long j11, long j12, int i11, boolean z11, int i12, p<? super g, ? super Integer, k> pVar, q<? super a2.p, ? super g, ? super Integer, k> qVar, p<? super g, ? super Integer, k> pVar2, p<? super g, ? super Integer, k> pVar3, int i13, q<? super SnackbarHostState, ? super g, ? super Integer, k> qVar2, t tVar) {
        super(3);
        this.f5245a = j11;
        this.f5246b = j12;
        this.f5247c = i11;
        this.f5248d = z11;
        this.f5249e = i12;
        this.f5250f = pVar;
        this.f5251g = qVar;
        this.f5252h = pVar2;
        this.f5253i = pVar3;
        this.j = i13;
        this.k = qVar2;
        this.f5254l = tVar;
    }

    public final void a(d dVar, g gVar, int i11) {
        int i12;
        d dVar2 = dVar;
        g gVar2 = gVar;
        kotlin.jvm.internal.p.j(dVar2, "childModifier");
        if ((i11 & 14) == 0) {
            i12 = i11 | (gVar2.k(dVar2) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (((i12 & 91) ^ 18) != 0 || !gVar.b()) {
            long j11 = this.f5245a;
            long j12 = this.f5246b;
            final boolean z11 = this.f5248d;
            int i13 = this.f5249e;
            p<g, Integer, k> pVar = this.f5250f;
            q<a2.p, g, Integer, k> qVar = this.f5251g;
            p<g, Integer, k> pVar2 = this.f5252h;
            p<g, Integer, k> pVar3 = this.f5253i;
            int i14 = this.j;
            long j13 = j11;
            AnonymousClass1 r42 = r13;
            final int i15 = i13;
            final p<g, Integer, k> pVar4 = pVar;
            final q<a2.p, g, Integer, k> qVar2 = qVar;
            final p<g, Integer, k> pVar5 = pVar2;
            final p<g, Integer, k> pVar6 = pVar3;
            final int i16 = i14;
            final int i17 = this.f5247c;
            final q<SnackbarHostState, g, Integer, k> qVar3 = this.k;
            final t tVar = this.f5254l;
            AnonymousClass1 r13 = new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                        boolean z11 = z11;
                        int i12 = i15;
                        p<g, Integer, k> pVar = pVar4;
                        q<a2.p, g, Integer, k> qVar = qVar2;
                        final q<SnackbarHostState, g, Integer, k> qVar2 = qVar3;
                        final t tVar = tVar;
                        final int i13 = i16;
                        a b11 = b.b(gVar, -819902883, true, new p<g, Integer, k>() {
                            public final void a(g gVar, int i11) {
                                if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                                    qVar2.invoke(tVar.b(), gVar, Integer.valueOf((i13 >> 9) & 112));
                                } else {
                                    gVar.h();
                                }
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((g) obj, ((Number) obj2).intValue());
                                return k.f22762a;
                            }
                        });
                        p<g, Integer, k> pVar2 = pVar5;
                        p<g, Integer, k> pVar3 = pVar6;
                        int i14 = i16;
                        ScaffoldKt.b(z11, i12, pVar, qVar, b11, pVar2, pVar3, gVar, ((i14 >> 21) & 14) | 24576 | ((i14 >> 15) & 112) | (i14 & 896) | ((i17 >> 12) & 7168) | (458752 & i14) | ((i14 << 9) & 3670016));
                        return;
                    }
                    gVar.h();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            };
            a b11 = b.b(gVar2, -819889840, true, r42);
            int i18 = 1572864 | (i12 & 14);
            int i19 = this.f5247c;
            SurfaceKt.b(dVar, (j1) null, j13, j12, (s.b) null, 0.0f, b11, gVar, i18 | ((i19 >> 9) & 896) | ((i19 >> 9) & 7168), 50);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((d) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
