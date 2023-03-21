package androidx.databinding;

import java.util.List;

/* compiled from: ObservableList */
public interface m<T> extends List<T> {

    /* compiled from: ObservableList */
    public static abstract class a<T extends m> {
        public abstract void a(T t);

        public abstract void e(T t, int i11, int i12);

        public abstract void f(T t, int i11, int i12);

        public abstract void g(T t, int i11, int i12, int i13);

        public abstract void h(T t, int i11, int i12);
    }

    void A(a<? extends m<T>> aVar);

    void y(a<? extends m<T>> aVar);
}
