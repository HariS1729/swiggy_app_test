package y2;

import bp0.k;
import fp0.c;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Serializer.kt */
public interface f<T> {
    Object a(T t, OutputStream outputStream, c<? super k> cVar);

    Object b(InputStream inputStream, c<? super T> cVar);

    T getDefaultValue();
}
