package androidx.compose.material;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: MaterialTheme.android.kt */
final class MaterialTheme_androidKt$PlatformMaterialTheme$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5095a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f5096b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MaterialTheme_androidKt$PlatformMaterialTheme$1(p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f5095a = pVar;
        this.f5096b = i11;
    }

    public final void a(g gVar, int i11) {
        MaterialTheme_androidKt.a(this.f5095a, gVar, this.f5096b | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
