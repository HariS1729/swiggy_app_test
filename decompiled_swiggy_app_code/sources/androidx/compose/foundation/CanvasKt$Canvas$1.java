package androidx.compose.foundation;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import p0.d;
import w0.f;

/* compiled from: Canvas.kt */
final class CanvasKt$Canvas$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f2882a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<f, k> f2883b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f2884c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CanvasKt$Canvas$1(d dVar, l<? super f, k> lVar, int i11) {
        super(2);
        this.f2882a = dVar;
        this.f2883b = lVar;
        this.f2884c = i11;
    }

    public final void a(g gVar, int i11) {
        CanvasKt.a(this.f2882a, this.f2883b, gVar, this.f2884c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
