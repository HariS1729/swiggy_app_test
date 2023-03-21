package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SnapshotStateList.kt */
final class SnapshotStateList$retainAll$1 extends Lambda implements l<List<T>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Collection<T> f6267a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateList$retainAll$1(Collection<? extends T> collection) {
        super(1);
        this.f6267a = collection;
    }

    /* renamed from: a */
    public final Boolean invoke(List<T> list) {
        p.j(list, "it");
        return Boolean.valueOf(list.retainAll(this.f6267a));
    }
}
