package androidx.compose.material;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import u0.e0;
import w0.e;
import w0.f;
import w0.g;

/* compiled from: Drawer.kt */
final class DrawerKt$Scrim$1$1 extends Lambda implements l<f, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f5019a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<Float> f5020b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$Scrim$1$1(long j, a<Float> aVar) {
        super(1);
        this.f5019a = j;
        this.f5020b = aVar;
    }

    public final void a(f fVar) {
        p.j(fVar, "$this$Canvas");
        e.n(fVar, this.f5019a, 0, 0, this.f5020b.invoke().floatValue(), (g) null, (e0) null, 0, 118, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((f) obj);
        return k.f22762a;
    }
}
