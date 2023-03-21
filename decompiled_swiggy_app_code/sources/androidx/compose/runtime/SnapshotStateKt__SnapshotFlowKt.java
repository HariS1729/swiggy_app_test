package androidx.compose.runtime;

import e0.d1;
import e0.g;
import fp0.c;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.r;
import lp0.a;

/* compiled from: SnapshotFlow.kt */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final <T extends R, R> d1<R> b(d<? extends T> dVar, R r11, CoroutineContext coroutineContext, g gVar, int i11, int i12) {
        p.j(dVar, "<this>");
        gVar.E(-606625098);
        if ((i12 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.f25631a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        int i13 = i11 >> 3;
        d1<R> k = g.k(r11, dVar, coroutineContext2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(coroutineContext2, dVar, (c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1>) null), gVar, (i13 & 8) | 576 | (i13 & 14));
        gVar.P();
        return k;
    }

    public static final <T> d1<T> c(r<? extends T> rVar, CoroutineContext coroutineContext, g gVar, int i11, int i12) {
        p.j(rVar, "<this>");
        gVar.E(-1439883919);
        if ((i12 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f25631a;
        }
        r<? extends T> rVar2 = rVar;
        d1<T> a11 = g.a(rVar2, rVar.getValue(), coroutineContext, gVar, 520, 0);
        gVar.P();
        return a11;
    }

    /* access modifiers changed from: private */
    public static final <T> boolean d(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                for (T contains : set) {
                    if (set2.contains(contains)) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            for (T contains2 : set2) {
                if (set.contains(contains2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final <T> d<T> e(a<? extends T> aVar) {
        p.j(aVar, RenderingDetails.TYPE_BLOCK);
        return f.x(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(aVar, (c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1>) null));
    }
}
