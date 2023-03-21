package androidx.compose.ui.layout;

import bp0.k;
import i1.e0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: RootMeasurePolicy.kt */
final class RootMeasurePolicy$measure$4 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<e0> f6773a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RootMeasurePolicy$measure$4(List<? extends e0> list) {
        super(1);
        this.f6773a = list;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        List<e0> list = this.f6773a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            e0.a.r(aVar, list.get(i11), 0, 0, 0.0f, (l) null, 12, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
