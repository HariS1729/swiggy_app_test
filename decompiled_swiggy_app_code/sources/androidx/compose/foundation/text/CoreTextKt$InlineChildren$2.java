package androidx.compose.foundation.text;

import bp0.k;
import e0.g;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.q;
import p1.b;

/* compiled from: CoreText.kt */
final class CoreTextKt$InlineChildren$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f4452a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<b.C0163b<q<String, g, Integer, k>>> f4453b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f4454c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextKt$InlineChildren$2(b bVar, List<b.C0163b<q<String, g, Integer, k>>> list, int i11) {
        super(2);
        this.f4452a = bVar;
        this.f4453b = list;
        this.f4454c = i11;
    }

    public final void a(g gVar, int i11) {
        CoreTextKt.a(this.f4452a, this.f4453b, gVar, this.f4454c | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
