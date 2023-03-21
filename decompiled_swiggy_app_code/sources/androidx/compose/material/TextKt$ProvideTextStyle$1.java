package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p1.c0;

/* compiled from: Text.kt */
final class TextKt$ProvideTextStyle$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c0 f5730a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5731b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5732c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextKt$ProvideTextStyle$1(c0 c0Var, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5730a = c0Var;
        this.f5731b = pVar;
        this.f5732c = i11;
    }

    public final void a(g gVar, int i11) {
        TextKt.a(this.f5730a, this.f5731b, gVar, this.f5732c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
