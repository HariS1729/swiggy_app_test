package androidx.compose.runtime;

import bp0.k;
import e0.g;
import e0.n0;
import java.util.Arrays;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: CompositionLocal.kt */
final class CompositionLocalKt$CompositionLocalProvider$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n0<?>[] f5990a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5991b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5992c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionLocalKt$CompositionLocalProvider$1(n0<?>[] n0VarArr, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5990a = n0VarArr;
        this.f5991b = pVar;
        this.f5992c = i11;
    }

    public final void a(g gVar, int i11) {
        n0<?>[] n0VarArr = this.f5990a;
        CompositionLocalKt.a((n0[]) Arrays.copyOf(n0VarArr, n0VarArr.length), this.f5991b, gVar, this.f5992c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
