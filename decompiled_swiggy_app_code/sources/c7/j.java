package c7;

import bp0.g;
import bp0.k;
import java.io.IOException;
import kotlin.Result;
import lp0.l;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import wp0.n;

/* compiled from: Calls.kt */
final class j implements Callback, l<Throwable, k> {

    /* renamed from: a  reason: collision with root package name */
    private final Call f12860a;

    /* renamed from: b  reason: collision with root package name */
    private final n<Response> f12861b;

    public j(Call call, n<? super Response> nVar) {
        this.f12860a = call;
        this.f12861b = nVar;
    }

    public void a(Throwable th2) {
        try {
            this.f12860a.cancel();
        } catch (Throwable unused) {
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return k.f22762a;
    }

    public void onFailure(Call call, IOException iOException) {
        if (!call.isCanceled()) {
            n<Response> nVar = this.f12861b;
            Result.a aVar = Result.f25582b;
            nVar.resumeWith(Result.b(g.a(iOException)));
        }
    }

    public void onResponse(Call call, Response response) {
        n<Response> nVar = this.f12861b;
        Result.a aVar = Result.f25582b;
        nVar.resumeWith(Result.b(response));
    }
}
