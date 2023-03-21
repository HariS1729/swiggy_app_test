package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;

/* compiled from: LazyListState.kt */
final class LazyListState$Companion$Saver$1 extends Lambda implements p<d, LazyListState, List<? extends Integer>> {

    /* renamed from: a  reason: collision with root package name */
    public static final LazyListState$Companion$Saver$1 f4054a = new LazyListState$Companion$Saver$1();

    LazyListState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: a */
    public final List<Integer> invoke(d dVar, LazyListState lazyListState) {
        kotlin.jvm.internal.p.j(dVar, "$this$listSaver");
        kotlin.jvm.internal.p.j(lazyListState, "it");
        return k.m(Integer.valueOf(lazyListState.i()), Integer.valueOf(lazyListState.j()));
    }
}
