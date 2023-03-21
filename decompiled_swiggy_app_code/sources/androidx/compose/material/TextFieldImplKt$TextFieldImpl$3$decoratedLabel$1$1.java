package androidx.compose.material;

import a2.a;
import a2.d;
import a2.e;
import a2.h;
import a2.j;
import bp0.k;
import c0.q;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p1.c0;
import p1.d0;
import u0.h1;
import u1.i;
import u1.s;
import u1.t;
import u1.v;
import w1.f;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$TextFieldImpl$3$decoratedLabel$1$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f5581a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f5582b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5583c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5584d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f5585e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f5586f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$TextFieldImpl$3$decoratedLabel$1$1(float f11, long j, p<? super g, ? super Integer, k> pVar, int i11, boolean z11, long j11) {
        super(2);
        this.f5581a = f11;
        this.f5582b = j;
        this.f5583c = pVar;
        this.f5584d = i11;
        this.f5585e = z11;
        this.f5586f = j11;
    }

    public final void a(g gVar, int i11) {
        g gVar2 = gVar;
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            q qVar = q.f12737a;
            c0 c11 = d0.c(qVar.c(gVar2, 6).k(), qVar.c(gVar2, 6).d(), this.f5581a);
            TextFieldImplKt.a(this.f5582b, this.f5585e ? c0.c(c11, this.f5586f, 0, (v) null, (s) null, (t) null, (i) null, (String) null, 0, (a) null, (h) null, (f) null, 0, (e) null, (h1) null, (d) null, (a2.f) null, 0, (j) null, 262142, (Object) null) : c11, (Float) null, this.f5583c, gVar, ((this.f5584d >> 6) & 14) | 384, 0);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
