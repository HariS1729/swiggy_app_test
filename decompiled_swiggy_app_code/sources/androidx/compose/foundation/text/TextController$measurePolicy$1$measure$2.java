package androidx.compose.foundation.text;

import bp0.k;
import i1.e0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: CoreText.kt */
final class TextController$measurePolicy$1$measure$2 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<Pair<e0, d2.l>> f4516a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$measurePolicy$1$measure$2(List<? extends Pair<? extends e0, d2.l>> list) {
        super(1);
        this.f4516a = list;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        List<Pair<e0, d2.l>> list = this.f4516a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Pair pair = list.get(i11);
            e0.a.l(aVar, (e0) pair.a(), ((d2.l) pair.b()).n(), 0.0f, 2, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
