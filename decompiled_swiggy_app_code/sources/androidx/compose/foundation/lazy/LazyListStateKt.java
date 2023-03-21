package androidx.compose.foundation.lazy;

import androidx.compose.runtime.saveable.RememberSaveableKt;
import e0.g;

/* compiled from: LazyListState.kt */
public final class LazyListStateKt {
    public static final LazyListState a(int i11, int i12, g gVar, int i13, int i14) {
        gVar.E(1470655220);
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.b(new Object[0], LazyListState.t.a(), (String) null, new LazyListStateKt$rememberLazyListState$1(i11, i12), gVar, 72, 4);
        gVar.P();
        return lazyListState;
    }
}
