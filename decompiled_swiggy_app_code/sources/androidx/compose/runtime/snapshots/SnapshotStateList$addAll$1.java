package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SnapshotStateList.kt */
final class SnapshotStateList$addAll$1 extends Lambda implements l<List<T>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6265a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Collection<T> f6266b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateList$addAll$1(int i11, Collection<? extends T> collection) {
        super(1);
        this.f6265a = i11;
        this.f6266b = collection;
    }

    /* renamed from: a */
    public final Boolean invoke(List<T> list) {
        p.j(list, "it");
        return Boolean.valueOf(list.addAll(this.f6265a, this.f6266b));
    }
}
