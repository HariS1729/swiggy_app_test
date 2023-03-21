package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import w.k;

/* compiled from: LazySemantics.kt */
final class LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1 extends Lambda implements l<Object, Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f4079a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1(k kVar) {
        super(1);
        this.f4079a = kVar;
    }

    /* renamed from: a */
    public final Integer invoke(Object obj) {
        p.j(obj, "needle");
        LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 = new LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1(this.f4079a);
        int itemCount = this.f4079a.getItemCount();
        int i11 = 0;
        while (true) {
            if (i11 >= itemCount) {
                i11 = -1;
                break;
            } else if (p.e(lazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1.invoke(Integer.valueOf(i11)), obj)) {
                break;
            } else {
                i11++;
            }
        }
        return Integer.valueOf(i11);
    }
}
