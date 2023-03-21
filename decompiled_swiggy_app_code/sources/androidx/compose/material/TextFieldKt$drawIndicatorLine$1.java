package androidx.compose.material;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.g;
import u0.e0;
import u0.x0;
import w0.e;
import w0.f;

/* compiled from: TextField.kt */
final class TextFieldKt$drawIndicatorLine$1 extends Lambda implements l<f, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f5694a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f5695b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKt$drawIndicatorLine$1(float f11, long j) {
        super(1);
        this.f5694a = f11;
        this.f5695b = j;
    }

    public final void a(f fVar) {
        f fVar2 = fVar;
        p.j(fVar2, "$this$drawBehind");
        float density = this.f5694a * fVar.getDensity();
        float g11 = t0.l.g(fVar.d()) - (density / ((float) 2));
        e.j(fVar2, this.f5695b, g.a(0.0f, g11), g.a(t0.l.i(fVar.d()), g11), density, 0, (x0) null, 0.0f, (e0) null, 0, 496, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((f) obj);
        return k.f22762a;
    }
}
