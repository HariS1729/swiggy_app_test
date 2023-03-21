package g0;

import java.util.Collection;
import java.util.List;
import lp0.l;
import mp0.b;
import mp0.d;

/* compiled from: ImmutableList.kt */
public interface f<E> extends d<E>, b {

    /* compiled from: ImmutableList.kt */
    public interface a<E> extends List<E>, Collection, b, d {
        f<E> build();
    }

    f<E> C(int i11);

    f<E> add(int i11, E e11);

    f<E> add(E e11);

    f<E> addAll(Collection<? extends E> collection);

    a<E> j();

    f<E> remove(E e11);

    f<E> removeAll(Collection<? extends E> collection);

    f<E> set(int i11, E e11);

    f<E> x(l<? super E, Boolean> lVar);
}
