package ng0;

import android.app.Application;
import com.appsflyer.AppsFlyerProperties;
import in.swiggy.android.tejas.network.retrofit.interceptors.CurlLoggingInterceptor;
import in.swiggy.android.tejas.network.utils.NetworkUtils;
import java.io.File;
import kotlin.jvm.internal.p;
import okhttp3.Cache;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import os.a;
import os.q;

/* compiled from: LynxDnsModule.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f19787a = new c();

    private c() {
    }

    public final OkHttpClient a(Dns dns, Cache cache, a aVar) {
        p.j(dns, "dns");
        p.j(cache, "cache");
        p.j(aVar, "appBuildDetails");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.dns(dns);
        builder.cache(cache);
        builder.interceptors().add(new CurlLoggingInterceptor(aVar));
        builder.interceptors().add(NetworkUtils.loggingInterceptor(false));
        q.f53127a.b(aVar, builder);
        return builder.build();
    }

    public final Dns b(g gVar) {
        p.j(gVar, "dns");
        return gVar;
    }

    public final Cache c(Application application) {
        p.j(application, "application");
        return new Cache(new File(application.getCacheDir(), AppsFlyerProperties.HTTP_CACHE), 52428800);
    }
}
