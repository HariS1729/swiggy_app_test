package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: Schema */
interface y0<T> {
    void a(T t, Writer writer) throws IOException;

    void b(T t, x0 x0Var, n nVar) throws IOException;

    boolean equals(T t, T t11);

    int getSerializedSize(T t);

    int hashCode(T t);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, T t11);

    T newInstance();
}
