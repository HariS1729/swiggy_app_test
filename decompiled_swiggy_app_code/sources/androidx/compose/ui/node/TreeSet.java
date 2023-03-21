package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.p;

/* compiled from: JvmTreeSet.jvm.kt */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TreeSet(Comparator<? super E> comparator) {
        super(comparator);
        p.j(comparator, "comparator");
    }

    public /* bridge */ int g() {
        return super.size();
    }

    public final /* bridge */ int size() {
        return g();
    }
}
