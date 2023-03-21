package androidx.compose.runtime;

import bp0.k;
import java.util.HashSet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n0.u;

/* compiled from: DerivedState.kt */
final class DerivedSnapshotState$currentRecord$result$1$result$1 extends Lambda implements l<Object, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DerivedSnapshotState<T> f6006a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HashSet<u> f6007b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DerivedSnapshotState$currentRecord$result$1$result$1(DerivedSnapshotState<T> derivedSnapshotState, HashSet<u> hashSet) {
        super(1);
        this.f6006a = derivedSnapshotState;
        this.f6007b = hashSet;
    }

    public final void invoke(Object obj) {
        p.j(obj, "it");
        if (obj == this.f6006a) {
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        } else if (obj instanceof u) {
            this.f6007b.add(obj);
        }
    }
}
