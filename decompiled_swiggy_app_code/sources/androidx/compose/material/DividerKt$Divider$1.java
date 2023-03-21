package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: Divider.kt */
final class DividerKt$Divider$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f4972a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f4973b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f4974c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f4975d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f4976e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f4977f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DividerKt$Divider$1(d dVar, long j, float f11, float f12, int i11, int i12) {
        super(2);
        this.f4972a = dVar;
        this.f4973b = j;
        this.f4974c = f11;
        this.f4975d = f12;
        this.f4976e = i11;
        this.f4977f = i12;
    }

    public final void a(g gVar, int i11) {
        DividerKt.a(this.f4972a, this.f4973b, this.f4974c, this.f4975d, gVar, this.f4976e | 1, this.f4977f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
