package coil.compose;

import androidx.compose.ui.graphics.painter.Painter;
import bp0.k;
import e0.g;
import i1.c;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.a;
import p0.d;
import u0.e0;

/* compiled from: AsyncImage.kt */
final class AsyncImageKt$Content$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f13419a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f13420b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f13421c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f13422d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f13423e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ float f13424f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ e0 f13425g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f13426h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncImageKt$Content$2(d dVar, Painter painter, String str, a aVar, c cVar, float f11, e0 e0Var, int i11) {
        super(2);
        this.f13419a = dVar;
        this.f13420b = painter;
        this.f13421c = str;
        this.f13422d = aVar;
        this.f13423e = cVar;
        this.f13424f = f11;
        this.f13425g = e0Var;
        this.f13426h = i11;
    }

    public final void a(g gVar, int i11) {
        AsyncImageKt.b(this.f13419a, this.f13420b, this.f13421c, this.f13422d, this.f13423e, this.f13424f, this.f13425g, gVar, this.f13426h | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
