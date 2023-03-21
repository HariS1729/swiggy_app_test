package androidx.compose.ui.layout;

import bp0.k;
import d2.b;
import e0.g;
import i1.j0;
import i1.u;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutKt$SubcomposeLayout$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f6775a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<j0, b, u> f6776b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6777c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f6778d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutKt$SubcomposeLayout$2(d dVar, p<? super j0, ? super b, ? extends u> pVar, int i11, int i12) {
        super(2);
        this.f6775a = dVar;
        this.f6776b = pVar;
        this.f6777c = i11;
        this.f6778d = i12;
    }

    public final void a(g gVar, int i11) {
        SubcomposeLayoutKt.b(this.f6775a, this.f6776b, gVar, this.f6777c | 1, this.f6778d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
