package androidx.compose.foundation.lazy;

import bp0.k;
import i1.e0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import w.q;

/* compiled from: LazyListMeasure.kt */
final class LazyListMeasureKt$measureLazyList$3 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<q> f4029a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q f4030b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListMeasureKt$measureLazyList$3(List<q> list, q qVar) {
        super(1);
        this.f4029a = list;
        this.f4030b = qVar;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$invoke");
        List<q> list = this.f4029a;
        q qVar = this.f4030b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar2 = list.get(i11);
            if (qVar2 != qVar) {
                qVar2.k(aVar);
            }
        }
        q qVar3 = this.f4030b;
        if (qVar3 != null) {
            qVar3.k(aVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
