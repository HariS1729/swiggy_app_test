package androidx.compose.material;

import bp0.k;
import e0.g;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p0.d;
import t0.l;
import u0.j1;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$OutlinedTextFieldLayout$1 extends Lambda implements q<p<? super g, ? super Integer, ? extends k>, g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0<l> f5151a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q<d, g, Integer, k> f5152b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5153c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5154d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5155e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f5156f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f5157g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ long f5158h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ float f5159i;
    final /* synthetic */ int j;
    final /* synthetic */ j1 k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ float f5160l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ long f5161m;
    final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ int f5162o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldKt$OutlinedTextFieldLayout$1(h0<l> h0Var, q<? super d, ? super g, ? super Integer, k> qVar, p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, p<? super g, ? super Integer, k> pVar3, boolean z11, long j11, long j12, float f11, int i11, j1 j1Var, float f12, long j13, int i12, int i13) {
        super(3);
        this.f5151a = h0Var;
        this.f5152b = qVar;
        this.f5153c = pVar;
        this.f5154d = pVar2;
        this.f5155e = pVar3;
        this.f5156f = z11;
        this.f5157g = j11;
        this.f5158h = j12;
        this.f5159i = f11;
        this.j = i11;
        this.k = j1Var;
        this.f5160l = f12;
        this.f5161m = j13;
        this.n = i12;
        this.f5162o = i13;
    }

    public final void a(p<? super g, ? super Integer, k> pVar, g gVar, int i11) {
        int i12;
        p<? super g, ? super Integer, k> pVar2 = pVar;
        g gVar2 = gVar;
        kotlin.jvm.internal.p.j(pVar2, "coreTextField");
        if ((i11 & 14) == 0) {
            i12 = i11 | (gVar2.k(pVar2) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (((i12 & 91) ^ 18) != 0 || !gVar.b()) {
            long m11 = this.f5151a.getValue().m();
            q<d, g, Integer, k> qVar = this.f5152b;
            p<g, Integer, k> pVar3 = this.f5153c;
            p<g, Integer, k> pVar4 = this.f5154d;
            p<g, Integer, k> pVar5 = this.f5155e;
            boolean z11 = this.f5156f;
            long j11 = this.f5157g;
            long j12 = this.f5158h;
            float f11 = this.f5159i;
            Float valueOf = Float.valueOf(f11);
            h0<l> h0Var = this.f5151a;
            float f12 = this.f5159i;
            float f13 = f11;
            gVar2.E(-3686552);
            boolean k11 = gVar2.k(valueOf) | gVar2.k(h0Var);
            Object F = gVar.F();
            if (k11 || F == g.f14172a.a()) {
                F = new OutlinedTextFieldKt$OutlinedTextFieldLayout$1$1$1(f12, h0Var);
                gVar2.y(F);
            }
            gVar.P();
            j1 j1Var = this.k;
            long j13 = j12;
            float f14 = this.f5160l;
            long j14 = this.f5161m;
            int i13 = i12 & 14;
            int i14 = this.j;
            int i15 = i13 | ((i14 >> 3) & 112) | ((i14 >> 3) & 896) | ((i14 >> 3) & 7168) | (57344 & (i14 >> 3)) | (458752 & (this.n >> 9)) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14);
            int i16 = this.f5162o;
            long j15 = j13;
            OutlinedTextFieldKt.a(pVar, qVar, pVar3, pVar4, pVar5, z11, j11, j15, f13, (lp0.l) F, j1Var, f14, j14, m11, gVar, i15, ((i14 >> 24) & 112) | ((i16 >> 9) & 14) | ((i16 << 6) & 896));
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        a((p) obj, (g) obj2, ((Number) obj3).intValue());
        return k.f22762a;
    }
}
