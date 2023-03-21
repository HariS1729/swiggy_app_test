package c7;

import fp0.c;
import kotlin.coroutines.jvm.internal.f;
import okhttp3.Call;
import okhttp3.Response;
import wp0.o;

/* compiled from: Calls.kt */
public final class b {
    public static final Object a(Call call, c<? super Response> cVar) {
        o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        oVar.w();
        j jVar = new j(call, oVar);
        call.enqueue(jVar);
        oVar.N(jVar);
        Object t = oVar.t();
        if (t == b.d()) {
            f.c(cVar);
        }
        return t;
    }
}
