package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: ProgressIndicator.kt */
final class ProgressIndicatorKt$CircularProgressIndicator$4 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f5218a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f5219b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f5220c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f5221d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f5222e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressIndicatorKt$CircularProgressIndicator$4(d dVar, long j, float f11, int i11, int i12) {
        super(2);
        this.f5218a = dVar;
        this.f5219b = j;
        this.f5220c = f11;
        this.f5221d = i11;
        this.f5222e = i12;
    }

    public final void a(g gVar, int i11) {
        ProgressIndicatorKt.a(this.f5218a, this.f5219b, this.f5220c, gVar, this.f5221d | 1, this.f5222e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
