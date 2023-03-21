package androidx.compose.foundation;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.a;
import u0.c0;
import u0.e0;
import u0.u;
import w0.c;
import w0.d;
import w0.e;
import w0.g;

/* compiled from: Border.kt */
final class BorderKt$drawRoundRectBorder$1 extends Lambda implements l<c, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f2872a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u f2873b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f2874c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f2875d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f2876e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f2877f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f2878g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ w0.l f2879h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BorderKt$drawRoundRectBorder$1(boolean z11, u uVar, long j, float f11, float f12, long j11, long j12, w0.l lVar) {
        super(1);
        this.f2872a = z11;
        this.f2873b = uVar;
        this.f2874c = j;
        this.f2875d = f11;
        this.f2876e = f12;
        this.f2877f = j11;
        this.f2878g = j12;
        this.f2879h = lVar;
    }

    public final void a(c cVar) {
        p.j(cVar, "$this$onDrawWithContent");
        cVar.V();
        if (this.f2872a) {
            e.o(cVar, this.f2873b, 0, 0, this.f2874c, 0.0f, (g) null, (e0) null, 0, 246, (Object) null);
            return;
        }
        float d11 = a.d(this.f2874c);
        float f11 = this.f2875d;
        if (d11 < f11) {
            float f12 = this.f2876e;
            float i11 = t0.l.i(cVar.d()) - this.f2876e;
            float g11 = t0.l.g(cVar.d()) - this.f2876e;
            int a11 = c0.f16752a.a();
            u uVar = this.f2873b;
            long j = this.f2874c;
            d O = cVar.O();
            long d12 = O.d();
            O.a().a();
            O.c().b(f12, f12, i11, g11, a11);
            e.o(cVar, uVar, 0, 0, j, 0.0f, (g) null, (e0) null, 0, 246, (Object) null);
            O.a().o();
            O.b(d12);
            return;
        }
        e.o(cVar, this.f2873b, this.f2877f, this.f2878g, BorderKt.r(this.f2874c, f11), 0.0f, this.f2879h, (e0) null, 0, 208, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((c) obj);
        return k.f22762a;
    }
}
