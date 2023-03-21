package pf0;

import in.swiggy.android.services.network.NetworkPreHeatWorker;
import in.swiggy.android.tejas.network.retrofit.utils.NetworkPreHeatUtils;
import java.io.IOException;
import kotlin.jvm.internal.p;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import os.u;

/* compiled from: NetworkPreHeatURLHandler.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final OkHttpClient f19813a;

    /* renamed from: pf0.a$a  reason: collision with other inner class name */
    /* compiled from: NetworkPreHeatURLHandler.kt */
    public static final class C0239a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f19814a;

        C0239a(a aVar) {
            this.f19814a = aVar;
        }

        public void onFailure(Call call, IOException iOException) {
            p.j(call, "call");
            p.j(iOException, "e");
            this.f19814a.b(iOException);
        }

        public void onResponse(Call call, Response response) {
            p.j(call, "call");
            p.j(response, "response");
        }
    }

    public a(OkHttpClient okHttpClient) {
        p.j(okHttpClient, "client");
        this.f19813a = okHttpClient;
    }

    /* access modifiers changed from: private */
    public final void b(Exception exc) {
        u.e(NetworkPreHeatWorker.k.a(), String.valueOf(exc.getMessage()), exc);
    }

    public final void c(String str) {
        p.j(str, "url");
        try {
            this.f19813a.newCall(new Request.Builder().url(NetworkPreHeatUtils.INSTANCE.buildPreHeatURL(str)).head().build()).enqueue(new C0239a(this));
        } catch (Exception e11) {
            b(e11);
        }
    }
}
