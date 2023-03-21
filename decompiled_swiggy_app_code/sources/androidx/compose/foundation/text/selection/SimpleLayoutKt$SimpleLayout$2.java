package androidx.compose.foundation.text.selection;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: SimpleLayout.kt */
final class SimpleLayoutKt$SimpleLayout$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f4733a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4734b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4735c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f4736d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SimpleLayoutKt$SimpleLayout$2(d dVar, p<? super g, ? super Integer, k> pVar, int i11, int i12) {
        super(2);
        this.f4733a = dVar;
        this.f4734b = pVar;
        this.f4735c = i11;
        this.f4736d = i12;
    }

    public final void a(g gVar, int i11) {
        SimpleLayoutKt.a(this.f4733a, this.f4734b, gVar, this.f4735c | 1, this.f4736d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
