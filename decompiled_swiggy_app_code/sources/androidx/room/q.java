package androidx.room;

import t3.k;

/* compiled from: EntityDeletionOrUpdateAdapter */
public abstract class q<T> extends x0 {
    public q(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* access modifiers changed from: protected */
    public abstract void g(k kVar, T t);

    public final int h(T t) {
        k a11 = a();
        try {
            g(a11, t);
            return a11.n();
        } finally {
            f(a11);
        }
    }

    public final int i(T[] tArr) {
        k a11 = a();
        try {
            int i11 = 0;
            for (T g11 : tArr) {
                g(a11, g11);
                i11 += a11.n();
            }
            return i11;
        } finally {
            f(a11);
        }
    }
}
