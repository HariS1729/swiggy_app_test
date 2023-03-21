package androidx.room;

import t3.k;

/* compiled from: EntityInsertionAdapter */
public abstract class s<T> extends x0 {
    public s(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* access modifiers changed from: protected */
    public abstract void g(k kVar, T t);

    public final void h(T t) {
        k a11 = a();
        try {
            g(a11, t);
            a11.P0();
        } finally {
            f(a11);
        }
    }

    public final void i(T[] tArr) {
        k a11 = a();
        try {
            for (T g11 : tArr) {
                g(a11, g11);
                a11.P0();
            }
        } finally {
            f(a11);
        }
    }

    public final long j(T t) {
        k a11 = a();
        try {
            g(a11, t);
            return a11.P0();
        } finally {
            f(a11);
        }
    }
}
