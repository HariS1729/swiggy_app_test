package androidx.compose.ui.layout;

import bp0.k;
import e0.g;
import i1.t;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: Layout.kt */
final class LayoutKt$MultiMeasureLayout$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f6726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f6727b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t f6728c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f6729d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f6730e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutKt$MultiMeasureLayout$2(d dVar, p<? super g, ? super Integer, k> pVar, t tVar, int i11, int i12) {
        super(2);
        this.f6726a = dVar;
        this.f6727b = pVar;
        this.f6728c = tVar;
        this.f6729d = i11;
        this.f6730e = i12;
    }

    public final void a(g gVar, int i11) {
        LayoutKt.a(this.f6726a, this.f6727b, this.f6728c, gVar, this.f6729d | 1, this.f6730e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
