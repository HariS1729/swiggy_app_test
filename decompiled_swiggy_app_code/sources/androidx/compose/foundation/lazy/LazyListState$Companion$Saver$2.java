package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: LazyListState.kt */
final class LazyListState$Companion$Saver$2 extends Lambda implements l<List<? extends Integer>, LazyListState> {

    /* renamed from: a  reason: collision with root package name */
    public static final LazyListState$Companion$Saver$2 f4055a = new LazyListState$Companion$Saver$2();

    LazyListState$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: a */
    public final LazyListState invoke(List<Integer> list) {
        p.j(list, "it");
        return new LazyListState(list.get(0).intValue(), list.get(1).intValue());
    }
}
