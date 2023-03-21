package androidx.compose.foundation.layout;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.d;

/* compiled from: Box.kt */
final class BoxKt$Box$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f3679a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f3680b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxKt$Box$3(d dVar, int i11) {
        super(2);
        this.f3679a = dVar;
        this.f3680b = i11;
    }

    public final void a(g gVar, int i11) {
        BoxKt.a(this.f3679a, gVar, this.f3680b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
