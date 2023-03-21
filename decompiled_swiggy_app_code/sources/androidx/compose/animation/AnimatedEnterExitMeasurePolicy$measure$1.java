package androidx.compose.animation;

import bp0.k;
import i1.e0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AnimatedVisibility.kt */
final class AnimatedEnterExitMeasurePolicy$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<e0> f2460a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedEnterExitMeasurePolicy$measure$1(List<? extends e0> list) {
        super(1);
        this.f2460a = list;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        List<e0> list = this.f2460a;
        int size = list.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                e0.a.j(aVar, list.get(i11), 0, 0, 0.0f, 4, (Object) null);
                if (i12 <= size) {
                    i11 = i12;
                } else {
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
