package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.p;

/* compiled from: Drawer.kt */
final class DrawerKt$Scrim$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f5021a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<k> f5022b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a<Float> f5023c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f5024d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5025e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$Scrim$2(boolean z11, a<k> aVar, a<Float> aVar2, long j, int i11) {
        super(2);
        this.f5021a = z11;
        this.f5022b = aVar;
        this.f5023c = aVar2;
        this.f5024d = j;
        this.f5025e = i11;
    }

    public final void a(g gVar, int i11) {
        DrawerKt.b(this.f5021a, this.f5022b, this.f5023c, this.f5024d, gVar, this.f5025e | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
