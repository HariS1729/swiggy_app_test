package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: PersistentVectorBuilder.kt */
final class PersistentVectorBuilder$removeAll$1 extends Lambda implements l<E, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Collection<E> f6138a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PersistentVectorBuilder$removeAll$1(Collection<? extends E> collection) {
        super(1);
        this.f6138a = collection;
    }

    /* renamed from: a */
    public final Boolean invoke(E e11) {
        return Boolean.valueOf(this.f6138a.contains(e11));
    }
}
