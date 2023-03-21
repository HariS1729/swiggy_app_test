package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.FunctionReferenceImpl;
import lp0.l;
import w.k;

/* compiled from: LazySemantics.kt */
/* synthetic */ class LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1 extends FunctionReferenceImpl implements l<Integer, Object> {
    LazySemanticsKt$lazyListSemantics$1$indexForKeyMapping$1$key$1(Object obj) {
        super(1, obj, k.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
    }

    public final Object h(int i11) {
        return ((k) this.receiver).c(i11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return h(((Number) obj).intValue());
    }
}
