package v5;

import android.annotation.SuppressLint;
import android.util.Log;
import co.hyperverge.hypersnapsdk.b.e;
import co.hyperverge.hypersnapsdk.objects.HVError;
import in.swiggy.android.tejas.network.HttpRequest;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import w5.h;
import w5.n;
import w5.o;

@SuppressLint({"LogNotTimber"})
/* compiled from: HVRemoteConfigRepo */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f17296b = "v5.d";

    /* renamed from: c  reason: collision with root package name */
    private static d f17297c = null;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ boolean f17298d = true;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f17299a = Executors.newSingleThreadExecutor();

    /* compiled from: HVRemoteConfigRepo */
    class a implements Callback<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f17300a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f17301b;

        a(boolean z11, b bVar) {
            this.f17300a = z11;
            this.f17301b = bVar;
        }

        public void onFailure(Call<e> call, Throwable th2) {
            if (this.f17300a) {
                d.this.j(true, th2.getMessage(), 12);
            }
            n.w().c(new e());
            this.f17301b.a(new HVError(12, "Could not get remote configs"));
        }

        public void onResponse(Call<e> call, Response<e> response) {
            String str;
            if (response.isSuccessful()) {
                d.this.i(this.f17300a);
                n.w().c(response.body());
                this.f17301b.onSuccess();
                return;
            }
            if (response.errorBody() != null) {
                try {
                    str = response.errorBody().string();
                } catch (IOException e11) {
                    Log.e(a.class.getCanonicalName(), e11.getMessage());
                }
                d.this.j(this.f17300a, str, response.code());
                n.w().b();
                this.f17301b.a(new HVError(response.code(), "Could not get remote configs"));
            }
            str = "Server Error";
            d.this.j(this.f17300a, str, response.code());
            n.w().b();
            this.f17301b.a(new HVError(response.code(), "Could not get remote configs"));
        }
    }

    /* compiled from: HVRemoteConfigRepo */
    public interface b {
        void a(HVError hVError);

        void onSuccess();
    }

    private d() {
    }

    private <T> String b(Response<T> response) {
        String str;
        if (response.isSuccessful()) {
            return "";
        }
        if (response.errorBody() != null) {
            try {
                str = response.errorBody().string();
            } catch (IOException e11) {
                Log.e(d.class.getCanonicalName(), e11.getMessage());
            }
            j(false, str, response.code());
            return str;
        }
        str = "Server Error";
        j(false, str, response.code());
        return str;
    }

    public static d c() {
        if (f17297c == null) {
            f17297c = new d();
        }
        return f17297c;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2, b bVar) {
        try {
            e c11 = a.c();
            Response<u5.b> execute = c11.a(str).execute();
            Response<u5.b> execute2 = c11.a(str2).execute();
            if (!execute.isSuccessful() || !execute2.isSuccessful()) {
                String b11 = b(execute);
                String b12 = b(execute2);
                bVar.a(new HVError(12, b11 + "\n" + b12));
                return;
            }
            if (execute.headers() != null && execute.headers().toMultimap().containsKey(HttpRequest.HEADER_CACHE_CONTROL)) {
                o.c(Integer.valueOf(execute.headers().get(HttpRequest.HEADER_CACHE_CONTROL)).intValue());
            }
            List<u5.a> a11 = execute.body().a();
            List<u5.a> a12 = execute2.body().a();
            boolean z11 = f17298d;
            if (!z11) {
                if (a11 == null) {
                    throw new AssertionError();
                }
            }
            if (!z11) {
                if (a12 == null) {
                    throw new AssertionError();
                }
            }
            n.w().g(h.b(a11, a12));
            bVar.onSuccess();
        } catch (Exception e11) {
            Log.e(f17296b, "getFeatureConfigs: ", e11);
            bVar.a(new HVError(12, e11.getMessage()));
        }
    }

    /* access modifiers changed from: private */
    public void i(boolean z11) {
        if (z11) {
            if (n.w().m() != null) {
                n.w().m().N();
            }
        } else if (n.w().m() != null) {
            n.w().m().b();
        }
    }

    /* access modifiers changed from: private */
    public void j(boolean z11, String str, int i11) {
        if (z11) {
            if (n.w().m() != null) {
                n.w().m().i0(str, i11);
            }
        } else if (n.w().m() != null) {
            n.w().m().m0(str, i11);
        }
    }

    public void e(String str, b bVar) {
        if (o.s()) {
            String A = n.w().A();
            this.f17299a.submit(new c(this, A + "sdk.json", A + String.format("%s.json", new Object[]{str}), bVar));
            return;
        }
        n.w().g(o.n());
        bVar.onSuccess();
    }

    public void f(String str, boolean z11, b bVar) {
        a.c().b("https://s3-ap-south-1.amazonaws.com/hv-central-config/sdk-client-config/hypersnapsdk/v1/" + str + ".json").enqueue(new a(z11, bVar));
    }
}
