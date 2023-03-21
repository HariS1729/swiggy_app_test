package u4;

import fp0.c;
import kotlin.Result;

/* compiled from: Continuation.kt */
public interface b<T> extends c<T> {

    /* compiled from: Continuation.kt */
    public static final class a {
        public static <T> void a(b<? super T> bVar, Object obj) {
            Throwable d11 = Result.d(obj);
            if (d11 == null) {
                bVar.p(obj);
            } else {
                bVar.s(d11);
            }
        }
    }

    void p(T t);

    void s(Throwable th2);
}
