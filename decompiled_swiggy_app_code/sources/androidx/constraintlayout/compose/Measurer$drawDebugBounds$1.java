package androidx.constraintlayout.compose;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.g;
import u0.d0;
import u0.e0;
import u0.x0;
import w0.e;
import w0.f;

/* compiled from: ConstraintLayout.kt */
final class Measurer$drawDebugBounds$1 extends Lambda implements l<f, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Measurer f7991a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f7992b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Measurer$drawDebugBounds$1(Measurer measurer, float f11) {
        super(1);
        this.f7991a = measurer;
        this.f7992b = f11;
    }

    public final void a(f fVar) {
        p.j(fVar, "$this$Canvas");
        float o11 = ((float) this.f7991a.o()) * this.f7992b;
        float n = ((float) this.f7991a.n()) * this.f7992b;
        float i11 = (t0.l.i(fVar.d()) - o11) / 2.0f;
        float g11 = (t0.l.g(fVar.d()) - n) / 2.0f;
        d0.a aVar = d0.f16756b;
        float f11 = i11 + o11;
        f fVar2 = fVar;
        long g12 = aVar.g();
        float f12 = i11;
        e.j(fVar2, g12, g.a(i11, g11), g.a(f11, g11), 0.0f, 0, (x0) null, 0.0f, (e0) null, 0, 504, (Object) null);
        float f13 = f11;
        float f14 = g11;
        float f15 = f14 + n;
        float f16 = f14;
        e.j(fVar2, g12, g.a(f13, f14), g.a(f13, f15), 0.0f, 0, (x0) null, 0.0f, (e0) null, 0, 504, (Object) null);
        float f17 = f15;
        long a11 = g.a(f13, f17);
        float f18 = f12;
        float f19 = f17;
        e.j(fVar2, g12, a11, g.a(f18, f17), 0.0f, 0, (x0) null, 0.0f, (e0) null, 0, 504, (Object) null);
        float f21 = f18;
        float f22 = f16;
        e.j(fVar2, g12, g.a(f21, f19), g.a(f21, f22), 0.0f, 0, (x0) null, 0.0f, (e0) null, 0, 504, (Object) null);
        float f23 = (float) 1;
        float f24 = f21 + f23;
        float f25 = f22 + f23;
        float f26 = o11 + f24;
        f fVar3 = fVar;
        long a12 = aVar.a();
        float f27 = f24;
        e.j(fVar3, a12, g.a(f24, f25), g.a(f26, f25), 0.0f, 0, (x0) null, 0.0f, (e0) null, 0, 504, (Object) null);
        float f28 = f25;
        float f29 = f28 + n;
        float f31 = f28;
        e.j(fVar3, a12, g.a(f26, f28), g.a(f26, f29), 0.0f, 0, (x0) null, 0.0f, (e0) null, 0, 504, (Object) null);
        float f32 = f29;
        long a13 = g.a(f26, f32);
        float f33 = f27;
        e.j(fVar3, a12, a13, g.a(f33, f32), 0.0f, 0, (x0) null, 0.0f, (e0) null, 0, 504, (Object) null);
        e.j(fVar3, a12, g.a(f33, f32), g.a(f33, f31), 0.0f, 0, (x0) null, 0.0f, (e0) null, 0, 504, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((f) obj);
        return k.f22762a;
    }
}
