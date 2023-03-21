package androidx.compose.foundation;

import androidx.compose.ui.graphics.painter.Painter;
import bp0.k;
import e0.g;
import i1.c;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.a;
import p0.d;
import u0.e0;

/* compiled from: Image.kt */
final class ImageKt$Image$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f3046a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f3047b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f3048c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f3049d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f3050e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ float f3051f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ e0 f3052g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f3053h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f3054i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ImageKt$Image$3(Painter painter, String str, d dVar, a aVar, c cVar, float f11, e0 e0Var, int i11, int i12) {
        super(2);
        this.f3046a = painter;
        this.f3047b = str;
        this.f3048c = dVar;
        this.f3049d = aVar;
        this.f3050e = cVar;
        this.f3051f = f11;
        this.f3052g = e0Var;
        this.f3053h = i11;
        this.f3054i = i12;
    }

    public final void a(g gVar, int i11) {
        ImageKt.a(this.f3046a, this.f3047b, this.f3048c, this.f3049d, this.f3050e, this.f3051f, this.f3052g, gVar, this.f3053h | 1, this.f3054i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
